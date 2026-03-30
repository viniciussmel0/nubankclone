package com.viniciusmelo.nubankclone.ui.view

import com.viniciusmelo.nubankclone.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.viniciusmelo.nubankclone.ui.components.ComponentButton
import com.viniciusmelo.nubankclone.ui.theme.Black
import com.viniciusmelo.nubankclone.ui.theme.Gray
import com.viniciusmelo.nubankclone.ui.theme.Purple
import com.viniciusmelo.nubankclone.ui.theme.Purple70
import com.viniciusmelo.nubankclone.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    Scaffold(
        topBar = {
            LargeTopAppBar(
                title = {
                    Text(
                        text = "Olá, Vinícius",
                        color = White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                    )
                },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Purple
                ),
                navigationIcon = {
                    Surface(
                        onClick = {},
                        shape = RoundedCornerShape(32.dp),
                        color = Purple70,
                        modifier = Modifier
                            .padding(start = 12.dp)
                            .size(48.dp),

                        ) {
                        Icon(
                            painter = painterResource(R.drawable.image_person),
                            contentDescription = "person",
                            tint = White,
                            modifier = Modifier
                                .size(64.dp)
                                .padding(10.dp)
                        )
                    }

                },
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.image_eye),
                            contentDescription = "Eye",
                            tint = White
                        )
                    }

                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.image_help),
                            contentDescription = "Help",
                            tint = White
                        )
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.image_shield),
                            contentDescription = "Shield",
                            tint = White
                        )
                    }
                }
            )

        }

    ) { paddingValues ->

        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(scrollState)
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
                        text = "R$ 1.000,00",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }

                Icon(
                    painter = painterResource(R.drawable.image_arrow_right),
                    contentDescription = "more"
                )
            }

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

            Surface (
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
    }
}

@Preview
@Composable
fun HomePreview() {
    Home()
}