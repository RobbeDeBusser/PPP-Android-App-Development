package com.rdb.androidcomponents

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rdb.androidcomponents.ui.theme.AndroidComponentsTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidComponentsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Components(
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Components() {

    val myButtonBackgroundColor = remember {
        mutableStateOf(Color.Red)
    }
    val myButtonText = remember {
        mutableStateOf("Do your magic!")
    }
    val myButtonTextColor = remember {
        mutableStateOf(Color.White)
    }
    val myText = remember {
        mutableStateOf("Hello Wereld")
    }
    val myTextColor = remember {
        mutableStateOf(Color.Black)
    }
    val buttonStatus = remember {
        mutableStateOf(true)
    }
    val valueOnTextField = remember {
        mutableStateOf("")
    }
    val userInput = remember {
        mutableStateOf("Result: ")
    }
    val myImage = remember {
        mutableStateOf(R.drawable.neon_44)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = myImage.value),
            contentDescription = "Lewis Hamilton 44",
            modifier = Modifier.size(300.dp),
            contentScale = ContentScale.Fit,
            alignment = Alignment.Center
        )

        Spacer(modifier = Modifier.size(30.dp))

        if (buttonStatus.value) {
            Text(
                text = myText.value,
                color = myTextColor.value,
                fontSize = 24.sp,
                modifier = Modifier
                    .background(Color.Red)
                    .padding(10.dp)
            )
        }

        Spacer(modifier = Modifier.size(30.dp))

        Button(
            onClick = {
                if (buttonStatus.value) {

                    myButtonBackgroundColor.value = Color.Black
                    myButtonText.value = "Compose is fun"
                    myButtonTextColor.value = Color.Red
                    myText.value = "Hello compose"
                    myTextColor.value = Color.White
                    myImage.value = R.drawable.lewis_auto_2024

                    buttonStatus.value = false
                } else {
                    myButtonBackgroundColor.value = Color.Red
                    myButtonText.value = "Do your magic!"
                    myButtonTextColor.value = Color.White
                    myText.value = "Hello Wereld"
                    myTextColor.value = Color.Black
                    myImage.value = R.drawable.neon_44

                    buttonStatus.value = true
                }

                userInput.value = valueOnTextField.value
                valueOnTextField.value = ""

            },
            modifier = Modifier.size(250.dp, 60.dp),
            colors = ButtonDefaults.buttonColors(myButtonBackgroundColor.value),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(
                text = myButtonText.value,
                color = myButtonTextColor.value,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.size(30.dp))

        TextField(
            value = valueOnTextField.value,
            onValueChange = {
                valueOnTextField.value = it
            },
            label = {
                Text(
                    text = "Enter your name"
                )
            },
            modifier = Modifier.width(300.dp),
            colors = TextFieldDefaults.textFieldColors(
                unfocusedTextColor = Color.White,
                containerColor = Color.Blue,
                focusedLabelColor = Color.Yellow,
                unfocusedLabelColor = Color.White,
                focusedIndicatorColor = Color.Red,
                unfocusedIndicatorColor = Color.Green
            ),
            textStyle = TextStyle.Default.copy(fontSize = 20.sp, color = Color.White),
            maxLines = 4,
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.size(30.dp))

        Text(
            text = userInput.value,
            color = myTextColor.value,
            fontSize = 24.sp,
            modifier = Modifier
                .background(Color.Red)
                .padding(10.dp)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidComponentsTheme {
        Components()
    }
}