package crazyson.com.ua.profile.presentation.details

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import crazyson.com.ua.profile.data.User

class DetailsFragmentViewModel(user: User, application: Application) : AndroidViewModel(application) {

    private val _selectedUser = MutableLiveData<User>()
    val selectedUser: LiveData<User>
        get() = _selectedUser

    init {
        _selectedUser.value = user
    }
}