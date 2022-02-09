package com.kotlin.todolist.service

import com.kotlin.todolist.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoService(
        private val todoRepository: TodoRepository
) {
    fun getTodos() = todoRepository.findAll()
}