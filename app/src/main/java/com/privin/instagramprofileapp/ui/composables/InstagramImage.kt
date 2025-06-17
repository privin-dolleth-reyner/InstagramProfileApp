package com.privin.instagramprofileapp.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privin.instagramprofileapp.R

@Composable
fun InstagramImage(image: Painter, isHighlights: Boolean, modifier: Modifier = Modifier){
    val conditionalModifier = modifier
        .aspectRatio(1f, matchHeightConstraintsFirst = true)
    
    if(isHighlights){
        conditionalModifier.border(width = 1.dp, color = Color.LightGray, shape = CircleShape)
            .padding(2.dp)
    }

    Image(
        painter = image,
        contentDescription = null,
        modifier = conditionalModifier
            .clip(CircleShape)
    )
}

@Preview
@Composable
fun InstagramImagePreview(){
    InstagramImage(
        image = painterResource(R.mipmap.profile_pic),
        isHighlights = true,
        modifier = Modifier.size(100.dp)
    )
}