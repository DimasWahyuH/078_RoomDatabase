package com.example.a078_roomdatabase.repositori

import com.example.a078_roomdatabase.room.Siswa
import com.example.a078_roomdatabase.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>

    suspend fun insertSiswa(siswa: Siswa)

}

