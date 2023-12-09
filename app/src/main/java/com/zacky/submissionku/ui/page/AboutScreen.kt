package com.zacky.submissionku.ui.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.zacky.submissionku.R

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        AsyncImage(
            model = R.drawable.profilku,
            contentDescription = "foto profil",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(200.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = "Muhammad Zacky Assidiqy",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "zaassetengah@gmail.com",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
        )
    }
}