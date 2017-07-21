package fr.wcs.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonStartService;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonStartService = (Button)findViewById(R.id.buttonStartService);

        buttonStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyIntent = new Intent(MyService.INTENT_DISPLAY_NOTIF);
                MyIntent.setClass(MainActivity.this, MyService.class);
                startService(MyIntent);
            }
        });
    }
}
