package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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

@Composable
fun UI2(num1: String, num2: String, operation: String) {
    var number1Entered by remember { mutableStateOf(num1) }
    var operationEntered by remember { mutableStateOf(operation) }
    var number2Entered by remember { mutableStateOf(num2) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Bottom
    ){
//        Box(
//            modifier = Modifier
//                .background(Color.Black)
//                .weight(1f)
//                .fillMaxWidth()
//                .padding(bottom = 16.dp),
//            contentAlignment = Alignment.BottomEnd
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
        Row {
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="Ac",
                buttonColor = Color(57,57,57),
                operationOnClick = {
                    number1Entered = ""
                    operationEntered = ""
                    number2Entered = ""
                }
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="⌫",
                buttonColor = Color(57,57,57),
                operationOnClick = {
                    if(number2Entered.isEmpty() && number1Entered.isNotEmpty()){
                        operationEntered=""
                        if (number1Entered.isNotEmpty() && number2Entered.isEmpty()) {
                            number1Entered = number1Entered.dropLast(1)
                        }
                    } else if(number2Entered.isNotEmpty()){
                        number2Entered = number2Entered.dropLast(1)
                    }
                }

            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="e",
                buttonColor = Color(57,57,57),
                operationOnClick = {
                    number1Entered = "2.71828"
                }
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="π",
                buttonColor = Color(242,163,60),
                operationOnClick = {
                    number1Entered = "3.14159"
                }

            )
        }
        Row {
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="x²",
                buttonColor = Color(93,93,95),
                operationOnClick = {
                    if(number2Entered=="" && operationEntered==""){
                        val number = number1Entered.toDouble()
                        number1Entered = (number*number).toString()
                    }
                }
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="x³",
                buttonColor = Color(93,93,95),
                operationOnClick = {}
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="xʸ",
                buttonColor = Color(93,93,95),
                operationOnClick = {}
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="eˣ",
                buttonColor = Color(242,163,60),
                operationOnClick = {}
            )
        }
        Row {
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="sin",
                buttonColor = Color(93,93,95),
                operationOnClick = {},
                TextSize = 30.sp
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="cos",
                buttonColor = Color(93,93,95),
                operationOnClick = {},
                TextSize = 30.sp
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="tan",
                buttonColor = Color(93,93,95),
                operationOnClick = {},
                TextSize = 30.sp
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="10ˣ",
                buttonColor = Color(242,163,60),
                operationOnClick = {},
                TextSize = 30.sp
            )
        }
        Row {
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="√x",
                buttonColor = Color(93,93,95),
                operationOnClick = {}
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="∛x",
                buttonColor = Color(93,93,95),
                operationOnClick = {}
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="x¹/ʸ",
                buttonColor = Color(93,93,95),
                operationOnClick = {},
                TextSize = 30.sp
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="ln",
                buttonColor = Color(242,163,60),
                operationOnClick = {}
            )
        }
        Row {
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="1/x",
                buttonColor = Color(93,93,95),
                operationOnClick = {},
                TextSize = 30.sp
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="log₁₀",
                buttonColor = Color(93,93,95),
                operationOnClick = {},
                TextSize = 24.sp
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="+-",
                buttonColor = Color(93,93,95),
                operationOnClick = {}
            )
            CalculatorButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(1.dp)
                    .aspectRatio(1f),
                buttonText ="=",
                buttonColor = Color(242,163,60),
                operationOnClick = {}
            )
        }
    }
}