package kr.ac.kopo.buttonevent0314

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnHome: Button
    lateinit var btn911: Button
    lateinit var btnGallery: Button
    lateinit var btnFinish: Button
    lateinit var btnUniversity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHome = findViewById(R.id.buttonHome)
        btn911 = findViewById(R.id.button911)
        btnGallery = findViewById(R.id.buttonGallery)
        btnUniversity = findViewById(R.id.buttonUniversity)
        btnFinish = findViewById(R.id.buttonFinish)

        btn911.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"))
            startActivity(intent)
        }

        btnGallery.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(intent)
        }

        btnFinish.setOnClickListener { finish() }

        btnUniversity.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kopo.ac.kr/jungsu/content.do?menu=233"))
            startActivity(intent)
        }

        btnHome.setOnClickListener {
            Toast.makeText(applicationContext, "폰 끄고 공부하세요.", Toast.LENGTH_SHORT).show()
        }   // maketext 토스트 객체를 만드는 키워드 세개로 참조값 반환. 코틀린은 세미클론을 쓸 수도 있고 생략할 수도 있다.

    }
}





