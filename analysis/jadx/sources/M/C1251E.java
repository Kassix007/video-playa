package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.wnapp.smspariaz.R;
import g.AbstractC1066a;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: m.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1251E extends C1344z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1249D f14648e;
    public Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f14649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f14650h;
    public boolean i;
    public boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1251E(C1249D c1249d) {
        super(c1249d);
        this.f14649g = null;
        this.f14650h = null;
        this.i = false;
        this.j = false;
        this.f14648e = c1249d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1344z
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C1249D c1249d = this.f14648e;
        Context context = c1249d.getContext();
        int[] iArr = AbstractC1066a.f12791g;
        B0.G0 g0N = B0.G0.N(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        AbstractC1835K.l(c1249d, c1249d.getContext(), iArr, attributeSet, (TypedArray) g0N.f235s, R.attr.seekBarStyle);
        Drawable drawableZ = g0N.z(0);
        if (drawableZ != null) {
            c1249d.setThumb(drawableZ);
        }
        Drawable drawableY = g0N.y(1);
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f = drawableY;
        if (drawableY != null) {
            drawableY.setCallback(c1249d);
            drawableY.setLayoutDirection(c1249d.getLayoutDirection());
            if (drawableY.isStateful()) {
                drawableY.setState(c1249d.getDrawableState());
            }
            f();
        }
        c1249d.invalidate();
        if (typedArray.hasValue(3)) {
            this.f14650h = AbstractC1313j0.b(typedArray.getInt(3, -1), this.f14650h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f14649g = g0N.w(2);
            this.i = true;
        }
        g0N.R();
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.i) {
                    drawableMutate.setTintList(this.f14649g);
                }
                if (this.j) {
                    this.f.setTintMode(this.f14650h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(this.f14648e.getDrawableState());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Canvas canvas) {
        if (this.f != null) {
            int max = this.f14648e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f.getIntrinsicWidth();
                int intrinsicHeight = this.f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i7 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f.setBounds(-i, -i7, i, i7);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i8 = 0; i8 <= max; i8++) {
                    this.f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
