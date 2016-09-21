package com.didichuxing.scrolldemo.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.Scroller;

/**
 * Created by didi on 16/9/21.
 */
public class ScrollLayout extends FrameLayout{
    private String TAG = "ScrollDemo";

    Scroller mScroller;

    public ScrollLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mScroller = new Scroller(context);
    }

    public ScrollLayout(Context context) {
        super(context);
        mScroller = new Scroller(context);
    }

    @Override
    public void computeScroll() {
        super.computeScroll();

        if (mScroller.computeScrollOffset()) {
            Log.v(TAG , "mScroller.getCurrX()" +
                    mScroller.getCurrX() + "\t mScroller.getCurrY()" +mScroller.getCurrY());
            this.scrollTo(mScroller.getCurrX() , mScroller.getCurrY());
            this.postInvalidate();
        }



    }


    public void scrollTo( int y) {

        mScroller.startScroll(getScrollX() , getScrollY() , 0 , y ,2000);
        this.invalidate();
    }
}
