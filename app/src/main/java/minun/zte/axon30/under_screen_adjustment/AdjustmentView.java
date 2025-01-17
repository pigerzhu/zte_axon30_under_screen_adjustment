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

    public AdjustmentView(Context context) {
        super(context);
        this.setBackgroundColor(Color.TRANSPARENT);
        setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                Rect rect = new Rect(8,10,92,94);
                Log.d("AdjustmentView", "rect: "+ rect);
                outline.setRoundRect(rect, 45);
            }
        });
        setClipToOutline(true);
    }

    public void setAdjustment(float r, float g, float b, float a) {
        this.setBackgroundColor(Color.argb(a, r, g, b));
    }

}
