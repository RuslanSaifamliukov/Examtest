package com.example.examtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Main_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val poster_res: RecyclerView =findViewById((R.id.rec_view))
        poster_res.adapter = Poster_adapter(this, PosterList().list)
    }

    fun GoFinish(view: View)
    {
        val intent = Intent(this@Main_Activity, Finnish_Activity::class.java)
        startActivity(intent)
        finish()
    }
}