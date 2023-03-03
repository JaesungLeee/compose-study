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

/**
 * State Hoisting은 상태는 아래로, 이벤트는 위로에 기반
 * 자식 Composable의 이벤트를 수신해 부모 Composable에 전달한다.
 * 이벤트 전달은 람다를 기반으로 전달한다.
 * 부모 Composable은 잣기 Composable에게 받은 이벤트를 처리하고 상태를 업데이트하여 자기 자신과 자식 Composable을 Recomposition함
 */
@Composable
fun ColumnMyApp(modifier: Modifier = Modifier) {
    var shouldShowOnboarding by remember { mutableStateOf(true) }

    Surface(modifier = modifier) {
        if (shouldShowOnboarding) {
            OnboardingScreen(
                onContinueClicked = {
                    shouldShowOnboarding = false  // State 업데이트 및 Recomposition 발생
                }
            )
        } else {
            Greetings()
        }
    }
}