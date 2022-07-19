package com.emakovsky.baloosha.di

import android.content.Context
import android.content.SharedPreferences
import org.koin.android.ext.koin.androidApplication
import org.koin.core.qualifier.named
import org.koin.dsl.module

const val GLOBAL_PREFERENCES = "GLOBAL_PREFERENCES"
private const val BALOOSHA_PREFERENCES = "BALOOSHA_PREFERENCES"

val applicationModule = module {

    single<SharedPreferences>(named(GLOBAL_PREFERENCES)) {
        androidApplication().getSharedPreferences(
            BALOOSHA_PREFERENCES,
            Context.MODE_PRIVATE
        )
    }
}