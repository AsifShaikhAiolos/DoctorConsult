package com.twilio.video.app
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
        var signUp: TextView? = null
        var btn_Login: Button? = null
        signUp = findViewById<TextView>(R.id.id_singup)
        btn_Login = findViewById<Button>(R.id.btn_login)



        signUp.setOnClickListener(View.OnClickListener {
            val intSignup = Intent(this, RegisterActivity::class.java)
            startActivity(intSignup)
        })



//        btn_Login.setOnClickListener(View.OnClickListener {
//            val intMain = Intent(this, BookingAppoinment::class.java)
//            startActivity(intMain)
//        })
    }
}