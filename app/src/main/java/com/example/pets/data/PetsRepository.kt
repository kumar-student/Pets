package com.example.pets.data

interface PetsRepository {
    suspend fun getPets(): NetworkResult<List<Cat>>
}