package mx.edu.isc.tesoem.jrl.proyectojrl7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class datosActivity extends AppCompatActivity {

    private EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        et1 = (EditText)findViewById(R.id.editTextText);
        et2 = (EditText)findViewById(R.id.editTextText3);
        et3 = (EditText)findViewById(R.id.editTextText5);
    }

    public void enviardatos(View view){
        Intent i = new Intent(this,Principal.class);
        i.putExtra("dato1", et1.getText().toString());
        i.putExtra("dato2", et2.getText().toString());
        i.putExtra("dato3", et3.getText().toString());
        startActivity(i);
    }

    public void cancelarform(View view){
        Intent cancelar = new Intent(this,Principal.class);
        startActivity(cancelar);
    }
}