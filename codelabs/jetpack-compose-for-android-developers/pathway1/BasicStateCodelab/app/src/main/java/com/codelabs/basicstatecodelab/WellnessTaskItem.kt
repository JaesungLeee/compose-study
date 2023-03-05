package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * BasicStateCodelab
 * @author jaesung
 * @created 2023/03/04
 */
/**
 * Step10. Work with lists
 * WellnessTakItem을 Stateless하게 만듦
 */
@Composable
fun WellnessTaskItem(
    taskName: String,
    checked: Boolean,
    onCheckChange: (Boolean) -> Unit,
    onCloseTask: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = taskName,
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp)
        )
        Checkbox(checked = checked, onCheckedChange = onCheckChange)
        IconButton(onClick = onCloseTask) {
            Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
        }
    }
}

/**
 * Step10. Work with lists
 * Stateful한 Composable에서 Stateless한 Composable로 상태를 내려주는 것을 통해 State Hoisting 적용
 * Stateful 안에 Stateless
 */
//@Composable
//fun WellnessTaskItem(
//    taskName: String,
//    checkState: Boolean,
//    onCheckChange: (Boolean) -> Unit,
//    onCloseTask: () -> Unit,
//    modifier: Modifier = Modifier,
//) {
//    // Scroll 상태 유지를 위해 rememberSaveable
//    var checkedState by rememberSaveable { mutableStateOf(false) }
//
//    WellnessTaskItem(
//        taskName = taskName,
//        checked = checkState,
//        onCheckChange = onCheckChange,
//        onClose = onCloseTask,
//        modifier = modifier
//    )
//}