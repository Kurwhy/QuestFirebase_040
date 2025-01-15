package com.example.praktikum_pertemuan14.ui.home.navigation

interface DestinasiNavigasi {
    val route: String
    val titleRes: String
}

object DestinasiHome : DestinasiNavigasi {
    override val route: String = "home"
    override val titleRes: String = "Home"
}

object DestinasiInsert : DestinasiNavigasi {
    override val route: String = "insert"
    override val titleRes: String = "Insert"
}

object DestinasiDetail : DestinasiNavigasi {
    override val route: String = "detail"
    const val NIM = "nim"
    val routeWithArg = "$route/{$NIM}"
    override val titleRes: String = "Detail"
}