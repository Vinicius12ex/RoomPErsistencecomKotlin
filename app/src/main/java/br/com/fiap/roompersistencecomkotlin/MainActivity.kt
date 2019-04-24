package br.com.fiap.roompersistencecomkotlin

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var Salvar : Button
    lateinit var Nome : EditText
    lateinit var Plataforma : EditText

    lateinit var db: BancoDados

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        db = Room.databaseBuilder(applicationContext, BancoDados::class.java, "meuAplicativo").allowMainThreadQueries().build()

        var jogo = Jogo(0,"Halo","Xbox")
        db.jogoDao().adicionar(jogo)

        var jogos = db.jogoDao().consulta()

        Salvar = findViewById(R.id.salvar)
        Nome = findViewById(R.id.Nome)
        Plataforma = findViewById(R.id.Plataforma)


    }
}
