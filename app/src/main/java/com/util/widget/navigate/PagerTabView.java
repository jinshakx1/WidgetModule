package com.util.widget.navigate;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PagerTabView extends LinearLayout {

    private TextView mTextView;

    public PagerTabView(Context context) {
        super(context);
        initPagerTabView(context);
    }

    public PagerTabView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPagerTabView(context);
    }

    public PagerTabView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPagerTabView(context);
    }

    public TextView getTitleTextView() {
        return mTextView;
    }

    public void initPagerTabView(Context context) {
        setGravity(Gravity.CENTER);
        mTextView = new TextView(context);
        addView(mTextView);
    }
}
