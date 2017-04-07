package com.ming.myanswer;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hanks.htextview.base.HTextView;
import com.hanks.htextview.evaporate.EvaporateTextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * MainActivity
 * Created by hanks on 2017/3/21.
 */

public class MainActivity extends BaseActivity {
    private HTextView hTextView,hTextView2,hTextView3,hTextView4,hTextView5;
    List<HTextView> htxs = new ArrayList<HTextView>();
    LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hTextView = (HTextView) findViewById(R.id.textview);
        hTextView2 = (HTextView) findViewById(R.id.textview2);
        hTextView3 = (HTextView) findViewById(R.id.textview3);
        hTextView4 = (HTextView) findViewById(R.id.textview4);
        hTextView5 = (HTextView) findViewById(R.id.textview5);

        hTextView.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/Mirza-Regular.ttf"));
        hTextView2.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/Mirza-Regular.ttf"));
        hTextView3.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/Mirza-Regular.ttf"));
        hTextView4.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/Mirza-Regular.ttf"));
        hTextView5.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/Mirza-Regular.ttf"));

        htxs.add(hTextView);
        htxs.add(hTextView2);
        htxs.add(hTextView3);
        htxs.add(hTextView4);
        htxs.add(hTextView5);

        //hTextView2 = (HTextView) findViewById(R.id.textview2);

        //hTextView.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/abaddon.TTF"));
        //hTextView3.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/Mirza-Regular.ttf"));
        //hTextView.setOnLongClickListener(new OnLongClickListenerImpl());
        //hTextView.setOnTouchListener(new touchListener());


        linearLayout = (LinearLayout)findViewById(R.id.liner);


        linearLayout.setOnClickListener(new myOnclickListener());
    }
    class myOnclickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Random random = new Random();
            int index = random.nextInt(sentences.length);
            String str = sentences[index];
            System.out.println("----- "+str);
            List<String> words = splitWords(str,20);
//            Typeface tf2 = Typeface.createFromAsset(getAssets(),"fonts/Mirza-Regular.ttf");
//            for(int i =0;i<linearLayout.getChildCount();i++) {
//                HTextView h = new HTextView(v.getContext()) {
//                    @Override
//                    public void setProgress(float progress) {
//
//                    }
//
//                    @Override
//                    public void animateText(CharSequence text) {
//
//                    }
//                };
//                h = (HTextView) linearLayout.getChildAt(i);
//                h.animateText(" ");
//                //h.setTypeface(tf2);
//                if (i < words.size()) {
//                    h.animateText(words.get(i));
//                }
//            }

            for(int i = 0;i<htxs.size();i++){

                for(int j = 0;j<words.size();j++){
                    if ( i == (htxs.size() - words.size())/2 +j){
                        htxs.get(i).animateText(words.get(j));
                        break;
                    }else{
                        htxs.get(i).animateText(" ");
                    }

                }

//                if(i < words.size()){
//                    htxs.get(i).animateText(words.get(i));
//                }else{
//                    htxs.get(i).animateText(" ");
//                }
            }


//
//
//
//           for(int i = 0;i< words.size();i++){
//               HTextView h = new HTextView(v.getContext()) {
//                   @Override
//                   public void setProgress(float progress) {
//
//                   }
//
//                   @Override
//                   public void animateText(CharSequence text) {
//
//                   }
//               };
//               h = (HTextView)linearLayout.getChildAt(i);
//              // h.setTypeface(FontManager.getInstance(getAssets()).getFont("fonts/Mirza-Regular.ttf"));
//               h.animateText(words.get(i));
//
//
//            }
        }
    }




}
