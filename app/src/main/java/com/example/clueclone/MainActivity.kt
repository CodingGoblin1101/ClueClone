package com.example.clueclone


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.clueclone.ui.theme.ClueCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClueCloneTheme{
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Hello",
        modifier = modifier
    )

}

@Composable
fun BottomBar(){
    Icon(Icons.Filled.Home, contentDescription = null)

}

@Preview(showBackground = true, name = "HomeScreenPreview")
@Composable
fun HomeScreenPreview() {
    ClueCloneTheme {
        HomeScreen()
    }

}

@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBar()
}