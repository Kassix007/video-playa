package g3;

import C0.S;
import android.graphics.PointF;

/* JADX INFO: renamed from: g3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1083b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13045e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13047h;
    public int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f13049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f13050m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iA = ((O.c.a(this.f13044d) + (((int) (S.h(this.f13042b, this.f13041a.hashCode() * 31, 31) + this.f13043c)) * 31)) * 31) + this.f13045e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iA * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f13047h;
    }
}
