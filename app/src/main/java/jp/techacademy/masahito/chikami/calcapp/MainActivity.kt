package jp.techacademy.masahito.chikami.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.icu.number.IntegerWidth
import android.text.Editable
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.*

class  MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        val intent = Intent(this, SecondActivity::class.java)

        if (editText1.text.isNotEmpty() && editText2.text.isNotEmpty()) {
            val value1: Double = editText1.text.toString().toDouble()
            val value2: Double = editText2.text.toString().toDouble()
            if(v?.id == R.id.button1) {
                intent.putExtra("RESULT1", value1 + value2)
            }else if (v?.id == R.id.button2){
                intent.putExtra("RESULT1", value1 - value2)
            }else if (v?.id == R.id.button3){
                intent.putExtra("RESULT1", value1 * value2)
            }else if (v?.id == R.id.button4){
                intent.putExtra("RESULT1", value1 / value2)
            }
        }

        startActivity(intent)

    }
}