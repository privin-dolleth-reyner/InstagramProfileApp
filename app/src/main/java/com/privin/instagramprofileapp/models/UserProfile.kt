package com.privin.instagramprofileapp.models

import androidx.annotation.DrawableRes

/*
 Holds the users profile data
 */
data class UserProfile(
    val userName: String,
    val displayName: String,
    val stats: Map<String,String>,
    @DrawableRes val profilePic: Int,
    val bio: String,
    val storyHighlights: List<Story>,
    val postsCollections: List<PostsCollection>
)