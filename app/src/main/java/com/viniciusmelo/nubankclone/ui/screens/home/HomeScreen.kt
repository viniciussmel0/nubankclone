package com.viniciusmelo.nubankclone.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.data.PagerItem
import com.viniciusmelo.nubankclone.ui.components.ComponentBox
import com.viniciusmelo.nubankclone.ui.components.ComponentButton
import com.viniciusmelo.nubankclone.ui.components.DiscoverCard
import com.viniciusmelo.nubankclone.ui.screens.home.sections.AccountContent
import com.viniciusmelo.nubankclone.ui.screens.home.sections.CreditCardSection
import com.viniciusmelo.nubankclone.ui.screens.home.sections.DiscoverMore
import com.viniciusmelo.nubankclone.ui.screens.home.sections.ExtraMoneyCard
import com.viniciusmelo.nubankclone.ui.screens.home.sections.HomeTopBar
import com.viniciusmelo.nubankclone.ui.screens.home.sections.LoanSection
import com.viniciusmelo.nubankclone.ui.screens.home.sections.NextPay
import com.viniciusmelo.nubankclone.ui.screens.home.sections.PagerRow
import com.viniciusmelo.nubankclone.ui.screens.home.sections.RateScreen
import com.viniciusmelo.nubankclone.ui.screens.home.sections.ShotcutsRow
import com.viniciusmelo.nubankclone.ui.theme.Black
import com.viniciusmelo.nubankclone.ui.theme.DarkGray
import com.viniciusmelo.nubankclone.ui.theme.Gray
import com.viniciusmelo.nubankclone.ui.theme.Purple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(viewModel: HomeViewModel = viewModel()) {

    val uiState by viewModel.uiState.collectAsState()

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
                onToggleBalance = { viewModel.toggleBalanceVisible() }
            )

            AccountContent(
                accountBalanceText = uiState.accountBalanceText,
                isBalanceVisible = uiState.isBalanceVisible
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

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}