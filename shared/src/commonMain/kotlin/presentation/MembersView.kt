package com.alejandrorios.presentation

interface MembersView : BaseView {
    var isUpdating: Boolean
    fun onUpdate(members: String)
}
