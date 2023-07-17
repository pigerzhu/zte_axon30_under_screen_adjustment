package minun.zte.axon30.under_screen_adjustment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class AdjustmentView extends View {

    private Paint paint;

    public AdjustmentView(Context context) {
        super(context);
        this.setBackgroundColor(Color.TRANSPARENT);

        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        
        int centerX = 100;
        int centerY = 100;
        int radius = 50;
        
        paint.setColor(getBackgroundColor());
        canvas.drawCircle(centerX, centerY, radius, paint);
    }

    public void setAdjustment(float r, float g, float b, float a) {
        this.setBackgroundColor(Color.argb(a, r, g, b));
        invalidate();
    }

}
