package imperial.mobile.irecycle


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.graphics.Color

@Composable
fun ForgotPasswordScreen(onBackToLoginClick: () -> Unit) {
    var email by remember { mutableStateOf("") }

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

        Spacer(modifier = Modifier.height(72.dp))

        Text(
            text = "Forgot Password",
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 28.sp,
            color = Color(0xFF006400)
        )

        Spacer(modifier = Modifier.height(48.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Text(
            text = "Didn't receive reset link? Click here to resend.",
            style = MaterialTheme.typography.headlineMedium,
            fontStyle = FontStyle.Italic,
            fontSize = 15.sp
        )

        Spacer(modifier = Modifier.height(32.dp))


        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { /* Handle password reset logic */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Send Reset Link")
        }

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = onBackToLoginClick) {
            Text("Back to Login")
        }
    }
}