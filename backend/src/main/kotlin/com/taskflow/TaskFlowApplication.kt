package com.taskflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class TaskFlowApplication

fun main(args: Array<String>) {
    runApplication<TaskFlowApplication>(*args)
}
