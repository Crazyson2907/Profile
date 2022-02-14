package crazyson.com.ua.profile.presentation.list

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class ListFragment : Fragment() {

    private val viewModel: ListFragmentViewModel by lazy {
        ViewModelProvider(this).get(ListFragmentViewModel::class.java)
    }
}