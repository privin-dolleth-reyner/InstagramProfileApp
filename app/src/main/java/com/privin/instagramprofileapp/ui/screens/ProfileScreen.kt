package com.privin.instagramprofileapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privin.instagramprofileapp.R
import com.privin.instagramprofileapp.ui.composables.Post
import com.privin.instagramprofileapp.ui.composables.PostsCollection
import com.privin.instagramprofileapp.ui.composables.PostsSection
import com.privin.instagramprofileapp.ui.composables.ProfileActions
import com.privin.instagramprofileapp.ui.composables.ProfileHeader
import com.privin.instagramprofileapp.ui.composables.ProfileTopBar
import com.privin.instagramprofileapp.ui.composables.Story
import com.privin.instagramprofileapp.ui.composables.StoryHighlights

@Composable
fun ProfileScreen(userName: String, name: String, bio: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        ProfileTopBar(
            title = userName,
            isVerified = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        ProfileHeader(
            profilePic = painterResource(R.mipmap.profile_pic),
            posts = "3,907",
            followers = "657M",
            following = "603",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = name,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = bio,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        ProfileActions(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        StoryHighlights(
            stories = listOf(
                Story(R.mipmap.story_1, "Portugal"),
                Story(R.mipmap.story_2, "FIFA"),
                Story(R.mipmap.story_3, "League"),
                Story(R.mipmap.story_4, "World cup"),
                Story(R.mipmap.story_5, "FIFA"),
                Story(R.mipmap.story_6, "League"),
                Story(R.mipmap.story_7, "World cup"),
                Story(R.mipmap.story_8, "FIFA"),
                Story(R.mipmap.story_9, "Portugal"),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
        Spacer(modifier = Modifier.height(4.dp))
        PostsSection(
            postsCollections = listOf(
                PostsCollection(
                    name = "Posts",
                    icon = R.drawable.ic_grid,
                    posts = listOf(
                        Post(R.mipmap.story_1),
                        Post(R.mipmap.story_2),
                        Post(R.mipmap.story_3),
                        Post(R.mipmap.story_4),
                        Post(R.mipmap.story_5),
                        Post(R.mipmap.story_6),
                        Post(R.mipmap.story_7),
                        Post(R.mipmap.story_8),
                        Post(R.mipmap.story_9),
                    )
                ),
                PostsCollection(
                    name = "Reels",
                    icon = R.drawable.ic_reel,
                    posts = emptyList()
                ),
                PostsCollection(
                    name = "Tags",
                    icon = R.drawable.ic_tagged,
                    posts = emptyList()
                ),
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun ProfileScreenPreview() {
    ProfileScreen(
        userName = "cristiano",
        name = "Cristiano Ronaldo",
        bio = "SIUUUbscribe to my Youtube Channel!",
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    )
}

