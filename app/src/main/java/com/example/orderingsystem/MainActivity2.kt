package com.example.orderingsystem

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.telephony.RadioAccessSpecifier
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity2:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        /*val btn = findViewById<Button>(R.id.btn_send)
        val name = findViewById<EditText>(R.id.ed_name)
        val radio = findViewById<RadioGroup>(R.id.Rd)
        val radio2 = findViewById<RadioGroup>(R.id.Rd2)

        btn.setOnClickListener{
            if (name.text.isEmpty())
                Toast.makeText(this,"請輸入飲料名稱",Toast.LENGTH_LONG).show()
            else
            {
                //宣告Bundle
                val b = Bundle()
                //取得EditText字串內容，把資料存入Bundle
                b.putString("drink",name.text.toString())
                b.putString("sugar",radio.findViewById<RadioButton>(radio.checkedRadioButtonId).text.toString())
                b.putString("ice",radio2.findViewById<RadioButton>(radio2.checkedRadioButtonId).text.toString())
                //用Activity.RESULT_OK標記執行狀況並記錄Intent
                setResult(Activity.RESULT_OK, Intent().putExtras(b))
                finish()
            }
        }*/
    }
}