package com.appserba.githubuser.api

import com.appserba.githubuser.data.model.DetailUserResponse
import com.appserba.githubuser.data.model.User
import com.appserba.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 9dc65e9195392ffbd152ab58ba26775ba854d7b3")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 9dc65e9195392ffbd152ab58ba26775ba854d7b3")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 9dc65e9195392ffbd152ab58ba26775ba854d7b3")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 9dc65e9195392ffbd152ab58ba26775ba854d7b3")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}