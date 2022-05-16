package com.xpeho.github.githubclient.domain.mappers

import com.xpeho.github.githubclient.data.entities.User
import com.xpeho.github.githubclient.domain.models.UserModel
import org.springframework.stereotype.Service

@Service
class UserMapper {

    fun fromEntity(user: User): UserModel {
        return UserModel(
            reposURL = user.reposURL,
            login = user.login,
        )
    }
}