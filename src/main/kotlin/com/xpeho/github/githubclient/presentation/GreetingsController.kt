package com.xpeho.github.githubclient.presentation

import com.xpeho.github.githubclient.data.Greeting
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greetings")
class GreetingsController {

    @GetMapping
    fun greetings() = Greeting(id = 42, message = "Hello, Kotlin!")

    @RequestMapping("/{name}", method = [RequestMethod.GET], produces = [ MediaType.APPLICATION_JSON_VALUE ])
    fun greetSomeone(@PathVariable("name") name: String) = Greeting(id = 24, message = "Hello, $name!")
}