package com.xpeho.github.githubclient.domain

import com.xpeho.github.githubclient.data.sources.GithubAPI
import com.xpeho.github.githubclient.domain.mappers.UserMapper
import com.xpeho.github.githubclient.domain.models.UserModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserRepository {

    @Autowired
    lateinit var githubAPI: GithubAPI

    @Autowired
    lateinit var mapper: UserMapper

    fun getUser(token: String): UserModel {
        githubAPI.getUser(token)?.let {
            return mapper.fromEntity(it)
        }
        throw Exception("User not found")
    }


}