package A1;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import m.C1325p0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f182H = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float[] f183A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f184B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f185C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f186D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f187E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f188F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1325p0 f189G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AccelerateInterpolator f191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1325p0 f192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f198y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float[] f199z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(C1325p0 c1325p0) {
        a aVar = new a();
        aVar.f177e = Long.MIN_VALUE;
        aVar.f178g = -1L;
        aVar.f = 0L;
        this.f190q = aVar;
        this.f191r = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f194u = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f195v = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f198y = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f199z = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f183A = fArr5;
        this.f192s = c1325p0;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f7 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f7;
        fArr5[1] = f7;
        float f8 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f8;
        fArr4[1] = f8;
        this.f196w = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f197x = f182H;
        aVar.f173a = 500;
        aVar.f174b = 500;
        this.f189G = c1325p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float b(float f, float f7, float f8) {
        return f > f8 ? f8 : f < f7 ? f7 : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f194u
            r0 = r0[r4]
            float[] r1 = r3.f195v
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f191r
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f198y
            r0 = r0[r4]
            float[] r1 = r3.f199z
            r1 = r1[r4]
            float[] r2 = r3.f183A
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.e.a(int, float, float, float):float");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c(float f, float f7) {
        if (f7 != 0.0f) {
            int i = this.f196w;
            if (i == 0 || i == 1) {
                if (f < f7) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f7);
                    }
                    if (this.f187E && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f7);
            }
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        int i = 0;
        if (this.f185C) {
            this.f187E = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f190q;
        int i7 = (int) (jCurrentAnimationTimeMillis - aVar.f177e);
        int i8 = aVar.f174b;
        if (i7 > i8) {
            i = i8;
        } else if (i7 >= 0) {
            i = i7;
        }
        aVar.i = i;
        aVar.f179h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f178g = jCurrentAnimationTimeMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        C1325p0 c1325p0;
        int count;
        a aVar = this.f190q;
        float f = aVar.f176d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(aVar.f175c);
        if (iAbs != 0 && (count = (c1325p0 = this.f189G).getCount()) != 0) {
            int childCount = c1325p0.getChildCount();
            int firstVisiblePosition = c1325p0.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c1325p0.getChildAt(0).getTop() >= 0)) : !(i >= count && c1325p0.getChildAt(childCount - 1).getBottom() <= c1325p0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f188F
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.f186D = r2
            r7.f184B = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            m.p0 r4 = r7.f192s
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            A1.a r9 = r7.f190q
            r9.f175c = r0
            r9.f176d = r8
            boolean r8 = r7.f187E
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            A1.b r8 = r7.f193t
            if (r8 != 0) goto L60
            A1.b r8 = new A1.b
            r8.<init>(r1, r7)
            r7.f193t = r8
        L60:
            r7.f187E = r2
            r7.f185C = r2
            boolean r8 = r7.f184B
            if (r8 != 0) goto L75
            int r8 = r7.f197x
            if (r8 <= 0) goto L75
            A1.b r9 = r7.f193t
            long r5 = (long) r8
            java.util.WeakHashMap r8 = w1.AbstractC1835K.f18149a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            A1.b r8 = r7.f193t
            r8.run()
        L7a:
            r7.f184B = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
