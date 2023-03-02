package com.codelab.basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelab.basics.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                MyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

/**
 * Top-Level 컴포저블의 파라미터로 modifier를 전달해 재사용성, 확장성 증가
 */
@Composable
private fun MyApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colors.background
    ) {
        Greeting("Android")
    }
}

@Composable
private fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
    }
}

/**
 * Surface
 * background color에 따라 contentColor가 내부적으로 Material ColorSet에 따라 달라짐
 * @see Colors.contentColorFor
 */
@Composable
fun CircularGreeting(name: String) {
    Surface(
        modifier = Modifier.padding(8.dp),
        border = BorderStroke(2.dp, Color.Red),
        contentColor = Color.Blue,
        elevation = 8.dp,
        shape = CircleShape,
        color = Color.Green,

    ) {
        Text(text = "Hello $name", modifier = Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicsCodelabTheme {
        MyApp()
    }
}

@Preview(showBackground = true, name = "Round Surface")
@Composable
fun CircularGreetingPreview() {
    BasicsCodelabTheme {
        CircularGreeting(name = "Android")
    }
}