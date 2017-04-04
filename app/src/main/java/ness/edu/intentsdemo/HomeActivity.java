package ness.edu.intentsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //get the opening intent:
        Intent theIntent = getIntent();

        //get the Extras (the data)
        String userName = theIntent.getStringExtra(MainActivity.EXTRA_USER_NAME);

        Toast.makeText(this, "Hello, " + userName,
                Toast.LENGTH_SHORT).show();

    }
}
