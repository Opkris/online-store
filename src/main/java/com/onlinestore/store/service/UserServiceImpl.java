package com.onlinestore.store.service;

import com.onlinestore.store.entity.UserEntity;
import com.onlinestore.store.repository.UserEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.onlinestore.store.entity.UserRole.CUSTOMER;
import static java.util.Objects.nonNull;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserEntityRepository userEntityRepository;


    @Override
    public UserEntity findOrCreateUser(String name,
                                       String surname,
                                       String phone,
                                       String email,
                                       String address) {

        UserEntity userEntity = userEntityRepository.findByEmail(email);

        if (nonNull(userEntity)) {
            return userEntity;
        }
        // if we dont find an existing user, we create a new user, by default = Customer.
        userEntity = new UserEntity();
        userEntity.setRole(CUSTOMER.name());

        userEntity.setName(name);
        userEntity.setSurname(surname);
        userEntity.setPhone(phone);
        userEntity.setEmail(email);
        userEntity.setAddress(address);

        return userEntityRepository.save(userEntity);

    }
}
