package com.example.examtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Sign_In_Activity : AppCompatActivity() {

    lateinit var mail: EditText
    lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        mail = findViewById(R.id.textName)
        pass = findViewById(R.id.textPass)
    }

    fun Next(view: View)
    {
        if (mail.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()){
        val intent = Intent(this@Sign_In_Activity, Main_Activity::class.java)
        startActivity(intent)
        Toast.makeText(this, "Добро пожаловать!", Toast.LENGTH_SHORT).show()
        finish()}

        else
        {
            Toast.makeText(this, "Ведите хоть пару символов! В пустые строки !!!", Toast.LENGTH_SHORT).show()
        }
    }

    fun Reg(view: View)
    {
        Toast.makeText(this, "Усп... Кнопка в разработке!", Toast.LENGTH_SHORT).show()
    }
}