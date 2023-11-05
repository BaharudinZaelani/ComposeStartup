package com.bahardev.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hallo $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting(name = "Hallo Bahar")
}