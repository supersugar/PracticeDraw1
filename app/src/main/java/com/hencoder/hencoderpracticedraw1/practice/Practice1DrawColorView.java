package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice1DrawColorView extends View {

    public Practice1DrawColorView(Context context) {
        super(context);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
//        黄色： Color.YELLOW
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

//        canvas.drawColor(Color.YELLOW);
//        canvas.drawColor(Color.parseColor("#99110000"));
//        canvas.drawRGB(100, 200, 100);
        canvas.drawARGB(155, 100, 200, 100);
//        canvas.drawColor(Color.parseColor("#44440000"));

    }
}
