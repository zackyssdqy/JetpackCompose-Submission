package com.zacky.submissionku.ui.page

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.zacky.submissionku.di.Injection
import com.zacky.submissionku.ui.common.UiState
import com.zacky.submissionku.ui.viewmodel.DetailViewModel
import com.zacky.submissionku.ui.viewmodel.ViewModelFactory

@Composable
fun DetailScreen(
    NakamaId: String,
    viewModel: DetailViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateBack: () -> Unit,
) {

    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { state ->
        when (state) {
            is UiState.Loading -> {
                viewModel.getNakamaById(NakamaId)
            }

            is UiState.Success -> {
                val data = state.data
                DetailContent(
                    data.name,
                    data.description,
                    data.imgUrl,
                    onBackClick = navigateBack,
                )
            }

            is UiState.Error -> {

            }
        }
    }
}

@Composable
fun DetailContent(
    name: String,
    description: String,
    imgUrl: String,
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(modifier = modifier) {
            AsyncImage(
                model = imgUrl,
                contentDescription = name,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth()
            )
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Button Back",
                modifier = Modifier
                    .padding(16.dp)
                    .clickable { onBackClick() })
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = name,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                modifier = modifier
            )
        }

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Description",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 16.dp),

            )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = description, fontSize = 14.sp, modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

    }

}

