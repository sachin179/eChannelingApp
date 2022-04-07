package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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