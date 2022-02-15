package crazyson.com.ua.profile.data.network

import crazyson.com.ua.profile.data.User
import retrofit2.http.GET
import retrofit2.http.Headers

interface Api {
    @GET("users")
    @Headers("Authorization : ")
    fun getUser(): List<User>
}