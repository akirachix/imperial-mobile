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
        composable("how_it_works") {
            HowItWorksScreen(
                onBackClick = { navController.popBackStack() },
                onNextClick = { navController.navigate("login") }
            )
        }

        // Authentication Screens
        composable("login") {
            LoginScreen(
                onSignUpClick = { navController.navigate("signup") },
                onForgotPasswordClick = { navController.navigate("forgot_password") }
            )
        }
        composable("signup") {
            SignUpScreen(onLoginClick = { navController.navigate("login") })
        }
        composable("forgot_password") {
            ForgotPasswordScreen(onBackToLoginClick = { navController.navigate("login") })
        }
    }
}