package amanda.br.alcoolougasolina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicio.setOnClickListener {
            val intent:Intent = Intent(applicationContext,Formulario::class.java)
            startActivity(intent)
        }
    }
}
