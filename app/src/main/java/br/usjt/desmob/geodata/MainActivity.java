package br.usjt.desmob.geodata;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ListarPaises(View v){
        Intent intent = new Intent(this, ListaPaises.class);

        startActivity(intent);

    }
}
