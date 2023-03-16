package com.jslee.modifierpractice

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * ModifierPractice
 * @author jaesung
 * @created 2023/03/13
 */

@Composable
fun Greeting1(name: String) {
    Column(modifier = Modifier.padding(24.dp)) {
        Text(text = "Hello,")
        Text(text = name)
    }
}

@Composable
fun Greeting2(name: String) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .wrapContentSize()
    ) {
        Text(text = "Hello,")
        Text(text = name)
    }
}

@Composable
fun ArtistCard(modifier: Modifier = Modifier) {
    val padding = 16.dp
    Column(
        modifier
            .padding(padding)
            .clickable(onClick = { })
            .fillMaxWidth()
    ) {
        ArtistInfo(modifier)
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(top = 16.dp),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null
        )
    }
}

@Composable
fun ArtistInfo(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.size(width = 400.dp, height = 100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxHeight()
                .clip(CircleShape)
        )
        Column(
        ) {
            Text(text = "Alfred Sisley", modifier = Modifier.paddingFromBaseline(top = 50.dp))
            Text(text = "3 minutes ago", modifier = Modifier.offset(x = 4.dp))
        }
    }
}

@Composable
fun MatchParentSizeComposable() {
    Box {
        Spacer(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
        )
        ArtistInfo()
    }
}

@Composable
fun LayoutWeightComposable() {
    val baseModifier = Modifier
        .background(Color.DarkGray)
        .padding(24.dp)

    Row(modifier = Modifier.fillMaxWidth().clickable {
        Log.d("Tag", baseModifier.toString())
    }) {
        Text(
            text = "AAA",
            modifier = baseModifier.weight(2f)
        )
        Text(
            text = "BBB",
            modifier = baseModifier.weight(3f)
        )
    }
}