package mx.tecnm.cdhidalgo.e301b_

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var texto:TextView
    private lateinit var campoTxt:EditText
    private lateinit var btnSaludar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        texto = findViewById(R.id.txt3)
        campoTxt = findViewById(R.id.edit01)
        btnSaludar = findViewById(R.id.saludar)

        texto.text=""

        btnSaludar.setOnClickListener{
            texto.text = "Hola ${campoTxt.text}\nYa eres parte del #TeamSistemas"
        }
    }
}