package com.dioses.mvianimalscompose.view

import com.dioses.mvianimalscompose.model.Animal

/****
 * Project: MVIAnimalsCompose
 * From: com.dioses.mvianimalscompose.view
 * Created by Arthur Dioses Reto on 25/03/24 at 9:57 PM
 * All rights reserved 2024.
 ****/
sealed class MainState {
    object Idle : MainState()
    object Loading : MainState()
    data class Animals(val animals: List<Animal>) : MainState()
    data class Error(val error: String?) : MainState()

}