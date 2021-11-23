package br.unip.pimivandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReservasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservas);
    }

    public void confirmacaoDeReserva(View view) {
        Intent intent = new Intent(this, ConfirmarResActivity.class);
        startActivity(intent);
    }
}