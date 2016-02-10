package com.example.noura.testregister;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class register extends AppCompatActivity{


    Button r_submit;
    EditText r_ID, r_FullName, r_Password, r_repassword, r_email, r_reemail , r_address;
    String id, name, pass, repass, email, remail, address;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        r_ID = (EditText) findViewById(R.id.ID);
        r_FullName = (EditText) findViewById(R.id.FullName);
        if( r_FullName.getText().toString().length() == 0 ){
            r_FullName.setError( "First name is required!" );}
        r_Password = (EditText) findViewById(R.id.Password);
        r_repassword = (EditText) findViewById(R.id.repassword);
        r_email = (EditText) findViewById(R.id.email);
        r_reemail = (EditText) findViewById(R.id.reemail);
        r_address= (EditText) findViewById(R.id.address);



    }

public  void userReg(View view){

    id = r_ID.getText().toString();
    name = r_FullName.getText().toString();
    pass = r_Password.getText().toString();
    repass= r_repassword.getText().toString();
    email = r_email.getText().toString();
    remail = r_reemail.getText().toString();
     address= r_address.getText().toString();
    String method = "register";
    BackgroundTask backgroundTask = new BackgroundTask(this);
    backgroundTask.execute(method, id, name, pass, email,address);
    finish();
}

}
