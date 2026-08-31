package Z3;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class b extends K1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8432d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f8433e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f8433e = swipeDismissBehavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void D(View view, int i) {
        this.f8432d = i;
        this.f8431c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f8433e;
            swipeDismissBehavior.f11358c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f11358c = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final void F(View view, int i, int i7) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f8433e;
        float f = width * swipeDismissBehavior.f11360e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float fAbs = Math.abs(i - this.f8431c);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @Override // com.google.android.gms.internal.measurement.K1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f8432d = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f8433e
            r4 = 1
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = w1.AbstractC1835K.f18149a
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r2
        L1b:
            int r6 = r3.f11359d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L2a:
            if (r1 <= 0) goto L67
            goto L52
        L2d:
            if (r6 != r4) goto L67
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L67
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f8431c
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L67
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f8431c
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L65
        L61:
            int r10 = r8.f8431c
            int r0 = r10 - r11
        L65:
            r2 = r4
            goto L69
        L67:
            int r0 = r8.f8431c
        L69:
            D1.d r10 = r3.f11356a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7f
            I4.a r10 = new I4.a
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = w1.AbstractC1835K.f18149a
            r9.postOnAnimation(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.b.G(android.view.View, float, float):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final boolean N(View view, int i) {
        int i7 = this.f8432d;
        return (i7 == -1 || i7 == i) && this.f8433e.r(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final int k(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        boolean z5 = view.getLayoutDirection() == 1;
        int i7 = this.f8433e.f11359d;
        if (i7 == 0) {
            if (z5) {
                width = this.f8431c - view.getWidth();
                width2 = this.f8431c;
            } else {
                width = this.f8431c;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i7 != 1) {
            width = this.f8431c - view.getWidth();
            width2 = view.getWidth() + this.f8431c;
        } else if (z5) {
            width = this.f8431c;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f8431c - view.getWidth();
            width2 = this.f8431c;
        }
        return Math.min(Math.max(width, i), width2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final int l(View view, int i) {
        return view.getTop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.K1
    public final int s(View view) {
        return view.getWidth();
    }

    @Override // com.google.android.gms.internal.measurement.K1
    public final void E(int i) {
    }
}
