package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import h.o;
import h.y;
import l.MenuC1209l;
import m.C1291Y0;
import m.C1302e;
import m.C1312j;
import m.InterfaceC1307g0;
import m.InterfaceC1309h0;
import w1.O;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TypedValue f9161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TypedValue f9162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TypedValue f9163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TypedValue f9164t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TypedValue f9165u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TypedValue f9166v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f9167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC1307g0 f9168x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9167w = new Rect();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getFixedHeightMajor() {
        if (this.f9165u == null) {
            this.f9165u = new TypedValue();
        }
        return this.f9165u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getFixedHeightMinor() {
        if (this.f9166v == null) {
            this.f9166v = new TypedValue();
        }
        return this.f9166v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getFixedWidthMajor() {
        if (this.f9163s == null) {
            this.f9163s = new TypedValue();
        }
        return this.f9163s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getFixedWidthMinor() {
        if (this.f9164t == null) {
            this.f9164t = new TypedValue();
        }
        return this.f9164t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getMinWidthMajor() {
        if (this.f9161q == null) {
            this.f9161q = new TypedValue();
        }
        return this.f9161q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TypedValue getMinWidthMinor() {
        if (this.f9162r == null) {
            this.f9162r = new TypedValue();
        }
        return this.f9162r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1307g0 interfaceC1307g0 = this.f9168x;
        if (interfaceC1307g0 != null) {
            interfaceC1307g0.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1312j c1312j;
        super.onDetachedFromWindow();
        InterfaceC1307g0 interfaceC1307g0 = this.f9168x;
        if (interfaceC1307g0 != null) {
            y yVar = ((o) interfaceC1307g0).f13313q;
            InterfaceC1309h0 interfaceC1309h0 = yVar.f13349H;
            if (interfaceC1309h0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1309h0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((C1291Y0) actionBarOverlayLayout.f9140u).f14730a.f9205q;
                if (actionMenuView != null && (c1312j = actionMenuView.f9150J) != null) {
                    c1312j.c();
                    C1302e c1302e = c1312j.f14805K;
                    if (c1302e != null && c1302e.b()) {
                        c1302e.i.dismiss();
                    }
                }
            }
            if (yVar.f13354M != null) {
                yVar.f13343B.getDecorView().removeCallbacks(yVar.f13355N);
                if (yVar.f13354M.isShowing()) {
                    try {
                        yVar.f13354M.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                yVar.f13354M = null;
            }
            O o6 = yVar.f13356O;
            if (o6 != null) {
                o6.b();
            }
            MenuC1209l menuC1209l = yVar.y(0).f13332h;
            if (menuC1209l != null) {
                menuC1209l.c(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r2 = r1.widthPixels
            int r3 = r1.heightPixels
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L18
            r2 = r4
            goto L19
        L18:
            r2 = r5
        L19:
            int r3 = android.view.View.MeasureSpec.getMode(r17)
            int r6 = android.view.View.MeasureSpec.getMode(r18)
            android.graphics.Rect r7 = r0.f9167w
            r8 = 6
            r9 = 5
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r3 != r10) goto L62
            if (r2 == 0) goto L30
            android.util.TypedValue r12 = r0.f9164t
            goto L32
        L30:
            android.util.TypedValue r12 = r0.f9163s
        L32:
            if (r12 == 0) goto L62
            int r13 = r12.type
            if (r13 == 0) goto L62
            if (r13 != r9) goto L40
            float r12 = r12.getDimension(r1)
        L3e:
            int r12 = (int) r12
            goto L4c
        L40:
            if (r13 != r8) goto L4b
            int r13 = r1.widthPixels
            float r14 = (float) r13
            float r13 = (float) r13
            float r12 = r12.getFraction(r14, r13)
            goto L3e
        L4b:
            r12 = r5
        L4c:
            if (r12 <= 0) goto L62
            int r13 = r7.left
            int r14 = r7.right
            int r13 = r13 + r14
            int r12 = r12 - r13
            int r13 = android.view.View.MeasureSpec.getSize(r17)
            int r12 = java.lang.Math.min(r12, r13)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            r13 = r4
            goto L65
        L62:
            r12 = r17
            r13 = r5
        L65:
            if (r6 != r10) goto L9d
            if (r2 == 0) goto L6c
            android.util.TypedValue r6 = r0.f9165u
            goto L6e
        L6c:
            android.util.TypedValue r6 = r0.f9166v
        L6e:
            if (r6 == 0) goto L9d
            int r14 = r6.type
            if (r14 == 0) goto L9d
            if (r14 != r9) goto L7c
            float r6 = r6.getDimension(r1)
        L7a:
            int r6 = (int) r6
            goto L88
        L7c:
            if (r14 != r8) goto L87
            int r14 = r1.heightPixels
            float r15 = (float) r14
            float r14 = (float) r14
            float r6 = r6.getFraction(r15, r14)
            goto L7a
        L87:
            r6 = r5
        L88:
            if (r6 <= 0) goto L9d
            int r14 = r7.top
            int r15 = r7.bottom
            int r14 = r14 + r15
            int r6 = r6 - r14
            int r14 = android.view.View.MeasureSpec.getSize(r18)
            int r6 = java.lang.Math.min(r6, r14)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            goto L9f
        L9d:
            r6 = r18
        L9f:
            super.onMeasure(r12, r6)
            int r12 = r0.getMeasuredWidth()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r11)
            if (r13 != 0) goto Lde
            if (r3 != r10) goto Lde
            if (r2 == 0) goto Lb3
            android.util.TypedValue r2 = r0.f9162r
            goto Lb5
        Lb3:
            android.util.TypedValue r2 = r0.f9161q
        Lb5:
            if (r2 == 0) goto Lde
            int r3 = r2.type
            if (r3 == 0) goto Lde
            if (r3 != r9) goto Lc3
            float r1 = r2.getDimension(r1)
        Lc1:
            int r1 = (int) r1
            goto Lcf
        Lc3:
            if (r3 != r8) goto Lce
            int r1 = r1.widthPixels
            float r3 = (float) r1
            float r1 = (float) r1
            float r1 = r2.getFraction(r3, r1)
            goto Lc1
        Lce:
            r1 = r5
        Lcf:
            if (r1 <= 0) goto Ld7
            int r2 = r7.left
            int r3 = r7.right
            int r2 = r2 + r3
            int r1 = r1 - r2
        Ld7:
            if (r12 >= r1) goto Lde
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r11)
            goto Ldf
        Lde:
            r4 = r5
        Ldf:
            if (r4 == 0) goto Le4
            super.onMeasure(r14, r6)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAttachListener(InterfaceC1307g0 interfaceC1307g0) {
        this.f9168x = interfaceC1307g0;
    }
}
