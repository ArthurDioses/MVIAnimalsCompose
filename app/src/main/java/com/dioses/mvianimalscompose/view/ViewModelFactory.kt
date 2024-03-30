package com.dioses.mvianimalscompose.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dioses.mvianimalscompose.api.AnimalApi
import com.dioses.mvianimalscompose.api.AnimalRepo

/****
 * Project: MVIAnimalsCompose
 * From: com.dioses.mvianimalscompose.view
 * Created by Arthur Dioses Reto on 25/03/24 at 10:07 PM
 * All rights reserved 2024.
 ****/
class ViewModelFactory(private val api: AnimalApi) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(AnimalRepo(api)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }
}