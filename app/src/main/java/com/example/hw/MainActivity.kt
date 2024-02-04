package com.example.hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hw.databinding.ActivityMainBinding
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val user_name = binding.usernameInput.text.toString()
            val sur_name = binding.surInput.text.toString()
            val age = binding.birthInput.text.toString()
            val login11 = binding.logInput.text.toString()


            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("Name", user_name)
            startActivity(intent)


            val intent1 = Intent(this, MainActivity2::class.java)
            intent.putExtra("Surname", sur_name)
            startActivity(intent)

            val intent2 = Intent(this, MainActivity2::class.java)
            intent.putExtra("Age", age )
            startActivity(intent)

            val intent3 = Intent(this, MainActivity2::class.java)
            intent.putExtra("Login2", login11)
            startActivity(intent)


        }


    }







}

