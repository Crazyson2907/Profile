package crazyson.com.ua.profile.data.network

import retrofit2.http.GET
import retrofit2.http.Headers

interface Api {
    @GET("users")
    @Headers("Authorization : ")
    fun getUser()
}