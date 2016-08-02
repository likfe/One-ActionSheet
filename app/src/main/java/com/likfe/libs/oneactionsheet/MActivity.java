package com.likfe.libs.oneactionsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

import com.baoyz.actionsheet.ActionSheet;

public class MActivity extends FragmentActivity {
    private TextView t1;
    private TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);

        t1 = (TextView) findViewById(R.id.m_start_default);
        t2 = (TextView) findViewById(R.id.m_start_custom);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActionSheet.createBuilder(MActivity.this, getSupportFragmentManager())
                        .setCancelButtonTitle("Cancel")
                        .setOtherButtonTitles("Item1", "Item2", "Item3", "Item4")
                        .setCancelableOnTouchOutside(true)
                        .setListener(new ActionSheet.ActionSheetListener() {
                            @Override
                            public void onDismiss(ActionSheet actionSheet, boolean isCancel) {

                            }

                            @Override
                            public void onOtherButtonClick(ActionSheet actionSheet, int index) {

                            }
                        })
                        .show();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.likfe.lib.actionsheet.ActionSheet.createBuilder(MActivity.this, getSupportFragmentManager())
                        .setCancelButtonTitle("Cancel")
                        .setOtherButtonTitles("Item1", "Item2", "Item3", "Item4")
                        .setCancelableOnTouchOutside(true)
                        .setListener(new com.likfe.lib.actionsheet.ActionSheet.ActionSheetListener() {

                            @Override
                            public void onDismiss(com.likfe.lib.actionsheet.ActionSheet actionSheet, boolean isCancel) {

                            }

                            @Override
                            public void onOtherButtonClick(com.likfe.lib.actionsheet.ActionSheet actionSheet, int index) {

                            }
                        })
                        .show();
            }
        });

    }

    public static void startAction(Context context) {
        Intent starter = new Intent(context, MActivity.class);
        context.startActivity(starter);
    }
}
