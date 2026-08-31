package D2;

import android.content.Context;
import androidx.lifecycle.AbstractC0654q;
import c3.C0733c;
import java.util.LinkedHashMap;
import java.util.List;
import n5.x;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F2.b f1384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f1385e;
    public E2.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f1386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0733c f1387h;
    public final LinkedHashMap i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f1389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public E2.i f1390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public E2.g f1391n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0654q f1392o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public E2.i f1393p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public E2.g f1394q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(Context context) {
        this.f1381a = context;
        this.f1382b = H2.d.f2135a;
        this.f1383c = null;
        this.f1384d = null;
        this.f1385e = null;
        this.f = null;
        this.f1386g = n5.s.f15299q;
        this.f1387h = null;
        this.i = null;
        this.j = true;
        this.f1388k = true;
        this.f1389l = null;
        this.f1390m = null;
        this.f1391n = null;
        this.f1392o = null;
        this.f1393p = null;
        this.f1394q = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D2.j a() {
        /*
            r30 = this;
            r0 = r30
            java.lang.Object r1 = r0.f1383c
            if (r1 != 0) goto L8
            D2.l r1 = D2.l.f1419b
        L8:
            r4 = r1
            F2.b r5 = r0.f1384d
            D2.i r6 = r0.f1385e
            D2.c r1 = r0.f1382b
            android.graphics.Bitmap$Config r7 = r1.f1370g
            E2.d r2 = r0.f
            if (r2 != 0) goto L17
            E2.d r2 = r1.f
        L17:
            r8 = r2
            G2.a r10 = r1.f1369e
            c3.c r2 = r0.f1387h
            if (r2 == 0) goto L23
            d6.l r2 = r2.d()
            goto L24
        L23:
            r2 = 0
        L24:
            if (r2 != 0) goto L2a
            d6.l r2 = H2.f.f2139c
        L28:
            r11 = r2
            goto L2d
        L2a:
            android.graphics.Bitmap$Config[] r3 = H2.f.f2137a
            goto L28
        L2d:
            java.util.LinkedHashMap r2 = r0.i
            if (r2 == 0) goto L3b
            D2.s r3 = new D2.s
            java.util.Map r2 = com.google.android.gms.internal.measurement.I1.F0(r2)
            r3.<init>(r2)
            goto L3c
        L3b:
            r3 = 0
        L3c:
            if (r3 != 0) goto L40
            D2.s r3 = D2.s.f1442b
        L40:
            r12 = r3
            D2.c r2 = r0.f1382b
            boolean r14 = r2.f1371h
            r2.getClass()
            D2.c r2 = r0.f1382b
            D2.b r3 = r2.i
            D2.b r9 = r2.j
            D2.b r13 = r2.f1372k
            M5.s r15 = r2.f1365a
            M5.s r1 = r2.f1366b
            r21 = r1
            M5.s r1 = r2.f1367c
            M5.s r2 = r2.f1368d
            r22 = r1
            androidx.lifecycle.q r1 = r0.f1392o
            r17 = r3
            android.content.Context r3 = r0.f1381a
            if (r1 != 0) goto L94
            F2.b r1 = r0.f1384d
            r23 = r2
            boolean r2 = r1 instanceof F2.a
            if (r2 == 0) goto L75
            F2.a r1 = (F2.a) r1
            android.widget.ImageView r1 = r1.f1946r
            android.content.Context r1 = r1.getContext()
            goto L76
        L75:
            r1 = r3
        L76:
            boolean r2 = r1 instanceof androidx.lifecycle.InterfaceC0660x
            if (r2 == 0) goto L81
            androidx.lifecycle.x r1 = (androidx.lifecycle.InterfaceC0660x) r1
            androidx.lifecycle.q r1 = r1.getLifecycle()
            goto L86
        L81:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 != 0) goto L8d
            r1 = 0
        L86:
            if (r1 != 0) goto L8a
            D2.g r1 = D2.g.f1379b
        L8a:
            r24 = r1
            goto L97
        L8d:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L76
        L94:
            r23 = r2
            goto L8a
        L97:
            E2.i r1 = r0.f1390m
            if (r1 != 0) goto Ld1
            E2.i r1 = r0.f1393p
            if (r1 != 0) goto Ld1
            F2.b r1 = r0.f1384d
            boolean r2 = r1 instanceof F2.a
            if (r2 == 0) goto Lc7
            F2.a r1 = (F2.a) r1
            android.widget.ImageView r1 = r1.f1946r
            android.widget.ImageView$ScaleType r2 = r1.getScaleType()
            r18 = r4
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER
            if (r2 == r4) goto Lbf
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.MATRIX
            if (r2 != r4) goto Lb8
            goto Lbf
        Lb8:
            E2.f r2 = new E2.f
            r2.<init>(r1)
            r1 = r2
            goto Lce
        Lbf:
            E2.h r1 = E2.h.f1687c
            E2.e r1 = new E2.e
            r1.<init>()
            goto Lce
        Lc7:
            r18 = r4
            E2.c r1 = new E2.c
            r1.<init>(r3)
        Lce:
            r25 = r1
            goto Ld4
        Ld1:
            r18 = r4
            goto Lce
        Ld4:
            E2.g r1 = r0.f1391n
            if (r1 != 0) goto L121
            E2.g r1 = r0.f1394q
            if (r1 != 0) goto L121
            E2.i r1 = r0.f1390m
            boolean r2 = r1 instanceof E2.f
            if (r2 == 0) goto Le5
            E2.f r1 = (E2.f) r1
            goto Le6
        Le5:
            r1 = 0
        Le6:
            if (r1 == 0) goto Leb
            android.widget.ImageView r1 = r1.f1683q
            goto Lfb
        Leb:
            F2.b r1 = r0.f1384d
            boolean r2 = r1 instanceof F2.a
            if (r2 == 0) goto Lf4
            F2.a r1 = (F2.a) r1
            goto Lf5
        Lf4:
            r1 = 0
        Lf5:
            if (r1 == 0) goto Lfa
            android.widget.ImageView r1 = r1.f1946r
            goto Lfb
        Lfa:
            r1 = 0
        Lfb:
            E2.g r2 = E2.g.f1685r
            if (r1 == 0) goto L120
            android.graphics.Bitmap$Config[] r4 = H2.f.f2137a
            android.widget.ImageView$ScaleType r1 = r1.getScaleType()
            if (r1 != 0) goto L109
            r1 = -1
            goto L111
        L109:
            int[] r4 = H2.e.f2136a
            int r1 = r1.ordinal()
            r1 = r4[r1]
        L111:
            r4 = 1
            if (r1 == r4) goto L120
            r4 = 2
            if (r1 == r4) goto L120
            r4 = 3
            if (r1 == r4) goto L120
            r4 = 4
            if (r1 == r4) goto L120
            E2.g r1 = E2.g.f1684q
            goto L121
        L120:
            r1 = r2
        L121:
            r26 = r1
            D2.o r1 = r0.f1389l
            if (r1 == 0) goto L134
            D2.p r2 = new D2.p
            java.util.LinkedHashMap r1 = r1.f1433a
            java.util.Map r1 = com.google.android.gms.internal.measurement.I1.F0(r1)
            r2.<init>(r1)
            r1 = r2
            goto L135
        L134:
            r1 = 0
        L135:
            if (r1 != 0) goto L139
            D2.p r1 = D2.p.f1434r
        L139:
            r27 = r1
            D2.d r1 = new D2.d
            E2.i r2 = r0.f1390m
            E2.g r4 = r0.f1391n
            r16 = r3
            E2.d r3 = r0.f
            r1.<init>(r2, r4, r3)
            D2.c r2 = r0.f1382b
            r29 = r2
            D2.j r2 = new D2.j
            r4 = r18
            r18 = r9
            java.util.List r9 = r0.f1386g
            r19 = r13
            boolean r13 = r0.j
            r20 = r15
            r15 = 0
            boolean r3 = r0.f1388k
            r28 = r16
            r16 = r3
            r3 = r28
            r28 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.h.a():D2.j");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        this.f1392o = null;
        this.f1393p = null;
        this.f1394q = null;
    }

    public h(j jVar, Context context) {
        this.f1381a = context;
        this.f1382b = jVar.f1395A;
        this.f1383c = jVar.f1397b;
        this.f1384d = jVar.f1398c;
        this.f1385e = jVar.f1399d;
        d dVar = jVar.f1418z;
        this.f = dVar.f1375c;
        this.f1386g = jVar.f1401g;
        this.f1387h = jVar.i.h();
        this.i = x.P(jVar.j.f1443a);
        this.j = jVar.f1403k;
        this.f1388k = jVar.f1406n;
        this.f1389l = new o(jVar.f1417y);
        this.f1390m = dVar.f1373a;
        this.f1391n = dVar.f1374b;
        if (jVar.f1396a == context) {
            this.f1392o = jVar.f1414v;
            this.f1393p = jVar.f1415w;
            this.f1394q = jVar.f1416x;
        } else {
            this.f1392o = null;
            this.f1393p = null;
            this.f1394q = null;
        }
    }
}
