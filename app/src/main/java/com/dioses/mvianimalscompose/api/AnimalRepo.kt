package com.dioses.mvianimalscompose.api

/****
 * Project: MVIAnimalsCompose
 * From: com.dioses.mvianimalscompose.api
 * Created by Arthur Dioses Reto on 25/03/24 at 9:53 PM
 * All rights reserved 2024.
 ****/
class AnimalRepo(private val api: AnimalApi) {
    suspend fun getAnimals() = api.getAnimals()
}