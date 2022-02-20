package crazyson.com.ua.profile.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import crazyson.com.ua.profile.data.User
import crazyson.com.ua.profile.data.network.GitHubApi
import kotlinx.coroutines.launch

enum class GitHubApiStatus { LOADING, ERROR, DONE }

class ListFragmentViewModel : ViewModel() {

    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>>
        get() = _users

    private val _status = MutableLiveData<GitHubApiStatus>()
    val status: LiveData<GitHubApiStatus>
        get() = _status

    private val _navigateToSelectedUser = MutableLiveData<User>()
    val navigateToSelectedUser: LiveData<User>
        get() = _navigateToSelectedUser

    init {
        getUsersFromGithub()
    }

    private fun getUsersFromGithub() {

        viewModelScope.launch {
            _status.value = GitHubApiStatus.LOADING
            try {
                _users.value = GitHubApi.retrofitService.getUser()
                _status.value = GitHubApiStatus.DONE
            } catch (e: Exception) {
                _status.value = GitHubApiStatus.ERROR
                _users.value = ArrayList()
            }
        }
    }

    fun displayUsersDetails(user: User) {
        _navigateToSelectedUser.value = user
    }

    fun displayUsersDetailsComplete() {
        _navigateToSelectedUser.value = null
    }
}