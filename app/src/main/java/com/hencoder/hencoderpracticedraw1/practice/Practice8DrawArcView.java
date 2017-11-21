package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        /**
         * 弧形,扇形,这些都属于一个椭圆,或者一个圆的,是他们的一部分
         * 前四个坐标,确定的是这个圆的位置和大小
         * startAngle是要画的图形的起始角度,0是x轴正方向,画的时候是顺时针,从起始位置开始画
         * sweepAngle是途径的角度,比如起始位置是10度,途径90度,结束的位置就是100度
         * useCenter的作用就是是不是连接圆心
         */

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE); // 划线
        paint.setStrokeWidth(10);
        canvas.drawArc(100, 100, 800, 500, 180, 60, false, paint);
        paint.setStyle(Paint.Style.FILL); // 填充模式
        canvas.drawArc(100, 100, 800, 500, 250, 100, true, paint); // 绘制扇形

        paint.setStyle(Paint.Style.FILL); // 填充模式
        canvas.drawArc(100, 100, 800, 500, 30, 120, false, paint); // 绘制扇形
    }
}
