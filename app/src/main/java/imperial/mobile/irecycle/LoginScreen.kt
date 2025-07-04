package imperial.mobile.irecycle


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

@Composable
fun LoginScreen(
    onSignUpClick: () -> Unit,
    onForgotPasswordClick: () -> Unit
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "KEEP YOUR CITY CLEAN",
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 28.sp,
            color = Color(0xFF006400)


        )

        Spacer(modifier = Modifier.height(48.dp))

        Text(
            text = "Login",
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 25.sp,
            color = Color(0xFF006400)
        )

        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Username",
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Enter Username") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Password",
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Enter Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = onForgotPasswordClick) {
            Text("Forgot Password?")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Handle login logic */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = onSignUpClick) {
            Text("Don't have an account? Sign Up")
        }
    }
}