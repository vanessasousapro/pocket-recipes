package br.com.fiap.pocketrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.pocketrecipes.screens.InitialScreen
import br.com.fiap.pocketrecipes.screens.SignupScreen
import br.com.fiap.pocketrecipes.ui.theme.PocketRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PocketRecipesTheme {
                //InitialScreen()
                SignupScreen()
            }
        }
    }
}

