package amanda.br.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_formulario.*

class Formulario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
        resultado.visibility = View.INVISIBLE;

    }

    fun btnCalcular(view: View) {
        /*val precoAlcool = pAlcool.text.toString()
        val precoGasolina = pGasolina.text.toString()
        val kmGasolina = kmGasolina.text.toString()
        val kmAlcool = kmAlcool.text.toString()*/
        val precoAlcool = pAlcool.text.toString()
        val precoGasolina = pGasolina.text.toString()
        val kmGasolina = kmGasolina.text.toString()
        val kmAlcool = kmAlcool.text.toString()
        calcularMelhorPreco(precoAlcool, precoGasolina,kmAlcool, kmGasolina)
    }

    fun calcularMelhorPreco(precoAcool: String, precoGasolina: String,alcool : String, gasolina: String) {
        val valorAlcool = precoAcool.toDouble()
        val valorGasolina = precoGasolina.toDouble()
        val kmAlcool = alcool.toDouble()
        val kmGasolina = gasolina.toDouble()
        val custoBenGasolina = valorGasolina/kmGasolina
        val custoBenAlcool = valorAlcool/kmAlcool
        if (custoBenAlcool > custoBenGasolina) {
            resultado.setText("Melhor Utilizar Gasolina!")
        } else if(custoBenAlcool == custoBenGasolina) {
            resultado.setText("Os dois estão com o mesmo custo benefício!")
        }else{
            resultado.setText("Melhor Utilizar Álcool!")
        }
        resultado.visibility = View.VISIBLE;
    }
}
