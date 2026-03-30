package com.viniciusmelo.nubankclone.ui.components

import android.graphics.Paint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.theme.Black
import com.viniciusmelo.nubankclone.ui.theme.Gray

@Composable
fun ComponentButton(
    text: String,
    @DrawableRes iconRes: Int
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            shape = RoundedCornerShape(64.dp),
            color = Gray,
            onClick = {}
        ) {
            Icon(
                modifier = Modifier
                    .size(80.dp)
                    .padding(28.dp),
                painter = painterResource(iconRes),
                contentDescription = null,
                tint = Black
            )
        }

        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
@Preview
fun ComponentButtonsPreview() {
    ComponentButton("Pix", (R.drawable.image_pix))
}