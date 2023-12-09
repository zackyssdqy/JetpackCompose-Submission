package com.zacky.submissionku.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zacky.submissionku.model.Nakama
import com.zacky.submissionku.repository.NakamaRepository
import com.zacky.submissionku.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(
    private val nakamaRepository: NakamaRepository
) : ViewModel() {

    private val _uiState: MutableStateFlow<UiState<Nakama>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<Nakama>> get() = _uiState

    fun getNakamaById(id: String) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
        }
        _uiState.value = UiState.Success(nakamaRepository.getNakamaById(id))
    }

}
