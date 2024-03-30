package com.dioses.mvianimalscompose.api

import com.dioses.mvianimalscompose.model.Animal
import retrofit2.http.GET

/****
 * Project: MVIAnimalsCompose
 * From: com.dioses.mvianimalscompose.api
 * Created by Arthur Dioses Reto on 25/03/24 at 9:48 PM
 * All rights reserved 2024.
 ****/

interface AnimalApi {
    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>
}