package com.viniciusmelo.nubankclone.ui.screens.home.sections

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.viniciusmelo.nubankclone.R
import com.viniciusmelo.nubankclone.ui.screens.home.HomeViewModel
import com.viniciusmelo.nubankclone.ui.theme.Purple
import com.viniciusmelo.nubankclone.ui.theme.Purple70
import com.viniciusmelo.nubankclone.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopBar(
    helloUser: String,
    onToggleBalance: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        LargeTopAppBar(
            title = {
                Text(
                    text = helloUser,
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
                    onClick = { },
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
                    onClick = {
                        onToggleBalance()
                    }
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
}