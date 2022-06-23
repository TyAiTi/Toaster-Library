package com.example.toasterlibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ToasterMessage {

    public static void s  (Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }

    public static void openActivity(Context c, String message){
        Intent intent = new Intent(c, ToastActivity.class);
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        c.startActivity(intent);
    }
}
