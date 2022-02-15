package latihan.ppb.uasppbsiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgPindahMenu1: ImageView = findViewById(R.id.menu1)
        imgPindahMenu1.setOnClickListener(this)
        val imgPindahMenu2: ImageView = findViewById(R.id.menu2)
        imgPindahMenu2.setOnClickListener(this)
        val imgPindahMenu3: ImageView = findViewById(R.id.menu3)
        imgPindahMenu3.setOnClickListener(this)
        val imgPindahMenu4: ImageView = findViewById(R.id.menu4)
        imgPindahMenu4.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id) {
            R.id.menu1-> {
                val PindahMenu1 = Intent(this, menu1::class.java)
                startActivity(PindahMenu1)
            }
        }
        when(v.id) {
            R.id.menu2-> {
                val PindahMenu2 = Intent(this, MenuActivity2::class.java)
                startActivity(PindahMenu2)
            }
        }
        when(v.id) {
            R.id.menu3-> {
                val PindahMenu3 = Intent(this, MenuActivity3::class.java)
                startActivity(PindahMenu3)
            }
        }
        when(v.id) {
            R.id.menu4-> {
                val PindahMenu4 = Intent(this, MenuActivity4::class.java)
                startActivity(PindahMenu4)
            }
        }
    }
}