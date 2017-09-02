package br.usjt.desmob.geodata;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.*;
import java.lang.String;

public class ListaPaises extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);

        ListView listView = (ListView) findViewById(R.id.lista_paises);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Data.getPaises());

        listView.setAdapter(adapter);
    }
}
