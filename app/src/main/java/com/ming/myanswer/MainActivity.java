package com.ming.myanswer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.hanks.htextview.base.HTextView;

/**
 * MainActivity
 * Created by hanks on 2017/3/21.
 */

public class MainActivity extends BaseActivity {
    private HTextView hTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hTextView = (HTextView) findViewById(R.id.textview);

        hTextView.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/Mirza-Regular.ttf"));
        hTextView.setOnClickListener(new ClickListener());
        //hTextView.setOnLongClickListener(new OnLongClickListenerImpl());
        //hTextView.setOnTouchListener(new touchListener());

    }


}
