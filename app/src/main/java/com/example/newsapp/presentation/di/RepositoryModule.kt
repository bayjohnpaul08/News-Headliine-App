package com.example.newsapp.presentation.di

import com.example.newsapp.data.repository.NewRepositoryImpl
import com.example.newsapp.data.repository.dataSource.NewsRemoteDataSource
import com.example.newsapp.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(newsRemoteDataSource: NewsRemoteDataSource): NewsRepository {
        return NewRepositoryImpl(newsRemoteDataSource)
    }
}