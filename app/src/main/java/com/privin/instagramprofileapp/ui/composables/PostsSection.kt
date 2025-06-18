package com.privin.instagramprofileapp.ui.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privin.instagramprofileapp.R

data class Post(
    @DrawableRes val image: Int
)

data class PostsCollection(
    val name: String,
    @DrawableRes val icon: Int,
    val posts: List<Post> = emptyList()
)

@Composable
fun PostsSection(
    postsCollections: List<PostsCollection>,
    modifier: Modifier = Modifier
) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }

    Column(modifier = modifier) {
        TabRow(
            contentColor = Color.Black,
            containerColor = Color.Transparent,
            selectedTabIndex = selectedTabIndex,
        ) {
            postsCollections.forEachIndexed { index, postsCollection ->
                Tab(
                    selected = selectedTabIndex == index,
                    selectedContentColor = Color.Black,
                    unselectedContentColor = Color.LightGray,
                    onClick = {
                        selectedTabIndex = index
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(
                        painter = painterResource(postsCollection.icon),
                        contentDescription = postsCollection.name,
                        tint = if (selectedTabIndex == index) Color.Black else Color.LightGray,
                        modifier = Modifier.size(24.dp)
                    )

                }
            }

        }

        PostsGrid(
            posts = postsCollections[selectedTabIndex].posts,
            modifier = Modifier.fillMaxWidth()
        )
    }


}


@Preview
@Composable
fun PostsSectionPreview() {
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
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
    )
}