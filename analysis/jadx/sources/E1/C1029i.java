package e1;

import d1.C0953d;

/* JADX INFO: renamed from: e1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1029i extends AbstractC1035o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.InterfaceC1024d
    public final void a(InterfaceC1024d interfaceC1024d) {
        C1026f c1026f = this.f12545h;
        if (c1026f.f12520c && !c1026f.j) {
            c1026f.d((int) ((((C1026f) c1026f.f12526l.get(0)).f12523g * ((d1.h) this.f12540b).f11959q0) + 0.5f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void d() {
        C0953d c0953d = this.f12540b;
        d1.h hVar = (d1.h) c0953d;
        int i = hVar.f11960r0;
        int i7 = hVar.f11961s0;
        int i8 = hVar.f11963u0;
        C1026f c1026f = this.f12545h;
        if (i8 == 1) {
            if (i != -1) {
                c1026f.f12526l.add(c0953d.f11843T.f11856d.f12545h);
                this.f12540b.f11843T.f11856d.f12545h.f12525k.add(c1026f);
                c1026f.f = i;
            } else if (i7 != -1) {
                c1026f.f12526l.add(c0953d.f11843T.f11856d.i);
                this.f12540b.f11843T.f11856d.i.f12525k.add(c1026f);
                c1026f.f = -i7;
            } else {
                c1026f.f12519b = true;
                c1026f.f12526l.add(c0953d.f11843T.f11856d.i);
                this.f12540b.f11843T.f11856d.i.f12525k.add(c1026f);
            }
            m(this.f12540b.f11856d.f12545h);
            m(this.f12540b.f11856d.i);
            return;
        }
        if (i != -1) {
            c1026f.f12526l.add(c0953d.f11843T.f11858e.f12545h);
            this.f12540b.f11843T.f11858e.f12545h.f12525k.add(c1026f);
            c1026f.f = i;
        } else if (i7 != -1) {
            c1026f.f12526l.add(c0953d.f11843T.f11858e.i);
            this.f12540b.f11843T.f11858e.i.f12525k.add(c1026f);
            c1026f.f = -i7;
        } else {
            c1026f.f12519b = true;
            c1026f.f12526l.add(c0953d.f11843T.f11858e.i);
            this.f12540b.f11843T.f11858e.i.f12525k.add(c1026f);
        }
        m(this.f12540b.f11858e.f12545h);
        m(this.f12540b.f11858e.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void e() {
        C0953d c0953d = this.f12540b;
        int i = ((d1.h) c0953d).f11963u0;
        C1026f c1026f = this.f12545h;
        if (i == 1) {
            c0953d.f11848Y = c1026f.f12523g;
        } else {
            c0953d.f11849Z = c1026f.f12523g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void f() {
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
