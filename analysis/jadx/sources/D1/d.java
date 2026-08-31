package D1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.K1;
import java.util.Arrays;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f1339v = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1341b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f1343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f1344e;
    public float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f1345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f1346h;
    public int[] i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f1348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f1349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f1350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1351o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OverScroller f1352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K1 f1353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f1354r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f1356t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1342c = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A1.b f1357u = new A1.b(2, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Context context, CoordinatorLayout coordinatorLayout, K1 k12) {
        if (k12 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1356t = coordinatorLayout;
        this.f1353q = k12;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1351o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1341b = viewConfiguration.getScaledTouchSlop();
        this.f1349m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1350n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1352p = new OverScroller(context, f1339v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f1342c = -1;
        float[] fArr = this.f1343d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1344e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.f1345g, 0.0f);
            Arrays.fill(this.f1346h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.f1347k = 0;
        }
        VelocityTracker velocityTracker = this.f1348l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1348l = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f1356t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f1354r = view;
        this.f1342c = i;
        this.f1353q.D(view, i);
        n(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            com.google.android.gms.internal.measurement.K1 r1 = r3.f1353q
            int r4 = r1.s(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.t()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f1341b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f1341b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f1341b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.d.c(android.view.View, float, float):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i) {
        float[] fArr = this.f1343d;
        if (fArr != null) {
            int i7 = this.f1347k;
            int i8 = 1 << i;
            if ((i7 & i8) != 0) {
                fArr[i] = 0.0f;
                this.f1344e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.f1345g[i] = 0.0f;
                this.f1346h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.f1347k = (~i8) & i7;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(int i, int i7, int i8) {
        if (i == 0) {
            return 0;
        }
        float width = this.f1356t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i7);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i8) + 1.0f) * 256.0f), 600);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        if (this.f1340a == 2) {
            OverScroller overScroller = this.f1352p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1354r.getLeft();
            int top = currY - this.f1354r.getTop();
            if (left != 0) {
                View view = this.f1354r;
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1354r;
                WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1353q.F(this.f1354r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f1356t.post(this.f1357u);
            }
        }
        return this.f1340a == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View g(int i, int i7) {
        CoordinatorLayout coordinatorLayout = this.f1356t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1353q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i7 >= childAt.getTop() && i7 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(int i, int i7, int i8, int i9) {
        float f;
        float f7;
        float f8;
        float f9;
        int left = this.f1354r.getLeft();
        int top = this.f1354r.getTop();
        int i10 = i - left;
        int i11 = i7 - top;
        OverScroller overScroller = this.f1352p;
        if (i10 == 0 && i11 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f1354r;
        int i12 = (int) this.f1350n;
        int i13 = (int) this.f1349m;
        int iAbs = Math.abs(i8);
        if (iAbs < i12) {
            i8 = 0;
        } else if (iAbs > i13) {
            i8 = i8 > 0 ? i13 : -i13;
        }
        int iAbs2 = Math.abs(i9);
        if (iAbs2 < i12) {
            i9 = 0;
        } else if (iAbs2 > i13) {
            i9 = i9 > 0 ? i13 : -i13;
        }
        int iAbs3 = Math.abs(i10);
        int iAbs4 = Math.abs(i11);
        int iAbs5 = Math.abs(i8);
        int iAbs6 = Math.abs(i9);
        int i14 = iAbs5 + iAbs6;
        int i15 = iAbs3 + iAbs4;
        if (i8 != 0) {
            f = iAbs5;
            f7 = i14;
        } else {
            f = iAbs3;
            f7 = i15;
        }
        float f10 = f / f7;
        if (i9 != 0) {
            f8 = iAbs6;
            f9 = i14;
        } else {
            f8 = iAbs4;
            f9 = i15;
        }
        float f11 = f8 / f9;
        K1 k12 = this.f1353q;
        overScroller.startScroll(left, top, i10, i11, (int) ((e(i11, i9, k12.t()) * f11) + (e(i10, i8, k12.s(view)) * f10)));
        n(2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(int i) {
        if ((this.f1347k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1348l == null) {
            this.f1348l = VelocityTracker.obtain();
        }
        this.f1348l.addMovement(motionEvent);
        int i7 = 0;
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewG = g((int) x6, (int) y6);
            l(x6, y6, pointerId);
            q(viewG, pointerId);
            int i8 = this.f1346h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f1340a == 1) {
                k();
            }
            a();
            return;
        }
        K1 k12 = this.f1353q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f1340a == 1) {
                    this.f1355s = true;
                    k12.G(this.f1354r, 0.0f, 0.0f);
                    this.f1355s = false;
                    if (this.f1340a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x7 = motionEvent.getX(actionIndex);
                float y7 = motionEvent.getY(actionIndex);
                l(x7, y7, pointerId2);
                if (this.f1340a == 0) {
                    q(g((int) x7, (int) y7), pointerId2);
                    int i9 = this.f1346h[pointerId2];
                    return;
                }
                int i10 = (int) x7;
                int i11 = (int) y7;
                View view = this.f1354r;
                if (view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom()) {
                    i7 = 1;
                }
                if (i7 != 0) {
                    q(this.f1354r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f1340a == 1 && pointerId3 == this.f1342c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i7 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i7);
                    if (pointerId4 != this.f1342c) {
                        View viewG2 = g((int) motionEvent.getX(i7), (int) motionEvent.getY(i7));
                        View view2 = this.f1354r;
                        if (viewG2 == view2 && q(view2, pointerId4)) {
                            i = this.f1342c;
                            break;
                        }
                    }
                    i7++;
                }
                if (i == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f1340a == 1) {
            if (i(this.f1342c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1342c);
                float x8 = motionEvent.getX(iFindPointerIndex);
                float y8 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f;
                int i12 = this.f1342c;
                int i13 = (int) (x8 - fArr[i12]);
                int i14 = (int) (y8 - this.f1345g[i12]);
                int left = this.f1354r.getLeft() + i13;
                int top = this.f1354r.getTop() + i14;
                int left2 = this.f1354r.getLeft();
                int top2 = this.f1354r.getTop();
                if (i13 != 0) {
                    left = k12.k(this.f1354r, left);
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    this.f1354r.offsetLeftAndRight(left - left2);
                }
                if (i14 != 0) {
                    top = k12.l(this.f1354r, top);
                    WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
                    this.f1354r.offsetTopAndBottom(top - top2);
                }
                if (i13 != 0 || i14 != 0) {
                    k12.F(this.f1354r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i7 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i7);
            if (i(pointerId5)) {
                float x9 = motionEvent.getX(i7);
                float y9 = motionEvent.getY(i7);
                float f = x9 - this.f1343d[pointerId5];
                float f7 = y9 - this.f1344e[pointerId5];
                Math.abs(f);
                Math.abs(f7);
                int i15 = this.f1346h[pointerId5];
                Math.abs(f7);
                Math.abs(f);
                int i16 = this.f1346h[pointerId5];
                Math.abs(f);
                Math.abs(f7);
                int i17 = this.f1346h[pointerId5];
                Math.abs(f7);
                Math.abs(f);
                int i18 = this.f1346h[pointerId5];
                if (this.f1340a != 1) {
                    View viewG3 = g((int) x9, (int) y9);
                    if (c(viewG3, f, f7) && q(viewG3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i7++;
        }
        m(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        VelocityTracker velocityTracker = this.f1348l;
        float f = this.f1349m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f1348l.getXVelocity(this.f1342c);
        float fAbs = Math.abs(xVelocity);
        float f7 = this.f1350n;
        if (fAbs < f7) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f1348l.getYVelocity(this.f1342c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f7) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f1355s = true;
        this.f1353q.G(this.f1354r, xVelocity, f);
        this.f1355s = false;
        if (this.f1340a == 1) {
            n(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(float f, float f7, int i) {
        float[] fArr = this.f1343d;
        if (fArr == null || fArr.length <= i) {
            int i7 = i + 1;
            float[] fArr2 = new float[i7];
            float[] fArr3 = new float[i7];
            float[] fArr4 = new float[i7];
            float[] fArr5 = new float[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1344e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1345g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1346h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1343d = fArr2;
            this.f1344e = fArr3;
            this.f = fArr4;
            this.f1345g = fArr5;
            this.f1346h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f1343d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f1344e;
        this.f1345g[i] = f7;
        fArr10[i] = f7;
        int[] iArr7 = this.f1346h;
        int i8 = (int) f;
        int i9 = (int) f7;
        CoordinatorLayout coordinatorLayout = this.f1356t;
        int left = coordinatorLayout.getLeft();
        int i10 = this.f1351o;
        int i11 = i8 < left + i10 ? 1 : 0;
        if (i9 < coordinatorLayout.getTop() + i10) {
            i11 |= 4;
        }
        if (i8 > coordinatorLayout.getRight() - i10) {
            i11 |= 2;
        }
        if (i9 > coordinatorLayout.getBottom() - i10) {
            i11 |= 8;
        }
        iArr7[i] = i11;
        this.f1347k |= 1 << i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x6 = motionEvent.getX(i);
                float y6 = motionEvent.getY(i);
                this.f[pointerId] = x6;
                this.f1345g[pointerId] = y6;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(int i) {
        this.f1356t.removeCallbacks(this.f1357u);
        if (this.f1340a != i) {
            this.f1340a = i;
            this.f1353q.E(i);
            if (this.f1340a == 0) {
                this.f1354r = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o(int i, int i7) {
        if (this.f1355s) {
            return h(i, i7, (int) this.f1348l.getXVelocity(this.f1342c), (int) this.f1348l.getYVelocity(this.f1342c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            int r3 = r1.getActionIndex()
            if (r2 != 0) goto L11
            r0.a()
        L11:
            android.view.VelocityTracker r4 = r0.f1348l
            if (r4 != 0) goto L1b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f1348l = r4
        L1b:
            android.view.VelocityTracker r4 = r0.f1348l
            r4.addMovement(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L118
            if (r2 == r6) goto L114
            if (r2 == r4) goto L67
            r7 = 3
            if (r2 == r7) goto L114
            r7 = 5
            if (r2 == r7) goto L3d
            r4 = 6
            if (r2 == r4) goto L34
            goto L13c
        L34:
            int r1 = r1.getPointerId(r3)
            r0.d(r1)
            goto L13c
        L3d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.l(r7, r1, r2)
            int r3 = r0.f1340a
            if (r3 != 0) goto L56
            int[] r1 = r0.f1346h
            r1 = r1[r2]
            goto L13c
        L56:
            if (r3 != r4) goto L13c
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.g(r3, r1)
            android.view.View r3 = r0.f1354r
            if (r1 != r3) goto L13c
            r0.q(r1, r2)
            goto L13c
        L67:
            float[] r2 = r0.f1343d
            if (r2 == 0) goto L13c
            float[] r2 = r0.f1344e
            if (r2 != 0) goto L71
            goto L13c
        L71:
            int r2 = r1.getPointerCount()
            r3 = r5
        L76:
            if (r3 >= r2) goto L110
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.i(r4)
            if (r7 != 0) goto L84
            goto L10c
        L84:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f1343d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f1344e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.g(r7, r8)
            if (r7 == 0) goto La8
            boolean r8 = r0.c(r7, r9, r10)
            if (r8 == 0) goto La8
            r8 = r6
            goto La9
        La8:
            r8 = r5
        La9:
            if (r8 == 0) goto Ld6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            com.google.android.gms.internal.measurement.K1 r13 = r0.f1353q
            int r12 = r13.k(r7, r12)
            int r14 = r7.getTop()
            int r15 = (int) r10
            int r15 = r15 + r14
            int r15 = r13.l(r7, r15)
            int r16 = r13.s(r7)
            int r13 = r13.t()
            if (r16 == 0) goto Lcf
            if (r16 <= 0) goto Ld6
            if (r12 != r11) goto Ld6
        Lcf:
            if (r13 == 0) goto L110
            if (r13 <= 0) goto Ld6
            if (r15 != r14) goto Ld6
            goto L110
        Ld6:
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.f1346h
            r11 = r11[r4]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r11 = r0.f1346h
            r11 = r11[r4]
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.f1346h
            r11 = r11[r4]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r9 = r0.f1346h
            r9 = r9[r4]
            int r9 = r0.f1340a
            if (r9 != r6) goto L103
            goto L110
        L103:
            if (r8 == 0) goto L10c
            boolean r4 = r0.q(r7, r4)
            if (r4 == 0) goto L10c
            goto L110
        L10c:
            int r3 = r3 + 1
            goto L76
        L110:
            r17.m(r18)
            goto L13c
        L114:
            r0.a()
            goto L13c
        L118:
            float r2 = r1.getX()
            float r3 = r1.getY()
            int r1 = r1.getPointerId(r5)
            r0.l(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.g(r2, r3)
            android.view.View r3 = r0.f1354r
            if (r2 != r3) goto L138
            int r3 = r0.f1340a
            if (r3 != r4) goto L138
            r0.q(r2, r1)
        L138:
            int[] r2 = r0.f1346h
            r1 = r2[r1]
        L13c:
            int r1 = r0.f1340a
            if (r1 != r6) goto L141
            return r6
        L141:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.d.p(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean q(View view, int i) {
        if (view == this.f1354r && this.f1342c == i) {
            return true;
        }
        if (view == null || !this.f1353q.N(view, i)) {
            return false;
        }
        this.f1342c = i;
        b(view, i);
        return true;
    }
}
