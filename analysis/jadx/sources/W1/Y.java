package w1;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f18177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18178d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y(int i, Interpolator interpolator, long j) {
        this.f18175a = i;
        this.f18177c = interpolator;
        this.f18178d = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long a() {
        return this.f18178d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float b() {
        Interpolator interpolator = this.f18177c;
        return interpolator != null ? interpolator.getInterpolation(this.f18176b) : this.f18176b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int c() {
        return this.f18175a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(float f) {
        this.f18176b = f;
    }
}
