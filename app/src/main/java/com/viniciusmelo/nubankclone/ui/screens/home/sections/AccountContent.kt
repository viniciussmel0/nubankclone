package com.viniciusmelo.nubankclone.ui.screens.home.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.screens.home.HomeViewModel

@Composable
fun AccountContent(
    accountBalanceText: String,
    isBalanceVisible : Boolean
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 22.dp, horizontal = 22.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Conta",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = accountBalanceText,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Icon(
            painter = painterResource(R.drawable.image_arrow_right),
            contentDescription = "more"
        )
    }
}