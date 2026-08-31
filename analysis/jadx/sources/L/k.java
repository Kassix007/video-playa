package L;

import C0.RunnableC0089m;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import i0.C1133e;
import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class k extends View {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f3039v = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f3040w = new int[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f3041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f3042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Long f3043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RunnableC0089m f3044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public B5.a f3045u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setRippleState(boolean z5) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f3044t;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l7 = this.f3043s;
        long jLongValue = jCurrentAnimationTimeMillis - (l7 != null ? l7.longValue() : 0L);
        if (z5 || jLongValue >= 5) {
            int[] iArr = z5 ? f3039v : f3040w;
            t tVar = this.f3041q;
            if (tVar != null) {
                tVar.setState(iArr);
            }
        } else {
            RunnableC0089m runnableC0089m = new RunnableC0089m(3, this);
            this.f3044t = runnableC0089m;
            postDelayed(runnableC0089m, 50L);
        }
        this.f3043s = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(k kVar) {
        t tVar = kVar.f3041q;
        if (tVar != null) {
            tVar.setState(f3040w);
        }
        kVar.f3044t = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(y.k kVar, boolean z5, long j, int i, long j7, float f, B5.a aVar) {
        if (this.f3041q == null || !Boolean.valueOf(z5).equals(this.f3042r)) {
            t tVar = new t(z5);
            setBackground(tVar);
            this.f3041q = tVar;
            this.f3042r = Boolean.valueOf(z5);
        }
        t tVar2 = this.f3041q;
        kotlin.jvm.internal.m.b(tVar2);
        this.f3045u = aVar;
        e(j, i, j7, f);
        if (z5) {
            tVar2.setHotspot(Float.intBitsToFloat((int) (kVar.f18534a >> 32)), Float.intBitsToFloat((int) (kVar.f18534a & 4294967295L)));
        } else {
            tVar2.setHotspot(tVar2.getBounds().centerX(), tVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.f3045u = null;
        RunnableC0089m runnableC0089m = this.f3044t;
        if (runnableC0089m != null) {
            removeCallbacks(runnableC0089m);
            RunnableC0089m runnableC0089m2 = this.f3044t;
            kotlin.jvm.internal.m.b(runnableC0089m2);
            runnableC0089m2.run();
        } else {
            t tVar = this.f3041q;
            if (tVar != null) {
                tVar.setState(f3040w);
            }
        }
        t tVar2 = this.f3041q;
        if (tVar2 == null) {
            return;
        }
        tVar2.setVisible(false, false);
        unscheduleDrawable(tVar2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        setRippleState(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(long j, int i, long j7, float f) {
        t tVar = this.f3041q;
        if (tVar == null) {
            return;
        }
        Integer num = tVar.f3068s;
        if (num == null || num.intValue() != i) {
            tVar.f3068s = Integer.valueOf(i);
            tVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = j0.o.b(j7, f);
        j0.o oVar = tVar.f3067r;
        if (!(oVar == null ? false : j0.o.c(oVar.f13724a, jB))) {
            tVar.f3067r = new j0.o(jB);
            tVar.setColor(ColorStateList.valueOf(AbstractC1145B.v(jB)));
        }
        Rect rect = new Rect(0, 0, D5.a.G(C1133e.d(j)), D5.a.G(C1133e.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        tVar.setBounds(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        B5.a aVar = this.f3045u;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
    }
}
