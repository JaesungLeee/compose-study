package com.codelabs.basicstatecodelab

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

/**
 * BasicStateCodelab
 * @author jaesung
 * @created 2023/03/05
 */
class WellnessViewModel : ViewModel() {
    private val _tasks = getFakeWellnessTask().toMutableStateList()
    val tasks = _tasks

    fun removeTask(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) {
        tasks.find { task -> task.id == item.id }?.let { task ->
            task.checked = checked
        }
    }

    private fun getFakeWellnessTask() = List(30) { WellnessTask(id = it, label = "Task #$it", initialChecked = false) }
}