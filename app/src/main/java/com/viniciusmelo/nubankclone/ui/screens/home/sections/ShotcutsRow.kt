package com.viniciusmelo.nubankclone.ui.screens.home.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.components.ComponentButton

@Composable
fun ShotcutsRow() {
    LazyRow(
        modifier = Modifier
            .padding(vertical = 16.dp),
        contentPadding = PaddingValues(horizontal = 22.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            ComponentButton(
                text = "Área Pix e\nTransferir",
                iconRes = R.drawable.image_pix
            )
        }
        item {
            ComponentButton(
                text = "Pagar",
                iconRes = R.drawable.image_barcode
            )
        }
        item {
            ComponentButton(
                text = "Pegar\nemprestado",
                iconRes = R.drawable.image_hand
            )
        }
        item {
            ComponentButton(
                text = "Recarga de\ncelular",
                iconRes = R.drawable.image_phone
            )
        }
        item {
            ComponentButton(
                text = "Caixinha e\nInvestir",
                iconRes = R.drawable.image_wallet
            )
        }

    }
}