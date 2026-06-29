package com.viniciusmelo.nubankclone.ui.screens.invest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.components.HomeTopBar
import com.viniciusmelo.nubankclone.ui.shared.BalanceViewModel
import com.viniciusmelo.nubankclone.ui.theme.DarkGray
import com.viniciusmelo.nubankclone.ui.theme.Gray
import com.viniciusmelo.nubankclone.ui.theme.Green
import com.viniciusmelo.nubankclone.ui.theme.Purple
import com.viniciusmelo.nubankclone.ui.theme.White
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@Composable
fun InvestScreen(
    viewModel: InvestViewModel = viewModel(),
    balanceViewModel: BalanceViewModel,
) {

    val uiState by viewModel.uiState.collectAsState()
    val balanceUiState by balanceViewModel.uiState.collectAsState()

    Scaffold(
        modifier = Modifier,
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
                helloUser = "Vinicius",
                onToggleBalance = { balanceViewModel.toggleBalanceVisible() },
                isFullBar = false
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(22.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(

                ) {

                    Text(
                        modifier = Modifier
                            .padding(bottom = 8.dp),
                        text = "Investimentos",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = balanceUiState.investBalance,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )

                }

                Button(
                    onClick = {},
                    colors = ButtonColors(
                        Purple,
                        White,
                        Gray,
                        Gray)
                ) {
                    Text(
                        text = "Investir",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 22.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .size(18.dp)
                        .padding(),
                    painter = painterResource(R.drawable.image_arrow_up),
                    contentDescription = "Arrow Up Icon",
                    tint = Green
                )

                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Green,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) {
                            append(balanceUiState.investPerformance)
                        }
                        append(" em 12 meses")
                    },
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = DarkGray
                )
            }




        }
    }

}