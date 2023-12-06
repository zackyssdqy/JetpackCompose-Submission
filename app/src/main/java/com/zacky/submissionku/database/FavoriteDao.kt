package com.zacky.submissionku.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zacky.submissionku.model.Nakama

@Dao
interface FavoriteDao {
        @Query("SELECT * FROM Nakama")
        suspend fun getFavoriteNakama(): List<Nakama>

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertFavoriteNakama(nakama: Nakama)

        @Delete
        suspend fun deleteFavoriteNakama(nakama: Nakama)

        @Query("SELECT * FROM Nakama WHERE id =:id")
        suspend fun getNakamaById(id: String): List<Nakama>

}