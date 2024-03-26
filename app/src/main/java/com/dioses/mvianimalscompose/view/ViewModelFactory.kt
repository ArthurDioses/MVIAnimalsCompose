package com.dioses.mvianimalscompose.view

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.dioses.mvianimalscompose.api.AnimalApi
import com.dioses.mvianimalscompose.api.AnimalRepo
import com.dioses.mvianimalscompose.ui.theme.MainViewModel

/****
 * Project: MVIAnimalsCompose
 * From: com.dioses.mvianimalscompose.view
 * Created by Arthur Dioses Reto on 25/03/24 at 10:07 PM
 * All rights reserved 2024.
 ****/
class ViewModelFactory(private val api: AnimalApi) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T & Any {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(AnimalRepo(api)) as (T & Any)
        }
        throw IllegalArgumentException("Unknown class name")
    }

}