package com.example.bybi_driver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WaitActivity extends AppCompatActivity {
    public Button drive_end;
    public Button user_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);
        drive_end = (Button)findViewById(R.id.drive_end);
        user_call = (Button)findViewById(R.id.user_call);

        drive_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        user_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WaitActivity.this, DialogActivity.class));

            }
        });
    }
}
