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



    String[] sentences = {
            "DON'T BET ON IT",
            "THE ANSWER MAY COME TO YOU IN ANOTHER LANGUAGE",
            "INVESTIGATE AND THEN ENJOY IT",
            "BETTER TO WAIT",
            "YOU COULD FIND YOURSELF UNABLE TO COMPROMISE",
            "DO IT EARLY",
            "FOLLOW THE ADVICE OF EXPERTS",
            "KEEP IT TO YOURSELF",
            "FOCUS ON YOUR HOME LIFE",
            "IT SEEMS ASSURED",
            "ADOPT AN ADVENTUROUS ATTITUDE",
            "STARTING EVENTS MAY OCCUR AS A RESULT",
            "YOUR ACTIONS WILL IMPROVE THINGS",
            "YOU WILL NEED TO ACCOMMODATE",
            "DEFINITELY",
            "ABSOLUTELY NOT",
            "IT WILL BRING GOOD LUCK",
            "AVOID THE FIRST SOLUTION",
            "IT WILL AFFECT HOW OTHERS SEE YOU",
            "UNFAVORABLE AT THIS TIME",
            "THERE IS A SUBSTANTIAL LINK TO ANOTHER SITUATION",
            "IF YOU DO AS YOU'RE TOLD",
            "YOU WILL FIND OUT EVERYTHING YOU'LL NEED TO KNOW",
            "IF IT'S DONE WELL;IF NOT,DON'T DO IT AT ALL",
            "WATCH AND SEE WHAT HAPPENS",
            "UPGRADE ANY WAY YOU CAN",
            "BE PATIENT",
            "DON'T ASK FOR ANY MORE AT THIS TIME",
            "DOUBT IT",
            "YOU'LL GET THE FINAL WORD",
            "YOU'LL BE HAPPY YOU DID",
            "GET IT IN WARITING",
            "THE BEST SOLUTION MAY NOT BE THE OBVIOUS ONE ",
            "DON'T GET CAUGHT UP IN YOUR EMOTIONS",
            "APPROACH CAUTIONOUSLY",
            "DON'T HESITATE",
            "PROVIDED YOU SAY \"THANK YOU\"",
            "MOVE ON",
            "THAT'S OUT OF YOUR CONTROL",
            "THERE IS NO GUARANTEE",
            "ENJOY THE EXPERIENCE",
            "THIS IS A GOOD TIME TO MAKE A NEW PLAN",
            "REMAIN FLEXIBLE",
            "THE CIRCUMSTANCES WILL CHANGE VERY QUICKLY",
            "PROCEED AT A MORE RELAXED PACE",
            "SHIFT YOUR FOCUS",
            "PAY ATTENTION TO THE DETAILS",
            "SPEAK UP ABOUT IT",
            "REPRIORITIZE WHAT IS IMPORTANT",
            "YOU'LL HAVE TO COMPROMISE",
            "SEEK OUT MORE OPTIONS",
            "FOLLOW SOMEONE ELSE'S LEAD",
            "IT IS SOMETHING YOU WON'T FORGET",
            "TAKE A CHANCE",
            "DON'T WAIT",
            "ACCEPT A CHANGE TO YOUR ROUTINE",
            "EXPECT TO SETTLE",
            "MAKE A LIST OF WHY",
            "MAKE A LIST OF WHY NOT",
            "YOU'LL NEED TO TAKE THE INITIATIVE",
            "IT IS SIGNIFICANT",
            "YOU'LL NEED MORE INFORMATION",
            "FOLLOW THROUGH ON YOUR OBLIGATIONS",
            "DEAL WITH IT LATER",
            "IT WILL CREATE A STIR",
            "RECONSIDER YOUR APPROACH",
            "BET ON IT",
            "YOU ARE TOO CLOSE TO SEE",
            "IT WOULD BE BETTER TO FOCUS ON YOUR WORK",
            "A SUBSTANTIAL EFFORT WILL BE REOUIRED",
            "IT WILL BE A PLEASURE",
            "ALLOW YOURSELF TO REST FIRST",
            "BE MORE GENEROUS",
            "THE SITUATION ISUNCLEAR",
            "REMOVE YOUR OWN OBESTACLES",
            "THE CHANCE WILL NOT COME AGAIN SOON",
            "TRUST YOUR ORIGINAL THOUGHT",
            "IT WOULD BE INADVISABLE",
            "FINISH SOMETHING ELSE FIRST",
            "YOU MAY HAVE OPPOSITION",
            "STETTLE IT SOON",
            "NO MATTER WHAT",
            "DON'T OVERDO IT",
            "BE PRACTICAL",
            "TAKE A CHANCE",
            "IT IS CERTAIN",
            "GET A CLEARER VIEW",
            "IT IS UNCERTAIN",
            "NOW YOU CAN",
            "SAVE YOUR ENERGY",
            "YES,BUT DON'T FORCE IT",
            "THE OUTCOME WILL BE POSITIVE",
            "WAIT FOR A BETTER OFFER",
            "YOU MAY HAVE TO DROP OTHER THINGS",
            "IT'LL COST YOU",
            "IT IS SURE TO MAKE THINGS INTERESTING",
            "PREPARE FOR THE UNEXPECTED",
            "TAKE CHARGE",
            "IT MAY BE DIFFICULT BUT YOU WILL FIND VALUE IN IT",
            "RELATED ISSUES MY SURFACE",

    };
}
