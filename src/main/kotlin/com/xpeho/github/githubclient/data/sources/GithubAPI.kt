package com.xpeho.github.githubclient.data.sources

import com.xpeho.github.githubclient.data.entities.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class GithubAPI {

    companion object {
        const val GITHUB_API_URL = "https://api.github.com"
        const val USER_PATH = "/user"
    }

    @Autowired
    lateinit var restTemplate: RestTemplate

    val userUri = "$GITHUB_API_URL$USER_PATH"

    /*
    curl \
        -H "Authorization: token [YOUR TOKEN HERE]" \
        -H "Accept: application/vnd.github.v3+json" \
        https://api.github.com/user
     */
    fun getUser(token: String): User? {
        return try {

            // restTemplate.getForObject(userUri, User::class.java)

            val headers = HttpHeaders();
            headers.set("Authorization", "token $token");
            val entity = HttpEntity<String>( headers )
            val response = restTemplate.exchange(userUri, HttpMethod.GET, entity, User::class.java)
            response.body
        } catch (e: Exception) {
            // TODO LOG
            // TODO throw managed exception
            throw e // FIXME
        }
    }
}