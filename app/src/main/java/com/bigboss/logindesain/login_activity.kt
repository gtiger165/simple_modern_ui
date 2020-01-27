package com.bigboss.logindesain

import android.os.Bundle
import android.view.View.OnTouchListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_login.*


class login_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        et_username.setOnTouchListener { v, event ->

            mail.setImageResource(R.drawable.mail_click)
            password.setImageResource(R.drawable.password_notclick)

            false
        }

        et_pass.setOnTouchListener { v, event ->

            mail.setImageResource(R.drawable.mail_notclick)
            password.setImageResource(R.drawable.password_click)

            false
        }
    }
}