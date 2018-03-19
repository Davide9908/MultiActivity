package it.itisplanck.davide.it.multiactivity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View v){
        final Intent i=new Intent(this,LoginSuccess.class);
        i.putExtra("username",((TextInputEditText)findViewById(R.id.user)).getText().toString());
        i.putExtra("password",((TextInputEditText)findViewById(R.id.pass)).getText().toString());
        startActivity(i);
    }
}
