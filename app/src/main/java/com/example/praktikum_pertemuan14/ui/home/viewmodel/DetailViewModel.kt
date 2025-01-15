package com.example.praktikum_pertemuan14.ui.home.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.praktikum_pertemuan14.model.Mahasiswa
import com.example.praktikum_pertemuan14.repository.RepositoryMhs
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class DetailViewModel (
    private val repositoryMhs: RepositoryMhs
) : ViewModel() {
    var mhsUiState: DetailUiState by mutableStateOf(DetailUiState.Loading)
        private set

    init {
        getMhs()
    }

    fun getMhs() {
        viewModelScope.launch {
            repositoryMhs.getAllMhs()
                .onStart {
                    mhsUiState = DetailUiState.Loading
                }
                .catch {
                    mhsUiState = DetailUiState.Error(e = it)
                }
                .collect{
                    mhsUiState = if (it.isEmpty()) {
                        DetailUiState.Error(Exception("Belum ada adata mahasiswa"))
                    } else {
                        DetailUiState.Success(it)
                    }
                }
        }
    }
}

sealed class DetailUiState {
    object Loading : DetailUiState()

    data class Success(val data: List<Mahasiswa>) : DetailUiState()
    data class Error(val e: Throwable) : DetailUiState()
}

fun Mahasiswa.toDetailUiEvent() : MahasiswaEvent {
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan,
        judulSkripsi = judulSkripsi,
        dospemSatu = dospemSatu,
        dospemDua = dospemDua
    )
}