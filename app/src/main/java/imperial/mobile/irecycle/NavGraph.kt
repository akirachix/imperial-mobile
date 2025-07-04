package imperial.mobile.irecycle


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AuthNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "welcome") {
        // Teaser Screens
        composable("welcome") {
            WelcomeScreen(onNextClick = { navController.navigate("how_it_works") })
        }

    }
}