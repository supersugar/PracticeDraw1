package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        /*
            Paint.setStyle(Style style) 设置绘制模式
            Paint.setColor(int color) 设置颜色
            Paint.setStrokeWidth(float width) 设置线条宽度
            Paint.setTextSize(float textSize) 设置文字大小
            Paint.setAntiAlias(boolean aa) 设置抗锯齿开关
         */

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        //centerX centerY 是圆心的坐标, 第三个参数 radius 是圆的半径
        canvas.drawCircle(300,150,100,paint);

        // FILL, STROKE 和  FILL_AND_STROKE 。
        // FILL 是填充模式，STROKE 是画线模式（即勾边模式），
        // FILL_AND_STROKE 是两种模式一并使用：既画线又填充。
        // 它的默认值是 FILL，填充模式。


        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(600,150,100,paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(300,450,100,paint);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(30);
        canvas.drawCircle(600,450,100,paint);
    }
}
