package com.jslee.modifierpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jslee.modifierpractice.ui.theme.ModifierPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModifierPracticeTheme {
                LayoutWeightComposable()
            }
        }
    }
}