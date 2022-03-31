package com.jay.universally.data.interfaces

import com.jay.universally.data.data_classes.PeopleInSpace
import retrofit2.Response
import retrofit2.http.GET

interface PersonInterface {
    @GET("/astros.json")
    suspend fun getPeople():Response<PeopleInSpace>


}