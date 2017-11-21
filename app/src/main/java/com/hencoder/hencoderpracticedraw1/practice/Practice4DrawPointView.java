package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(120);


        canvas.drawPoint(100,100,paint);

        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(400,100,paint);

        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(600,100,paint);

        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeWidth(20);
        paint.setColor(Color.YELLOW);
        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
        canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */,
                8 /* 一共绘制 8 个数（4 个点）*/, paint);
    }
}
