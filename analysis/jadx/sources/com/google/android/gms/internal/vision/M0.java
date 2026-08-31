package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f11207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N0 f11208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N0 f11209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N0 f11210d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f11207a = cls;
        f11208b = d(false);
        f11209c = d(true);
        f11210d = new N0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int A(List list) {
        return list.size() << 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void B(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                q7.D(i, 0);
                q7.C(iIntValue);
            }
            return;
        }
        q7.D(i, 2);
        int iP = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iP += Q.P(((Integer) list.get(i8)).intValue());
        }
        q7.H(iP);
        for (int i9 = 0; i9 < list.size(); i9++) {
            q7.C(((Integer) list.get(i9)).intValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q.R(i) * size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int D(List list) {
        return list.size() << 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void E(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                q7.D(i, 0);
                q7.H(iIntValue);
            }
            return;
        }
        q7.D(i, 2);
        int iT = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iT += Q.T(((Integer) list.get(i8)).intValue());
        }
        q7.H(iT);
        for (int i9 = 0; i9 < list.size(); i9++) {
            q7.H(((Integer) list.get(i9)).intValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void F(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                q7.D(i, 0);
                q7.H((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        q7.D(i, 2);
        int iT = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int iIntValue2 = ((Integer) list.get(i8)).intValue();
            iT += Q.T((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        q7.H(iT);
        for (int i9 = 0; i9 < list.size(); i9++) {
            int iIntValue3 = ((Integer) list.get(i9)).intValue();
            q7.H((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void G(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                q7.D(i, 5);
                q7.M(iIntValue);
                i7++;
            }
            return;
        }
        q7.D(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Integer) list.get(i9)).getClass();
            Logger logger = Q.f;
            i8 += 4;
        }
        q7.H(i8);
        while (i7 < list.size()) {
            q7.M(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void H(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                q7.D(i, 5);
                q7.M(iIntValue);
                i7++;
            }
            return;
        }
        q7.D(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Integer) list.get(i9)).getClass();
            Logger logger = Q.f;
            i8 += 4;
        }
        q7.H(i8);
        while (i7 < list.size()) {
            q7.M(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void I(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                int iIntValue = ((Integer) list.get(i7)).intValue();
                q7.D(i, 0);
                q7.C(iIntValue);
            }
            return;
        }
        q7.D(i, 2);
        int iP = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iP += Q.P(((Integer) list.get(i8)).intValue());
        }
        q7.H(iP);
        for (int i9 = 0; i9 < list.size(); i9++) {
            q7.C(((Integer) list.get(i9)).intValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void J(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                boolean zBooleanValue = ((Boolean) list.get(i7)).booleanValue();
                q7.D(i, 0);
                q7.B(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        q7.D(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            Logger logger = Q.f;
            i8++;
        }
        q7.H(i8);
        for (int i10 = 0; i10 < list.size(); i10++) {
            q7.B(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(int i, Object obj, L0 l02) {
        K k7 = (K) obj;
        int iT = Q.T(i << 3);
        int iC = k7.c();
        if (iC == -1) {
            iC = l02.h(k7);
            k7.b(iC);
        }
        return C0.S.u(iC, iC, iT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(int i, List list, L0 l02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = Q.y(i) * size;
        for (int i7 = 0; i7 < size; i7++) {
            K k7 = (K) list.get(i7);
            int iC = k7.c();
            if (iC == -1) {
                iC = l02.h(k7);
                k7.b(iC);
            }
            iY = C0.S.u(iC, iC, iY);
        }
        return iY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0937u0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iO = 0;
        for (int i = 0; i < size; i++) {
            iO += Q.O(((Long) list.get(i)).longValue());
        }
        return iO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static N0 d(boolean z5) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (N0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z5));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(int i, List list, C0941w0 c0941w0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!(list instanceof InterfaceC0933s0)) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                String str = (String) list.get(i7);
                q7.D(i, 2);
                byte[] bArr = q7.f11225c;
                int i8 = q7.f11227e;
                try {
                    int iT = Q.T(str.length() * 3);
                    int iT2 = Q.T(str.length());
                    if (iT2 == iT) {
                        int i9 = i8 + iT2;
                        q7.f11227e = i9;
                        int iH = X0.f11248a.h(str, bArr, i9, q7.F());
                        q7.f11227e = i8;
                        q7.H((iH - i8) - iT2);
                        q7.f11227e = iH;
                    } else {
                        q7.H(X0.a(str));
                        q7.f11227e = X0.f11248a.h(str, bArr, q7.f11227e, q7.F());
                    }
                } catch (Y0 e7) {
                    q7.f11227e = i8;
                    Q.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
                    byte[] bytes = str.getBytes(AbstractC0914i0.f11272a);
                    try {
                        q7.H(bytes.length);
                        q7.L(bytes, 0, bytes.length);
                    } catch (S e8) {
                        throw e8;
                    } catch (IndexOutOfBoundsException e9) {
                        throw new S(e9);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    throw new S(e10);
                }
            }
            return;
        }
        InterfaceC0933s0 interfaceC0933s0 = (InterfaceC0933s0) list;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object objE = interfaceC0933s0.e(i10);
            if (objE instanceof String) {
                String str2 = (String) objE;
                q7.D(i, 2);
                byte[] bArr2 = q7.f11225c;
                int i11 = q7.f11227e;
                try {
                    int iT3 = Q.T(str2.length() * 3);
                    int iT4 = Q.T(str2.length());
                    if (iT4 == iT3) {
                        int i12 = i11 + iT4;
                        q7.f11227e = i12;
                        int iH2 = X0.f11248a.h(str2, bArr2, i12, q7.F());
                        q7.f11227e = i11;
                        q7.H((iH2 - i11) - iT4);
                        q7.f11227e = iH2;
                    } else {
                        q7.H(X0.a(str2));
                        q7.f11227e = X0.f11248a.h(str2, bArr2, q7.f11227e, q7.F());
                    }
                } catch (Y0 e11) {
                    q7.f11227e = i11;
                    Q.f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
                    byte[] bytes2 = str2.getBytes(AbstractC0914i0.f11272a);
                    try {
                        q7.H(bytes2.length);
                        q7.L(bytes2, 0, bytes2.length);
                    } catch (S e12) {
                        throw e12;
                    } catch (IndexOutOfBoundsException e13) {
                        throw new S(e13);
                    }
                } catch (IndexOutOfBoundsException e14) {
                    throw new S(e14);
                }
            } else {
                P p7 = (P) objE;
                q7.D(i, 2);
                q7.H(p7.g());
                q7.L(p7.f11221r, p7.k(), p7.g());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(int i, List list, C0941w0 c0941w0, L0 l02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0941w0.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            c0941w0.b(i, list.get(i7), l02);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                double dDoubleValue = ((Double) list.get(i7)).doubleValue();
                q7.getClass();
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dDoubleValue);
                q7.D(i, 1);
                q7.K(jDoubleToRawLongBits);
                i7++;
            }
            return;
        }
        q7.D(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Double) list.get(i9)).getClass();
            Logger logger = Q.f;
            i8 += 8;
        }
        q7.H(i8);
        while (i7 < list.size()) {
            q7.K(Double.doubleToRawLongBits(((Double) list.get(i7)).doubleValue()));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(N0 n02, Object obj, Object obj2) {
        n02.getClass();
        AbstractC0906e0 abstractC0906e0 = (AbstractC0906e0) obj;
        O0 o02 = abstractC0906e0.zzb;
        O0 o03 = ((AbstractC0906e0) obj2).zzb;
        if (!o03.equals(O0.f)) {
            int i = o02.f11213a + o03.f11213a;
            int[] iArrCopyOf = Arrays.copyOf(o02.f11214b, i);
            System.arraycopy(o03.f11214b, 0, iArrCopyOf, o02.f11213a, o03.f11213a);
            Object[] objArrCopyOf = Arrays.copyOf(o02.f11215c, i);
            System.arraycopy(o03.f11215c, 0, objArrCopyOf, o02.f11213a, o03.f11213a);
            o02 = new O0(i, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC0906e0.zzb = o02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int j(int i, List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = Q.y(i) * size;
        if (!(list instanceof InterfaceC0933s0)) {
            while (i7 < size) {
                Object obj = list.get(i7);
                if (obj instanceof P) {
                    int iG = ((P) obj).g();
                    iY = C0.S.u(iG, iG, iY);
                } else {
                    iY = Q.G((String) obj) + iY;
                }
                i7++;
            }
            return iY;
        }
        InterfaceC0933s0 interfaceC0933s0 = (InterfaceC0933s0) list;
        while (i7 < size) {
            Object objE = interfaceC0933s0.e(i7);
            if (objE instanceof P) {
                int iG2 = ((P) objE).g();
                iY = C0.S.u(iG2, iG2, iY);
            } else {
                iY = Q.G((String) objE) + iY;
            }
            i7++;
        }
        return iY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0937u0) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iO = 0;
        for (int i = 0; i < size; i++) {
            iO += Q.O(((Long) list.get(i)).longValue());
        }
        return iO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(int i, List list, C0941w0 c0941w0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0941w0.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Q q7 = (Q) c0941w0.f11327a;
            P p7 = (P) list.get(i7);
            q7.D(i, 2);
            q7.H(p7.g());
            q7.L(p7.f11221r, p7.k(), p7.g());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(int i, List list, C0941w0 c0941w0, L0 l02) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0941w0.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            c0941w0.c(i, list.get(i7), l02);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                float fFloatValue = ((Float) list.get(i7)).floatValue();
                q7.getClass();
                int iFloatToRawIntBits = Float.floatToRawIntBits(fFloatValue);
                q7.D(i, 5);
                q7.M(iFloatToRawIntBits);
                i7++;
            }
            return;
        }
        q7.D(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Float) list.get(i9)).getClass();
            Logger logger = Q.f;
            i8 += 4;
        }
        q7.H(i8);
        while (i7 < list.size()) {
            q7.M(Float.floatToRawIntBits(((Float) list.get(i7)).floatValue()));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = Q.y(i) * size;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int iG = ((P) list.get(i7)).g();
            iY = C0.S.u(iG, iG, iY);
        }
        return iY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof AbstractC0937u0)) {
                int iO = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iO += Q.O((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iO;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                q7.D(i, 0);
                q7.E(jLongValue);
            }
            return;
        }
        q7.D(i, 2);
        int iO = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iO += Q.O(((Long) list.get(i8)).longValue());
        }
        q7.H(iO);
        for (int i9 = 0; i9 < list.size(); i9++) {
            q7.E(((Long) list.get(i9)).longValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0910g0)) {
            int iP = 0;
            while (i < size) {
                iP += Q.P(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        C0910g0 c0910g0 = (C0910g0) list;
        int iP2 = 0;
        while (i < size) {
            c0910g0.h(i);
            iP2 += Q.P(c0910g0.f11270r[i]);
            i++;
        }
        return iP2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                q7.D(i, 0);
                q7.E(jLongValue);
            }
            return;
        }
        q7.D(i, 2);
        int iO = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iO += Q.O(((Long) list.get(i8)).longValue());
        }
        q7.H(iO);
        for (int i9 = 0; i9 < list.size(); i9++) {
            q7.E(((Long) list.get(i9)).longValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0910g0)) {
            int iP = 0;
            while (i < size) {
                iP += Q.P(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        C0910g0 c0910g0 = (C0910g0) list;
        int iP2 = 0;
        while (i < size) {
            c0910g0.h(i);
            iP2 += Q.P(c0910g0.f11270r[i]);
            i++;
        }
        return iP2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        if (!z5) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                q7.D(i, 0);
                q7.E((jLongValue >> 63) ^ (jLongValue << 1));
            }
            return;
        }
        q7.D(i, 2);
        int iO = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            long jLongValue2 = ((Long) list.get(i8)).longValue();
            iO += Q.O((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        q7.H(iO);
        for (int i9 = 0; i9 < list.size(); i9++) {
            long jLongValue3 = ((Long) list.get(i9)).longValue();
            q7.E((jLongValue3 >> 63) ^ (jLongValue3 << 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0910g0)) {
            int iT = 0;
            while (i < size) {
                iT += Q.T(((Integer) list.get(i)).intValue());
                i++;
            }
            return iT;
        }
        C0910g0 c0910g0 = (C0910g0) list;
        int iT2 = 0;
        while (i < size) {
            c0910g0.h(i);
            iT2 += Q.T(c0910g0.f11270r[i]);
            i++;
        }
        return iT2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void w(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                q7.D(i, 1);
                q7.K(jLongValue);
                i7++;
            }
            return;
        }
        q7.D(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Long) list.get(i9)).getClass();
            Logger logger = Q.f;
            i8 += 8;
        }
        q7.H(i8);
        while (i7 < list.size()) {
            q7.K(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0910g0)) {
            int iT = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iT += Q.T((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iT;
        }
        C0910g0 c0910g0 = (C0910g0) list;
        int iT2 = 0;
        while (i < size) {
            c0910g0.h(i);
            int i7 = c0910g0.f11270r[i];
            iT2 += Q.T((i7 >> 31) ^ (i7 << 1));
            i++;
        }
        return iT2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(int i, List list, C0941w0 c0941w0, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Q q7 = (Q) c0941w0.f11327a;
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                long jLongValue = ((Long) list.get(i7)).longValue();
                q7.D(i, 1);
                q7.K(jLongValue);
                i7++;
            }
            return;
        }
        q7.D(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Long) list.get(i9)).getClass();
            Logger logger = Q.f;
            i8 += 8;
        }
        q7.H(i8);
        while (i7 < list.size()) {
            q7.K(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q.V(i) * size;
    }
}
