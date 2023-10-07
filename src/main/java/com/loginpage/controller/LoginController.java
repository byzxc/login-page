package com.loginpage.controller;

import com.loginpage.model.User;
import com.loginpage.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final UserService userService;

    public LoginController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        // Render login.html in templates folder
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        final User user = userService.getUser(username, password);

        if (userService.userExists(user)) {
            if (userService.userHasAdminAccess(user)) {
                model.addAttribute("username", username); // Add username to the model
                return "welcome";
            } else {
                model.addAttribute("unauthorized", "User does not have administrator rights");
                return "login";
            }
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }

    @PostMapping("/logout")
    public String logout(final HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}

