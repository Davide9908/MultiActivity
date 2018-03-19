package it.itisplanck.davide.it.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        Intent i=getIntent();
        ((TextView)findViewById(R.id.usertext)).setText(i.getStringExtra("username"));
        ((TextView)findViewById(R.id.passtext)).setText(i.getStringExtra("password"));
    }
}
