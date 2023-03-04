package com.codelabs.basicstatecodelab

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codelabs.basicstatecodelab.ui.theme.BasicStateCodelabTheme

/**
 * BasicStateCodelab
 * @author jaesung
 * @created 2023/03/04
 */
@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    BasicStateCodelabTheme {
        WaterCounter()
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    BasicStateCodelabTheme {
        WellnessScreen()
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun WellnessTaskItemPreview() {
    BasicStateCodelabTheme {
        WellnessTaskItem(taskName = "This is task")
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun WellnessTaskListPreview() {
    BasicStateCodelabTheme {
        WellnessTaskList()
    }
}