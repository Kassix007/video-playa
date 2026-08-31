package L;

import B0.C0050o;
import B0.N;
import P.C0345b;
import P.C0354f0;
import P.W;
import P.w0;
import android.view.ViewGroup;
import j0.AbstractC1148c;
import java.util.LinkedHashMap;
import l0.C1219b;
import v.Q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w0, j, Q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f2996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f2997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f2998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f2999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final W f3000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final W f3001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewGroup f3002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f3003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0354f0 f3004y = C0345b.q(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0354f0 f3005z = C0345b.q(Boolean.TRUE);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f2993A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f2994B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final A0.d f2995C = new A0.d(5, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(boolean z5, float f, W w3, W w6, ViewGroup viewGroup) {
        this.f2996q = z5;
        this.f2997r = new s(z5, new C.j(w6, 3));
        this.f2998s = z5;
        this.f2999t = f;
        this.f3000u = w3;
        this.f3001v = w6;
        this.f3002w = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // L.j
    public final void Y() {
        this.f3004y.setValue(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v.Q
    public final void a(N n7) {
        C1219b c1219b = n7.f296q;
        this.f2993A = c1219b.d();
        float f = this.f2999t;
        this.f2994B = Float.isNaN(f) ? D5.a.G(h.a(n7, this.f2998s, c1219b.d())) : c1219b.G(f);
        long j = ((j0.o) this.f3000u.getValue()).f13724a;
        float f7 = ((g) this.f3001v.getValue()).f3032d;
        n7.a();
        this.f2997r.c(n7, Float.isNaN(f) ? h.a(n7, this.f2996q, c1219b.d()) : n7.u(f), j);
        j0.m mVarT = c1219b.f14425r.t();
        ((Boolean) this.f3005z.getValue()).booleanValue();
        k kVar = (k) this.f3004y.getValue();
        if (kVar != null) {
            kVar.e(c1219b.d(), this.f2994B, j, f7);
            kVar.draw(AbstractC1148c.a(mVarT));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void c() {
        i iVar = this.f3003x;
        if (iVar != null) {
            Y();
            C0050o c0050o = iVar.f3037t;
            k kVar = (k) ((LinkedHashMap) c0050o.f499q).get(this);
            if (kVar != null) {
                kVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0050o.f499q;
                k kVar2 = (k) linkedHashMap.get(this);
                if (kVar2 != null) {
                }
                linkedHashMap.remove(this);
                iVar.f3036s.add(kVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void e() {
        i iVar = this.f3003x;
        if (iVar != null) {
            Y();
            C0050o c0050o = iVar.f3037t;
            k kVar = (k) ((LinkedHashMap) c0050o.f499q).get(this);
            if (kVar != null) {
                kVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0050o.f499q;
                k kVar2 = (k) linkedHashMap.get(this);
                if (kVar2 != null) {
                }
                linkedHashMap.remove(this);
                iVar.f3036s.add(kVar);
            }
        }
    }

    @Override // P.w0
    public final void b() {
    }
}
