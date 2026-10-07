package com.javastudy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javastudy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
