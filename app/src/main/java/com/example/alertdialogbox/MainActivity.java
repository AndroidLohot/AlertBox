package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CharSequence[] charSequence={"Java","Android"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickF(View view) {

        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

       // builder.setMessage("This is massage");
        builder.setTitle("Alert");
        builder.setIcon(R.mipmap.ic_launcher);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_LONG).show();

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this,"Cancel",Toast.LENGTH_LONG).show();

            }
        });
        builder.setMultiChoiceItems(charSequence, new boolean[charSequence.length], new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                Toast.makeText(MainActivity.this,charSequence[which]+(isChecked?"Checked":"Unchecked"),Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.show();

    }

    public void click2F(View view) {

        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);



        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
