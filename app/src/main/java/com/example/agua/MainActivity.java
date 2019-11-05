package com.example.agua;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    agua proceso;
    EditText metros;
    EditText agua;
    EditText aseo;
    EditText locales;
    EditText local1;
    EditText local2;
    EditText local3;
    EditText local4;
    TextView local_1;
    TextView local_2;
    TextView local_3;
    TextView local_4;
    TextView Aseo;
    Button calcular;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        proceso = new agua();
        metros = (EditText) findViewById(R.id.metros);
        agua = (EditText) findViewById(R.id.Agua);
        aseo = (EditText) findViewById(R.id.Aseo);
        local1 = (EditText) findViewById(R.id.local1);
        local2 = (EditText) findViewById(R.id.local2);
        local3 = (EditText) findViewById(R.id.local3);
        local4 = (EditText) findViewById(R.id.local4);
        local_1 = (TextView) findViewById(R.id.tex_local1);
        local_2 = (TextView) findViewById(R.id.tex_local2);
        local_3 = (TextView) findViewById(R.id.tex_local3);
        local_4 = (TextView) findViewById(R.id.tex_local4);
        Aseo = (TextView) findViewById(R.id.Aseo_va);
        calcular = (Button) findViewById(R.id.Boton);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerDatos();
                local_1.setText(String.valueOf(proceso.calcu1()));
                local_2.setText(String.valueOf(proceso.calcu2()));
                local_3.setText(String.valueOf(proceso.calcu3()));
                local_4.setText(String.valueOf(proceso.calcu4()));
                Aseo.setText(String.valueOf(proceso.aguaresul()));
            }
        });



        }
    private void obtenerDatos(){
        proceso.setMetros(Integer.parseInt(metros.getText().toString()));
        proceso.setAgua(Integer.parseInt(agua.getText().toString()));
        proceso.setAseo(Integer.parseInt(aseo.getText().toString()));
        proceso.setLocal1(Integer.parseInt(local1.getText().toString()));
        proceso.setLocal2(Integer.parseInt(local2.getText().toString()));
        proceso.setLocal3(Integer.parseInt(local3.getText().toString()));
        proceso.setLocal4(Integer.parseInt(local4.getText().toString()));


    }
    }

