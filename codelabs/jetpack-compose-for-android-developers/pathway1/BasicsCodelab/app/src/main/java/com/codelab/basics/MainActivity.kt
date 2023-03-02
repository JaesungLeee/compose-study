package com.codelab.basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.codelab.basics.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                ColumnMyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

/**
 * Top-Level 컴포저블의 파라미터로 modifier를 전달해 재사용성, 확장성 증가
 */
@Composable
fun MyApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colors.background
    ) {
        Greeting("Android")
    }
}

@Composable
fun ColumnMyApp(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("World", "Compose")
) {
    Column(modifier = modifier.padding(vertical = 4.dp)) {
        for (name in names) {
            ColumnGreeting(name = name)
        }
    }
}

@Composable
fun Greeting(name: String) {
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
        color = Color.Green
    ) {
        Text(text = "Hello $name", modifier = Modifier.padding(8.dp))
    }
}

/**
 * 로컬 변수로 expanded를 선언하면 이벤트에 의한 리컴포지션 발생 시 컴포즈에서 tracking하지 못함 (Side Effect)
 * mutableStateOf API는 Compose가 리컴포지션 시 State를 저장할 수 있도록 함
 * remember와 함께 사용해야 Recomposition이 발생해도 State가 재설정되지 않고 유지할 수 있게 됨
 */
@Composable
fun ColumnGreeting(name: String) {

//    val expanded = remember { mutableStateOf(false) } // should use with .value

    var expanded by remember { mutableStateOf(false) }
    val extraPadding = if (expanded) 48.dp else 0.dp

    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = extraPadding)
            ) {
                Text(text = "Hello,")
                Text(text = name)
            }
            OutlinedButton(
                onClick = {
                    expanded = !expanded
                }
            ) {
                Text(text = if (expanded) "Show less" else "Show more")
            }
        }
    }
}