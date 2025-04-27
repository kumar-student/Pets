package com.example.pets.di

import com.example.pets.data.PetsRepository
import com.example.pets.data.PetsRepositoryImpl
import com.example.pets.viewmodel.PetsViewModel
import org.koin.dsl.module

val appModules = module {
    single<PetsRepository> { PetsRepositoryImpl() }
    single { PetsViewModel(get()) }
}