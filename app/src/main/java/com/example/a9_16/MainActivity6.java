package com.example.a9_16;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity implements View.OnCreateContextMenuListener {
    Button button;
    EditText edit;
    ImageView Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        button = (Button)findViewById(R.id.button);
        registerForContextMenu(button);

        Image = (ImageView)findViewById(R.id.imageView2);

        edit = (EditText)findViewById(R.id.editText);
        edit.setOnCreateContextMenuListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu, menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.sub1) {
            Toast.makeText(this, "xml Sub1 selected", Toast.LENGTH_SHORT).show();
            //return true;
        }
        if (id == R.id.sub2) {
            Toast.makeText(this, "xml Sub2 selected", Toast.LENGTH_SHORT).show();
        }

        if (id == 3) {
            Toast.makeText(this, "java Sub-1 selected", Toast.LENGTH_SHORT).show();
        }

        if (id == 4) {
            Toast.makeText(this, "java Sub-2 selected", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v == button) {
            menu.setHeaderTitle("Button Menu");
            menu.add(0, 1, 0, "aey");
            menu.add(0, 2, 0, "cat");
        }
        if (v == edit) {
            menu.add(0, 4, 0, "Manual");
            menu.add(0, 5, 0, "Auto");
        }
    }

    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Image.setImageResource(R.drawable.aey);
                return true;
            case 2:
                Image.setImageResource(R.drawable.cat);
                return true;
            case 4:
                Toast.makeText(this, "Translation completed", Toast.LENGTH_SHORT).show();
                return true;
            case 5:
                Toast.makeText(this, "Auto Translated", Toast.LENGTH_SHORT).show();

                new AlertDialog.Builder(this)
                        .setTitle("Selected Item is")
                        .setMessage("Auto Translation")
                        .setNeutralButton("close", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int s) {
                                // default (close)
                            }
                        })
                        .show();
                return true;
        }
        return true;
    }
}
