package com.example.bybi_driver;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        checkPreference();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (license_num.getText().toString().length() == 0 ){
                    Toast.makeText(getApplicationContext(), "라이센스번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else if (bike_num.getText().toString().length() == 0 ){
                    Toast.makeText(getApplicationContext(), "바이크 번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else if (phone_num.getText().toString().length() == 0 ){
                    Toast.makeText(getApplicationContext(), "휴대폰번호를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else {

                    SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString("license_num", license_num.getText().toString());
                    editor.putString("bike_num", bike_num.getText().toString());
                    editor.putString("phone_num", phone_num.getText().toString());
                    editor.commit();

                    Intent intent = new Intent(InfoActivity.this, StartActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private void checkPreference() {
        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        if (pref.getString("license_num", "").length() != 0){
            Intent intent = new Intent(InfoActivity.this, StartActivity.class);
            startActivity(intent);
            finish();
        };
    }
}
