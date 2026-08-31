package p0;

import B0.G0;
import i1.C1134a;
import j0.AbstractC1145B;
import j0.C1152g;
import java.util.ArrayList;
import java.util.List;
import l0.InterfaceC1221d;
import m0.C1346a;

/* JADX INFO: renamed from: p0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1435c extends AbstractC1428B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f15526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15527c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15528d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15529e = j0.o.f13722g;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1152g f15531h;
    public B5.c i;
    public final C1346a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f15532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f15534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f15538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f15539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15540s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1435c() {
        int i = AbstractC1432F.f15497a;
        this.f = n5.s.f15299q;
        this.f15530g = true;
        this.j = new C1346a(1, this);
        this.f15532k = "";
        this.f15536o = 1.0f;
        this.f15537p = 1.0f;
        this.f15540s = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p0.AbstractC1428B
    public final void a(InterfaceC1221d interfaceC1221d) {
        if (this.f15540s) {
            float[] fArrJ = this.f15526b;
            if (fArrJ == null) {
                fArrJ = AbstractC1145B.j();
                this.f15526b = fArrJ;
            } else {
                AbstractC1145B.q(fArrJ);
            }
            AbstractC1145B.y(fArrJ, this.f15538q + this.f15534m, this.f15539r + this.f15535n);
            float f = this.f15533l;
            if (fArrJ.length >= 16) {
                double d5 = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d5);
                float fCos = (float) Math.cos(d5);
                float f7 = fArrJ[0];
                float f8 = fArrJ[4];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = -fSin;
                float f11 = (f8 * fCos) + (f7 * f10);
                float f12 = fArrJ[1];
                float f13 = fArrJ[5];
                float f14 = (fSin * f13) + (fCos * f12);
                float f15 = (f13 * fCos) + (f12 * f10);
                float f16 = fArrJ[2];
                float f17 = fArrJ[6];
                float f18 = (fSin * f17) + (fCos * f16);
                float f19 = (f17 * fCos) + (f16 * f10);
                float f20 = fArrJ[3];
                float f21 = fArrJ[7];
                float f22 = (fSin * f21) + (fCos * f20);
                fArrJ[0] = f9;
                fArrJ[1] = f14;
                fArrJ[2] = f18;
                fArrJ[3] = f22;
                fArrJ[4] = f11;
                fArrJ[5] = f15;
                fArrJ[6] = f19;
                fArrJ[7] = (fCos * f21) + (f10 * f20);
            }
            float f23 = this.f15536o;
            float f24 = this.f15537p;
            if (fArrJ.length >= 16) {
                fArrJ[0] = fArrJ[0] * f23;
                fArrJ[1] = fArrJ[1] * f23;
                fArrJ[2] = fArrJ[2] * f23;
                fArrJ[3] = fArrJ[3] * f23;
                fArrJ[4] = fArrJ[4] * f24;
                fArrJ[5] = fArrJ[5] * f24;
                fArrJ[6] = fArrJ[6] * f24;
                fArrJ[7] = fArrJ[7] * f24;
                fArrJ[8] = fArrJ[8] * 1.0f;
                fArrJ[9] = fArrJ[9] * 1.0f;
                fArrJ[10] = fArrJ[10] * 1.0f;
                fArrJ[11] = fArrJ[11] * 1.0f;
            }
            AbstractC1145B.y(fArrJ, -this.f15534m, -this.f15535n);
            this.f15540s = false;
        }
        if (this.f15530g) {
            if (!this.f.isEmpty()) {
                C1152g c1152gA = this.f15531h;
                if (c1152gA == null) {
                    c1152gA = j0.i.a();
                    this.f15531h = c1152gA;
                }
                AbstractC1434b.c(this.f, c1152gA);
            }
            this.f15530g = false;
        }
        G0 g0Z = interfaceC1221d.z();
        long jE = g0Z.E();
        g0Z.t().k();
        try {
            G0 g02 = (G0) ((C1134a) g0Z.f234r).f13535r;
            float[] fArr = this.f15526b;
            if (fArr != null) {
                g02.t().o(fArr);
            }
            C1152g c1152g = this.f15531h;
            if (!this.f.isEmpty() && c1152g != null) {
                g02.t().a(c1152g);
            }
            ArrayList arrayList = this.f15527c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1428B) arrayList.get(i)).a(interfaceC1221d);
            }
        } finally {
            g0Z.t().i();
            g0Z.X(jE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p0.AbstractC1428B
    public final B5.c b() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p0.AbstractC1428B
    public final void d(C1346a c1346a) {
        this.i = c1346a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, AbstractC1428B abstractC1428B) {
        ArrayList arrayList = this.f15527c;
        if (i < arrayList.size()) {
            arrayList.set(i, abstractC1428B);
        } else {
            arrayList.add(abstractC1428B);
        }
        g(abstractC1428B);
        abstractC1428B.d(this.j);
        c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(long j) {
        if (this.f15528d && j != 16) {
            long j7 = this.f15529e;
            if (j7 == 16) {
                this.f15529e = j;
                return;
            }
            int i = AbstractC1432F.f15497a;
            if (j0.o.h(j7) == j0.o.h(j) && j0.o.g(j7) == j0.o.g(j) && j0.o.e(j7) == j0.o.e(j)) {
                return;
            }
            this.f15528d = false;
            this.f15529e = j0.o.f13722g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(AbstractC1428B abstractC1428B) {
        if (!(abstractC1428B instanceof C1439g)) {
            if (abstractC1428B instanceof C1435c) {
                C1435c c1435c = (C1435c) abstractC1428B;
                if (c1435c.f15528d && this.f15528d) {
                    f(c1435c.f15529e);
                    return;
                } else {
                    this.f15528d = false;
                    this.f15529e = j0.o.f13722g;
                    return;
                }
            }
            return;
        }
        C1439g c1439g = (C1439g) abstractC1428B;
        AbstractC1145B abstractC1145B = c1439g.f15560b;
        if (this.f15528d && abstractC1145B != null) {
            if (abstractC1145B instanceof j0.G) {
                f(((j0.G) abstractC1145B).f13692e);
            } else {
                this.f15528d = false;
                this.f15529e = j0.o.f13722g;
            }
        }
        AbstractC1145B abstractC1145B2 = c1439g.f15564g;
        if (this.f15528d && abstractC1145B2 != null) {
            if (abstractC1145B2 instanceof j0.G) {
                f(((j0.G) abstractC1145B2).f13692e);
            } else {
                this.f15528d = false;
                this.f15529e = j0.o.f13722g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f15532k);
        ArrayList arrayList = this.f15527c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1428B abstractC1428B = (AbstractC1428B) arrayList.get(i);
            sb.append("\t");
            sb.append(abstractC1428B.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
