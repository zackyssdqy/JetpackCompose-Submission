package com.zacky.submissionku.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zacky.submissionku.model.Nakama
import com.zacky.submissionku.repository.NakamaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor (private val nakamaRepository: NakamaRepository) : ViewModel() {
    private val _nakamas = MutableLiveData<List<Nakama>>()
    val nakamas: LiveData<List<Nakama>> get() = _nakamas

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    private val _isEmpty = MutableLiveData<Boolean>()
    val isEmpty: LiveData<Boolean> get() = _isEmpty

    private val _favoriteNakamas = MutableLiveData<List<Nakama>>()
    val favoriteTroops: LiveData<List<Nakama>> get() = _favoriteNakamas

    fun loadTroops() {
        _isLoading.value = true

        viewModelScope.launch {
            try {
                val nakamaList = withContext(Dispatchers.IO) {
                    nakamaRepository.getNakamas()
                }
                _nakamas.value = nakamaList
                _isEmpty.value = nakamaList.isEmpty()
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                _isLoading.value = false
            }
        }
    }
}