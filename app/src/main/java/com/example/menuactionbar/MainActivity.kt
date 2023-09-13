package com.example.menuactionbar
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnmenu :Button = findViewById(R.id.btn1)
        btnmenu.setOnClickListener(viewlistener)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }
    fun enviarmenu() {
        val intent = Intent(this, menu.menu1::class.java)
        startActivity(intent)
    }

    private val viewlistener = View.OnClickListener {
        when(it.id){
            R.id.btn1->enviarmenu()
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.uno -> {
                // Agrega aquí la lógica para la opción "Configuración"
                return true
            }
            R.id.dos -> {
                // Agrega aquí la lógica para la opción "Acerca de"
                return true
            }
            R.id.tres -> {
                // Agrega aquí la lógica para la opción "Configuración"
                return true
            }
            R.id.cuatro -> {
                // Agrega aquí la lógica para la opción "Configuración"
                return true
            }
            R.id.cuatro -> {
                // Agrega aquí la lógica para la opción "Configuración"
                return true
            }
            R.id.cinco -> {
                // Agrega aquí la lógica para la opción "Configuración"
                return true
            }
            R.id.seis -> {
                // Agrega aquí la lógica para la opción "Configuración"
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}

