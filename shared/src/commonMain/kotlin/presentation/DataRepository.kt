package com.alejandrorios.presentation

import com.alejandrorios.model.Member

interface DataRepository {
    val members: List<Member>?
    var onRefreshListeners: List<() -> Unit>

    suspend fun update()
}
