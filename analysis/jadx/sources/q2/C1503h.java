package q2;

import android.animation.ObjectAnimator;
import android.view.View;
import com.wnapp.smspariaz.R;
import java.util.HashMap;

/* JADX INFO: renamed from: q2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1503h extends AbstractC1509n {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String[] f15951R = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f15952Q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1503h(int i) {
        this();
        this.f15952Q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void I(C1517v c1517v) {
        int visibility = c1517v.f16003b.getVisibility();
        HashMap map = c1517v.f16002a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c1517v.f16003b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float K(C1517v c1517v, float f) {
        Float f7;
        return (c1517v == null || (f7 = (Float) c1517v.f16002a.get("android:fade:transitionAlpha")) == null) ? f : f7.floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q2.C1495G L(q2.C1517v r8, q2.C1517v r9) {
        /*
            q2.G r0 = new q2.G
            r0.<init>()
            r1 = 0
            r0.f15924a = r1
            r0.f15925b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f16002a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f15926c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f15928e = r6
            goto L33
        L2f:
            r0.f15926c = r3
            r0.f15928e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f16002a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f15927d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.f15927d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f15926c
            int r9 = r0.f15927d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f15928e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f15925b = r1
            r0.f15924a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f15925b = r2
            r0.f15924a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.f15925b = r1
            r0.f15924a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f15928e
            if (r8 != 0) goto L9f
            r0.f15925b = r2
            r0.f15924a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f15927d
            if (r8 != 0) goto L95
            r0.f15925b = r2
            r0.f15924a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f15926c
            if (r8 != 0) goto L9f
            r0.f15925b = r1
            r0.f15924a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C1503h.L(q2.v, q2.v):q2.G");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ObjectAnimator J(View view, float f, float f7) {
        if (f == f7) {
            return null;
        }
        x.f16005a.K(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, x.f16006b, f7);
        C1502g c1502g = new C1502g(view);
        objectAnimatorOfFloat.addListener(c1502g);
        o().a(c1502g);
        return objectAnimatorOfFloat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void d(C1517v c1517v) {
        I(c1517v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final void g(C1517v c1517v) {
        I(c1517v);
        View view = c1517v.f16003b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(x.f16005a.x(view)) : Float.valueOf(0.0f);
        }
        c1517v.f16002a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (L(n(r3, false), r(r3, false)).f15924a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    @Override // q2.AbstractC1509n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, q2.C1517v r25, q2.C1517v r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            q2.G r4 = L(r25, r26)
            boolean r5 = r4.f15924a
            if (r5 == 0) goto L19
            android.view.ViewGroup r5 = r4.f15928e
            if (r5 != 0) goto L1e
            android.view.ViewGroup r5 = r4.f
            if (r5 == 0) goto L19
            goto L1e
        L19:
            r4 = r0
            r16 = 0
            goto L2d7
        L1e:
            boolean r5 = r4.f15925b
            int r7 = r0.f15952Q
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r10 = 1
            r11 = 0
            if (r5 == 0) goto L59
            r1 = r7 & 1
            if (r1 != r10) goto L19
            if (r3 != 0) goto L30
            goto L19
        L30:
            android.view.View r1 = r3.f16003b
            if (r2 != 0) goto L4b
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            q2.v r4 = r0.n(r3, r11)
            q2.v r3 = r0.r(r3, r11)
            q2.G r3 = L(r4, r3)
            boolean r3 = r3.f15924a
            if (r3 == 0) goto L4b
            goto L19
        L4b:
            q2.C r3 = q2.x.f16005a
            r3.getClass()
            float r2 = K(r2, r9)
            android.animation.ObjectAnimator r1 = r0.J(r1, r2, r8)
            return r1
        L59:
            int r4 = r4.f15927d
            r5 = 2
            r7 = r7 & r5
            if (r7 == r5) goto L60
            goto L19
        L60:
            if (r2 != 0) goto L63
            goto L19
        L63:
            android.view.View r7 = r2.f16003b
            if (r3 == 0) goto L6a
            android.view.View r12 = r3.f16003b
            goto L6b
        L6a:
            r12 = 0
        L6b:
            r13 = 2131296659(0x7f090193, float:1.821124E38)
            java.lang.Object r14 = r7.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L81
            r22 = r4
            r18 = r10
            r17 = r11
            r6 = 0
            r16 = 0
            goto L220
        L81:
            if (r12 == 0) goto L98
            android.view.ViewParent r14 = r12.getParent()
            if (r14 != 0) goto L8a
            goto L98
        L8a:
            r14 = 4
            if (r4 != r14) goto L8e
            goto L90
        L8e:
            if (r7 != r12) goto L94
        L90:
            r15 = r11
            r14 = r12
            r12 = 0
            goto L9c
        L94:
            r15 = r10
            r12 = 0
        L96:
            r14 = 0
            goto L9c
        L98:
            if (r12 == 0) goto L94
            r15 = r11
            goto L96
        L9c:
            if (r15 == 0) goto L214
            android.view.ViewParent r15 = r7.getParent()
            if (r15 != 0) goto Lb1
            r22 = r4
            r18 = r10
            r10 = r11
            r17 = r10
            r6 = r14
            r16 = 0
            r14 = r7
            goto L220
        Lb1:
            android.view.ViewParent r15 = r7.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L214
            android.view.ViewParent r15 = r7.getParent()
            android.view.View r15 = (android.view.View) r15
            r16 = 0
            q2.v r6 = r0.r(r15, r10)
            r17 = r11
            q2.v r11 = r0.n(r15, r10)
            q2.G r6 = L(r6, r11)
            boolean r6 = r6.f15924a
            if (r6 != 0) goto L1fd
            boolean r6 = q2.AbstractC1516u.f16001a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r11 = r15.getScrollX()
            int r11 = -r11
            float r11 = (float) r11
            int r12 = r15.getScrollY()
            int r12 = -r12
            float r12 = (float) r12
            r6.setTranslate(r11, r12)
            q2.C r11 = q2.x.f16005a
            r11.R(r7, r6)
            r11.S(r1, r6)
            android.graphics.RectF r11 = new android.graphics.RectF
            int r12 = r7.getWidth()
            float r12 = (float) r12
            int r15 = r7.getHeight()
            float r15 = (float) r15
            r11.<init>(r9, r9, r12, r15)
            r6.mapRect(r11)
            float r12 = r11.left
            int r12 = java.lang.Math.round(r12)
            float r15 = r11.top
            int r15 = java.lang.Math.round(r15)
            r18 = r10
            float r10 = r11.right
            int r10 = java.lang.Math.round(r10)
            float r13 = r11.bottom
            int r13 = java.lang.Math.round(r13)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r5 = r7.getContext()
            r9.<init>(r5)
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            r9.setScaleType(r5)
            boolean r5 = r7.isAttachedToWindow()
            if (r1 == 0) goto L13a
            boolean r19 = r1.isAttachedToWindow()
            if (r19 == 0) goto L13a
            r19 = r18
            goto L13c
        L13a:
            r19 = r17
        L13c:
            if (r5 != 0) goto L160
            if (r19 != 0) goto L148
            r22 = r4
            r21 = r14
            r0 = r16
            goto L1de
        L148:
            android.view.ViewParent r19 = r7.getParent()
            r8 = r19
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int r19 = r8.indexOfChild(r7)
            r20 = r5
            android.view.ViewGroupOverlay r5 = r1.getOverlay()
            r5.add(r7)
            r5 = r19
            goto L166
        L160:
            r20 = r5
            r8 = r16
            r5 = r17
        L166:
            float r19 = r11.width()
            r21 = r14
            int r14 = java.lang.Math.round(r19)
            float r19 = r11.height()
            r22 = r4
            int r4 = java.lang.Math.round(r19)
            if (r14 <= 0) goto L1d0
            if (r4 <= 0) goto L1d0
            int r3 = r14 * r4
            float r3 = (float) r3
            r19 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r19 / r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r0, r3)
            float r0 = (float) r14
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = java.lang.Math.round(r4)
            float r14 = r11.left
            float r14 = -r14
            float r11 = r11.top
            float r11 = -r11
            r6.postTranslate(r14, r11)
            r6.postScale(r3, r3)
            boolean r3 = q2.AbstractC1516u.f16001a
            if (r3 == 0) goto L1be
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r0 = r3.beginRecording(r0, r4)
            r0.concat(r6)
            r7.draw(r0)
            r3.endRecording()
            android.graphics.Bitmap r0 = q2.AbstractC1515t.a(r3)
            goto L1d2
        L1be:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r4, r3)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            r3.concat(r6)
            r7.draw(r3)
            goto L1d2
        L1d0:
            r0 = r16
        L1d2:
            if (r20 != 0) goto L1de
            android.view.ViewGroupOverlay r3 = r1.getOverlay()
            r3.remove(r7)
            r8.addView(r7, r5)
        L1de:
            if (r0 == 0) goto L1e3
            r9.setImageBitmap(r0)
        L1e3:
            int r0 = r10 - r12
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            int r4 = r13 - r15
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r9.measure(r0, r3)
            r9.layout(r12, r15, r10, r13)
            r14 = r9
        L1f8:
            r10 = r17
            r6 = r21
            goto L220
        L1fd:
            r22 = r4
            r18 = r10
            r21 = r14
            int r0 = r15.getId()
            android.view.ViewParent r3 = r15.getParent()
            if (r3 != 0) goto L21e
            r3 = -1
            if (r0 == r3) goto L21e
            r1.findViewById(r0)
            goto L21e
        L214:
            r22 = r4
            r18 = r10
            r17 = r11
            r21 = r14
            r16 = 0
        L21e:
            r14 = r12
            goto L1f8
        L220:
            if (r14 == 0) goto L297
            if (r10 != 0) goto L255
            java.util.HashMap r0 = r2.f16002a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r3)
            int[] r0 = (int[]) r0
            r3 = r0[r17]
            r0 = r0[r18]
            r4 = 2
            int[] r4 = new int[r4]
            r1.getLocationOnScreen(r4)
            r5 = r4[r17]
            int r3 = r3 - r5
            int r5 = r14.getLeft()
            int r3 = r3 - r5
            r14.offsetLeftAndRight(r3)
            r3 = r4[r18]
            int r0 = r0 - r3
            int r3 = r14.getTop()
            int r0 = r0 - r3
            r14.offsetTopAndBottom(r0)
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.add(r14)
        L255:
            q2.C r0 = q2.x.f16005a
            r0.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = K(r2, r3)
            r5 = 0
            r4 = r23
            android.animation.ObjectAnimator r2 = r4.J(r14, r2, r5)
            if (r2 != 0) goto L272
            r5 = r26
            float r3 = K(r5, r3)
            r0.K(r14, r3)
        L272:
            if (r10 != 0) goto L296
            if (r2 != 0) goto L27e
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.remove(r14)
            return r2
        L27e:
            r0 = 2131296659(0x7f090193, float:1.821124E38)
            r7.setTag(r0, r14)
            q2.F r0 = new q2.F
            r0.<init>(r4, r1, r14, r7)
            r2.addListener(r0)
            r2.addPauseListener(r0)
            q2.n r1 = r4.o()
            r1.a(r0)
        L296:
            return r2
        L297:
            r4 = r23
            r5 = r26
            if (r6 == 0) goto L2d7
            int r0 = r6.getVisibility()
            r1 = r17
            q2.x.b(r6, r1)
            q2.C r1 = q2.x.f16005a
            r1.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = K(r2, r3)
            r7 = 0
            android.animation.ObjectAnimator r2 = r4.J(r6, r2, r7)
            if (r2 != 0) goto L2bf
            float r3 = K(r5, r3)
            r1.K(r6, r3)
        L2bf:
            if (r2 == 0) goto L2d3
            q2.E r0 = new q2.E
            r1 = r22
            r0.<init>(r6, r1)
            r2.addListener(r0)
            q2.n r1 = r4.o()
            r1.a(r0)
            return r2
        L2d3:
            q2.x.b(r6, r0)
            return r2
        L2d7:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.C1503h.k(android.view.ViewGroup, q2.v, q2.v):android.animation.Animator");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final String[] q() {
        return f15951R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.AbstractC1509n
    public final boolean s(C1517v c1517v, C1517v c1517v2) {
        if (c1517v == null && c1517v2 == null) {
            return false;
        }
        if (c1517v != null && c1517v2 != null && c1517v2.f16002a.containsKey("android:visibility:visibility") != c1517v.f16002a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1495G c1495gL = L(c1517v, c1517v2);
        if (c1495gL.f15924a) {
            return c1495gL.f15926c == 0 || c1495gL.f15927d == 0;
        }
        return false;
    }

    public C1503h() {
        this.f15952Q = 3;
    }
}
