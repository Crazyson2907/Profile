package crazyson.com.ua.profile.presentation.details

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import crazyson.com.ua.profile.data.User

class DetailsViewModel(user: User, application: Application) : AndroidViewModel(application) {

    private val _selectedUser = MutableLiveData<User>()
    val selectedUser: LiveData<User>
        get() = _selectedUser

    init {
        _selectedUser.value = user
    }

    val displayUserName = Transformations.map(selectedUser) { it.login }
    val displayUserImage = Transformations.map(selectedUser) { it.avatarUrl }
    val displayUserLink = Transformations.map(selectedUser) { it.htmlUrl }
    val displayUserRepos = Transformations.map(selectedUser) { it.reposUrl }
    val displayUserGists = Transformations.map(selectedUser) { it.gistsUrl }
    val displayUserFollowers = Transformations.map(selectedUser) { it.followersUrl }

}