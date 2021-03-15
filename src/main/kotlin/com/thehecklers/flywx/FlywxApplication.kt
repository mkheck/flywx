package com.thehecklers.flywx

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlywxApplication

fun main(args: Array<String>) {
	runApplication<FlywxApplication>(*args)
}
