package com.viniciusmelo.nubankclone.ui.screens.home.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.viniciusmelo.nubankclone.ui.theme.Black
import com.viniciusmelo.nubankclone.ui.theme.Gray

@Composable
fun ExtraMoneyCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(horizontal = 22.dp),
        shape = RoundedCornerShape(12.dp),
        color = Gray,
        onClick = {}
    ) {

        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier
                    .weight(0.2f)
            ) {
                Icon(
                    modifier = Modifier
                        .size(26.dp),
                    painter = painterResource(R.drawable.image_money),
                    contentDescription = "money",
                    tint = Black
                )
            }


            Column(
                modifier = Modifier
                    .weight(1f),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = "Dinheiro adicional",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Opções de crédito disponível"
                )
            }

            Column(
                modifier = Modifier
                    .weight(0.1f)
            ) {
                Icon(
                    painter = painterResource(R.drawable.image_arrow_right),
                    contentDescription = "money",
                    tint = Black
                )
            }
        }
    }
}