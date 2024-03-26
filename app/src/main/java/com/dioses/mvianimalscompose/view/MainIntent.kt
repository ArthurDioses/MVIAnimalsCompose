package com.dioses.mvianimalscompose.view

/****
 * Project: MVIAnimalsCompose
 * From: com.dioses.mvianimalscompose.view
 * Created by Arthur Dioses Reto on 25/03/24 at 9:56 PM
 * All rights reserved 2024.
 ****/
sealed class MainIntent {
    object FetchAnimals : MainIntent()
}