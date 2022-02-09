package com.kotlin.todolist.controller

import com.kotlin.todolist.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todos")
class TodoController (
        private val todoService : TodoService
        ){

    @GetMapping
    fun getTodos() = todoService.getTodos()

    @PostMapping
    fun insertTodo(@RequestBody todoRequest: TodoRequest) = todoService.insertTodo(todoRequest.todoName)

}