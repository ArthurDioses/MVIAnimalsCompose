package com.dioses.mvianimalscompose.ui.theme

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dioses.mvianimalscompose.api.AnimalRepo
import com.dioses.mvianimalscompose.view.MainIntent
import com.dioses.mvianimalscompose.view.MainState
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch
import java.lang.Exception

/****
 * Project: MVIAnimalsCompose
 * From: com.dioses.mvianimalscompose.ui.theme
 * Created by Arthur Dioses Reto on 25/03/24 at 10:00 PM
 * All rights reserved 2024.
 ****/
class MainViewModel(private val repo: AnimalRepo) : ViewModel() {
    val userIntent = Channel<MainIntent> { Channel.UNLIMITED }
    var state = mutableStateOf<MainState>(MainState.Idle)
        private set

    init {
        handleIntent()
    }

    private fun handleIntent() {
        viewModelScope.launch {
            userIntent.consumeAsFlow().collect { collector ->
                when (collector) {
                    is MainIntent.FetchAnimals -> fetchAnimals()
                }
            }
        }
    }

    private fun fetchAnimals() {
        viewModelScope.launch {
            state.value = MainState.Loading
            state.value = try {
                MainState.Animals(repo.getAnimals())
            } catch (e: Exception) {
                MainState.Error(e.localizedMessage)
            }
        }
    }
}