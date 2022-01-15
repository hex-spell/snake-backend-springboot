package com.modulariz.snakebackendspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
class SnakeBackendSpringbootApplication

fun main(args: Array<String>) {
	runApplication<SnakeBackendSpringbootApplication>(*args)
}
