package com.chores.dzikirapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.chores.dzikirapp.R
import com.chores.dzikirapp.ui.detail.PagiActivity
import com.chores.dzikirapp.ui.detail.PetangActivity

class DzikirPagiDanPetangActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_pagi_dan_petang)

        val rvDzikirPagi = findViewById<CardView>(R.id.rvDzikirPagi)
        rvDzikirPagi.setOnClickListener(this)
        val rvDzikirPetang = findViewById<CardView>(R.id.rvDzikirPetang)
        rvDzikirPetang.setOnClickListener(this)
        val btnDzikirPagi = findViewById<ImageButton>(R.id.btn_dzikir_pagi)
        btnDzikirPagi.setOnClickListener(this)
        val btnDzikirPetang = findViewById<ImageButton>(R.id.btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.rvDzikirPagi -> startActivity(Intent(this, PagiActivity::class.java))
            R.id.btn_dzikir_pagi -> startActivity(Intent(this, PagiActivity::class.java))
            R.id.rvDzikirPetang -> startActivity(Intent(this, PetangActivity::class.java))
            R.id.btn_dzikir_petang -> startActivity(Intent(this, PetangActivity::class.java))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
