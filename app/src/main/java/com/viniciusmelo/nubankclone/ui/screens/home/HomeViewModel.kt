package com.viniciusmelo.nubankclone.ui.screens.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.viniciusmelo.nubankclone.data.UserData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {

    val name = "Vinícius"
    var balance: String = "1000,00"
    var isBalanceVisible: Boolean = true

    var userData: UserData = UserData(
        userName = name,
        accountBalance = balance
    )

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun loadData() {
        _uiState.update {
            it.copy(
                helloUser = ("Olá, $name!"),
                accountBalanceText = ("R$ $balance"),
                isBalanceVisible = true
            )
        }

    }

    fun toggleBalanceVisible() {
        if (_uiState.value.isBalanceVisible) {
            _uiState.update {
                it.copy(
                    accountBalanceText = "*****",  // ← troque aqui
                    isBalanceVisible = false        // ← troque aqui
                )
            }
        } else {
            _uiState.update {
                it.copy(
                    accountBalanceText = "R$ $balance", // ← troque aqui
                    isBalanceVisible = true              // ← troque aqui
                )
            }
        }
    }

}