package mx.itson.edu.e1lunaraul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val btn5: Button = findViewById(R.id.btn5)
    val btn10: Button = findViewById(R.id.btn10)
    val btn15: Button = findViewById(R.id.btn15)
    val btn20: Button = findViewById(R.id.btn20)
    val btn25: Button = findViewById(R.id.btn25)
    val btn50: Button = findViewById(R.id.btn50)
    val btnTip: Button = findViewById(R.id.btnTip)
    val btnDiscount: Button = findViewById(R.id.btnDiscount)
    var originalPrice: TextView = findViewById(R.id.ptOriginalPrice)
    val txtPercentage: TextView = findViewById(R.id.percentage)
    val txtTotal: TextView = findViewById(R.id.total)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var percentage: Double
        var total: Double

        btn5.setOnClickListener {
           
        }
        btn10.setOnClickListener {

        }
        btn15.setOnClickListener {

        }
        btn20.setOnClickListener {

        }
        btn25.setOnClickListener {

        }
        btn50.setOnClickListener {

        }
        btnTip.setOnClickListener {

        }
        btnDiscount.setOnClickListener {

        }





    }


}