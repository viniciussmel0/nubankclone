package com.viniciusmelo.nubankclone.navigation

import android.graphics.Paint
import android.net.wifi.hotspot2.pps.HomeSp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.mandatorySystemGesturesPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.graphics.red
import androidx.core.graphics.toColor
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.viniciusmelo.nubankclone.ui.screens.home.HomeScreen
import com.viniciusmelo.nubankclone.ui.screens.invest.InvestScreen
import com.viniciusmelo.nubankclone.ui.screens.phone.PhoneScreen
import com.viniciusmelo.nubankclone.ui.screens.store.StoreScreen
import com.viniciusmelo.nubankclone.ui.shared.BalanceViewModel
import com.viniciusmelo.nubankclone.ui.theme.Black
import com.viniciusmelo.nubankclone.ui.theme.DarkGray
import com.viniciusmelo.nubankclone.ui.theme.Gray
import com.viniciusmelo.nubankclone.ui.theme.Purple
import com.viniciusmelo.nubankclone.ui.theme.Purple80
import com.viniciusmelo.nubankclone.ui.theme.White


@Composable
fun AppNavHost() {

    val navController = rememberNavController()

    val items = remember {
        listOf(
            BottomNavItem.Home,
            BottomNavItem.Invest,
            BottomNavItem.Store,
            BottomNavItem.Phone
        )
    }

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val balanceViewModel: BalanceViewModel = viewModel()
    val balanceUiState by balanceViewModel.uiState.collectAsState()

    Scaffold(
        contentWindowInsets = WindowInsets(0),
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 38.dp, horizontal = 64.dp),
                contentAlignment = Alignment.Center
            ) {
                Surface(
                    modifier = Modifier
                        .shadow(
                            elevation = 8.dp,
                            shape = RoundedCornerShape(64.dp)
                        )
                        .height(72.dp),
                    shape = RoundedCornerShape(64.dp),
                    color = White,
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(4.dp),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        items.forEach { item ->

                            val selected = currentRoute == item.route

                            Box(
                                modifier = Modifier
                                    .background(
                                        color = if (selected) Purple80 else Color.Transparent,
                                        shape = RoundedCornerShape(32.dp)
                                    )
                                    .padding(horizontal = 26.dp, vertical = 22.dp)
                                    .clickable (
                                        indication = null,
                                        interactionSource = remember { MutableInteractionSource() }
                                    ) {
                                        navController.navigate(item.route) {
                                            popUpTo(navController.graph.startDestinationId) {
                                                saveState = true
                                            }
                                            launchSingleTop = true
                                            restoreState = true
                                    }
                                }
                                ) {
                                Icon(
                                    painterResource(item.icon),
                                    contentDescription = item.route,
                                    tint = if (selected) Purple else Black
                                )
                            }
                        }
                    }
                }
            }
        }
    ) { _ ->

        NavHost(
            modifier = Modifier,
            navController = navController,
            startDestination = BottomNavItem.Home.route
        ) {
            composable(BottomNavItem.Home.route) {
                HomeScreen(
                    balanceViewModel = balanceViewModel
                )
            }
            composable(BottomNavItem.Invest.route) {
                InvestScreen(
                    balanceViewModel = balanceViewModel
                )
            }
            composable(BottomNavItem.Store.route) {
                StoreScreen()
            }
            composable(BottomNavItem.Phone.route) {
                PhoneScreen()
            }
        }
    }
}