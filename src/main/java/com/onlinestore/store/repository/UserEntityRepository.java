package com.onlinestore.store.repository;

import com.onlinestore.store.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// if i want to creat custom, just creat here.
                                                    // <class and primary key type> (located in BaseEntity)
public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {

UserEntity findByEmail(String email);
}
