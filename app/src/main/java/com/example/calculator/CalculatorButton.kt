package com.example.calculator

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    modifier: Modifier,
    buttonText : String,
    buttonColor : Color,
    operationOnClick : ()->Unit,
    TextSize : TextUnit = 40.sp
){
    Button(
        modifier = modifier.height(64.dp),
        onClick = operationOnClick,
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(buttonColor),
    ) {
        Text(
            fontSize = TextSize,
            text = buttonText,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}