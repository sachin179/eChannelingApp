package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private FirebaseAuth mAuth;
    private EditText rFullName,rPassword,editTextTextPassword2,rollSpin,editTextPhone;
    private TextView button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar();

        final EditText rFullName = findViewById(R.id.rFullName);
        final EditText rPassword = findViewById(R.id.rPassword);
        final EditText cPassword = findViewById(R.id.cPassword);
        final Spinner rollSpin = findViewById(R.id.rollSpin);
        final EditText rphonenu = findViewById(R.id.rphonenu);

        final Button rbutton1 = findViewById(R.id.rbutton1);

        rbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get data from eidttext into string variable
                final String rFullNametxt = rFullName.getText().toString();
                final String rPasswordtxt = rPassword.getText().toString();
                final String cPasswordtxt = cPassword.getText().toString();
                final String rollSpintxt = rphonenu.getText().toString();
                final String rphonenutxt = rphonenu.getText().toString();

                //check if user fill all the field befor sending data to firebase
                if(rFullNametxt.isEmpty() || rPasswordtxt.isEmpty() || cPasswordtxt.isEmpty() || rollSpintxt.isEmpty() || rphonenutxt.isEmpty()){

                    Toast.makeText(MainActivity2.this,"pleace all the field")
                }
            }
        });


        setContentView(R.layout.activity_main2);
        mAuth = FirebaseAuth.getInstance();





        Spinner spinner = findViewById(R.id.rollSpin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.position, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {

    }
}