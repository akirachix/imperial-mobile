package imperial.mobile.irecycle

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HowItWorksScreen(onBackClick: () -> Unit, onNextClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "HOW IT WORKS",
            color =Color(0xFF006400),
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(96.dp))

        Text(
            text = "1. View company catalog to see price/kg for each material",
            color = Color(0xFF006400),
            fontSize = 16.sp


        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "2. Select the type of your cloth material",
            color = Color(0xFF006400),
            fontSize = 16.sp

        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "3. Enter the estimated weight",
            color = Color(0xFF006400),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "4. Take the picture of the cloth",
            color = Color(0xFF006400),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "5. Your clothes are posted and wait to receive pickup request",
            color = Color(0xFF006400),
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(60.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = onBackClick) {
                Text("Back")
            }
            Button(onClick = onNextClick) {
                Text("Log in")
            }
        }
    }
}