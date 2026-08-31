package d1;

import e1.C1022b;
import g1.C1076f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f11925A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public C1022b f11926B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public C1076f f11927C0;
    public int D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f11928E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f11929F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f11930G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f11931H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f11932I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public float f11933J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public float f11934K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public float f11935L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public float f11936M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public float f11937N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public float f11938O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f11939P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f11940Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int f11941R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f11942S0;
    public int T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f11943U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f11944V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public ArrayList f11945W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public C0953d[] f11946X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public C0953d[] f11947Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int[] f11948Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public C0953d[] f11949a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f11950b1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f11951s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f11952t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f11953u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f11954v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f11955w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f11956x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f11957y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f11958z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.i
    public final void S() {
        for (int i = 0; i < this.f11966r0; i++) {
            C0953d c0953d = this.f11965q0[i];
            if (c0953d != null) {
                c0953d.f11829F = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int T(C0953d c0953d, int i) {
        C0953d c0953d2;
        if (c0953d != null) {
            int[] iArr = c0953d.f11878p0;
            if (iArr[1] == 3) {
                int i7 = c0953d.f11881s;
                if (i7 != 0) {
                    if (i7 == 2) {
                        int i8 = (int) (c0953d.f11888z * i);
                        if (i8 != c0953d.k()) {
                            c0953d.f11861g = true;
                            V(iArr[0], c0953d.q(), 1, i8, c0953d);
                        }
                        return i8;
                    }
                    c0953d2 = c0953d;
                    if (i7 == 1) {
                        return c0953d2.k();
                    }
                    if (i7 == 3) {
                        return (int) ((c0953d2.q() * c0953d2.f11846W) + 0.5f);
                    }
                }
            } else {
                c0953d2 = c0953d;
            }
            return c0953d2.k();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int U(C0953d c0953d, int i) {
        C0953d c0953d2;
        if (c0953d != null) {
            int[] iArr = c0953d.f11878p0;
            if (iArr[0] == 3) {
                int i7 = c0953d.f11880r;
                if (i7 != 0) {
                    if (i7 == 2) {
                        int i8 = (int) (c0953d.f11885w * i);
                        if (i8 != c0953d.q()) {
                            c0953d.f11861g = true;
                            V(1, i8, iArr[1], c0953d.k(), c0953d);
                        }
                        return i8;
                    }
                    c0953d2 = c0953d;
                    if (i7 == 1) {
                        return c0953d2.q();
                    }
                    if (i7 == 3) {
                        return (int) ((c0953d2.k() * c0953d2.f11846W) + 0.5f);
                    }
                }
            } else {
                c0953d2 = c0953d;
            }
            return c0953d2.q();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(int i, int i7, int i8, int i9, C0953d c0953d) {
        C1076f c1076f;
        C0953d c0953d2;
        C1022b c1022b = this.f11926B0;
        while (true) {
            c1076f = this.f11927C0;
            if (c1076f != null || (c0953d2 = this.f11843T) == null) {
                break;
            } else {
                this.f11927C0 = ((e) c0953d2).f11904u0;
            }
        }
        c1022b.f12502a = i;
        c1022b.f12503b = i8;
        c1022b.f12504c = i7;
        c1022b.f12505d = i9;
        c1076f.b(c0953d, c1022b);
        c0953d.O(c1022b.f12506e);
        c0953d.L(c1022b.f);
        c0953d.f11828E = c1022b.f12508h;
        c0953d.I(c1022b.f12507g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d1.C0953d
    public final void b(b1.c cVar, boolean z5) {
        C0953d c0953d;
        float f;
        int i;
        ArrayList arrayList = this.f11945W0;
        super.b(cVar, z5);
        C0953d c0953d2 = this.f11843T;
        boolean z6 = c0953d2 != null && ((e) c0953d2).f11905v0;
        int i7 = this.T0;
        if (i7 != 0) {
            if (i7 == 1) {
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    ((f) arrayList.get(i8)).b(i8, z6, i8 == size + (-1));
                    i8++;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    int size2 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        ((f) arrayList.get(i9)).b(i9, z6, i9 == size2 + (-1));
                        i9++;
                    }
                }
            } else if (this.f11948Z0 != null && this.f11947Y0 != null && this.f11946X0 != null) {
                for (int i10 = 0; i10 < this.f11950b1; i10++) {
                    this.f11949a1[i10].D();
                }
                int[] iArr = this.f11948Z0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float f7 = this.f11933J0;
                C0953d c0953d3 = null;
                int i13 = 0;
                while (i13 < i11) {
                    if (z6) {
                        i = (i11 - i13) - 1;
                        f = 1.0f - this.f11933J0;
                    } else {
                        f = f7;
                        i = i13;
                    }
                    C0953d c0953d4 = this.f11947Y0[i];
                    if (c0953d4 != null) {
                        C0952c c0952c = c0953d4.f11832I;
                        if (c0953d4.f11862g0 != 8) {
                            if (i13 == 0) {
                                c0953d4.f(c0952c, this.f11832I, this.f11955w0);
                                c0953d4.f11865i0 = this.D0;
                                c0953d4.f11857d0 = f;
                            }
                            if (i13 == i11 - 1) {
                                c0953d4.f(c0953d4.f11834K, this.f11834K, this.f11956x0);
                            }
                            if (i13 > 0 && c0953d3 != null) {
                                C0952c c0952c2 = c0953d3.f11834K;
                                c0953d4.f(c0952c, c0952c2, this.f11939P0);
                                c0953d3.f(c0952c2, c0952c, 0);
                            }
                            c0953d3 = c0953d4;
                        }
                    }
                    i13++;
                    f7 = f;
                }
                for (int i14 = 0; i14 < i12; i14++) {
                    C0953d c0953d5 = this.f11946X0[i14];
                    if (c0953d5 != null) {
                        C0952c c0952c3 = c0953d5.f11833J;
                        if (c0953d5.f11862g0 != 8) {
                            if (i14 == 0) {
                                c0953d5.f(c0952c3, this.f11833J, this.f11951s0);
                                c0953d5.f11866j0 = this.f11928E0;
                                c0953d5.f11859e0 = this.f11934K0;
                            }
                            if (i14 == i12 - 1) {
                                c0953d5.f(c0953d5.f11835L, this.f11835L, this.f11952t0);
                            }
                            if (i14 > 0 && c0953d3 != null) {
                                C0952c c0952c4 = c0953d3.f11835L;
                                c0953d5.f(c0952c3, c0952c4, this.f11940Q0);
                                c0953d3.f(c0952c4, c0952c3, 0);
                            }
                            c0953d3 = c0953d5;
                        }
                    }
                }
                for (int i15 = 0; i15 < i11; i15++) {
                    for (int i16 = 0; i16 < i12; i16++) {
                        int i17 = (i16 * i11) + i15;
                        if (this.f11944V0 == 1) {
                            i17 = (i15 * i12) + i16;
                        }
                        C0953d[] c0953dArr = this.f11949a1;
                        if (i17 < c0953dArr.length && (c0953d = c0953dArr[i17]) != null && c0953d.f11862g0 != 8) {
                            C0953d c0953d6 = this.f11947Y0[i15];
                            C0953d c0953d7 = this.f11946X0[i16];
                            if (c0953d != c0953d6) {
                                c0953d.f(c0953d.f11832I, c0953d6.f11832I, 0);
                                c0953d.f(c0953d.f11834K, c0953d6.f11834K, 0);
                            }
                            if (c0953d != c0953d7) {
                                c0953d.f(c0953d.f11833J, c0953d7.f11833J, 0);
                                c0953d.f(c0953d.f11835L, c0953d7.f11835L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z6, true);
        }
        this.f11957y0 = false;
    }
}
