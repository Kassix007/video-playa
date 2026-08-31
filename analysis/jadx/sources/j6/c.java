package j6;

import d6.n;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f13899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f13902w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, n url) {
        super(fVar);
        m.e(url, "url");
        this.f13902w = fVar;
        this.f13899t = url;
        this.f13900u = -1L;
        this.f13901v = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r11.f13901v == false) goto L30;
     */
    @Override // j6.a, q6.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F(long r12, q6.C1538g r14) throws java.io.IOException {
        /*
            r11 = this;
            j6.f r0 = r11.f13902w
            q6.i r1 = r0.f13908c
            java.lang.String r2 = "sink"
            kotlin.jvm.internal.m.e(r14, r2)
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 < 0) goto Ld2
            boolean r4 = r11.f13894r
            if (r4 != 0) goto Lca
            boolean r4 = r11.f13901v
            r5 = -1
            if (r4 != 0) goto L1a
            goto L7f
        L1a:
            long r7 = r11.f13900u
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L24
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L80
        L24:
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L2d
            r1.u()
        L2d:
            long r7 = r1.X()     // Catch: java.lang.NumberFormatException -> L55
            r11.f13900u = r7     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r1 = r1.u()     // Catch: java.lang.NumberFormatException -> L55
            java.lang.CharSequence r1 = J5.m.n1(r1)     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L55
            long r7 = r11.f13900u     // Catch: java.lang.NumberFormatException -> L55
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto La4
            int r7 = r1.length()     // Catch: java.lang.NumberFormatException -> L55
            r8 = 0
            if (r7 <= 0) goto L57
            java.lang.String r7 = ";"
            boolean r7 = J5.t.G0(r1, r7, r8)     // Catch: java.lang.NumberFormatException -> L55
            if (r7 == 0) goto La4
            goto L57
        L55:
            r12 = move-exception
            goto Lc0
        L57:
            long r9 = r11.f13900u
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 != 0) goto L7b
            r11.f13901v = r8
            O3.T r1 = r0.f
            d6.l r1 = r1.h()
            r0.f13911g = r1
            d6.q r1 = r0.f13906a
            kotlin.jvm.internal.m.b(r1)
            d6.b r1 = r1.f12404z
            d6.l r2 = r0.f13911g
            kotlin.jvm.internal.m.b(r2)
            d6.n r3 = r11.f13899t
            i6.e.b(r1, r3, r2)
            r11.a()
        L7b:
            boolean r1 = r11.f13901v
            if (r1 != 0) goto L80
        L7f:
            return r5
        L80:
            long r1 = r11.f13900u
            long r12 = java.lang.Math.min(r12, r1)
            long r12 = super.F(r12, r14)
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L94
            long r0 = r11.f13900u
            long r0 = r0 - r12
            r11.f13900u = r0
            return r12
        L94:
            h6.j r12 = r0.f13907b
            r12.k()
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "unexpected end of stream"
            r12.<init>(r13)
            r11.a()
            throw r12
        La4:
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L55
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L55
            r13.<init>(r4)     // Catch: java.lang.NumberFormatException -> L55
            long r2 = r11.f13900u     // Catch: java.lang.NumberFormatException -> L55
            r13.append(r2)     // Catch: java.lang.NumberFormatException -> L55
            r13.append(r1)     // Catch: java.lang.NumberFormatException -> L55
            r14 = 34
            r13.append(r14)     // Catch: java.lang.NumberFormatException -> L55
            java.lang.String r13 = r13.toString()     // Catch: java.lang.NumberFormatException -> L55
            r12.<init>(r13)     // Catch: java.lang.NumberFormatException -> L55
            throw r12     // Catch: java.lang.NumberFormatException -> L55
        Lc0:
            java.net.ProtocolException r13 = new java.net.ProtocolException
            java.lang.String r12 = r12.getMessage()
            r13.<init>(r12)
            throw r13
        Lca:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "closed"
            r12.<init>(r13)
            throw r12
        Ld2:
            java.lang.String r14 = "byteCount < 0: "
            java.lang.String r12 = C0.S.k(r14, r12)
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c.F(long, q6.g):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zQ;
        if (this.f13894r) {
            return;
        }
        if (this.f13901v) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = e6.b.f12673a;
            m.e(timeUnit, "timeUnit");
            try {
                zQ = e6.b.q(this, 100);
            } catch (IOException unused) {
                zQ = false;
            }
            if (!zQ) {
                this.f13902w.f13907b.k();
                a();
            }
        }
        this.f13894r = true;
    }
}
