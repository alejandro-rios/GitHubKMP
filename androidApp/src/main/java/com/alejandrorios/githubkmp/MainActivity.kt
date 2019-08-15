package com.alejandrorios.githubkmp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alejandrorios.Greeting
import com.alejandrorios.api.UpdateProblem
import com.alejandrorios.model.Member
import com.alejandrorios.presentation.MembersPresenter
import com.alejandrorios.presentation.MembersView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MembersView {

    private val repository by lazy { (application as GitHubKMPApplication).dataRepository }
    private val presenter by lazy { MembersPresenter(this, repository = repository) }

    private lateinit var adapter: MemberAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtGreeting.text = Greeting().greeting()

        setupMembersList()

        presenter.onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }

    override var isUpdating = false

    override fun onUpdate(members: List<Member>) {
        adapter.members = members
        runOnUiThread {
            adapter.notifyDataSetChanged()
        }
    }

    override fun showError(error: Throwable) {
        val errorMessage = when (error) {
            is UpdateProblem -> getString(R.string.update_problem)
            else -> getString(R.string.unknown_error)
        }

        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
    }

    private fun setupMembersList() {
        rcvMembers.layoutManager = LinearLayoutManager(this)
        adapter = MemberAdapter(listOf())
        rcvMembers.adapter = adapter
    }
}
