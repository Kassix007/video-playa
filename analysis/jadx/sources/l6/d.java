package l6;

import A.J;
import E.c0;
import J5.t;
import O5.p;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.S;
import P.W;
import R4.C0468k1;
import T1.r;
import T1.s;
import T1.u;
import Z4.L;
import android.content.Context;
import android.content.Intent;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.StrictMode;
import android.os.UserManager;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.k0;
import androidx.room.w;
import b.B;
import b.C0683A;
import c.AbstractC0707e;
import c.C0703a;
import c.C0704b;
import c0.C0714b;
import c0.C0717e;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.wnapp.smspariaz.R;
import e5.C1056a;
import i0.C1132d;
import j2.InterfaceC1160f;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.z;
import m5.C1386y;
import w1.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements P {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final Cursor B(w db, InterfaceC1160f sqLiteQuery, boolean z5) {
        kotlin.jvm.internal.m.e(db, "db");
        kotlin.jvm.internal.m.e(sqLiteQuery, "sqLiteQuery");
        Cursor c7 = db.query(sqLiteQuery, (CancellationSignal) null);
        if (z5 && (c7 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c7;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                kotlin.jvm.internal.m.e(c7, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c7.getColumnNames(), c7.getCount());
                    while (c7.moveToNext()) {
                        Object[] objArr = new Object[c7.getColumnCount()];
                        int columnCount = c7.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = c7.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(c7.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(c7.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = c7.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = c7.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    c7.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long E(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object F(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int G(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long H(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(boolean z5, B5.a aVar, C0371o c0371o, int i) {
        c0371o.U(-361453782);
        if (((i | 6 | (c0371o.i(aVar) ? 32 : 16)) & 19) == 18 && c0371o.x()) {
            c0371o.N();
        } else {
            W wT = C0345b.t(aVar, c0371o);
            Object objH = c0371o.H();
            S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = new C0704b(wT);
                c0371o.d0(objH);
            }
            C0704b c0704b = (C0704b) objH;
            Object objH2 = c0371o.H();
            if (objH2 == s6) {
                objH2 = new A0.d(19, c0704b);
                c0371o.d0(objH2);
            }
            C0345b.g((B5.a) objH2, c0371o);
            B bA = AbstractC0707e.a(c0371o);
            if (bA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C0683A c0683aA = bA.a();
            InterfaceC0660x interfaceC0660x = (InterfaceC0660x) c0371o.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zI = c0371o.i(c0683aA) | c0371o.i(interfaceC0660x);
            Object objH3 = c0371o.H();
            if (zI || objH3 == s6) {
                objH3 = new J(c0683aA, interfaceC0660x, c0704b, 6);
                c0371o.d0(objH3);
            }
            C0345b.d(interfaceC0660x, c0683aA, (B5.c) objH3, c0371o);
            z5 = true;
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0703a(z5, aVar, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static O5.e e(int i, O5.a aVar, int i7) {
        if ((i7 & 1) != 0) {
            i = 0;
        }
        int i8 = i7 & 2;
        O5.a aVar2 = O5.a.f5206q;
        if (i8 != 0) {
            aVar = aVar2;
        }
        if (i == -2) {
            if (aVar != aVar2) {
                return new p(1, aVar);
            }
            O5.i.f5248b.getClass();
            return new O5.e(O5.h.f5247b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == aVar2 ? new O5.e(i) : new p(i, aVar) : new O5.e(Integer.MAX_VALUE) : aVar == aVar2 ? new O5.e(0) : new p(1, aVar);
        }
        if (aVar == aVar2) {
            return new p(1, O5.a.f5207r);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:250:0x04dd */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:305:0x063b */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x069e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final T1.u r37, final T1.r r38, final c0.InterfaceC0725m r39, final c0.C0717e r40, final B5.c r41, final B5.c r42, final B5.c r43, final B5.c r44, P.C0371o r45, final int r46) {
        /*
            r1 = r37
            r2 = r38
            r7 = r43
            r8 = r44
            r6 = r45
            r9 = r46
            r0 = -1964664536(0xffffffff8ae59928, float:-2.2109509E-32)
            r6.U(r0)
            r0 = r9 & 6
            if (r0 != 0) goto L21
            boolean r0 = r6.i(r1)
            if (r0 == 0) goto L1e
            r0 = 4
            goto L1f
        L1e:
            r0 = 2
        L1f:
            r0 = r0 | r9
            goto L22
        L21:
            r0 = r9
        L22:
            r3 = r9 & 48
            if (r3 != 0) goto L32
            boolean r3 = r6.i(r2)
            if (r3 == 0) goto L2f
            r3 = 32
            goto L31
        L2f:
            r3 = 16
        L31:
            r0 = r0 | r3
        L32:
            r3 = r9 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L45
            r3 = r39
            boolean r5 = r6.g(r3)
            if (r5 == 0) goto L41
            r5 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r5 = 128(0x80, float:1.794E-43)
        L43:
            r0 = r0 | r5
            goto L47
        L45:
            r3 = r39
        L47:
            r5 = r9 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L5a
            r5 = r40
            boolean r11 = r6.g(r5)
            if (r11 == 0) goto L56
            r11 = 2048(0x800, float:2.87E-42)
            goto L58
        L56:
            r11 = 1024(0x400, float:1.435E-42)
        L58:
            r0 = r0 | r11
            goto L5c
        L5a:
            r5 = r40
        L5c:
            r11 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L6f
            r11 = r41
            boolean r13 = r6.i(r11)
            if (r13 == 0) goto L6b
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L6d
        L6b:
            r13 = 8192(0x2000, float:1.14794E-41)
        L6d:
            r0 = r0 | r13
            goto L71
        L6f:
            r11 = r41
        L71:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r9
            if (r13 != 0) goto L85
            r13 = r42
            boolean r15 = r6.i(r13)
            if (r15 == 0) goto L81
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L83
        L81:
            r15 = 65536(0x10000, float:9.18355E-41)
        L83:
            r0 = r0 | r15
            goto L87
        L85:
            r13 = r42
        L87:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r16 = r9 & r15
            r17 = r15
            if (r16 != 0) goto L9c
            boolean r16 = r6.i(r7)
            if (r16 == 0) goto L98
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L9a
        L98:
            r16 = 524288(0x80000, float:7.34684E-40)
        L9a:
            r0 = r0 | r16
        L9c:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r9 & r16
            if (r18 != 0) goto Laf
            boolean r18 = r6.i(r8)
            if (r18 == 0) goto Lab
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto Lad
        Lab:
            r18 = 4194304(0x400000, float:5.877472E-39)
        Lad:
            r0 = r0 | r18
        Laf:
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r9 & r18
            r14 = 0
            if (r18 != 0) goto Lc3
            boolean r18 = r6.i(r14)
            if (r18 == 0) goto Lbf
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc1
        Lbf:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        Lc1:
            r0 = r0 | r18
        Lc3:
            r10 = r0
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r0 & r10
            r12 = 38347922(0x2492492, float:1.4777643E-37)
            if (r0 != r12) goto Lda
            boolean r0 = r6.x()
            if (r0 != 0) goto Ld4
            goto Lda
        Ld4:
            r6.N()
            r15 = r6
            goto Lb4d
        Lda:
            r6.P()
            r0 = r9 & 1
            if (r0 == 0) goto Leb
            boolean r0 = r6.w()
            if (r0 == 0) goto Le8
            goto Leb
        Le8:
            r6.N()
        Leb:
            r6.q()
            P.l0 r0 = N1.a.f4029a
            java.lang.Object r0 = r6.k(r0)
            r12 = r0
            androidx.lifecycle.x r12 = (androidx.lifecycle.InterfaceC0660x) r12
            androidx.lifecycle.l0 r0 = Q1.a.a(r6)
            if (r0 == 0) goto Lb76
            androidx.lifecycle.k0 r0 = r0.f()
            r1.getClass()
            W1.j r5 = r1.f7418b
            java.lang.String r15 = "viewModelStore"
            kotlin.jvm.internal.m.e(r0, r15)
            r5.getClass()
            T1.i r15 = r5.f8077o
            T1.i r4 = p(r0)
            boolean r4 = kotlin.jvm.internal.m.a(r15, r4)
            if (r4 == 0) goto L11b
            goto L129
        L11b:
            n5.j r4 = r5.f
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lb6e
            T1.i r0 = p(r0)
            r5.f8077o = r0
        L129:
            java.lang.String r0 = "graph"
            kotlin.jvm.internal.m.e(r2, r0)
            java.util.LinkedHashMap r0 = r5.f8082t
            D.u r4 = r2.f7413v
            n5.j r15 = r5.f
            boolean r20 = r15.isEmpty()
            if (r20 != 0) goto L14b
            androidx.lifecycle.p r14 = r5.h()
            androidx.lifecycle.p r1 = androidx.lifecycle.EnumC0653p.f9556q
            if (r14 == r1) goto L143
            goto L14b
        L143:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController."
            r0.<init>(r1)
            throw r0
        L14b:
            T1.r r1 = r5.f8068c
            boolean r1 = kotlin.jvm.internal.m.a(r1, r2)
            if (r1 != 0) goto L6b7
            T1.r r1 = r5.f8068c
            if (r1 == 0) goto L208
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.LinkedHashMap r4 = r5.f8074l
            java.util.Set r4 = r4.keySet()
            java.util.Collection r4 = (java.util.Collection) r4
            r14.<init>(r4)
            int r4 = r14.size()
            r3 = 0
        L169:
            if (r3 >= r4) goto L1ff
            java.lang.Object r21 = r14.get(r3)
            int r3 = r3 + 1
            java.lang.Integer r21 = (java.lang.Integer) r21
            kotlin.jvm.internal.m.b(r21)
            r29 = r3
            int r3 = r21.intValue()
            java.util.Collection r21 = r0.values()
            java.lang.Iterable r21 = (java.lang.Iterable) r21
            java.util.Iterator r21 = r21.iterator()
        L186:
            boolean r22 = r21.hasNext()
            if (r22 == 0) goto L19e
            java.lang.Object r22 = r21.next()
            r30 = r4
            r4 = r22
            T1.h r4 = (T1.h) r4
            r7 = 1
            r4.f7370d = r7
            r7 = r43
            r4 = r30
            goto L186
        L19e:
            r30 = r4
            r7 = 1
            M.t r4 = new M.t
            r4.<init>()
            r7 = -1
            r4.f3616a = r7
            r4.f3617b = r7
            T1.w r21 = new T1.w
            int r7 = r4.f3616a
            int r4 = r4.f3617b
            r22 = 0
            r24 = -1
            r25 = 0
            r26 = 0
            r28 = r4
            r27 = r7
            r23 = 1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r4 = r21
            r7 = 0
            boolean r4 = r5.p(r3, r7, r4)
            java.util.Collection r7 = r0.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L1d3:
            boolean r21 = r7.hasNext()
            if (r21 == 0) goto L1ed
            java.lang.Object r21 = r7.next()
            r22 = r4
            r4 = r21
            T1.h r4 = (T1.h) r4
            r21 = r7
            r7 = 0
            r4.f7370d = r7
            r7 = r21
            r4 = r22
            goto L1d3
        L1ed:
            r22 = r4
            r7 = 0
            r4 = 1
            if (r22 == 0) goto L1f7
            boolean r3 = r5.l(r3, r4, r7)
        L1f7:
            r7 = r43
            r3 = r29
            r4 = r30
            goto L169
        L1ff:
            r4 = 1
            r7 = 0
            W1.l r1 = r1.f7404r
            int r1 = r1.f8091a
            r5.l(r1, r4, r7)
        L208:
            r5.f8068c = r2
            T1.A r1 = r5.f8081s
            T1.u r3 = r5.f8066a
            C3.b r4 = r3.f7419c
            android.os.Bundle r7 = r5.f8069d
            if (r7 == 0) goto L24a
            java.lang.String r14 = "android-support-nav:controller:navigatorState:names"
            boolean r21 = r7.containsKey(r14)
            if (r21 == 0) goto L24a
            java.util.ArrayList r8 = r7.getStringArrayList(r14)
            if (r8 == 0) goto L244
            int r14 = r8.size()
            r9 = 0
        L227:
            if (r9 >= r14) goto L24a
            java.lang.Object r21 = r8.get(r9)
            int r9 = r9 + 1
            r22 = r8
            r8 = r21
            java.lang.String r8 = (java.lang.String) r8
            r1.b(r8)
            boolean r21 = r7.containsKey(r8)
            if (r21 == 0) goto L241
            com.google.android.gms.internal.measurement.I1.k0(r8, r7)
        L241:
            r8 = r22
            goto L227
        L244:
            com.google.android.gms.internal.measurement.K1.x(r14)
            r20 = 0
            throw r20
        L24a:
            android.os.Bundle[] r7 = r5.f8070e
            java.lang.String r8 = " cannot be found from the current destination "
            if (r7 == 0) goto L339
            int r9 = r7.length
            r14 = 0
        L252:
            if (r14 >= r9) goto L331
            r21 = r7
            r7 = r21[r14]
            r22 = r9
            java.lang.String r9 = "state"
            kotlin.jvm.internal.m.e(r7, r9)
            java.lang.Class<T1.e> r9 = T1.e.class
            java.lang.ClassLoader r9 = r9.getClassLoader()
            r7.setClassLoader(r9)
            java.lang.String r9 = "nav-entry-state:id"
            java.lang.String r35 = r7.getString(r9)
            if (r35 == 0) goto L32c
            java.lang.String r9 = "nav-entry-state:destination-id"
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r13 = r7.getInt(r9, r11)
            if (r13 != r11) goto L28c
            r11 = 2147483647(0x7fffffff, float:NaN)
            r24 = r14
            int r14 = r7.getInt(r9, r11)
            if (r14 == r11) goto L287
        L285:
            r9 = 0
            goto L28f
        L287:
            com.google.android.gms.internal.measurement.K1.x(r9)
            r9 = 0
            throw r9
        L28c:
            r24 = r14
            goto L285
        L28f:
            java.lang.String r11 = "nav-entry-state:args"
            android.os.Bundle r11 = com.google.android.gms.internal.measurement.I1.k0(r11, r7)
            java.lang.String r14 = "nav-entry-state:saved-state"
            android.os.Bundle r36 = com.google.android.gms.internal.measurement.I1.k0(r14, r7)
            T1.p r31 = r5.c(r13, r9)
            if (r31 == 0) goto L308
            androidx.lifecycle.p r7 = r5.h()
            T1.i r9 = r5.f8077o
            java.lang.String r13 = "context"
            kotlin.jvm.internal.m.e(r4, r13)
            java.lang.String r13 = "hostLifecycleState"
            kotlin.jvm.internal.m.e(r7, r13)
            android.content.Context r13 = r4.f1185a
            if (r13 == 0) goto L2ba
            java.lang.ClassLoader r13 = r13.getClassLoader()
            goto L2bb
        L2ba:
            r13 = 0
        L2bb:
            r11.setClassLoader(r13)
            T1.d r29 = new T1.d
            r30 = r4
            r33 = r7
            r34 = r9
            r32 = r11
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r9 = r29
            r7 = r31
            java.lang.String r7 = r7.f7403q
            T1.z r7 = r1.b(r7)
            java.lang.Object r11 = r0.get(r7)
            if (r11 != 0) goto L2e3
            T1.h r11 = new T1.h
            r11.<init>(r3, r7)
            r0.put(r7, r11)
        L2e3:
            T1.h r11 = (T1.h) r11
            r15.addLast(r9)
            r11.a(r9)
            T1.p r7 = r9.f7354r
            T1.r r7 = r7.f7405s
            if (r7 == 0) goto L2fc
            W1.l r7 = r7.f7404r
            int r7 = r7.f8091a
            T1.d r7 = r5.e(r7)
            r5.j(r9, r7)
        L2fc:
            int r14 = r24 + 1
            r11 = r41
            r13 = r42
            r7 = r21
            r9 = r22
            goto L252
        L308:
            int r0 = T1.p.f7402u
            java.lang.String r0 = n5.AbstractC1397A.s(r4, r13)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Restoring the Navigation back stack failed: destination "
            r2.<init>(r3)
            r2.append(r0)
            r2.append(r8)
            T1.p r0 = r5.f()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L32c:
            com.google.android.gms.internal.measurement.K1.x(r9)
            r7 = 0
            throw r7
        L331:
            r7 = 0
            T1.f r9 = r5.f8067b
            r9.invoke()
            r5.f8070e = r7
        L339:
            java.util.LinkedHashMap r1 = r1.f7351a
            java.util.Map r1 = n5.x.O(r1)
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L34e:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L363
            java.lang.Object r9 = r1.next()
            r11 = r9
            T1.z r11 = (T1.z) r11
            boolean r11 = r11.f7434b
            if (r11 != 0) goto L34e
            r7.add(r9)
            goto L34e
        L363:
            int r1 = r7.size()
            r9 = 0
        L368:
            if (r9 >= r1) goto L390
            java.lang.Object r11 = r7.get(r9)
            int r9 = r9 + 1
            T1.z r11 = (T1.z) r11
            java.lang.Object r13 = r0.get(r11)
            if (r13 != 0) goto L385
            java.lang.String r13 = "navigator"
            kotlin.jvm.internal.m.e(r11, r13)
            T1.h r13 = new T1.h
            r13.<init>(r3, r11)
            r0.put(r11, r13)
        L385:
            T1.h r13 = (T1.h) r13
            r11.getClass()
            r11.f7433a = r13
            r13 = 1
            r11.f7434b = r13
            goto L368
        L390:
            T1.r r0 = r5.f8068c
            if (r0 == 0) goto L6ac
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L6ac
            android.app.Activity r1 = r3.f7420d
            boolean r0 = r3.f7421e
            if (r0 != 0) goto L69e
            if (r1 == 0) goto L69e
            android.content.Intent r7 = r1.getIntent()
            W1.j r9 = r3.f7418b
            if (r7 != 0) goto L3ac
            goto L69e
        L3ac:
            android.os.Bundle r11 = r7.getExtras()
            java.lang.String r13 = "NavController"
            if (r11 == 0) goto L3cd
            java.lang.String r0 = "android-support-nav:controller:deepLinkIds"
            int[] r0 = r11.getIntArray(r0)     // Catch: java.lang.Exception -> L3bb
            goto L3ce
        L3bb:
            r0 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "handleDeepLink() could not extract deepLink from "
            r14.<init>(r15)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            android.util.Log.e(r13, r14, r0)
        L3cd:
            r0 = 0
        L3ce:
            if (r11 == 0) goto L3da
            java.lang.String r14 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r14 = r11.getParcelableArrayList(r14)
            r21 = r14
        L3d8:
            r15 = 0
            goto L3dd
        L3da:
            r21 = 0
            goto L3d8
        L3dd:
            m5.j[] r14 = new m5.C1371j[r15]
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            m5.j[] r14 = (m5.C1371j[]) r14
            android.os.Bundle r14 = com.google.android.gms.internal.measurement.P1.g(r14)
            if (r11 == 0) goto L3f2
            java.lang.String r15 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r11 = r11.getBundle(r15)
            goto L3f3
        L3f2:
            r11 = 0
        L3f3:
            if (r11 == 0) goto L3f8
            r14.putAll(r11)
        L3f8:
            if (r0 == 0) goto L406
            int r11 = r0.length
            if (r11 != 0) goto L3fe
            goto L406
        L3fe:
            r22 = r0
            r24 = r10
            r25 = r12
            goto L492
        L406:
            T1.r r11 = r9.i()
            B0.G0 r15 = new B0.G0
            r22 = r0
            android.net.Uri r0 = r7.getData()
            r24 = r10
            java.lang.String r10 = r7.getAction()
            r25 = r12
            java.lang.String r12 = r7.getType()
            r6 = 16
            r15.<init>(r0, r10, r12, r6)
            T1.o r0 = r11.i(r15, r11)
            if (r0 == 0) goto L492
            T1.p r6 = r0.f7397q
            n5.j r10 = new n5.j
            r10.<init>()
            r11 = r6
        L431:
            W1.l r12 = r11.f7404r
            T1.r r15 = r11.f7405s
            if (r15 == 0) goto L442
            D.u r2 = r15.f7413v
            int r2 = r2.f1289b
            int r12 = r12.f8091a
            if (r2 == r12) goto L440
            goto L442
        L440:
            r2 = 0
            goto L446
        L442:
            r10.addFirst(r11)
            goto L440
        L446:
            boolean r11 = kotlin.jvm.internal.m.a(r15, r2)
            if (r11 == 0) goto L44d
            goto L44f
        L44d:
            if (r15 != 0) goto L48e
        L44f:
            java.util.List r2 = n5.l.B0(r10)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = n5.m.c0(r2, r11)
            r10.<init>(r11)
            java.util.Iterator r2 = r2.iterator()
        L464:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L47c
            java.lang.Object r11 = r2.next()
            T1.p r11 = (T1.p) r11
            W1.l r11 = r11.f7404r
            int r11 = r11.f8091a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.add(r11)
            goto L464
        L47c:
            int[] r2 = n5.l.A0(r10)
            android.os.Bundle r0 = r0.f7398r
            android.os.Bundle r0 = r6.d(r0)
            if (r0 == 0) goto L48b
            r14.putAll(r0)
        L48b:
            r0 = r2
            r2 = 0
            goto L496
        L48e:
            r2 = r38
            r11 = r15
            goto L431
        L492:
            r2 = r21
            r0 = r22
        L496:
            if (r0 == 0) goto L6a2
            int r6 = r0.length
            if (r6 != 0) goto L49d
            goto L6a2
        L49d:
            r9.getClass()
            T1.r r6 = r9.f8068c
            int r10 = r0.length
            r11 = 0
        L4a4:
            if (r11 >= r10) goto L4fa
            r12 = r0[r11]
            if (r11 != 0) goto L4ba
            T1.r r15 = r9.f8068c
            kotlin.jvm.internal.m.b(r15)
            W1.l r15 = r15.f7404r
            int r15 = r15.f8091a
            if (r15 != r12) goto L4b8
            T1.r r15 = r9.f8068c
            goto L4c3
        L4b8:
            r15 = 0
            goto L4c3
        L4ba:
            kotlin.jvm.internal.m.b(r6)
            D.u r15 = r6.f7413v
            T1.p r15 = r15.n(r12)
        L4c3:
            if (r15 != 0) goto L4d0
            int r6 = T1.p.f7402u
            T1.u r6 = r9.f8066a
            C3.b r6 = r6.f7419c
            java.lang.String r6 = n5.AbstractC1397A.s(r6, r12)
            goto L4fb
        L4d0:
            int r12 = r0.length
            r23 = 1
            int r12 = r12 + (-1)
            if (r11 == r12) goto L4f7
            boolean r12 = r15 instanceof T1.r
            if (r12 == 0) goto L4f7
            T1.r r15 = (T1.r) r15
        L4dd:
            kotlin.jvm.internal.m.b(r15)
            D.u r6 = r15.f7413v
            int r12 = r6.f1289b
            T1.p r12 = r6.n(r12)
            boolean r12 = r12 instanceof T1.r
            if (r12 == 0) goto L4f6
            int r12 = r6.f1289b
            T1.p r6 = r6.n(r12)
            r15 = r6
            T1.r r15 = (T1.r) r15
            goto L4dd
        L4f6:
            r6 = r15
        L4f7:
            int r11 = r11 + 1
            goto L4a4
        L4fa:
            r6 = 0
        L4fb:
            if (r6 == 0) goto L51d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find destination "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = " in the navigation graph, ignoring the deep link from "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "message"
            kotlin.jvm.internal.m.e(r0, r1)
            android.util.Log.i(r13, r0)
            goto L6a2
        L51d:
            java.lang.String r6 = "android-support-nav:controller:deepLinkIntent"
            r14.putParcelable(r6, r7)
            int r6 = r0.length
            android.os.Bundle[] r10 = new android.os.Bundle[r6]
            r11 = 0
        L526:
            if (r11 >= r6) goto L54a
            r15 = 0
            m5.j[] r12 = new m5.C1371j[r15]
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r15)
            m5.j[] r12 = (m5.C1371j[]) r12
            android.os.Bundle r12 = com.google.android.gms.internal.measurement.P1.g(r12)
            r12.putAll(r14)
            if (r2 == 0) goto L545
            java.lang.Object r13 = r2.get(r11)
            android.os.Bundle r13 = (android.os.Bundle) r13
            if (r13 == 0) goto L545
            r12.putAll(r13)
        L545:
            r10[r11] = r12
            int r11 = r11 + 1
            goto L526
        L54a:
            int r2 = r7.getFlags()
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r6 = r6 & r2
            if (r6 == 0) goto L589
            r11 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r11
            if (r2 != 0) goto L589
            r7.addFlags(r11)
            android.content.Context r0 = r3.f7417a
            k1.o r2 = new k1.o
            r2.<init>(r0)
            android.content.ComponentName r0 = r7.getComponent()
            if (r0 != 0) goto L573
            android.content.Context r0 = r2.f14085r
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r0 = r7.resolveActivity(r0)
        L573:
            if (r0 == 0) goto L578
            r2.d(r0)
        L578:
            java.util.ArrayList r0 = r2.f14084q
            r0.add(r7)
            r2.g()
            r1.finish()
            r15 = 0
            r1.overridePendingTransition(r15, r15)
            goto L6b3
        L589:
            if (r6 == 0) goto L58d
            r1 = 1
            goto L58e
        L58d:
            r1 = 0
        L58e:
            java.lang.String r2 = "Deep Linking failed: destination "
            if (r1 == 0) goto L614
            n5.j r1 = r9.f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5a8
            T1.r r1 = r9.f8068c
            kotlin.jvm.internal.m.b(r1)
            W1.l r1 = r1.f7404r
            int r1 = r1.f8091a
            r7 = 1
            r15 = 0
            r9.l(r1, r7, r15)
        L5a8:
            r1 = 0
        L5a9:
            int r6 = r0.length
            if (r1 >= r6) goto L60f
            r6 = r0[r1]
            int r7 = r1 + 1
            r1 = r10[r1]
            r11 = 0
            T1.p r12 = r9.c(r6, r11)
            if (r12 == 0) goto L5ed
            N5.d r6 = new N5.d
            r11 = 3
            r6.<init>(r11, r12, r3)
            T1.x r11 = new T1.x
            r11.<init>()
            r6.invoke(r11)
            boolean r6 = r11.f7430b
            int r13 = r11.f7431c
            boolean r14 = r11.f7432d
            T1.w r29 = new T1.w
            M.t r11 = r11.f7429a
            int r15 = r11.f3616a
            int r11 = r11.f3617b
            r31 = 0
            r33 = 0
            r30 = r6
            r36 = r11
            r32 = r13
            r34 = r14
            r35 = r15
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r6 = r29
            r9.k(r12, r1, r6)
            r1 = r7
            goto L5a9
        L5ed:
            int r0 = T1.p.f7402u
            java.lang.String r0 = n5.AbstractC1397A.s(r4, r6)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            r3.append(r8)
            T1.p r0 = r9.f()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L60f:
            r7 = 1
            r3.f7421e = r7
            goto L6b3
        L614:
            T1.r r1 = r9.f8068c
            int r6 = r0.length
            r7 = 0
        L618:
            if (r7 >= r6) goto L69a
            r8 = r0[r7]
            r11 = r10[r7]
            if (r7 != 0) goto L623
            T1.r r12 = r9.f8068c
            goto L62c
        L623:
            kotlin.jvm.internal.m.b(r1)
            D.u r12 = r1.f7413v
            T1.p r12 = r12.n(r8)
        L62c:
            if (r12 == 0) goto L67a
            int r8 = r0.length
            r23 = 1
            int r8 = r8 + (-1)
            if (r7 == r8) goto L656
            boolean r8 = r12 instanceof T1.r
            if (r8 == 0) goto L677
            T1.r r12 = (T1.r) r12
        L63b:
            kotlin.jvm.internal.m.b(r12)
            D.u r1 = r12.f7413v
            int r8 = r1.f1289b
            T1.p r8 = r1.n(r8)
            boolean r8 = r8 instanceof T1.r
            if (r8 == 0) goto L654
            int r8 = r1.f1289b
            T1.p r1 = r1.n(r8)
            r12 = r1
            T1.r r12 = (T1.r) r12
            goto L63b
        L654:
            r1 = r12
            goto L677
        L656:
            T1.r r8 = r9.f8068c
            kotlin.jvm.internal.m.b(r8)
            W1.l r8 = r8.f7404r
            int r8 = r8.f8091a
            T1.w r29 = new T1.w
            r30 = 0
            r31 = 0
            r33 = 1
            r34 = 0
            r35 = 0
            r36 = 0
            r32 = r8
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r8 = r29
            r9.k(r12, r11, r8)
        L677:
            int r7 = r7 + 1
            goto L618
        L67a:
            int r0 = T1.p.f7402u
            java.lang.String r0 = n5.AbstractC1397A.s(r4, r8)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = " cannot be found in graph "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L69a:
            r7 = 1
            r3.f7421e = r7
            goto L6b3
        L69e:
            r24 = r10
            r25 = r12
        L6a2:
            T1.r r0 = r5.f8068c
            kotlin.jvm.internal.m.b(r0)
            r7 = 0
            r5.k(r0, r7, r7)
            goto L6b3
        L6ac:
            r24 = r10
            r25 = r12
            r5.b()
        L6b3:
            r6 = r38
            goto L772
        L6b7:
            r24 = r10
            r25 = r12
            java.lang.Object r0 = r4.f1291d
            r.S r0 = (r.S) r0
            int r0 = r0.f()
            r1 = 0
        L6c4:
            if (r1 >= r0) goto L704
            java.lang.Object r2 = r4.f1291d
            r.S r2 = (r.S) r2
            java.lang.Object r2 = r2.g(r1)
            T1.p r2 = (T1.p) r2
            T1.r r3 = r5.f8068c
            kotlin.jvm.internal.m.b(r3)
            D.u r3 = r3.f7413v
            java.lang.Object r3 = r3.f1291d
            r.S r3 = (r.S) r3
            int r3 = r3.d(r1)
            T1.r r6 = r5.f8068c
            kotlin.jvm.internal.m.b(r6)
            D.u r6 = r6.f7413v
            java.lang.Object r6 = r6.f1291d
            r.S r6 = (r.S) r6
            boolean r7 = r6.f16167q
            if (r7 == 0) goto L6f1
            r.r.a(r6)
        L6f1:
            int[] r7 = r6.f16168r
            int r8 = r6.f16170t
            int r3 = s.AbstractC1585a.a(r8, r3, r7)
            if (r3 < 0) goto L701
            java.lang.Object[] r6 = r6.f16169s
            r7 = r6[r3]
            r6[r3] = r2
        L701:
            int r1 = r1 + 1
            goto L6c4
        L704:
            java.util.Iterator r0 = r15.iterator()
        L708:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6b3
            java.lang.Object r1 = r0.next()
            T1.d r1 = (T1.d) r1
            int r2 = T1.p.f7402u
            T1.p r2 = r1.f7354r
            I5.i r2 = n5.AbstractC1397A.u(r2)
            java.util.List r2 = I5.k.S(r2)
            n5.z r3 = new n5.z
            r3.<init>(r2)
            T1.r r2 = r5.f8068c
            kotlin.jvm.internal.m.b(r2)
            java.util.Iterator r3 = r3.iterator()
        L72e:
            r4 = r3
            a0.x r4 = (a0.x) r4
            java.lang.Object r4 = r4.f8711r
            java.util.ListIterator r4 = (java.util.ListIterator) r4
            boolean r6 = r4.hasPrevious()
            if (r6 == 0) goto L768
            java.lang.Object r4 = r4.previous()
            T1.p r4 = (T1.p) r4
            T1.r r6 = r5.f8068c
            boolean r6 = kotlin.jvm.internal.m.a(r4, r6)
            if (r6 == 0) goto L752
            r6 = r38
            boolean r7 = kotlin.jvm.internal.m.a(r2, r6)
            if (r7 == 0) goto L754
            goto L72e
        L752:
            r6 = r38
        L754:
            boolean r7 = r2 instanceof T1.r
            if (r7 == 0) goto L72e
            T1.r r2 = (T1.r) r2
            W1.l r4 = r4.f7404r
            int r4 = r4.f8091a
            D.u r2 = r2.f7413v
            T1.p r2 = r2.n(r4)
            kotlin.jvm.internal.m.b(r2)
            goto L72e
        L768:
            r6 = r38
            java.lang.String r3 = "<set-?>"
            kotlin.jvm.internal.m.e(r2, r3)
            r1.f7354r = r2
            goto L708
        L772:
            T1.A r0 = r5.f8081s
            java.lang.String r1 = "composable"
            T1.z r0 = r0.b(r1)
            boolean r1 = r0 instanceof U1.i
            if (r1 == 0) goto L782
            U1.i r0 = (U1.i) r0
            r1 = r0
            goto L783
        L782:
            r1 = 0
        L783:
            if (r1 != 0) goto L7a5
            P.o0 r11 = r45.r()
            if (r11 == 0) goto Lb6d
            U1.w r0 = new U1.w
            r10 = 2
            r1 = r37
            r3 = r39
            r4 = r40
            r5 = r41
            r7 = r43
            r8 = r44
            r9 = r46
            r2 = r6
            r6 = r42
            r0.<init>()
            r11.f5482d = r0
            return
        L7a5:
            r14 = r37
            r2 = r43
            r12 = r44
            T1.h r0 = r1.b()
            P5.D r0 = r0.f7371e
            r15 = r45
            P.W r8 = P.C0345b.j(r0, r15)
            java.lang.Object r0 = r15.H()
            P.S r13 = P.C0363k.f5418a
            if (r0 != r13) goto L7c8
            P.b0 r0 = new P.b0
            r3 = 0
            r0.<init>(r3)
            r15.d0(r0)
        L7c8:
            r9 = r0
            P.b0 r9 = (P.C0346b0) r9
            java.lang.Object r0 = r15.H()
            if (r0 != r13) goto L7da
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            P.f0 r0 = P.C0345b.q(r0)
            r15.d0(r0)
        L7da:
            r4 = r0
            P.W r4 = (P.W) r4
            java.lang.Object r0 = r8.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r3 = 1
            if (r0 <= r3) goto L7ec
            r0 = r3
            goto L7ed
        L7ec:
            r0 = 0
        L7ed:
            boolean r6 = r15.g(r8)
            boolean r7 = r15.i(r1)
            r6 = r6 | r7
            java.lang.Object r7 = r15.H()
            if (r6 != 0) goto L7fe
            if (r7 != r13) goto L80a
        L7fe:
            U1.x r6 = new U1.x
            r11 = 0
            r7 = r1
            r10 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r15.d0(r6)
            r7 = r6
        L80a:
            B5.e r7 = (B5.e) r7
            r6 = 0
            y4.AbstractC1918b.b(r0, r7, r15, r6)
            boolean r0 = r15.i(r14)
            r6 = r25
            boolean r7 = r15.i(r6)
            r0 = r0 | r7
            java.lang.Object r7 = r15.H()
            r10 = 5
            if (r0 != 0) goto L824
            if (r7 != r13) goto L82c
        L824:
            N5.d r7 = new N5.d
            r7.<init>(r10, r14, r6)
            r15.d0(r7)
        L82c:
            B5.c r7 = (B5.c) r7
            P.C0345b.c(r6, r7, r15)
            Z.f r32 = com.google.android.gms.internal.measurement.AbstractC0836n2.L(r15)
            P5.D r0 = r5.i
            P.W r0 = P.C0345b.j(r0, r15)
            java.lang.Object r6 = r15.H()
            if (r6 != r13) goto L84e
            I2.d r6 = new I2.d
            r7 = 7
            r6.<init>(r7, r0)
            P.C r6 = P.C0345b.m(r6)
            r15.d0(r6)
        L84e:
            P.S0 r6 = (P.S0) r6
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = n5.l.s0(r0)
            r7 = r0
            T1.d r7 = (T1.d) r7
            java.lang.Object r0 = r15.H()
            if (r0 != r13) goto L86d
            int r0 = r.K.f16157a
            r.A r0 = new r.A
            r0.<init>()
            r15.d0(r0)
        L86d:
            r11 = r0
            r.A r11 = (r.C1542A) r11
            if (r7 == 0) goto Lb0b
            r0 = -1797897130(0xffffffff94d64456, float:-2.1635432E-26)
            r15.S(r0)
            boolean r0 = r15.i(r1)
            r19 = 3670016(0x380000, float:5.142788E-39)
            r19 = r24 & r19
            r3 = r19 ^ r17
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r3 <= r10) goto L88c
            boolean r3 = r15.g(r2)
            if (r3 != 0) goto L890
        L88c:
            r3 = r24 & r17
            if (r3 != r10) goto L892
        L890:
            r3 = 1
            goto L893
        L892:
            r3 = 0
        L893:
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r24 & r3
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r10) goto L89f
            r3 = 1
            goto L8a0
        L89f:
            r3 = 0
        L8a0:
            r0 = r0 | r3
            java.lang.Object r3 = r15.H()
            if (r0 != 0) goto L8ae
            if (r3 != r13) goto L8aa
            goto L8ae
        L8aa:
            r10 = r5
            r21 = 1
            goto L8be
        L8ae:
            U1.t r0 = new U1.t
            r3 = r5
            r5 = 1
            r10 = r3
            r21 = 1
            r3 = r41
            r0.<init>()
            r15.d0(r0)
            r3 = r0
        L8be:
            B5.c r3 = (B5.c) r3
            boolean r0 = r15.i(r1)
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r24 & r2
            r2 = r2 ^ r16
            r5 = 8388608(0x800000, float:1.17549435E-38)
            if (r2 <= r5) goto L8d4
            boolean r2 = r15.g(r12)
            if (r2 != 0) goto L8d8
        L8d4:
            r2 = r24 & r16
            if (r2 != r5) goto L8db
        L8d8:
            r2 = r21
            goto L8dc
        L8db:
            r2 = 0
        L8dc:
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r24 & r2
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r5) goto L8e8
            r2 = r21
            goto L8e9
        L8e8:
            r2 = 0
        L8e9:
            r0 = r0 | r2
            java.lang.Object r2 = r15.H()
            if (r0 != 0) goto L8f5
            if (r2 != r13) goto L8f3
            goto L8f5
        L8f3:
            r12 = r3
            goto L903
        L8f5:
            U1.t r0 = new U1.t
            r5 = 0
            r2 = r12
            r12 = r3
            r3 = r42
            r0.<init>()
            r15.d0(r0)
            r2 = r0
        L903:
            B5.c r2 = (B5.c) r2
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r24 & r0
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            if (r0 != r3) goto L90e
            goto L910
        L90e:
            r21 = 0
        L910:
            java.lang.Object r0 = r15.H()
            if (r21 != 0) goto L918
            if (r0 != r13) goto L922
        L918:
            I5.m r0 = new I5.m
            r3 = 18
            r0.<init>(r3)
            r15.d0(r0)
        L922:
            B5.c r0 = (B5.c) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r5 = r15.i(r1)
            r33 = r4
            java.lang.Object r4 = r15.H()
            if (r5 != 0) goto L934
            if (r4 != r13) goto L93d
        L934:
            N5.d r4 = new N5.d
            r5 = 4
            r4.<init>(r5, r6, r1)
            r15.d0(r4)
        L93d:
            B5.c r4 = (B5.c) r4
            P.C0345b.c(r3, r4, r15)
            java.lang.Object r3 = r15.H()
            if (r3 != r13) goto L950
            u.d0 r3 = new u.d0
            r3.<init>(r7)
            r15.d0(r3)
        L950:
            u.d0 r3 = (u.C1645d0) r3
            java.lang.Object r4 = u.y0.f17085a
            boolean r4 = r15.g(r3)
            java.lang.Object r5 = r15.H()
            if (r4 != 0) goto L964
            if (r5 != r13) goto L961
            goto L964
        L961:
            r34 = r6
            goto L971
        L964:
            u.v0 r5 = new u.v0
            java.lang.String r4 = "entry"
            r34 = r6
            r6 = 0
            r5.<init>(r3, r6, r4)
            r15.d0(r5)
        L971:
            u.v0 r5 = (u.v0) r5
            if (r3 == 0) goto L9a8
            r4 = 1030829284(0x3d7134e4, float:0.05888833)
            r15.S(r4)
            P.f0 r4 = r3.f16908t
            java.lang.Object r4 = r4.getValue()
            P.f0 r6 = r3.f16907s
            java.lang.Object r6 = r6.getValue()
            boolean r16 = r15.g(r3)
            r17 = r10
            java.lang.Object r10 = r15.H()
            if (r16 != 0) goto L995
            if (r10 != r13) goto L99e
        L995:
            u.x0 r10 = new u.x0
            r14 = 0
            r10.<init>(r3, r14)
            r15.d0(r10)
        L99e:
            B5.e r10 = (B5.e) r10
            P.C0345b.f(r4, r6, r10, r15)
            r6 = 0
            r15.p(r6)
            goto L9bd
        L9a8:
            r17 = r10
            r6 = 0
            r4 = 1031290843(0x3d783fdb, float:0.060607772)
            r15.S(r4)
            P.f0 r4 = r3.f16907s
            java.lang.Object r4 = r4.getValue()
            r5.a(r6, r15, r4)
            r15.p(r6)
        L9bd:
            boolean r4 = r15.g(r5)
            java.lang.Object r6 = r15.H()
            if (r4 != 0) goto L9c9
            if (r6 != r13) goto L9d2
        L9c9:
            m0.a r6 = new m0.a
            r4 = 5
            r6.<init>(r4, r5)
            r15.d0(r6)
        L9d2:
            B5.c r6 = (B5.c) r6
            P.C0345b.c(r5, r6, r15)
            java.lang.Object r4 = r33.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto La16
            r4 = -1795663766(0xffffffff94f8586a, float:-2.5076474E-26)
            r15.S(r4)
            float r4 = r9.e()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            boolean r6 = r15.g(r8)
            boolean r10 = r15.i(r3)
            r6 = r6 | r10
            java.lang.Object r10 = r15.H()
            if (r6 != 0) goto La02
            if (r10 != r13) goto La0b
        La02:
            U1.y r10 = new U1.y
            r6 = 0
            r10.<init>(r3, r8, r9, r6)
            r15.d0(r10)
        La0b:
            B5.e r10 = (B5.e) r10
            P.C0345b.e(r10, r15, r4)
            r6 = 0
            r15.p(r6)
            r14 = 0
            goto La47
        La16:
            r4 = -1795408729(0xffffffff94fc3ca7, float:-2.546942E-26)
            r15.S(r4)
            boolean r4 = r15.i(r3)
            boolean r6 = r15.i(r7)
            r4 = r4 | r6
            boolean r6 = r15.g(r5)
            r4 = r4 | r6
            java.lang.Object r6 = r15.H()
            if (r4 != 0) goto La35
            if (r6 != r13) goto La33
            goto La35
        La33:
            r14 = 0
            goto La3e
        La35:
            U1.A r6 = new U1.A
            r14 = 0
            r6.<init>(r3, r7, r5, r14)
            r15.d0(r6)
        La3e:
            B5.e r6 = (B5.e) r6
            P.C0345b.e(r6, r15, r7)
            r6 = 0
            r15.p(r6)
        La47:
            boolean r4 = r15.i(r11)
            boolean r6 = r15.i(r1)
            r4 = r4 | r6
            boolean r6 = r15.g(r12)
            r4 = r4 | r6
            boolean r6 = r15.g(r2)
            r4 = r4 | r6
            boolean r6 = r15.g(r0)
            r4 = r4 | r6
            java.lang.Object r6 = r15.H()
            if (r4 != 0) goto La70
            if (r6 != r13) goto La68
            goto La70
        La68:
            r8 = r1
            r31 = r7
            r9 = r11
            r0 = r13
            r4 = r33
            goto La86
        La70:
            U1.u r6 = new U1.u
            r8 = r1
            r10 = r2
            r31 = r7
            r7 = r11
            r9 = r12
            r12 = r34
            r11 = r0
            r0 = r13
            r13 = r33
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r9 = r7
            r4 = r13
            r15.d0(r6)
        La86:
            r2 = r6
            B5.c r2 = (B5.c) r2
            java.lang.Object r1 = r15.H()
            if (r1 != r0) goto La99
            I5.m r1 = new I5.m
            r6 = 20
            r1.<init>(r6)
            r15.d0(r1)
        La99:
            B5.c r1 = (B5.c) r1
            U1.B r29 = new U1.B
            r30 = r3
            r33 = r4
            r29.<init>(r30, r31, r32, r33, r34)
            r3 = r29
            r4 = 820763100(0x30ebd9dc, float:1.716042E-9)
            X.e r3 = X.k.d(r4, r3, r15)
            int r4 = r24 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r6 = 221184(0x36000, float:3.09945E-40)
            r4 = r4 | r6
            r6 = r24
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r7 = r4 | r6
            r11 = r0
            r4 = r1
            r0 = r5
            r6 = r15
            r10 = r17
            r1 = r39
            r5 = r3
            r3 = r40
            androidx.compose.animation.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
            O3.D0 r1 = r0.f17069a
            java.lang.Object r7 = r1.j()
            P.f0 r1 = r0.f17072d
            java.lang.Object r12 = r1.getValue()
            boolean r1 = r15.g(r0)
            r2 = r37
            boolean r3 = r15.i(r2)
            r1 = r1 | r3
            boolean r3 = r15.i(r8)
            r1 = r1 | r3
            boolean r3 = r15.i(r9)
            r1 = r1 | r3
            java.lang.Object r3 = r15.H()
            if (r1 != 0) goto Laf2
            if (r3 != r11) goto Lb01
        Laf2:
            r1 = r0
            U1.C r0 = new U1.C
            r6 = 0
            r5 = r8
            r3 = r9
            r4 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.d0(r0)
            r3 = r0
        Lb01:
            B5.e r3 = (B5.e) r3
            P.C0345b.f(r7, r12, r3, r15)
            r6 = 0
            r15.p(r6)
            goto Lb17
        Lb0b:
            r10 = r5
            r6 = 0
            r14 = 0
            r0 = -1790236038(0xffffffff954b2a7a, float:-4.1029032E-26)
            r15.S(r0)
            r15.p(r6)
        Lb17:
            T1.A r0 = r10.f8081s
            java.lang.String r1 = "dialog"
            T1.z r0 = r0.b(r1)
            boolean r1 = r0 instanceof U1.r
            if (r1 == 0) goto Lb26
            r14 = r0
            U1.r r14 = (U1.r) r14
        Lb26:
            if (r14 != 0) goto Lb49
            P.o0 r11 = r15.r()
            if (r11 == 0) goto Lb6d
            U1.w r0 = new U1.w
            r10 = 0
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r44
            r9 = r46
            r0.<init>()
            r11.f5482d = r0
            return
        Lb49:
            r6 = 0
            com.google.android.gms.internal.measurement.I1.C(r14, r15, r6)
        Lb4d:
            P.o0 r11 = r15.r()
            if (r11 == 0) goto Lb6d
            U1.w r0 = new U1.w
            r10 = 1
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r44
            r9 = r46
            r0.<init>()
            r11.f5482d = r0
        Lb6d:
            return
        Lb6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ViewModelStore should be set before setGraph call"
            r0.<init>(r1)
            throw r0
        Lb76:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.d.f(T1.u, T1.r, c0.m, c0.e, B5.c, B5.c, B5.c, B5.c, P.o, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(final u uVar, final String str, InterfaceC0725m interfaceC0725m, C0717e c0717e, B5.c cVar, B5.c cVar2, B5.c cVar3, B5.c cVar4, final B5.c cVar5, C0371o c0371o, final int i) {
        B5.c cVar6;
        int i7;
        C0717e c0717e2;
        char c7;
        InterfaceC0725m interfaceC0725m2;
        B5.c cVar7;
        B5.c cVar8;
        B5.c cVar9;
        final B5.c cVar10;
        final B5.c cVar11;
        final B5.c cVar12;
        final B5.c cVar13;
        final C0717e c0717e3;
        final InterfaceC0725m interfaceC0725m3;
        c0371o.U(1840250294);
        int i8 = i | (c0371o.i(uVar) ? 4 : 2) | (c0371o.g(str) ? 32 : 16) | 844852608;
        char c8 = c0371o.i(cVar5) ? (char) 4 : (char) 2;
        if ((306783379 & i8) == 306783378 && (c8 & 3) == 2 && c0371o.x()) {
            c0371o.N();
            interfaceC0725m3 = interfaceC0725m;
            c0717e3 = c0717e;
            cVar13 = cVar;
            cVar12 = cVar2;
            cVar11 = cVar3;
            cVar10 = cVar4;
        } else {
            c0371o.P();
            int i9 = i & 1;
            S s6 = C0363k.f5418a;
            if (i9 == 0 || c0371o.w()) {
                C0717e c0717e4 = C0714b.f10076q;
                Object objH = c0371o.H();
                if (objH == s6) {
                    objH = new I5.m(17);
                    c0371o.d0(objH);
                }
                B5.c cVar14 = (B5.c) objH;
                Object objH2 = c0371o.H();
                if (objH2 == s6) {
                    objH2 = new I5.m(19);
                    c0371o.d0(objH2);
                }
                cVar6 = (B5.c) objH2;
                i7 = i8 & (-264241153);
                c0717e2 = c0717e4;
                c7 = c8;
                interfaceC0725m2 = C0722j.f10095q;
                cVar7 = cVar14;
                cVar8 = cVar7;
                cVar9 = cVar6;
            } else {
                c0371o.N();
                interfaceC0725m2 = interfaceC0725m;
                cVar6 = cVar2;
                cVar8 = cVar3;
                cVar9 = cVar4;
                i7 = i8 & (-264241153);
                c7 = c8;
                c0717e2 = c0717e;
                cVar7 = cVar;
            }
            c0371o.q();
            boolean z5 = ((i7 & 112) == 32) | ((c7 & 14) == 4);
            Object objH3 = c0371o.H();
            if (z5 || objH3 == s6) {
                s sVar = new s(uVar.f7418b.f8081s, str);
                cVar5.invoke(sVar);
                objH3 = sVar.c();
                c0371o.d0(objH3);
            }
            B5.c cVar15 = cVar9;
            C0717e c0717e5 = c0717e2;
            B5.c cVar16 = cVar6;
            f(uVar, (r) objH3, interfaceC0725m2, c0717e5, cVar7, cVar16, cVar8, cVar15, c0371o, (i7 & 8078) | 100884480);
            cVar10 = cVar15;
            cVar11 = cVar8;
            cVar12 = cVar16;
            cVar13 = cVar7;
            c0717e3 = c0717e5;
            interfaceC0725m3 = interfaceC0725m2;
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e(str, interfaceC0725m3, c0717e3, cVar13, cVar12, cVar11, cVar10, cVar5, i) { // from class: U1.v

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ String f7593r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0725m f7594s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ C0717e f7595t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ B5.c f7596u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ B5.c f7597v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ B5.c f7598w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ B5.c f7599x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ B5.c f7600y;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = C0345b.w(1);
                    l6.d.g(this.f7592q, this.f7593r, this.f7594s, this.f7595t, this.f7596u, this.f7597v, this.f7598w, this.f7599x, this.f7600y, (C0371o) obj, iW);
                    return C1386y.f15098a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1132d h(float f, float f7, float f8, float f9, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C1132d(f, f7, f8, f9, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long i(float f, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean k(Z4.o r21, com.web2native.MainActivity r22) {
        /*
            r0 = r21
            java.lang.String r1 = "offer_card_prefs"
            r2 = 0
            r3 = r22
            android.content.SharedPreferences r1 = r3.getSharedPreferences(r1, r2)
            r3 = 0
            if (r0 == 0) goto L15
            Z4.f r4 = r0.f8500c
            if (r4 == 0) goto L15
            java.lang.String r4 = r4.f8486a
            goto L16
        L15:
            r4 = r3
        L16:
            if (r4 == 0) goto L2a
            Z4.f r4 = r0.f8500c
            Z4.u r6 = r0.f8501d
            java.lang.String r7 = r0.f8498a
            Z4.l r4 = r4.f8489d
            if (r4 == 0) goto L2a
            java.lang.String r8 = r4.f8495a
            if (r8 == 0) goto L2a
            java.lang.String r4 = r4.f8496b
            if (r4 != 0) goto L30
        L2a:
            r16 = r2
            r22 = 1
            goto L184
        L30:
            if (r7 == 0) goto L181
            if (r6 == 0) goto L181
            java.lang.String r0 = r6.f8506b
            java.lang.Long r3 = r6.f8505a
            java.util.Date r4 = new java.util.Date
            long r8 = java.lang.System.currentTimeMillis()
            r4.<init>(r8)
            java.lang.String r6 = "days"
            java.lang.String r8 = "hours"
            java.lang.String r9 = "minutes"
            r10 = 1064901855(0x3f791cdf, float:0.9730968)
            r11 = 99469071(0x5edc70f, float:2.2360495E-35)
            r12 = 3076183(0x2ef057, float:4.31065E-39)
            if (r0 == 0) goto Lce
            int r15 = r0.hashCode()
            r16 = r2
            r2 = 1000(0x3e8, float:1.401E-42)
            r22 = 1
            r5 = 60
            if (r15 == r12) goto Lab
            if (r15 == r11) goto L89
            if (r15 == r10) goto L68
        L64:
            r17 = r3
            goto Ld4
        L68:
            boolean r15 = r0.equals(r9)
            if (r15 != 0) goto L6f
            goto L64
        L6f:
            long r17 = r4.getTime()
            if (r3 == 0) goto L7a
            long r19 = r3.longValue()
            goto L7c
        L7a:
            r19 = 0
        L7c:
            long r10 = (long) r5
            long r19 = r19 * r10
            long r10 = (long) r2
            long r19 = r19 * r10
            long r19 = r19 + r17
            r17 = r3
            r2 = r19
            goto Ld8
        L89:
            boolean r10 = r0.equals(r8)
            if (r10 != 0) goto L90
            goto L64
        L90:
            long r10 = r4.getTime()
            if (r3 == 0) goto L9b
            long r17 = r3.longValue()
            goto L9d
        L9b:
            r17 = 0
        L9d:
            long r12 = (long) r5
            long r17 = r17 * r12
            long r17 = r17 * r12
            long r12 = (long) r2
            long r17 = r17 * r12
            long r10 = r17 + r10
            r17 = r3
            r2 = r10
            goto Ld8
        Lab:
            boolean r10 = r0.equals(r6)
            if (r10 == 0) goto L64
            long r10 = r4.getTime()
            if (r3 == 0) goto Lbc
            long r12 = r3.longValue()
            goto Lbe
        Lbc:
            r12 = 0
        Lbe:
            r14 = 24
            r17 = r3
            long r2 = (long) r14
            long r12 = r12 * r2
            long r2 = (long) r5
            long r12 = r12 * r2
            long r12 = r12 * r2
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r12 = r12 * r2
            long r2 = r12 + r10
            goto Ld8
        Lce:
            r16 = r2
            r17 = r3
            r22 = 1
        Ld4:
            long r2 = r4.getTime()
        Ld8:
            if (r0 == 0) goto L19c
            if (r17 != 0) goto Lde
            goto L19c
        Lde:
            java.lang.String r5 = r7.toString()
            r10 = 0
            long r12 = r1.getLong(r5, r10)
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 <= 0) goto L171
            java.lang.String r5 = r7.toString()
            long r10 = r1.getLong(r5, r10)
            if (r0 == 0) goto L19d
            int r5 = r0.hashCode()
            r12 = 3076183(0x2ef057, float:4.31065E-39)
            if (r5 == r12) goto L150
            r15 = 99469071(0x5edc70f, float:2.2360495E-35)
            if (r5 == r15) goto L12e
            r6 = 1064901855(0x3f791cdf, float:0.9730968)
            if (r5 == r6) goto L10b
            goto L19d
        L10b:
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L113
            goto L19d
        L113:
            java.util.Date r0 = new java.util.Date
            r0.<init>(r10)
            int r0 = r4.compareTo(r0)
            if (r0 <= 0) goto L19d
            android.content.SharedPreferences$Editor r0 = r1.edit()
            java.lang.String r1 = r7.toString()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.apply()
            return r22
        L12e:
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L135
            goto L19d
        L135:
            java.util.Date r0 = new java.util.Date
            r0.<init>(r10)
            int r0 = r4.compareTo(r0)
            if (r0 <= 0) goto L19d
            android.content.SharedPreferences$Editor r0 = r1.edit()
            java.lang.String r1 = r7.toString()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.apply()
            return r22
        L150:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L19d
            java.util.Date r0 = new java.util.Date
            r0.<init>(r10)
            int r0 = r4.compareTo(r0)
            if (r0 <= 0) goto L19d
            android.content.SharedPreferences$Editor r0 = r1.edit()
            java.lang.String r1 = r7.toString()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.apply()
            return r22
        L171:
            android.content.SharedPreferences$Editor r0 = r1.edit()
            java.lang.String r1 = r7.toString()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.apply()
            return r22
        L181:
            r22 = 1
            goto L19c
        L184:
            if (r0 == 0) goto L18c
            Z4.f r1 = r0.f8500c
            if (r1 == 0) goto L18c
            java.lang.String r3 = r1.f8486a
        L18c:
            if (r3 == 0) goto L19d
            Z4.f r0 = r0.f8500c
            Z4.l r0 = r0.f8489d
            if (r0 == 0) goto L19d
            java.lang.String r1 = r0.f8495a
            if (r1 == 0) goto L19d
            java.lang.String r0 = r0.f8496b
            if (r0 == 0) goto L19d
        L19c:
            return r22
        L19d:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.d.k(Z4.o, com.web2native.MainActivity):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void m(float f, float f7, float f8, String str) {
        if (str.equals("width")) {
            float f9 = 100;
            float f10 = (f8 * f9) / f;
            L.f8475a = (f * f10) / f9;
            L.f8476b = (f7 * f10) / f9;
            return;
        }
        float f11 = 100;
        float f12 = (f8 * f11) / f7;
        L.f8475a = (f * f12) / f11;
        L.f8476b = (f7 * f12) / f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d6.r n(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return d6.r.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return d6.r.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return d6.r.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return d6.r.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return d6.r.SPDY_3;
        }
        if (str.equals("quic")) {
            return d6.r.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static T1.i p(k0 k0Var) {
        P1.d factory = T1.j.f7375a;
        P1.a extras = P1.a.f5609b;
        kotlin.jvm.internal.m.e(factory, "factory");
        kotlin.jvm.internal.m.e(extras, "extras");
        c0 c0Var = new c0(k0Var, factory, extras);
        kotlin.jvm.internal.f fVarA = z.a(T1.i.class);
        String strB = fVarA.b();
        if (strB != null) {
            return (T1.i) c0Var.v("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), fVarA);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ViewParent q(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final B1.a r(View view) {
        B1.a aVar = (B1.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        B1.a aVar2 = new B1.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void s(C0468k1 dataObject, Intent intent) {
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        g5.h hVar = dataObject.f7059S;
        WebView webView = dataObject.f7084k;
        Uri data = intent.getData();
        if (intent.hasExtra("url")) {
            Bundle extras = intent.getExtras();
            kotlin.jvm.internal.m.b(extras);
            String string = extras.getString("url");
            if (string == null) {
                return;
            }
            if (t.G0(string, "https", false) || t.G0(string, "http", false)) {
                if (J5.m.K0(string, "wa.me") || J5.m.K0(string, "whatsapp")) {
                    dataObject.f7063W = true;
                    hVar.f13159n.u(string);
                } else {
                    K2.a aVar = new K2.a(dataObject);
                    kotlin.jvm.internal.m.b(webView);
                    aVar.d(webView, string);
                }
            } else if (C3.a.C(dataObject, string)) {
                dataObject.f7063W = true;
                hVar.f13159n.u(string);
            }
        }
        if (intent.hasExtra("closeApp")) {
            Bundle extras2 = intent.getExtras();
            kotlin.jvm.internal.m.b(extras2);
            if (extras2.getInt("closeApp") == 1) {
                dataObject.f7067a.finishAndRemoveTask();
            }
        }
        if (intent.hasExtra("openURL")) {
            Bundle extras3 = intent.getExtras();
            kotlin.jvm.internal.m.b(extras3);
            String strValueOf = String.valueOf(extras3.getString("openURL"));
            if (C3.a.C(dataObject, strValueOf)) {
                if (!t.G0(strValueOf, "https://widget.connect.orufy", false)) {
                    if (webView != null) {
                        webView.loadUrl(strValueOf);
                    }
                    dataObject.j = strValueOf;
                }
            } else if (webView != null) {
                webView.loadUrl("https://www.smspariaz.com");
            }
        }
        if (intent.hasExtra("deepLink")) {
            Bundle extras4 = intent.getExtras();
            kotlin.jvm.internal.m.b(extras4);
            String strValueOf2 = String.valueOf(extras4.getString("deepLink"));
            if (t.G0(strValueOf2, "wton.", false)) {
                strValueOf2 = E3.h.M("wton.", strValueOf2);
            }
            if (webView != null) {
                webView.loadUrl(strValueOf2);
            }
            dataObject.j = strValueOf2;
        } else if (data != null) {
            String string2 = data.toString();
            kotlin.jvm.internal.m.d(string2, "toString(...)");
            if (t.G0(string2, "wton.", false)) {
                string2 = E3.h.M("wton.", string2);
            } else if (t.G0(string2, "wton:", false)) {
                string2 = E3.h.M("wton://", string2);
            }
            if (webView != null) {
                webView.loadUrl(string2);
            }
            dataObject.j = string2;
        }
        if (intent.hasExtra("notificationTime")) {
            C1056a c1056a = new C1056a(dataObject.f7071c);
            Bundle extras5 = intent.getExtras();
            kotlin.jvm.internal.m.b(extras5);
            String string3 = extras5.getString("notificationTime");
            kotlin.jvm.internal.m.b(string3);
            c1056a.b(string3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void t(float f, float f7, float f8, String str, float f9) {
        if (str.equals("width")) {
            float f10 = 100;
            float f11 = (f8 * f10) / f;
            L.f8475a = (f * f11) / f10;
            L.f8476b = (f7 * f11) / f10;
            return;
        }
        float f12 = 100;
        float f13 = (f8 * f12) / f7;
        L.f8475a = (f * f13) / f12;
        L.f8476b = (f13 * f7) / f12;
        float f14 = 2 * f9;
        if (Float.compare(L.f8475a, f14) > 0) {
            if (Float.compare(f, f14) <= 0) {
                t(f, f7, f14, "width", f9);
            } else {
                m(f, f7, f14, "width");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean u(Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        return ((LocationManager) systemService).isProviderEnabled("gps");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean v(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean w(C1132d c1132d) {
        long j = c1132d.f13530e;
        return (j >>> 32) == (4294967295L & j) && j == c1132d.f && j == c1132d.f13531g && j == c1132d.f13532h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean x(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void y(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public abstract void A(c0 c0Var);

    public abstract void C(boolean z5);

    public abstract void D(boolean z5);

    public abstract List l(String str, List list);

    public abstract InputFilter[] o(InputFilter[] inputFilterArr);

    public abstract void z(Throwable th);

    @Override // w1.P
    public void b() {
    }

    @Override // w1.P
    public void c() {
    }
}
