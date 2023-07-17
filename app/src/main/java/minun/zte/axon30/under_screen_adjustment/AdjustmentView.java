package minun.zte.axon30.under_screen_adjustment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

public class AdjustmentView extends View {

    private float centerX, centerY, radius;
    private Paint paint;

    public AdjustmentView(Context context) {
        super(context);
        this.setBackgroundColor(Color.TRANSPARENT);
        paint = new Paint();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        centerX = 50; // 圆心 x 坐标为 50 像素
        centerY = 50; // 圆心 y 坐标为 50 像素
        radius = 20; // 半径为 20 像素
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 绘制圆形背景
        paint.setColor(Color.WHITE);
        canvas.drawCircle(centerX, centerY, radius, paint);
        // 绘制调整效果
        paint.setColor(Color.RED);
        canvas.drawCircle(centerX, centerY, radius * 0.8f, paint);
    }

    public void setAdjustment(float r, float g, float b, float a) {
        paint.setColor(Color.argb(a, r, g, b));
        invalidate(); // 重绘视图
    }

}
