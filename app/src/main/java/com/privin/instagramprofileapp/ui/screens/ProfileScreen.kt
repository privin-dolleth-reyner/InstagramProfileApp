package com.privin.instagramprofileapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.privin.instagramprofileapp.ui.composables.ProfileTopBar

@Composable
fun ProfileScreen(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()) {
        ProfileTopBar(
            "cristiano",
            isVerified = true,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun ProfileScreenPreview(){
    ProfileScreen()
}

