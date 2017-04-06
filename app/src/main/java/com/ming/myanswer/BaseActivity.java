package com.ming.myanswer;

import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import com.hanks.htextview.base.HTextView;

import java.io.SyncFailedException;
import java.util.Random;


/**
 * Created by hanks on 2017/3/14.
 */

public class BaseActivity extends AppCompatActivity {
    String[] sentences = {"What is design?",
            "Design is not just",
            "what it looks like and feels like.",
            "Design is how it works. \n- Steve Jobs",
            "Older people",
            "sit down and ask,",
            "'What is it?'",
            "but the boy asks,",
            "'What can I do with it?'. \n- Steve Jobs",
            "Swift",
            "Objective-C",
            "iPhone",
            "iPad",
            "Mac Mini", "MacBook Pro", "Mac Pro","1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm"};
    int index;

    class ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v instanceof HTextView) {
                Random random = new Random();
                int index = random.nextInt(sentences.length);
                System.out.println("Index -- "+ index);
                ((HTextView) v).animateText(sentences[index]);

            }
        }
    }

    class OnLongClickListenerImpl implements View.OnLongClickListener{

        @Override
        public boolean onLongClick(View v) {
            if (v instanceof HTextView) {

                    Random random = new Random();
                    ((HTextView) v).animateText(sentences[random.nextInt(sentences.length)]);


            }
            return true;
        }
    }
    class touchListener implements View.OnTouchListener{

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            boolean result = true;
            switch (event.getAction()){
                case MotionEvent.ACTION_DOWN: //按下
                    while (result){
                        Random random = new Random();
                        int index = random.nextInt(sentences.length)-1;
                        System.out.println("Index -- "+ index);
                        ((HTextView) v).animateText(sentences[index]);
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                 break;
                case MotionEvent.ACTION_MOVE: //移动
                    break;
                case MotionEvent.ACTION_UP: //抬起
                    result = false;
                     break;
            } return true; }
        }


}
