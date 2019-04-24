package br.com.fiap.roompersistencecomkotlin

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Jogo::class), version=1)


    abstract class BancoDados : RoomDatabase(){
        abstract fun jogoDao():JogoDao
}