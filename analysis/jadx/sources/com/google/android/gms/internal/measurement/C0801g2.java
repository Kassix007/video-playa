package com.google.android.gms.internal.measurement;

import androidx.work.WorkInfo;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0801g2 extends AbstractC0836n2 {
    public static final Logger i = Logger.getLogger(C0801g2.class.getName());
    public static final boolean j = AbstractC0787d3.f10825e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F2 f10846e;
    public final byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10848h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0801g2(int i7, byte[] bArr) {
        int length = bArr.length;
        if (((length - i7) | i7) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(C0.S.j(length, i7, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f = bArr;
        this.f10848h = 0;
        this.f10847g = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c0(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d0(String str) {
        int length;
        try {
            length = AbstractC0797f3.b(str);
        } catch (C0792e3 unused) {
            length = str.getBytes(AbstractC0885x2.f11122a).length;
        }
        return u0(length) + length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int u0(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0(int i7, int i8) throws com.google.android.gms.internal.clearcut.m0 {
        o0((i7 << 3) | i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f0(int i7, int i8) throws com.google.android.gms.internal.clearcut.m0 {
        o0(i7 << 3);
        n0(i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0(int i7, int i8) throws com.google.android.gms.internal.clearcut.m0 {
        o0(i7 << 3);
        o0(i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h0(int i7, int i8) throws com.google.android.gms.internal.clearcut.m0 {
        o0((i7 << 3) | 5);
        p0(i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0(int i7, long j7) throws com.google.android.gms.internal.clearcut.m0 {
        o0(i7 << 3);
        q0(j7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j0(int i7, long j7) throws com.google.android.gms.internal.clearcut.m0 {
        o0((i7 << 3) | 1);
        r0(j7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k0(int i7, C0796f2 c0796f2) throws com.google.android.gms.internal.clearcut.m0 {
        o0((i7 << 3) | 2);
        l0(c0796f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l0(C0796f2 c0796f2) throws com.google.android.gms.internal.clearcut.m0 {
        o0(c0796f2.h());
        s0(c0796f2.h(), c0796f2.f10842r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m0(byte b7) throws com.google.android.gms.internal.clearcut.m0 {
        int i7 = this.f10848h;
        try {
            int i8 = i7 + 1;
            try {
                this.f[i7] = b7;
                this.f10848h = i8;
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                i7 = i8;
                throw new com.google.android.gms.internal.clearcut.m0(i7, this.f10847g, 1, e);
            }
        } catch (IndexOutOfBoundsException e8) {
            e = e8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n0(int i7) throws com.google.android.gms.internal.clearcut.m0 {
        if (i7 >= 0) {
            o0(i7);
        } else {
            q0(i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o0(int i7) throws com.google.android.gms.internal.clearcut.m0 {
        int i8;
        int i9 = this.f10848h;
        while (true) {
            int i10 = i7 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            byte[] bArr = this.f;
            if (i10 == 0) {
                i8 = i9 + 1;
                bArr[i9] = (byte) i7;
                this.f10848h = i8;
                return;
            } else {
                i8 = i9 + 1;
                try {
                    bArr[i9] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e7) {
                    throw new com.google.android.gms.internal.clearcut.m0(i8, this.f10847g, 1, e7);
                }
            }
            throw new com.google.android.gms.internal.clearcut.m0(i8, this.f10847g, 1, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p0(int i7) throws com.google.android.gms.internal.clearcut.m0 {
        int i8 = this.f10848h;
        try {
            byte[] bArr = this.f;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.f10848h = i8 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new com.google.android.gms.internal.clearcut.m0(i8, this.f10847g, 4, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q0(long j7) throws com.google.android.gms.internal.clearcut.m0 {
        int i7;
        int i8 = this.f10848h;
        int i9 = this.f10847g;
        byte[] bArr = this.f;
        if (!j || i9 - i8 < 10) {
            long j8 = j7;
            while ((j8 & (-128)) != 0) {
                int i10 = i8 + 1;
                try {
                    bArr[i8] = (byte) (((int) j8) | 128);
                    j8 >>>= 7;
                    i8 = i10;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i7 = i10;
                    throw new com.google.android.gms.internal.clearcut.m0(i7, i9, 1, e);
                }
            }
            i7 = i8 + 1;
            try {
                bArr[i8] = (byte) j8;
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
                throw new com.google.android.gms.internal.clearcut.m0(i7, i9, 1, e);
            }
        } else {
            long j9 = j7;
            while ((j9 & (-128)) != 0) {
                AbstractC0787d3.f10823c.a(bArr, AbstractC0787d3.f + ((long) i8), (byte) (((int) j9) | 128));
                j9 >>>= 7;
                i8++;
            }
            i7 = i8 + 1;
            AbstractC0787d3.f10823c.a(bArr, AbstractC0787d3.f + ((long) i8), (byte) j9);
        }
        this.f10848h = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r0(long j7) throws com.google.android.gms.internal.clearcut.m0 {
        int i7 = this.f10848h;
        try {
            byte[] bArr = this.f;
            bArr[i7] = (byte) j7;
            bArr[i7 + 1] = (byte) (j7 >> 8);
            bArr[i7 + 2] = (byte) (j7 >> 16);
            bArr[i7 + 3] = (byte) (j7 >> 24);
            bArr[i7 + 4] = (byte) (j7 >> 32);
            bArr[i7 + 5] = (byte) (j7 >> 40);
            bArr[i7 + 6] = (byte) (j7 >> 48);
            bArr[i7 + 7] = (byte) (j7 >> 56);
            this.f10848h = i7 + 8;
        } catch (IndexOutOfBoundsException e7) {
            throw new com.google.android.gms.internal.clearcut.m0(i7, this.f10847g, 8, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s0(int i7, byte[] bArr) throws com.google.android.gms.internal.clearcut.m0 {
        try {
            System.arraycopy(bArr, 0, this.f, this.f10848h, i7);
            this.f10848h += i7;
        } catch (IndexOutOfBoundsException e7) {
            throw new com.google.android.gms.internal.clearcut.m0(this.f10848h, this.f10847g, i7, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t0(String str) throws com.google.android.gms.internal.clearcut.m0 {
        int i7 = this.f10848h;
        try {
            int iU0 = u0(str.length() * 3);
            int iU02 = u0(str.length());
            int i8 = this.f10847g;
            byte[] bArr = this.f;
            if (iU02 != iU0) {
                o0(AbstractC0797f3.b(str));
                int i9 = this.f10848h;
                this.f10848h = AbstractC0797f3.c(str, bArr, i9, i8 - i9);
            } else {
                int i10 = i7 + iU02;
                this.f10848h = i10;
                int iC = AbstractC0797f3.c(str, bArr, i10, i8 - i10);
                this.f10848h = i7;
                o0((iC - i7) - iU02);
                this.f10848h = iC;
            }
        } catch (C0792e3 e7) {
            this.f10848h = i7;
            i.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(AbstractC0885x2.f11122a);
            try {
                int length = bytes.length;
                o0(length);
                s0(length, bytes);
            } catch (IndexOutOfBoundsException e8) {
                throw new com.google.android.gms.internal.clearcut.m0(e8);
            }
        } catch (IndexOutOfBoundsException e9) {
            throw new com.google.android.gms.internal.clearcut.m0(e9);
        }
    }
}
