package com.likfe.libs.oneactionsheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t1;
    private TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.start_app_compat_activity);
        t2 = (TextView) findViewById(R.id.start_activity);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MAppCompatActivity.startAction(MainActivity.this);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MActivity.startAction(MainActivity.this);
            }
        });
    }
}
