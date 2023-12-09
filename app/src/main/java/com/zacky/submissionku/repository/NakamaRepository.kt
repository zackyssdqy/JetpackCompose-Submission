package com.zacky.submissionku.repository

import com.zacky.submissionku.model.Nakama
import com.zacky.submissionku.model.nakamas
import javax.inject.Singleton

@Singleton
class NakamaRepository() {

    fun getNakamas(): List<Nakama> {
        return nakamas
    }

    private val nakamaList = mutableListOf<Nakama>()

    init {
        if (nakamaList.isEmpty()) {
            nakamas.forEach() {
                nakamaList.add(it)
            }
        }
    }


    fun getNakamaById(id: String): Nakama {
            return nakamaList.firstOrNull { it.id == id }
                ?: throw NoSuchElementException("Nakama with ID $id not found")
    }

    fun getInstance(): NakamaRepository =
        instance ?: synchronized(this) {
            NakamaRepository().apply {
                instance = this
            }
        }

    companion object {
        @Volatile
        private var instance: NakamaRepository? = null

        fun getInstance(): NakamaRepository =
            instance ?: synchronized(this) {
                NakamaRepository().apply {
                    instance = this
                }
            }
    }
}