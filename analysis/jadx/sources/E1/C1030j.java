package e1;

import d1.C0950a;
import d1.C0953d;
import java.util.ArrayList;

/* JADX INFO: renamed from: e1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1030j extends AbstractC1035o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.InterfaceC1024d
    public final void a(InterfaceC1024d interfaceC1024d) {
        C0950a c0950a = (C0950a) this.f12540b;
        int i = c0950a.f11799s0;
        C1026f c1026f = this.f12545h;
        ArrayList arrayList = c1026f.f12526l;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = -1;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            int i10 = ((C1026f) obj).f12523g;
            if (i8 == -1 || i10 < i8) {
                i8 = i10;
            }
            if (i7 < i10) {
                i7 = i10;
            }
        }
        if (i == 0 || i == 2) {
            c1026f.d(i8 + c0950a.f11801u0);
        } else {
            c1026f.d(i7 + c0950a.f11801u0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void d() {
        C0953d c0953d = this.f12540b;
        if (c0953d instanceof C0950a) {
            C1026f c1026f = this.f12545h;
            c1026f.f12519b = true;
            C0950a c0950a = (C0950a) c0953d;
            int i = c0950a.f11799s0;
            boolean z5 = c0950a.f11800t0;
            int i7 = 0;
            if (i == 0) {
                c1026f.f12522e = 4;
                while (i7 < c0950a.f11966r0) {
                    C0953d c0953d2 = c0950a.f11965q0[i7];
                    if (z5 || c0953d2.f11862g0 != 8) {
                        C1026f c1026f2 = c0953d2.f11856d.f12545h;
                        c1026f2.f12525k.add(c1026f);
                        c1026f.f12526l.add(c1026f2);
                    }
                    i7++;
                }
                m(this.f12540b.f11856d.f12545h);
                m(this.f12540b.f11856d.i);
                return;
            }
            if (i == 1) {
                c1026f.f12522e = 5;
                while (i7 < c0950a.f11966r0) {
                    C0953d c0953d3 = c0950a.f11965q0[i7];
                    if (z5 || c0953d3.f11862g0 != 8) {
                        C1026f c1026f3 = c0953d3.f11856d.i;
                        c1026f3.f12525k.add(c1026f);
                        c1026f.f12526l.add(c1026f3);
                    }
                    i7++;
                }
                m(this.f12540b.f11856d.f12545h);
                m(this.f12540b.f11856d.i);
                return;
            }
            if (i == 2) {
                c1026f.f12522e = 6;
                while (i7 < c0950a.f11966r0) {
                    C0953d c0953d4 = c0950a.f11965q0[i7];
                    if (z5 || c0953d4.f11862g0 != 8) {
                        C1026f c1026f4 = c0953d4.f11858e.f12545h;
                        c1026f4.f12525k.add(c1026f);
                        c1026f.f12526l.add(c1026f4);
                    }
                    i7++;
                }
                m(this.f12540b.f11858e.f12545h);
                m(this.f12540b.f11858e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c1026f.f12522e = 7;
            while (i7 < c0950a.f11966r0) {
                C0953d c0953d5 = c0950a.f11965q0[i7];
                if (z5 || c0953d5.f11862g0 != 8) {
                    C1026f c1026f5 = c0953d5.f11858e.i;
                    c1026f5.f12525k.add(c1026f);
                    c1026f.f12526l.add(c1026f5);
                }
                i7++;
            }
            m(this.f12540b.f11858e.f12545h);
            m(this.f12540b.f11858e.i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void e() {
        C0953d c0953d = this.f12540b;
        if (c0953d instanceof C0950a) {
            int i = ((C0950a) c0953d).f11799s0;
            C1026f c1026f = this.f12545h;
            if (i == 0 || i == 1) {
                c0953d.f11848Y = c1026f.f12523g;
            } else {
                c0953d.f11849Z = c1026f.f12523g;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void f() {
        this.f12541c = null;
        this.f12545h.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final boolean k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(C1026f c1026f) {
        C1026f c1026f2 = this.f12545h;
        c1026f2.f12525k.add(c1026f);
        c1026f.f12526l.add(c1026f2);
    }
}
