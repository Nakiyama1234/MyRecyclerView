package com.naufal.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvHero: RecyclerView
    private val list = ArrayList<Hero>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHero = findViewById(R.id.rv_heros)
        rvHero.setHasFixedSize(true)

        list.add(getListHeroes())
        showRecyclerList()
    }

    private fun getListHeroes(): ArrayList<Hero>{
        val dataName =
    }
}