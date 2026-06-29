package com.viniciusmelo.nubankclone.ui.shared

import androidx.lifecycle.ViewModel
import com.viniciusmelo.nubankclone.data.UserData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BalanceViewModel : ViewModel() {

    private val name: String = "Vinícius"
    private val balance: String = "1.000,00"
    private val investBalance: String = "10.000,00"
    private val investPerformance: String = "1.000,00"

    val userData: UserData = UserData(
        userName = name,
        accountBalance = balance,
        investBalance = investBalance,
        investPerformance = investPerformance
    )

    private val _uiState = MutableStateFlow(BalanceUiState())
    val uiState: StateFlow<BalanceUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    private fun loadData() {
        _uiState.update {
            it.copy(
                accountBalanceText = "R$ $balance",
                investBalance = "R$ $investBalance",
                investPerformance = investPerformance,
                isBalanceVisible = true
            )
        }
    }

    fun toggleBalanceVisible() {
        if (_uiState.value.isBalanceVisible) {
            _uiState.update {
                it.copy(
                    accountBalanceText = "*****",
                    investBalance = "*****",
                    investPerformance = "*****",
                    isBalanceVisible = false
                )
            }
        } else {
            _uiState.update {
                it.copy(
                    accountBalanceText = "R$ $balance",
                    investBalance = "R$ $investBalance",
                    investPerformance = investPerformance,
                    isBalanceVisible = true
                )
            }
        }
    }

}