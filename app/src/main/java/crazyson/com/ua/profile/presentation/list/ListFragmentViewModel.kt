package crazyson.com.ua.profile.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import crazyson.com.ua.profile.data.User

enum class GitHubApiStatus { LOADING, ERROR, DONE }

class ListFragmentViewModel : ViewModel() {

    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>>
        get() = _users

    private fun getUsersFromGithub() {

    }
}