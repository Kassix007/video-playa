package C0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.wnapp.smspariaz.R;
import j0.AbstractC1148c;

/* JADX INFO: renamed from: C0.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0115z0 extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1160q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0115z0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(j0.m mVar, d1 d1Var, long j) {
        super.drawChild(AbstractC1148c.a(mVar), d1Var, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            kotlin.jvm.internal.m.c(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((d1) childAt).f1021x) {
                this.f1160q = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f1160q = false;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f1160q) {
            return super.getChildCount();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
    }
}
