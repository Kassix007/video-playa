package q6;

import C0.S;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: q6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1538g implements InterfaceC1540i, InterfaceC1539h, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B f16062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f16063r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final long B(byte b7, long j, long j7) {
        B b8;
        long j8 = j;
        long j9 = j7;
        long j10 = 0;
        if (0 > j8 || j8 > j9) {
            throw new IllegalArgumentException(("size=" + this.f16063r + " fromIndex=" + j8 + " toIndex=" + j9).toString());
        }
        long j11 = this.f16063r;
        if (j9 > j11) {
            j9 = j11;
        }
        long j12 = -1;
        if (j8 == j9 || (b8 = this.f16062q) == null) {
            return -1L;
        }
        if (j11 - j8 < j8) {
            while (j11 > j8) {
                b8 = b8.f16033g;
                kotlin.jvm.internal.m.b(b8);
                j11 -= (long) (b8.f16030c - b8.f16029b);
            }
            while (j11 < j9) {
                byte[] bArr = b8.f16028a;
                long j13 = j12;
                int iMin = (int) Math.min(b8.f16030c, (((long) b8.f16029b) + j9) - j11);
                for (int i = (int) ((((long) b8.f16029b) + j8) - j11); i < iMin; i++) {
                    if (bArr[i] == b7) {
                        return ((long) (i - b8.f16029b)) + j11;
                    }
                }
                j11 += (long) (b8.f16030c - b8.f16029b);
                b8 = b8.f;
                kotlin.jvm.internal.m.b(b8);
                j12 = j13;
                j8 = j11;
            }
            return j12;
        }
        while (true) {
            long j14 = ((long) (b8.f16030c - b8.f16029b)) + j10;
            if (j14 > j8) {
                break;
            }
            b8 = b8.f;
            kotlin.jvm.internal.m.b(b8);
            j10 = j14;
        }
        while (j10 < j9) {
            byte[] bArr2 = b8.f16028a;
            int iMin2 = (int) Math.min(b8.f16030c, (((long) b8.f16029b) + j9) - j10);
            for (int i7 = (int) ((((long) b8.f16029b) + j8) - j10); i7 < iMin2; i7++) {
                if (bArr2[i7] == b7) {
                    return ((long) (i7 - b8.f16029b)) + j10;
                }
            }
            j10 += (long) (b8.f16030c - b8.f16029b);
            b8 = b8.f;
            kotlin.jvm.internal.m.b(b8);
            j8 = j10;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final String E(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(S.k("limit < 0: ", j).toString());
        }
        long j7 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jB = B((byte) 10, 0L, j7);
        if (jB != -1) {
            return r6.a.a(jB, this);
        }
        if (j7 < this.f16063r && f(j7 - 1) == 13 && f(j7) == 10) {
            return r6.a.a(j7, this);
        }
        C1538g c1538g = new C1538g();
        c(c1538g, 0L, Math.min(32, this.f16063r));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16063r, j) + " content=" + c1538g.k(c1538g.f16063r).d() + (char) 8230);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final long F(long j, C1538g sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(S.k("byteCount < 0: ", j).toString());
        }
        long j7 = this.f16063r;
        if (j7 == 0) {
            return -1L;
        }
        if (j > j7) {
            j = j7;
        }
        sink.Z(j, this);
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final short G() throws EOFException {
        short s6 = readShort();
        return (short) (((s6 & 255) << 8) | ((65280 & s6) >>> 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String K(long j, Charset charset) throws EOFException {
        kotlin.jvm.internal.m.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(S.k("byteCount: ", j).toString());
        }
        if (this.f16063r < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        B b7 = this.f16062q;
        kotlin.jvm.internal.m.b(b7);
        int i = b7.f16029b;
        if (((long) i) + j > b7.f16030c) {
            return new String(z(j), charset);
        }
        int i7 = (int) j;
        String str = new String(b7.f16028a, i, i7, charset);
        int i8 = b7.f16029b + i7;
        b7.f16029b = i8;
        this.f16063r -= j;
        if (i8 == b7.f16030c) {
            this.f16062q = b7.a();
            C.a(b7);
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String M() {
        return K(this.f16063r, J5.a.f2809a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final void Q(long j) throws EOFException {
        if (this.f16063r < j) {
            throw new EOFException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final /* bridge */ /* synthetic */ InterfaceC1539h R(String str) {
        i0(str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final long T(InterfaceC1539h interfaceC1539h) {
        long j = this.f16063r;
        if (j > 0) {
            interfaceC1539h.Z(j, this);
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1541j W(int i) {
        if (i == 0) {
            return C1541j.f16064t;
        }
        Q2.g.o(this.f16063r, 0L, i);
        B b7 = this.f16062q;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            kotlin.jvm.internal.m.b(b7);
            int i10 = b7.f16030c;
            int i11 = b7.f16029b;
            if (i10 == i11) {
                throw new AssertionError("s.limit == s.pos");
            }
            i8 += i10 - i11;
            i9++;
            b7 = b7.f;
        }
        byte[][] bArr = new byte[i9][];
        int[] iArr = new int[i9 * 2];
        B b8 = this.f16062q;
        int i12 = 0;
        while (i7 < i) {
            kotlin.jvm.internal.m.b(b8);
            bArr[i12] = b8.f16028a;
            i7 += b8.f16030c - b8.f16029b;
            iArr[i12] = Math.min(i7, i);
            iArr[i12 + i9] = b8.f16029b;
            b8.f16031d = true;
            i12++;
            b8 = b8.f;
        }
        return new D(bArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // q6.InterfaceC1540i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long X() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f16063r
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            q6.B r7 = r15.f16062q
            kotlin.jvm.internal.m.b(r7)
            byte[] r8 = r7.f16028a
            int r9 = r7.f16029b
            int r10 = r7.f16030c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            q6.g r0 = new q6.g
            r0.<init>()
            r0.f0(r4)
            r0.e0(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.M()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = r6.b.f16368a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8e:
            if (r9 != r10) goto L9a
            q6.B r8 = r7.a()
            r15.f16062q = r8
            q6.C.a(r7)
            goto L9c
        L9a:
            r7.f16029b = r9
        L9c:
            if (r6 != 0) goto La2
            q6.B r7 = r15.f16062q
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f16063r
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f16063r = r2
            return r4
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.C1538g.X():long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final InputStream Y() {
        return new C1537f(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.E
    public final void Z(long j, C1538g source) {
        B b7;
        kotlin.jvm.internal.m.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        Q2.g.o(source.f16063r, 0L, j);
        while (j > 0) {
            B b8 = source.f16062q;
            kotlin.jvm.internal.m.b(b8);
            int i = b8.f16030c;
            B b9 = source.f16062q;
            kotlin.jvm.internal.m.b(b9);
            long j7 = i - b9.f16029b;
            int i7 = 0;
            if (j < j7) {
                B b10 = this.f16062q;
                B b11 = b10 != null ? b10.f16033g : null;
                if (b11 != null && b11.f16032e) {
                    if ((((long) b11.f16030c) + j) - ((long) (b11.f16031d ? 0 : b11.f16029b)) <= 8192) {
                        B b12 = source.f16062q;
                        kotlin.jvm.internal.m.b(b12);
                        b12.d(b11, (int) j);
                        source.f16063r -= j;
                        this.f16063r += j;
                        return;
                    }
                }
                B b13 = source.f16062q;
                kotlin.jvm.internal.m.b(b13);
                int i8 = (int) j;
                if (i8 <= 0 || i8 > b13.f16030c - b13.f16029b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i8 >= 1024) {
                    b7 = b13.c();
                } else {
                    b7 = C.b();
                    byte[] bArr = b13.f16028a;
                    byte[] bArr2 = b7.f16028a;
                    int i9 = b13.f16029b;
                    n5.k.B0(0, i9, i9 + i8, bArr, bArr2);
                }
                b7.f16030c = b7.f16029b + i8;
                b13.f16029b += i8;
                B b14 = b13.f16033g;
                kotlin.jvm.internal.m.b(b14);
                b14.b(b7);
                source.f16062q = b7;
            }
            B b15 = source.f16062q;
            kotlin.jvm.internal.m.b(b15);
            long j8 = b15.f16030c - b15.f16029b;
            source.f16062q = b15.a();
            B b16 = this.f16062q;
            if (b16 == null) {
                this.f16062q = b15;
                b15.f16033g = b15;
                b15.f = b15;
            } else {
                B b17 = b16.f16033g;
                kotlin.jvm.internal.m.b(b17);
                b17.b(b15);
                B b18 = b15.f16033g;
                if (b18 == b15) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.m.b(b18);
                if (b18.f16032e) {
                    int i10 = b15.f16030c - b15.f16029b;
                    B b19 = b15.f16033g;
                    kotlin.jvm.internal.m.b(b19);
                    int i11 = 8192 - b19.f16030c;
                    B b20 = b15.f16033g;
                    kotlin.jvm.internal.m.b(b20);
                    if (!b20.f16031d) {
                        B b21 = b15.f16033g;
                        kotlin.jvm.internal.m.b(b21);
                        i7 = b21.f16029b;
                    }
                    if (i10 <= i11 + i7) {
                        B b22 = b15.f16033g;
                        kotlin.jvm.internal.m.b(b22);
                        b15.d(b22, i10);
                        b15.a();
                        C.a(b15);
                    }
                }
            }
            source.f16063r -= j8;
            this.f16063r += j8;
            j -= j8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() throws EOFException {
        skip(this.f16063r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B a0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        B b7 = this.f16062q;
        if (b7 == null) {
            B b8 = C.b();
            this.f16062q = b8;
            b8.f16033g = b8;
            b8.f = b8;
            return b8;
        }
        B b9 = b7.f16033g;
        kotlin.jvm.internal.m.b(b9);
        if (b9.f16030c + i <= 8192 && b9.f16032e) {
            return b9;
        }
        B b10 = C.b();
        b9.b(b10);
        return b10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b() {
        long j = this.f16063r;
        if (j == 0) {
            return 0L;
        }
        B b7 = this.f16062q;
        kotlin.jvm.internal.m.b(b7);
        B b8 = b7.f16033g;
        kotlin.jvm.internal.m.b(b8);
        int i = b8.f16030c;
        return (i >= 8192 || !b8.f16032e) ? j : j - ((long) (i - b8.f16029b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0(int i, byte[] source) {
        kotlin.jvm.internal.m.e(source, "source");
        int i7 = 0;
        long j = i;
        Q2.g.o(source.length, 0, j);
        while (i7 < i) {
            B bA0 = a0(1);
            int iMin = Math.min(i - i7, 8192 - bA0.f16030c);
            int i8 = i7 + iMin;
            n5.k.B0(bA0.f16030c, i7, i8, source, bA0.f16028a);
            bA0.f16030c += iMin;
            i7 = i8;
        }
        this.f16063r += j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(C1538g out, long j, long j7) {
        kotlin.jvm.internal.m.e(out, "out");
        long j8 = j;
        Q2.g.o(this.f16063r, j8, j7);
        if (j7 == 0) {
            return;
        }
        out.f16063r += j7;
        B b7 = this.f16062q;
        while (true) {
            kotlin.jvm.internal.m.b(b7);
            long j9 = b7.f16030c - b7.f16029b;
            if (j8 < j9) {
                break;
            }
            j8 -= j9;
            b7 = b7.f;
        }
        B b8 = b7;
        long j10 = j7;
        while (j10 > 0) {
            kotlin.jvm.internal.m.b(b8);
            B bC = b8.c();
            int i = bC.f16029b + ((int) j8);
            bC.f16029b = i;
            bC.f16030c = Math.min(i + ((int) j10), bC.f16030c);
            B b9 = out.f16062q;
            if (b9 == null) {
                bC.f16033g = bC;
                bC.f = bC;
                out.f16062q = bC;
            } else {
                B b10 = b9.f16033g;
                kotlin.jvm.internal.m.b(b10);
                b10.b(bC);
            }
            j10 -= (long) (bC.f16030c - bC.f16029b);
            b8 = b8.f;
            j8 = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c0(C1541j byteString) {
        kotlin.jvm.internal.m.e(byteString, "byteString");
        byteString.q(this, byteString.c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        C1538g c1538g = new C1538g();
        if (this.f16063r == 0) {
            return c1538g;
        }
        B b7 = this.f16062q;
        kotlin.jvm.internal.m.b(b7);
        B bC = b7.c();
        c1538g.f16062q = bC;
        bC.f16033g = bC;
        bC.f = bC;
        for (B b8 = b7.f; b8 != b7; b8 = b8.f) {
            B b9 = bC.f16033g;
            kotlin.jvm.internal.m.b(b9);
            kotlin.jvm.internal.m.b(b8);
            b9.b(b8.c());
        }
        c1538g.f16063r = this.f16063r;
        return c1538g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.G
    public final I d() {
        return I.f16040d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(G source) {
        kotlin.jvm.internal.m.e(source, "source");
        while (source.F(8192L, this) != -1) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        return this.f16063r == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0(int i) {
        B bA0 = a0(1);
        byte[] bArr = bA0.f16028a;
        int i7 = bA0.f16030c;
        bA0.f16030c = i7 + 1;
        bArr[i7] = (byte) i;
        this.f16063r++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1538g)) {
            return false;
        }
        long j = this.f16063r;
        C1538g c1538g = (C1538g) obj;
        if (j != c1538g.f16063r) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        B b7 = this.f16062q;
        kotlin.jvm.internal.m.b(b7);
        B b8 = c1538g.f16062q;
        kotlin.jvm.internal.m.b(b8);
        int i = b7.f16029b;
        int i7 = b8.f16029b;
        long j7 = 0;
        while (j7 < this.f16063r) {
            long jMin = Math.min(b7.f16030c - i, b8.f16030c - i7);
            long j8 = 0;
            while (j8 < jMin) {
                int i8 = i + 1;
                int i9 = i7 + 1;
                if (b7.f16028a[i] != b8.f16028a[i7]) {
                    return false;
                }
                j8++;
                i = i8;
                i7 = i9;
            }
            if (i == b7.f16030c) {
                b7 = b7.f;
                kotlin.jvm.internal.m.b(b7);
                i = b7.f16029b;
            }
            if (i7 == b8.f16030c) {
                b8 = b8.f;
                kotlin.jvm.internal.m.b(b8);
                i7 = b8.f16029b;
            }
            j7 += jMin;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte f(long j) {
        Q2.g.o(this.f16063r, j, 1L);
        B b7 = this.f16062q;
        if (b7 == null) {
            kotlin.jvm.internal.m.b(null);
            throw null;
        }
        long j7 = this.f16063r;
        if (j7 - j < j) {
            while (j7 > j) {
                b7 = b7.f16033g;
                kotlin.jvm.internal.m.b(b7);
                j7 -= (long) (b7.f16030c - b7.f16029b);
            }
            return b7.f16028a[(int) ((((long) b7.f16029b) + j) - j7)];
        }
        long j8 = 0;
        while (true) {
            int i = b7.f16030c;
            int i7 = b7.f16029b;
            long j9 = ((long) (i - i7)) + j8;
            if (j9 > j) {
                return b7.f16028a[(int) ((((long) i7) + j) - j8)];
            }
            b7 = b7.f;
            kotlin.jvm.internal.m.b(b7);
            j8 = j9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f0(long j) {
        if (j == 0) {
            e0(48);
            return;
        }
        long j7 = (j >>> 1) | j;
        long j8 = j7 | (j7 >>> 2);
        long j9 = j8 | (j8 >>> 4);
        long j10 = j9 | (j9 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        B bA0 = a0(i);
        byte[] bArr = bA0.f16028a;
        int i7 = bA0.f16030c;
        for (int i8 = (i7 + i) - 1; i8 >= i7; i8--) {
            bArr[i8] = r6.a.f16366a[(int) (15 & j)];
            j >>>= 4;
        }
        bA0.f16030c += i;
        this.f16063r += (long) i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0(int i) {
        B bA0 = a0(4);
        byte[] bArr = bA0.f16028a;
        int i7 = bA0.f16030c;
        bArr[i7] = (byte) ((i >>> 24) & 255);
        bArr[i7 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i7 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i7 + 3] = (byte) (i & 255);
        bA0.f16030c = i7 + 4;
        this.f16063r += 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h0(int i) {
        B bA0 = a0(2);
        byte[] bArr = bA0.f16028a;
        int i7 = bA0.f16030c;
        bArr[i7] = (byte) ((i >>> 8) & 255);
        bArr[i7 + 1] = (byte) (i & 255);
        bA0.f16030c = i7 + 2;
        this.f16063r += 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        B b7 = this.f16062q;
        if (b7 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i7 = b7.f16030c;
            for (int i8 = b7.f16029b; i8 < i7; i8++) {
                i = (i * 31) + b7.f16028a[i8];
            }
            b7 = b7.f;
            kotlin.jvm.internal.m.b(b7);
        } while (b7 != this.f16062q);
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final /* bridge */ /* synthetic */ InterfaceC1539h i(C1541j c1541j) {
        c0(c1541j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        j0(string, 0, string.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final /* bridge */ /* synthetic */ InterfaceC1539h j(long j) {
        f0(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j0(String string, int i, int i7) {
        char cCharAt;
        kotlin.jvm.internal.m.e(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(k1.i.i(i, "beginIndex < 0: ").toString());
        }
        if (i7 < i) {
            throw new IllegalArgumentException(S.j(i7, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i7 > string.length()) {
            StringBuilder sbL = k1.i.l("endIndex > string.length: ", " > ", i7);
            sbL.append(string.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        while (i < i7) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                B bA0 = a0(1);
                byte[] bArr = bA0.f16028a;
                int i8 = bA0.f16030c - i;
                int iMin = Math.min(i7, 8192 - i8);
                int i9 = i + 1;
                bArr[i + i8] = (byte) cCharAt2;
                while (true) {
                    i = i9;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i9 = i + 1;
                    bArr[i + i8] = (byte) cCharAt;
                }
                int i10 = bA0.f16030c;
                int i11 = (i8 + i) - i10;
                bA0.f16030c = i10 + i11;
                this.f16063r += (long) i11;
            } else {
                if (cCharAt2 < 2048) {
                    B bA02 = a0(2);
                    byte[] bArr2 = bA02.f16028a;
                    int i12 = bA02.f16030c;
                    bArr2[i12] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i12 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    bA02.f16030c = i12 + 2;
                    this.f16063r += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    B bA03 = a0(3);
                    byte[] bArr3 = bA03.f16028a;
                    int i13 = bA03.f16030c;
                    bArr3[i13] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i13 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i13 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    bA03.f16030c = i13 + 3;
                    this.f16063r += 3;
                } else {
                    int i14 = i + 1;
                    char cCharAt3 = i14 < i7 ? string.charAt(i14) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        e0(63);
                        i = i14;
                    } else {
                        int i15 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        B bA04 = a0(4);
                        byte[] bArr4 = bA04.f16028a;
                        int i16 = bA04.f16030c;
                        bArr4[i16] = (byte) ((i15 >> 18) | 240);
                        bArr4[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                        bArr4[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                        bArr4[i16 + 3] = (byte) ((i15 & 63) | 128);
                        bA04.f16030c = i16 + 4;
                        this.f16063r += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final C1541j k(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(S.k("byteCount: ", j).toString());
        }
        if (this.f16063r < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C1541j(z(j));
        }
        C1541j c1541jW = W((int) j);
        skip(j);
        return c1541jW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k0(int i) {
        if (i < 128) {
            e0(i);
            return;
        }
        if (i < 2048) {
            B bA0 = a0(2);
            byte[] bArr = bA0.f16028a;
            int i7 = bA0.f16030c;
            bArr[i7] = (byte) ((i >> 6) | 192);
            bArr[i7 + 1] = (byte) ((i & 63) | 128);
            bA0.f16030c = i7 + 2;
            this.f16063r += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            e0(63);
            return;
        }
        if (i < 65536) {
            B bA02 = a0(3);
            byte[] bArr2 = bA02.f16028a;
            int i8 = bA02.f16030c;
            bArr2[i8] = (byte) ((i >> 12) | 224);
            bArr2[i8 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i8 + 2] = (byte) ((i & 63) | 128);
            bA02.f16030c = i8 + 3;
            this.f16063r += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(Q2.g.O(i)));
        }
        B bA03 = a0(4);
        byte[] bArr3 = bA03.f16028a;
        int i9 = bA03.f16030c;
        bArr3[i9] = (byte) ((i >> 18) | 240);
        bArr3[i9 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i9 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i9 + 3] = (byte) ((i & 63) | 128);
        bA03.f16030c = i9 + 4;
        this.f16063r += 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long n(long j, C1541j targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        long j7 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(S.k("fromIndex < 0: ", j).toString());
        }
        B b7 = this.f16062q;
        if (b7 == null) {
            return -1L;
        }
        long j8 = this.f16063r;
        if (j8 - j < j) {
            while (j8 > j) {
                b7 = b7.f16033g;
                kotlin.jvm.internal.m.b(b7);
                j8 -= (long) (b7.f16030c - b7.f16029b);
            }
            if (targetBytes.c() == 2) {
                byte bH = targetBytes.h(0);
                byte bH2 = targetBytes.h(1);
                while (j8 < this.f16063r) {
                    byte[] bArr = b7.f16028a;
                    int i = b7.f16030c;
                    for (int i7 = (int) ((((long) b7.f16029b) + j) - j8); i7 < i; i7++) {
                        byte b8 = bArr[i7];
                        if (b8 == bH || b8 == bH2) {
                            return ((long) (i7 - b7.f16029b)) + j8;
                        }
                    }
                    j8 += (long) (b7.f16030c - b7.f16029b);
                    b7 = b7.f;
                    kotlin.jvm.internal.m.b(b7);
                    j = j8;
                }
            } else {
                byte[] bArrG = targetBytes.g();
                while (j8 < this.f16063r) {
                    byte[] bArr2 = b7.f16028a;
                    int i8 = b7.f16030c;
                    for (int i9 = (int) ((((long) b7.f16029b) + j) - j8); i9 < i8; i9++) {
                        byte b9 = bArr2[i9];
                        for (byte b10 : bArrG) {
                            if (b9 == b10) {
                                return ((long) (i9 - b7.f16029b)) + j8;
                            }
                        }
                    }
                    j8 += (long) (b7.f16030c - b7.f16029b);
                    b7 = b7.f;
                    kotlin.jvm.internal.m.b(b7);
                    j = j8;
                }
            }
            return -1L;
        }
        while (true) {
            long j9 = ((long) (b7.f16030c - b7.f16029b)) + j7;
            if (j9 > j) {
                break;
            }
            b7 = b7.f;
            kotlin.jvm.internal.m.b(b7);
            j7 = j9;
        }
        if (targetBytes.c() == 2) {
            byte bH3 = targetBytes.h(0);
            byte bH4 = targetBytes.h(1);
            while (j7 < this.f16063r) {
                byte[] bArr3 = b7.f16028a;
                int i10 = b7.f16030c;
                for (int i11 = (int) ((((long) b7.f16029b) + j) - j7); i11 < i10; i11++) {
                    byte b11 = bArr3[i11];
                    if (b11 == bH3 || b11 == bH4) {
                        return ((long) (i11 - b7.f16029b)) + j7;
                    }
                }
                j7 += (long) (b7.f16030c - b7.f16029b);
                b7 = b7.f;
                kotlin.jvm.internal.m.b(b7);
                j = j7;
            }
        } else {
            byte[] bArrG2 = targetBytes.g();
            while (j7 < this.f16063r) {
                byte[] bArr4 = b7.f16028a;
                int i12 = b7.f16030c;
                for (int i13 = (int) ((((long) b7.f16029b) + j) - j7); i13 < i12; i13++) {
                    byte b12 = bArr4[i13];
                    for (byte b13 : bArrG2) {
                        if (b12 == b13) {
                            return ((long) (i13 - b7.f16029b)) + j7;
                        }
                    }
                }
                j7 += (long) (b7.f16030c - b7.f16029b);
                b7 = b7.f;
                kotlin.jvm.internal.m.b(b7);
                j = j7;
            }
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final boolean o(long j) {
        return this.f16063r >= j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        B b7 = this.f16062q;
        if (b7 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), b7.f16030c - b7.f16029b);
        sink.put(b7.f16028a, b7.f16029b, iMin);
        int i = b7.f16029b + iMin;
        b7.f16029b = i;
        this.f16063r -= (long) iMin;
        if (i == b7.f16030c) {
            this.f16062q = b7.a();
            C.a(b7);
        }
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final byte readByte() {
        if (this.f16063r == 0) {
            throw new EOFException();
        }
        B b7 = this.f16062q;
        kotlin.jvm.internal.m.b(b7);
        int i = b7.f16029b;
        int i7 = b7.f16030c;
        int i8 = i + 1;
        byte b8 = b7.f16028a[i];
        this.f16063r--;
        if (i8 != i7) {
            b7.f16029b = i8;
            return b8;
        }
        this.f16062q = b7.a();
        C.a(b7);
        return b8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final int readInt() throws EOFException {
        if (this.f16063r < 4) {
            throw new EOFException();
        }
        B b7 = this.f16062q;
        kotlin.jvm.internal.m.b(b7);
        int i = b7.f16029b;
        int i7 = b7.f16030c;
        if (i7 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = b7.f16028a;
        int i8 = i + 3;
        int i9 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i10 = i + 4;
        int i11 = (bArr[i8] & 255) | i9;
        this.f16063r -= 4;
        if (i10 != i7) {
            b7.f16029b = i10;
            return i11;
        }
        this.f16062q = b7.a();
        C.a(b7);
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final short readShort() throws EOFException {
        if (this.f16063r < 2) {
            throw new EOFException();
        }
        B b7 = this.f16062q;
        kotlin.jvm.internal.m.b(b7);
        int i = b7.f16029b;
        int i7 = b7.f16030c;
        if (i7 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = b7.f16028a;
        int i8 = i + 1;
        int i9 = (bArr[i] & 255) << 8;
        int i10 = i + 2;
        int i11 = (bArr[i8] & 255) | i9;
        this.f16063r -= 2;
        if (i10 == i7) {
            this.f16062q = b7.a();
            C.a(b7);
        } else {
            b7.f16029b = i10;
        }
        return (short) i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            B b7 = this.f16062q;
            if (b7 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, b7.f16030c - b7.f16029b);
            long j7 = iMin;
            this.f16063r -= j7;
            j -= j7;
            int i = b7.f16029b + iMin;
            b7.f16029b = i;
            if (i == b7.f16030c) {
                this.f16062q = b7.a();
                C.a(b7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final boolean t(long j, C1541j bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        int iC = bytes.c();
        if (j >= 0 && iC >= 0 && this.f16063r - j >= iC && bytes.c() >= iC) {
            for (int i = 0; i < iC; i++) {
                if (f(((long) i) + j) == bytes.h(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j = this.f16063r;
        if (j <= 2147483647L) {
            return W((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f16063r).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1540i
    public final String u() {
        return E(Long.MAX_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long v(C1541j targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        return n(0L, targetBytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final /* bridge */ /* synthetic */ InterfaceC1539h write(byte[] bArr) {
        m21write(bArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final /* bridge */ /* synthetic */ InterfaceC1539h writeByte(int i) {
        e0(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final /* bridge */ /* synthetic */ InterfaceC1539h writeInt(int i) {
        g0(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.InterfaceC1539h
    public final /* bridge */ /* synthetic */ InterfaceC1539h writeShort(int i) {
        h0(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] z(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(S.k("byteCount: ", j).toString());
        }
        if (this.f16063r < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i7 = 0;
        while (i7 < i) {
            int i8 = read(bArr, i7, i - i7);
            if (i8 == -1) {
                throw new EOFException();
            }
            i7 += i8;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            B bA0 = a0(1);
            int iMin = Math.min(i, 8192 - bA0.f16030c);
            source.get(bA0.f16028a, bA0.f16030c, iMin);
            i -= iMin;
            bA0.f16030c += iMin;
        }
        this.f16063r += (long) iRemaining;
        return iRemaining;
    }

    /* JADX DEBUG: Possible override for method q6.h.write([B)Lq6/h; */
    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m21write(byte[] source) {
        kotlin.jvm.internal.m.e(source, "source");
        b0(source.length, source);
    }

    public final int read(byte[] bArr, int i, int i7) {
        Q2.g.o(bArr.length, i, i7);
        B b7 = this.f16062q;
        if (b7 == null) {
            return -1;
        }
        int iMin = Math.min(i7, b7.f16030c - b7.f16029b);
        byte[] bArr2 = b7.f16028a;
        int i8 = b7.f16029b;
        n5.k.B0(i, i8, i8 + iMin, bArr2, bArr);
        int i9 = b7.f16029b + iMin;
        b7.f16029b = i9;
        this.f16063r -= (long) iMin;
        if (i9 == b7.f16030c) {
            this.f16062q = b7.a();
            C.a(b7);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, q6.E
    public final void close() {
    }

    @Override // q6.InterfaceC1539h, q6.E, java.io.Flushable
    public final void flush() {
    }

    @Override // q6.InterfaceC1540i
    public final C1538g w() {
        return this;
    }
}
