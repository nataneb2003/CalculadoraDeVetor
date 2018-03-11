package com.example.nataneb.calculadora;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;

import com.example.nataneb.calculadora.Vector.Vector;

import java.util.List;

/**
 * TODO: document your custom view class.
 */
public class MyView extends View {
    Color color;
    Paint lineP;
    Boolean touch = true;
    List<Vector> vectorlist;
    public MyView(Context context) {
        super(context);
        init(null, 0);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        System.out.println("Oi");
        lineP = new Paint();
        lineP.setColor(Color.RED);
        lineP.setStrokeWidth(10f);
        System.out.println(attrs.getAttributeIntValue("asd","asd",1));
        touch = false;
    }
    //Add a vector to the list
    public void addVector(Vector v){
        this.vectorlist.add(v);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(20,0,20,canvas.getHeight(),lineP);
    }
    //reload the view
    public void reload(){

    }


}