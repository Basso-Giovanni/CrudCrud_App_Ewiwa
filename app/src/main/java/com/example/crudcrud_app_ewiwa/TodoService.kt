package com.example.crudcrud_app_ewiwa

import retrofit2.http.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface TodoApiService {
    @GET("todos")
    suspend fun getTodos(): List<Todo>

    @POST("todos")
    suspend fun addTodo(@Body todo: Todo)

    @PUT("todos/{id}")
    suspend fun updateTodo(@Path("id") id: String, @Body todo: Todo)

    @DELETE("todos/{id}")
    suspend fun deleteTodo(@Path("id") id: String)
}

// Retrofit instance
object RetrofitInstance {
    // Sostituiscilo con il tuo API KEY
    private const val BASE_URL = "https://crudcrud.com/api/1db5bec4e81843008d34034cf77444b0/"

    val api: TodoApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodoApiService::class.java)
    }
}
