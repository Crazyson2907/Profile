package crazyson.com.ua.profile.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import crazyson.com.ua.profile.databinding.FragmentListBinding
import crazyson.com.ua.profile.presentation.adapters.UserListAdapter

class ListFragment : Fragment() {

    private val viewModel: ListFragmentViewModel by lazy {
        ViewModelProvider(this)[ListFragmentViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentListBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.apply {
            binding.viewModel = viewModel
            binding.rvUsers.adapter = UserListAdapter(UserListAdapter.OnClickListener {
//            viewModel.displayUsersDetails(it)
            })
        }

        viewModel.navigateToSelectedUser.observe(viewLifecycleOwner, Observer {
            if (null != it) {
                this.findNavController().navigate(
                    ListFragmentDirections.actionShowDetails()
                )
//                viewModel.displayUsersDetailsComplete()
            }
        })

        return binding.root
    }
}