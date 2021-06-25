package com.onlinestore.store;

import com.onlinestore.store.entity.UserEntity;
import com.onlinestore.store.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class StoreApplication {

    @Autowired
    private UserEntityRepository userEntityRepository;

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

    // TODO Create a proper test for this in test folder.
//    @EventListener(ApplicationReadyEvent.class)
//    public void testRepository(){
//        UserEntity u = new UserEntity();
//        u.setAddress("Address");
//        u.setName("Foo");
//        u.setSurname("Bar");
//        u.setPhone("12345678");
//        u.setEmail("email@mail.com");
//        userEntityRepository.save(u);
//    }

}
