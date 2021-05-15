package com.example.hondanaoyuki.rotateanimsampke

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // BackStackを設定
        fragmentTransaction.addToBackStack(null)

        // パラメータを設定
        fragmentTransaction.replace(R.id.container, FirstFragment())
        fragmentTransaction.commit()
    }
}