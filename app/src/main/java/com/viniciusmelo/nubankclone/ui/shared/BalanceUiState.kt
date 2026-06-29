package com.viniciusmelo.nubankclone.ui.shared

data class BalanceUiState(
    val accountBalanceText: String = "",
    val investBalance: String = "",
    val investPerformance: String = "",
    val isBalanceVisible: Boolean = true,
)