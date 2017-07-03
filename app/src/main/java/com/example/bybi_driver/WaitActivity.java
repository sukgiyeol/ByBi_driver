package com.example.bybi_driver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.rahatarmanahmed.cpv.CircularProgressView;

import mehdi.sakout.fancybuttons.FancyButton;

public class WaitActivity extends AppCompatActivity {
    public FancyButton drive_end;
    public Button user_call;
    public Button gara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);
        drive_end = (FancyButton)findViewById(R.id.drive_end);
        user_call = (Button)findViewById(R.id.user_call);

        CircularProgressView progressView = (CircularProgressView) findViewById(R.id.progress_view);
        progressView.startAnimation();

        drive_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        user_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WaitActivity.this, DialogActivity.class);
                intent.putExtra("data","부산대 정문 >>> 부산대 상학관" + "\n\n" + "박유진 : 010-1234-1234");
                startActivity(intent);

            }
        });
    }
}
