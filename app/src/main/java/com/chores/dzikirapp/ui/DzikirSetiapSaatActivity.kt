package com.chores.dzikirapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chores.dzikirapp.R
import com.chores.dzikirapp.adapter.DzikirDoaAdapter
import com.chores.dzikirapp.model.DataDzikirDoa
import com.chores.dzikirapp.model.DzikirDoa

class DzikirSetiapSaatActivity : AppCompatActivity() {
    private lateinit var rvDzikir: RecyclerView

    private var listDzikir: ArrayList<DzikirDoa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_setaip_saat)
        rvDzikir = findViewById(R.id.tvDzikirSetiapSaat)

        listDzikir.clear()
        listDzikir.addAll(DataDzikirDoa.listDzikir)

        rvDzikir.layoutManager = LinearLayoutManager(this)
        rvDzikir.adapter = DzikirDoaAdapter(listDzikir)
        rvDzikir.setHasFixedSize(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}