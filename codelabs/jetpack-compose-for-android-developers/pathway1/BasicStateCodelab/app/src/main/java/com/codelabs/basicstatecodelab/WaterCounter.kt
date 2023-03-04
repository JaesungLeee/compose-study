package com.codelabs.basicstatecodelab

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
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
        var count by remember { mutableStateOf(0) }
        if (count > 0) {
            Text(
                text = "You've had $count glasses."
            )
        }
        Button(
            onClick = { count++ },
            modifier = Modifier.padding(top = if (count > 0) 8.dp else 0.dp),
            enabled = count < 10
        ) {
            Text(text = "Add One")
        }
    }
}