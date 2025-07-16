package imperial.mobile.irecycle

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import imperial.mobile.irecycle.ui.theme.Roboto

@Composable
fun ResetPasswordScreen(
    onSubmit: (String) -> Unit = {},
    onResendClick: () -> Unit = {}
) {
    var email by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Keep your city clean\nReset password",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF006241),
                textAlign = TextAlign.Center,
                lineHeight = 38.sp,
                fontFamily = Roboto
            )

            Spacer(modifier = Modifier.height(64.dp))

            Text(
                text = "Add recovery email",
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.Start),
                fontFamily = Roboto
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                placeholder = { Text(text = "") },
                singleLine = true,
                shape = RoundedCornerShape(0.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Didn’t receive reset link? Click here to resend",
                fontSize = 19.sp,
                color = Color.Black,
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
                modifier = Modifier
                    .align(Alignment.Start)
                    .clickable { onResendClick() },
                lineHeight = 26.sp,
                fontFamily = Roboto
            )
        }

        Spacer(modifier = Modifier.height(64.dp))


        Button(
            onClick = { onSubmit(email) },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 90.dp, top = 90.dp)

                .width(160.dp)
                .height(40.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF171918)
            )
        ) {
            Text(
                text = "Submit",
                fontSize = 15.sp,
                color = Color(0xFFE5E5E5)
            )
        }
    }
}