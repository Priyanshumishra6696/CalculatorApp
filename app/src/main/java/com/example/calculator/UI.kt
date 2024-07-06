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
import kotlin.math.roundToInt

@Composable
fun UI(){
    var number1Entered by remember { mutableStateOf("") }
    var operationEntered by remember { mutableStateOf("") }
    var number2Entered by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            verticalArrangement = Arrangement.Bottom
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Black)
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                contentAlignment = Alignment.BottomEnd
            ){
                Row {
                    Text(
                        text = "$number1Entered $operationEntered $number2Entered",
                        fontSize = 40.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
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
                    buttonText ="%",
                    buttonColor = Color(57,57,57),
                    operationOnClick = {
                        number1Entered = (number1Entered.toDouble() / 100).toString()
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="÷",
                    buttonColor = Color(242,163,60),
                    operationOnClick = {
                        if(number1Entered.isNotEmpty()) {
                            operationEntered="÷"
                        }
                    }
                )
            }
            Row {
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="7",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "7"
                        }else{
                            number1Entered += "7"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="8",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "8"
                        }else{
                            number1Entered += "8"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="9",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "9"
                        }else{
                            number1Entered += "9"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="×",
                    buttonColor = Color(242,163,60),
                    operationOnClick = {
                        if(number1Entered.isNotEmpty()) {
                            operationEntered = "×"
                        }
                    }
                )
            }
            Row {
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="4",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "4"
                        }else{
                            number1Entered += "4"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="5",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "5"
                        }else{
                            number1Entered += "5"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="6",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "6"
                        }else{
                            number1Entered += "6"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="-",
                    buttonColor = Color(242,163,60),
                    operationOnClick = {
                        if(number1Entered.isNotEmpty()) {
                            operationEntered = "-"
                        }
                    }
                )
            }
            Row {
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="1",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "1"
                        }else{
                            number1Entered += "1"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="2",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "2"
                        }else{
                            number1Entered += "2"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="3",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "3"
                        }else{
                            number1Entered += "3"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="+",
                    buttonColor = Color(242,163,60),
                    operationOnClick = {
                        if(number1Entered.isNotEmpty()) {
                            operationEntered = "+"
                        }
                    }
                )
            }
            Row {
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="0",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty()){
                            number2Entered += "0"
                        }else{
                            number1Entered += "0"
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText =".",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(operationEntered.isNotEmpty() && !number2Entered.contains(".")){
                            number2Entered = "$number2Entered."
                        }else if(!number1Entered.contains(".")){
                            number1Entered = "$number1Entered."
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="+-",
                    buttonColor = Color(93,93,95),
                    operationOnClick = {
                        if(number1Entered.isNotEmpty()){
                            number1Entered = (number1Entered.toDouble() * -1).toString()
                        }else if(number2Entered.isNotEmpty()){
                            number2Entered = (number2Entered.toDouble() * -1).toString()
                        }
                    }
                )
                CalculatorButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(1.dp)
                        .aspectRatio(1f),
                    buttonText ="=",
                    buttonColor = Color(242,163,60),
                    operationOnClick = {

                        if (number1Entered.isNotEmpty() && operationEntered.isNotEmpty() && number2Entered.isNotEmpty()) {
                            val result = when (operationEntered) {
                                "+" -> number1Entered.toDouble() + number2Entered.toDouble()
                                "-" -> number1Entered.toDouble() - number2Entered.toDouble()
                                "×" -> number1Entered.toDouble() * number2Entered.toDouble()
                                "÷" -> {
                                    if (number2Entered.toDouble() != 0.0) {
                                        number1Entered.toDouble() / number2Entered.toDouble()
                                    } else {
                                        // Handle division by zero
                                        "Error: Division by zero"
                                    }
                                }

                                else -> 0.0
                            }

                            val formattedResult = result.toString()
                            number1Entered = if(formattedResult.endsWith(".0")){
                                formattedResult.toDouble().roundToInt().toString()
                            } else{
                                formattedResult
                            }
                            operationEntered = ""
                            number2Entered = ""
                        }
                    }
                )
            }
        }
}




