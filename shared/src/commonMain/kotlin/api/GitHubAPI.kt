package com.alejandrorios.api

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.Url

class GitHubAPI {
    private val membersUrl = Url("https://api.github.com/orgs/raywenderlich/members")
    private val client = HttpClient()

    suspend fun getMembers(): String {
        val result: String= client.get {
            url(this@GitHubAPI.membersUrl.toString())
        }

        return result
    }
}