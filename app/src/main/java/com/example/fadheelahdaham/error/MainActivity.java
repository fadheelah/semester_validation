package com.example.fadheelahdaham.error;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity implements TextWatcher {
    EditText myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = (EditText) findViewById(R.id.editText);
        myText.addTextChangedListener(this);

    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
 //       Toast.makeText(this, "before change ", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int start, int i2, int i3) {
//        Toast.makeText(this, "on text change", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void afterTextChanged(Editable editable) {
        try {
            int no = Integer.parseInt(editable.toString());
            if (no > 6) {
                editable.replace(0, editable.length(), "6");
            }
        } catch (NumberFormatException e) {}
    }
}