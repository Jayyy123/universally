package com.jay.universally.data.Instance

import com.jay.universally.data.data_classes.PeopleInSpace
import com.jay.universally.utils.constants.Constants.Companion.NOTIFY_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PersonBuilder {

    val api: PeopleInSpace by lazy{

        Retrofit.Builder()
            .baseUrl(NOTIFY_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PeopleInSpace::class.java)
    }


}