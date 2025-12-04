package com.example.a078_roomdatabase.view.route

import com.example.a078_roomdatabase.R

object DestinasiEditSiswa: DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}