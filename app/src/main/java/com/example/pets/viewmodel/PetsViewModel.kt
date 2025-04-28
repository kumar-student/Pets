package com.example.pets.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pets.data.PetsRepository

class PetsViewModel(
    private val petsRepository: PetsRepository
): ViewModel() {
    fun getPets() = petsRepository.getPets()
}