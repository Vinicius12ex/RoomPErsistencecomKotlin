package br.com.fiap.roompersistencecomkotlin

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity

class Jogo (@PrimaryKey(autoGenerate = true) var id: Int = 0, @ColumnInfo (name = "campo_nome") var nome: String, @ColumnInfo var Plataforma: String) {


}