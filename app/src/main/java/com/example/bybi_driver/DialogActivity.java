package com.example.bybi_driver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class DialogActivity extends Activity implements
        View.OnClickListener {

    private Button mConfirm, mCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);

        setContent();
    }

    private void setContent() {
        mConfirm = (Button) findViewById(R.id.btnConfirm);
        mCancel = (Button) findViewById(R.id.btnCancel);

        mConfirm.setOnClickListener(this);
        mCancel.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnConfirm:
                startActivity(new Intent(DialogActivity.this, MatchingActivity.class));
                this.finish();
                break;
            case R.id.btnCancel:
                this.finish();
                break;
            default:
                break;
        }
    }
}