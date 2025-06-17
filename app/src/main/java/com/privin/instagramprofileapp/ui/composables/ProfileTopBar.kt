package com.privin.instagramprofileapp.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.privin.instagramprofileapp.R

@Composable
fun ProfileTopBar(
    title: String,
    isVerified: Boolean,
    modifier: Modifier = Modifier
){
    Row(modifier = modifier, horizontalArrangement = Arrangement.SpaceAround) {
        Row(modifier = Modifier.weight(1f).padding(horizontal = 16.dp)) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back",
                modifier = Modifier.size(32.dp)
                    .align(Alignment.CenterVertically)
                    .padding(horizontal = 4.dp)
            )
            Text(
                text = title,
                fontSize = 24.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(8.dp)
                    .weight(0.8f, fill = false)
            )
            if (isVerified){
                Image(
                    painter = painterResource(R.drawable.ic_verification_badge),
                    contentDescription = null,
                    modifier = Modifier.size(16.dp).align(Alignment.CenterVertically),
                    colorFilter = ColorFilter.tint(color = Color(0xFF0994FF))
                )
            }
        }

        Image(
            painter = painterResource(R.drawable.ic_notification),
            contentDescription = "Notification",
            modifier = Modifier.size(32.dp)
                .align(Alignment.CenterVertically)
                .padding(horizontal = 4.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Image(
            painter = painterResource(R.drawable.ic_more),
            contentDescription = "More",
            modifier = Modifier.size(32.dp)
                .align(Alignment.CenterVertically)
                .padding(horizontal = 4.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))
    }
}

@Preview
@Composable
fun ProfileTopBarPreview(){
    ProfileTopBar(
        title = "cristiano" ,
        isVerified = true,
        modifier = Modifier.fillMaxWidth()
    )
}