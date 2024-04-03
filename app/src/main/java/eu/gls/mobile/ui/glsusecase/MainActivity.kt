package eu.gls.mobile.ui.glsusecase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import eu.gls.mobile.ui.glsusecase.ui.theme.GLSUseCaseTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GLSUseCaseTheme {
                NavigationComposable()
            }
        }
    }
}

@Composable
fun NavigationComposable() {
    // A surface container using the 'background' color from the theme
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        // TODO EXERCISE 1
        Text(text = "This is a composable")
    }
}

@Composable
fun LoginScreen() {
    // TODO EXERCISE 1
}

@Composable
fun ParcelListScreen() {
    // TODO EXERCISE 1
}