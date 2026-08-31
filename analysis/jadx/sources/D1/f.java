package d1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11910a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0952c f11913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0952c f11914e;
    public C0952c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0952c f11915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11916h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11917k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f11924r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0953d f11911b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11912c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11918l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11919m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11920n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11921o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11922p = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(g gVar, int i, C0952c c0952c, C0952c c0952c2, C0952c c0952c3, C0952c c0952c4, int i7) {
        this.f11924r = gVar;
        this.f11910a = i;
        this.f11913d = c0952c;
        this.f11914e = c0952c2;
        this.f = c0952c3;
        this.f11915g = c0952c4;
        this.f11916h = gVar.f11955w0;
        this.i = gVar.f11951s0;
        this.j = gVar.f11956x0;
        this.f11917k = gVar.f11952t0;
        this.f11923q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(C0953d c0953d) {
        int i = this.f11910a;
        g gVar = this.f11924r;
        if (i == 0) {
            int iU = gVar.U(c0953d, this.f11923q);
            if (c0953d.f11878p0[0] == 3) {
                this.f11922p++;
                iU = 0;
            }
            this.f11918l = iU + (c0953d.f11862g0 != 8 ? gVar.f11939P0 : 0) + this.f11918l;
            int iT = gVar.T(c0953d, this.f11923q);
            if (this.f11911b == null || this.f11912c < iT) {
                this.f11911b = c0953d;
                this.f11912c = iT;
                this.f11919m = iT;
            }
        } else {
            int iU2 = gVar.U(c0953d, this.f11923q);
            int iT2 = gVar.T(c0953d, this.f11923q);
            if (c0953d.f11878p0[1] == 3) {
                this.f11922p++;
                iT2 = 0;
            }
            this.f11919m = iT2 + (c0953d.f11862g0 != 8 ? gVar.f11940Q0 : 0) + this.f11919m;
            if (this.f11911b == null || this.f11912c < iU2) {
                this.f11911b = c0953d;
                this.f11912c = iU2;
                this.f11918l = iU2;
            }
        }
        this.f11921o++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, boolean z5, boolean z6) {
        g gVar;
        int i7;
        int i8;
        C0953d c0953d;
        boolean z7;
        int i9;
        int i10;
        char c7;
        float f;
        float f7;
        float f8;
        int i11;
        float f9;
        float f10;
        int i12;
        int i13 = this.f11921o;
        int i14 = 0;
        while (true) {
            gVar = this.f11924r;
            if (i14 >= i13 || (i12 = this.f11920n + i14) >= gVar.f11950b1) {
                break;
            }
            C0953d c0953d2 = gVar.f11949a1[i12];
            if (c0953d2 != null) {
                c0953d2.D();
            }
            i14++;
        }
        if (i13 == 0 || this.f11911b == null) {
            return;
        }
        boolean z8 = z6 && i == 0;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = this.f11920n + (z5 ? (i13 - 1) - i17 : i17);
            if (i18 >= gVar.f11950b1) {
                break;
            }
            C0953d c0953d3 = gVar.f11949a1[i18];
            if (c0953d3 != null && c0953d3.f11862g0 == 0) {
                if (i15 == -1) {
                    i15 = i17;
                }
                i16 = i17;
            }
        }
        if (this.f11910a == 0) {
            C0953d c0953d4 = this.f11911b;
            c0953d4.f11866j0 = gVar.f11928E0;
            C0952c c0952c = c0953d4.f11835L;
            C0952c c0952c2 = c0953d4.f11833J;
            int i19 = this.i;
            if (i > 0) {
                i19 += gVar.f11940Q0;
            }
            c0952c2.a(this.f11914e, i19);
            if (z6) {
                c0952c.a(this.f11915g, this.f11917k);
            }
            if (i > 0) {
                this.f11914e.f11820d.f11835L.a(c0952c2, 0);
            }
            if (gVar.f11942S0 != 3 || c0953d4.f11828E) {
                c0953d = c0953d4;
            } else {
                for (int i20 = 0; i20 < i13; i20++) {
                    int i21 = this.f11920n + (z5 ? (i13 - 1) - i20 : i20);
                    if (i21 >= gVar.f11950b1) {
                        break;
                    }
                    c0953d = gVar.f11949a1[i21];
                    if (c0953d.f11828E) {
                        break;
                    }
                }
                c0953d = c0953d4;
            }
            int i22 = 0;
            C0953d c0953d5 = null;
            while (i22 < i13) {
                int i23 = z5 ? (i13 - 1) - i22 : i22;
                int i24 = this.f11920n + i23;
                if (i24 >= gVar.f11950b1) {
                    return;
                }
                C0953d c0953d6 = gVar.f11949a1[i24];
                if (c0953d6 == null) {
                    i10 = i13;
                    z7 = z8;
                    i9 = i16;
                    c7 = 3;
                } else {
                    C0952c c0952c3 = c0953d6.f11835L;
                    C0952c c0952c4 = c0953d6.f11833J;
                    C0952c c0952c5 = c0953d6.f11832I;
                    z7 = z8;
                    if (i22 == 0) {
                        i9 = i16;
                        c0953d6.f(c0952c5, this.f11913d, this.f11916h);
                    } else {
                        i9 = i16;
                    }
                    if (i23 == 0) {
                        int i25 = gVar.D0;
                        if (z5) {
                            f = 1.0f;
                            f7 = 1.0f - gVar.f11933J0;
                        } else {
                            f = 1.0f;
                            f7 = gVar.f11933J0;
                        }
                        if (this.f11920n == 0) {
                            i11 = gVar.f11929F0;
                            f8 = f7;
                            if (i11 != -1) {
                                if (z5) {
                                    f10 = gVar.f11935L0;
                                    f9 = f - f10;
                                    c0953d6.f11865i0 = i11;
                                    c0953d6.f11857d0 = f9;
                                } else {
                                    f9 = gVar.f11935L0;
                                    c0953d6.f11865i0 = i11;
                                    c0953d6.f11857d0 = f9;
                                }
                            }
                        } else {
                            f8 = f7;
                        }
                        if (!z6 || (i11 = gVar.f11931H0) == -1) {
                            i11 = i25;
                            f9 = f8;
                        } else if (z5) {
                            f10 = gVar.f11937N0;
                            f9 = f - f10;
                        } else {
                            f9 = gVar.f11937N0;
                        }
                        c0953d6.f11865i0 = i11;
                        c0953d6.f11857d0 = f9;
                    }
                    if (i22 == i13 - 1) {
                        i10 = i13;
                        c0953d6.f(c0953d6.f11834K, this.f, this.j);
                    } else {
                        i10 = i13;
                    }
                    if (c0953d5 != null) {
                        C0952c c0952c6 = c0953d5.f11834K;
                        c0952c5.a(c0952c6, gVar.f11939P0);
                        if (i22 == i15) {
                            int i26 = this.f11916h;
                            if (c0952c5.h()) {
                                c0952c5.f11823h = i26;
                            }
                        }
                        c0952c6.a(c0952c5, 0);
                        if (i22 == i9 + 1) {
                            int i27 = this.j;
                            if (c0952c6.h()) {
                                c0952c6.f11823h = i27;
                            }
                        }
                    }
                    if (c0953d6 != c0953d4) {
                        int i28 = gVar.f11942S0;
                        c7 = 3;
                        if (i28 == 3 && c0953d.f11828E && c0953d6 != c0953d && c0953d6.f11828E) {
                            c0953d6.f11836M.a(c0953d.f11836M, 0);
                        } else if (i28 == 0) {
                            c0952c4.a(c0952c2, 0);
                        } else if (i28 == 1) {
                            c0952c3.a(c0952c, 0);
                        } else if (z7) {
                            c0952c4.a(this.f11914e, this.i);
                            c0952c3.a(this.f11915g, this.f11917k);
                        } else {
                            c0952c4.a(c0952c2, 0);
                            c0952c3.a(c0952c, 0);
                        }
                    } else {
                        c7 = 3;
                    }
                    c0953d5 = c0953d6;
                }
                i22++;
                z8 = z7;
                i16 = i9;
                i13 = i10;
            }
            return;
        }
        int i29 = i13;
        boolean z9 = z8;
        int i30 = i16;
        C0953d c0953d7 = this.f11911b;
        c0953d7.f11865i0 = gVar.D0;
        C0952c c0952c7 = c0953d7.f11832I;
        C0952c c0952c8 = c0953d7.f11834K;
        int i31 = this.f11916h;
        if (i > 0) {
            i31 += gVar.f11939P0;
        }
        if (z5) {
            c0952c8.a(this.f, i31);
            if (z6) {
                c0952c7.a(this.f11913d, this.j);
            }
            if (i > 0) {
                this.f.f11820d.f11832I.a(c0952c8, 0);
            }
        } else {
            c0952c7.a(this.f11913d, i31);
            if (z6) {
                c0952c8.a(this.f, this.j);
            }
            if (i > 0) {
                this.f11913d.f11820d.f11834K.a(c0952c7, 0);
            }
        }
        int i32 = 0;
        C0953d c0953d8 = null;
        while (true) {
            int i33 = i29;
            if (i32 >= i33 || (i7 = this.f11920n + i32) >= gVar.f11950b1) {
                return;
            }
            C0953d c0953d9 = gVar.f11949a1[i7];
            if (c0953d9 == null) {
                i29 = i33;
            } else {
                C0952c c0952c9 = c0953d9.f11833J;
                C0952c c0952c10 = c0953d9.f11834K;
                C0952c c0952c11 = c0953d9.f11832I;
                if (i32 == 0) {
                    c0953d9.f(c0952c9, this.f11914e, this.i);
                    int i34 = gVar.f11928E0;
                    float f11 = gVar.f11934K0;
                    if (this.f11920n == 0) {
                        int i35 = gVar.f11930G0;
                        i29 = i33;
                        i8 = -1;
                        if (i35 != -1) {
                            f11 = gVar.f11936M0;
                        }
                        i34 = i35;
                        c0953d9.f11866j0 = i34;
                        c0953d9.f11859e0 = f11;
                    } else {
                        i29 = i33;
                        i8 = -1;
                    }
                    if (z6 && (i35 = gVar.f11932I0) != i8) {
                        f11 = gVar.f11938O0;
                        i34 = i35;
                    }
                    c0953d9.f11866j0 = i34;
                    c0953d9.f11859e0 = f11;
                } else {
                    i29 = i33;
                }
                if (i32 == i29 - 1) {
                    c0953d9.f(c0953d9.f11835L, this.f11915g, this.f11917k);
                }
                if (c0953d8 != null) {
                    C0952c c0952c12 = c0953d8.f11835L;
                    c0952c9.a(c0952c12, gVar.f11940Q0);
                    if (i32 == i15) {
                        int i36 = this.i;
                        if (c0952c9.h()) {
                            c0952c9.f11823h = i36;
                        }
                    }
                    c0952c12.a(c0952c9, 0);
                    if (i32 == i30 + 1) {
                        int i37 = this.f11917k;
                        if (c0952c12.h()) {
                            c0952c12.f11823h = i37;
                        }
                    }
                }
                if (c0953d9 == c0953d7) {
                    c0953d8 = c0953d9;
                } else if (z5) {
                    int i38 = gVar.f11941R0;
                    if (i38 == 0) {
                        c0952c10.a(c0952c8, 0);
                    } else if (i38 == 1) {
                        c0952c11.a(c0952c7, 0);
                    } else if (i38 == 2) {
                        c0952c11.a(c0952c7, 0);
                        c0952c10.a(c0952c8, 0);
                    }
                    c0953d8 = c0953d9;
                } else {
                    int i39 = gVar.f11941R0;
                    if (i39 == 0) {
                        c0952c11.a(c0952c7, 0);
                    } else if (i39 == 1) {
                        c0952c10.a(c0952c8, 0);
                    } else if (i39 == 2) {
                        if (z9) {
                            c0952c11.a(this.f11913d, this.f11916h);
                            c0952c10.a(this.f, this.j);
                        } else {
                            c0952c11.a(c0952c7, 0);
                            c0952c10.a(c0952c8, 0);
                        }
                    }
                    c0953d8 = c0953d9;
                }
            }
            i32++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        return this.f11910a == 1 ? this.f11919m - this.f11924r.f11940Q0 : this.f11919m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        return this.f11910a == 0 ? this.f11918l - this.f11924r.f11939P0 : this.f11918l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        g gVar;
        int i7;
        int i8 = this.f11922p;
        if (i8 == 0) {
            return;
        }
        int i9 = this.f11921o;
        int i10 = i / i8;
        int i11 = 0;
        while (true) {
            gVar = this.f11924r;
            if (i11 >= i9 || (i7 = this.f11920n + i11) >= gVar.f11950b1) {
                break;
            }
            C0953d c0953d = gVar.f11949a1[i7];
            if (this.f11910a == 0) {
                if (c0953d != null) {
                    int[] iArr = c0953d.f11878p0;
                    if (iArr[0] == 3 && c0953d.f11880r == 0) {
                        gVar.V(1, i10, iArr[1], c0953d.k(), c0953d);
                    }
                }
            } else if (c0953d != null) {
                int[] iArr2 = c0953d.f11878p0;
                if (iArr2[1] == 3 && c0953d.f11881s == 0) {
                    int i12 = i10;
                    gVar.V(iArr2[0], c0953d.q(), 1, i12, c0953d);
                    i10 = i12;
                }
            }
            i11++;
        }
        this.f11918l = 0;
        this.f11919m = 0;
        this.f11911b = null;
        this.f11912c = 0;
        int i13 = this.f11921o;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = this.f11920n + i14;
            if (i15 >= gVar.f11950b1) {
                return;
            }
            C0953d c0953d2 = gVar.f11949a1[i15];
            if (this.f11910a == 0) {
                int iQ = c0953d2.q();
                int i16 = gVar.f11939P0;
                if (c0953d2.f11862g0 == 8) {
                    i16 = 0;
                }
                this.f11918l = iQ + i16 + this.f11918l;
                int iT = gVar.T(c0953d2, this.f11923q);
                if (this.f11911b == null || this.f11912c < iT) {
                    this.f11911b = c0953d2;
                    this.f11912c = iT;
                    this.f11919m = iT;
                }
            } else {
                int iU = gVar.U(c0953d2, this.f11923q);
                int iT2 = gVar.T(c0953d2, this.f11923q);
                int i17 = gVar.f11940Q0;
                if (c0953d2.f11862g0 == 8) {
                    i17 = 0;
                }
                this.f11919m = iT2 + i17 + this.f11919m;
                if (this.f11911b == null || this.f11912c < iU) {
                    this.f11911b = c0953d2;
                    this.f11912c = iU;
                    this.f11918l = iU;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i, C0952c c0952c, C0952c c0952c2, C0952c c0952c3, C0952c c0952c4, int i7, int i8, int i9, int i10, int i11) {
        this.f11910a = i;
        this.f11913d = c0952c;
        this.f11914e = c0952c2;
        this.f = c0952c3;
        this.f11915g = c0952c4;
        this.f11916h = i7;
        this.i = i8;
        this.j = i9;
        this.f11917k = i10;
        this.f11923q = i11;
    }
}
