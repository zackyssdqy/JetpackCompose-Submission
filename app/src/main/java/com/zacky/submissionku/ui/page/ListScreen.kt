package com.zacky.submissionku.ui.page

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zacky.submissionku.ui.component.NakamaItem
import com.zacky.submissionku.ui.viewmodel.ListViewModel

@Composable
fun ListScreen() {
    val viewModel: ListViewModel = hiltViewModel()
    val nakamas by viewModel.nakamas.observeAsState(emptyList())
    val isLoading by viewModel.isLoading.observeAsState(false)
    val isEmpty by viewModel.isEmpty.observeAsState(false)
    val favoriteNakamas by viewModel.favoriteTroops.observeAsState(emptyList())

    // Trigger the loading of Nakamas when the screen is first displayed
    LaunchedEffect(Unit) {
        viewModel.loadTroops()
    }

    // Use LazyColumn to efficiently display a list of items
    LazyColumn {
        items(nakamas) { nakama ->
            NakamaItem(nakama = nakama) {
                // Handle item click if needed
            }
        }
    }
}

