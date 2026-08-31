package j5;

import P.C0348c0;
import P5.D;
import P5.H;
import P5.S;
import W0.f;
import android.graphics.Color;
import androidx.lifecycle.J;
import androidx.lifecycle.f0;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: j5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1167d extends f0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final S f13866A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final S f13867B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final S f13868C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final J f13869D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final S f13870E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f13871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f13872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f13873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D f13874e;
    public final S f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D f13875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S f13876h;
    public final S i;
    public final S j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final S f13877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S f13878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S f13879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final S f13880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final S f13881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J f13882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0348c0 f13883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0348c0 f13884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final S f13885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final S f13886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final J f13887u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final S f13888v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final S f13889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final S f13890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final S f13891y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final S f13892z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1167d() {
        Boolean bool = Boolean.TRUE;
        S sB = H.b(bool);
        this.f13871b = sB;
        this.f13872c = new D(sB);
        Boolean bool2 = Boolean.FALSE;
        S sB2 = H.b(bool2);
        this.f13873d = sB2;
        this.f13874e = new D(sB2);
        S sB3 = H.b(bool2);
        this.f = sB3;
        this.f13875g = new D(sB3);
        S sB4 = H.b(bool);
        this.f13876h = sB4;
        this.i = sB4;
        new J(bool);
        S sB5 = H.b(bool);
        this.j = sB5;
        this.f13877k = sB5;
        S sB6 = H.b(bool2);
        this.f13878l = sB6;
        this.f13879m = sB6;
        S sB7 = H.b(0);
        this.f13880n = sB7;
        this.f13881o = sB7;
        this.f13882p = new J(bool2);
        this.f13883q = new C0348c0(0);
        this.f13884r = new C0348c0(0);
        S sB8 = H.b(bool2);
        this.f13885s = sB8;
        this.f13886t = sB8;
        this.f13887u = new J(0);
        S sB9 = H.b(0);
        this.f13888v = sB9;
        this.f13889w = sB9;
        S sB10 = H.b(bool2);
        this.f13890x = sB10;
        this.f13891y = sB10;
        S sB11 = H.b(bool2);
        this.f13892z = sB11;
        this.f13866A = sB11;
        this.f13867B = H.b(bool2);
        this.f13868C = H.b(Integer.valueOf(Color.parseColor("#ffffff")));
        H.b(new f(0));
        this.f13869D = new J(bool);
        this.f13870E = H.b(bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        int iE = this.f13883q.e();
        J j = this.f13887u;
        Integer num = (Integer) j.d();
        int iIntValue = 0;
        S s6 = this.f13886t;
        if ((num != null && iE == num.intValue()) || !((Boolean) s6.getValue()).booleanValue()) {
            if (((Boolean) s6.getValue()).booleanValue()) {
                return;
            }
            j.k(0);
            return;
        }
        j.k(Integer.valueOf(iE));
        if (j.d() != null) {
            Object objD = j.d();
            m.b(objD);
            iIntValue = ((Number) objD).intValue();
        }
        S s7 = this.f13888v;
        if (iIntValue != ((Number) s7.getValue()).intValue()) {
            s7.h(null, Integer.valueOf(iIntValue));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        S s6 = this.f13885s;
        s6.getClass();
        s6.h(null, boolValueOf);
    }
}
