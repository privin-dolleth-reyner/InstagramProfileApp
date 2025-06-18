package com.privin.instagramprofileapp.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privin.instagramprofileapp.R

@Composable
fun PostsGrid(
    posts: List<Post>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier
    ) {
        items(posts) {
            Image(
                painter = painterResource(it.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(1f)
                    .padding(1.dp)
            )
        }
    }
}

@Preview
@Composable
fun PostGridPreview() {
    PostsGrid(
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
        ),
        modifier = Modifier.fillMaxWidth()
    )
}