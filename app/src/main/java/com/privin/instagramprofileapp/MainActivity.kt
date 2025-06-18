package com.privin.instagramprofileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.privin.instagramprofileapp.models.Post
import com.privin.instagramprofileapp.models.PostsCollection
import com.privin.instagramprofileapp.models.Story
import com.privin.instagramprofileapp.models.UserProfile
import com.privin.instagramprofileapp.ui.screens.ProfileScreen
import com.privin.instagramprofileapp.ui.theme.InstagramProfileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramProfileApp(getUserProfile())
        }
    }

    private fun getUserProfile(): UserProfile{
        return UserProfile(
            userName = "cristiano",
            displayName = "Cristiano Ronaldo",
            profilePic = R.mipmap.profile_pic,
            bio = "SIUUUbscribe to my Youtube Channel!",
            stats = mapOf(
                "posts" to "3,907",
                "followers" to "657M",
                "following" to "603"
            ),
            storyHighlights = listOf(
                Story(R.mipmap.story_1,"Portugal"),
                Story(R.mipmap.story_2,"FIFA"),
                Story(R.mipmap.story_3,"League"),
                Story(R.mipmap.story_4,"World cup"),
                Story(R.mipmap.story_5,"FIFA"),
                Story(R.mipmap.story_6,"League"),
                Story(R.mipmap.story_7,"World cup"),
                Story(R.mipmap.story_8,"FIFA"),
                Story(R.mipmap.story_9,"Portugal"),
            ),
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
                )
            )
        )
    }
}

@Composable
fun InstagramProfileApp(userProfile: UserProfile){
    InstagramProfileAppTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            ProfileScreen(
                userProfile = userProfile,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}