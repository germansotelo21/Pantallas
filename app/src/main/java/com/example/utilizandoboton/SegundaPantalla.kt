package com.example.utilizandoboton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)
        val boton: Button = findViewById(R.id.BtVolver)
        boton.setOnClickListener{
            onBackPressed() //vuelve a la pantalla anterior

        }
        getAndShowName()
    }

    fun getAndShowName (){
        val bundle =intent.extras
        val name =bundle?.get("INTENT_NAME")
        val fechaView = findViewById<TextView>(R.id.TvSegundaPantalla)
        fechaView.text = "Bienvenido $name"

    }
}