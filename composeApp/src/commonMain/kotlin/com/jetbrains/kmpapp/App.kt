package com.jetbrains.kmpapp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import co.zsmb.requirektx.requireArguments
import co.zsmb.requirektx.requireInt
import com.jetbrains.kmpapp.screens.detail.DetailScreen
import com.jetbrains.kmpapp.screens.list.ListScreen

@Composable
fun App() {
    MaterialTheme {
        val navController: NavHostController = rememberNavController()
        NavHost(
            navController,
            startDestination = "list"
        ) {
            composable("list") {
                ListScreen(navController)
            }
            composable(
                "detail/{objectId}",
                arguments = listOf( navArgument("objectId") { type = NavType.IntType }, )
            ) { backStackEntry ->
                val args = backStackEntry.requireArguments()
                val objectId = args.requireInt("objectId")
                DetailScreen(navController, objectId)
            }
        }
    }
}
