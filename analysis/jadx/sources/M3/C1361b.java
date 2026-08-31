package m3;

import C2.e;
import O3.B;
import Z.m;
import androidx.work.impl.WorkDatabaseVersions;
import com.google.android.gms.internal.clearcut.m0;
import java.io.EOFException;
import k1.i;
import q6.A;
import q6.C1538g;
import q6.C1541j;
import q6.w;

/* JADX INFO: renamed from: m3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1361b extends AbstractC1360a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C1541j f15060B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C1541j f15061C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C1541j f15062D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f15063A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final A f15064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1538g f15065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f15067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15068z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1541j c1541j = C1541j.f16064t;
        f15060B = B.h("'\\");
        f15061C = B.h("\"\\");
        f15062D = B.h("{}[]:, \n\t\r\f/\\;#=");
        B.h("\n\r");
        B.h("*/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1361b(A a7) {
        this.f15057r = new int[32];
        this.f15058s = new String[32];
        this.f15059t = new int[32];
        this.f15066x = 0;
        this.f15064v = a7;
        this.f15065w = a7.f16026r;
        W(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final int G() {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 16) {
            long j = this.f15067y;
            int i = (int) j;
            if (j == i) {
                this.f15066x = 0;
                int[] iArr = this.f15059t;
                int i7 = this.f15056q - 1;
                iArr[i7] = iArr[i7] + 1;
                return i;
            }
            throw new e("Expected an int but was " + this.f15067y + " at path " + f());
        }
        if (iF0 == 17) {
            long j7 = this.f15068z;
            C1538g c1538g = this.f15065w;
            c1538g.getClass();
            this.f15063A = c1538g.K(j7, J5.a.f2809a);
        } else if (iF0 == 9 || iF0 == 8) {
            String strK0 = iF0 == 9 ? k0(f15061C) : k0(f15060B);
            this.f15063A = strK0;
            try {
                int i8 = Integer.parseInt(strK0);
                this.f15066x = 0;
                int[] iArr2 = this.f15059t;
                int i9 = this.f15056q - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return i8;
            } catch (NumberFormatException unused) {
            }
        } else if (iF0 != 11) {
            throw new e("Expected an int but was " + i.t(M()) + " at path " + f());
        }
        this.f15066x = 11;
        try {
            double d5 = Double.parseDouble(this.f15063A);
            int i10 = (int) d5;
            if (i10 != d5) {
                throw new e("Expected an int but was " + this.f15063A + " at path " + f());
            }
            this.f15063A = null;
            this.f15066x = 0;
            int[] iArr3 = this.f15059t;
            int i11 = this.f15056q - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return i10;
        } catch (NumberFormatException unused2) {
            throw new e("Expected an int but was " + this.f15063A + " at path " + f());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final String K() {
        String strK;
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 10) {
            strK = l0();
        } else if (iF0 == 9) {
            strK = k0(f15061C);
        } else if (iF0 == 8) {
            strK = k0(f15060B);
        } else if (iF0 == 11) {
            strK = this.f15063A;
            this.f15063A = null;
        } else if (iF0 == 16) {
            strK = Long.toString(this.f15067y);
        } else {
            if (iF0 != 17) {
                throw new e("Expected a string but was " + i.t(M()) + " at path " + f());
            }
            long j = this.f15068z;
            C1538g c1538g = this.f15065w;
            c1538g.getClass();
            strK = c1538g.K(j, J5.a.f2809a);
        }
        this.f15066x = 0;
        int[] iArr = this.f15059t;
        int i = this.f15056q - 1;
        iArr[i] = iArr[i] + 1;
        return strK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final int M() throws m0, EOFException {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        switch (iF0) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                return 7;
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final void a() {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 3) {
            W(1);
            this.f15059t[this.f15056q - 1] = 0;
            this.f15066x = 0;
        } else {
            throw new e("Expected BEGIN_ARRAY but was " + i.t(M()) + " at path " + f());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final int a0(m mVar) {
        int iB;
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 < 12 || iF0 > 15) {
            return -1;
        }
        if (iF0 == 15) {
            return g0(this.f15063A, mVar);
        }
        w wVar = (w) mVar.f8313s;
        A a7 = this.f15064v;
        C1538g c1538g = a7.f16026r;
        if (a7.f16027s) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            iB = r6.a.b(c1538g, wVar, true);
            if (iB != -2) {
                if (iB != -1) {
                    c1538g.skip(wVar.f16091q[iB].c());
                }
            } else if (a7.f16025q.F(8192L, c1538g) == -1) {
                break;
            }
        }
        iB = -1;
        if (iB != -1) {
            this.f15066x = 0;
            this.f15058s[this.f15056q - 1] = ((String[]) mVar.f8312r)[iB];
            return iB;
        }
        String str = this.f15058s[this.f15056q - 1];
        String strI0 = i0();
        int iG0 = g0(strI0, mVar);
        if (iG0 == -1) {
            this.f15066x = 15;
            this.f15063A = strI0;
            this.f15058s[this.f15056q - 1] = str;
        }
        return iG0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final void b() {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 1) {
            W(3);
            this.f15066x = 0;
        } else {
            throw new e("Expected BEGIN_OBJECT but was " + i.t(M()) + " at path " + f());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final void b0() {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 14) {
            long jB = this.f15064v.b(f15062D);
            C1538g c1538g = this.f15065w;
            if (jB == -1) {
                jB = c1538g.f16063r;
            }
            c1538g.skip(jB);
        } else if (iF0 == 13) {
            n0(f15061C);
        } else if (iF0 == 12) {
            n0(f15060B);
        } else if (iF0 != 15) {
            throw new e("Expected a name but was " + i.t(M()) + " at path " + f());
        }
        this.f15066x = 0;
        this.f15058s[this.f15056q - 1] = "null";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final void c() {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 != 4) {
            throw new e("Expected END_ARRAY but was " + i.t(M()) + " at path " + f());
        }
        int i = this.f15056q;
        this.f15056q = i - 1;
        int[] iArr = this.f15059t;
        int i7 = i - 2;
        iArr[i7] = iArr[i7] + 1;
        this.f15066x = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final void c0() {
        int i = 0;
        do {
            int iF0 = this.f15066x;
            if (iF0 == 0) {
                iF0 = f0();
            }
            if (iF0 == 3) {
                W(1);
            } else if (iF0 == 1) {
                W(3);
            } else {
                if (iF0 == 4) {
                    i--;
                    if (i < 0) {
                        throw new e("Expected a value but was " + i.t(M()) + " at path " + f());
                    }
                    this.f15056q--;
                } else if (iF0 == 2) {
                    i--;
                    if (i < 0) {
                        throw new e("Expected a value but was " + i.t(M()) + " at path " + f());
                    }
                    this.f15056q--;
                } else {
                    C1538g c1538g = this.f15065w;
                    if (iF0 == 14 || iF0 == 10) {
                        long jB = this.f15064v.b(f15062D);
                        if (jB == -1) {
                            jB = c1538g.f16063r;
                        }
                        c1538g.skip(jB);
                    } else if (iF0 == 9 || iF0 == 13) {
                        n0(f15061C);
                    } else if (iF0 == 8 || iF0 == 12) {
                        n0(f15060B);
                    } else if (iF0 == 17) {
                        c1538g.skip(this.f15068z);
                    } else if (iF0 == 18) {
                        throw new e("Expected a value but was " + i.t(M()) + " at path " + f());
                    }
                }
                this.f15066x = 0;
            }
            i++;
            this.f15066x = 0;
        } while (i != 0);
        int[] iArr = this.f15059t;
        int i7 = this.f15056q - 1;
        iArr[i7] = iArr[i7] + 1;
        this.f15058s[i7] = "null";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f15066x = 0;
        this.f15057r[0] = 8;
        this.f15056q = 1;
        this.f15065w.a();
        this.f15064v.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final void e() {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 != 2) {
            throw new e("Expected END_OBJECT but was " + i.t(M()) + " at path " + f());
        }
        int i = this.f15056q;
        int i7 = i - 1;
        this.f15056q = i7;
        this.f15058s[i7] = null;
        int[] iArr = this.f15059t;
        int i8 = i - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f15066x = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0() throws m0 {
        d0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (h0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.f15067y = r8;
        r7.skip(r2);
        r9 = 16;
        r22.f15066x = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r22.f15068z = r2;
        r9 = 17;
        r22.f15066x = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f0() throws com.google.android.gms.internal.clearcut.m0, java.io.EOFException {
        /*
            r22 = this;
            r0 = r22
            int[] r1 = r0.f15057r
            int r2 = r0.f15056q
            r3 = 1
            int r2 = r2 - r3
            r4 = r1[r2]
            r8 = 93
            r9 = 0
            r10 = 6
            r11 = 3
            r12 = 59
            r13 = 44
            r14 = 7
            r15 = 4
            r16 = 0
            r5 = 5
            r6 = 2
            q6.g r7 = r0.f15065w
            if (r4 != r3) goto L20
            r1[r2] = r6
            goto L7c
        L20:
            if (r4 != r6) goto L3c
            int r1 = r0.j0(r3)
            r7.readByte()
            if (r1 == r13) goto L7c
            if (r1 == r12) goto L38
            if (r1 != r8) goto L32
            r0.f15066x = r15
            return r15
        L32:
            java.lang.String r1 = "Unterminated array"
            r0.d0(r1)
            throw r16
        L38:
            r0.e0()
            throw r16
        L3c:
            if (r4 == r11) goto L40
            if (r4 != r5) goto L44
        L40:
            r19 = r15
            goto L23d
        L44:
            if (r4 != r15) goto L61
            r1[r2] = r5
            int r1 = r0.j0(r3)
            r7.readByte()
            r2 = 58
            if (r1 == r2) goto L7c
            r2 = 61
            if (r1 == r2) goto L5d
            java.lang.String r1 = "Expected ':'"
            r0.d0(r1)
            throw r16
        L5d:
            r0.e0()
            throw r16
        L61:
            if (r4 != r10) goto L66
            r1[r2] = r14
            goto L7c
        L66:
            if (r4 != r14) goto L78
            int r1 = r0.j0(r9)
            r2 = -1
            if (r1 != r2) goto L74
            r1 = 18
            r0.f15066x = r1
            return r1
        L74:
            r0.e0()
            throw r16
        L78:
            r1 = 8
            if (r4 == r1) goto L235
        L7c:
            int r1 = r0.j0(r3)
            r2 = 34
            if (r1 == r2) goto L22d
            r2 = 39
            if (r1 == r2) goto L229
            if (r1 == r13) goto L21a
            if (r1 == r12) goto L21a
            r2 = 91
            if (r1 == r2) goto L213
            if (r1 == r8) goto L20a
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L204
            r1 = 0
            byte r4 = r7.f(r1)
            r8 = 116(0x74, float:1.63E-43)
            q6.A r12 = r0.f15064v
            if (r4 == r8) goto Lc9
            r8 = 84
            if (r4 != r8) goto La7
            goto Lc9
        La7:
            r8 = 102(0x66, float:1.43E-43)
            if (r4 == r8) goto Lc3
            r8 = 70
            if (r4 != r8) goto Lb0
            goto Lc3
        Lb0:
            r8 = 110(0x6e, float:1.54E-43)
            if (r4 == r8) goto Lbd
            r8 = 78
            if (r4 != r8) goto Lb9
            goto Lbd
        Lb9:
            r17 = r1
            r13 = r9
            goto L113
        Lbd:
            java.lang.String r4 = "null"
            java.lang.String r8 = "NULL"
            r13 = r14
            goto Lce
        Lc3:
            java.lang.String r4 = "false"
            java.lang.String r8 = "FALSE"
            r13 = r10
            goto Lce
        Lc9:
            java.lang.String r4 = "true"
            java.lang.String r8 = "TRUE"
            r13 = r5
        Lce:
            int r9 = r4.length()
            r17 = r1
            r1 = r3
        Ld5:
            if (r1 >= r9) goto Lf8
            int r2 = r1 + 1
            long r14 = (long) r2
            boolean r14 = r12.o(r14)
            if (r14 != 0) goto Le2
        Le0:
            r13 = 0
            goto L113
        Le2:
            long r14 = (long) r1
            byte r14 = r7.f(r14)
            char r15 = r4.charAt(r1)
            if (r14 == r15) goto Lf4
            char r1 = r8.charAt(r1)
            if (r14 == r1) goto Lf4
            goto Le0
        Lf4:
            r1 = r2
            r14 = 7
            r15 = 4
            goto Ld5
        Lf8:
            int r1 = r9 + 1
            long r1 = (long) r1
            boolean r1 = r12.o(r1)
            if (r1 == 0) goto L10d
            long r1 = (long) r9
            byte r1 = r7.f(r1)
            boolean r1 = r0.h0(r1)
            if (r1 == 0) goto L10d
            goto Le0
        L10d:
            long r1 = (long) r9
            r7.skip(r1)
            r0.f15066x = r13
        L113:
            if (r13 == 0) goto L116
            return r13
        L116:
            r4 = r3
            r8 = r17
            r1 = 0
            r2 = 0
            r13 = 0
        L11c:
            int r14 = r2 + 1
            long r10 = (long) r14
            boolean r10 = r12.o(r10)
            if (r10 != 0) goto L127
            goto L197
        L127:
            long r10 = (long) r2
            byte r10 = r7.f(r10)
            r11 = 43
            if (r10 == r11) goto L1e1
            r11 = 69
            if (r10 == r11) goto L1d8
            r11 = 101(0x65, float:1.42E-43)
            if (r10 == r11) goto L1d8
            r11 = 45
            if (r10 == r11) goto L1cd
            r11 = 46
            if (r10 == r11) goto L1c7
            r11 = 48
            if (r10 < r11) goto L191
            r11 = 57
            if (r10 <= r11) goto L149
            goto L191
        L149:
            if (r1 == r3) goto L14d
            if (r1 != 0) goto L14f
        L14d:
            r15 = 6
            goto L18b
        L14f:
            if (r1 != r6) goto L17b
            int r2 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r2 != 0) goto L158
        L155:
            r9 = 0
            goto L1eb
        L158:
            r20 = 10
            long r20 = r20 * r8
            int r10 = r10 + (-48)
            long r10 = (long) r10
            long r20 = r20 - r10
            r10 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 > 0) goto L173
            if (r2 != 0) goto L171
            int r2 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r2 >= 0) goto L171
            goto L173
        L171:
            r2 = 0
            goto L174
        L173:
            r2 = r3
        L174:
            r4 = r4 & r2
            r8 = r20
        L177:
            r10 = 7
            r15 = 6
            goto L1e6
        L17b:
            r2 = 3
            if (r1 != r2) goto L180
            r1 = 4
            goto L177
        L180:
            r15 = 6
            if (r1 == r5) goto L189
            if (r1 != r15) goto L186
            goto L189
        L186:
            r10 = 7
            goto L1e6
        L189:
            r1 = 7
            goto L186
        L18b:
            int r10 = r10 + (-48)
            int r1 = -r10
            long r8 = (long) r1
            r1 = r6
            goto L186
        L191:
            boolean r3 = r0.h0(r10)
            if (r3 != 0) goto L155
        L197:
            if (r1 != r6) goto L1b8
            if (r4 == 0) goto L1b8
            r3 = -9223372036854775808
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L1a3
            if (r13 == 0) goto L1b8
        L1a3:
            int r3 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r3 != 0) goto L1a9
            if (r13 != 0) goto L1b8
        L1a9:
            if (r13 == 0) goto L1ac
            goto L1ad
        L1ac:
            long r8 = -r8
        L1ad:
            r0.f15067y = r8
            long r1 = (long) r2
            r7.skip(r1)
            r9 = 16
            r0.f15066x = r9
            goto L1eb
        L1b8:
            if (r1 == r6) goto L1c0
            r3 = 4
            if (r1 == r3) goto L1c0
            r10 = 7
            if (r1 != r10) goto L155
        L1c0:
            r0.f15068z = r2
            r9 = 17
            r0.f15066x = r9
            goto L1eb
        L1c7:
            r10 = 7
            r15 = 6
            if (r1 != r6) goto L155
            r1 = 3
            goto L1e6
        L1cd:
            r10 = 7
            r15 = 6
            if (r1 != 0) goto L1d4
            r1 = r3
            r13 = r1
            goto L1e6
        L1d4:
            if (r1 != r5) goto L155
        L1d6:
            r1 = r15
            goto L1e6
        L1d8:
            r10 = 7
            r15 = 6
            if (r1 == r6) goto L1df
            r2 = 4
            if (r1 != r2) goto L155
        L1df:
            r1 = r5
            goto L1e6
        L1e1:
            r10 = 7
            r15 = 6
            if (r1 != r5) goto L155
            goto L1d6
        L1e6:
            r2 = r14
            r10 = r15
            r11 = 3
            goto L11c
        L1eb:
            if (r9 == 0) goto L1ee
            return r9
        L1ee:
            r1 = r17
            byte r1 = r7.f(r1)
            boolean r1 = r0.h0(r1)
            if (r1 != 0) goto L200
            java.lang.String r1 = "Expected value"
            r0.d0(r1)
            throw r16
        L200:
            r0.e0()
            throw r16
        L204:
            r7.readByte()
            r0.f15066x = r3
            return r3
        L20a:
            if (r4 != r3) goto L21a
            r7.readByte()
            r2 = 4
            r0.f15066x = r2
            return r2
        L213:
            r7.readByte()
            r2 = 3
            r0.f15066x = r2
            return r2
        L21a:
            if (r4 == r3) goto L225
            if (r4 != r6) goto L21f
            goto L225
        L21f:
            java.lang.String r1 = "Unexpected value"
            r0.d0(r1)
            throw r16
        L225:
            r0.e0()
            throw r16
        L229:
            r0.e0()
            throw r16
        L22d:
            r7.readByte()
            r1 = 9
            r0.f15066x = r1
            return r1
        L235:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L23d:
            r1[r2] = r19
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 != r5) goto L25d
            int r2 = r0.j0(r3)
            r7.readByte()
            if (r2 == r13) goto L25d
            if (r2 == r12) goto L259
            if (r2 != r1) goto L253
            r0.f15066x = r6
            return r6
        L253:
            java.lang.String r1 = "Unterminated object"
            r0.d0(r1)
            throw r16
        L259:
            r0.e0()
            throw r16
        L25d:
            int r2 = r0.j0(r3)
            r3 = 34
            if (r2 == r3) goto L284
            r3 = 39
            if (r2 == r3) goto L27d
            if (r2 != r1) goto L279
            if (r4 == r5) goto L273
            r7.readByte()
            r0.f15066x = r6
            return r6
        L273:
            java.lang.String r1 = "Expected name"
            r0.d0(r1)
            throw r16
        L279:
            r0.e0()
            throw r16
        L27d:
            r7.readByte()
            r0.e0()
            throw r16
        L284:
            r7.readByte()
            r1 = 13
            r0.f15066x = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C1361b.f0():int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g0(String str, m mVar) {
        int length = ((String[]) mVar.f8312r).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) mVar.f8312r)[i])) {
                this.f15066x = 0;
                this.f15058s[this.f15056q - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h0(int i) throws m0 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e0();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i0() throws m0, EOFException {
        String strK0;
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 14) {
            strK0 = l0();
        } else if (iF0 == 13) {
            strK0 = k0(f15061C);
        } else if (iF0 == 12) {
            strK0 = k0(f15060B);
        } else {
            if (iF0 != 15) {
                throw new e("Expected a name but was " + i.t(M()) + " at path " + f());
            }
            strK0 = this.f15063A;
        }
        this.f15066x = 0;
        this.f15058s[this.f15056q - 1] = strK0;
        return strK0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j0(boolean z5) throws m0, EOFException {
        int i = 0;
        while (true) {
            int i7 = i + 1;
            A a7 = this.f15064v;
            if (!a7.o(i7)) {
                if (z5) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C1538g c1538g = this.f15065w;
            byte bF = c1538g.f(j);
            if (bF != 10 && bF != 32 && bF != 13 && bF != 9) {
                c1538g.skip(j);
                if (bF == 47) {
                    if (a7.o(2L)) {
                        e0();
                        throw null;
                    }
                } else if (bF == 35) {
                    e0();
                    throw null;
                }
                return bF;
            }
            i = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String k0(C1541j c1541j) throws m0, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jB = this.f15064v.b(c1541j);
            if (jB == -1) {
                d0("Unterminated string");
                throw null;
            }
            C1538g c1538g = this.f15065w;
            if (c1538g.f(jB) != 92) {
                if (sb == null) {
                    String strK = c1538g.K(jB, J5.a.f2809a);
                    c1538g.readByte();
                    return strK;
                }
                sb.append(c1538g.K(jB, J5.a.f2809a));
                c1538g.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c1538g.K(jB, J5.a.f2809a));
            c1538g.readByte();
            sb.append(m0());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String l0() {
        long jB = this.f15064v.b(f15062D);
        C1538g c1538g = this.f15065w;
        if (jB == -1) {
            return c1538g.M();
        }
        c1538g.getClass();
        return c1538g.K(jB, J5.a.f2809a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final char m0() throws m0, EOFException {
        int i;
        A a7 = this.f15064v;
        if (!a7.o(1L)) {
            d0("Unterminated escape sequence");
            throw null;
        }
        C1538g c1538g = this.f15065w;
        byte b7 = c1538g.readByte();
        if (b7 == 10 || b7 == 34 || b7 == 39 || b7 == 47 || b7 == 92) {
            return (char) b7;
        }
        if (b7 == 98) {
            return '\b';
        }
        if (b7 == 102) {
            return '\f';
        }
        if (b7 == 110) {
            return '\n';
        }
        if (b7 == 114) {
            return '\r';
        }
        if (b7 == 116) {
            return '\t';
        }
        if (b7 != 117) {
            d0("Invalid escape sequence: \\" + ((char) b7));
            throw null;
        }
        if (!a7.o(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + f());
        }
        char c7 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            byte bF = c1538g.f(i7);
            char c8 = (char) (c7 << 4);
            if (bF >= 48 && bF <= 57) {
                i = bF - 48;
            } else if (bF >= 97 && bF <= 102) {
                i = bF - 87;
            } else {
                if (bF < 65 || bF > 70) {
                    d0("\\u".concat(c1538g.K(4L, J5.a.f2809a)));
                    throw null;
                }
                i = bF - 55;
            }
            c7 = (char) (i + c8);
        }
        c1538g.skip(4L);
        return c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final boolean n() throws m0, EOFException {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        return (iF0 == 2 || iF0 == 4 || iF0 == 18) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n0(C1541j c1541j) throws m0, EOFException {
        while (true) {
            long jB = this.f15064v.b(c1541j);
            if (jB == -1) {
                d0("Unterminated string");
                throw null;
            }
            C1538g c1538g = this.f15065w;
            if (c1538g.f(jB) != 92) {
                c1538g.skip(jB + 1);
                return;
            } else {
                c1538g.skip(jB + 1);
                m0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "JsonReader(" + this.f15064v + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final boolean v() throws m0, EOFException {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 5) {
            this.f15066x = 0;
            int[] iArr = this.f15059t;
            int i = this.f15056q - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iF0 == 6) {
            this.f15066x = 0;
            int[] iArr2 = this.f15059t;
            int i7 = this.f15056q - 1;
            iArr2[i7] = iArr2[i7] + 1;
            return false;
        }
        throw new e("Expected a boolean but was " + i.t(M()) + " at path " + f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m3.AbstractC1360a
    public final double z() {
        int iF0 = this.f15066x;
        if (iF0 == 0) {
            iF0 = f0();
        }
        if (iF0 == 16) {
            this.f15066x = 0;
            int[] iArr = this.f15059t;
            int i = this.f15056q - 1;
            iArr[i] = iArr[i] + 1;
            return this.f15067y;
        }
        if (iF0 == 17) {
            long j = this.f15068z;
            C1538g c1538g = this.f15065w;
            c1538g.getClass();
            this.f15063A = c1538g.K(j, J5.a.f2809a);
        } else if (iF0 == 9) {
            this.f15063A = k0(f15061C);
        } else if (iF0 == 8) {
            this.f15063A = k0(f15060B);
        } else if (iF0 == 10) {
            this.f15063A = l0();
        } else if (iF0 != 11) {
            throw new e("Expected a double but was " + i.t(M()) + " at path " + f());
        }
        this.f15066x = 11;
        try {
            double d5 = Double.parseDouble(this.f15063A);
            if (Double.isNaN(d5) || Double.isInfinite(d5)) {
                throw new m0("JSON forbids NaN and infinities: " + d5 + " at path " + f());
            }
            this.f15063A = null;
            this.f15066x = 0;
            int[] iArr2 = this.f15059t;
            int i7 = this.f15056q - 1;
            iArr2[i7] = iArr2[i7] + 1;
            return d5;
        } catch (NumberFormatException unused) {
            throw new e("Expected a double but was " + this.f15063A + " at path " + f());
        }
    }
}
