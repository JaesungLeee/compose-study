package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.padding
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
    val count = 0  // 잘못된 State 선언
    Text(
        text = "You've had $count glasses.",
        modifier = modifier.padding(16.dp)
    )
}