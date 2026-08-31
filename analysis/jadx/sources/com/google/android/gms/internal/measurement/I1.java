package com.google.android.gms.internal.measurement;

import A.X;
import M5.AbstractC0263y;
import M5.C0255p;
import P.C0345b;
import P.C0346b0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import a.AbstractC0597a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.InterfaceC0658v;
import androidx.lifecycle.InterfaceC0660x;
import h.AbstractActivityC1106h;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k1.AbstractC1175c;
import k2.C1178b;
import k2.C1179c;
import m5.AbstractC1362a;
import n5.AbstractC1397A;
import q6.C1538g;
import q6.C1541j;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public abstract class I1 implements Y5.b, Y5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static m.c1 f10645b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10646a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.b.<clinit>():void, A0.i.<init>(A0.h):void, B0.d.x0(boolean):void, J1.D.<init>(int):void, X5.d.<clinit>():void, X5.h.<clinit>():void, X5.i.<clinit>():void, b6.i.<init>(a6.c, b6.l, D.u, X5.f):void, com.google.android.gms.internal.measurement.P1.X(java.lang.String, java.lang.String, h.h, boolean):void, g5.h.<init>(com.web2native.MainActivity, R4.k1):void, t4.a.<init>(com.google.android.material.sidesheet.SideSheetBehavior, int):void] */
    public /* synthetic */ I1(int i) {
        this.f10646a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static W0.d B() {
        return new W0.d(1.0f, 1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void C(U1.r rVar, C0371o c0371o, int i) {
        U1.r rVar2;
        c0371o.U(294589392);
        if ((((c0371o.i(rVar) ? 4 : 2) | i) & 3) == 2 && c0371o.x()) {
            c0371o.N();
            rVar2 = rVar;
        } else {
            Z.f fVarL = AbstractC0836n2.L(c0371o);
            P.W wJ = C0345b.j(rVar.b().f7371e, c0371o);
            Object obj = (Collection) ((List) wJ.getValue());
            boolean zBooleanValue = ((Boolean) c0371o.k(C0.G0.f828a)).booleanValue();
            boolean zG = c0371o.g(obj);
            Object objH = c0371o.H();
            Object obj2 = C0363k.f5418a;
            Object obj3 = objH;
            if (zG || objH == obj2) {
                a0.q qVar = new a0.q();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj) {
                    T1.d dVar = (T1.d) obj4;
                    if (zBooleanValue || dVar.f7360x.j.f9572d.compareTo(EnumC0653p.f9559t) >= 0) {
                        arrayList.add(obj4);
                    }
                }
                qVar.addAll(arrayList);
                c0371o.d0(qVar);
                obj3 = qVar;
            }
            a0.q qVar2 = (a0.q) obj3;
            F(qVar2, (List) wJ.getValue(), c0371o, 0);
            P.W wJ2 = C0345b.j(rVar.b().f, c0371o);
            Object objH2 = c0371o.H();
            if (objH2 == obj2) {
                objH2 = new a0.q();
                c0371o.d0(objH2);
            }
            a0.q qVar3 = (a0.q) objH2;
            c0371o.S(-367418626);
            ListIterator listIterator = qVar2.listIterator();
            while (true) {
                B0.r rVar3 = (B0.r) listIterator;
                if (!rVar3.hasNext()) {
                    break;
                }
                T1.d dVar2 = (T1.d) rVar3.next();
                T1.p pVar = dVar2.f7354r;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                U1.q qVar4 = (U1.q) pVar;
                boolean zI = c0371o.i(rVar) | c0371o.i(dVar2);
                Object objH3 = c0371o.H();
                if (zI || objH3 == obj2) {
                    objH3 = new I2.e(2, rVar, dVar2);
                    c0371o.d0(objH3);
                }
                a0.q qVar5 = qVar3;
                U1.r rVar4 = rVar;
                AbstractC1397A.c((B5.a) objH3, qVar4.f7573v, X.k.d(1129586364, new U1.o(dVar2, rVar4, fVarL, qVar5, qVar4), c0371o), c0371o, 384);
                rVar = rVar4;
                qVar3 = qVar5;
            }
            rVar2 = rVar;
            a0.q qVar6 = qVar3;
            c0371o.p(false);
            Set set = (Set) wJ2.getValue();
            boolean zG2 = c0371o.g(wJ2) | c0371o.i(rVar2);
            Object objH4 = c0371o.H();
            if (zG2 || objH4 == obj2) {
                objH4 = new U1.p(wJ2, rVar2, qVar6, null);
                c0371o.d0(objH4);
            }
            C0345b.f(set, qVar6, (B5.e) objH4, c0371o);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new J5.u(i, 9, rVar2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float D(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object D0(R5.r rVar, boolean z5, R5.r rVar2, B5.e eVar) throws Throwable {
        Object c0255p;
        Object objO;
        try {
            if (eVar instanceof s5.a) {
                kotlin.jvm.internal.B.b(2, eVar);
                c0255p = eVar.invoke(rVar2, rVar);
            } else {
                c0255p = AbstractC1397A.G(eVar, rVar2, rVar);
            }
        } catch (M5.D e7) {
            Throwable th = e7.f3807q;
            rVar.N(new C0255p(false, th));
            throw th;
        } catch (Throwable th2) {
            c0255p = new C0255p(false, th2);
        }
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (c0255p == enumC1580a || (objO = rVar.O(c0255p)) == AbstractC0263y.f3905e) {
            return enumC1580a;
        }
        rVar.e0();
        if (!(objO instanceof C0255p)) {
            return AbstractC0263y.z(objO);
        }
        if (!z5) {
            Throwable th3 = ((C0255p) objO).f3878a;
            if ((th3 instanceof M5.u0) && ((M5.u0) th3).f3889q == rVar) {
                if (c0255p instanceof C0255p) {
                    throw ((C0255p) c0255p).f3878a;
                }
                return c0255p;
            }
        }
        throw ((C0255p) objO).f3878a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float E(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List E0(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(n5.l.l0(arrayList)) : n5.s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void F(final List list, Collection collection, C0371o c0371o, int i) {
        c0371o.U(1537894851);
        if ((((c0371o.i(list) ? 4 : 2) | i | (c0371o.i(collection) ? 32 : 16)) & 19) == 18 && c0371o.x()) {
            c0371o.N();
        } else {
            final boolean zBooleanValue = ((Boolean) c0371o.k(C0.G0.f828a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final T1.d dVar = (T1.d) it.next();
                C0662z c0662z = dVar.f7360x.j;
                boolean zH = c0371o.h(zBooleanValue) | c0371o.i(list) | c0371o.i(dVar);
                Object objH = c0371o.H();
                if (zH || objH == C0363k.f5418a) {
                    objH = new B5.c() { // from class: U1.k
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // B5.c
                        public final Object invoke(Object obj) {
                            final T1.d dVar2 = dVar;
                            final List list2 = list;
                            final boolean z5 = zBooleanValue;
                            InterfaceC0658v interfaceC0658v = new InterfaceC0658v() { // from class: U1.l
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // androidx.lifecycle.InterfaceC0658v
                                public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
                                    boolean z6 = z5;
                                    List list3 = list2;
                                    T1.d dVar3 = dVar2;
                                    if (z6 && !list3.contains(dVar3)) {
                                        list3.add(dVar3);
                                    }
                                    if (enumC0652o == EnumC0652o.ON_START && !list3.contains(dVar3)) {
                                        list3.add(dVar3);
                                    }
                                    if (enumC0652o == EnumC0652o.ON_STOP) {
                                        list3.remove(dVar3);
                                    }
                                }
                            };
                            dVar2.f7360x.j.a(interfaceC0658v);
                            return new X(4, dVar2, interfaceC0658v);
                        }
                    };
                    c0371o.d0(objH);
                }
                C0345b.c(c0662z, (B5.c) objH, c0371o);
            }
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new R4.Z(i, 2, list, collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Map F0(Map map) {
        int size = map.size();
        if (size == 0) {
            return n5.t.f15300q;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) n5.l.k0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String G0(long j) {
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i7)) {
            return "CornerRadius.circular(" + K1.M(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + K1.M(Float.intBitsToFloat(i)) + ", " + K1.M(Float.intBitsToFloat(i7)) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean H(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = I(r8, r9, r10)
            boolean r1 = I(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = w0(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.I1.H(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean I(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void I0(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void J(long j, C1538g c1538g, int i, ArrayList arrayList, int i7, int i8, ArrayList arrayList2) {
        int i9;
        int i10;
        ArrayList arrayList3;
        long j7;
        int i11;
        int i12 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i7 >= i8) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i13 = i7; i13 < i8; i13++) {
            if (((C1541j) arrayList4.get(i13)).c() < i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C1541j c1541j = (C1541j) arrayList.get(i7);
        C1541j c1541j2 = (C1541j) arrayList4.get(i8 - 1);
        if (i12 == c1541j.c()) {
            int iIntValue = ((Number) arrayList5.get(i7)).intValue();
            int i14 = i7 + 1;
            C1541j c1541j3 = (C1541j) arrayList4.get(i14);
            i9 = i14;
            i10 = iIntValue;
            c1541j = c1541j3;
        } else {
            i9 = i7;
            i10 = -1;
        }
        if (c1541j.h(i12) == c1541j2.h(i12)) {
            int iMin = Math.min(c1541j.c(), c1541j2.c());
            int i15 = 0;
            for (int i16 = i12; i16 < iMin && c1541j.h(i16) == c1541j2.h(i16); i16++) {
                i15++;
            }
            long j8 = 4;
            long j9 = (c1538g.f16063r / j8) + j + ((long) 2) + ((long) i15) + 1;
            c1538g.g0(-i15);
            c1538g.g0(i10);
            int i17 = i12 + i15;
            while (i12 < i17) {
                c1538g.g0(c1541j.h(i12) & 255);
                i12++;
            }
            if (i9 + 1 == i8) {
                if (i17 != ((C1541j) arrayList4.get(i9)).c()) {
                    throw new IllegalStateException("Check failed.");
                }
                c1538g.g0(((Number) arrayList5.get(i9)).intValue());
                return;
            } else {
                C1538g c1538g2 = new C1538g();
                c1538g.g0(((int) ((c1538g2.f16063r / j8) + j9)) * (-1));
                J(j9, c1538g2, i17, arrayList4, i9, i8, arrayList5);
                c1538g.d0(c1538g2);
                return;
            }
        }
        int i18 = 1;
        for (int i19 = i9 + 1; i19 < i8; i19++) {
            if (((C1541j) arrayList4.get(i19 - 1)).h(i12) != ((C1541j) arrayList4.get(i19)).h(i12)) {
                i18++;
            }
        }
        long j10 = 4;
        long j11 = (c1538g.f16063r / j10) + j + ((long) 2) + ((long) (i18 * 2));
        c1538g.g0(i18);
        c1538g.g0(i10);
        for (int i20 = i9; i20 < i8; i20++) {
            int iH = ((C1541j) arrayList4.get(i20)).h(i12);
            if (i20 == i9 || iH != ((C1541j) arrayList4.get(i20 - 1)).h(i12)) {
                c1538g.g0(iH & 255);
            }
        }
        C1538g c1538g3 = new C1538g();
        int i21 = i9;
        while (i21 < i8) {
            byte bH = ((C1541j) arrayList4.get(i21)).h(i12);
            int i22 = i21 + 1;
            int i23 = i22;
            while (true) {
                if (i23 >= i8) {
                    i23 = i8;
                    break;
                } else if (bH != ((C1541j) arrayList4.get(i23)).h(i12)) {
                    break;
                } else {
                    i23++;
                }
            }
            if (i22 == i23 && i12 + 1 == ((C1541j) arrayList4.get(i21)).c()) {
                c1538g.g0(((Number) arrayList5.get(i21)).intValue());
                arrayList3 = arrayList5;
                j7 = j11;
                i11 = i23;
            } else {
                c1538g.g0(((int) ((c1538g3.f16063r / j10) + j11)) * (-1));
                arrayList3 = arrayList5;
                j7 = j11;
                i11 = i23;
                J(j7, c1538g3, i12 + 1, arrayList, i21, i11, arrayList3);
                arrayList4 = arrayList;
            }
            j11 = j7;
            i21 = i11;
            arrayList5 = arrayList3;
        }
        c1538g.d0(c1538g3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void J0(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void K0(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean L0(InterfaceC0833n interfaceC0833n) {
        if (interfaceC0833n == null) {
            return false;
        }
        Double dB = interfaceC0833n.b();
        return !dB.isNaN() && dB.doubleValue() >= 0.0d && dB.equals(Double.valueOf(Math.floor(dB.doubleValue())));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void M(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbL = k1.i.l("radix ", " was not in valid range ", i);
            sbL.append(new G5.d(2, 36, 1));
            throw new IllegalArgumentException(sbL.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0877w M0(String str) {
        EnumC0877w enumC0877w = null;
        if (str != null && !str.isEmpty()) {
            enumC0877w = (EnumC0877w) EnumC0877w.f11056B0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC0877w != null) {
            return enumC0877w;
        }
        throw new IllegalArgumentException(C0.S.w("Unsupported commandId ", str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void N(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1362a.a(th, th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean N0(InterfaceC0833n interfaceC0833n, InterfaceC0833n interfaceC0833n2) {
        if (!interfaceC0833n.getClass().equals(interfaceC0833n2.getClass())) {
            return false;
        }
        if ((interfaceC0833n instanceof r) || (interfaceC0833n instanceof C0823l)) {
            return true;
        }
        if (!(interfaceC0833n instanceof C0798g)) {
            return interfaceC0833n instanceof C0848q ? interfaceC0833n.zzc().equals(interfaceC0833n2.zzc()) : interfaceC0833n instanceof C0788e ? interfaceC0833n.c().equals(interfaceC0833n2.c()) : interfaceC0833n == interfaceC0833n2;
        }
        if (Double.isNaN(interfaceC0833n.b().doubleValue()) || Double.isNaN(interfaceC0833n2.b().doubleValue())) {
            return false;
        }
        return interfaceC0833n.b().equals(interfaceC0833n2.b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int O0(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5) || d5 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d5 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d5))) % 4.294967296E9d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double P0(double d5) {
        if (Double.isNaN(d5)) {
            return 0.0d;
        }
        if (Double.isInfinite(d5) || d5 == 0.0d || d5 == 0.0d) {
            return d5;
        }
        return ((double) (d5 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static androidx.lifecycle.f0 Q(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.m.b(objNewInstance);
            return (androidx.lifecycle.f0) objNewInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object Q0(InterfaceC0833n interfaceC0833n) {
        if (InterfaceC0833n.f10908e.equals(interfaceC0833n)) {
            return null;
        }
        if (InterfaceC0833n.f10907d.equals(interfaceC0833n)) {
            return "";
        }
        if (interfaceC0833n instanceof C0818k) {
            return R0((C0818k) interfaceC0833n);
        }
        if (!(interfaceC0833n instanceof C0783d)) {
            return !interfaceC0833n.b().isNaN() ? interfaceC0833n.b() : interfaceC0833n.zzc();
        }
        ArrayList arrayList = new ArrayList();
        C0783d c0783d = (C0783d) interfaceC0833n;
        c0783d.getClass();
        int i = 0;
        while (i < c0783d.p()) {
            if (i >= c0783d.p()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i);
                throw new NoSuchElementException(sb.toString());
            }
            int i7 = i + 1;
            Object objQ0 = Q0(c0783d.q(i));
            if (objQ0 != null) {
                arrayList.add(objQ0);
            }
            i = i7;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long R(F.N n7) {
        return D5.a.H(((C0346b0) n7.f1821d.f1779t).e() * n7.n()) + (((long) n7.j()) * ((long) n7.n()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static HashMap R0(C0818k c0818k) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(c0818k.f10881q.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objQ0 = Q0(c0818k.h(str));
            if (objQ0 != null) {
                map.put(str, objQ0);
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int S(int i, int i7, String str, boolean z5) {
        while (i < i7) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z5)) {
                return i;
            }
            i++;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void S0(E.c0 c0Var) {
        int iO0 = O0(c0Var.K("runtime.counter").b().doubleValue() + 1.0d);
        if (iO0 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c0Var.I("runtime.counter", new C0798g(Double.valueOf(iO0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean U(char c7, char c8, boolean z5) {
        if (c7 == c8) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c7);
        char upperCase2 = Character.toUpperCase(c8);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean V(long j, long j7) {
        return j == j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int W(float f, int i, int i7) {
        if (i == i7 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i7;
        }
        float f7 = ((i >> 24) & 255) / 255.0f;
        float f8 = ((i7 >> 24) & 255) / 255.0f;
        float fD = D(((i >> 16) & 255) / 255.0f);
        float fD2 = D(((i >> 8) & 255) / 255.0f);
        float fD3 = D((i & 255) / 255.0f);
        float fD4 = D(((i7 >> 16) & 255) / 255.0f);
        float fD5 = D(((i7 >> 8) & 255) / 255.0f);
        float fD6 = D((i7 & 255) / 255.0f);
        float fA = k1.i.a(f8, f7, f, f7);
        float fA2 = k1.i.a(fD4, fD, f, fD);
        float fA3 = k1.i.a(fD5, fD2, f, fD2);
        float fA4 = k1.i.a(fD6, fD3, f, fD3);
        float fE = E(fA2) * 255.0f;
        float fE2 = E(fA3) * 255.0f;
        return Math.round(E(fA4) * 255.0f) | (Math.round(fE) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fE2) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ColorStateList Y(Context context, B0.G0 g02, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) g02.f235s;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = AbstractC1175c.b(context, resourceId)) == null) ? g02.w(i) : colorStateListB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ColorStateList Z(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = AbstractC1175c.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a0(I4.b bVar) {
        if (!bVar.isDone()) {
            throw new IllegalStateException(C3.a.H("Future was expected to be done: %s", bVar));
        }
        boolean z5 = false;
        while (true) {
            try {
                bVar.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Drawable b0(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableC;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableC = AbstractC0597a.C(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float c0(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        M0.i iVar = M0.k.f3721a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : N0.d.f4003a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float d0(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        M0.i iVar = M0.k.f3721a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? N0.d.f4003a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bundle k0(String key, Bundle bundle) {
        kotlin.jvm.internal.m.e(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        K1.x(key);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ArrayList l0(String key, Bundle bundle) {
        kotlin.jvm.internal.m.e(key, "key");
        ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? b.f.c(bundle, key, AbstractC0836n2.s(kotlin.jvm.internal.z.a(Bundle.class))) : bundle.getParcelableArrayList(key);
        if (arrayListC != null) {
            return arrayListC;
        }
        K1.x(key);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1178b o0(C1179c refHolder, SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.m.e(refHolder, "refHolder");
        C1178b c1178b = refHolder.f14091a;
        if (c1178b != null && c1178b.f14090q.equals(sQLiteDatabase)) {
            return c1178b;
        }
        C1178b c1178b2 = new C1178b(sQLiteDatabase);
        refHolder.f14091a = c1178b2;
        return c1178b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean p0(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i7 = rect.right;
            int i8 = rect2.right;
            return (i7 > i8 || rect.left >= i8) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            return (i9 > i10 || rect.top >= i10) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i11 = rect.left;
            int i12 = rect2.left;
            return (i11 < i12 || rect.right <= i12) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        return (i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean q0(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean s0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean v0(char c7) {
        return Character.isWhitespace(c7) || Character.isSpaceChar(c7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int w0(int i, Rect rect, Rect rect2) {
        int i7;
        int i8;
        if (i == 17) {
            i7 = rect.left;
            i8 = rect2.right;
        } else if (i == 33) {
            i7 = rect.top;
            i8 = rect2.bottom;
        } else if (i == 66) {
            i7 = rect2.left;
            i8 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i7 = rect2.top;
            i8 = rect.bottom;
        }
        return Math.max(0, i7 - i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int x0(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q6.w y0(q6.C1541j... r11) {
        /*
            int r0 = r11.length
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L11
            q6.w r11 = new q6.w
            q6.j[] r0 = new q6.C1541j[r2]
            int[] r1 = new int[]{r2, r1}
            r11.<init>(r0, r1)
            return r11
        L11:
            java.util.ArrayList r7 = new java.util.ArrayList
            n5.i r0 = new n5.i
            r0.<init>(r11, r2)
            r7.<init>(r0)
            int r0 = r7.size()
            r3 = 1
            if (r0 <= r3) goto L25
            java.util.Collections.sort(r7)
        L25:
            int r0 = r7.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            r3 = r2
        L2f:
            if (r3 >= r0) goto L3b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r10.add(r4)
            int r3 = r3 + 1
            goto L2f
        L3b:
            int r0 = r11.length
            r1 = r2
            r3 = r1
        L3e:
            if (r1 >= r0) goto L53
            r4 = r11[r1]
            int r5 = r3 + 1
            int r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.f(r7, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.set(r4, r3)
            int r1 = r1 + 1
            r3 = r5
            goto L3e
        L53:
            java.lang.Object r0 = r7.get(r2)
            q6.j r0 = (q6.C1541j) r0
            int r0 = r0.c()
            if (r0 <= 0) goto L10c
            r0 = r2
        L60:
            int r1 = r7.size()
            if (r0 >= r1) goto Ld7
            java.lang.Object r1 = r7.get(r0)
            q6.j r1 = (q6.C1541j) r1
            int r3 = r0 + 1
            r4 = r3
        L6f:
            int r5 = r7.size()
            if (r4 >= r5) goto Ld5
            java.lang.Object r5 = r7.get(r4)
            q6.j r5 = (q6.C1541j) r5
            r5.getClass()
            java.lang.String r6 = "prefix"
            kotlin.jvm.internal.m.e(r1, r6)
            int r6 = r1.c()
            boolean r6 = r5.k(r2, r1, r6)
            if (r6 == 0) goto Ld5
            int r6 = r5.c()
            int r8 = r1.c()
            if (r6 == r8) goto Lbd
            java.lang.Object r5 = r10.get(r4)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = r10.get(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r5 <= r6) goto Lba
            r7.remove(r4)
            java.lang.Object r5 = r10.remove(r4)
            java.lang.Number r5 = (java.lang.Number) r5
            r5.intValue()
            goto L6f
        Lba:
            int r4 = r4 + 1
            goto L6f
        Lbd:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "duplicate option: "
            r11.<init>(r0)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
        Ld5:
            r0 = r3
            goto L60
        Ld7:
            q6.g r5 = new q6.g
            r5.<init>()
            r8 = 0
            int r9 = r7.size()
            r3 = 0
            r6 = 0
            J(r3, r5, r6, r7, r8, r9, r10)
            long r0 = r5.f16063r
            r3 = 4
            long r3 = (long) r3
            long r0 = r0 / r3
            int r0 = (int) r0
            int[] r1 = new int[r0]
        Lef:
            if (r2 >= r0) goto Lfa
            int r3 = r5.readInt()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lef
        Lfa:
            q6.w r0 = new q6.w
            int r2 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r2)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.m.d(r11, r2)
            q6.j[] r11 = (q6.C1541j[]) r11
            r0.<init>(r11, r1)
            return r0
        L10c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the empty byte string is not a supported option"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.I1.y0(q6.j[]):q6.w");
    }

    /* JADX DEBUG: Class process forced to load method for inline: J5.m.S0(java.lang.CharSequence, java.lang.String, int, int):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long z0(int r14, java.lang.String r15) {
        /*
            r0 = 0
            int r1 = S(r0, r14, r15, r0)
            java.util.regex.Pattern r2 = d6.j.f12348m
            java.util.regex.Matcher r2 = r2.matcher(r15)
            r3 = -1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L12:
            r10 = 2
            r11 = 1
            if (r1 >= r14) goto Lc7
            int r12 = r1 + 1
            int r12 = S(r12, r14, r15, r11)
            r2.region(r1, r12)
            java.lang.String r1 = "matcher.group(1)"
            if (r5 != r3) goto L56
            java.util.regex.Pattern r13 = d6.j.f12348m
            java.util.regex.Matcher r13 = r2.usePattern(r13)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L56
            java.lang.String r5 = r2.group(r11)
            kotlin.jvm.internal.m.d(r5, r1)
            int r5 = java.lang.Integer.parseInt(r5)
            java.lang.String r1 = r2.group(r10)
            java.lang.String r8 = "matcher.group(2)"
            kotlin.jvm.internal.m.d(r1, r8)
            int r8 = java.lang.Integer.parseInt(r1)
            r1 = 3
            java.lang.String r1 = r2.group(r1)
            java.lang.String r9 = "matcher.group(3)"
            kotlin.jvm.internal.m.d(r1, r9)
            int r9 = java.lang.Integer.parseInt(r1)
            goto Lbf
        L56:
            if (r6 != r3) goto L70
            java.util.regex.Pattern r10 = d6.j.f12347l
            java.util.regex.Matcher r10 = r2.usePattern(r10)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L70
            java.lang.String r6 = r2.group(r11)
            kotlin.jvm.internal.m.d(r6, r1)
            int r6 = java.lang.Integer.parseInt(r6)
            goto Lbf
        L70:
            if (r7 != r3) goto La6
            java.util.regex.Pattern r10 = d6.j.f12346k
            java.util.regex.Matcher r13 = r2.usePattern(r10)
            boolean r13 = r13.matches()
            if (r13 == 0) goto La6
            java.lang.String r7 = r2.group(r11)
            kotlin.jvm.internal.m.d(r7, r1)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r11 = "US"
            kotlin.jvm.internal.m.d(r1, r11)
            java.lang.String r1 = r7.toLowerCase(r1)
            java.lang.String r7 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.m.d(r1, r7)
            java.lang.String r7 = r10.pattern()
            java.lang.String r10 = "MONTH_PATTERN.pattern()"
            kotlin.jvm.internal.m.d(r7, r10)
            r10 = 6
            int r1 = J5.m.S0(r7, r1, r0, r10)
            int r7 = r1 / 4
            goto Lbf
        La6:
            if (r4 != r3) goto Lbf
            java.util.regex.Pattern r10 = d6.j.j
            java.util.regex.Matcher r10 = r2.usePattern(r10)
            boolean r10 = r10.matches()
            if (r10 == 0) goto Lbf
            java.lang.String r4 = r2.group(r11)
            kotlin.jvm.internal.m.d(r4, r1)
            int r4 = java.lang.Integer.parseInt(r4)
        Lbf:
            int r12 = r12 + 1
            int r1 = S(r12, r14, r15, r0)
            goto L12
        Lc7:
            r14 = 70
            if (r14 > r4) goto Ld1
            r15 = 100
            if (r4 >= r15) goto Ld1
            int r4 = r4 + 1900
        Ld1:
            if (r4 < 0) goto Ld7
            if (r4 >= r14) goto Ld7
            int r4 = r4 + 2000
        Ld7:
            r14 = 1601(0x641, float:2.243E-42)
            java.lang.String r15 = "Failed requirement."
            if (r4 < r14) goto L141
            if (r7 == r3) goto L13b
            if (r11 > r6) goto L135
            r14 = 32
            if (r6 >= r14) goto L135
            if (r5 < 0) goto L12f
            r14 = 24
            if (r5 >= r14) goto L12f
            if (r8 < 0) goto L129
            r14 = 60
            if (r8 >= r14) goto L129
            if (r9 < 0) goto L123
            if (r9 >= r14) goto L123
            java.util.GregorianCalendar r14 = new java.util.GregorianCalendar
            java.util.TimeZone r15 = e6.b.f12676d
            r14.<init>(r15)
            r14.setLenient(r0)
            r14.set(r11, r4)
            int r7 = r7 - r11
            r14.set(r10, r7)
            r15 = 5
            r14.set(r15, r6)
            r15 = 11
            r14.set(r15, r5)
            r15 = 12
            r14.set(r15, r8)
            r15 = 13
            r14.set(r15, r9)
            r15 = 14
            r14.set(r15, r0)
            long r14 = r14.getTimeInMillis()
            return r14
        L123:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r15)
            throw r14
        L129:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r15)
            throw r14
        L12f:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r15)
            throw r14
        L135:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r15)
            throw r14
        L13b:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r15)
            throw r14
        L141:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.I1.z0(int, java.lang.String):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public long A(Z5.S descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return d();
    }

    public abstract Object A0(Intent intent, int i);

    public abstract void B0(b.C c7, b.C c8, Window window, View view, boolean z5, boolean z6);

    public abstract boolean C0(View view, float f);

    public abstract void H0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i7);

    public abstract int K(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float L(int i);

    public abstract boolean O(A0.h hVar);

    public abstract Intent P(AbstractActivityC1106h abstractActivityC1106h, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void T() {
        throw new V5.d(kotlin.jvm.internal.z.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract Object X(A0.h hVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public Y5.a a(X5.f descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object b(X5.f descriptor, int i, V5.a deserializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        return p(deserializer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public boolean c(X5.f descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return e();
    }

    @Override // Y5.b
    public abstract long d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public boolean e() {
        T();
        throw null;
    }

    public abstract int e0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public boolean f() {
        return true;
    }

    public abstract int f0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public short g(Z5.S descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return v();
    }

    public abstract int g0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public char h() {
        T();
        throw null;
    }

    public abstract int h0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        switch (this.f10646a) {
            case 12:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public Object i(X5.f descriptor, int i, V5.a deserializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        if (deserializer.b().g() || f()) {
            return p(deserializer);
        }
        return null;
    }

    public abstract int i0(View view);

    public abstract int j0(CoordinatorLayout coordinatorLayout);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public float k(Z5.S descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(X5.f descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public Y5.b m(X5.f descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return this;
    }

    public abstract int m0();

    @Override // Y5.b
    public abstract int n();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k3.d n0(AbstractActivityC1106h abstractActivityC1106h, Object obj) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public int o(X5.f descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public Object p(V5.a deserializer) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        return deserializer.c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public Y5.b r(Z5.S descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return m(descriptor.i(i));
    }

    public abstract boolean r0(float f);

    @Override // Y5.b
    public abstract byte s();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public byte t(Z5.S descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return s();
    }

    public abstract boolean t0(View view);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f10646a) {
            case 12:
                String strC = kotlin.jvm.internal.z.a(getClass()).c();
                kotlin.jvm.internal.m.b(strC);
                return strC;
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public double u(Z5.S descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return z();
    }

    public abstract boolean u0(float f, float f7);

    @Override // Y5.b
    public abstract short v();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public String w() {
        T();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public float x() {
        T();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public char y(Z5.S descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.b
    public double z() {
        T();
        throw null;
    }

    public void G(Window window) {
    }
}
