package com.zacky.submissionku.ui.page

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.zacky.submissionku.di.Injection
import com.zacky.submissionku.navigation.Screen
import com.zacky.submissionku.ui.component.NakamaItem
import com.zacky.submissionku.ui.viewmodel.ListViewModel
import com.zacky.submissionku.ui.viewmodel.ViewModelFactory

@Composable
fun ListScreen(
    viewModel: ListViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (String) -> Unit
) {
    val nakamas by viewModel.nakamas.observeAsState(emptyList())

    LaunchedEffect(Unit) {
        viewModel.loadNakama()
    }

    LazyColumn {
        items(nakamas) { nakama ->
            NakamaItem(nakama = nakama, onClick = {
                navigateToDetail(Screen.Detail.createRoute(nakama.id))
            })
        }
    }
}

