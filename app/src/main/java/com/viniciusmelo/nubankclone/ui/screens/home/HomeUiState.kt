package com.viniciusmelo.nubankclone.ui.screens.home

data class HomeUiState (
    val helloUser: String = "",
    val accountBalanceText: String = "",
    val isBalanceVisible: Boolean = true,
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val isFullBar: Boolean = true
)