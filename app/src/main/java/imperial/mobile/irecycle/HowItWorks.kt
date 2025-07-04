package imperial.mobile.irecycle

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp


@Composable
fun HowItWorksScreen(
    onNextClick: () -> Unit = {},
    onBackClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(15, 87, 54))
            .padding(16.dp, 44.dp, 16.dp, 84.dp),

        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,



    ) {
        Text(
            text = "HOW IT WORKS",
            color =Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "1. View company catalog to see price/kg for each material",
            color = Color.White,
            fontSize = 24.sp



        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "2. Select the type of your cloth material",
            color = Color.White,
            fontSize = 24.sp,


        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "3. Enter the estimated weight",
            color = Color.White,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "4. Take the picture of the cloth",
            color = Color.White,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "5. Your clothes are posted and wait to receive pickup request",
            color = Color.White,
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(250.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Button(onClick = onBackClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF14643c),
                    contentColor = Color.White
                ),
                border = BorderStroke(1.dp, Color.White),
            ) {
                Text("Back")
            }
            Button(
                onClick = onNextClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color(0xFF14643c)
                )) {
                Text("Next")
            }
        }

    }
}






