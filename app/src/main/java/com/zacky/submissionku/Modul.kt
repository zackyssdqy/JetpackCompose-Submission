package com.zacky.submissionku

import android.content.Context
import androidx.room.Room
import com.zacky.submissionku.database.FavoriteDao
import com.zacky.submissionku.database.FavoriteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class Module {
    @Provides
    fun provideFavoriteTroopRoomDatabase(
        @ApplicationContext context: Context
    ): FavoriteDatabase {
        return Room.databaseBuilder(
            context, FavoriteDatabase::class.java, "favorite_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideFavoriteTroopDao(
        favoriteTroopRoomDatabase: FavoriteDatabase
    ): FavoriteDao {
        return favoriteTroopRoomDatabase.favoriteDao()
    }
}
