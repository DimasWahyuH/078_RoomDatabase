package com.example.a078_roomdatabase.viewmodel.provider

import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a078_roomdatabase.repositori.AplikasiSiswa
import com.example.a078_roomdatabase.viewmodel.EntryViewModel
import com.example.a078_roomdatabase.viewmodel.HomeViewModel
import androidx.lifecycle.ViewModelProvider

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
    }
}
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory
        .APPLICATION_KEY] as AplikasiSiswa)