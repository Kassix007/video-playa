package o0;

import B0.N;
import W0.l;
import W1.d;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import i0.C1131c;
import i1.C1134a;
import j0.AbstractC1145B;
import j0.j;
import kotlin.jvm.internal.m;
import l0.C1219b;

/* JADX INFO: renamed from: o0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1412b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f15327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f15329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f15330t = 1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f15331u = l.f8022q;

    public abstract boolean a(float f);

    public abstract boolean d(j jVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(N n7, long j, float f, j jVar) {
        C1219b c1219b = n7.f296q;
        if (this.f15330t != f) {
            if (!a(f)) {
                if (f == 1.0f) {
                    d dVar = this.f15327q;
                    if (dVar != null) {
                        dVar.c(f);
                    }
                    this.f15328r = false;
                } else {
                    d dVarF = this.f15327q;
                    if (dVarF == null) {
                        dVarF = AbstractC1145B.f();
                        this.f15327q = dVarF;
                    }
                    dVarF.c(f);
                    this.f15328r = true;
                }
            }
            this.f15330t = f;
        }
        if (!m.a(this.f15329s, jVar)) {
            if (!d(jVar)) {
                if (jVar == null) {
                    d dVar2 = this.f15327q;
                    if (dVar2 != null) {
                        dVar2.f(null);
                    }
                    this.f15328r = false;
                } else {
                    d dVarF2 = this.f15327q;
                    if (dVarF2 == null) {
                        dVarF2 = AbstractC1145B.f();
                        this.f15327q = dVarF2;
                    }
                    dVarF2.f(jVar);
                    this.f15328r = true;
                }
            }
            this.f15329s = jVar;
        }
        l layoutDirection = n7.getLayoutDirection();
        if (this.f15331u != layoutDirection) {
            f(layoutDirection);
            this.f15331u = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1219b.d() >> 32)) - Float.intBitsToFloat(i);
        int i7 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1219b.d() & 4294967295L)) - Float.intBitsToFloat(i7);
        ((C1134a) c1219b.f14425r.f234r).v(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i7) > 0.0f) {
                    if (this.f15328r) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        C1131c c1131cC = AbstractC0836n2.c(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i7))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        j0.m mVarT = c1219b.f14425r.t();
                        d dVarF3 = this.f15327q;
                        if (dVarF3 == null) {
                            dVarF3 = AbstractC1145B.f();
                            this.f15327q = dVarF3;
                        }
                        try {
                            mVarT.l(c1131cC, dVarF3);
                            i(n7);
                            mVarT.i();
                        } catch (Throwable th) {
                            mVarT.i();
                            throw th;
                        }
                    } else {
                        i(n7);
                    }
                }
            } catch (Throwable th2) {
                ((C1134a) c1219b.f14425r.f234r).v(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((C1134a) c1219b.f14425r.f234r).v(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(N n7);

    public void f(l lVar) {
    }
}
