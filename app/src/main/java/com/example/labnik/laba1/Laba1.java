package com.example.labnik.laba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.labnik.R;
import com.example.labnik.laba1.users.User;

import java.util.ArrayList;
import java.util.Objects;

public class Laba1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceBook) {
        super.onCreate(savedInstanceBook);
        setContentView(R.layout.activity_laba1);
        String[] logins = getResources().getStringArray(R.array.logins);
        String[] passwords = getResources().getStringArray(R.array.passwords);
        ArrayList<User> users = User.get(logins,passwords);
        Button login = findViewById(R.id.button_laba1);
        EditText email = findViewById(R.id.laba1_name);
        EditText pass = findViewById(R.id.laba1_password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean lg = false, ps = false;
                String s_login=null;
                for(User a: users){
                    if(Objects.equals(a.getLogin(), email.getText().toString())){
                        lg = true;
                        s_login = email.getText().toString();
                        break;
                    }
                }
                if(lg){
                    for(User a: users){
                        if(Objects.equals(a.getPassword(), pass.getText().toString())&&Objects.equals(a.getLogin(),s_login)){
                            ps = true;
                        }
                    }
                    if(!ps){
                        Toast.makeText(Laba1.this, "Неверный пароль", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(Laba1.this, "Неверный логин", Toast.LENGTH_SHORT).show();
                }
                if(lg && ps){
                    Intent intent = new Intent(Laba1.this, Laba1Result.class);
                    startActivity(intent);
                }
            }
        });
    }
}