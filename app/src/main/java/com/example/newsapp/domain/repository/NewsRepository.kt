package com.example.newsapp.domain.repository

import com.example.newsapp.data.model.APIResponse
import com.example.newsapp.data.model.Article
import com.example.newsapp.data.util.Resource
import kotlinx.coroutines.flow.Flow

/**
*  Repository that communicate to local database and remote database
* */
interface NewsRepository {

    suspend fun getNewsHeadline(country: String, page: Int): Resource<APIResponse> // get news to remote database
    suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse> // search news to remote database
    suspend fun saveNews(article: Article) // save news to local database
    suspend fun deleteNews(article: Article) // delete new to local database
    fun getSavesNews(): Flow<List<Article>> // get saved new to local database
}