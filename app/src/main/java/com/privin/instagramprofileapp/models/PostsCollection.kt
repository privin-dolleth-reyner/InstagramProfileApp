package com.privin.instagramprofileapp.models

import androidx.annotation.DrawableRes

/*
 Holds set of post collections like all posts, reels, tagged posts
 */
data class PostsCollection(
    val name: String,
    @DrawableRes val icon: Int,
    val posts: List<Post> = emptyList()
)