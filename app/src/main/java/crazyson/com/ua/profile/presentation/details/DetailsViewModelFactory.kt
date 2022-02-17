package crazyson.com.ua.profile.presentation.details

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import crazyson.com.ua.profile.data.User

class DetailsViewModelFactory(
    private val user: User,
    private val application: Application
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailsFragmentViewModel::class.java)) {
            return DetailsFragmentViewModel(user, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}