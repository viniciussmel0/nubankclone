package com.viniciusmelo.nubankclone.ui.screens.invest

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class InvestViewModel() : ViewModel() {

    private val _uiState = MutableStateFlow(InvestUiState())
    val uiState : StateFlow<InvestUiState> = _uiState.asStateFlow()

}