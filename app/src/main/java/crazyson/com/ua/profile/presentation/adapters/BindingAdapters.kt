package crazyson.com.ua.profile.presentation.adapters

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import crazyson.com.ua.profile.R
import crazyson.com.ua.profile.presentation.list.GitHubApiStatus

annotation class BindingAdapter

@BindingAdapter
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        Glide.with(imgView.context)
            .load(imgUri)
            .apply(
                RequestOptions())
            .into(imgView)
    }
}

@BindingAdapter
fun bindStatus(statusImageView: ImageView, status: GitHubApiStatus) {
    when (status) {
        GitHubApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        GitHubApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        GitHubApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}