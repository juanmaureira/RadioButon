package cl.maureira.radiobuton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView tv1;
    private RadioButton rb1, rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.txtValor1);
        editText2 = (EditText)findViewById(R.id.txtValor2);
        tv1 = (TextView)findViewById(R.id.tvResultado);
        rb1 = (RadioButton)findViewById(R.id.rbSumar);
        rb2 = (RadioButton)findViewById(R.id.rbRestar);
    }

    public void calcular(View view){
        String strValor1 = editText1.getText().toString();
        String strValor2 = editText2.getText().toString();

        int intValor1 = Integer.parseInt(strValor1);
        int intValor2 = Integer.parseInt(strValor2);

        if(rb1.isChecked() == true){
            int suma = intValor1 + intValor2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if(rb2.isChecked() == true){
            int resta = intValor1 - intValor2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else{
            Toast.makeText(this, "No ha seleccionado operacion", Toast.LENGTH_LONG).show();
        }

    }

}