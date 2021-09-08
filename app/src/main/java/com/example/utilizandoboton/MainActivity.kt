package com.example.utilizandoboton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton:Button = findViewById(R.id.BtHola)
        val fechaView = findViewById<EditText>(R.id.TvNombre)
        val valor = fechaView.text

        boton.setOnClickListener{
            checkValue2 (valor)
        }



    }

    fun checkValue (){
        Toast.makeText(this,"nombre de usuario", Toast.LENGTH_LONG).show()
    }

    fun checkValue2 (fecha: Editable){
        if (fecha.isNotEmpty()){
            val intent = Intent(this, SegundaPantalla::class.java)
            intent.putExtra("INTENT_NAME", fecha)
            startActivity(intent)//lanzar la actividad

        }else{
            Toast.makeText(this,"nombre de usuario", Toast.LENGTH_LONG).show()
        }

    }
}