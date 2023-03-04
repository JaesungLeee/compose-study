package com.codelabs.basicstatecodelab

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


/**
 * BasicStateCodelab
 * @author jaesung
 * @created 2023/03/04
 */
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count = 0  // 잘못된 State 선언
        Text(
            text = "You've had $count glasses."
        )
        Button(
            onClick = { count++ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = "Add One")
        }
    }
}