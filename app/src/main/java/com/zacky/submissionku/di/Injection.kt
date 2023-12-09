package com.zacky.submissionku.di

import com.zacky.submissionku.repository.NakamaRepository

object Injection {
    fun provideRepository(): NakamaRepository {
        return NakamaRepository().getInstance()
    }
}