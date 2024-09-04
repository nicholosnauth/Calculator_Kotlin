package com.example.calculator_kotlin

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator_kotlin.ui.theme.Calculator_KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var num1 by remember{
    mutableStateOf("0")
            }
            var num2 by remember{
    mutableStateOf("0")
            }
        Column {


    TextField(value = num1, onValueChange = {
        num1 = it
    })
    TextField(value = num2, onValueChange = {
        num2 = it
    })



            //Row function organizes objects on the GUI into a row formation.
            //The buttons are the objects that are put into a row.
            Row {
//---------------------------------------------------------------------------------------------
                //Addition
                Button(onClick = {})
                {
                    var result = num1.toInt() + num2.toInt()
                    Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT)
                        .show()
                    Text(text = "+")
                }

                Spacer(modifier = Modifier.width(5.dp))

//---------------------------------------------------------------------------------------------
                //Subtract
                Button(onClick = {})
                {
                    var result = num1.toInt() - num2.toInt()
                    Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT)
                        .show()
                    Text(text = "-")
                }
                Spacer(modifier = Modifier.width(5.dp))
//---------------------------------------------------------------------------------------------
                //Multiply
                Button(onClick = {})
                {
                    var result = num1.toInt() * num2.toInt()
                    Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT)
                        .show()
                    Text(text = "-")
                }

                Spacer(modifier = Modifier.width(5.dp))
//---------------------------------------------------------------------------------------------
                //Divide
                Button(onClick = {})
                {
                    var result = num1.toInt() / num2.toInt()
                    Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT)
                        .show()
                    Text(text = "/")
                }
            }
        }

        }



        }
    }




