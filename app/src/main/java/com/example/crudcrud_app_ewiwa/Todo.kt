package com.example.crudcrud_app_ewiwa

data class Todo(
    val _id: String? = null, // ID generato dal server
    val title: String,
    val completed: Boolean
)