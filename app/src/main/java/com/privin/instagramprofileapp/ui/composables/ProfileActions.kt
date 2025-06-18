package com.privin.instagramprofileapp.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privin.instagramprofileapp.ui.theme.blue

@Composable
fun ProfileActions(
    modifier: Modifier = Modifier,
    onClickFollow: () -> Unit = {},
    onClickMessage: () -> Unit = {}
) {
    Row(modifier = modifier) {
        ActionButton(
            text = "Follow",
            onClick = onClickFollow,
            contentColor = Color.White,
            containerColor = blue,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
                .weight(1f)
        )
        ActionButton(
            text = "Message",
            onClick = onClickMessage,
            contentColor = Color.Black,
            containerColor = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
                .weight(1f)
        )
    }
}


@Preview
@Composable
fun ProfileActionsPreview() {
    ProfileActions(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
    )
}