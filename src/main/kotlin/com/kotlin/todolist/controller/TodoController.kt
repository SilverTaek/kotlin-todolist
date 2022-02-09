package com.kotlin.todolist.controller

import com.kotlin.todolist.service.TodoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodoController (
        private val todoService : TodoService
        ){

    @GetMapping
    fun getTodos() = todoService.getTodos()
}