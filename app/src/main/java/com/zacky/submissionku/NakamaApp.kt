package com.zacky.submissionku

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.zacky.submissionku.navigation.Navigation
import com.zacky.submissionku.navigation.Screen
import com.zacky.submissionku.ui.page.AboutScreen
import com.zacky.submissionku.ui.page.DetailScreen
import com.zacky.submissionku.ui.page.ListScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NakamaApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold(
        bottomBar = {
            if (currentRoute == Screen.List.route) {
                BottomBar(navController = navController)
            }
            if (currentRoute == Screen.About.route) {
                BottomBar(navController = navController)
            }
        },
        modifier = modifier
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.List.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.List.route) {
                ListScreen(navigateToDetail = {
                    navController.navigate(Screen.Detail.createRoute(it))
                })
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
            composable(
                route = Screen.Detail.route + "/{nakamaId}",
                arguments = listOf(navArgument("nakamaId") { type = NavType.StringType }),
            ) {
                val id = it.arguments?.getString("nakamaId") ?: ""
                DetailScreen(
                    NakamaId = id,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }
        }
    }


}

@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItem = listOf(
            Navigation(
                title = "Home",
                icon = Icons.Default.Home,
                screen = Screen.List
            ),
            Navigation(
                title = "About",
                icon = Icons.Default.AccountCircle,
                screen = Screen.About
            )
        )
        navigationItem.map { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = { Text(item.title) },
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}