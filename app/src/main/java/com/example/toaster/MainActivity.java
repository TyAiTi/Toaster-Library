package com.example.toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.toasterlibrary.ToastActivity;
import com.example.toasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {
    private Button btnMoveLibrary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveLibrary = findViewById(R.id.btn_move_library);


        Intent intent = new Intent(this, ToastActivity.class);
//        startActivity(intent);

        btnMoveLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToasterMessage.openActivity(MainActivity.this, "Dasdasdasdasdas");
            }
        });

    }
}