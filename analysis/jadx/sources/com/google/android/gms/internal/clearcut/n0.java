package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(n0 n0Var, byte[] bArr, int i) {
        try {
            k3.d dVar = new k3.d(i, bArr);
            n0Var.b(dVar);
            ByteBuffer byteBuffer = (ByteBuffer) dVar.f14122r;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e7) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public abstract void b(k3.d dVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        int[] iArr;
        w0 w0Var = (w0) this;
        String str = w0Var.f10565B;
        String str2 = w0Var.f10576y;
        String str3 = w0Var.f10575x;
        String str4 = w0Var.f10574w;
        byte[] bArr = w0Var.f10572u;
        long j = w0Var.f10568q;
        int i = 0;
        int iM = j != 0 ? k3.d.M(j) + k3.d.N(1) : 0;
        x0[] x0VarArr = w0Var.f10571t;
        if (x0VarArr != null && x0VarArr.length > 0) {
            int i7 = 0;
            while (true) {
                x0[] x0VarArr2 = w0Var.f10571t;
                if (i7 >= x0VarArr2.length) {
                    break;
                }
                x0 x0Var = x0VarArr2[i7];
                i7++;
            }
        }
        byte[] bArr2 = l0.f;
        if (!Arrays.equals(bArr, bArr2)) {
            iM += k3.d.O(bArr.length) + bArr.length + k3.d.N(4);
        }
        if (!Arrays.equals(w0Var.f10573v, bArr2)) {
            byte[] bArr3 = w0Var.f10573v;
            iM += k3.d.O(bArr3.length) + bArr3.length + k3.d.N(6);
        }
        if (str4 != null && !str4.equals("")) {
            iM += k3.d.G(8, str4);
        }
        int i8 = w0Var.f10570s;
        if (i8 != 0) {
            iM += (i8 >= 0 ? k3.d.O(i8) : 10) + k3.d.N(11);
        }
        if (str3 != null && !str3.equals("")) {
            iM += k3.d.G(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            iM += k3.d.G(14, str2);
        }
        long j7 = w0Var.f10577z;
        if (j7 != 180000) {
            iM += k3.d.M((j7 >> 63) ^ (j7 << 1)) + k3.d.N(15);
        }
        long j8 = w0Var.f10569r;
        if (j8 != 0) {
            iM += k3.d.M(j8) + k3.d.N(17);
        }
        if (!Arrays.equals(w0Var.f10564A, bArr2)) {
            byte[] bArr4 = w0Var.f10564A;
            iM += k3.d.O(bArr4.length) + bArr4.length + k3.d.N(18);
        }
        int[] iArr2 = w0Var.f10566C;
        if (iArr2 != null && iArr2.length > 0) {
            int iO = 0;
            while (true) {
                iArr = w0Var.f10566C;
                if (i >= iArr.length) {
                    break;
                }
                int i9 = iArr[i];
                iO += i9 >= 0 ? k3.d.O(i9) : 10;
                i++;
            }
            iM = iM + iO + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            iM += k3.d.G(24, str);
        }
        return w0Var.f10567D ? k3.d.N(25) + 1 + iM : iM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n0 d() {
        n0 n0Var = (n0) super.clone();
        Object obj = o0.f10536a;
        return n0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            l0.j(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e7) {
            strValueOf = String.valueOf(e7.getMessage());
            if (strValueOf.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(strValueOf);
        } catch (InvocationTargetException e8) {
            strValueOf = String.valueOf(e8.getMessage());
            if (strValueOf.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(strValueOf);
        }
    }
}
