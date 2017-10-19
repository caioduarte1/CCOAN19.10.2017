package br.usjt.arqdsis.ccoan19102017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text;
    public static final String CHAVE = "package br.usjt.arqdsis.ccoan19102017";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.buscar_clientes);
    }

    public void buscarCliente(View view) {

        Intent intent = new Intent(this, ListarClienteActivity.class);
        String texto = text.getText().toString();
        intent.putExtra(CHAVE, texto);
        startActivity(intent);
    }
}
