package com.example.pertemuan12.modeldata

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DataSiswa(
    val id: Int = 0,
    @SerialName("Nama")
    val nama: String,
    @SerialName("Alamat")
    val alamat: String,
    val telpon: String
)