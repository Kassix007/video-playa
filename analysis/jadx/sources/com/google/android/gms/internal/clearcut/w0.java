package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends n0 implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public byte[] f10564A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f10565B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f10566C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10567D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10568q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f10569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x0[] f10571t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f10572u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f10573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f10574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f10575x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f10576y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10577z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.n0
    public final void b(k3.d dVar) throws m0 {
        String str = this.f10565B;
        String str2 = this.f10576y;
        String str3 = this.f10575x;
        String str4 = this.f10574w;
        byte[] bArr = this.f10572u;
        long j = this.f10568q;
        if (j != 0) {
            dVar.H(1, 0);
            dVar.L(j);
        }
        x0[] x0VarArr = this.f10571t;
        if (x0VarArr != null && x0VarArr.length > 0) {
            int i = 0;
            while (true) {
                x0[] x0VarArr2 = this.f10571t;
                if (i >= x0VarArr2.length) {
                    break;
                }
                x0 x0Var = x0VarArr2[i];
                i++;
            }
        }
        byte[] bArr2 = l0.f;
        if (!Arrays.equals(bArr, bArr2)) {
            dVar.D(4, bArr);
        }
        if (!Arrays.equals(this.f10573v, bArr2)) {
            dVar.D(6, this.f10573v);
        }
        if (str4 != null && !str4.equals("")) {
            dVar.B(8, str4);
        }
        int i7 = this.f10570s;
        if (i7 != 0) {
            dVar.H(11, 0);
            if (i7 >= 0) {
                dVar.F(i7);
            } else {
                dVar.L(i7);
            }
        }
        if (str3 != null && !str3.equals("")) {
            dVar.B(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            dVar.B(14, str2);
        }
        long j7 = this.f10577z;
        if (j7 != 180000) {
            dVar.H(15, 0);
            dVar.L((j7 >> 63) ^ (j7 << 1));
        }
        long j8 = this.f10569r;
        if (j8 != 0) {
            dVar.H(17, 0);
            dVar.L(j8);
        }
        if (!Arrays.equals(this.f10564A, bArr2)) {
            dVar.D(18, this.f10564A);
        }
        int[] iArr = this.f10566C;
        if (iArr != null && iArr.length > 0) {
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.f10566C;
                if (i8 >= iArr2.length) {
                    break;
                }
                int i9 = iArr2[i8];
                dVar.H(20, 0);
                if (i9 >= 0) {
                    dVar.F(i9);
                } else {
                    dVar.L(i9);
                }
                i8++;
            }
        }
        if (str != null && !str.equals("")) {
            dVar.B(24, str);
        }
        boolean z5 = this.f10567D;
        if (z5) {
            dVar.H(25, 0);
            byte b7 = z5 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = (ByteBuffer) dVar.f14122r;
            if (!byteBuffer.hasRemaining()) {
                throw new m0(byteBuffer.position(), byteBuffer.limit());
            }
            byteBuffer.put(b7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        try {
            w0 w0Var = (w0) d();
            x0[] x0VarArr = this.f10571t;
            if (x0VarArr != null && x0VarArr.length > 0) {
                w0Var.f10571t = new x0[x0VarArr.length];
                int i = 0;
                while (true) {
                    x0[] x0VarArr2 = this.f10571t;
                    if (i >= x0VarArr2.length) {
                        break;
                    }
                    x0 x0Var = x0VarArr2[i];
                    i++;
                }
            }
            int[] iArr = this.f10566C;
            if (iArr != null && iArr.length > 0) {
                w0Var.f10566C = (int[]) iArr.clone();
            }
            return w0Var;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj != this) {
            if (obj instanceof w0) {
                w0 w0Var = (w0) obj;
                long j = this.f10568q;
                long j7 = w0Var.f10568q;
                String str5 = w0Var.f10565B;
                String str6 = w0Var.f10576y;
                String str7 = w0Var.f10575x;
                String str8 = w0Var.f10574w;
                if (j == j7 && this.f10569r == w0Var.f10569r && this.f10570s == w0Var.f10570s) {
                    x0[] x0VarArr = this.f10571t;
                    x0[] x0VarArr2 = w0Var.f10571t;
                    Object obj2 = o0.f10536a;
                    int length = x0VarArr == null ? 0 : x0VarArr.length;
                    int length2 = x0VarArr2 == null ? 0 : x0VarArr2.length;
                    int i = 0;
                    while (i < length) {
                        x0 x0Var = x0VarArr[i];
                        i++;
                    }
                    int i7 = 0;
                    while (i7 < length2) {
                        x0 x0Var2 = x0VarArr2[i7];
                        i7++;
                    }
                    boolean z5 = i >= length;
                    boolean z6 = i7 >= length2;
                    if (z5 && z6) {
                        if (Arrays.equals(this.f10572u, w0Var.f10572u) && Arrays.equals(this.f10573v, w0Var.f10573v) && ((str = this.f10574w) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f10575x) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f10576y) != null ? str3.equals(str6) : str6 == null) && this.f10577z == w0Var.f10577z && Arrays.equals(this.f10564A, w0Var.f10564A) && ((str4 = this.f10565B) != null ? str4.equals(str5) : str5 == null)) {
                            int[] iArr = this.f10566C;
                            int[] iArr2 = w0Var.f10566C;
                            if (((iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2)) && this.f10567D == w0Var.f10567D) {
                            }
                        }
                    } else if (z5 == z6) {
                        x0 x0Var3 = x0VarArr[i];
                        x0 x0Var4 = x0VarArr2[i7];
                        throw null;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (w0.class.getName().hashCode() + 527) * 31;
        long j = this.f10568q;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j7 = this.f10569r;
        int i7 = ((((i + ((int) (j7 ^ (j7 >>> 32)))) * 29791) + this.f10570s) * 29791) + 1237;
        x0[] x0VarArr = this.f10571t;
        Object obj = o0.f10536a;
        int iHashCode2 = 0;
        int length = x0VarArr == null ? 0 : x0VarArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            x0 x0Var = x0VarArr[i8];
        }
        int iHashCode3 = (Arrays.hashCode(this.f10573v) + ((Arrays.hashCode(this.f10572u) + (i7 * 961)) * 961)) * 31;
        String str = this.f10574w;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10575x;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.f10576y;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        long j8 = this.f10577z;
        int iHashCode7 = (Arrays.hashCode(this.f10564A) + ((((iHashCode5 + iHashCode6) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 961)) * 31;
        String str4 = this.f10565B;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 961;
        int[] iArr = this.f10566C;
        if (iArr != null && iArr.length != 0) {
            iHashCode2 = Arrays.hashCode(iArr);
        }
        return (((iHashCode8 + iHashCode2) * 29791) + (this.f10567D ? 1231 : 1237)) * 31;
    }
}
