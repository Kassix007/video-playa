package d2;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: d2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0985k extends AbstractC0958E {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f12134C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f12135D = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12136A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final A1.b f12137B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f12140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f12141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12142e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f12143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f12144h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f12147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f12150p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f12153s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f12160z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12151q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12152r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12154t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12155u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12156v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12157w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f12158x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f12159y = new int[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0985k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i7, int i8) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12160z = valueAnimatorOfFloat;
        this.f12136A = 0;
        A1.b bVar = new A1.b(15, this);
        this.f12137B = bVar;
        C0983i c0983i = new C0983i(this);
        this.f12140c = stateListDrawable;
        this.f12141d = drawable;
        this.f12143g = stateListDrawable2;
        this.f12144h = drawable2;
        this.f12142e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f12138a = i7;
        this.f12139b = i8;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0984j(this));
        valueAnimatorOfFloat.addUpdateListener(new c4.b(1, this));
        RecyclerView recyclerView2 = this.f12153s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f9606C;
            AbstractC0960G abstractC0960G = recyclerView2.f9604B;
            if (abstractC0960G != null) {
                abstractC0960G.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f12153s;
            recyclerView3.f9608D.remove(this);
            if (recyclerView3.f9609E == this) {
                recyclerView3.f9609E = null;
            }
            ArrayList arrayList2 = this.f12153s.f9657u0;
            if (arrayList2 != null) {
                arrayList2.remove(c0983i);
            }
            this.f12153s.removeCallbacks(bVar);
        }
        this.f12153s = recyclerView;
        recyclerView.g(this);
        this.f12153s.f9608D.add(this);
        this.f12153s.h(c0983i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e(float f, float f7, int[] iArr, int i, int i7, int i8) {
        int i9 = iArr[1] - iArr[0];
        if (i9 != 0) {
            int i10 = i - i8;
            int i11 = (int) (((f7 - f) / i9) * i10);
            int i12 = i7 + i11;
            if (i12 < i10 && i12 >= 0) {
                return i11;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0958E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f12151q;
        RecyclerView recyclerView2 = this.f12153s;
        if (i != recyclerView2.getWidth() || this.f12152r != recyclerView2.getHeight()) {
            this.f12151q = recyclerView2.getWidth();
            this.f12152r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f12136A != 0) {
            if (this.f12154t) {
                int i7 = this.f12151q;
                int i8 = this.f12142e;
                int i9 = i7 - i8;
                int i10 = this.f12146l;
                int i11 = this.f12145k;
                int i12 = i10 - (i11 / 2);
                StateListDrawable stateListDrawable = this.f12140c;
                stateListDrawable.setBounds(0, 0, i8, i11);
                int i13 = this.f;
                int i14 = this.f12152r;
                Drawable drawable = this.f12141d;
                drawable.setBounds(0, 0, i13, i14);
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i8, i12);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i8, -i12);
                } else {
                    canvas.translate(i9, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i12);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i9, -i12);
                }
            }
            if (this.f12155u) {
                int i15 = this.f12152r;
                int i16 = this.i;
                int i17 = i15 - i16;
                int i18 = this.f12149o;
                int i19 = this.f12148n;
                int i20 = i18 - (i19 / 2);
                StateListDrawable stateListDrawable2 = this.f12143g;
                stateListDrawable2.setBounds(0, 0, i19, i16);
                int i21 = this.f12151q;
                int i22 = this.j;
                Drawable drawable2 = this.f12144h;
                drawable2.setBounds(0, 0, i21, i22);
                canvas.translate(0.0f, i17);
                drawable2.draw(canvas);
                canvas.translate(i20, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i20, -i17);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(float f, float f7) {
        if (f7 < this.f12152r - this.i) {
            return false;
        }
        int i = this.f12149o;
        int i7 = this.f12148n;
        return f >= ((float) (i - (i7 / 2))) && f <= ((float) ((i7 / 2) + i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(float f, float f7) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        int layoutDirection = this.f12153s.getLayoutDirection();
        int i = this.f12142e;
        if (layoutDirection == 1) {
            if (f > i / 2) {
                return false;
            }
        } else if (f < this.f12151q - i) {
            return false;
        }
        int i7 = this.f12146l;
        int i8 = this.f12145k / 2;
        return f7 >= ((float) (i7 - i8)) && f7 <= ((float) (i8 + i7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        A1.b bVar = this.f12137B;
        StateListDrawable stateListDrawable = this.f12140c;
        if (i == 2 && this.f12156v != 2) {
            stateListDrawable.setState(f12134C);
            this.f12153s.removeCallbacks(bVar);
        }
        if (i == 0) {
            this.f12153s.invalidate();
        } else {
            g();
        }
        if (this.f12156v == 2 && i != 2) {
            stateListDrawable.setState(f12135D);
            this.f12153s.removeCallbacks(bVar);
            this.f12153s.postDelayed(bVar, 1200);
        } else if (i == 1) {
            this.f12153s.removeCallbacks(bVar);
            this.f12153s.postDelayed(bVar, 1500);
        }
        this.f12156v = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        int i = this.f12136A;
        ValueAnimator valueAnimator = this.f12160z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f12136A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
