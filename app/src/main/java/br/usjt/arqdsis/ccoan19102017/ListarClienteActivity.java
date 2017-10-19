package br.usjt.arqdsis.ccoan19102017;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarClienteActivity extends Activity {


    ArrayList<String> cliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_cliente);
        Intent intent = getIntent();
        String chave = (String)intent.getStringExtra(MainActivity.CHAVE);
        cliente = Data.buscaClientes(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  cliente);
        ListView listView = (ListView)findViewById(R.id.lista_clientes);
        listView.setAdapter(adapter);
    }
}
