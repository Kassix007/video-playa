package n3;

import a3.C0632k;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ValueAnimator implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0632k f15159B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArraySet f15162q = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArraySet f15163r = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArraySet f15164s = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f15165t = 1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15166u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f15167v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15168w = 0.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f15169x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f15170y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f15171z = -2.14748365E9f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f15158A = 2.14748365E9f;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f15160C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f15161D = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float a() {
        C0632k c0632k = this.f15159B;
        if (c0632k == null) {
            return 0.0f;
        }
        float f = this.f15169x;
        float f7 = c0632k.f8841l;
        return (f - f7) / (c0632k.f8842m - f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f15163r.add(animatorListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f15164s.add(animatorPauseListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f15162q.add(animatorUpdateListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b() {
        C0632k c0632k = this.f15159B;
        if (c0632k == null) {
            return 0.0f;
        }
        float f = this.f15158A;
        return f == 2.14748365E9f ? c0632k.f8842m : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c() {
        C0632k c0632k = this.f15159B;
        if (c0632k == null) {
            return 0.0f;
        }
        float f = this.f15171z;
        return f == -2.14748365E9f ? c0632k.f8841l : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f15163r.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        return this.f15165t < 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z5 = false;
        if (this.f15160C) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C0632k c0632k = this.f15159B;
        if (c0632k == null || !this.f15160C) {
            return;
        }
        float fAbs = (this.f15167v != 0 ? j - r2 : 0L) / ((1.0E9f / c0632k.f8843n) / Math.abs(this.f15165t));
        float f = this.f15168w;
        if (d()) {
            fAbs = -fAbs;
        }
        float f7 = f + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = g.f15173a;
        if (f7 >= fC && f7 <= fB) {
            z5 = true;
        }
        float f8 = this.f15168w;
        float fB2 = g.b(f7, c(), b());
        this.f15168w = fB2;
        if (this.f15161D) {
            fB2 = (float) Math.floor(fB2);
        }
        this.f15169x = fB2;
        this.f15167v = j;
        if (z5) {
            if (!this.f15161D || this.f15168w != f8) {
                f();
            }
        } else if (getRepeatCount() == -1 || this.f15170y < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f15166u = !this.f15166u;
                this.f15165t = -this.f15165t;
            } else {
                float fB3 = d() ? b() : c();
                this.f15168w = fB3;
                this.f15169x = fB3;
            }
            this.f15167v = j;
            if (!this.f15161D || this.f15168w != f8) {
                f();
            }
            Iterator it = this.f15163r.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f15170y++;
        } else {
            float fC2 = this.f15165t < 0.0f ? c() : b();
            this.f15168w = fC2;
            this.f15169x = fC2;
            g(true);
            if (!this.f15161D || this.f15168w != f8) {
                f();
            }
            e(d());
        }
        if (this.f15159B == null) {
            return;
        }
        float f9 = this.f15169x;
        if (f9 < this.f15171z || f9 > this.f15158A) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f15171z), Float.valueOf(this.f15158A), Float.valueOf(this.f15169x)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(boolean z5) {
        for (Animator.AnimatorListener animatorListener : this.f15163r) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z5);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        Iterator it = this.f15162q.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(boolean z5) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z5) {
            this.f15160C = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.f15159B == null) {
            return 0.0f;
        }
        if (d()) {
            fC = b() - this.f15169x;
            fB = b();
            fC2 = c();
        } else {
            fC = this.f15169x - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C0632k c0632k = this.f15159B;
        if (c0632k == null) {
            return 0L;
        }
        return (long) c0632k.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(float f) {
        if (this.f15168w == f) {
            return;
        }
        float fB = g.b(f, c(), b());
        this.f15168w = fB;
        if (this.f15161D) {
            fB = (float) Math.floor(fB);
        }
        this.f15169x = fB;
        this.f15167v = 0L;
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(float f, float f7) {
        if (f > f7) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f7 + ")");
        }
        C0632k c0632k = this.f15159B;
        float f8 = c0632k == null ? -3.4028235E38f : c0632k.f8841l;
        float f9 = c0632k == null ? Float.MAX_VALUE : c0632k.f8842m;
        float fB = g.b(f, f8, f9);
        float fB2 = g.b(f7, f8, f9);
        if (fB == this.f15171z && fB2 == this.f15158A) {
            return;
        }
        this.f15171z = fB;
        this.f15158A = fB2;
        h((int) g.b(this.f15169x, fB, fB2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f15160C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f15163r.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f15162q.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f15163r.remove(animatorListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f15164s.remove(animatorPauseListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f15162q.remove(animatorUpdateListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f15166u) {
            return;
        }
        this.f15166u = false;
        this.f15165t = -this.f15165t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
