package O3;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0895z2;
import com.google.android.gms.internal.measurement.F2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r.C1554e;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0300l0 extends O1 implements InterfaceC0281f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final B2.e f4945A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final k3.d f4946B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1554e f4947C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1554e f4948D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1554e f4949E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1554e f4950u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1554e f4951v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1554e f4952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1554e f4953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1554e f4954y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1554e f4955z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0300l0(T1 t12) {
        super(t12);
        this.f4950u = new C1554e(0);
        this.f4951v = new C1554e(0);
        this.f4952w = new C1554e(0);
        this.f4953x = new C1554e(0);
        this.f4954y = new C1554e(0);
        this.f4947C = new C1554e(0);
        this.f4948D = new C1554e(0);
        this.f4949E = new C1554e(0);
        this.f4955z = new C1554e(0);
        this.f4945A = new B2.e(this);
        this.f4946B = new k3.d(11, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1554e y(com.google.android.gms.internal.measurement.O0 o02) {
        C1554e c1554e = new C1554e(0);
        for (com.google.android.gms.internal.measurement.S0 s02 : o02.t()) {
            c1554e.put(s02.p(), s02.q());
        }
        return c1554e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final I0 z(int i) {
        int i7 = i - 1;
        if (i7 == 1) {
            return I0.AD_STORAGE;
        }
        if (i7 == 2) {
            return I0.ANALYTICS_STORAGE;
        }
        if (i7 == 3) {
            return I0.AD_USER_DATA;
        }
        if (i7 != 4) {
            return null;
        }
        return I0.AD_PERSONALIZATION;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final com.google.android.gms.internal.measurement.O0 A(String str) {
        p();
        o();
        AbstractC1887A.d(str);
        u(str);
        return (com.google.android.gms.internal.measurement.O0) this.f4954y.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String B(String str) {
        o();
        u(str);
        return (String) this.f4947C.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03f9, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0402, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0403, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0415, code lost:
    
        if (r6.v() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0417, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0420, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0421, code lost:
    
        r5.put("session_scoped", r3);
        r5.put("data", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0433, code lost:
    
        if (r8.f0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0435, code lost:
    
        r0 = r13.f5077v;
        O3.C0323t0.l(r0);
        r0.f4670w.c(O3.X.w(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0446, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0448, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0450, code lost:
    
        r1 = r13.f5077v;
        O3.C0323t0.l(r1);
        r1.f4670w.d(O3.X.w(r30), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0460, code lost:
    
        r8.p();
        r8.o();
        x3.AbstractC1887A.d(r30);
        r0 = r8.f0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0483, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0262, code lost:
    
        r0 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x026e, code lost:
    
        if (r0.hasNext() == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027a, code lost:
    
        if (((com.google.android.gms.internal.measurement.E0) r0.next()).p() != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027c, code lost:
    
        r0 = r13.f5077v;
        O3.C0323t0.l(r0);
        r0.f4673z.d(O3.X.w(r30), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0291, code lost:
    
        r0 = r5.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0299, code lost:
    
        r14 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029d, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02af, code lost:
    
        if (r14 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b1, code lost:
    
        r14 = (com.google.android.gms.internal.measurement.C0883x0) r23.next();
        r8.p();
        r8.o();
        x3.AbstractC1887A.d(r30);
        x3.AbstractC1887A.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02cb, code lost:
    
        if (r14.r().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02cd, code lost:
    
        r0 = r13.f5077v;
        O3.C0323t0.l(r0);
        r0 = r0.f4673z;
        r3 = O3.X.w(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02e2, code lost:
    
        if (r14.p() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02e4, code lost:
    
        r5 = java.lang.Integer.valueOf(r14.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02f3, code lost:
    
        r0.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02fe, code lost:
    
        r26 = r5;
        r5 = r14.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0319, code lost:
    
        if (r14.p() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x031b, code lost:
    
        r1 = java.lang.Integer.valueOf(r14.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0324, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0325, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r14.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0335, code lost:
    
        if (r14.z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0337, code lost:
    
        r0 = java.lang.Boolean.valueOf(r14.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0340, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0341, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0353, code lost:
    
        if (r8.f0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0355, code lost:
    
        r0 = r13.f5077v;
        O3.C0323t0.l(r0);
        r0.f4670w.c(O3.X.w(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0365, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0371, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0372, code lost:
    
        r1 = r13.f5077v;
        O3.C0323t0.l(r1);
        r1.f4670w.d(O3.X.w(r30), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0384, code lost:
    
        r27 = r6;
        r5 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0394, code lost:
    
        if (r5.hasNext() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0396, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.E0) r5.next();
        r8.p();
        r8.o();
        x3.AbstractC1887A.d(r30);
        x3.AbstractC1887A.g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03b0, code lost:
    
        if (r6.r().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03b2, code lost:
    
        r0 = r13.f5077v;
        O3.C0323t0.l(r0);
        r0 = r0.f4673z;
        r3 = O3.X.w(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03c7, code lost:
    
        if (r6.p() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03c9, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03d2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03d3, code lost:
    
        r0.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03dc, code lost:
    
        r14 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03f7, code lost:
    
        if (r6.p() == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.lang.String r30, byte[] r31, java.lang.String r32, java.lang.String r33) throws java.lang.Throwable {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            r3 = r32
            r4 = r33
            r1.p()
            r1.o()
            x3.AbstractC1887A.d(r2)
            com.google.android.gms.internal.measurement.O0 r0 = r29.x(r30, r31)
            com.google.android.gms.internal.measurement.p2 r0 = r0.i()
            r5 = r0
            com.google.android.gms.internal.measurement.N0 r5 = (com.google.android.gms.internal.measurement.N0) r5
            r1.v(r2, r5)
            com.google.android.gms.internal.measurement.q2 r0 = r5.e()
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0
            r1.w(r2, r0)
            com.google.android.gms.internal.measurement.q2 r0 = r5.e()
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0
            r.e r6 = r1.f4954y
            r6.put(r2, r0)
            com.google.android.gms.internal.measurement.q2 r0 = r5.f11012r
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0
            java.lang.String r0 = r0.A()
            r.e r7 = r1.f4947C
            r7.put(r2, r0)
            r.e r0 = r1.f4948D
            r0.put(r2, r3)
            r.e r0 = r1.f4949E
            r0.put(r2, r4)
            com.google.android.gms.internal.measurement.q2 r0 = r5.e()
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0
            r.e r0 = y(r0)
            r.e r7 = r1.f4950u
            r7.put(r2, r0)
            O3.T1 r7 = r1.f4510s
            O3.n r8 = r7.f4609s
            O3.T1.S(r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            com.google.android.gms.internal.measurement.q2 r0 = r5.f11012r
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0
            com.google.android.gms.internal.measurement.w2 r0 = r0.w()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r9.<init>(r0)
            java.lang.String r10 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r11 = "event_filters"
            java.lang.String r12 = "property_filters"
            java.lang.Object r13 = r8.f4346r
            O3.t0 r13 = (O3.C0323t0) r13
            r15 = 0
        L7e:
            int r14 = r9.size()
            if (r15 >= r14) goto L1c4
            java.lang.Object r14 = r9.get(r15)
            com.google.android.gms.internal.measurement.v0 r14 = (com.google.android.gms.internal.measurement.C0873v0) r14
            com.google.android.gms.internal.measurement.p2 r14 = r14.i()
            com.google.android.gms.internal.measurement.u0 r14 = (com.google.android.gms.internal.measurement.C0868u0) r14
            r16 = r6
            com.google.android.gms.internal.measurement.q2 r6 = r14.f11012r
            com.google.android.gms.internal.measurement.v0 r6 = (com.google.android.gms.internal.measurement.C0873v0) r6
            int r6 = r6.v()
            if (r6 == 0) goto L159
            r6 = 0
        L9d:
            com.google.android.gms.internal.measurement.q2 r4 = r14.f11012r
            com.google.android.gms.internal.measurement.v0 r4 = (com.google.android.gms.internal.measurement.C0873v0) r4
            int r4 = r4.v()
            if (r6 >= r4) goto L159
            com.google.android.gms.internal.measurement.q2 r4 = r14.f11012r
            com.google.android.gms.internal.measurement.v0 r4 = (com.google.android.gms.internal.measurement.C0873v0) r4
            com.google.android.gms.internal.measurement.x0 r4 = r4.w(r6)
            com.google.android.gms.internal.measurement.p2 r4 = r4.i()
            com.google.android.gms.internal.measurement.w0 r4 = (com.google.android.gms.internal.measurement.C0878w0) r4
            com.google.android.gms.internal.measurement.p2 r17 = r4.clone()
            r3 = r17
            com.google.android.gms.internal.measurement.w0 r3 = (com.google.android.gms.internal.measurement.C0878w0) r3
            r17 = r7
            com.google.android.gms.internal.measurement.q2 r7 = r4.f11012r
            com.google.android.gms.internal.measurement.x0 r7 = (com.google.android.gms.internal.measurement.C0883x0) r7
            java.lang.String r7 = r7.r()
            java.lang.String[] r1 = O3.K0.f4502a
            r18 = r5
            java.lang.String[] r5 = O3.K0.f4504c
            java.lang.String r1 = O3.K0.g(r7, r1, r5)
            if (r1 == 0) goto Ldf
            r3.b()
            com.google.android.gms.internal.measurement.q2 r7 = r3.f11012r
            com.google.android.gms.internal.measurement.x0 r7 = (com.google.android.gms.internal.measurement.C0883x0) r7
            r7.C(r1)
            r1 = 1
            goto Le0
        Ldf:
            r1 = 0
        Le0:
            r7 = 0
        Le1:
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.x0 r5 = (com.google.android.gms.internal.measurement.C0883x0) r5
            int r5 = r5.t()
            if (r7 >= r5) goto L130
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.x0 r5 = (com.google.android.gms.internal.measurement.C0883x0) r5
            com.google.android.gms.internal.measurement.z0 r5 = r5.u(r7)
            r20 = r1
            java.lang.String r1 = r5.w()
            r21 = r4
            java.lang.String[] r4 = O3.K0.f4506e
            r22 = r5
            java.lang.String[] r5 = O3.K0.f
            java.lang.String r1 = O3.K0.g(r1, r4, r5)
            if (r1 == 0) goto L129
            com.google.android.gms.internal.measurement.p2 r4 = r22.i()
            com.google.android.gms.internal.measurement.y0 r4 = (com.google.android.gms.internal.measurement.C0888y0) r4
            r4.b()
            com.google.android.gms.internal.measurement.q2 r5 = r4.f11012r
            com.google.android.gms.internal.measurement.z0 r5 = (com.google.android.gms.internal.measurement.C0893z0) r5
            r5.y(r1)
            com.google.android.gms.internal.measurement.q2 r1 = r4.e()
            com.google.android.gms.internal.measurement.z0 r1 = (com.google.android.gms.internal.measurement.C0893z0) r1
            r3.b()
            com.google.android.gms.internal.measurement.q2 r4 = r3.f11012r
            com.google.android.gms.internal.measurement.x0 r4 = (com.google.android.gms.internal.measurement.C0883x0) r4
            r4.D(r7, r1)
            r1 = 1
            goto L12b
        L129:
            r1 = r20
        L12b:
            int r7 = r7 + 1
            r4 = r21
            goto Le1
        L130:
            r20 = r1
            if (r20 == 0) goto L14d
            r14.b()
            com.google.android.gms.internal.measurement.q2 r1 = r14.f11012r
            com.google.android.gms.internal.measurement.v0 r1 = (com.google.android.gms.internal.measurement.C0873v0) r1
            com.google.android.gms.internal.measurement.q2 r3 = r3.e()
            com.google.android.gms.internal.measurement.x0 r3 = (com.google.android.gms.internal.measurement.C0883x0) r3
            r1.y(r6, r3)
            com.google.android.gms.internal.measurement.q2 r1 = r14.e()
            com.google.android.gms.internal.measurement.v0 r1 = (com.google.android.gms.internal.measurement.C0873v0) r1
            r9.set(r15, r1)
        L14d:
            int r6 = r6 + 1
            r1 = r29
            r3 = r32
            r7 = r17
            r5 = r18
            goto L9d
        L159:
            r18 = r5
            r17 = r7
            com.google.android.gms.internal.measurement.q2 r1 = r14.f11012r
            com.google.android.gms.internal.measurement.v0 r1 = (com.google.android.gms.internal.measurement.C0873v0) r1
            int r1 = r1.s()
            if (r1 == 0) goto L1b4
            r1 = 0
        L168:
            com.google.android.gms.internal.measurement.q2 r3 = r14.f11012r
            com.google.android.gms.internal.measurement.v0 r3 = (com.google.android.gms.internal.measurement.C0873v0) r3
            int r3 = r3.s()
            if (r1 >= r3) goto L1b4
            com.google.android.gms.internal.measurement.q2 r3 = r14.f11012r
            com.google.android.gms.internal.measurement.v0 r3 = (com.google.android.gms.internal.measurement.C0873v0) r3
            com.google.android.gms.internal.measurement.E0 r3 = r3.t(r1)
            java.lang.String r4 = r3.r()
            java.lang.String[] r5 = O3.K0.i
            java.lang.String[] r6 = O3.K0.j
            java.lang.String r4 = O3.K0.g(r4, r5, r6)
            if (r4 == 0) goto L1b1
            com.google.android.gms.internal.measurement.p2 r3 = r3.i()
            com.google.android.gms.internal.measurement.D0 r3 = (com.google.android.gms.internal.measurement.D0) r3
            r3.b()
            com.google.android.gms.internal.measurement.q2 r5 = r3.f11012r
            com.google.android.gms.internal.measurement.E0 r5 = (com.google.android.gms.internal.measurement.E0) r5
            r5.y(r4)
            r14.b()
            com.google.android.gms.internal.measurement.q2 r4 = r14.f11012r
            com.google.android.gms.internal.measurement.v0 r4 = (com.google.android.gms.internal.measurement.C0873v0) r4
            com.google.android.gms.internal.measurement.q2 r3 = r3.e()
            com.google.android.gms.internal.measurement.E0 r3 = (com.google.android.gms.internal.measurement.E0) r3
            r4.x(r1, r3)
            com.google.android.gms.internal.measurement.q2 r3 = r14.e()
            com.google.android.gms.internal.measurement.v0 r3 = (com.google.android.gms.internal.measurement.C0873v0) r3
            r9.set(r15, r3)
        L1b1:
            int r1 = r1 + 1
            goto L168
        L1b4:
            int r15 = r15 + 1
            r1 = r29
            r3 = r32
            r4 = r33
            r6 = r16
            r7 = r17
            r5 = r18
            goto L7e
        L1c4:
            r18 = r5
            r16 = r6
            r17 = r7
            r8.p()
            r8.o()
            x3.AbstractC1887A.d(r2)
            android.database.sqlite.SQLiteDatabase r1 = r8.f0()
            r1.beginTransaction()
            r8.p()     // Catch: java.lang.Throwable -> L228
            r8.o()     // Catch: java.lang.Throwable -> L228
            x3.AbstractC1887A.d(r2)     // Catch: java.lang.Throwable -> L228
            android.database.sqlite.SQLiteDatabase r3 = r8.f0()     // Catch: java.lang.Throwable -> L228
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L228
            r3.delete(r12, r0, r4)     // Catch: java.lang.Throwable -> L228
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L228
            r3.delete(r11, r0, r4)     // Catch: java.lang.Throwable -> L228
            int r3 = r9.size()     // Catch: java.lang.Throwable -> L228
            r0 = 0
        L1fa:
            if (r0 >= r3) goto L490
            java.lang.Object r5 = r9.get(r0)     // Catch: java.lang.Throwable -> L48b
            int r6 = r0 + 1
            com.google.android.gms.internal.measurement.v0 r5 = (com.google.android.gms.internal.measurement.C0873v0) r5     // Catch: java.lang.Throwable -> L48b
            r8.p()     // Catch: java.lang.Throwable -> L48b
            r8.o()     // Catch: java.lang.Throwable -> L48b
            x3.AbstractC1887A.d(r2)     // Catch: java.lang.Throwable -> L48b
            x3.AbstractC1887A.g(r5)     // Catch: java.lang.Throwable -> L48b
            boolean r0 = r5.p()     // Catch: java.lang.Throwable -> L48b
            if (r0 != 0) goto L22f
            O3.X r0 = r13.f5077v     // Catch: java.lang.Throwable -> L228
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L228
            O3.V r0 = r0.f4673z     // Catch: java.lang.Throwable -> L228
            java.lang.String r4 = "Audience with no ID. appId"
            O3.W r5 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L228
            r0.c(r5, r4)     // Catch: java.lang.Throwable -> L228
        L226:
            r0 = r6
            goto L1fa
        L228:
            r0 = move-exception
            r3 = r29
            r24 = r1
            goto L628
        L22f:
            int r7 = r5.q()     // Catch: java.lang.Throwable -> L48b
            com.google.android.gms.internal.measurement.w2 r0 = r5.u()     // Catch: java.lang.Throwable -> L48b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L48b
        L23b:
            boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L48b
            if (r14 == 0) goto L262
            java.lang.Object r14 = r0.next()     // Catch: java.lang.Throwable -> L228
            com.google.android.gms.internal.measurement.x0 r14 = (com.google.android.gms.internal.measurement.C0883x0) r14     // Catch: java.lang.Throwable -> L228
            boolean r14 = r14.p()     // Catch: java.lang.Throwable -> L228
            if (r14 != 0) goto L23b
            O3.X r0 = r13.f5077v     // Catch: java.lang.Throwable -> L228
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L228
            O3.V r0 = r0.f4673z     // Catch: java.lang.Throwable -> L228
            java.lang.String r4 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            O3.W r5 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L228
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L228
            r0.d(r5, r7, r4)     // Catch: java.lang.Throwable -> L228
            goto L226
        L262:
            java.util.List r0 = r5.r()     // Catch: java.lang.Throwable -> L48b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L48b
        L26a:
            boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L48b
            if (r14 == 0) goto L291
            java.lang.Object r14 = r0.next()     // Catch: java.lang.Throwable -> L228
            com.google.android.gms.internal.measurement.E0 r14 = (com.google.android.gms.internal.measurement.E0) r14     // Catch: java.lang.Throwable -> L228
            boolean r14 = r14.p()     // Catch: java.lang.Throwable -> L228
            if (r14 != 0) goto L26a
            O3.X r0 = r13.f5077v     // Catch: java.lang.Throwable -> L228
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L228
            O3.V r0 = r0.f4673z     // Catch: java.lang.Throwable -> L228
            java.lang.String r4 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            O3.W r5 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L228
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L228
            r0.d(r5, r7, r4)     // Catch: java.lang.Throwable -> L228
            goto L226
        L291:
            com.google.android.gms.internal.measurement.w2 r0 = r5.u()     // Catch: java.lang.Throwable -> L48b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L48b
        L299:
            boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L48b
            r19 = -1
            java.lang.String r4 = "data"
            java.lang.String r15 = "session_scoped"
            r23 = r0
            java.lang.String r0 = "filter_id"
            r24 = r1
            java.lang.String r1 = "audience_id"
            r25 = r3
            java.lang.String r3 = "app_id"
            if (r14 == 0) goto L384
            java.lang.Object r14 = r23.next()     // Catch: java.lang.Throwable -> L2ed
            com.google.android.gms.internal.measurement.x0 r14 = (com.google.android.gms.internal.measurement.C0883x0) r14     // Catch: java.lang.Throwable -> L2ed
            r8.p()     // Catch: java.lang.Throwable -> L2ed
            r8.o()     // Catch: java.lang.Throwable -> L2ed
            x3.AbstractC1887A.d(r2)     // Catch: java.lang.Throwable -> L2ed
            x3.AbstractC1887A.g(r14)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r26 = r14.r()     // Catch: java.lang.Throwable -> L2ed
            boolean r26 = r26.isEmpty()     // Catch: java.lang.Throwable -> L2ed
            if (r26 == 0) goto L2fe
            O3.X r0 = r13.f5077v     // Catch: java.lang.Throwable -> L2ed
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L2ed
            O3.V r0 = r0.f4673z     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r1 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            O3.W r3 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2ed
            boolean r5 = r14.p()     // Catch: java.lang.Throwable -> L2ed
            if (r5 == 0) goto L2f2
            int r5 = r14.q()     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2ed
            goto L2f3
        L2ed:
            r0 = move-exception
        L2ee:
            r3 = r29
            goto L628
        L2f2:
            r5 = 0
        L2f3:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L2ed
            r0.e(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L2ed
            r27 = r6
            goto L460
        L2fe:
            r26 = r5
            byte[] r5 = r14.a()     // Catch: java.lang.Throwable -> L2ed
            r27 = r6
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L2ed
            r6.<init>()     // Catch: java.lang.Throwable -> L2ed
            r6.put(r3, r2)     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2ed
            r6.put(r1, r3)     // Catch: java.lang.Throwable -> L2ed
            boolean r1 = r14.p()     // Catch: java.lang.Throwable -> L2ed
            if (r1 == 0) goto L324
            int r1 = r14.q()     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2ed
            goto L325
        L324:
            r1 = 0
        L325:
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r0 = "event_name"
            java.lang.String r1 = r14.r()     // Catch: java.lang.Throwable -> L2ed
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L2ed
            boolean r0 = r14.z()     // Catch: java.lang.Throwable -> L2ed
            if (r0 == 0) goto L340
            boolean r0 = r14.A()     // Catch: java.lang.Throwable -> L2ed
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L2ed
            goto L341
        L340:
            r0 = 0
        L341:
            r6.put(r15, r0)     // Catch: java.lang.Throwable -> L2ed
            r6.put(r4, r5)     // Catch: java.lang.Throwable -> L2ed
            android.database.sqlite.SQLiteDatabase r0 = r8.f0()     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L371
            r1 = 5
            r3 = 0
            long r0 = r0.insertWithOnConflict(r11, r3, r6, r1)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L371
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 != 0) goto L365
            O3.X r0 = r13.f5077v     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L371
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L371
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L371
            java.lang.String r1 = "Failed to insert event filter (got -1). appId"
            O3.W r3 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L371
            r0.c(r3, r1)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L371
        L365:
            r0 = r23
            r1 = r24
            r3 = r25
            r5 = r26
            r6 = r27
            goto L299
        L371:
            r0 = move-exception
            O3.X r1 = r13.f5077v     // Catch: java.lang.Throwable -> L2ed
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> L2ed
            O3.V r1 = r1.f4670w     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r3 = "Error storing event filter. appId"
            O3.W r4 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L2ed
            r1.d(r4, r0, r3)     // Catch: java.lang.Throwable -> L2ed
            goto L460
        L384:
            r26 = r5
            r27 = r6
            java.util.List r5 = r26.r()     // Catch: java.lang.Throwable -> L2ed
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2ed
        L390:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L2ed
            if (r6 == 0) goto L483
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L2ed
            com.google.android.gms.internal.measurement.E0 r6 = (com.google.android.gms.internal.measurement.E0) r6     // Catch: java.lang.Throwable -> L2ed
            r8.p()     // Catch: java.lang.Throwable -> L2ed
            r8.o()     // Catch: java.lang.Throwable -> L2ed
            x3.AbstractC1887A.d(r2)     // Catch: java.lang.Throwable -> L2ed
            x3.AbstractC1887A.g(r6)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r14 = r6.r()     // Catch: java.lang.Throwable -> L2ed
            boolean r14 = r14.isEmpty()     // Catch: java.lang.Throwable -> L2ed
            if (r14 == 0) goto L3dc
            O3.X r0 = r13.f5077v     // Catch: java.lang.Throwable -> L2ed
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L2ed
            O3.V r0 = r0.f4673z     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r1 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            O3.W r3 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2ed
            boolean r5 = r6.p()     // Catch: java.lang.Throwable -> L2ed
            if (r5 == 0) goto L3d2
            int r5 = r6.q()     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2ed
            goto L3d3
        L3d2:
            r5 = 0
        L3d3:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L2ed
            r0.e(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L2ed
            goto L460
        L3dc:
            byte[] r14 = r6.a()     // Catch: java.lang.Throwable -> L2ed
            r23 = r5
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L2ed
            r5.<init>()     // Catch: java.lang.Throwable -> L2ed
            r5.put(r3, r2)     // Catch: java.lang.Throwable -> L2ed
            r26 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2ed
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L2ed
            boolean r3 = r6.p()     // Catch: java.lang.Throwable -> L2ed
            if (r3 == 0) goto L402
            int r3 = r6.q()     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2ed
            goto L403
        L402:
            r3 = 0
        L403:
            r5.put(r0, r3)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r3 = "property_name"
            r28 = r0
            java.lang.String r0 = r6.r()     // Catch: java.lang.Throwable -> L2ed
            r5.put(r3, r0)     // Catch: java.lang.Throwable -> L2ed
            boolean r0 = r6.v()     // Catch: java.lang.Throwable -> L2ed
            if (r0 == 0) goto L420
            boolean r0 = r6.w()     // Catch: java.lang.Throwable -> L2ed
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L2ed
            goto L421
        L420:
            r3 = 0
        L421:
            r5.put(r15, r3)     // Catch: java.lang.Throwable -> L2ed
            r5.put(r4, r14)     // Catch: java.lang.Throwable -> L2ed
            android.database.sqlite.SQLiteDatabase r0 = r8.f0()     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L446
            r3 = 0
            r6 = 5
            long r21 = r0.insertWithOnConflict(r12, r3, r5, r6)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L446
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 != 0) goto L448
            O3.X r0 = r13.f5077v     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L446
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L446
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L446
            java.lang.String r1 = "Failed to insert property filter (got -1). appId"
            O3.W r3 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L446
            r0.c(r3, r1)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L446
            goto L460
        L446:
            r0 = move-exception
            goto L450
        L448:
            r5 = r23
            r3 = r26
            r0 = r28
            goto L390
        L450:
            O3.X r1 = r13.f5077v     // Catch: java.lang.Throwable -> L2ed
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> L2ed
            O3.V r1 = r1.f4670w     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r3 = "Error storing property filter. appId"
            O3.W r4 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L2ed
            r1.d(r4, r0, r3)     // Catch: java.lang.Throwable -> L2ed
        L460:
            r8.p()     // Catch: java.lang.Throwable -> L2ed
            r8.o()     // Catch: java.lang.Throwable -> L2ed
            x3.AbstractC1887A.d(r2)     // Catch: java.lang.Throwable -> L2ed
            android.database.sqlite.SQLiteDatabase r0 = r8.f0()     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L2ed
            r0.delete(r12, r10, r1)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r1 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L2ed
            r0.delete(r11, r10, r1)     // Catch: java.lang.Throwable -> L2ed
        L483:
            r1 = r24
            r3 = r25
            r0 = r27
            goto L1fa
        L48b:
            r0 = move-exception
            r24 = r1
            goto L2ee
        L490:
            r24 = r1
            r3 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2ed
            r0.<init>()     // Catch: java.lang.Throwable -> L2ed
            int r1 = r9.size()     // Catch: java.lang.Throwable -> L2ed
            r4 = 0
        L49d:
            if (r4 >= r1) goto L4bb
            java.lang.Object r5 = r9.get(r4)     // Catch: java.lang.Throwable -> L2ed
            int r4 = r4 + 1
            com.google.android.gms.internal.measurement.v0 r5 = (com.google.android.gms.internal.measurement.C0873v0) r5     // Catch: java.lang.Throwable -> L2ed
            boolean r6 = r5.p()     // Catch: java.lang.Throwable -> L2ed
            if (r6 == 0) goto L4b6
            int r5 = r5.q()     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L2ed
            goto L4b7
        L4b6:
            r5 = r3
        L4b7:
            r0.add(r5)     // Catch: java.lang.Throwable -> L2ed
            goto L49d
        L4bb:
            java.lang.String r1 = "("
            java.lang.String r3 = ")"
            java.lang.String r4 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            java.lang.String r5 = " order by rowid desc limit -1 offset ?)"
            x3.AbstractC1887A.d(r2)     // Catch: java.lang.Throwable -> L2ed
            r8.p()     // Catch: java.lang.Throwable -> L2ed
            r8.o()     // Catch: java.lang.Throwable -> L2ed
            android.database.sqlite.SQLiteDatabase r6 = r8.f0()     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r7 = "select count(1) from audience_filter_values where app_id=?"
            java.lang.String[] r9 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L55e
            long r7 = r8.K(r7, r9)     // Catch: java.lang.Throwable -> L2ed android.database.sqlite.SQLiteException -> L55e
            O3.g r9 = r13.f5075t     // Catch: java.lang.Throwable -> L2ed
            O3.E r10 = O3.F.f4400U     // Catch: java.lang.Throwable -> L2ed
            int r9 = r9.w(r2, r10)     // Catch: java.lang.Throwable -> L2ed
            r10 = 2000(0x7d0, float:2.803E-42)
            int r9 = java.lang.Math.min(r10, r9)     // Catch: java.lang.Throwable -> L2ed
            r10 = 0
            int r9 = java.lang.Math.max(r10, r9)     // Catch: java.lang.Throwable -> L2ed
            long r11 = (long) r9     // Catch: java.lang.Throwable -> L2ed
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4f4
            goto L56f
        L4f4:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2ed
            r7.<init>()     // Catch: java.lang.Throwable -> L2ed
            r14 = r10
        L4fa:
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L2ed
            if (r14 >= r8) goto L516
            java.lang.Object r8 = r0.get(r14)     // Catch: java.lang.Throwable -> L2ed
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L2ed
            if (r8 == 0) goto L56f
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L2ed
            r7.add(r8)     // Catch: java.lang.Throwable -> L2ed
            int r14 = r14 + 1
            goto L4fa
        L516:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r7)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L2ed
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L2ed
            int r7 = r7 + 2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ed
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2ed
            r8.append(r1)     // Catch: java.lang.Throwable -> L2ed
            r8.append(r0)     // Catch: java.lang.Throwable -> L2ed
            r8.append(r3)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r1 = "audience_filter_values"
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L2ed
            int r3 = r3 + 140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ed
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L2ed
            r7.append(r4)     // Catch: java.lang.Throwable -> L2ed
            r7.append(r0)     // Catch: java.lang.Throwable -> L2ed
            r7.append(r5)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r3 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L2ed
            java.lang.String[] r3 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L2ed
            r6.delete(r1, r0, r3)     // Catch: java.lang.Throwable -> L2ed
            goto L56f
        L55e:
            r0 = move-exception
            O3.X r1 = r13.f5077v     // Catch: java.lang.Throwable -> L2ed
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> L2ed
            O3.V r1 = r1.f4670w     // Catch: java.lang.Throwable -> L2ed
            java.lang.String r3 = "Database error querying filters. appId"
            O3.W r4 = O3.X.w(r2)     // Catch: java.lang.Throwable -> L2ed
            r1.d(r4, r0, r3)     // Catch: java.lang.Throwable -> L2ed
        L56f:
            r24.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2ed
            r24.endTransaction()
            r18.b()     // Catch: java.lang.RuntimeException -> L594
            r1 = r18
            com.google.android.gms.internal.measurement.q2 r0 = r1.f11012r     // Catch: java.lang.RuntimeException -> L590
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0     // Catch: java.lang.RuntimeException -> L590
            r0.I()     // Catch: java.lang.RuntimeException -> L590
            com.google.android.gms.internal.measurement.q2 r0 = r1.e()     // Catch: java.lang.RuntimeException -> L590
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0     // Catch: java.lang.RuntimeException -> L590
            byte[] r0 = r0.a()     // Catch: java.lang.RuntimeException -> L590
            r3 = r29
        L58d:
            r4 = r17
            goto L5af
        L590:
            r0 = move-exception
        L591:
            r3 = r29
            goto L598
        L594:
            r0 = move-exception
            r1 = r18
            goto L591
        L598:
            java.lang.Object r4 = r3.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            O3.X r4 = r4.f5077v
            O3.C0323t0.l(r4)
            O3.V r4 = r4.f4673z
            O3.W r5 = O3.X.w(r2)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.d(r5, r0, r6)
            r0 = r31
            goto L58d
        L5af:
            O3.n r4 = r4.f4609s
            O3.T1.S(r4)
            java.lang.Object r5 = r4.f4346r
            O3.t0 r5 = (O3.C0323t0) r5
            x3.AbstractC1887A.d(r2)
            r4.o()
            r4.p()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "remote_config"
            r6.put(r7, r0)
            java.lang.String r0 = "config_last_modified_time"
            r7 = r32
            r6.put(r0, r7)
            java.lang.String r0 = "e_tag"
            r7 = r33
            r6.put(r0, r7)
            android.database.sqlite.SQLiteDatabase r0 = r4.f0()     // Catch: android.database.sqlite.SQLiteException -> L601
            java.lang.String r4 = "apps"
            java.lang.String r7 = "app_id = ?"
            java.lang.String[] r8 = new java.lang.String[]{r2}     // Catch: android.database.sqlite.SQLiteException -> L601
            int r0 = r0.update(r4, r6, r7, r8)     // Catch: android.database.sqlite.SQLiteException -> L601
            long r6 = (long) r0     // Catch: android.database.sqlite.SQLiteException -> L601
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L612
            O3.X r0 = r5.f5077v     // Catch: android.database.sqlite.SQLiteException -> L601
            O3.C0323t0.l(r0)     // Catch: android.database.sqlite.SQLiteException -> L601
            O3.V r0 = r0.f4670w     // Catch: android.database.sqlite.SQLiteException -> L601
            java.lang.String r4 = "Failed to update remote config (got 0). appId"
            O3.W r6 = O3.X.w(r2)     // Catch: android.database.sqlite.SQLiteException -> L601
            r0.c(r6, r4)     // Catch: android.database.sqlite.SQLiteException -> L601
            goto L612
        L601:
            r0 = move-exception
            O3.X r4 = r5.f5077v
            O3.C0323t0.l(r4)
            O3.V r4 = r4.f4670w
            O3.W r5 = O3.X.w(r2)
            java.lang.String r6 = "Error storing remote config. appId"
            r4.d(r5, r0, r6)
        L612:
            r1.b()
            com.google.android.gms.internal.measurement.q2 r0 = r1.f11012r
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0
            r0.J()
            com.google.android.gms.internal.measurement.q2 r0 = r1.e()
            com.google.android.gms.internal.measurement.O0 r0 = (com.google.android.gms.internal.measurement.O0) r0
            r1 = r16
            r1.put(r2, r0)
            return
        L628:
            r24.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0300l0.C(java.lang.String, byte[], java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean D(String str, String str2) {
        Boolean bool;
        o();
        u(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && Y1.M(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && Y1.m0(str2)) {
            return true;
        }
        Map map = (Map) this.f4952w.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean E(String str, String str2) {
        Boolean bool;
        o();
        u(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.f4953x.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int F(String str, String str2) {
        Integer num;
        o();
        u(str);
        Map map = (Map) this.f4955z.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean G(String str) {
        o();
        u(str);
        C1554e c1554e = this.f4951v;
        if (c1554e.get(str) != null) {
            return ((Set) c1554e.get(str)).contains("os_version") || ((Set) c1554e.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean H(String str) {
        o();
        u(str);
        C1554e c1554e = this.f4951v;
        return c1554e.get(str) != null && ((Set) c1554e.get(str)).contains("app_instance_id");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean I(String str, I0 i02) {
        o();
        u(str);
        com.google.android.gms.internal.measurement.J0 j0J = J(str);
        if (j0J == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.G0 g02 : j0J.p()) {
            if (i02 == z(g02.p())) {
                return g02.q() == 2;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final com.google.android.gms.internal.measurement.J0 J(String str) {
        o();
        u(str);
        com.google.android.gms.internal.measurement.O0 o0A = A(str);
        if (o0A == null || !o0A.B()) {
            return null;
        }
        return o0A.C();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0281f
    public final String a(String str, String str2) {
        o();
        u(str);
        Map map = (Map) this.f4950u.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final G0 s(String str, I0 i02) {
        o();
        u(str);
        com.google.android.gms.internal.measurement.J0 j0J = J(str);
        if (j0J != null) {
            Iterator it = j0J.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.G0 g02 = (com.google.android.gms.internal.measurement.G0) it.next();
                if (z(g02.p()) == i02) {
                    int iQ = g02.q() - 1;
                    if (iQ == 1) {
                        return G0.GRANTED;
                    }
                    if (iQ == 2) {
                        return G0.DENIED;
                    }
                }
            }
        }
        return G0.UNINITIALIZED;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t(String str) {
        o();
        u(str);
        com.google.android.gms.internal.measurement.J0 j0J = J(str);
        if (j0J == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.G0 g02 : j0J.p()) {
            if (g02.p() == 3 && g02.r() == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(String str) {
        p();
        o();
        AbstractC1887A.d(str);
        C1554e c1554e = this.f4954y;
        if (c1554e.get(str) == null) {
            C0305n c0305n = this.f4510s.f4609s;
            T1.S(c0305n);
            B0.G0 g0W0 = c0305n.w0(str);
            C1554e c1554e2 = this.f4949E;
            C1554e c1554e3 = this.f4948D;
            C1554e c1554e4 = this.f4947C;
            C1554e c1554e5 = this.f4950u;
            if (g0W0 != null) {
                com.google.android.gms.internal.measurement.N0 n02 = (com.google.android.gms.internal.measurement.N0) x(str, (byte[]) g0W0.f234r).i();
                v(str, n02);
                c1554e5.put(str, y((com.google.android.gms.internal.measurement.O0) n02.e()));
                c1554e.put(str, (com.google.android.gms.internal.measurement.O0) n02.e());
                w(str, (com.google.android.gms.internal.measurement.O0) n02.e());
                c1554e4.put(str, ((com.google.android.gms.internal.measurement.O0) n02.f11012r).A());
                c1554e3.put(str, (String) g0W0.f235s);
                c1554e2.put(str, (String) g0W0.f236t);
                return;
            }
            c1554e5.put(str, null);
            this.f4952w.put(str, null);
            this.f4951v.put(str, null);
            this.f4953x.put(str, null);
            c1554e.put(str, null);
            c1554e4.put(str, null);
            c1554e3.put(str, null);
            c1554e2.put(str, null);
            this.f4955z.put(str, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(String str, com.google.android.gms.internal.measurement.N0 n02) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        HashSet hashSet = new HashSet();
        C1554e c1554e = new C1554e(0);
        C1554e c1554e2 = new C1554e(0);
        C1554e c1554e3 = new C1554e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.O0) n02.f11012r).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.K0) it.next()).p());
        }
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.O0) n02.f11012r).u(); i++) {
            com.google.android.gms.internal.measurement.L0 l02 = (com.google.android.gms.internal.measurement.L0) ((com.google.android.gms.internal.measurement.O0) n02.f11012r).v(i).i();
            if (l02.h().isEmpty()) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4673z.b("EventConfig contained null event name");
            } else {
                String strH = l02.h();
                String strG = K0.g(l02.h(), K0.f4502a, K0.f4504c);
                if (!TextUtils.isEmpty(strG)) {
                    l02.b();
                    ((com.google.android.gms.internal.measurement.M0) l02.f11012r).w(strG);
                    n02.b();
                    ((com.google.android.gms.internal.measurement.O0) n02.f11012r).H(i, (com.google.android.gms.internal.measurement.M0) l02.e());
                }
                if (((com.google.android.gms.internal.measurement.M0) l02.f11012r).q() && ((com.google.android.gms.internal.measurement.M0) l02.f11012r).r()) {
                    c1554e.put(strH, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.M0) l02.f11012r).s() && ((com.google.android.gms.internal.measurement.M0) l02.f11012r).t()) {
                    c1554e2.put(l02.h(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.M0) l02.f11012r).u()) {
                    if (((com.google.android.gms.internal.measurement.M0) l02.f11012r).v() < 2 || ((com.google.android.gms.internal.measurement.M0) l02.f11012r).v() > 65535) {
                        X x7 = c0323t0.f5077v;
                        C0323t0.l(x7);
                        x7.f4673z.d(l02.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.M0) l02.f11012r).v()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c1554e3.put(l02.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.M0) l02.f11012r).v()));
                    }
                }
            }
        }
        this.f4951v.put(str, hashSet);
        this.f4952w.put(str, c1554e);
        this.f4953x.put(str, c1554e2);
        this.f4955z.put(str, c1554e3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(String str, com.google.android.gms.internal.measurement.O0 o02) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        int iY = o02.y();
        B2.e eVar = this.f4945A;
        if (iY == 0) {
            eVar.m(str);
            return;
        }
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4666E.c(Integer.valueOf(o02.y()), "EES programs found");
        com.google.android.gms.internal.measurement.E1 e12 = (com.google.android.gms.internal.measurement.E1) o02.x().get(0);
        try {
            com.google.android.gms.internal.measurement.D d5 = new com.google.android.gms.internal.measurement.D();
            E.c0 c0Var = d5.f10615a;
            ((HashMap) ((F2) c0Var.f1555t).f10630q).put("internal.remoteConfig", new CallableC0297k0(this, str, 2));
            ((HashMap) ((F2) c0Var.f1555t).f10630q).put("internal.appMetadata", new CallableC0297k0(this, str, 0));
            ((HashMap) ((F2) c0Var.f1555t).f10630q).put("internal.logger", new G3.b(1, this));
            d5.b(e12);
            eVar.l(str, d5);
            C0323t0.l(x6);
            V v6 = x6.f4666E;
            v6.d(str, Integer.valueOf(e12.q().q()), "EES program loaded for appId, activities");
            for (com.google.android.gms.internal.measurement.D1 d12 : e12.q().p()) {
                C0323t0.l(x6);
                v6.c(d12.p(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.Q unused) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.c(str, "Failed to load EES program. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final com.google.android.gms.internal.measurement.O0 x(String str, byte[] bArr) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.O0.G();
        }
        try {
            com.google.android.gms.internal.measurement.O0 o02 = (com.google.android.gms.internal.measurement.O0) ((com.google.android.gms.internal.measurement.N0) C0270b0.b0(com.google.android.gms.internal.measurement.O0.F(), bArr)).e();
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4666E.d(o02.p() ? Long.valueOf(o02.q()) : null, o02.r() ? o02.s() : null, "Parsed config. version, gmp_app_id");
            return o02;
        } catch (C0895z2 e7) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4673z.d(X.w(str), e7, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.O0.G();
        } catch (RuntimeException e8) {
            X x8 = c0323t0.f5077v;
            C0323t0.l(x8);
            x8.f4673z.d(X.w(str), e8, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.O0.G();
        }
    }

    @Override // O3.O1
    public final void r() {
    }
}
