package com.alejandrorios.api

import com.alejandrorios.model.Member
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.Url
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.list

class GitHubAPI {
    private val membersUrl = Url("https://api.github.com/orgs/raywenderlich/members")
    private val client = HttpClient()

    @UnstableDefault
    suspend fun getMembers(): List<Member> {
        val result: String = client.get {
            url(this@GitHubAPI.membersUrl.toString())
        }

        return Json.nonstrict.parse(Member.serializer().list, result)
    }
}