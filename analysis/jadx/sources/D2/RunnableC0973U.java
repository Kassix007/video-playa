package d2;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: d2.U, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0973U implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public OverScroller f12026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Interpolator f12027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12029v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f12030w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0973U(RecyclerView recyclerView) {
        this.f12030w = recyclerView;
        D1.c cVar = RecyclerView.f9601K0;
        this.f12027t = cVar;
        this.f12028u = false;
        this.f12029v = false;
        this.f12026s = new OverScroller(recyclerView.getContext(), cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.f12028u) {
            this.f12029v = true;
            return;
        }
        RecyclerView recyclerView = this.f12030w;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        recyclerView.postOnAnimation(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, int i7, int i8, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f12030w;
        if (i8 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i7);
            boolean z5 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i7 * i7) + (i * i));
            int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i9 = width / 2;
            float f = width;
            float f7 = i9;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f7) + f7;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z5) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            i8 = Math.min(iRound, 2000);
        }
        int i10 = i8;
        if (interpolator == null) {
            interpolator = RecyclerView.f9601K0;
        }
        if (this.f12027t != interpolator) {
            this.f12027t = interpolator;
            this.f12026s = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f12025r = 0;
        this.f12024q = 0;
        recyclerView.setScrollState(2);
        this.f12026s.startScroll(0, 0, i, i7, i10);
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f12030w;
        int[] iArr = recyclerView.f9610E0;
        if (recyclerView.f9604B == null) {
            recyclerView.removeCallbacks(this);
            this.f12026s.abortAnimation();
            return;
        }
        this.f12029v = false;
        this.f12028u = true;
        recyclerView.m();
        OverScroller overScroller = this.f12026s;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i10 = currX - this.f12024q;
            int i11 = currY - this.f12025r;
            this.f12024q = currX;
            this.f12025r = currY;
            int[] iArr2 = recyclerView.f9610E0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.r(i10, i11, 1, iArr2, null)) {
                i = i10 - iArr[0];
                i7 = i11 - iArr[1];
            } else {
                i = i10;
                i7 = i11;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i7);
            }
            if (recyclerView.f9602A != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.X(i, i7, iArr);
                i8 = iArr[0];
                i9 = iArr[1];
                i -= i8;
                i7 -= i9;
                C0994t c0994t = recyclerView.f9604B.f11981e;
                if (c0994t != null && !c0994t.f12204d && c0994t.f12205e) {
                    int iB = recyclerView.f9653s0.b();
                    if (iB == 0) {
                        c0994t.i();
                    } else if (c0994t.f12201a >= iB) {
                        c0994t.f12201a = iB - 1;
                        c0994t.g(i8, i9);
                    } else {
                        c0994t.g(i8, i9);
                    }
                }
            } else {
                i8 = 0;
                i9 = 0;
            }
            if (!recyclerView.f9606C.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f9610E0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i8, i9, i, i7, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i7 - iArr[1];
            if (i8 != 0 || i9 != 0) {
                recyclerView.t(i8, i9);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0994t c0994t2 = recyclerView.f9604B.f11981e;
            if ((c0994t2 == null || !c0994t2.f12204d) && z5) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.v();
                        if (recyclerView.f9628T.isFinished()) {
                            recyclerView.f9628T.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.w();
                        if (recyclerView.f9630V.isFinished()) {
                            recyclerView.f9630V.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f9629U.isFinished()) {
                            recyclerView.f9629U.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f9631W.isFinished()) {
                            recyclerView.f9631W.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                Q.J j = recyclerView.f9651r0;
                int[] iArr4 = (int[]) j.f6479d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                j.f6478c = 0;
            } else {
                a();
                RunnableC0987m runnableC0987m = recyclerView.f9649q0;
                if (runnableC0987m != null) {
                    runnableC0987m.a(recyclerView, i8, i9);
                }
            }
        }
        C0994t c0994t3 = recyclerView.f9604B.f11981e;
        if (c0994t3 != null && c0994t3.f12204d) {
            c0994t3.g(0, 0);
        }
        this.f12028u = false;
        if (!this.f12029v) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
            recyclerView.postOnAnimation(this);
        }
    }
}
