package com.viniciusmelo.nubankclone.ui.screens.home.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.data.PagerItem
import com.viniciusmelo.nubankclone.ui.components.ComponentBox
import com.viniciusmelo.nubankclone.ui.theme.Gray

@Composable
fun PagerRow() {

    val pagerItems = remember {
        listOf(
            PagerItem(
                text = "Pix no crédito: faça pagamentos\nsem usar o saldo da conta",
                iconRes = R.drawable.image_pix,
            ),
            PagerItem(
                text = "Aumente seu limitedo cartão\nhoje com o Nu Limite Garantido",
                iconRes = R.drawable.image_card,
            ),
            PagerItem(
                text = "Seguro celular para roubo, furto e\nmuito mais. Contrate.",
                iconRes = R.drawable.image_phone,
            )
        )
    }

    val pageCount = pagerItems.size
    val pagerState = rememberPagerState(
        pageCount = { pageCount }
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        HorizontalPager(
            state = pagerState,
            pageSize = PageSize.Fill,
            pageSpacing = 22.dp,
            contentPadding = PaddingValues(22.dp),

            ) { page ->

            val item = pagerItems[page]

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp),
                contentAlignment = Alignment.BottomCenter
            ) {

                ComponentBox(
                    text = item.text,
                    iconRes = item.iconRes
                )

            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            repeat(pageCount) { index ->
                val color =
                    if (pagerState.currentPage == index) Color.DarkGray else Color.LightGray

                Box(
                    modifier = Modifier
                        .padding(2.dp, 4.dp)
                        .clip(CircleShape)
                        .background(color = color)
                        .size(6.dp)
                )
            }
        }
    }
    HorizontalDivider(
        thickness = 2.dp,
        color = Gray
    )
}