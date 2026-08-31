package e1;

import d1.C0952c;
import d1.C0953d;

/* JADX INFO: renamed from: e1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1033m extends AbstractC1035o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1026f f12532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1021a f12533l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.InterfaceC1024d
    public final void a(InterfaceC1024d interfaceC1024d) {
        float f;
        float f7;
        float f8;
        int i;
        if (O.c.a(this.j) == 3) {
            C0953d c0953d = this.f12540b;
            l(c0953d.f11833J, c0953d.f11835L, 1);
            return;
        }
        C1027g c1027g = this.f12543e;
        if (c1027g.f12520c && !c1027g.j && this.f12542d == 3) {
            C0953d c0953d2 = this.f12540b;
            int i7 = c0953d2.f11881s;
            if (i7 == 2) {
                C0953d c0953d3 = c0953d2.f11843T;
                if (c0953d3 != null) {
                    if (c0953d3.f11858e.f12543e.j) {
                        c1027g.d((int) ((r5.f12523g * c0953d2.f11888z) + 0.5f));
                    }
                }
            } else if (i7 == 3) {
                C1027g c1027g2 = c0953d2.f11856d.f12543e;
                if (c1027g2.j) {
                    int i8 = c0953d2.f11847X;
                    if (i8 == -1) {
                        f = c1027g2.f12523g;
                        f7 = c0953d2.f11846W;
                    } else if (i8 == 0) {
                        f8 = c1027g2.f12523g * c0953d2.f11846W;
                        i = (int) (f8 + 0.5f);
                        c1027g.d(i);
                    } else if (i8 != 1) {
                        i = 0;
                        c1027g.d(i);
                    } else {
                        f = c1027g2.f12523g;
                        f7 = c0953d2.f11846W;
                    }
                    f8 = f / f7;
                    i = (int) (f8 + 0.5f);
                    c1027g.d(i);
                }
            }
        }
        C1026f c1026f = this.f12545h;
        if (c1026f.f12520c) {
            C1026f c1026f2 = this.i;
            if (c1026f2.f12520c) {
                if (c1026f.j && c1026f2.j && c1027g.j) {
                    return;
                }
                if (!c1027g.j && this.f12542d == 3) {
                    C0953d c0953d4 = this.f12540b;
                    if (c0953d4.f11880r == 0 && !c0953d4.y()) {
                        C1026f c1026f3 = (C1026f) c1026f.f12526l.get(0);
                        C1026f c1026f4 = (C1026f) c1026f2.f12526l.get(0);
                        int i9 = c1026f3.f12523g + c1026f.f;
                        int i10 = c1026f4.f12523g + c1026f2.f;
                        c1026f.d(i9);
                        c1026f2.d(i10);
                        c1027g.d(i10 - i9);
                        return;
                    }
                }
                if (!c1027g.j && this.f12542d == 3 && this.f12539a == 1 && c1026f.f12526l.size() > 0 && c1026f2.f12526l.size() > 0) {
                    C1026f c1026f5 = (C1026f) c1026f.f12526l.get(0);
                    int i11 = (((C1026f) c1026f2.f12526l.get(0)).f12523g + c1026f2.f) - (c1026f5.f12523g + c1026f.f);
                    int i12 = c1027g.f12527m;
                    if (i11 < i12) {
                        c1027g.d(i11);
                    } else {
                        c1027g.d(i12);
                    }
                }
                if (c1027g.j && c1026f.f12526l.size() > 0 && c1026f2.f12526l.size() > 0) {
                    C1026f c1026f6 = (C1026f) c1026f.f12526l.get(0);
                    C1026f c1026f7 = (C1026f) c1026f2.f12526l.get(0);
                    int i13 = c1026f6.f12523g;
                    int i14 = c1026f.f + i13;
                    int i15 = c1026f7.f12523g;
                    int i16 = c1026f2.f + i15;
                    float f9 = this.f12540b.f11859e0;
                    if (c1026f6 == c1026f7) {
                        f9 = 0.5f;
                    } else {
                        i13 = i14;
                        i15 = i16;
                    }
                    c1026f.d((int) ((((i15 - i13) - c1027g.f12523g) * f9) + i13 + 0.5f));
                    c1026f2.d(c1026f.f12523g + c1027g.f12523g);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void d() {
        C0953d c0953d;
        C0953d c0953d2;
        C0953d c0953d3;
        C0953d c0953d4;
        C1026f c1026f = this.f12532k;
        C0953d c0953d5 = this.f12540b;
        boolean z5 = c0953d5.f11850a;
        C1027g c1027g = this.f12543e;
        if (z5) {
            c1027g.d(c0953d5.k());
        }
        boolean z6 = c1027g.j;
        C1026f c1026f2 = this.i;
        C1026f c1026f3 = this.f12545h;
        if (!z6) {
            C0953d c0953d6 = this.f12540b;
            this.f12542d = c0953d6.f11878p0[1];
            if (c0953d6.f11828E) {
                this.f12533l = new C1021a(this);
            }
            int i = this.f12542d;
            if (i != 3) {
                if (i == 4 && (c0953d4 = this.f12540b.f11843T) != null && c0953d4.f11878p0[1] == 1) {
                    int iK = (c0953d4.k() - this.f12540b.f11833J.e()) - this.f12540b.f11835L.e();
                    AbstractC1035o.b(c1026f3, c0953d4.f11858e.f12545h, this.f12540b.f11833J.e());
                    AbstractC1035o.b(c1026f2, c0953d4.f11858e.i, -this.f12540b.f11835L.e());
                    c1027g.d(iK);
                    return;
                }
                if (i == 1) {
                    c1027g.d(this.f12540b.k());
                }
            }
        } else if (this.f12542d == 4 && (c0953d2 = (c0953d = this.f12540b).f11843T) != null && c0953d2.f11878p0[1] == 1) {
            AbstractC1035o.b(c1026f3, c0953d2.f11858e.f12545h, c0953d.f11833J.e());
            AbstractC1035o.b(c1026f2, c0953d2.f11858e.i, -this.f12540b.f11835L.e());
            return;
        }
        boolean z7 = c1027g.j;
        if (z7) {
            C0953d c0953d7 = this.f12540b;
            if (c0953d7.f11850a) {
                C0952c[] c0952cArr = c0953d7.f11840Q;
                C0952c c0952c = c0952cArr[2];
                C0952c c0952c2 = c0952c.f;
                if (c0952c2 != null && c0952cArr[3].f != null) {
                    if (c0953d7.y()) {
                        c1026f3.f = this.f12540b.f11840Q[2].e();
                        c1026f2.f = -this.f12540b.f11840Q[3].e();
                    } else {
                        C1026f c1026fH = AbstractC1035o.h(this.f12540b.f11840Q[2]);
                        if (c1026fH != null) {
                            AbstractC1035o.b(c1026f3, c1026fH, this.f12540b.f11840Q[2].e());
                        }
                        C1026f c1026fH2 = AbstractC1035o.h(this.f12540b.f11840Q[3]);
                        if (c1026fH2 != null) {
                            AbstractC1035o.b(c1026f2, c1026fH2, -this.f12540b.f11840Q[3].e());
                        }
                        c1026f3.f12519b = true;
                        c1026f2.f12519b = true;
                    }
                    C0953d c0953d8 = this.f12540b;
                    if (c0953d8.f11828E) {
                        AbstractC1035o.b(c1026f, c1026f3, c0953d8.f11851a0);
                        return;
                    }
                    return;
                }
                if (c0952c2 != null) {
                    C1026f c1026fH3 = AbstractC1035o.h(c0952c);
                    if (c1026fH3 != null) {
                        AbstractC1035o.b(c1026f3, c1026fH3, this.f12540b.f11840Q[2].e());
                        AbstractC1035o.b(c1026f2, c1026f3, c1027g.f12523g);
                        C0953d c0953d9 = this.f12540b;
                        if (c0953d9.f11828E) {
                            AbstractC1035o.b(c1026f, c1026f3, c0953d9.f11851a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0952c c0952c3 = c0952cArr[3];
                if (c0952c3.f != null) {
                    C1026f c1026fH4 = AbstractC1035o.h(c0952c3);
                    if (c1026fH4 != null) {
                        AbstractC1035o.b(c1026f2, c1026fH4, -this.f12540b.f11840Q[3].e());
                        AbstractC1035o.b(c1026f3, c1026f2, -c1027g.f12523g);
                    }
                    C0953d c0953d10 = this.f12540b;
                    if (c0953d10.f11828E) {
                        AbstractC1035o.b(c1026f, c1026f3, c0953d10.f11851a0);
                        return;
                    }
                    return;
                }
                C0952c c0952c4 = c0952cArr[4];
                if (c0952c4.f != null) {
                    C1026f c1026fH5 = AbstractC1035o.h(c0952c4);
                    if (c1026fH5 != null) {
                        AbstractC1035o.b(c1026f, c1026fH5, 0);
                        AbstractC1035o.b(c1026f3, c1026f, -this.f12540b.f11851a0);
                        AbstractC1035o.b(c1026f2, c1026f3, c1027g.f12523g);
                        return;
                    }
                    return;
                }
                if ((c0953d7 instanceof d1.i) || c0953d7.f11843T == null || c0953d7.i(7).f != null) {
                    return;
                }
                C0953d c0953d11 = this.f12540b;
                AbstractC1035o.b(c1026f3, c0953d11.f11843T.f11858e.f12545h, c0953d11.s());
                AbstractC1035o.b(c1026f2, c1026f3, c1027g.f12523g);
                C0953d c0953d12 = this.f12540b;
                if (c0953d12.f11828E) {
                    AbstractC1035o.b(c1026f, c1026f3, c0953d12.f11851a0);
                    return;
                }
                return;
            }
        }
        if (z7 || this.f12542d != 3) {
            c1027g.b(this);
        } else {
            C0953d c0953d13 = this.f12540b;
            int i7 = c0953d13.f11881s;
            if (i7 == 2) {
                C0953d c0953d14 = c0953d13.f11843T;
                if (c0953d14 != null) {
                    C1027g c1027g2 = c0953d14.f11858e.f12543e;
                    c1027g.f12526l.add(c1027g2);
                    c1027g2.f12525k.add(c1027g);
                    c1027g.f12519b = true;
                    c1027g.f12525k.add(c1026f3);
                    c1027g.f12525k.add(c1026f2);
                }
            } else if (i7 == 3 && !c0953d13.y()) {
                C0953d c0953d15 = this.f12540b;
                if (c0953d15.f11880r != 3) {
                    C1027g c1027g3 = c0953d15.f11856d.f12543e;
                    c1027g.f12526l.add(c1027g3);
                    c1027g3.f12525k.add(c1027g);
                    c1027g.f12519b = true;
                    c1027g.f12525k.add(c1026f3);
                    c1027g.f12525k.add(c1026f2);
                }
            }
        }
        C0953d c0953d16 = this.f12540b;
        C0952c[] c0952cArr2 = c0953d16.f11840Q;
        C0952c c0952c5 = c0952cArr2[2];
        C0952c c0952c6 = c0952c5.f;
        if (c0952c6 != null && c0952cArr2[3].f != null) {
            if (c0953d16.y()) {
                c1026f3.f = this.f12540b.f11840Q[2].e();
                c1026f2.f = -this.f12540b.f11840Q[3].e();
            } else {
                C1026f c1026fH6 = AbstractC1035o.h(this.f12540b.f11840Q[2]);
                C1026f c1026fH7 = AbstractC1035o.h(this.f12540b.f11840Q[3]);
                if (c1026fH6 != null) {
                    c1026fH6.b(this);
                }
                if (c1026fH7 != null) {
                    c1026fH7.b(this);
                }
                this.j = 4;
            }
            if (this.f12540b.f11828E) {
                c(c1026f, c1026f3, 1, this.f12533l);
            }
        } else if (c0952c6 != null) {
            C1026f c1026fH8 = AbstractC1035o.h(c0952c5);
            if (c1026fH8 != null) {
                AbstractC1035o.b(c1026f3, c1026fH8, this.f12540b.f11840Q[2].e());
                c(c1026f2, c1026f3, 1, c1027g);
                if (this.f12540b.f11828E) {
                    c(c1026f, c1026f3, 1, this.f12533l);
                }
                if (this.f12542d == 3) {
                    C0953d c0953d17 = this.f12540b;
                    if (c0953d17.f11846W > 0.0f) {
                        C1031k c1031k = c0953d17.f11856d;
                        if (c1031k.f12542d == 3) {
                            c1031k.f12543e.f12525k.add(c1027g);
                            c1027g.f12526l.add(this.f12540b.f11856d.f12543e);
                            c1027g.f12518a = this;
                        }
                    }
                }
            }
        } else {
            C0952c c0952c7 = c0952cArr2[3];
            if (c0952c7.f != null) {
                C1026f c1026fH9 = AbstractC1035o.h(c0952c7);
                if (c1026fH9 != null) {
                    AbstractC1035o.b(c1026f2, c1026fH9, -this.f12540b.f11840Q[3].e());
                    c(c1026f3, c1026f2, -1, c1027g);
                    if (this.f12540b.f11828E) {
                        c(c1026f, c1026f3, 1, this.f12533l);
                    }
                }
            } else {
                C0952c c0952c8 = c0952cArr2[4];
                if (c0952c8.f != null) {
                    C1026f c1026fH10 = AbstractC1035o.h(c0952c8);
                    if (c1026fH10 != null) {
                        AbstractC1035o.b(c1026f, c1026fH10, 0);
                        c(c1026f3, c1026f, -1, this.f12533l);
                        c(c1026f2, c1026f3, 1, c1027g);
                    }
                } else if (!(c0953d16 instanceof d1.i) && (c0953d3 = c0953d16.f11843T) != null) {
                    AbstractC1035o.b(c1026f3, c0953d3.f11858e.f12545h, c0953d16.s());
                    c(c1026f2, c1026f3, 1, c1027g);
                    if (this.f12540b.f11828E) {
                        c(c1026f, c1026f3, 1, this.f12533l);
                    }
                    if (this.f12542d == 3) {
                        C0953d c0953d18 = this.f12540b;
                        if (c0953d18.f11846W > 0.0f) {
                            C1031k c1031k2 = c0953d18.f11856d;
                            if (c1031k2.f12542d == 3) {
                                c1031k2.f12543e.f12525k.add(c1027g);
                                c1027g.f12526l.add(this.f12540b.f11856d.f12543e);
                                c1027g.f12518a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c1027g.f12526l.size() == 0) {
            c1027g.f12520c = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void e() {
        C1026f c1026f = this.f12545h;
        if (c1026f.j) {
            this.f12540b.f11849Z = c1026f.f12523g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final void f() {
        this.f12541c = null;
        this.f12545h.c();
        this.i.c();
        this.f12532k.c();
        this.f12543e.c();
        this.f12544g = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e1.AbstractC1035o
    public final boolean k() {
        return this.f12542d != 3 || this.f12540b.f11881s == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        this.f12544g = false;
        C1026f c1026f = this.f12545h;
        c1026f.c();
        c1026f.j = false;
        C1026f c1026f2 = this.i;
        c1026f2.c();
        c1026f2.j = false;
        C1026f c1026f3 = this.f12532k;
        c1026f3.c();
        c1026f3.j = false;
        this.f12543e.j = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "VerticalRun " + this.f12540b.f11864h0;
    }
}
