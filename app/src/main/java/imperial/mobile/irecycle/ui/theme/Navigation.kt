

package imperial.mobile.irecycle.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import imperial.mobile.irecycle.HowItWorksScreen
//import imperial.mobile.irecycle.LoginScreen

// Define route names as constants
object Routes {
    const val HowItWorks = "how_it_works"
    const val Login = "login"
}

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HowItWorks
    ) {
        composable(Routes.HowItWorks) {
            HowItWorksScreen(
                // Navigate to Login screen on button click
                onNextClick =  {
                    navController.navigate(Routes.Login)
                },
                onBackClick = {
                    // Handle back action if needed
                    // For example: navController.popBackStack()
                }
            )
        }


    }
}
