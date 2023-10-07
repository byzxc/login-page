//package com.loginpage.service;
//
//import com.loginpage.model.User;
//import com.loginpage.repository.Role;
//import com.loginpage.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@ExtendWith(MockitoExtension.class)
//class UserServiceTest {
//    @Mock
//    private UserRepository userRepository;
//    @InjectMocks
//    private UserService userService;
//
//    @Test
//    public void checkUserHasAccess() {
//        final User manager = new User("tom", "111", Role.Manager);
//        assertThat(true).isEqualTo(userService.userHasAdminAccess(manager));
//    }
//}
