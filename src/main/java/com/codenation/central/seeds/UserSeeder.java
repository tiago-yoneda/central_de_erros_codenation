package com.codenation.central.seeds;

import com.codenation.central.entity.User;
import com.codenation.central.service.implementation.EventService;
import com.codenation.central.service.implementation.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserSeeder implements ApplicationRunner {
    @Autowired
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setName("Adriano Forcellini");
        user.setEmail("adrianoforcellinipedretti@gmail.com");
        user.setPassword("123456");
        userService.save(user);

        User user1 = new User();
        user1.setName("Layo Kaminski");
        user1.setEmail("layokaminski@gmail.com");
        user1.setPassword("123456");
        userService.save(user1);

        User user2 = new User();
        user2.setName("Johne Alves");
        user2.setEmail("johnealves@gmail.com");
        user2.setPassword("123456");
        userService.save(user2);

        User user3 = new User();
        user3.setName("Tiago Yoneda");
        user3.setEmail("xyonedax@gmail.com");
        user3.setPassword("123456");
        userService.save(user3);
    }
}
