package com.privin.instagramprofileapp.ui.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privin.instagramprofileapp.ui.theme.blue

@Composable
fun ActionButton(
    text: String,
    contentColor: Color,
    containerColor: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    Button(
        onClick = onClick,
        colors = ButtonColors(
            contentColor = contentColor,
            containerColor = containerColor,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.Gray
        ),
        shape = ShapeDefaults.Small,
        modifier = modifier
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview
@Composable
private fun ActionButtonPreview() {
    ActionButton(
        text = "Follow",
        contentColor = Color.White,
        containerColor = blue,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
    )
}