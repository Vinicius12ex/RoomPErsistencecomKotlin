package br.com.fiap.roompersistencecomkotlin

import android.arch.persistence.room.*

@Dao
interface JogoDao{
    @Query("SELECT * FROM jogo")
    fun consulta(): List<Jogo>
    @Insert
    fun adicionar(jogo: Jogo)
    @Insert
    fun adicionarTodos(vararg jogo: Jogo)
    @Update
    fun atualizar(jogo: Jogo)
    @Delete
    fun apagar(jogo: Jogo)
}