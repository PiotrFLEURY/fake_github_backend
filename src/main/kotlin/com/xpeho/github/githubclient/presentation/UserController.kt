package com.xpeho.github.githubclient.presentation

import com.xpeho.github.githubclient.domain.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    lateinit var userRepository: UserRepository

    @RequestMapping(produces = [ MediaType.APPLICATION_JSON_VALUE ], method = [RequestMethod.GET])
    fun getUser(@RequestHeader("Token") token: String) = userRepository.getUser(token)
}