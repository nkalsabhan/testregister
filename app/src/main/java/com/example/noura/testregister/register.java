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

public class register extends AppCompatActivity implements View.OnClickListener {

    Button r_submit;
    EditText ID, FullName, Password, repassword, email, reemail, dep_id;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                                  @Override
                                                  public void onCheckedChanged(RadioGroup group, int checkedId) {
                                                      RadioButton rb = (RadioButton) group.findViewById(checkedId);
                                                      if (null != rb && checkedId > -1) {
                                                          Toast.makeText(register.this, rb.getText(), Toast.LENGTH_SHORT).show();
                                                      }

                                                  }
                                              }

        );
        ID = (EditText) findViewById(R.id.ID);
        FullName = (EditText) findViewById(R.id.FullName);
        Password = (EditText) findViewById(R.id.Password);
        repassword = (EditText) findViewById(R.id.repassword);
        email = (EditText) findViewById(R.id.email);
        reemail = (EditText) findViewById(R.id.reemail);
        dep_id = (EditText) findViewById(R.id.dep_id);
        r_submit = (Button) findViewById(R.id.r_submit);
        r_submit.setOnClickListener(this);
    }





    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.r_submit:

                int id = Integer.parseInt(ID.getText().toString());
                String name= FullName.getText().toString();
                String password= Password.getText().toString();
                String email= reemail.getText().toString();

                User registeredData= new User(id, name, password, email );

                break;
        }
    }

}
