package br.edu.fatepg.livros

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val valautor = intent.getStringExtra("nomeAutor")
        val vallivro = intent.getStringExtra("NomeLivro")
        val btn = findViewById<Button>(R.id.voltar)

        btn.setOnClickListener{
            finish()
        }

        Toast.makeText(this, "Nome do Autor: $valautor", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "Nome do Livro: $vallivro", Toast.LENGTH_SHORT).show()
        }
    }