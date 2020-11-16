package com.jasypt.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jasypt.demo.domain.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, UUID> {

}
