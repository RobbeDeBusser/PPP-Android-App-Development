package com.rdb.lazycolumnexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rdb.lazycolumnexample.ui.theme.LazyColumnExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyColumnExampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyNavigation(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MyNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "FirstPage" ){

        composable("FirstPage"){
            FirstPage(navController = navController)
        }
        composable("SecondPage/{id}",
            arguments = listOf(
                navArgument("id"){type = NavType.IntType}
            )
        ){
            val countryId = it.arguments?.getInt("id")

            countryId?.let { id ->
                SecondPage(navController = navController, id = id)
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazyColumnExampleTheme {
        MyNavigation()
    }
}