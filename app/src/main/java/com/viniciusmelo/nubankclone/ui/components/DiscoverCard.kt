package com.viniciusmelo.nubankclone.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.theme.Gray
import com.viniciusmelo.nubankclone.ui.theme.Purple

@Composable
fun DiscoverCard(
    @DrawableRes imageRes: Int,
    title: String,
    text: String,
    buttonText: String,
    imageAlignment: Alignment = Alignment.Center,
    imageScale: ContentScale = ContentScale.Crop,
    scaleX: Float = 1f,
    scaleY: Float = 1f
) {
    Surface(
        modifier = Modifier
            .size(260.dp, 270.dp),
        shape = RoundedCornerShape(12.dp),
        color = Gray,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .clipToBounds()
                    .graphicsLayer(scaleX = scaleX, scaleY = scaleY),
                painter = painterResource(imageRes),
                contentDescription = null,
                alignment = imageAlignment,
                contentScale = imageScale,
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp,vertical = 10.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = text,
                    fontSize = 14.sp,
                    lineHeight = 16.sp
                )

                Spacer(modifier = Modifier.weight(1f))

                Button(
                    modifier = Modifier
                        .defaultMinSize(minHeight = 1.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Purple
                    ),
                    onClick = {},
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = buttonText,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun DiscoverCardPreview() {
    DiscoverCard(
        imageRes = R.drawable.icon_nubank,
        title = "Seguro Vida",
        text = "Cuide de quem você ama de\num jeito simples e que cabe no\nseu bolso.",
        buttonText = "Conhecer"
    )
}