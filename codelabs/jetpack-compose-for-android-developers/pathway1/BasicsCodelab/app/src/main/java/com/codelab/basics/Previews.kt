package com.codelab.basics

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basics.ui.theme.BasicsCodelabTheme

/**
 * BasicsCodelab
 * @author jaesung
 * @created 2023/03/02
 */
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicsCodelabTheme {
        MyApp()
    }
}

@Preview(showBackground = true, name = "Round Surface")
@Composable
fun CircularGreetingPreview() {
    BasicsCodelabTheme {
        CircularGreeting(name = "Android")
    }
}