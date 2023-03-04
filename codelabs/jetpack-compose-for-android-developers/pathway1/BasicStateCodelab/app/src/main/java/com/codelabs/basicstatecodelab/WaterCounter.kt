package com.codelabs.basicstatecodelab

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


/**
 * BasicStateCodelab
 * @author jaesung
 * @created 2023/03/04
 */
/**
 * Step7. Remember in Composition
 * showTask는 clear했다가 add하면 count가 올라갈 때 Recomposition되면서 다시 true로 지정됨
 *
 * Step8. Restore state in Compose
 * rememberSaveable은 Config Change에도 State를 유지한다.
 */
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }
        Log.e("Count", count.toString())
        if (count > 0) {
//            var showTask by remember { mutableStateOf(true) }
//            Log.e("showTask", showTask.toString())
//            if (showTask) {
//                WellnessTaskItem(
//                    taskName = "Have you taken your 15 minute walk today?",
//                    onClose = { showTask = false }
//                )
//            }
            Text(
                text = "You've had $count glasses."
            )
        }
        Row(modifier = Modifier.padding(top = if (count > 0) 8.dp else 0.dp)) {
            Button(
                onClick = { count++ },
                enabled = count < 10
            ) {
                Text(text = "Add One")
            }
//
//            Button(
//                onClick = { count = 0 },
//                modifier = Modifier.padding(start = 8.dp)
//            ) {
//                Text(text = "Clear water count")
//            }
        }
    }
}