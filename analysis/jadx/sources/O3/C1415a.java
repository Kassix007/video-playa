package o3;

import a3.C0632k;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import i3.C1139d;

/* JADX INFO: renamed from: o3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1415a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0632k f15412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f15415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f15416e;
    public final Interpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f15418h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f15423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f15424p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1415a(C0632k c0632k, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f, Float f7) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f15419k = 784923401;
        this.f15420l = 784923401;
        this.f15421m = Float.MIN_VALUE;
        this.f15422n = Float.MIN_VALUE;
        this.f15423o = null;
        this.f15424p = null;
        this.f15412a = c0632k;
        this.f15413b = obj;
        this.f15414c = obj2;
        this.f15415d = baseInterpolator;
        this.f15416e = null;
        this.f = null;
        this.f15417g = f;
        this.f15418h = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float a() {
        C0632k c0632k = this.f15412a;
        if (c0632k == null) {
            return 1.0f;
        }
        if (this.f15422n == Float.MIN_VALUE) {
            if (this.f15418h == null) {
                this.f15422n = 1.0f;
            } else {
                this.f15422n = (float) (((double) b()) + (((double) (this.f15418h.floatValue() - this.f15417g)) / ((double) (c0632k.f8842m - c0632k.f8841l))));
            }
        }
        return this.f15422n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b() {
        C0632k c0632k = this.f15412a;
        if (c0632k == null) {
            return 0.0f;
        }
        if (this.f15421m == Float.MIN_VALUE) {
            float f = c0632k.f8841l;
            this.f15421m = (this.f15417g - f) / (c0632k.f8842m - f);
        }
        return this.f15421m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        return this.f15415d == null && this.f15416e == null && this.f == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Keyframe{startValue=" + this.f15413b + ", endValue=" + this.f15414c + ", startFrame=" + this.f15417g + ", endFrame=" + this.f15418h + ", interpolator=" + this.f15415d + '}';
    }

    public C1415a(C0632k c0632k, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f15419k = 784923401;
        this.f15420l = 784923401;
        this.f15421m = Float.MIN_VALUE;
        this.f15422n = Float.MIN_VALUE;
        this.f15423o = null;
        this.f15424p = null;
        this.f15412a = c0632k;
        this.f15413b = obj;
        this.f15414c = obj2;
        this.f15415d = null;
        this.f15416e = baseInterpolator;
        this.f = baseInterpolator2;
        this.f15417g = f;
        this.f15418h = null;
    }

    public C1415a(C0632k c0632k, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f7) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f15419k = 784923401;
        this.f15420l = 784923401;
        this.f15421m = Float.MIN_VALUE;
        this.f15422n = Float.MIN_VALUE;
        this.f15423o = null;
        this.f15424p = null;
        this.f15412a = c0632k;
        this.f15413b = obj;
        this.f15414c = obj2;
        this.f15415d = interpolator;
        this.f15416e = interpolator2;
        this.f = interpolator3;
        this.f15417g = f;
        this.f15418h = f7;
    }

    public C1415a(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f15419k = 784923401;
        this.f15420l = 784923401;
        this.f15421m = Float.MIN_VALUE;
        this.f15422n = Float.MIN_VALUE;
        this.f15423o = null;
        this.f15424p = null;
        this.f15412a = null;
        this.f15413b = obj;
        this.f15414c = obj;
        this.f15415d = null;
        this.f15416e = null;
        this.f = null;
        this.f15417g = Float.MIN_VALUE;
        this.f15418h = Float.valueOf(Float.MAX_VALUE);
    }

    public C1415a(C1139d c1139d, C1139d c1139d2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f15419k = 784923401;
        this.f15420l = 784923401;
        this.f15421m = Float.MIN_VALUE;
        this.f15422n = Float.MIN_VALUE;
        this.f15423o = null;
        this.f15424p = null;
        this.f15412a = null;
        this.f15413b = c1139d;
        this.f15414c = c1139d2;
        this.f15415d = null;
        this.f15416e = null;
        this.f = null;
        this.f15417g = Float.MIN_VALUE;
        this.f15418h = Float.valueOf(Float.MAX_VALUE);
    }
}
