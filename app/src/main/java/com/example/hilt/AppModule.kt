package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("String 1")
    fun provide() = "This is a String that will be Injected!"

    @Singleton
    @Provides
    @Named("String 2")
    fun provide2() = "This is a String that will be Injected as well!"

}