package com.alejandrorios.presentation

import com.alejandrorios.model.Member

interface MembersView : BaseView {
    var isUpdating: Boolean
    fun onUpdate(members: List<Member>)
}
