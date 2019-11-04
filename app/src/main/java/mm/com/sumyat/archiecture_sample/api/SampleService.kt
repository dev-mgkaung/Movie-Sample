package mm.com.sumyat.archiecture_sample.api

import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SampleService {

    @GET("now_playing?page=1")
    fun getPlayingMovie(): LiveData<ApiResponse<PlayingMoviewsResponse>>

    @GET("now_playing")
    fun getPlayingMovie(@Query("page") page: Int): Call<PlayingMoviewsResponse>
}