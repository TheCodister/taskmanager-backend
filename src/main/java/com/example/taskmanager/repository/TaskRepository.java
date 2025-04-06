package com.example.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanager.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Additional query methods can be defined here if needed
    
}
