package com.guru.gdrbtechnologies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.guru.gdrbtechnologies.screens.LoginScreen
import com.guru.gdrbtechnologies.viewmodel.LoginViewModel
import com.guru.gdrbtechnologies.screens.ResponsiveScreen

@Composable
fun Nav(navController: NavHostController = rememberNavController()) {
    val viewModel = LoginViewModel()
    NavHost(
        navController = navController,
        startDestination = MainDestinations.LOGIN_ROUTE
    ) {
        composable(MainDestinations.LOGIN_ROUTE) {
            LoginScreen(viewModel, navController = navController)
        }
        composable(MainDestinations.RESPONSIVE_ROUTE) {
            ResponsiveScreen()
        }
    }
}
