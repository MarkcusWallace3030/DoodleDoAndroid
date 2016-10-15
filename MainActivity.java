package com.example.markcuswallace.doodledo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.Context;
import android.view.View.OnTouchListener;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//This is called when the main activity is first created in the application

    LinearLayout ll = null;
    DoodleDo dd = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout)findViewById(R.id.base);
        dd = new DoodleDo(this);
        ll.addView(dd,1);

    }
}
class DoodleDo extends TextView implements OnTouchListener{
    ArrayList<dot> sketch = new ArrayList<dot>();
    Paint myPaint = new Paint();

public DoodleDo(Context myContext) {
    super(myContext);
    this.setBackgroundColor(Color.WHITE);
    this.setBackgroundColor(Color.WHITE);
    this.setHeight(120);
    this.setFocusable(true);
    this.setFocusable(true);
    this.setFocusableInTouchMode(true);
    this.setOnTouchListener(this);
    myPaint.setColor(Color.BLACK);

    myPaint.setStyle(Paint.Style.FILL_AND_STROKE);
}
    public void onDraw(Canvas canvas){
        for(dot d: sketch)
            canvas.drawCircle(d.x,d.y,2,myPaint);
    }
    public boolean onTouch(View v, MotionEvent me) {
        if (me.getAction() == MotionEvent.ACTION_DOWN) {}
            if (me.getAction() == MotionEvent.ACTION_MOVE) {
                sketch.add(new dot(me.getX(), me.getY()));
            }

            if (me.getAction() == MotionEvent.ACTION_UP) {}
                invalidate();
                return true;
            }
            class dot {
                private float x;
                private float y;

                //Contructor
                public dot(float x, float y) {
                    this.x = y;
                    this.y = y;

                }
            }
        }


