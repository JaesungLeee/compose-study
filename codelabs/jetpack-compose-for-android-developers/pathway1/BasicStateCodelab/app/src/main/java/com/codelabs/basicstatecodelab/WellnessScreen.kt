package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

/**
 * BasicStateCodelab
 * @author jaesung
 * @created 2023/03/04
 */
@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column {
        StatefulCounter(modifier = modifier)

        val list = remember { getFakeWellnessTask().toMutableStateList() } // remove되면 recomposition 발
        WellnessTaskList(list = list, onCloseTask = { task -> list.remove(task)})
    }
}