package br.com.fiap.pocketrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.pocketrecipes.ui.theme.PocketRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PocketRecipesTheme {
                InitialScreen()
            }
        }
    }
}

@Composable
fun InitialScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
                .background(color = Color.Green)
        ) {
            Image(
                painter = painterResource(R.drawable.cooking),
                contentDescription = "Imagem do Chef"
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(color = Color.Yellow)
            ) {
                Text(
                    text = "UNLIMITED PREMIUM RECIPES",
                    fontSize = 16.sp,
                    color = Color(0xFF868080),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Starting Cooking",
                    fontSize = 64.sp,
                    lineHeight = 64.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFED1459)
                )
            }
        }

    }
}

@Composable
@Preview
fun InitialScreenPreview() {
    PocketRecipesTheme() {
        InitialScreen()
    }
}