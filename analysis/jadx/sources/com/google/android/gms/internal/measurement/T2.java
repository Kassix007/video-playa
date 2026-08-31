package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0841o2 f10712a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        P2 p22 = P2.f10684c;
        f10712a = new C0841o2(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void b(Object obj, Object obj2) {
        AbstractC0851q2 abstractC0851q2 = (AbstractC0851q2) obj;
        Y2 y22 = abstractC0851q2.zzc;
        Y2 y23 = ((AbstractC0851q2) obj2).zzc;
        Y2 y24 = Y2.f;
        if (!y24.equals(y23)) {
            if (y24.equals(y22)) {
                int i = y22.f10772a + y23.f10772a;
                int[] iArrCopyOf = Arrays.copyOf(y22.f10773b, i);
                System.arraycopy(y23.f10773b, 0, iArrCopyOf, y22.f10772a, y23.f10772a);
                Object[] objArrCopyOf = Arrays.copyOf(y22.f10774c, i);
                System.arraycopy(y23.f10774c, 0, objArrCopyOf, y22.f10772a, y23.f10772a);
                y22 = new Y2(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                y22.getClass();
                if (!y23.equals(y24)) {
                    if (!y22.f10776e) {
                        throw new UnsupportedOperationException();
                    }
                    int i7 = y22.f10772a + y23.f10772a;
                    y22.e(i7);
                    System.arraycopy(y23.f10773b, 0, y22.f10773b, y22.f10772a, y23.f10772a);
                    System.arraycopy(y23.f10774c, 0, y22.f10774c, y22.f10772a, y23.f10772a);
                    y22.f10772a = i7;
                }
            }
        }
        abstractC0851q2.zzc = y22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        if (list instanceof AbstractC0806h2) {
            throw new ClassCastException();
        }
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                c0801g2.j0(i, Double.doubleToRawLongBits(((Double) list.get(i7)).doubleValue()));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Double) list.get(i9)).getClass();
            i8 += 8;
        }
        c0801g2.o0(i8);
        while (i7 < list.size()) {
            c0801g2.r0(Double.doubleToRawLongBits(((Double) list.get(i7)).doubleValue()));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        if (list instanceof AbstractC0831m2) {
            throw new ClassCastException();
        }
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                c0801g2.h0(i, Float.floatToRawIntBits(((Float) list.get(i7)).floatValue()));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Float) list.get(i9)).getClass();
            i8 += 4;
        }
        c0801g2.o0(i8);
        while (i7 < list.size()) {
            c0801g2.p0(Float.floatToRawIntBits(((Float) list.get(i7)).floatValue()));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof D2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.i0(i, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int iC0 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iC0 += C0801g2.c0(((Long) list.get(i8)).longValue());
            }
            c0801g2.o0(iC0);
            while (i7 < list.size()) {
                c0801g2.q0(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        D2 d22 = (D2) list;
        if (!z5) {
            while (i7 < d22.f10622s) {
                c0801g2.i0(i, d22.g(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int iC02 = 0;
        for (int i9 = 0; i9 < d22.f10622s; i9++) {
            iC02 += C0801g2.c0(d22.g(i9));
        }
        c0801g2.o0(iC02);
        while (i7 < d22.f10622s) {
            c0801g2.q0(d22.g(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof D2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.i0(i, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int iC0 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iC0 += C0801g2.c0(((Long) list.get(i8)).longValue());
            }
            c0801g2.o0(iC0);
            while (i7 < list.size()) {
                c0801g2.q0(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        D2 d22 = (D2) list;
        if (!z5) {
            while (i7 < d22.f10622s) {
                c0801g2.i0(i, d22.g(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int iC02 = 0;
        for (int i9 = 0; i9 < d22.f10622s; i9++) {
            iC02 += C0801g2.c0(d22.g(i9));
        }
        c0801g2.o0(iC02);
        while (i7 < d22.f10622s) {
            c0801g2.q0(d22.g(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof D2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    long jLongValue = ((Long) list.get(i7)).longValue();
                    c0801g2.i0(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int iC0 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                long jLongValue2 = ((Long) list.get(i8)).longValue();
                iC0 += C0801g2.c0((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            c0801g2.o0(iC0);
            while (i7 < list.size()) {
                long jLongValue3 = ((Long) list.get(i7)).longValue();
                c0801g2.q0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i7++;
            }
            return;
        }
        D2 d22 = (D2) list;
        if (!z5) {
            while (i7 < d22.f10622s) {
                long jG = d22.g(i7);
                c0801g2.i0(i, (jG >> 63) ^ (jG + jG));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int iC02 = 0;
        for (int i9 = 0; i9 < d22.f10622s; i9++) {
            long jG2 = d22.g(i9);
            iC02 += C0801g2.c0((jG2 >> 63) ^ (jG2 + jG2));
        }
        c0801g2.o0(iC02);
        while (i7 < d22.f10622s) {
            long jG3 = d22.g(i7);
            c0801g2.q0((jG3 >> 63) ^ (jG3 + jG3));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof D2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.j0(i, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            c0801g2.o0(i8);
            while (i7 < list.size()) {
                c0801g2.r0(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        D2 d22 = (D2) list;
        if (!z5) {
            while (i7 < d22.f10622s) {
                c0801g2.j0(i, d22.g(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < d22.f10622s; i11++) {
            d22.g(i11);
            i10 += 8;
        }
        c0801g2.o0(i10);
        while (i7 < d22.f10622s) {
            c0801g2.r0(d22.g(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof D2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.j0(i, ((Long) list.get(i7)).longValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            c0801g2.o0(i8);
            while (i7 < list.size()) {
                c0801g2.r0(((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        D2 d22 = (D2) list;
        if (!z5) {
            while (i7 < d22.f10622s) {
                c0801g2.j0(i, d22.g(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < d22.f10622s; i11++) {
            d22.g(i11);
            i10 += 8;
        }
        c0801g2.o0(i10);
        while (i7 < d22.f10622s) {
            c0801g2.r0(d22.g(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof C0855r2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.f0(i, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int iC0 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iC0 += C0801g2.c0(((Integer) list.get(i8)).intValue());
            }
            c0801g2.o0(iC0);
            while (i7 < list.size()) {
                c0801g2.n0(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        if (!z5) {
            while (i7 < c0855r2.f11025s) {
                c0801g2.f0(i, c0855r2.h(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int iC02 = 0;
        for (int i9 = 0; i9 < c0855r2.f11025s; i9++) {
            iC02 += C0801g2.c0(c0855r2.h(i9));
        }
        c0801g2.o0(iC02);
        while (i7 < c0855r2.f11025s) {
            c0801g2.n0(c0855r2.h(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof C0855r2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.g0(i, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int iU0 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iU0 += C0801g2.u0(((Integer) list.get(i8)).intValue());
            }
            c0801g2.o0(iU0);
            while (i7 < list.size()) {
                c0801g2.o0(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        if (!z5) {
            while (i7 < c0855r2.f11025s) {
                c0801g2.g0(i, c0855r2.h(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int iU02 = 0;
        for (int i9 = 0; i9 < c0855r2.f11025s; i9++) {
            iU02 += C0801g2.u0(c0855r2.h(i9));
        }
        c0801g2.o0(iU02);
        while (i7 < c0855r2.f11025s) {
            c0801g2.o0(c0855r2.h(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof C0855r2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    int iIntValue = ((Integer) list.get(i7)).intValue();
                    c0801g2.g0(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int iU0 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                int iIntValue2 = ((Integer) list.get(i8)).intValue();
                iU0 += C0801g2.u0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            c0801g2.o0(iU0);
            while (i7 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i7)).intValue();
                c0801g2.o0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i7++;
            }
            return;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        if (!z5) {
            while (i7 < c0855r2.f11025s) {
                int iH = c0855r2.h(i7);
                c0801g2.g0(i, (iH >> 31) ^ (iH + iH));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int iU02 = 0;
        for (int i9 = 0; i9 < c0855r2.f11025s; i9++) {
            int iH2 = c0855r2.h(i9);
            iU02 += C0801g2.u0((iH2 >> 31) ^ (iH2 + iH2));
        }
        c0801g2.o0(iU02);
        while (i7 < c0855r2.f11025s) {
            int iH3 = c0855r2.h(i7);
            c0801g2.o0((iH3 >> 31) ^ (iH3 + iH3));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof C0855r2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.h0(i, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            c0801g2.o0(i8);
            while (i7 < list.size()) {
                c0801g2.p0(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        if (!z5) {
            while (i7 < c0855r2.f11025s) {
                c0801g2.h0(i, c0855r2.h(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c0855r2.f11025s; i11++) {
            c0855r2.h(i11);
            i10 += 4;
        }
        c0801g2.o0(i10);
        while (i7 < c0855r2.f11025s) {
            c0801g2.p0(c0855r2.h(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof C0855r2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.h0(i, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            c0801g2.o0(i8);
            while (i7 < list.size()) {
                c0801g2.p0(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        if (!z5) {
            while (i7 < c0855r2.f11025s) {
                c0801g2.h0(i, c0855r2.h(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < c0855r2.f11025s; i11++) {
            c0855r2.h(i11);
            i10 += 4;
        }
        c0801g2.o0(i10);
        while (i7 < c0855r2.f11025s) {
            c0801g2.p0(c0855r2.h(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void o(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        int i7 = 0;
        if (!(list instanceof C0855r2)) {
            if (!z5) {
                while (i7 < list.size()) {
                    c0801g2.f0(i, ((Integer) list.get(i7)).intValue());
                    i7++;
                }
                return;
            }
            c0801g2.e0(i, 2);
            int iC0 = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iC0 += C0801g2.c0(((Integer) list.get(i8)).intValue());
            }
            c0801g2.o0(iC0);
            while (i7 < list.size()) {
                c0801g2.n0(((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        if (!z5) {
            while (i7 < c0855r2.f11025s) {
                c0801g2.f0(i, c0855r2.h(i7));
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int iC02 = 0;
        for (int i9 = 0; i9 < c0855r2.f11025s; i9++) {
            iC02 += C0801g2.c0(c0855r2.h(i9));
        }
        c0801g2.o0(iC02);
        while (i7 < c0855r2.f11025s) {
            c0801g2.n0(c0855r2.h(i7));
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void p(int i, List list, F2 f22, boolean z5) throws com.google.android.gms.internal.clearcut.m0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0801g2 c0801g2 = (C0801g2) f22.f10630q;
        if (list instanceof AbstractC0781c2) {
            throw new ClassCastException();
        }
        int i7 = 0;
        if (!z5) {
            while (i7 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i7)).booleanValue();
                c0801g2.o0(i << 3);
                c0801g2.m0(zBooleanValue ? (byte) 1 : (byte) 0);
                i7++;
            }
            return;
        }
        c0801g2.e0(i, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            i8++;
        }
        c0801g2.o0(i8);
        while (i7 < list.size()) {
            c0801g2.m0(((Boolean) list.get(i7)).booleanValue() ? (byte) 1 : (byte) 0);
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof D2)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += C0801g2.c0(((Long) list.get(i)).longValue());
                i++;
            }
            return iC0;
        }
        D2 d22 = (D2) list;
        int iC02 = 0;
        while (i < size) {
            iC02 += C0801g2.c0(d22.g(i));
            i++;
        }
        return iC02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof D2)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += C0801g2.c0(((Long) list.get(i)).longValue());
                i++;
            }
            return iC0;
        }
        D2 d22 = (D2) list;
        int iC02 = 0;
        while (i < size) {
            iC02 += C0801g2.c0(d22.g(i));
            i++;
        }
        return iC02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof D2)) {
            int iC0 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iC0 += C0801g2.c0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iC0;
        }
        D2 d22 = (D2) list;
        int iC02 = 0;
        while (i < size) {
            long jG = d22.g(i);
            iC02 += C0801g2.c0((jG >> 63) ^ (jG + jG));
            i++;
        }
        return iC02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0855r2)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += C0801g2.c0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iC0;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        int iC02 = 0;
        while (i < size) {
            iC02 += C0801g2.c0(c0855r2.h(i));
            i++;
        }
        return iC02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0855r2)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += C0801g2.c0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iC0;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        int iC02 = 0;
        while (i < size) {
            iC02 += C0801g2.c0(c0855r2.h(i));
            i++;
        }
        return iC02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0855r2)) {
            int iU0 = 0;
            while (i < size) {
                iU0 += C0801g2.u0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iU0;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        int iU02 = 0;
        while (i < size) {
            iU02 += C0801g2.u0(c0855r2.h(i));
            i++;
        }
        return iU02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0855r2)) {
            int iU0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iU0 += C0801g2.u0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iU0;
        }
        C0855r2 c0855r2 = (C0855r2) list;
        int iU02 = 0;
        while (i < size) {
            int iH = c0855r2.h(i);
            iU02 += C0801g2.u0((iH >> 31) ^ (iH + iH));
            i++;
        }
        return iU02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0801g2.u0(i << 3) + 4) * size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0801g2.u0(i << 3) + 8) * size;
    }
}
