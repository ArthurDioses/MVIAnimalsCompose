package com.dioses.mvianimalscompose.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/****
 * Project: MVIAnimalsCompose
 * From: com.dioses.mvianimalscompose.api
 * Created by Arthur Dioses Reto on 25/03/24 at 9:50 PM
 * All rights reserved 2024.
 ****/
object AnimalService {
    const val BASE_URL = "https://raw.githubusercontent.com/CatalinStefan/animalApi/master/"
    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: AnimalApi = getRetrofit().create(AnimalApi::class.java)
}