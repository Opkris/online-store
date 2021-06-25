package com.onlinestore.store.service;

import com.onlinestore.store.entity.UserEntity;

public interface UserService {

    UserEntity findOrCreateUser (String name,
                                 String surname,
                                 String phone,
                                 String email,
                                 String address);
}
