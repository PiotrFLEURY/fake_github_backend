package com.xpeho.github.githubclient.data.entities

import com.fasterxml.jackson.annotation.JsonKey
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue

/*
{
  "login": "PiotrFLEURY",
  "id": 25879276,
  "node_id": "MDQ6VXNlcjI1ODc5Mjc2",
  "avatar_url": "https://avatars.githubusercontent.com/u/25879276?v=4",
  "gravatar_id": "",
  "url": "https://api.github.com/users/PiotrFLEURY",
  "html_url": "https://github.com/PiotrFLEURY",
  "followers_url": "https://api.github.com/users/PiotrFLEURY/followers",
  "following_url": "https://api.github.com/users/PiotrFLEURY/following{/other_user}",
  "gists_url": "https://api.github.com/users/PiotrFLEURY/gists{/gist_id}",
  "starred_url": "https://api.github.com/users/PiotrFLEURY/starred{/owner}{/repo}",
  "subscriptions_url": "https://api.github.com/users/PiotrFLEURY/subscriptions",
  "organizations_url": "https://api.github.com/users/PiotrFLEURY/orgs",
  "repos_url": "https://api.github.com/users/PiotrFLEURY/repos",
  "events_url": "https://api.github.com/users/PiotrFLEURY/events{/privacy}",
  "received_events_url": "https://api.github.com/users/PiotrFLEURY/received_events",
  "type": "User",
  "site_admin": false,
  "name": "Piotr FLEURY",
  "company": null,
  "blog": "",
  "location": null,
  "email": "piotr.fleury@gmail.com",
  "hireable": null,
  "bio": null,
  "twitter_username": null,
  "public_repos": 28,
  "public_gists": 0,
  "followers": 5,
  "following": 2,
  "created_at": "2017-02-19T11:11:42Z",
  "updated_at": "2022-05-15T18:55:30Z"
}
 */
data class User(
    val login: String,
    val id: Int,
    val node_id: String,
    val avatar_url: String,
    val gravatar_id: String,
    val url: String,
    val html_url: String,
    val followers_url: String,
    val following_url: String,
    val gists_url: String,
    val starred_url: String,
    val subscriptions_url: String,
    val organizations_url: String,
    @JsonProperty("repos_url")
    val reposURL: String,
    val events_url: String,
    val received_events_url: String,
    val type: String,
    val site_admin: Boolean,
    val name: String?,
    val company: String?,
    val blog: String?,
    val location: String?,
    val email: String?,
    val hireable: Boolean?,
    val bio: String?,
    val twitter_username: String?,
    val public_repos: Int,
    val public_gists: Int,
    val followers: Int,
    val following: Int,
    val created_at: String,
    val updated_at: String
)