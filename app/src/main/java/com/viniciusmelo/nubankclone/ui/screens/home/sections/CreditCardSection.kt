package com.viniciusmelo.nubankclone.ui.screens.home.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.theme.DarkGray
import com.viniciusmelo.nubankclone.ui.theme.Gray

@Composable
fun CreditCardSection() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(22.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Cartão de crédito",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Icon(
                painter = painterResource(R.drawable.image_arrow_right),
                contentDescription = "right arrow"
            )
        }
        Text(
            text = "Fatura atual",
            fontSize = 16.sp
        )
        Text(
            text = "R$ 1000,00",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Limite disponível de R$ 1000,00",
            fontSize = 14.sp,
            color = DarkGray
        )
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            color = Gray,
            shape = RoundedCornerShape(12.dp),
            onClick = {}
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .height(60.dp),
                    painter = painterResource(R.drawable.image_card),
                    contentDescription = "credit card"
                )
                Text(
                    text = "Meus cartões",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

    HorizontalDivider(
        thickness = 2.dp,
        color = Gray
    )

}