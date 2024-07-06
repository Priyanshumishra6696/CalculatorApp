package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculatorTheme {
                UI()
            }
        }
    }
}

//@Composable
//fun Main2(){
//    val number1Entered by remember { mutableStateOf("") }
//    val operationEntered by remember { mutableStateOf("") }
//    val number2Entered by remember { mutableStateOf("") }
//    var state by remember { mutableStateOf(false) }
//    if(state){
//        UI2( number1Entered,number2Entered,operationEntered)
//    }else {
//        UI(number1Entered,number2Entered,operationEntered)
//    }
//    Column(
//        modifier = Modifier.padding(top = 40.dp)
//    ){
//        Column(
//            modifier = Modifier
//                .background(Color.Black)
//                .weight(1f)
//                .fillMaxWidth()
//                .padding(bottom = 16.dp)
//                .size(64.dp)
//        ){
//            Row {
//                Text(
//                    text = "$number1Entered $operationEntered $number2Entered",
//                    fontSize = 40.sp,
//                    color = Color.White,
//                    fontWeight = FontWeight.Bold
//                )
//            }
//        }
//        Button(
//            onClick = {state = !state},
//            colors = ButtonDefaults.buttonColors(Color.Black)
//        ) {
//            Icon(
//                modifier = Modifier,
//                imageVector = Icons.Filled.ExitToApp,
//                contentDescription = "Edit",
//                tint = Color.White
//            )
//        }
//    }
//}

