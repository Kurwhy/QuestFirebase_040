package com.example.praktikum_pertemuan14.ui.home.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum_pertemuan14.model.Mahasiswa


@Composable
fun ItemDetailMhs(
    modifier: Modifier = Modifier,
    mahasiswa: Mahasiswa
){
    Card(
        modifier = modifier.fillMaxWidth().padding(top = 20.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)
        ) {
            ComponentDetailMhs(judul = "NIM", isinya = mahasiswa.nim)
            Spacer(modifier = Modifier.padding(5.dp))
            ComponentDetailMhs(judul = "Nama", isinya = mahasiswa.nama)
            Spacer(modifier = Modifier.padding(5.dp))
            ComponentDetailMhs(judul = "Alamat", isinya = mahasiswa.alamat)
            Spacer(modifier = Modifier.padding(5.dp))
            ComponentDetailMhs(judul = "Jenis Kelamin", isinya = mahasiswa.jenisKelamin)
            Spacer(modifier = Modifier.padding(5.dp))
            ComponentDetailMhs(judul = "Kelas", isinya = mahasiswa.kelas)
            Spacer(modifier = Modifier.padding(5.dp))
            ComponentDetailMhs(judul = "Angkatan", isinya = mahasiswa.angkatan)
            Spacer(modifier = Modifier.padding(5.dp))
            ComponentDetailMhs(judul = "Judul Skripsi", isinya = mahasiswa.judulSkripsi)
            Spacer(modifier = Modifier.padding(5.dp))
            ComponentDetailMhs(judul = "Dosen Pembimbing 1", isinya = mahasiswa.dospemSatu)
            Spacer(modifier = Modifier.padding(5.dp))
            ComponentDetailMhs(judul = "Dosen Pembimbing 2", isinya = mahasiswa.dospemDua)
        }
    }
}

@Composable
fun ComponentDetailMhs(
    modifier: Modifier = Modifier,
    judul: String,
    isinya: String,
){
    Column(modifier =modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start)
    {
        Text(
            text = "$judul : ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray
        )
        Text(
            text = isinya,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}