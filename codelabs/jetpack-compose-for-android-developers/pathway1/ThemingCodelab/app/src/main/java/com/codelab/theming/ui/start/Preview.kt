package com.codelab.theming.ui.start

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.theming.data.PostRepo
import com.codelab.theming.ui.start.theme.JetNewsTheme

/**
 * ComposeTheming
 * @author jaesung
 * @created 2023/03/05
 */
@Preview("Post Item")
@Composable
private fun PostItemPreview() {
    val post = remember { PostRepo.getFeaturedPost() }
    Surface {
        PostItem(post = post)
    }
}

@Preview("Featured Post")
@Composable
private fun FeaturedPostPreview() {
    val post = remember { PostRepo.getFeaturedPost() }
    JetNewsTheme {
        FeaturedPost(post = post)
    }
}

@Preview
@Composable
private fun FeaturedPostDarkPreview() {
    val post = remember { PostRepo.getFeaturedPost() }
    JetNewsTheme(darkTheme = true) {
        FeaturedPost(post = post)
    }
}
@Preview("Home")
@Composable
private fun HomePreview() {
    Home()
}