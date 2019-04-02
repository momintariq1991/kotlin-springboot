package com.example.kotlinspringboot.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/service")
class StatusController {

    @GetMapping("/status")
    fun status(): String {
        return "service is healthy"
    }
}