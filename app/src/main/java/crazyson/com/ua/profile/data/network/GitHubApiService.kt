package crazyson.com.ua.profile.data.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import crazyson.com.ua.profile.data.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers

private const val BASE_URL = "https://api.github.com"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface GitHubApiService {
    @GET("users")
    @Headers("Authorization : token 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")
    fun getUser(): List<User>
}

object GitHubApi {
    val retrofitService : GitHubApiService by lazy { retrofit.create(GitHubApiService::class.java) }
}