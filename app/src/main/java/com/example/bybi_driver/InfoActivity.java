package com.example.bybi_driver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {
    public Button button;
    public EditText license_num;
    public EditText bike_num;
    public EditText phone_num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        button = (Button)findViewById(R.id.button);
        license_num = (EditText)findViewById(R.id.license_num);
        bike_num = (EditText)findViewById(R.id.bike_num);
        phone_num = (EditText)findViewById(R.id.phone_num);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InfoActivity.this, StartActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
