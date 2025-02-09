package com.rdb.topappbarexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rdb.topappbarexample.ui.theme.TopAppBarExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopAppBarExampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TopAppBarExample(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample(modifier: Modifier = Modifier) {

    val actionText = remember {
        mutableStateOf("Actions will be shown here")
    }

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { actionText.value = "Navigation icon is clicked!" }) {
                        Icon(Icons.Filled.Menu, contentDescription = "Navigation icon", tint = Color.White)
                    }
                },
                title = {
                    Column {
                        Text(
                            text = stringResource(id = R.string.app_name),
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Text(text = "Subtitle", color = Color.White, fontSize = 20.sp)
                    }
                },
                actions = {
                    IconButton(onClick = { actionText.value = "Share icon is clicked!" }) {
                        Icon(Icons.Filled.Share, contentDescription = "Share icon", tint = Color.White)
                    }
                    IconButton(onClick = { actionText.value = "Search icon is clicked!" }) {
                        Icon(Icons.Filled.Search, contentDescription = "Search icon", tint = Color.White)
                    }
                    IconButton(onClick = { actionText.value = "More icon is clicked!" }) {
                        Icon(Icons.Filled.MoreVert, contentDescription = "More icon", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500),
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                )
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = actionText.value, color = Color.Black, fontSize = 18.sp)
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TopAppBarExampleTheme {
        TopAppBarExample()
    }
}