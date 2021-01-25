package com.example.orderingsystem

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn_choice);
        btn.setOnClickListener{
            //透過Intent切換至Main2Activity並傳遞requestCode來記錄發出者
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val txt_drink = findViewById<TextView>(R.id.txt_drink)
        val txt_ice = findViewById<TextView>(R.id.txt_ice)
        val txt_sugar = findViewById<TextView>(R.id.txt_sugar)

        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if (requestCode == 1 && resultCode == Activity.RESULT_OK){
                //讀取Bundle資料
                txt_drink.text = "飲料：${it.getString("drink")}"
                txt_ice.text = "冰塊：${it.getString("ice")}"
                txt_sugar.text = "甜度：${it.getString("sugar")}"
            }
        }
    }
}