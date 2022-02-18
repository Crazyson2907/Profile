package crazyson.com.ua.profile.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.squareup.moshi.Json

@Parcelize
data class User(
    @Json(name = "login")
    val login: String,
    @Json(name = "id")
    val id: Int,
    val nodeId: String = "",
    @Json(name = "avatar_url")
    val avatarUrl: String,
    @Transient
    val gravatarId: String,
    @Json(name = "url")
    val url: String,
    val htmlUrl: String,
    @Json(name = "followers_url")
    val followersUrl: String,
    @Json(name = "following_url")
    val followingUrl: String,
    @Json(name = "gists_url")
    val gistsUrl: String,
    @Json(name = "starred_url")
    val starredUrl: String,
    @Json(name = "subscriptions_url")
    val subscriptionsUrl: String,
    val organizationsUrl: String,
    @Json(name = "repos_url")
    val reposUrl: String,
    val eventsUrl: String,
    val receivedEventsUrl: String,
    val type: String,
    val siteAdmin: Boolean = false
) : Parcelable