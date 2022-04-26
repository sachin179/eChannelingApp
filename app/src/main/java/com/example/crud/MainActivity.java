package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private TextView RegisterLink_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userName = findViewById(R.id.userName);
        final EditText rlPassword = findViewById(R.id.rlPassword);
        final Button lbutton = findViewById(R.id.lbutton);
        final TextView RegisterLinktxt = findViewById(R.id.RegisterLink_2);

        lbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String userNametxt = userName.getText().toString();
                final String passwordtext = rlPassword.getText().toString();

                if (userNametxt.isEmpty() || passwordtext.isEmpty()){
                    Toast.makeText(MainActivity.this, "pleace enter your mobile or password", Toast.LENGTH_SHORT).show();
                }else {

                }

            }

        });

        RegisterLinktxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        // final EditText edit_name = findViewById(R.id.edit_name);
        //  final EditText edit_position = findViewById(R.id.edit_position);
        //   Button btn = findViewById(R.id.btn_submit);
        //  DAOEmployee dao = new DAOEmployee();
        //   btn.setOnClickListener(view ->

        {
            /*Employee emp = new Employee(edit_name.getText().toString(),edit_position.getText().toString());
            dao.add(emp).addOnSuccessListener(suc->
            {
                Toast.makeText(this, "Record is insert", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this, "Record is not added", Toast.LENGTH_SHORT).show();
            });
            HashMap<String,Object> hashMap = new HashMap<>();
            hashMap.put("name",edit_name.getText().toString());
            hashMap.put("position",edit_position.getText().toString());
            dao.update("-Mx_5TEu2OWSpQY02XYz",hashMap).addOnSuccessListener(suc->
            {
                Toast.makeText(this, "Record is update", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this, "Record is not added", Toast.LENGTH_SHORT).show();
            });*/


         /*   dao.Remove("-Mx_5TEu2OWSpQY02XYz").addOnSuccessListener(suc->
            {
                Toast.makeText(this, "Record is remove", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this, "Record is not added", Toast.LENGTH_SHORT).show();
            });
        });*/

        }
    }
}