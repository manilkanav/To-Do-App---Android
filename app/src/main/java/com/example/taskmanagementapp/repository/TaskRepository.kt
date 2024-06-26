package com.example.taskmanagementapp.repository

import com.example.taskmanagementapp.database.TaskDatabase
import com.example.taskmanagementapp.model.Task

class TaskRepository(private val db: TaskDatabase) {

        suspend fun insertTask(task: Task) = db.getTaskDao().insertTask(task)

        suspend fun updateTask(task: Task) = db.getTaskDao().updateTask(task)

        suspend fun deleteTask(task: Task) = db.getTaskDao().deleteTask(task)

        fun getAllTasks() = db.getTaskDao().getAllTasks()

        fun searchTasks(query: String?) = db.getTaskDao().searchTasks(query)
}