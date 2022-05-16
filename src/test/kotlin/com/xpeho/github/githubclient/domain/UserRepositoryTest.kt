package com.xpeho.github.githubclient.domain

import com.xpeho.github.githubclient.data.entities.User
import com.xpeho.github.githubclient.data.sources.GithubAPI
import com.xpeho.github.githubclient.domain.mappers.UserMapper
import com.xpeho.github.githubclient.domain.models.UserModel
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

class UserRepositoryTest {

    @Test
    fun getUser() {
        // GIVEN
        val userRepository= UserRepository()
        userRepository.githubAPI = mockk()
        userRepository.mapper = UserMapper()

        val fakeUser = mockk<User>()
        every { fakeUser.login } returns "fakeUser"
        every { fakeUser.reposURL } returns "localhost"

        every { userRepository.githubAPI.getUser("xpeho") } returns fakeUser

        // WHEN
        val user = userRepository.getUser("xpeho")

        // THEN
        assertNotNull(user)
        assert(user.login == "fakeUser")
        assert(user.reposURL == "localhost")
    }
}