package com.yobuligo.DemoSecurity02.User;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {
	Optional<User> findOneByLogin(String login);
}
