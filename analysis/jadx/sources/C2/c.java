package C2;

import d6.s;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f1171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f1173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Date f1175e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f1176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1177h;
    public final long i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1178k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(d6.s r18, C2.b r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            java.lang.String r2 = "Last-Modified"
            java.lang.String r3 = "Expires"
            java.lang.String r4 = "Date"
            r1.<init>()
            r5 = r18
            r1.f1171a = r5
            r1.f1172b = r0
            r5 = -1
            r1.f1178k = r5
            if (r0 == 0) goto L1da
            long r6 = r0.f1168c
            r1.f1177h = r6
            long r6 = r0.f1169d
            r1.i = r6
            d6.l r0 = r0.f
            int r6 = r0.size()
            r7 = 0
            r8 = r7
        L28:
            if (r8 >= r6) goto L1da
            java.lang.String r9 = r0.g(r8)
            r10 = 1
            boolean r11 = J5.t.B0(r9, r4, r10)
            if (r11 == 0) goto Lab
            java.lang.String r9 = r0.d(r4)
            if (r9 == 0) goto L43
            C0.d0 r10 = i6.c.f13645a
            int r10 = r9.length()
            if (r10 != 0) goto L45
        L43:
            r12 = 0
            goto La0
        L45:
            java.text.ParsePosition r10 = new java.text.ParsePosition
            r10.<init>(r7)
            C0.d0 r11 = i6.c.f13645a
            java.lang.Object r11 = r11.get()
            java.text.DateFormat r11 = (java.text.DateFormat) r11
            java.util.Date r11 = r11.parse(r9, r10)
            int r13 = r10.getIndex()
            int r14 = r9.length()
            if (r13 != r14) goto L62
            r12 = r11
            goto La0
        L62:
            java.lang.String[] r11 = i6.c.f13646b
            monitor-enter(r11)
            int r13 = r11.length     // Catch: java.lang.Throwable -> L83
            r14 = r7
        L67:
            if (r14 >= r13) goto L9c
            java.text.DateFormat[] r15 = i6.c.f13647c     // Catch: java.lang.Throwable -> L83
            r16 = r15[r14]     // Catch: java.lang.Throwable -> L83
            if (r16 != 0) goto L85
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L83
            java.lang.String[] r16 = i6.c.f13646b     // Catch: java.lang.Throwable -> L83
            r12 = r16[r14]     // Catch: java.lang.Throwable -> L83
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L83
            r5.<init>(r12, r7)     // Catch: java.lang.Throwable -> L83
            java.util.TimeZone r7 = e6.b.f12676d     // Catch: java.lang.Throwable -> L83
            r5.setTimeZone(r7)     // Catch: java.lang.Throwable -> L83
            r15[r14] = r5     // Catch: java.lang.Throwable -> L83
            r7 = 0
            goto L87
        L83:
            r0 = move-exception
            goto L9e
        L85:
            r5 = r16
        L87:
            r10.setIndex(r7)     // Catch: java.lang.Throwable -> L83
            java.util.Date r5 = r5.parse(r9, r10)     // Catch: java.lang.Throwable -> L83
            int r7 = r10.getIndex()     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L97
            monitor-exit(r11)
            r12 = r5
            goto La0
        L97:
            int r14 = r14 + 1
            r5 = -1
            r7 = 0
            goto L67
        L9c:
            monitor-exit(r11)
            goto L43
        L9e:
            monitor-exit(r11)
            throw r0
        La0:
            r1.f1173c = r12
            java.lang.String r5 = r0.i(r8)
            r1.f1174d = r5
        La8:
            r12 = 0
            goto L1d4
        Lab:
            boolean r5 = J5.t.B0(r9, r3, r10)
            if (r5 == 0) goto L11b
            java.lang.String r5 = r0.d(r3)
            if (r5 == 0) goto Lbf
            C0.d0 r7 = i6.c.f13645a
            int r7 = r5.length()
            if (r7 != 0) goto Lc1
        Lbf:
            r12 = 0
            goto L118
        Lc1:
            java.text.ParsePosition r7 = new java.text.ParsePosition
            r9 = 0
            r7.<init>(r9)
            C0.d0 r9 = i6.c.f13645a
            java.lang.Object r9 = r9.get()
            java.text.DateFormat r9 = (java.text.DateFormat) r9
            java.util.Date r9 = r9.parse(r5, r7)
            int r10 = r7.getIndex()
            int r11 = r5.length()
            if (r10 != r11) goto Ldf
            r12 = r9
            goto L118
        Ldf:
            java.lang.String[] r9 = i6.c.f13646b
            monitor-enter(r9)
            int r10 = r9.length     // Catch: java.lang.Throwable -> L100
            r11 = 0
        Le4:
            if (r11 >= r10) goto L114
            java.text.DateFormat[] r12 = i6.c.f13647c     // Catch: java.lang.Throwable -> L100
            r13 = r12[r11]     // Catch: java.lang.Throwable -> L100
            if (r13 != 0) goto Lfe
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L100
            java.lang.String[] r14 = i6.c.f13646b     // Catch: java.lang.Throwable -> L100
            r14 = r14[r11]     // Catch: java.lang.Throwable -> L100
            java.util.Locale r15 = java.util.Locale.US     // Catch: java.lang.Throwable -> L100
            r13.<init>(r14, r15)     // Catch: java.lang.Throwable -> L100
            java.util.TimeZone r14 = e6.b.f12676d     // Catch: java.lang.Throwable -> L100
            r13.setTimeZone(r14)     // Catch: java.lang.Throwable -> L100
            r12[r11] = r13     // Catch: java.lang.Throwable -> L100
        Lfe:
            r12 = 0
            goto L102
        L100:
            r0 = move-exception
            goto L116
        L102:
            r7.setIndex(r12)     // Catch: java.lang.Throwable -> L100
            java.util.Date r12 = r13.parse(r5, r7)     // Catch: java.lang.Throwable -> L100
            int r13 = r7.getIndex()     // Catch: java.lang.Throwable -> L100
            if (r13 == 0) goto L111
            monitor-exit(r9)
            goto L118
        L111:
            int r11 = r11 + 1
            goto Le4
        L114:
            monitor-exit(r9)
            goto Lbf
        L116:
            monitor-exit(r9)
            throw r0
        L118:
            r1.f1176g = r12
            goto La8
        L11b:
            boolean r5 = J5.t.B0(r9, r2, r10)
            if (r5 == 0) goto L194
            java.lang.String r5 = r0.d(r2)
            if (r5 == 0) goto L12f
            C0.d0 r7 = i6.c.f13645a
            int r7 = r5.length()
            if (r7 != 0) goto L132
        L12f:
            r12 = 0
        L130:
            r13 = 0
            goto L18b
        L132:
            java.text.ParsePosition r7 = new java.text.ParsePosition
            r9 = 0
            r7.<init>(r9)
            C0.d0 r9 = i6.c.f13645a
            java.lang.Object r9 = r9.get()
            java.text.DateFormat r9 = (java.text.DateFormat) r9
            java.util.Date r9 = r9.parse(r5, r7)
            int r10 = r7.getIndex()
            int r11 = r5.length()
            if (r10 != r11) goto L151
            r13 = r9
            r12 = 0
            goto L18b
        L151:
            java.lang.String[] r9 = i6.c.f13646b
            monitor-enter(r9)
            int r10 = r9.length     // Catch: java.lang.Throwable -> L172
            r11 = 0
        L156:
            if (r11 >= r10) goto L186
            java.text.DateFormat[] r12 = i6.c.f13647c     // Catch: java.lang.Throwable -> L172
            r13 = r12[r11]     // Catch: java.lang.Throwable -> L172
            if (r13 != 0) goto L170
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L172
            java.lang.String[] r14 = i6.c.f13646b     // Catch: java.lang.Throwable -> L172
            r14 = r14[r11]     // Catch: java.lang.Throwable -> L172
            java.util.Locale r15 = java.util.Locale.US     // Catch: java.lang.Throwable -> L172
            r13.<init>(r14, r15)     // Catch: java.lang.Throwable -> L172
            java.util.TimeZone r14 = e6.b.f12676d     // Catch: java.lang.Throwable -> L172
            r13.setTimeZone(r14)     // Catch: java.lang.Throwable -> L172
            r12[r11] = r13     // Catch: java.lang.Throwable -> L172
        L170:
            r12 = 0
            goto L174
        L172:
            r0 = move-exception
            goto L189
        L174:
            r7.setIndex(r12)     // Catch: java.lang.Throwable -> L172
            java.util.Date r13 = r13.parse(r5, r7)     // Catch: java.lang.Throwable -> L172
            int r14 = r7.getIndex()     // Catch: java.lang.Throwable -> L172
            if (r14 == 0) goto L183
            monitor-exit(r9)
            goto L18b
        L183:
            int r11 = r11 + 1
            goto L156
        L186:
            r12 = 0
            monitor-exit(r9)
            goto L130
        L189:
            monitor-exit(r9)
            throw r0
        L18b:
            r1.f1175e = r13
            java.lang.String r5 = r0.i(r8)
            r1.f = r5
            goto L1d4
        L194:
            r12 = 0
            java.lang.String r5 = "ETag"
            boolean r5 = J5.t.B0(r9, r5, r10)
            if (r5 == 0) goto L1a4
            java.lang.String r5 = r0.i(r8)
            r1.j = r5
            goto L1d4
        L1a4:
            java.lang.String r5 = "Age"
            boolean r5 = J5.t.B0(r9, r5, r10)
            if (r5 == 0) goto L1d4
            java.lang.String r5 = r0.i(r8)
            android.graphics.Bitmap$Config[] r7 = H2.f.f2137a
            java.lang.Long r5 = J5.t.I0(r5)
            if (r5 == 0) goto L1d1
            long r9 = r5.longValue()
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 <= 0) goto L1c7
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L1d2
        L1c7:
            r13 = 0
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 >= 0) goto L1cf
            r7 = r12
            goto L1d2
        L1cf:
            int r7 = (int) r9
            goto L1d2
        L1d1:
            r7 = -1
        L1d2:
            r1.f1178k = r7
        L1d4:
            int r8 = r8 + 1
            r7 = r12
            r5 = -1
            goto L28
        L1da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.c.<init>(d6.s, C2.b):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, m5.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final C2.d a() {
        /*
            r23 = this;
            r0 = r23
            d6.s r1 = r0.f1171a
            d6.l r2 = r1.f12415c
            d6.n r3 = r1.f12413a
            r4 = 0
            C2.b r5 = r0.f1172b
            if (r5 != 0) goto L13
            C2.d r2 = new C2.d
            r2.<init>(r1, r4)
            return r2
        L13:
            java.lang.Object r6 = r5.f1166a
            boolean r7 = r3.i
            if (r7 == 0) goto L23
            boolean r7 = r5.f1170e
            if (r7 != 0) goto L23
            C2.d r2 = new C2.d
            r2.<init>(r1, r4)
            return r2
        L23:
            java.lang.Object r7 = r6.getValue()
            d6.c r7 = (d6.c) r7
            d6.c r8 = r1.a()
            boolean r8 = r8.f12308b
            if (r8 != 0) goto L18a
            java.lang.Object r8 = r6.getValue()
            d6.c r8 = (d6.c) r8
            boolean r8 = r8.f12308b
            if (r8 != 0) goto L18a
            d6.l r8 = r5.f
            java.lang.String r9 = "Vary"
            java.lang.String r8 = r8.d(r9)
            java.lang.String r9 = "*"
            boolean r8 = kotlin.jvm.internal.m.a(r8, r9)
            if (r8 != 0) goto L18a
            d6.c r8 = r1.a()
            boolean r9 = r8.f12307a
            if (r9 != 0) goto L183
            java.lang.String r9 = "If-Modified-Since"
            java.lang.String r10 = r2.d(r9)
            if (r10 != 0) goto L183
            java.lang.String r10 = "If-None-Match"
            java.lang.String r2 = r2.d(r10)
            if (r2 == 0) goto L65
            goto L183
        L65:
            long r11 = r0.i
            java.util.Date r2 = r0.f1173c
            r13 = 0
            if (r2 == 0) goto L7a
            long r15 = r2.getTime()
            r17 = r5
            long r4 = r11 - r15
            long r4 = java.lang.Math.max(r13, r4)
            goto L7d
        L7a:
            r17 = r5
            r4 = r13
        L7d:
            r15 = -1
            r18 = r13
            int r13 = r0.f1178k
            if (r13 == r15) goto L94
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            r16 = r9
            r20 = r10
            long r9 = (long) r13
            long r9 = r14.toMillis(r9)
            long r4 = java.lang.Math.max(r4, r9)
            goto L98
        L94:
            r16 = r9
            r20 = r10
        L98:
            long r9 = r0.f1177h
            long r13 = r11 - r9
            H2.n r21 = H2.o.f2163a
            java.lang.Object r21 = r21.invoke()
            java.lang.Number r21 = (java.lang.Number) r21
            long r21 = r21.longValue()
            long r21 = r21 - r11
            long r4 = r4 + r13
            long r4 = r4 + r21
            java.lang.Object r6 = r6.getValue()
            d6.c r6 = (d6.c) r6
            int r6 = r6.f12309c
            java.util.Date r13 = r0.f1175e
            if (r6 == r15) goto Lc1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = (long) r6
            long r9 = r3.toMillis(r9)
            goto L101
        Lc1:
            java.util.Date r6 = r0.f1176g
            if (r6 == 0) goto Ld8
            if (r2 == 0) goto Lcb
            long r11 = r2.getTime()
        Lcb:
            long r9 = r6.getTime()
            long r9 = r9 - r11
            int r3 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r3 <= 0) goto Ld5
            goto L101
        Ld5:
            r9 = r18
            goto L101
        Ld8:
            if (r13 == 0) goto Ld5
            java.util.List r3 = r3.f
            if (r3 != 0) goto Le0
            r3 = 0
            goto Lec
        Le0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            d6.b.g(r3, r6)
            java.lang.String r3 = r6.toString()
        Lec:
            if (r3 != 0) goto Ld5
            if (r2 == 0) goto Lf4
            long r9 = r2.getTime()
        Lf4:
            long r11 = r13.getTime()
            long r9 = r9 - r11
            int r3 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r3 <= 0) goto Ld5
            r3 = 10
            long r11 = (long) r3
            long r9 = r9 / r11
        L101:
            int r3 = r8.f12309c
            if (r3 == r15) goto L110
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = (long) r3
            long r11 = r6.toMillis(r11)
            long r9 = java.lang.Math.min(r9, r11)
        L110:
            int r3 = r8.i
            if (r3 == r15) goto L11c
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = (long) r3
            long r11 = r6.toMillis(r11)
            goto L11e
        L11c:
            r11 = r18
        L11e:
            boolean r3 = r7.f12312g
            if (r3 != 0) goto L12f
            int r3 = r8.f12313h
            if (r3 == r15) goto L12f
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r14 = (long) r3
            long r14 = r6.toMillis(r14)
            r18 = r14
        L12f:
            boolean r3 = r7.f12307a
            if (r3 != 0) goto L143
            long r4 = r4 + r11
            long r9 = r9 + r18
            int r3 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r3 >= 0) goto L143
            C2.d r1 = new C2.d
            r3 = r17
            r2 = 0
            r1.<init>(r2, r3)
            return r1
        L143:
            r3 = r17
            java.lang.String r4 = r0.j
            if (r4 == 0) goto L14c
            r9 = r20
            goto L15e
        L14c:
            if (r13 == 0) goto L156
            java.lang.String r4 = r0.f
            kotlin.jvm.internal.m.b(r4)
        L153:
            r9 = r16
            goto L15e
        L156:
            if (r2 == 0) goto L17c
            java.lang.String r4 = r0.f1174d
            kotlin.jvm.internal.m.b(r4)
            goto L153
        L15e:
            L0.l r1 = r1.b()
            java.lang.Object r2 = r1.f3127d
            c3.c r2 = (c3.C0733c) r2
            r2.getClass()
            com.google.android.gms.internal.measurement.P1.h(r9)
            com.google.android.gms.internal.measurement.P1.k(r4, r9)
            r2.a(r9, r4)
            d6.s r1 = r1.c()
            C2.d r2 = new C2.d
            r2.<init>(r1, r3)
            return r2
        L17c:
            C2.d r2 = new C2.d
            r3 = 0
            r2.<init>(r1, r3)
            return r2
        L183:
            r3 = r4
            C2.d r2 = new C2.d
            r2.<init>(r1, r3)
            return r2
        L18a:
            r3 = r4
            C2.d r2 = new C2.d
            r2.<init>(r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.c.a():C2.d");
    }
}
