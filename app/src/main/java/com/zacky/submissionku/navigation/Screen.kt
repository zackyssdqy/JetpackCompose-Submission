package com.zacky.submissionku.navigation

sealed class Screen(val route: String) {
    object List: Screen ("list")
    object About: Screen ("about")
    object Detail: Screen ("list/{nakamaId}"){
        fun createRoute(NakamaId: String) = "list/$NakamaId"
    }
}