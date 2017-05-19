package com.iqmsoft.springmvc.react.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.iqmsoft.springmvc.react.web.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select t from User t where t.username = :username")
    User findByUsername(@Param("username") String username);

    @Query("select t from User t where t.id = :id")
    User findById(@Param("id") Long id);
}