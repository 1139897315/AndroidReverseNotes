package com.tencent.p177mm.plugin.appbrand.widget.input;

import android.content.Context;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.r */
abstract class C27417r extends C2577y {
    public C27417r(Context context) {
        super(context);
        super.setHorizontallyScrolling(true);
    }

    public void setGravity(int i) {
        super.setGravity(((i & -81) & -49) | 16);
    }

    public boolean aQT() {
        return false;
    }

    public final void setSingleLine(boolean z) {
    }

    public final void setInputType(int i) {
        super.setInputType(-131073 & i);
    }

    public boolean canScrollVertically(int i) {
        return false;
    }

    public final boolean aQP() {
        return false;
    }
}
