package com.alejandrorios.githubkmp

import android.app.Application
import com.alejandrorios.api.GitHubAPI
import com.alejandrorios.model.MembersDataRepository
import com.alejandrorios.presentation.DataRepository

class GitHubKMPApplication : Application() {
    val dataRepository: DataRepository by lazy {
        MembersDataRepository(GitHubAPI())
    }
}
