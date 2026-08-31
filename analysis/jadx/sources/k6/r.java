package k6;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import q6.C1541j;
import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Logger f14211t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1540i f14212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f14213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f14214s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Logger logger = Logger.getLogger(f.class.getName());
        kotlin.jvm.internal.m.d(logger, "getLogger(Http2::class.java.name)");
        f14211t = logger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(q6.A source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f14212q = source;
        q qVar = new q(source);
        this.f14213r = qVar;
        this.f14214s = new c(qVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x024e, code lost:
    
        throw new java.io.IOException(k1.i.i(r13, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r24, a5.v r25) throws java.io.IOException {
        /*
            r23 = this;
            r1 = r23
            r0 = r25
            r2 = 0
            q6.i r3 = r1.f14212q     // Catch: java.io.EOFException -> L365
            r4 = 9
            r3.Q(r4)     // Catch: java.io.EOFException -> L365
            q6.i r3 = r1.f14212q
            int r3 = e6.b.p(r3)
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r4) goto L359
            q6.i r5 = r1.f14212q
            byte r5 = r5.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            q6.i r6 = r1.f14212q
            byte r6 = r6.readByte()
            r7 = r6 & 255(0xff, float:3.57E-43)
            q6.i r8 = r1.f14212q
            int r8 = r8.readInt()
            r9 = 2147483647(0x7fffffff, float:NaN)
            r13 = r8 & r9
            java.util.logging.Logger r9 = k6.r.f14211t
            java.util.logging.Level r10 = java.util.logging.Level.FINE
            boolean r10 = r9.isLoggable(r10)
            r11 = 1
            if (r10 == 0) goto L43
            java.lang.String r10 = k6.f.a(r11, r13, r3, r5, r7)
            r9.fine(r10)
        L43:
            r9 = 4
            if (r24 == 0) goto L73
            if (r5 != r9) goto L49
            goto L73
        L49:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a SETTINGS frame but was "
            r2.<init>(r3)
            java.lang.String[] r3 = k6.f.f14156b
            int r4 = r3.length
            if (r5 >= r4) goto L5a
            r3 = r3[r5]
            goto L68
        L5a:
            java.lang.String r3 = "0x%02x"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r3 = e6.b.f(r3, r4)
        L68:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L73:
            r12 = 5
            r14 = 3
            r15 = 2
            r24 = 14
            r10 = 8
            r17 = r5
            r4 = 0
            switch(r17) {
                case 0: goto L354;
                case 1: goto L34f;
                case 2: goto L32b;
                case 3: goto L2a2;
                case 4: goto L1ef;
                case 5: goto L1eb;
                case 6: goto L171;
                case 7: goto Ldf;
                case 8: goto L88;
                default: goto L81;
            }
        L81:
            q6.i r0 = r1.f14212q
            long r2 = (long) r3
            r0.skip(r2)
            return r11
        L88:
            if (r3 != r9) goto Ld3
            q6.i r2 = r1.f14212q
            int r2 = r2.readInt()
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = (long) r2
            long r2 = r2 & r6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto Lcb
            if (r13 != 0) goto Lae
            java.lang.Object r0 = r0.f8997r
            r4 = r0
            k6.n r4 = (k6.n) r4
            monitor-enter(r4)
            long r5 = r4.f14183K     // Catch: java.lang.Throwable -> Lab
            long r5 = r5 + r2
            r4.f14183K = r5     // Catch: java.lang.Throwable -> Lab
            r4.notifyAll()     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r4)
            return r11
        Lab:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        Lae:
            java.lang.Object r0 = r0.f8997r
            k6.n r0 = (k6.n) r0
            k6.v r5 = r0.b(r13)
            if (r5 == 0) goto Lc8
            monitor-enter(r5)
            long r6 = r5.f     // Catch: java.lang.Throwable -> Lc5
            long r6 = r6 + r2
            r5.f = r6     // Catch: java.lang.Throwable -> Lc5
            if (r4 <= 0) goto Lc3
            r5.notifyAll()     // Catch: java.lang.Throwable -> Lc5
        Lc3:
            monitor-exit(r5)
            return r11
        Lc5:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        Lc8:
            r2 = r11
            goto L308
        Lcb:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "windowSizeIncrement was 0"
            r0.<init>(r2)
            throw r0
        Ld3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r2 = k1.i.i(r3, r2)
            r0.<init>(r2)
            throw r0
        Ldf:
            if (r3 < r10) goto L165
            if (r13 != 0) goto L15d
            q6.i r4 = r1.f14212q
            int r4 = r4.readInt()
            q6.i r5 = r1.f14212q
            int r5 = r5.readInt()
            int r3 = r3 - r10
            int[] r6 = O.c.b(r24)
            int r7 = r6.length
            r8 = r2
        Lf6:
            if (r8 >= r7) goto L104
            r9 = r6[r8]
            int r12 = O.c.a(r9)
            if (r12 != r5) goto L101
            goto L105
        L101:
            int r8 = r8 + 1
            goto Lf6
        L104:
            r9 = r2
        L105:
            if (r9 == 0) goto L151
            q6.j r5 = q6.C1541j.f16064t
            if (r3 <= 0) goto L112
            q6.i r5 = r1.f14212q
            long r6 = (long) r3
            q6.j r5 = r5.k(r6)
        L112:
            java.lang.String r3 = "debugData"
            kotlin.jvm.internal.m.e(r5, r3)
            r5.c()
            java.lang.Object r3 = r0.f8997r
            k6.n r3 = (k6.n) r3
            monitor-enter(r3)
            java.util.LinkedHashMap r5 = r3.f14189r     // Catch: java.lang.Throwable -> L14e
            java.util.Collection r5 = r5.values()     // Catch: java.lang.Throwable -> L14e
            k6.v[] r6 = new k6.v[r2]     // Catch: java.lang.Throwable -> L14e
            java.lang.Object[] r5 = r5.toArray(r6)     // Catch: java.lang.Throwable -> L14e
            r3.f14193v = r11     // Catch: java.lang.Throwable -> L14e
            monitor-exit(r3)
            k6.v[] r5 = (k6.v[]) r5
            int r3 = r5.length
        L131:
            if (r2 >= r3) goto Lc8
            r6 = r5[r2]
            int r7 = r6.f14226a
            if (r7 <= r4) goto L14b
            boolean r7 = r6.g()
            if (r7 == 0) goto L14b
            r6.j(r10)
            java.lang.Object r7 = r0.f8997r
            k6.n r7 = (k6.n) r7
            int r6 = r6.f14226a
            r7.c(r6)
        L14b:
            int r2 = r2 + 1
            goto L131
        L14e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L151:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r2 = k1.i.i(r5, r2)
            r0.<init>(r2)
            throw r0
        L15d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            r0.<init>(r2)
            throw r0
        L165:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_GOAWAY length < 8: "
            java.lang.String r2 = k1.i.i(r3, r2)
            r0.<init>(r2)
            throw r0
        L171:
            if (r3 != r10) goto L1df
            if (r13 != 0) goto L1d7
            q6.i r3 = r1.f14212q
            int r3 = r3.readInt()
            q6.i r7 = r1.f14212q
            int r20 = r7.readInt()
            r6 = r6 & r11
            if (r6 == 0) goto L185
            r2 = r11
        L185:
            if (r2 == 0) goto L1ab
            java.lang.Object r0 = r0.f8997r
            r2 = r0
            k6.n r2 = (k6.n) r2
            monitor-enter(r2)
            r4 = 1
            if (r3 == r11) goto L1a2
            if (r3 == r15) goto L19c
            if (r3 == r14) goto L196
            goto L1a7
        L196:
            r2.notifyAll()     // Catch: java.lang.Throwable -> L19a
            goto L1a7
        L19a:
            r0 = move-exception
            goto L1a9
        L19c:
            long r6 = r2.f14176D     // Catch: java.lang.Throwable -> L19a
            long r6 = r6 + r4
            r2.f14176D = r6     // Catch: java.lang.Throwable -> L19a
            goto L1a7
        L1a2:
            long r6 = r2.f14174B     // Catch: java.lang.Throwable -> L19a
            long r6 = r6 + r4
            r2.f14174B = r6     // Catch: java.lang.Throwable -> L19a
        L1a7:
            monitor-exit(r2)
            return r11
        L1a9:
            monitor-exit(r2)
            throw r0
        L1ab:
            java.lang.Object r2 = r0.f8997r
            k6.n r2 = (k6.n) r2
            g6.c r2 = r2.f14195x
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Object r7 = r0.f8997r
            k6.n r7 = (k6.n) r7
            java.lang.String r7 = r7.f14190s
            java.lang.String r8 = " ping"
            java.lang.String r17 = k1.i.k(r6, r7, r8)
            java.lang.Object r0 = r0.f8997r
            r18 = r0
            k6.n r18 = (k6.n) r18
            k6.j r16 = new k6.j
            r21 = 0
            r19 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            r0 = r16
            r2.c(r0, r4)
            return r11
        L1d7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING streamId != 0"
            r0.<init>(r2)
            throw r0
        L1df:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_PING length != 8: "
            java.lang.String r2 = k1.i.i(r3, r2)
            r0.<init>(r2)
            throw r0
        L1eb:
            r1.f(r0, r3, r7, r13)
            return r11
        L1ef:
            q6.i r7 = r1.f14212q
            if (r13 != 0) goto L29a
            r6 = r6 & r11
            if (r6 == 0) goto L202
            if (r3 != 0) goto L1fa
            goto Lc8
        L1fa:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r0.<init>(r2)
            throw r0
        L202:
            int r6 = r3 % 6
            if (r6 != 0) goto L28e
            k6.z r6 = new k6.z
            r6.<init>()
            G5.d r2 = D5.a.O(r2, r3)
            r3 = 6
            G5.b r2 = D5.a.M(r2, r3)
            int r3 = r2.f2017q
            int r8 = r2.f2018r
            int r2 = r2.f2019s
            if (r2 <= 0) goto L21e
            if (r3 <= r8) goto L222
        L21e:
            if (r2 >= 0) goto L272
            if (r8 > r3) goto L272
        L222:
            short r10 = r7.readShort()
            byte[] r13 = e6.b.f12673a
            r13 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r13
            int r13 = r7.readInt()
            if (r10 == r15) goto L25d
            if (r10 == r14) goto L25b
            if (r10 == r9) goto L24f
            if (r10 == r12) goto L239
            goto L26a
        L239:
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r13 < r14) goto L243
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            if (r13 > r14) goto L243
            goto L26a
        L243:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r2 = k1.i.i(r13, r2)
            r0.<init>(r2)
            throw r0
        L24f:
            if (r13 < 0) goto L253
            r10 = 7
            goto L26a
        L253:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r0.<init>(r2)
            throw r0
        L25b:
            r10 = r9
            goto L26a
        L25d:
            if (r13 == 0) goto L26a
            if (r13 != r11) goto L262
            goto L26a
        L262:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r0.<init>(r2)
            throw r0
        L26a:
            r6.c(r10, r13)
            if (r3 == r8) goto L272
            int r3 = r3 + r2
            r14 = 3
            goto L222
        L272:
            java.lang.Object r2 = r0.f8997r
            k6.n r2 = (k6.n) r2
            g6.c r3 = r2.f14195x
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = r2.f14190s
            java.lang.String r8 = " applyAndAckSettings"
            java.lang.String r2 = k1.i.k(r7, r2, r8)
            k6.i r7 = new k6.i
            r7.<init>(r2, r0, r6, r15)
            r3.c(r7, r4)
            return r11
        L28e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r2 = k1.i.i(r3, r2)
            r0.<init>(r2)
            throw r0
        L29a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            r0.<init>(r2)
            throw r0
        L2a2:
            if (r3 != r9) goto L31d
            if (r13 == 0) goto L315
            q6.i r3 = r1.f14212q
            int r3 = r3.readInt()
            int[] r6 = O.c.b(r24)
            int r7 = r6.length
            r9 = r2
        L2b2:
            if (r9 >= r7) goto L2c1
            r10 = r6[r9]
            int r12 = O.c.a(r10)
            if (r12 != r3) goto L2be
            r14 = r10
            goto L2c2
        L2be:
            int r9 = r9 + 1
            goto L2b2
        L2c1:
            r14 = r2
        L2c2:
            if (r14 == 0) goto L309
            java.lang.Object r0 = r0.f8997r
            r12 = r0
            k6.n r12 = (k6.n) r12
            if (r13 == 0) goto L2d0
            r0 = r8 & 1
            if (r0 != 0) goto L2d0
            r2 = r11
        L2d0:
            if (r2 == 0) goto L2fe
            g6.c r0 = r12.f14196y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.f14190s
            r2.append(r3)
            r3 = 91
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = "] onReset"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            k6.j r10 = new k6.j
            r15 = 1
            r22 = r11
            r11 = r2
            r2 = r22
            r10.<init>(r11, r12, r13, r14, r15)
            r0.c(r10, r4)
            return r2
        L2fe:
            r2 = r11
            k6.v r0 = r12.c(r13)
            if (r0 == 0) goto L308
            r0.j(r14)
        L308:
            return r2
        L309:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r2 = k1.i.i(r3, r2)
            r0.<init>(r2)
            throw r0
        L315:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            r0.<init>(r2)
            throw r0
        L31d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_RST_STREAM length: "
            java.lang.String r4 = " != 4"
            java.lang.String r2 = C0.S.m(r2, r4, r3)
            r0.<init>(r2)
            throw r0
        L32b:
            r2 = r11
            if (r3 != r12) goto L341
            if (r13 == 0) goto L339
            q6.i r0 = r1.f14212q
            r0.readInt()
            r0.readByte()
            return r2
        L339:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            r0.<init>(r2)
            throw r0
        L341:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TYPE_PRIORITY length: "
            java.lang.String r4 = " != 5"
            java.lang.String r2 = C0.S.m(r2, r4, r3)
            r0.<init>(r2)
            throw r0
        L34f:
            r2 = r11
            r1.e(r0, r3, r7, r13)
            return r2
        L354:
            r2 = r11
            r1.b(r0, r3, r7, r13)
            return r2
        L359:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "FRAME_SIZE_ERROR: "
            java.lang.String r2 = k1.i.i(r3, r2)
            r0.<init>(r2)
            throw r0
        L365:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r.a(boolean, a5.v):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        if (r8 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
    
        r3.i(e6.b.f12674b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(a5.v r17, int r18, int r19, int r20) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            r5 = r20
            if (r5 == 0) goto L127
            r3 = r2 & 1
            if (r3 == 0) goto L10
            r8 = 1
            goto L11
        L10:
            r8 = 0
        L11:
            r3 = r2 & 32
            if (r3 != 0) goto L11f
            r3 = r2 & 8
            if (r3 == 0) goto L27
            q6.i r3 = r1.f14212q
            byte r3 = r3.readByte()
            byte[] r7 = e6.b.f12673a
            r3 = r3 & 255(0xff, float:3.57E-43)
            r9 = r3
        L24:
            r3 = r18
            goto L29
        L27:
            r9 = 0
            goto L24
        L29:
            int r7 = k6.p.a(r3, r2, r9)
            q6.i r2 = r1.f14212q
            java.lang.String r3 = "source"
            kotlin.jvm.internal.m.e(r2, r3)
            java.lang.Object r3 = r0.f8997r
            k6.n r3 = (k6.n) r3
            r10 = 0
            if (r5 == 0) goto L75
            r12 = r5 & 1
            if (r12 != 0) goto L75
            q6.g r6 = new q6.g
            r6.<init>()
            long r12 = (long) r7
            r2.Q(r12)
            r2.F(r12, r6)
            g6.c r0 = r3.f14196y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r3.f14190s
            r2.append(r4)
            r4 = 91
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = "] onData"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = r3
            r3 = r2
            k6.k r2 = new k6.k
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c(r2, r10)
            goto L118
        L75:
            k6.v r3 = r3.b(r5)
            if (r3 != 0) goto L90
            java.lang.Object r3 = r0.f8997r
            k6.n r3 = (k6.n) r3
            r4 = 2
            r3.v(r5, r4)
            java.lang.Object r0 = r0.f8997r
            k6.n r0 = (k6.n) r0
            long r3 = (long) r7
            r0.f(r3)
            r2.skip(r3)
            goto L118
        L90:
            byte[] r0 = e6.b.f12673a
            k6.t r0 = r3.i
            long r12 = (long) r7
            r0.getClass()
            r14 = r12
        L99:
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 <= 0) goto L107
            k6.v r5 = r0.f14224v
            monitor-enter(r5)
            boolean r7 = r0.f14220r     // Catch: java.lang.Throwable -> L104
            q6.g r4 = r0.f14222t     // Catch: java.lang.Throwable -> L104
            r18 = r10
            long r10 = r4.f16063r     // Catch: java.lang.Throwable -> L104
            long r10 = r10 + r14
            r17 = r7
            long r6 = r0.f14219q     // Catch: java.lang.Throwable -> L104
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto Lb3
            r6 = 1
            goto Lb4
        Lb3:
            r6 = 0
        Lb4:
            monitor-exit(r5)
            if (r6 == 0) goto Lc1
            r2.skip(r14)
            k6.v r0 = r0.f14224v
            r2 = 4
            r0.e(r2)
            goto L110
        Lc1:
            if (r17 == 0) goto Lc7
            r2.skip(r14)
            goto L110
        Lc7:
            q6.g r5 = r0.f14221s
            long r5 = r2.F(r14, r5)
            r10 = -1
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 == 0) goto Lfe
            long r14 = r14 - r5
            k6.v r5 = r0.f14224v
            monitor-enter(r5)
            boolean r6 = r0.f14223u     // Catch: java.lang.Throwable -> Le1
            if (r6 == 0) goto Le3
            q6.g r6 = r0.f14221s     // Catch: java.lang.Throwable -> Le1
            r6.a()     // Catch: java.lang.Throwable -> Le1
            goto Lf8
        Le1:
            r0 = move-exception
            goto Lfc
        Le3:
            q6.g r6 = r0.f14222t     // Catch: java.lang.Throwable -> Le1
            long r10 = r6.f16063r     // Catch: java.lang.Throwable -> Le1
            int r7 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r7 != 0) goto Led
            r7 = 1
            goto Lee
        Led:
            r7 = 0
        Lee:
            q6.g r10 = r0.f14221s     // Catch: java.lang.Throwable -> Le1
            r6.d0(r10)     // Catch: java.lang.Throwable -> Le1
            if (r7 == 0) goto Lf8
            r5.notifyAll()     // Catch: java.lang.Throwable -> Le1
        Lf8:
            monitor-exit(r5)
            r10 = r18
            goto L99
        Lfc:
            monitor-exit(r5)
            throw r0
        Lfe:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L104:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L107:
            k6.v r0 = r0.f14224v
            byte[] r2 = e6.b.f12673a
            k6.n r0 = r0.f14227b
            r0.f(r12)
        L110:
            if (r8 == 0) goto L118
            d6.l r0 = e6.b.f12674b
            r4 = 1
            r3.i(r0, r4)
        L118:
            q6.i r0 = r1.f14212q
            long r2 = (long) r9
            r0.skip(r2)
            return
        L11f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r0.<init>(r2)
            throw r0
        L127:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.r.b(a5.v, int, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List c(int i, int i7, int i8, int i9) throws IOException {
        q qVar = this.f14213r;
        qVar.f14209u = i;
        qVar.f14206r = i;
        qVar.f14210v = i7;
        qVar.f14207s = i8;
        qVar.f14208t = i9;
        c cVar = this.f14214s;
        q6.A a7 = cVar.f14142c;
        ArrayList arrayList = cVar.f14141b;
        while (!a7.a()) {
            byte b7 = a7.readByte();
            byte[] bArr = e6.b.f12673a;
            int i10 = b7 & 255;
            if (i10 == 128) {
                throw new IOException("index == 0");
            }
            if ((b7 & 128) == 128) {
                int iE = cVar.e(i10, 127);
                int i11 = iE - 1;
                if (i11 >= 0) {
                    b[] bVarArr = e.f14153a;
                    if (i11 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i11]);
                    }
                }
                int length = cVar.f14144e + 1 + (i11 - e.f14153a.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f14143d;
                    if (length < bVarArr2.length) {
                        b bVar = bVarArr2[length];
                        kotlin.jvm.internal.m.b(bVar);
                        arrayList.add(bVar);
                    }
                }
                throw new IOException(k1.i.i(iE, "Header index too large "));
            }
            if (i10 == 64) {
                b[] bVarArr3 = e.f14153a;
                C1541j c1541jD = cVar.d();
                e.a(c1541jD);
                cVar.c(new b(c1541jD, cVar.d()));
            } else if ((b7 & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i10, 63) - 1), cVar.d()));
            } else if ((b7 & 32) == 32) {
                int iE2 = cVar.e(i10, 31);
                cVar.f14140a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + cVar.f14140a);
                }
                int i12 = cVar.f14145g;
                if (iE2 < i12) {
                    if (iE2 == 0) {
                        b[] bVarArr4 = cVar.f14143d;
                        n5.k.J0(0, bVarArr4.length, null, bVarArr4);
                        cVar.f14144e = cVar.f14143d.length - 1;
                        cVar.f = 0;
                        cVar.f14145g = 0;
                    } else {
                        cVar.a(i12 - iE2);
                    }
                }
            } else if (i10 == 16 || i10 == 0) {
                b[] bVarArr5 = e.f14153a;
                C1541j c1541jD2 = cVar.d();
                e.a(c1541jD2);
                arrayList.add(new b(c1541jD2, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i10, 15) - 1), cVar.d()));
            }
        }
        List listB0 = n5.l.B0(arrayList);
        arrayList.clear();
        return listB0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f14212q.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(a5.v vVar, int i, int i7, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i9 = 0;
        int i10 = 1;
        boolean z5 = (i7 & 1) != 0;
        if ((i7 & 8) != 0) {
            byte b7 = this.f14212q.readByte();
            byte[] bArr = e6.b.f12673a;
            i9 = b7 & 255;
        }
        if ((i7 & 32) != 0) {
            InterfaceC1540i interfaceC1540i = this.f14212q;
            interfaceC1540i.readInt();
            interfaceC1540i.readByte();
            byte[] bArr2 = e6.b.f12673a;
            i -= 5;
        }
        List listC = c(p.a(i, i7, i9), i9, i7, i8);
        n nVar = (n) vVar.f8997r;
        if (i8 != 0 && (i8 & 1) == 0) {
            nVar.f14196y.c(new l(nVar.f14190s + '[' + i8 + "] onHeaders", nVar, i8, listC, z5), 0L);
            return;
        }
        synchronized (nVar) {
            v vVarB = nVar.b(i8);
            if (vVarB != null) {
                vVarB.i(e6.b.r(listC), z5);
                return;
            }
            if (nVar.f14193v) {
                return;
            }
            if (i8 <= nVar.f14191t) {
                return;
            }
            if (i8 % 2 == nVar.f14192u % 2) {
                return;
            }
            v vVar2 = new v(i8, nVar, false, z5, e6.b.r(listC));
            nVar.f14191t = i8;
            nVar.f14189r.put(Integer.valueOf(i8), vVar2);
            nVar.f14194w.e().c(new i(nVar.f14190s + '[' + i8 + "] onStream", nVar, vVar2, i10), 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(a5.v vVar, int i, int i7, int i8) throws IOException {
        int i9;
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i7 & 8) != 0) {
            byte b7 = this.f14212q.readByte();
            byte[] bArr = e6.b.f12673a;
            i9 = b7 & 255;
        } else {
            i9 = 0;
        }
        int i10 = this.f14212q.readInt() & Integer.MAX_VALUE;
        List listC = c(p.a(i - 4, i7, i9), i9, i7, i8);
        n nVar = (n) vVar.f8997r;
        synchronized (nVar) {
            if (nVar.f14187O.contains(Integer.valueOf(i10))) {
                nVar.v(i10, 2);
                return;
            }
            nVar.f14187O.add(Integer.valueOf(i10));
            nVar.f14196y.c(new l(nVar.f14190s + '[' + i10 + "] onRequest", nVar, i10, listC), 0L);
        }
    }
}
