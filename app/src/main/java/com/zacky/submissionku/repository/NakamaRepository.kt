package com.zacky.submissionku.repository

import com.zacky.submissionku.database.FavoriteDao
import com.zacky.submissionku.model.Nakama
import com.zacky.submissionku.model.nakamas
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NakamaRepository @Inject constructor(private val mFavoriteDao: FavoriteDao) {

    fun getNakamas(): List<Nakama> {
        return nakamas
    }

    suspend fun getFavoriteNakama(): List<Nakama> = mFavoriteDao.getFavoriteNakama()

    suspend fun insertToFavorite(nakama: Nakama) {
        mFavoriteDao.insertFavoriteNakama(nakama)
    }

    suspend fun deleteFromNakama(nakama: Nakama) {
        mFavoriteDao.deleteFavoriteNakama(nakama)
    }

    suspend fun checkIsFavoriteById(id: String): Boolean {
        return mFavoriteDao.getNakamaById(id).any()
    }

}