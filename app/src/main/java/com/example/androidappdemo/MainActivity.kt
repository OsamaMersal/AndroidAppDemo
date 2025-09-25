package com.example.androidappdemo

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
import com.example.androidappdemo.ui.theme.AndroidAppDemoTheme
import androidx.compose.ui.res.stringResource
import com.example.androidappdemo.R
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidAppDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(16.dp)
                    ) {
                        // Greeting
                        Greeting(name = "Android")

                        Spacer(modifier = Modifier.height(16.dp))

                        // placeholders demo
                        Header(name = "PTC", points = 42)

                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        val hello = stringResource(id = R.string.hello_text, name)
        Text(
            text = hello,
            modifier = modifier
        )
    }

    @Composable
    fun Header(name: String, points: Int) {
        val welcome = stringResource(R.string.welcome_user, name)
        val summary = stringResource(R.string.points_summary, name, points)

        Column(modifier = Modifier.padding(16.dp)) {
            Text(welcome)
            Text(summary)
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        AndroidAppDemoTheme {
            Greeting("Android")
        }
    }
}