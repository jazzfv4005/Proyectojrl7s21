package mx.edu.isc.tesoem.jrl.proyectojrl7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        tv1 = (TextView)findViewById(R.id.textView5);
        tv2 = (TextView)findViewById(R.id.textView6);
        tv3 = (TextView)findViewById(R.id.textView7);

        String dato1 = getIntent().getStringExtra("dato1");
        tv1.setText(dato1);

        String dato2 = getIntent().getStringExtra("dato2");
        tv2.setText(dato2);

        String dato3 = getIntent().getStringExtra("dato3");
        tv3.setText(dato3);

    }

    public void abrirform(View view){
        Intent form = new Intent(this,datosActivity.class);
        startActivity(form);
    }

    public void Lim(View view){
       clear();
    }

    public void clear(){
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
    }
}