package a1;

import C0.AbstractC0065a;
import P.C0345b;
import P.C0354f0;
import P.C0371o;
import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.InterfaceC1850m;
import w1.o0;

/* JADX INFO: renamed from: a1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0615h extends AbstractC0065a implements InterfaceC1850m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8733A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f8734B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f8735C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f8736D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Window f8737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0354f0 f8738z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0615h(Context context, Window window) {
        super(context);
        this.f8737y = window;
        this.f8738z = C0345b.q(AbstractC0614g.f8732a);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1826B.l(this, this);
        AbstractC1835K.o(this, new Z0.a(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a
    public final void a(int i, C0371o c0371o) {
        c0371o.S(1735448596);
        ((B5.e) this.f8738z.getValue()).invoke(c0371o, 0);
        c0371o.p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1850m
    public final o0 c(View view, o0 o0Var) {
        if (!this.f8734B) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return o0Var.f18232a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a
    public final void f(int i, int i7, int i8, int i9) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i10 = i8 - i;
        int i11 = i9 - i7;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i10 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i11 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a
    public final void g(int i, int i7) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.g(i, i7);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        Window window = this.f8737y;
        int i8 = (mode != Integer.MIN_VALUE || this.f8733A || this.f8734B || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i9 = size - paddingRight;
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = i8 - paddingBottom;
        int i11 = i10 >= 0 ? i10 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        }
        childAt.measure(i, i7);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f8733A || this.f8734B || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0065a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f8736D;
    }
}
