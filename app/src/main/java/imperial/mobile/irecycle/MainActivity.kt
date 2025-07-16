package imperial.mobile.irecycle

//import ResetPasswordScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import imperial.mobile.irecycle.ui.theme.IRECYCLETheme


import androidx.core.view.WindowCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface {
                    ResetPasswordScreen()
                }
            }
        }
    }
}

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            IRECYCLETheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}



