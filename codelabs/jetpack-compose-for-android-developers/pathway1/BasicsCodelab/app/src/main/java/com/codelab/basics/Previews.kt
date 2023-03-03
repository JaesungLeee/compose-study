package com.codelab.basics

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DefaultDarkPreview() {
    BasicsCodelabTheme {
        LazyColumnGreetings()
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun ColumnPreview() {
    BasicsCodelabTheme {
        ColumnMyApp(modifier = Modifier.fillMaxSize())
    }
}

@Preview(showBackground = true)
@Composable
fun CircularGreetingPreview() {
    BasicsCodelabTheme {
        CircularGreeting(name = "Android")
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnGreetingPreview() {
    BasicsCodelabTheme {
        GreetingCard(name = "Android")
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingPreview() {
    BasicsCodelabTheme {
        OnboardingScreen(onContinueClicked = {})
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingsPreview() {
    BasicsCodelabTheme {
        Greetings()
    }
}

@Preview(showBackground = true, )
@Composable
fun LazyColumnPreview() {
    BasicsCodelabTheme {
        LazyColumnGreetings()
    }
}