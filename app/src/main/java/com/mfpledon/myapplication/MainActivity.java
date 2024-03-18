package com.mfpledon.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = findViewById(R.id.textView);
        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "click agora no TextView", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void clickButton(View v) {
        Snackbar.make(v, "click no Button", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void clickImage(View v) {
        Toast.makeText(getApplicationContext(), "click na ImageView",Toast.LENGTH_LONG).show();
    }
}