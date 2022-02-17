package crazyson.com.ua.profile.data.network

import crazyson.com.ua.profile.data.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://api.github.com"

val retrofit: Retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface GitHubApiService {
    @GET("search/users")
    fun getUser(): List<User>
}

object GitHubApi {
    val retrofitService : GitHubApiService by lazy { retrofit.create(GitHubApiService::class.java) }
}