package com.example.tallerdemotos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val botonIngresar: Button = findViewById(R.id.btn_ingresar)
        botonIngresar.setOnClickListener {
            val irServicios = Intent(this, ServiciosActivity::class.java)
            startActivity(irServicios)
        }
    }
}