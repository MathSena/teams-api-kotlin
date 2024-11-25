package com.mathsena.myfirstapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFirstAppApplication

fun main(args: Array<String>) {
    runApplication<MyFirstAppApplication>(*args)
}
