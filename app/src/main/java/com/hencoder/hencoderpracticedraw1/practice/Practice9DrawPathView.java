package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形



        //划线
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE); // 划线
        Path path = new Path();
        path.lineTo(100, 100);
        path.rLineTo(100, 0); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线
        canvas.drawPath(path, paint);

        //画二次贝塞尔曲线 quadTo(float x1, float y1, float x2, float y2) / rQuadTo(float dx1, float dy1, float dx2, float dy2)
//        path.quadTo();
//        path.rQuadTo();

        //画三次贝塞尔曲线 cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) / rCubicTo(float x1, float y1, float x2, float y2, float x3, float y3)
//        path.cubicTo();
//        path.rCubicTo();
        //移动位置 moveTo(float x, float y) / rMoveTo(float x, float y)
//        path.moveTo();
//        path.rMoveTo();

        //画弧形
        //arcTo(RectF oval, float startAngle, float sweepAngle, boolean forceMoveTo)
        //arcTo(RectF oval, float startAngle, float sweepAngle)
        //arcTo(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean forceMoveTo)
//        path.arcTo();

        //封闭子图形。等价于 path.lineTo(100, 100)
        //path.close();

        //画Bitmap drawBitmap(Bitmap bitmap, float left, float top, Paint paint)
//        canvas.drawBitmap();
        //绘制文字drawText(String text, float x, float y, Paint paint)
//        canvas.drawText();
    }
}
