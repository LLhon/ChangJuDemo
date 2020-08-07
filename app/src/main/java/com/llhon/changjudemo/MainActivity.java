package com.llhon.changjudemo;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.newproject.hardqing.ui.QingMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickChangJu(View view) {
        Intent intent = new Intent(this, QingMainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override protected void onDestroy() {
        super.onDestroy();
    }
}