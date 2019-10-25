package com.example.numbers.repository

import com.example.numbers.api.NumbersApi
import com.example.numbers.api.NumbersApiService

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()

}