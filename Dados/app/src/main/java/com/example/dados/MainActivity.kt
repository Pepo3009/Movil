package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.button)
        boton.setOnClickListener(){
            girarDados()
        }
    }
    fun girarDados (){
        val miDado = Dado(lados = 6)
        val resultado = miDado.girar()
        otraimagen(resultado)
    }
     fun otraimagen (resultado: Int){
        val imagenDado: ImageView = findViewById(R.id.imageView)
        val nuevaImagen = when (resultado){
            1 -> R.drawable.cara_uno
            2 -> R.drawable.cara_dos
            3 -> R.drawable.cara_tres
            4 -> R.drawable.cara_cuatro
            5 -> R.drawable.cara_cinco
            else -> R.drawable.cara_seis
        }
        imagenDado.setImageResource(nuevaImagen)
    }
}
class Dado (val lados: Int){
    fun girar():Int{
        return (1..lados).random()
    }
}