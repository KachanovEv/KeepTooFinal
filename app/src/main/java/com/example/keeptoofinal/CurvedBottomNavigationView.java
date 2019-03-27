package com.example.keeptoofinal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CurvedBottomNavigationView extends BottomNavigationView {
    private Paint mPaint;
    private Path mPath;

    public CurvedBottomNavigationView(Context context) {
        super(context);

        init();
    }
    public CurvedBottomNavigationView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }
    public CurvedBottomNavigationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }
    private void init() {
        Paint mPaint = new Paint();
        mPath = new Path();

        mPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        mPaint.setColor(Color.WHITE);
        setBackgroundColor(Color.TRANSPARENT);
    }

}