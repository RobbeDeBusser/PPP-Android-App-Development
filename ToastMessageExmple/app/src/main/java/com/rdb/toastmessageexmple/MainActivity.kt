package com.rdb.toastmessageexmple

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.rdb.toastmessageexmple.ui.theme.ToastMessageExmpleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToastMessageExmpleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ToastMessageExample(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ToastMessageExample( modifier: Modifier = Modifier) {
    val myContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            Toast.makeText(myContext, "This is a Toast Message", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Show Toast Message")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ToastMessageExmpleTheme {
        ToastMessageExample()
    }
}