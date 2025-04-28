package com.example.pets.data

interface PetsRepository {
    fun getPets(): List<Pet>
}