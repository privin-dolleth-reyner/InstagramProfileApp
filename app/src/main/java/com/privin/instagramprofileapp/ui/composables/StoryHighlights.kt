package com.privin.instagramprofileapp.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.privin.instagramprofileapp.R
import com.privin.instagramprofileapp.models.Story


@Composable
fun StoryHighlights(
    stories: List<Story>,
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = modifier) {
        items(stories) {
            Column {
                InstagramImage(
                    image = painterResource(it.image),
                    isHighlights = true,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(4.dp)
                )

                Text(
                    text = it.title,
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )
            }

        }
    }
}

@Preview
@Composable
private fun StoryHighlightsPreview() {
    StoryHighlights(
        stories = listOf(
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
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(8.dp)
    )
}