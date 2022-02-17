package crazyson.com.ua.profile.presentation.details

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class DetailsFragment : Fragment() {

    private val viewModel: DetailsFragmentViewModel by lazy {
        ViewModelProvider(this).get(DetailsFragmentViewModel::class.java)
    }
}