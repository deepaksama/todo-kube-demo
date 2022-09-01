package com.example.todokubedemo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todokubedemo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	List<Todo> findByUser(String user);
}