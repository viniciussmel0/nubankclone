package com.viniciusmelo.nubankclone.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.viniciusmelo.nubankclone.ui.screens.home.sections.AccountContent
import com.viniciusmelo.nubankclone.ui.screens.home.sections.CreditCardSection
import com.viniciusmelo.nubankclone.ui.screens.home.sections.DiscoverMore
import com.viniciusmelo.nubankclone.ui.screens.home.sections.ExtraMoneyCard
import com.viniciusmelo.nubankclone.ui.components.HomeTopBar
import com.viniciusmelo.nubankclone.ui.screens.home.sections.LoanSection
import com.viniciusmelo.nubankclone.ui.screens.home.sections.NextPay
import com.viniciusmelo.nubankclone.ui.screens.home.sections.PagerRow
import com.viniciusmelo.nubankclone.ui.screens.home.sections.RateScreen
import com.viniciusmelo.nubankclone.ui.screens.home.sections.ShotcutsRow
import com.viniciusmelo.nubankclone.ui.shared.BalanceViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel(),
    balanceViewModel: BalanceViewModel
) {

    val uiState by viewModel.uiState.collectAsState()
    val balanceUiState by balanceViewModel.uiState.collectAsState()

    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()

    Scaffold(
        contentWindowInsets = WindowInsets(0)
    ) { paddingValues ->

        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(scrollState)
        ) {

            HomeTopBar(
                helloUser = uiState.helloUser,
                onToggleBalance = { balanceViewModel.toggleBalanceVisible() },
                isFullBar = true
            )

            AccountContent(
                accountBalanceText = balanceUiState.accountBalanceText,
                isBalanceVisible = balanceUiState.isBalanceVisible
            )

            ShotcutsRow()

            ExtraMoneyCard()

            PagerRow()

            CreditCardSection()

            LoanSection()

            NextPay()

            DiscoverMore()

            RateScreen()

        }
    }
}

/*
@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

 */