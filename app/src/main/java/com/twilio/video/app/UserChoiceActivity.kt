 package com.twilio.video.app
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

 class UserChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_choice)

        var btn_reg: Button? = null
        var txtLogin: TextView? = null
        btn_reg = findViewById<Button>(R.id.btn_signup)
        txtLogin = findViewById<TextView>(R.id.id_txtlogin)

//        btn_reg.setOnClickListener(View.OnClickListener {
//            val intMain = Intent(this, BookingAppoinment::class.java)
//            startActivity(intMain)
//        })

        txtLogin.setOnClickListener(View.OnClickListener {
            val intLogin = Intent(this, UserLoginActivity::class.java)
            startActivity(intLogin)
        })
    }
}