package minun.zte.axon30.under_screen_adjustment;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Color;

import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;

public class AdjustmentView extends View {

//    Paint paint;

    public AdjustmentView(Context context) {
        super(context);
        this.setBackgroundColor(Color.TRANSPARENT);
//        this.paint = new Paint();
//        this.paint.setAlpha(100);
        setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                Rect rect = new Rect(9,11,91,93);
                Log.d("AdjustmentView", "rect: "+ rect);
                outline.setRoundRect(rect, 45);
            }
        });
        setClipToOutline(true);
    }

//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
////        canvas.drawRect(rect,paint);
////        this.setBackgroundColor(Color.GRAY);
////        this.paint.setColor(Color.WHITE);
////        this.paint.setAlpha(30);
////        this.paint.setStyle(Paint.Style.FILL);//画笔属性是空心圆
////        paint.setStrokeWidth(10);//设置画笔粗细
////               /*四个参数：
////                参数一：圆心的x坐标
////                参数二：圆心的y坐标
////                参数三：圆的半径
////                参数四：定义好的画笔
////                */
//        canvas.drawCircle(
//                (float) (104 / 2.0),
//                (float) (104 / 2.0),
//                (float) (10 / 2.0),
//                this.paint);
//    }

    public void setAdjustment(float r, float g, float b, float a) {
        this.setBackgroundColor(Color.argb(a, r, g, b));
//        this.paint.setColor(Color.argb(a, r, g, b));
//        this.invalidate();
    }

}
