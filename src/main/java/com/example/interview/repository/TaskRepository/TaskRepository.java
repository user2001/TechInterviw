package com.example.interview.repository.TaskRepository;

import com.example.interview.model.Task;
import com.example.interview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    List<Task> findByOwner(User user);
}
