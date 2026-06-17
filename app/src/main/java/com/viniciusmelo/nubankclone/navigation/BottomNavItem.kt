package com.viniciusmelo.nubankclone.navigation

import com.viniciusmelo.nubankclone.R

sealed class BottomNavItem(val route: String, val icon: Int) {
    object Home : BottomNavItem("home", R.drawable.image_arrows)
    object Invest : BottomNavItem("invest", R.drawable.image_dollar)
    object Store : BottomNavItem("store", R.drawable.image_gift)
    object Phone : BottomNavItem(route = "phone", icon = R.drawable.image_phone)
}