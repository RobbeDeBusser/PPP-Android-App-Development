package com.rdb.checkbox

import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rdb.checkbox.ui.theme.CheckBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CheckBoxTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CheckboxExample(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CheckboxExample(modifier: Modifier = Modifier) {

    val resultText = remember {
        mutableStateOf("What is your gender?")
    }
    val firstCheckBox = remember {
        mutableStateOf(false)
    }
    val secondCheckBox = remember {
        mutableStateOf(false)
    }
    val myColor = 0xFF0277DD

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF02DD9F)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.size(50.dp))

        Text(
            text = resultText.value,
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier
                .width(300.dp)
                .background(Color(myColor))
                .padding(top = 15.dp, bottom = 15.dp), textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.size(50.dp))

        Column() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = firstCheckBox.value, onCheckedChange = {
                        firstCheckBox.value = it
                        if (firstCheckBox.value) {
                            secondCheckBox.value = false
                            resultText.value = "You are a Male"
                        } else {
                            resultText.value = "What is your gender?"
                        }
                    },
                    colors = CheckboxDefaults.colors(Color(myColor))
                )
                Text(text = "Male", fontSize = 20.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.size(20.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = secondCheckBox.value, onCheckedChange = {
                        secondCheckBox.value = it
                        if (secondCheckBox.value) {
                            firstCheckBox.value = false
                            resultText.value = "You are a Female"
                        } else {
                            resultText.value = "What is your gender?"
                        }
                    },
                    colors = CheckboxDefaults.colors(Color(myColor))
                )
                Text(text = "Female", fontSize = 20.sp, color = Color.White)
            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CheckBoxTheme {
        CheckboxExample()
    }
}