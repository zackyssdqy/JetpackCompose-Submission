package com.zacky.submissionku.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zacky.submissionku.model.Nakama


@Database(entities = [Nakama::class], version = 1, exportSchema = false)
abstract class FavoriteDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao
}