package br.com.fiap.pocketrecipes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import br.com.fiap.pocketrecipes.screens.HomeScreen
import br.com.fiap.pocketrecipes.screens.InitialScreen
import br.com.fiap.pocketrecipes.screens.LoginScreen
import br.com.fiap.pocketrecipes.screens.SignupScreen

@Composable
fun NavigationRoutes() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Destination.InitialScreen.route
    ){
        composable(Destination.InitialScreen.route){
            InitialScreen(navController)
        }
        composable(Destination.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(Destination.SignupScreen.route) {
            SignupScreen(navController)
        }
        composable(Destination.LoginScreen.route) {
            LoginScreen(navController)
        }
    }
}