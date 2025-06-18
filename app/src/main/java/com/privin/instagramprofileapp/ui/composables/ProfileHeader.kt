package com.privin.instagramprofileapp.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privin.instagramprofileapp.R

@Composable
fun ProfileHeader(profilePic: Painter, posts: String, followers: String, following: String, modifier: Modifier = Modifier){
    Row(modifier = modifier, horizontalArrangement = Arrangement.SpaceBetween) {
        InstagramImage(
            image = profilePic,
            isHighlights = false,
            modifier = Modifier.size(100.dp)
                .align(Alignment.CenterVertically)
        )

        ProfileStat(
            stat = posts,
            title = "posts",
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
        ProfileStat(
            stat = followers,
            title = "followers",
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
        ProfileStat(
            stat = following,
            title = "following",
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
    }
}


@Preview
@Composable
fun ProfileHeaderPreview(){
    ProfileHeader(
        profilePic = painterResource(R.mipmap.profile_pic),
        posts = "3,907",
        followers = "657M",
        following = "603",
        modifier = Modifier.fillMaxWidth()
    )
}