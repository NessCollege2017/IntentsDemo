package ness.edu.intentsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_USER_NAME = "theUserName";
    public static  String ss = "theUserName";

    private EditText etUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSave).setOnClickListener(this);
        etUserName = (EditText) findViewById(R.id.etUserName);
    }

    @Override
    public void onClick(View v) {
        Person p = new Person(etUserName.getText().toString());
        //Context
        //if (v.getId() == R.id.btnSave){}
        //build the intent
        Intent homeIntent = new Intent(this, HomeActivity.class);
        //send some info
        String userName = etUserName.getText().toString();

        homeIntent.putExtra("p", p);
        homeIntent.putExtra(EXTRA_USER_NAME, userName);
        homeIntent.putExtra("theUserScore", 10);

        //launch the intent
        startActivity(homeIntent);
    }
}
