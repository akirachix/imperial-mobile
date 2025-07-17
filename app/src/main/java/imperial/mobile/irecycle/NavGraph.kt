package imperial.mobile.irecycle

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController





@Composable
fun AuthNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen(onNextClick = { navController.navigate("how_it_works") })
        }
        composable("how_it_works") {
            HowItWorksScreen(
                onBackClick = { navController.popBackStack() },
                onNextClick = { navController.navigate("login") }
            )
        }

        composable("login") {
            LoginScreen(
                onSignUpClick = { navController.navigate("signup") },
                onForgotPasswordClick = { navController.navigate("forgot_password") },
                onLoginClick = { /* handle login here or navigate */ }
            )
        }
        composable("signup") {
            SignUp(onLoginClick = { navController.navigate("login") })
        }
        composable("forgot_password") {
            ResetPasswordScreen(onBackToLoginClick = { navController.navigate("login") })
        }
    }
}
