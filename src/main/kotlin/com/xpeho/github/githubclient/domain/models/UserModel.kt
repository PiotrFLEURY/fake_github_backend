package com.xpeho.github.githubclient.domain.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UserModel(
    val login: String,
    @JsonProperty("reposURL")
    val reposURL: String
)