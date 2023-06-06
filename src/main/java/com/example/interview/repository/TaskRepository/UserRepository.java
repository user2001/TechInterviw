package com.example.interview.repository.TaskRepository;

import com.example.interview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
