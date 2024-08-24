package br.edu.fatepg.livros

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autor = findViewById<EditText>(R.id.edt_autor)
        val livro = findViewById<EditText>(R.id.edt_livro)
        val fab = findViewById<FloatingActionButton>(R.id.btn_enviar)

        fab.setOnClickListener{
            val valautor = autor.text.toString()
            val vallivro = livro.text.toString()
            val intent = Intent(this, Resultado::class.java)

            intent.putExtra("nomeAutor", valautor)
            intent.putExtra("NomeLivro", vallivro)
            startActivity(intent)
        }


    }
}
