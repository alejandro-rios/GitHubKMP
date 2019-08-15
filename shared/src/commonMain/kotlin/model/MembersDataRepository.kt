package com.alejandrorios.model

import com.alejandrorios.api.GitHubAPI
import com.alejandrorios.api.UpdateProblem
import com.alejandrorios.presentation.DataRepository

class MembersDataRepository(private val api: GitHubAPI) : DataRepository {
    override var members: List<Member>? = null

    override var onRefreshListeners: List<() -> Unit> = emptyList()

    override suspend fun update() {
        val newMembers = try {
            api.getMembers()
        } catch (cause: Throwable) {
            throw UpdateProblem()
        }

        if(newMembers != members){
            members = newMembers
            callRefreshListeners()
        }
    }

    private fun callRefreshListeners() {
        onRefreshListeners.forEach {
            it()
        }
    }
}
