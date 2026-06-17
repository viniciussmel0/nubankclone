package com.viniciusmelo.nubankclone.ui.screens.home.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.theme.Purple

@Composable
fun RateScreen() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp,32.dp,0.dp, 128.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(R.drawable.image_favorite),
            contentDescription = "Like",
            tint = Purple
        )
        Text(
            text = "Avalie esta tela",
            color = Purple,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }

}