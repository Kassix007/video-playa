package O3;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0304m1 extends H {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0295j1 f4962A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4963B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f4964C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile C0295j1 f4965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile C0295j1 f4966u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0295j1 f4967v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ConcurrentHashMap f4968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.X f4969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f4970y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile C0295j1 f4971z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0304m1(C0323t0 c0323t0) {
        super(c0323t0);
        this.f4964C = new Object();
        this.f4968w = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.H
    public final boolean r() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(C0295j1 c0295j1, boolean z5, long j) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        A a7 = c0323t0.f5055D;
        C0323t0.i(a7);
        c0323t0.f5052A.getClass();
        a7.r(SystemClock.elapsedRealtime());
        boolean z6 = c0295j1 != null && c0295j1.f4928d;
        E1 e12 = c0323t0.f5079x;
        C0323t0.k(e12);
        if (!e12.f4360w.e(z6, z5, j) || c0295j1 == null) {
            return;
        }
        c0295j1.f4928d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0295j1 t(com.google.android.gms.internal.measurement.X x6) {
        AbstractC1887A.g(x6);
        Integer numValueOf = Integer.valueOf(x6.f10749q);
        ConcurrentHashMap concurrentHashMap = this.f4968w;
        C0295j1 c0295j1 = (C0295j1) concurrentHashMap.get(numValueOf);
        if (c0295j1 == null) {
            String strV = v(x6.f10750r);
            Y1 y12 = ((C0323t0) this.f4346r).f5080y;
            C0323t0.j(y12);
            C0295j1 c0295j12 = new C0295j1(null, strV, y12.k0());
            concurrentHashMap.put(numValueOf, c0295j12);
            c0295j1 = c0295j12;
        }
        return this.f4971z != null ? this.f4971z : c0295j1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0295j1 u(boolean z5) {
        p();
        o();
        if (!z5) {
            return this.f4967v;
        }
        C0295j1 c0295j1 = this.f4967v;
        return c0295j1 != null ? c0295j1 : this.f4962A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String v(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        int length2 = str2.length();
        c0323t0.f5075t.getClass();
        if (length2 <= 500) {
            return str2;
        }
        c0323t0.f5075t.getClass();
        return str2.substring(0, 500);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(com.google.android.gms.internal.measurement.X x6, Bundle bundle) {
        Bundle bundle2;
        if (!((C0323t0) this.f4346r).f5075t.C() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f4968w.put(Integer.valueOf(x6.f10749q), new C0295j1(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(String str, C0295j1 c0295j1, boolean z5) {
        C0295j1 c0295j12;
        C0295j1 c0295j13 = this.f4965t == null ? this.f4966u : this.f4965t;
        if (c0295j1.f4926b == null) {
            c0295j12 = new C0295j1(c0295j1.f4925a, str != null ? v(str) : null, c0295j1.f4927c, c0295j1.f4929e, c0295j1.f);
        } else {
            c0295j12 = c0295j1;
        }
        this.f4966u = this.f4965t;
        this.f4965t = c0295j12;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        c0323t0.f5052A.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0312p0 c0312p0 = c0323t0.f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new RunnableC0298k1(this, c0295j12, c0295j13, jElapsedRealtime, z5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(O3.C0295j1 r18, O3.C0295j1 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            boolean r6 = r1.f4929e
            java.lang.Object r7 = r0.f4346r
            O3.t0 r7 = (O3.C0323t0) r7
            r0.o()
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L33
            long r10 = r1.f4927c
            long r12 = r2.f4927c
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 != 0) goto L33
            java.lang.String r10 = r2.f4926b
            java.lang.String r11 = r1.f4926b
            boolean r10 = java.util.Objects.equals(r10, r11)
            if (r10 == 0) goto L33
            java.lang.String r10 = r2.f4925a
            java.lang.String r11 = r1.f4925a
            boolean r10 = java.util.Objects.equals(r10, r11)
            if (r10 != 0) goto L35
        L33:
            r10 = r9
            goto L36
        L35:
            r10 = r8
        L36:
            if (r22 == 0) goto L3d
            O3.j1 r11 = r0.f4967v
            if (r11 == 0) goto L3d
            r8 = r9
        L3d:
            if (r10 == 0) goto Lc0
            if (r5 == 0) goto L48
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r5)
        L46:
            r14 = r10
            goto L4e
        L48:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            goto L46
        L4e:
            O3.Y1.f0(r1, r14, r9)
            if (r2 == 0) goto L6c
            java.lang.String r5 = r2.f4925a
            if (r5 == 0) goto L5c
            java.lang.String r10 = "_pn"
            r14.putString(r10, r5)
        L5c:
            java.lang.String r5 = r2.f4926b
            if (r5 == 0) goto L65
            java.lang.String r10 = "_pc"
            r14.putString(r10, r5)
        L65:
            long r10 = r2.f4927c
            java.lang.String r2 = "_pi"
            r14.putLong(r2, r10)
        L6c:
            r10 = 0
            if (r8 == 0) goto L89
            O3.E1 r2 = r7.f5079x
            O3.C0323t0.k(r2)
            O3.D1 r2 = r2.f4360w
            long r12 = r2.f4348b
            long r12 = r3 - r12
            r2.f4348b = r3
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 <= 0) goto L89
            O3.Y1 r2 = r7.f5080y
            O3.C0323t0.j(r2)
            r2.V(r14, r12)
        L89:
            O3.g r2 = r7.f5075t
            boolean r2 = r2.C()
            if (r2 != 0) goto L98
            java.lang.String r2 = "_mst"
            r12 = 1
            r14.putLong(r2, r12)
        L98:
            if (r9 == r6) goto L9e
            java.lang.String r2 = "auto"
        L9c:
            r12 = r2
            goto La1
        L9e:
            java.lang.String r2 = "app"
            goto L9c
        La1:
            B3.a r2 = r7.f5052A
            r2.getClass()
            long r15 = java.lang.System.currentTimeMillis()
            if (r6 == 0) goto Lb6
            r22 = r10
            long r10 = r1.f
            int r2 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r2 != 0) goto Lb5
            goto Lb6
        Lb5:
            r15 = r10
        Lb6:
            O3.b1 r11 = r7.f5054C
            O3.C0323t0.k(r11)
            java.lang.String r13 = "_vs"
            r11.w(r12, r13, r14, r15)
        Lc0:
            if (r8 == 0) goto Lc7
            O3.j1 r2 = r0.f4967v
            r0.s(r2, r9, r3)
        Lc7:
            r0.f4967v = r1
            if (r6 == 0) goto Lcd
            r0.f4962A = r1
        Lcd:
            O3.w1 r2 = r7.o()
            r2.o()
            r2.p()
            I4.a r3 = new I4.a
            r3.<init>(r2, r1)
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0304m1.y(O3.j1, O3.j1, long, boolean, android.os.Bundle):void");
    }
}
