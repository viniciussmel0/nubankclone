package com.viniciusmelo.nubankclone.ui.screens.home.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.components.DiscoverCard

@Composable
fun DiscoverMore() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier
                .padding(horizontal = 22.dp, vertical = 10.dp),
            text = "Descubra mais",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 22.dp),
            horizontalArrangement = Arrangement.spacedBy(22.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            item {
                DiscoverCard(
                    imageRes = R.drawable.image_life,
                    title = "Seguro Vida",
                    text = "Cuide de quem você ama de\num jeito simples e que cabe no\nseu bolso.",
                    buttonText = "Conhecer",
                    imageScale = ContentScale.Crop
                )
            }
            item {
                DiscoverCard(
                    imageRes = R.drawable.icon_nubank,
                    title = "Área de Seguros do Nu",
                    text = "Toda proteção para você e para\nquem você ama num só lugar.",
                    buttonText = "Conhecer"
                )
            }
            item {
                DiscoverCard(
                    imageRes = R.drawable.icon_nubank,
                    title = "Indique o Nu para amigos",
                    text = "Espalhe como é simples estar\nno controle.",
                    buttonText = "Indicar amigos"
                )
            }
            item {
                DiscoverCard(
                    imageRes = R.drawable.image_creditcard,
                    title = "Portabilidade de salário",
                    text = "Liberdade é escolher onde\nreceber seu dinheiro.",
                    buttonText = "Conhecer",
                    imageScale = ContentScale.Fit,
                    scaleX = 1.2f,
                    scaleY = 1.2f
                )
            }
            item {
                DiscoverCard(
                    imageRes = R.drawable.image_woman,
                    title = "Chegou NuCel",
                    text = "A experiência Nubank, agora\nem planos de celular.",
                    buttonText = "Conhecer"
                )
            }
            item {
                DiscoverCard(
                    imageRes = R.drawable.image_nubank,
                    title = "Termos de uso",
                    text = "Explicamos o que diz esse documento do Nubank.",
                    buttonText = "Conhecer"
                )
            }
        }
    }

}