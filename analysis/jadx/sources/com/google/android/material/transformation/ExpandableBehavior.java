package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i1.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandableBehavior() {
    }

    @Override // i1.b
    public abstract void b(View view);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (!view.isLaidOut()) {
            ArrayList arrayListG = coordinatorLayout.g(view);
            int size = arrayListG.size();
            for (int i7 = 0; i7 < size; i7++) {
                b(view);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
