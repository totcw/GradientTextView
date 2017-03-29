package com.betterda.gradienttextview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/28.
 */

public class GradientTextView extends TextView {

    private LinearGradient mLinearGradient;
    private Paint mPaint;
    private int mViewWidth = 0;
    private Rect mTextBound = new Rect();

        public GradientTextView(Context context) {
            super(context);
        }

        public GradientTextView(Context context,
                                AttributeSet attrs) {
            super(context, attrs);
        }

        public GradientTextView(Context context,
                                AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            //super.onDraw(canvas);
        /*    getPaint().setShader(new LinearGradient(
                    0, 0, 0, getHeight(),
                    Color.YELLOW, Color.RED,
                    Shader.TileMode.CLAMP));*/

            mViewWidth = getMeasuredWidth();
            mPaint = getPaint();
            String mTipText = getText().toString();
            mPaint.getTextBounds(mTipText, 0, mTipText.length(), mTextBound);
            mLinearGradient = new LinearGradient(0, 0, 0, getMeasuredHeight(),
                    new int[] {  0xFFffff40, 0xFFff6027 },
                    null, Shader.TileMode.CLAMP);
            mPaint.setShader(mLinearGradient);
            canvas.drawText(mTipText, getMeasuredWidth() / 2 - mTextBound.width() / 2, getMeasuredHeight() / 2 +   mTextBound.height()/2, mPaint);
        }

}
