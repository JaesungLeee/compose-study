package com.jslee.modifierpractice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jslee.modifierpractice.ui.theme.ModifierPracticeTheme

/**
 * ModifierPractice
 * @author jaesung
 * @created 2023/03/13
 */
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ModifierPracticeTheme {
        Text(text = "AAAa")
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting1Preview() {
    ModifierPracticeTheme {
        Greeting1(name = "AAAA")
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun Greeting2Preview() {
    ModifierPracticeTheme {
        Greeting2(name = "AAAA")
    }
}

@Preview(showBackground = true)
@Composable
fun ArtistCardPreview() {
    ModifierPracticeTheme {
        ArtistCard()
    }
}

@Preview(showBackground = true)
@Composable
fun ArtistInfoPreview() {
    ModifierPracticeTheme {
        ArtistInfo()
    }
}

@Preview(showBackground = true)
@Composable
fun MatchParentSizeComposablePreview() {
    ModifierPracticeTheme {
        MatchParentSizeComposable()
    }
}

@Preview(showBackground = true)
@Composable
fun LayoutWeightComposablePreview() {
    ModifierPracticeTheme {
        LayoutWeightComposable()
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnComposablePreview() {
    ModifierPracticeTheme {
        ColumnComposable()
    }
}

