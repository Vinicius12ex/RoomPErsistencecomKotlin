package br.com.fiap.roompersistencecomkotlin

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update

interface JogoDao{
    @Query("SELECT * FROM jogo")
    fun consulta(): List<Jogo>
    @Insert
    fun adicionar(jogo: Jogo)
    fun adicionarTodos(vararg jogo: Jogo)
    @Update
    fun atualizar(jogo: Jogo)
    @Delete
    fun apagar(jogo: Jogo)
}