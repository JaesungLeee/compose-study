package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

/**
 * BasicStateCodelab
 * @author jaesung
 * @created 2023/03/04
 */
@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    viewModel: WellnessViewModel = viewModel()
) {
    Column {
        StatefulCounter(modifier = modifier)
        WellnessTaskList(
            list = viewModel.tasks,
            onCheckedTask = { task, checked -> viewModel.changeTaskChecked(task, checked)},
            onCloseTask = { task -> viewModel.tasks.remove(task) }
        )
    }
}