package D5;

import A.AbstractC0012i;
import A.AbstractC0017n;
import A.C0005b;
import A.C0007d;
import A.C0016m;
import A.InterfaceC0008e;
import A.InterfaceC0010g;
import A.L;
import A1.h;
import B0.C0044i;
import B0.C0045j;
import B0.C0050o;
import B0.D;
import B0.G0;
import B0.InterfaceC0046k;
import B0.j0;
import C0.AbstractC0103t0;
import C2.e;
import D.A;
import D.C0116a;
import D.o;
import D.p;
import D.y;
import D.z;
import G5.b;
import L0.E;
import L0.F;
import O3.B;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import P.S;
import P.W;
import Q.K;
import Q2.s;
import Q2.u;
import Q2.v;
import V2.g;
import Z5.N;
import a3.C0632k;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.AbstractC0727o;
import c0.InterfaceC0725m;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import d6.w;
import e3.C1045h;
import e3.C1046i;
import e3.C1047j;
import e3.C1048k;
import f2.c;
import f2.d;
import j2.InterfaceC1155a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import k1.i;
import kotlin.jvm.internal.C1193b;
import kotlin.jvm.internal.m;
import m5.C1371j;
import n5.AbstractC1397A;
import n5.AbstractC1403f;
import n5.k;
import n5.l;
import n5.x;
import o5.C1420b;
import p3.J0;
import q6.InterfaceC1540i;
import u.C1667v;
import v.C1717l;
import v.d0;
import w.C1793l;
import w.EnumC1778d0;
import w.I;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f1467a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f1468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1469c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean A(String method) {
        m.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d A[PHI: r20 r21 r22 r23 r24 r25 r26 r27 r28
  0x016d: PHI (r20v6 d0.c) = (r20v5 d0.c), (r20v7 d0.c) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r21v6 boolean) = (r21v5 boolean), (r21v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r22v13 K0.a) = (r22v12 K0.a), (r22v14 K0.a) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r23v6 d0.k) = (r23v5 d0.k), (r23v7 d0.k) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r24v6 java.lang.Boolean) = (r24v5 java.lang.Boolean), (r24v7 java.lang.Boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r25v11 I0.f) = (r25v10 I0.f), (r25v12 I0.f) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r27v6 java.lang.Integer) = (r27v5 java.lang.Integer), (r27v7 java.lang.Integer) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r28v12 L0.d) = (r28v11 L0.d), (r28v13 L0.d) binds: [B:10:0x004e, B:62:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(android.view.ViewStructure r38, B0.L r39, android.view.autofill.AutofillId r40, java.lang.String r41, J0.a r42) {
        /*
            r0 = r38
            r1 = r39
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            I0.s r4 = I0.p.f2302a
            I0.s r4 = I0.h.f2234a
            I0.i r4 = r1.u()
            r10 = 2
            r13 = 8
            if (r4 == 0) goto L196
            r.G r4 = r4.f2257q
            if (r4 == 0) goto L196
            r16 = 128(0x80, double:6.32E-322)
            java.lang.Object[] r5 = r4.f16134b
            java.lang.Object[] r6 = r4.f16135c
            long[] r4 = r4.f16133a
            r18 = 255(0xff, double:1.26E-321)
            int r7 = r4.length
            int r7 = r7 - r10
            r30 = r10
            if (r7 < 0) goto L176
            r8 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 7
        L3f:
            r9 = r4[r8]
            r31 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = ~r9
            long r11 = r11 << r29
            long r11 = r11 & r9
            long r11 = r11 & r31
            int r11 = (r11 > r31 ? 1 : (r11 == r31 ? 0 : -1))
            if (r11 == 0) goto L16d
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L58:
            if (r12 >= r11) goto L16a
            long r33 = r9 & r18
            int r33 = (r33 > r16 ? 1 : (r33 == r16 ? 0 : -1))
            if (r33 >= 0) goto L15f
            int r33 = r8 << 3
            int r33 = r33 + r12
            r34 = r5[r33]
            r14 = r6[r33]
            r15 = r34
            I0.s r15 = (I0.s) r15
            r34 = r13
            I0.s r13 = I0.p.f2315q
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto L81
            java.lang.String r13 = "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType"
            kotlin.jvm.internal.m.c(r14, r13)
            r20 = r14
            d0.c r20 = (d0.c) r20
            goto L161
        L81:
            I0.s r13 = I0.p.f2302a
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto L9d
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            kotlin.jvm.internal.m.c(r14, r13)
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r13 = n5.l.m0(r14)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L161
            r0.setContentDescription(r13)
            goto L161
        L9d:
            I0.s r13 = I0.p.f2314p
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto Lb0
            java.lang.String r13 = "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType"
            kotlin.jvm.internal.m.c(r14, r13)
            r23 = r14
            d0.k r23 = (d0.k) r23
            goto L161
        Lb0:
            I0.s r13 = I0.p.f2293C
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto Lc3
            java.lang.String r13 = "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString"
            kotlin.jvm.internal.m.c(r14, r13)
            r28 = r14
            L0.d r28 = (L0.C0192d) r28
            goto L161
        Lc3:
            I0.s r13 = I0.p.f2309k
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Boolean"
            if (r13 == 0) goto Ldb
            kotlin.jvm.internal.m.c(r14, r2)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r2 = r14.booleanValue()
            r0.setFocused(r2)
            goto L161
        Ldb:
            I0.s r13 = I0.p.f2301K
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto Lee
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.m.c(r14, r2)
            r27 = r14
            java.lang.Integer r27 = (java.lang.Integer) r27
            goto L161
        Lee:
            I0.s r13 = I0.p.f2297G
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto Lfa
            r26 = 1
            goto L161
        Lfa:
            I0.s r13 = I0.p.f2320v
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto L10c
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.ui.semantics.Role"
            kotlin.jvm.internal.m.c(r14, r2)
            r25 = r14
            I0.f r25 = (I0.f) r25
            goto L161
        L10c:
            I0.s r13 = I0.p.f2295E
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto L11c
            kotlin.jvm.internal.m.c(r14, r2)
            r24 = r14
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            goto L161
        L11c:
            I0.s r2 = I0.p.f2296F
            boolean r2 = kotlin.jvm.internal.m.a(r15, r2)
            if (r2 == 0) goto L12e
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState"
            kotlin.jvm.internal.m.c(r14, r2)
            r22 = r14
            K0.a r22 = (K0.a) r22
            goto L161
        L12e:
            I0.s r2 = I0.h.f2235b
            boolean r2 = kotlin.jvm.internal.m.a(r15, r2)
            if (r2 == 0) goto L13b
            r2 = 1
            r0.setClickable(r2)
            goto L161
        L13b:
            r2 = 1
            I0.s r13 = I0.h.f2236c
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto L148
            r0.setLongClickable(r2)
            goto L161
        L148:
            I0.s r13 = I0.h.f2251u
            boolean r13 = kotlin.jvm.internal.m.a(r15, r13)
            if (r13 == 0) goto L154
            r0.setFocusable(r2)
            goto L161
        L154:
            I0.s r2 = I0.h.j
            boolean r2 = kotlin.jvm.internal.m.a(r15, r2)
            if (r2 == 0) goto L161
            r21 = 1
            goto L161
        L15f:
            r34 = r13
        L161:
            long r9 = r9 >> r34
            int r12 = r12 + 1
            r13 = r34
            r2 = 1
            goto L58
        L16a:
            r2 = r13
            if (r11 != r2) goto L18f
        L16d:
            if (r8 == r7) goto L18f
            int r8 = r8 + 1
            r2 = 1
            r13 = 8
            goto L3f
        L176:
            r29 = 7
            r31 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L18f:
            r2 = r22
            r4 = r25
            r5 = r28
            goto L1b2
        L196:
            r30 = r10
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
            r29 = 7
            r31 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r2 = 0
            r4 = 0
            r5 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
        L1b2:
            I0.i r6 = r1.u()
            if (r6 == 0) goto L207
            boolean r7 = r6.f2259s
            if (r7 == 0) goto L207
            boolean r7 = r6.f2260t
            if (r7 == 0) goto L1c1
            goto L207
        L1c1:
            I0.i r6 = r6.g()
            r.C r7 = new r.C
            java.util.List r8 = r1.n()
            R.b r8 = (R.b) r8
            R.e r8 = r8.f6670q
            int r8 = r8.f6678s
            r7.<init>(r8)
            java.util.List r8 = r1.n()
            r7.b(r8)
        L1db:
            boolean r8 = r7.h()
            if (r8 == 0) goto L207
            int r8 = r7.f16115b
            r35 = 1
            int r8 = r8 + (-1)
            java.lang.Object r8 = r7.i(r8)
            B0.L r8 = (B0.L) r8
            I0.i r9 = r8.u()
            if (r9 == 0) goto L1db
            boolean r10 = r9.f2259s
            if (r10 == 0) goto L1f8
            goto L1db
        L1f8:
            r6.i(r9)
            boolean r9 = r9.f2260t
            if (r9 != 0) goto L1db
            java.util.List r8 = r8.n()
            r7.b(r8)
            goto L1db
        L207:
            if (r6 == 0) goto L299
            r.G r6 = r6.f2257q
            if (r6 == 0) goto L299
            java.lang.Object[] r7 = r6.f16134b
            java.lang.Object[] r8 = r6.f16135c
            long[] r6 = r6.f16133a
            int r9 = r6.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto L299
            r10 = 0
            r11 = 0
        L21a:
            r12 = r6[r10]
            long r14 = ~r12
            long r14 = r14 << r29
            long r14 = r14 & r12
            long r14 = r14 & r31
            int r14 = (r14 > r31 ? 1 : (r14 == r31 ? 0 : -1))
            if (r14 == 0) goto L286
            int r14 = r10 - r9
            int r14 = ~r14
            int r14 = r14 >>> 31
            r34 = 8
            int r14 = 8 - r14
            r15 = 0
        L230:
            if (r15 >= r14) goto L27b
            long r36 = r12 & r18
            int r22 = (r36 > r16 ? 1 : (r36 == r16 ? 0 : -1))
            if (r22 >= 0) goto L26a
            int r22 = r10 << 3
            int r22 = r22 + r15
            r25 = r7[r22]
            r28 = r3
            r3 = r8[r22]
            r22 = r6
            r6 = r25
            I0.s r6 = (I0.s) r6
            r25 = r7
            I0.s r7 = I0.p.i
            boolean r7 = kotlin.jvm.internal.m.a(r6, r7)
            if (r7 == 0) goto L257
            r7 = 0
            r0.setEnabled(r7)
            goto L267
        L257:
            I0.s r7 = I0.p.f2323y
            boolean r6 = kotlin.jvm.internal.m.a(r6, r7)
            if (r6 == 0) goto L267
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>"
            kotlin.jvm.internal.m.c(r3, r6)
            r11 = r3
            java.util.List r11 = (java.util.List) r11
        L267:
            r3 = 8
            goto L271
        L26a:
            r28 = r3
            r22 = r6
            r25 = r7
            goto L267
        L271:
            long r12 = r12 >> r3
            int r15 = r15 + 1
            r6 = r22
            r7 = r25
            r3 = r28
            goto L230
        L27b:
            r28 = r3
            r22 = r6
            r25 = r7
            r3 = 8
            if (r14 != r3) goto L29c
            goto L28e
        L286:
            r28 = r3
            r22 = r6
            r25 = r7
            r3 = 8
        L28e:
            if (r10 == r9) goto L29c
            int r10 = r10 + 1
            r6 = r22
            r7 = r25
            r3 = r28
            goto L21a
        L299:
            r28 = r3
            r11 = 0
        L29c:
            int r3 = r1.f280r
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            B0.L r6 = r1.s()
            if (r6 != 0) goto L2a9
            r3 = 0
        L2a9:
            if (r3 == 0) goto L2b2
            int r3 = r3.intValue()
        L2af:
            r6 = r40
            goto L2b4
        L2b2:
            r3 = -1
            goto L2af
        L2b4:
            com.google.firebase.c.s(r0, r6, r3)
            r6 = r41
            r7 = 0
            r0.setId(r3, r6, r7, r7)
            if (r20 == 0) goto L2c2
        L2bf:
            r3 = r28
            goto L2cd
        L2c2:
            if (r21 == 0) goto L2c5
            goto L2bf
        L2c5:
            if (r2 == 0) goto L2cc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r30)
            goto L2cd
        L2cc:
            r3 = r7
        L2cd:
            if (r3 == 0) goto L2d6
            int r3 = r3.intValue()
            com.google.firebase.c.r(r0, r3)
        L2d6:
            if (r23 == 0) goto L2e1
            java.lang.String[] r3 = C3.a.x(r23)
            if (r3 == 0) goto L2e1
            com.google.firebase.c.u(r0, r3)
        L2e1:
            r3 = r42
            E.Y r3 = r3.f2492a
            int r6 = r1.f280r
            S0.c r7 = new S0.c
            r8 = 1
            r7.<init>(r8, r0)
            r3.s(r6, r7)
            if (r24 == 0) goto L2f9
            boolean r3 = r24.booleanValue()
            r0.setSelected(r3)
        L2f9:
            r7 = 4
            if (r2 == 0) goto L30a
            r0.setCheckable(r8)
            K0.a r3 = K0.a.f2848q
            if (r2 != r3) goto L305
            r2 = 1
            goto L306
        L305:
            r2 = 0
        L306:
            r0.setChecked(r2)
            goto L31f
        L30a:
            if (r24 == 0) goto L31f
            if (r4 != 0) goto L310
        L30e:
            r2 = 1
            goto L315
        L310:
            int r2 = r4.f2230a
            if (r2 != r7) goto L30e
            goto L31f
        L315:
            r0.setCheckable(r2)
            boolean r2 = r24.booleanValue()
            r0.setChecked(r2)
        L31f:
            d0.j r2 = d0.k.f11798a
            r2.getClass()
            d0.d r2 = d0.j.f11797b
            java.lang.String[] r2 = C3.a.x(r2)
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.m.e(r2, r3)
            int r3 = r2.length
            if (r3 == 0) goto L3d6
            r33 = 0
            r2 = r2[r33]
            if (r23 == 0) goto L34a
            java.lang.String[] r3 = C3.a.x(r23)
            if (r3 == 0) goto L34a
            boolean r2 = n5.k.z0(r3, r2)
            r8 = 1
            if (r2 != r8) goto L347
            r2 = r8
            goto L34c
        L347:
            r2 = r33
            goto L34c
        L34a:
            r8 = 1
            goto L347
        L34c:
            if (r26 != 0) goto L354
            if (r2 == 0) goto L351
            goto L354
        L351:
            r2 = r33
            goto L355
        L354:
            r2 = r8
        L355:
            if (r2 == 0) goto L35a
            com.google.firebase.c.z(r0)
        L35a:
            B0.g0 r3 = r1.f268U
            B0.n0 r3 = r3.f431c
            boolean r3 = r3.J0()
            if (r3 == 0) goto L365
            goto L367
        L365:
            r7 = r33
        L367:
            r0.setVisibility(r7)
            if (r11 == 0) goto L396
            r3 = r11
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            java.lang.String r6 = ""
            r15 = r33
        L377:
            if (r15 >= r3) goto L38e
            java.lang.Object r7 = r11.get(r15)
            L0.d r7 = (L0.C0192d) r7
            java.lang.StringBuilder r6 = C0.S.q(r6)
            java.lang.String r7 = r7.f3106r
            r8 = 10
            java.lang.String r6 = C0.S.p(r6, r7, r8)
            int r15 = r15 + 1
            goto L377
        L38e:
            r0.setText(r6)
            java.lang.String r3 = "android.widget.TextView"
            r0.setClassName(r3)
        L396:
            java.util.List r1 = r1.n()
            R.b r1 = (R.b) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3af
            if (r4 == 0) goto L3af
            int r1 = r4.f2230a
            java.lang.String r1 = C0.W.r(r1)
            if (r1 == 0) goto L3af
            r0.setClassName(r1)
        L3af:
            if (r21 == 0) goto L3d5
            java.lang.String r1 = "android.widget.EditText"
            r0.setClassName(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 < r3) goto L3c5
            if (r27 == 0) goto L3c5
            int r1 = r27.intValue()
            B3.c.u(r0, r1)
        L3c5:
            if (r5 == 0) goto L3d0
            java.lang.String r1 = r5.f3106r
            android.view.autofill.AutofillValue r1 = com.google.firebase.c.f(r1)
            com.google.firebase.c.t(r0, r1)
        L3d0:
            if (r2 == 0) goto L3d5
            com.google.firebase.c.q(r0)
        L3d5:
            return
        L3d6:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.B(android.view.ViewStructure, B0.L, android.view.autofill.AutofillId, java.lang.String, J0.a):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List C(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C1420b c1420b = new C1420b(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i7 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            m.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            m.d(string2, "cursor.getString(toColumnIndex)");
            c1420b.add(new c(i, i7, string, string2));
        }
        C1420b c1420bG = AbstractC0836n2.g(c1420b);
        m.e(c1420bG, "<this>");
        if (c1420bG.d() <= 1) {
            return l.B0(c1420bG);
        }
        Object[] array = c1420bG.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return k.x0(array);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final d D(InterfaceC1155a interfaceC1155a, String str, boolean z5) throws IOException {
        Cursor cursorV = interfaceC1155a.V("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorV.getColumnIndex("seqno");
            int columnIndex2 = cursorV.getColumnIndex("cid");
            int columnIndex3 = cursorV.getColumnIndex("name");
            int columnIndex4 = cursorV.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorV.moveToNext()) {
                    if (cursorV.getInt(columnIndex2) >= 0) {
                        int i = cursorV.getInt(columnIndex);
                        String columnName = cursorV.getString(columnIndex3);
                        String str2 = cursorV.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        m.d(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                m.d(collectionValues, "columnsMap.values");
                List listB0 = l.B0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                m.d(collectionValues2, "ordersMap.values");
                d dVar = new d(str, z5, listB0, l.B0(collectionValues2));
                cursorV.close();
                return dVar;
            }
            cursorV.close();
            return null;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void E(Object[] objArr, int i, int i7) {
        m.e(objArr, "<this>");
        while (i < i7) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int F(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d5 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d5 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int G(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long H(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void I(K k7, int i, Object obj) {
        k7.f6484s[(k7.f6485t - k7.f6480o[k7.f6481p - 1].f6475b) + i] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void J(K k7, int i, Object obj, int i7, Object obj2) {
        int i8 = k7.f6485t - k7.f6480o[k7.f6481p - 1].f6475b;
        Object[] objArr = k7.f6484s;
        objArr[i + i8] = obj;
        objArr[i8 + i7] = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b M(G5.d dVar, int i) {
        m.e(dVar, "<this>");
        boolean z5 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z5) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i7 = dVar.f2017q;
        int i8 = dVar.f2018r;
        if (dVar.f2019s <= 0) {
            i = -i;
        }
        return new b(i7, i8, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int N(V2.c cVar, g gVar) {
        if (cVar instanceof V2.a) {
            return ((V2.a) cVar).f7957a;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G5.d O(int i, int i7) {
        if (i7 > Integer.MIN_VALUE) {
            return new G5.d(i, i7 - 1, 1);
        }
        G5.d dVar = G5.d.f2024t;
        return G5.d.f2024t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int P(int i) {
        int[] iArr = {1, 2, 3};
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = iArr[i7];
            int i9 = i8 - 1;
            if (i8 == 0) {
                throw null;
            }
            if (i9 == i) {
                return i8;
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(String str, InterfaceC0725m interfaceC0725m, F f, int i, boolean z5, int i7, int i8, C0371o c0371o, int i9) {
        int i10;
        c0371o.U(-1040751001);
        if ((i9 & 6) == 0) {
            i10 = (c0371o.g(str) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c0371o.g(interfaceC0725m) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c0371o.g(f) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c0371o.i(null) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= c0371o.e(i) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i10 |= c0371o.h(z5) ? 131072 : 65536;
        }
        if ((1572864 & i9) == 0) {
            i10 |= c0371o.e(i7) ? 1048576 : 524288;
        }
        if ((12582912 & i9) == 0) {
            i10 |= c0371o.e(i8) ? 8388608 : 4194304;
        }
        if ((100663296 & i9) == 0) {
            i10 |= c0371o.i(null) ? 67108864 : 33554432;
        }
        int i11 = i10 | 805306368;
        if (c0371o.K(i11 & 1, (306783379 & i11) != 306783378)) {
            if (i8 <= 0 || i7 <= 0) {
                AbstractC1923a.a("both minLines " + i8 + " and maxLines " + i7 + " must be greater than zero");
            }
            if (i8 > i7) {
                AbstractC1923a.a("minLines " + i8 + " must be less than or equal to maxLines " + i7);
            }
            if (c0371o.k(K.b.f2843a) != null) {
                throw new ClassCastException();
            }
            c0371o.S(-1588311278);
            c0371o.p(false);
            c0371o.S(-1587511974);
            InterfaceC0725m interfaceC0725mD = interfaceC0725m.d(new TextStringSimpleElement(str, f, (O0.d) c0371o.k(AbstractC0103t0.f1117k), i, z5, i7, i8));
            c0371o.p(false);
            int i12 = c0371o.f5454P;
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mD);
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0046k.f452a.getClass();
            D d5 = C0045j.f445b;
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(d5);
            } else {
                c0371o.g0();
            }
            C0345b.u(C0045j.f448e, c0371o, I.c.f2220a);
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !m.a(c0371o.H(), Integer.valueOf(i12))) {
                i.o(i12, c0371o, i12, c0044i);
            }
            c0371o.p(true);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new I.a(str, interfaceC0725m, f, i, z5, i7, i8, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str, InterfaceC0725m interfaceC0725m, F f, int i, boolean z5, int i7, int i8, C0371o c0371o, int i9) {
        int i10;
        c0371o.U(-1186827822);
        if ((i9 & 6) == 0) {
            i10 = (c0371o.g(str) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c0371o.g(interfaceC0725m) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c0371o.g(f) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c0371o.i(null) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= c0371o.e(i) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i10 |= c0371o.h(z5) ? 131072 : 65536;
        }
        if ((1572864 & i9) == 0) {
            i10 |= c0371o.e(i7) ? 1048576 : 524288;
        }
        if ((12582912 & i9) == 0) {
            i10 |= c0371o.e(i8) ? 8388608 : 4194304;
        }
        int i11 = i10 | 100663296;
        if (c0371o.K(i11 & 1, (38347923 & i11) != 38347922)) {
            a(str, interfaceC0725m, f, i, z5, i7, i8, c0371o, i11 & 268435454);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new I.a(str, interfaceC0725m, f, i, z5, i7, i8, i9, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(o0.AbstractC1412b r16, java.lang.String r17, c0.InterfaceC0725m r18, c0.C0717e r19, z0.InterfaceC1950j r20, float r21, j0.j r22, P.C0371o r23, int r24, int r25) {
        /*
            r2 = r17
            r3 = r18
            r0 = r23
            r8 = r24
            r1 = 1142754848(0x441d0e20, float:628.2207)
            r0.U(r1)
            r10 = r16
            boolean r1 = r0.i(r10)
            if (r1 == 0) goto L18
            r1 = 4
            goto L19
        L18:
            r1 = 2
        L19:
            r1 = r1 | r8
            r4 = r8 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L2a
            boolean r4 = r0.g(r3)
            if (r4 == 0) goto L27
            r4 = 256(0x100, float:3.59E-43)
            goto L29
        L27:
            r4 = 128(0x80, float:1.794E-43)
        L29:
            r1 = r1 | r4
        L2a:
            r4 = r1 | 3072(0xc00, float:4.305E-42)
            r5 = r25 & 16
            if (r5 == 0) goto L35
            r4 = r1 | 27648(0x6c00, float:3.8743E-41)
        L32:
            r1 = r20
            goto L47
        L35:
            r1 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L32
            r1 = r20
            boolean r6 = r0.g(r1)
            if (r6 == 0) goto L44
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L46
        L44:
            r6 = 8192(0x2000, float:1.14794E-41)
        L46:
            r4 = r4 | r6
        L47:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r4
            r7 = r25 & 64
            if (r7 == 0) goto L55
            r6 = 1769472(0x1b0000, float:2.479558E-39)
            r4 = r4 | r6
            r6 = r4
            r4 = r22
            goto L63
        L55:
            r4 = r22
            boolean r9 = r0.g(r4)
            if (r9 == 0) goto L60
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L62
        L60:
            r9 = 524288(0x80000, float:7.34684E-40)
        L62:
            r6 = r6 | r9
        L63:
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r6
            r11 = 599186(0x92492, float:8.39638E-40)
            r12 = 0
            r15 = 1
            if (r9 == r11) goto L70
            r9 = r15
            goto L71
        L70:
            r9 = r12
        L71:
            r6 = r6 & r15
            boolean r6 = r0.K(r6, r9)
            if (r6 == 0) goto L111
            c0.e r6 = c0.C0714b.f10080u
            if (r5 == 0) goto L7e
            z0.F r1 = z0.C1949i.f18694a
        L7e:
            r11 = r1
            if (r7 == 0) goto L84
            r1 = 0
            r13 = r1
            goto L85
        L84:
            r13 = r4
        L85:
            c0.j r1 = c0.C0722j.f10095q
            if (r2 == 0) goto Laa
            r4 = 1040425059(0x3e03a063, float:0.12854151)
            r0.S(r4)
            java.lang.Object r4 = r0.H()
            P.S r5 = P.C0363k.f5418a
            if (r4 != r5) goto La0
            I0.k r4 = new I0.k
            r5 = 3
            r4.<init>(r2, r5)
            r0.d0(r4)
        La0:
            B5.c r4 = (B5.c) r4
            c0.m r1 = I0.j.a(r1, r12, r4)
            r0.p(r12)
            goto Lb3
        Laa:
            r4 = 1040583841(0x3e060ca1, float:0.13090755)
            r0.S(r4)
            r0.p(r12)
        Lb3:
            c0.m r1 = r3.d(r1)
            c0.m r9 = a.AbstractC0597a.o(r1)
            r14 = 2
            r12 = 1065353216(0x3f800000, float:1.0)
            c0.m r1 = androidx.compose.ui.draw.a.b(r9, r10, r11, r12, r13, r14)
            int r4 = r0.f5454P
            c0.m r1 = c0.AbstractC0727o.c(r0, r1)
            P.i0 r5 = r0.m()
            B0.j r7 = B0.InterfaceC0046k.f452a
            r7.getClass()
            B0.D r7 = B0.C0045j.f445b
            r0.W()
            boolean r9 = r0.f5453O
            if (r9 == 0) goto Lde
            r0.l(r7)
            goto Le1
        Lde:
            r0.g0()
        Le1:
            B0.i r7 = B0.C0045j.f448e
            v.N r9 = v.N.f17263a
            P.C0345b.u(r7, r0, r9)
            B0.i r7 = B0.C0045j.f447d
            P.C0345b.u(r7, r0, r5)
            B0.i r5 = B0.C0045j.f446c
            P.C0345b.u(r5, r0, r1)
            B0.i r1 = B0.C0045j.f
            boolean r5 = r0.f5453O
            if (r5 != 0) goto L106
            java.lang.Object r5 = r0.H()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.m.a(r5, r7)
            if (r5 != 0) goto L109
        L106:
            k1.i.o(r4, r0, r4, r1)
        L109:
            r0.p(r15)
            r4 = r6
            r5 = r11
            r6 = r12
            r7 = r13
            goto L11a
        L111:
            r0.N()
            r6 = r21
            r5 = r1
            r7 = r4
            r4 = r19
        L11a:
            P.o0 r10 = r0.r()
            if (r10 == 0) goto L12b
            v.O r0 = new v.O
            r1 = r16
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f5482d = r0
        L12b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.c(o0.b, java.lang.String, c0.m, c0.e, z0.j, float, j0.j, P.o, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(C0116a c0116a, InterfaceC0725m interfaceC0725m, y yVar, L l7, InterfaceC0010g interfaceC0010g, InterfaceC0008e interfaceC0008e, I i, boolean z5, C1717l c1717l, B5.c cVar, C0371o c0371o, int i7) {
        y yVar2;
        L l8;
        InterfaceC0010g interfaceC0010g2;
        InterfaceC0008e interfaceC0008e2;
        I i8;
        boolean z6;
        C1717l c1717l2;
        y yVar3;
        I i9;
        C1717l c1717lA;
        int i10;
        L l9;
        InterfaceC0008e interfaceC0008e3;
        InterfaceC0010g interfaceC0010g3;
        int i11;
        boolean z7;
        c0371o.U(-2072102870);
        int i12 = 2;
        int i13 = i7 | (c0371o.g(c0116a) ? 4 : 2) | (c0371o.g(interfaceC0725m) ? 32 : 16) | 374959232;
        int i14 = c0371o.i(cVar) ? 4 : 2;
        if (c0371o.K(i13 & 1, ((306783379 & i13) == 306783378 && (i14 & 3) == 2) ? false : true)) {
            c0371o.P();
            int i15 = i7 & 1;
            Object obj = C0363k.f5418a;
            if (i15 == 0 || c0371o.w()) {
                o oVar = A.f1188a;
                Object[] objArr = new Object[0];
                Z.m mVar = y.f1304w;
                boolean zE = c0371o.e(0) | c0371o.e(0);
                Object objH = c0371o.H();
                if (zE || objH == obj) {
                    objH = new z(0);
                    c0371o.d0(objH);
                }
                yVar3 = (y) P1.P(objArr, mVar, (B5.a) objH, c0371o, 0, 4);
                float f = 0;
                L l10 = new L(f, f, f, f);
                C0005b c0005b = AbstractC0012i.f108c;
                C0007d c0007d = AbstractC0012i.f106a;
                C1667v c1667vA = t.K.a(c0371o);
                boolean zG = c0371o.g(c1667vA);
                Object objH2 = c0371o.H();
                if (zG || objH2 == obj) {
                    objH2 = new C1793l(c1667vA);
                    c0371o.d0(objH2);
                }
                i9 = (C1793l) objH2;
                c1717lA = d0.a(c0371o);
                i10 = i14;
                l9 = l10;
                interfaceC0008e3 = c0007d;
                interfaceC0010g3 = c0005b;
                i11 = i13 & (-1908867969);
                z7 = true;
            } else {
                c0371o.N();
                yVar3 = yVar;
                interfaceC0008e3 = interfaceC0008e;
                i9 = i;
                c1717lA = c1717l;
                i11 = i13 & (-1908867969);
                i10 = i14;
                l9 = l7;
                interfaceC0010g3 = interfaceC0010g;
                z7 = z5;
            }
            c0371o.q();
            int i16 = (i11 & 14) | 48;
            boolean z8 = (((i16 & 14) ^ 6) > 4 && c0371o.g(c0116a)) || (i16 & 6) == 4;
            Object objH3 = c0371o.H();
            if (z8 || objH3 == obj) {
                objH3 = new D.c(new j0(i12, c0116a, interfaceC0008e3));
                c0371o.d0(objH3);
            }
            yVar2 = yVar3;
            I i17 = i9;
            boolean z9 = z7;
            E3.h.e(interfaceC0725m, yVar2, (D.c) objH3, l9, i17, z9, c1717lA, interfaceC0010g3, interfaceC0008e3, cVar, c0371o, ((i11 >> 3) & 14) | 12807168, 6 | ((i10 << 3) & 112));
            l8 = l9;
            interfaceC0010g2 = interfaceC0010g3;
            c1717l2 = c1717lA;
            z6 = z9;
            i8 = i17;
            interfaceC0008e2 = interfaceC0008e3;
        } else {
            c0371o.N();
            yVar2 = yVar;
            l8 = l7;
            interfaceC0010g2 = interfaceC0010g;
            interfaceC0008e2 = interfaceC0008e;
            i8 = i;
            z6 = z5;
            c1717l2 = c1717l;
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new D.e(c0116a, interfaceC0725m, yVar2, l8, interfaceC0010g2, interfaceC0008e2, i8, z6, c1717l2, cVar, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(C0632k c0632k, float f, InterfaceC0725m interfaceC0725m, C0371o c0371o, int i) {
        c0371o.U(1170781710);
        c0371o.T(185155711);
        boolean zD = c0371o.d(f);
        Object objH = c0371o.H();
        if (zD || objH == C0363k.f5418a) {
            objH = new C1047j(f);
            c0371o.d0(objH);
        }
        c0371o.p(false);
        f(c0632k, (B5.a) objH, interfaceC0725m, c0371o, 1073742216, 0);
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C1048k(c0632k, f, interfaceC0725m, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(C0632k c0632k, B5.a progress, InterfaceC0725m interfaceC0725m, C0371o c0371o, int i, int i7) {
        m.e(progress, "progress");
        c0371o.U(382909894);
        c0371o.T(185152185);
        Object objH = c0371o.H();
        S s6 = C0363k.f5418a;
        if (objH == s6) {
            objH = new a3.y();
            c0371o.d0(objH);
        }
        a3.y yVar = (a3.y) objH;
        c0371o.p(false);
        c0371o.T(185152232);
        Object objH2 = c0371o.H();
        if (objH2 == s6) {
            objH2 = new Matrix();
            c0371o.d0(objH2);
        }
        Matrix matrix = (Matrix) objH2;
        c0371o.p(false);
        c0371o.T(185152312);
        boolean zG = c0371o.g(c0632k);
        Object objH3 = c0371o.H();
        if (zG || objH3 == s6) {
            objH3 = C0345b.q(null);
            c0371o.d0(objH3);
        }
        W w3 = (W) objH3;
        c0371o.p(false);
        c0371o.T(185152364);
        if (c0632k == null || c0632k.b() == 0.0f) {
            AbstractC0017n.a(interfaceC0725m, c0371o, 6);
            c0371o.p(false);
            C0372o0 c0372o0R = c0371o.r();
            if (c0372o0R != null) {
                c0372o0R.f5482d = new C1045h(c0632k, progress, interfaceC0725m, i, i7, 0);
                return;
            }
            return;
        }
        c0371o.p(false);
        Rect rect = c0632k.f8840k;
        Context context = (Context) c0371o.k(AndroidCompositionLocals_androidKt.f9341b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        m.e(interfaceC0725m, "<this>");
        AbstractC1397A.b(interfaceC0725m.d(new LottieAnimationSizeElement(iWidth, iHeight)), new C1046i(rect, matrix, yVar, c0632k, context, progress, w3), c0371o, 0);
        C0372o0 c0372o0R2 = c0371o.r();
        if (c0372o0R2 != null) {
            c0372o0R2.f5482d = new C1045h(c0632k, progress, interfaceC0725m, i, i7, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0355 A[PHI: r3
  0x0355: PHI (r3v37 boolean) = (r3v30 boolean), (r3v38 boolean) binds: [B:239:0x0353, B:235:0x034d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0484  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r52v0, types: [P.o] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(c0.InterfaceC0725m r41, F.C0151e r42, A.L r43, x.C1876h r44, boolean r45, v.C1717l r46, float r47, u0.InterfaceC1672a r48, c0.C0716d r49, x.C1881m r50, X.e r51, P.C0371o r52, int r53, int r54) {
        /*
            r1 = r41
            r3 = r42
            r4 = r43
            r0 = r44
            r11 = r45
            r5 = r47
            r12 = r48
            r8 = r49
            r9 = r50
            r13 = r52
            r14 = r53
            r15 = r54
            c0.c r2 = c0.C0714b.f10074C
            r6 = 1125194810(0x43111c3a, float:145.11026)
            r13.U(r6)
            r6 = r14 & 6
            if (r6 != 0) goto L2f
            boolean r6 = r13.g(r1)
            if (r6 == 0) goto L2c
            r6 = 4
            goto L2d
        L2c:
            r6 = 2
        L2d:
            r6 = r6 | r14
            goto L30
        L2f:
            r6 = r14
        L30:
            r16 = r14 & 48
            r17 = 16
            if (r16 != 0) goto L43
            boolean r16 = r13.g(r3)
            if (r16 == 0) goto L3f
            r16 = 32
            goto L41
        L3f:
            r16 = r17
        L41:
            r6 = r6 | r16
        L43:
            r7 = r14 & 384(0x180, float:5.38E-43)
            r19 = 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L55
            boolean r7 = r13.g(r4)
            if (r7 == 0) goto L52
            r7 = 256(0x100, float:3.59E-43)
            goto L54
        L52:
            r7 = r19
        L54:
            r6 = r6 | r7
        L55:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            r10 = 0
            r21 = 1024(0x400, float:1.435E-42)
            r22 = r6
            if (r7 != 0) goto L6c
            boolean r7 = r13.h(r10)
            if (r7 == 0) goto L67
            r7 = 2048(0x800, float:2.87E-42)
            goto L69
        L67:
            r7 = r21
        L69:
            r7 = r22 | r7
            goto L6e
        L6c:
            r7 = r22
        L6e:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            r23 = 8192(0x2000, float:1.14794E-41)
            w.d0 r10 = w.EnumC1778d0.f17946r
            r24 = r6
            if (r24 != 0) goto L85
            boolean r24 = r13.g(r10)
            if (r24 == 0) goto L81
            r24 = 16384(0x4000, float:2.2959E-41)
            goto L83
        L81:
            r24 = r23
        L83:
            r7 = r7 | r24
        L85:
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = r14 & r24
            r26 = 65536(0x10000, float:9.18355E-41)
            if (r25 != 0) goto L9a
            boolean r25 = r13.g(r0)
            if (r25 == 0) goto L96
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L98
        L96:
            r25 = r26
        L98:
            r7 = r7 | r25
        L9a:
            r25 = 1572864(0x180000, float:2.204052E-39)
            r27 = r14 & r25
            r28 = 524288(0x80000, float:7.34684E-40)
            if (r27 != 0) goto Laf
            boolean r27 = r13.h(r11)
            if (r27 == 0) goto Lab
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto Lad
        Lab:
            r27 = r28
        Lad:
            r7 = r7 | r27
        Laf:
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r29 = r14 & r27
            r6 = r46
            if (r29 != 0) goto Lc4
            boolean r30 = r13.g(r6)
            if (r30 == 0) goto Lc0
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto Lc2
        Lc0:
            r30 = 4194304(0x400000, float:5.877472E-39)
        Lc2:
            r7 = r7 | r30
        Lc4:
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            r31 = r14 & r30
            if (r31 != 0) goto Ld7
            r6 = 0
            boolean r32 = r13.e(r6)
            if (r32 == 0) goto Ld4
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto Ld6
        Ld4:
            r6 = 33554432(0x2000000, float:9.403955E-38)
        Ld6:
            r7 = r7 | r6
        Ld7:
            r6 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r14 & r6
            r33 = r6
            if (r32 != 0) goto Lec
            boolean r32 = r13.d(r5)
            if (r32 == 0) goto Le8
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lea
        Le8:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        Lea:
            r7 = r7 | r32
        Lec:
            r32 = r7
            r7 = r15 & 6
            F.m r6 = F.C0159m.f1898a
            if (r7 != 0) goto Lff
            boolean r7 = r13.g(r6)
            if (r7 == 0) goto Lfc
            r7 = 4
            goto Lfd
        Lfc:
            r7 = 2
        Lfd:
            r7 = r7 | r15
            goto L100
        Lff:
            r7 = r15
        L100:
            r16 = r15 & 48
            if (r16 != 0) goto L10e
            boolean r16 = r13.i(r12)
            if (r16 == 0) goto L10c
            r17 = 32
        L10c:
            r7 = r7 | r17
        L10e:
            r16 = r7
            r7 = r15 & 384(0x180, float:5.38E-43)
            r14 = 0
            if (r7 != 0) goto L120
            boolean r7 = r13.i(r14)
            if (r7 == 0) goto L11d
            r19 = 256(0x100, float:3.59E-43)
        L11d:
            r7 = r16 | r19
            goto L122
        L120:
            r7 = r16
        L122:
            r14 = r15 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L130
            boolean r14 = r13.g(r2)
            if (r14 == 0) goto L12e
            r21 = 2048(0x800, float:2.87E-42)
        L12e:
            r7 = r7 | r21
        L130:
            r14 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L13e
            boolean r14 = r13.g(r8)
            if (r14 == 0) goto L13c
            r23 = 16384(0x4000, float:2.2959E-41)
        L13c:
            r7 = r7 | r23
        L13e:
            r14 = r15 & r24
            if (r14 != 0) goto L14c
            boolean r14 = r13.g(r9)
            if (r14 == 0) goto L14a
            r26 = 131072(0x20000, float:1.83671E-40)
        L14a:
            r7 = r7 | r26
        L14c:
            r14 = r15 & r25
            if (r14 != 0) goto L15d
            r14 = r51
            boolean r17 = r13.i(r14)
            if (r17 == 0) goto L15a
            r28 = 1048576(0x100000, float:1.469368E-39)
        L15a:
            r7 = r7 | r28
            goto L15f
        L15d:
            r14 = r51
        L15f:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r14 = r32 & r17
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 1
            if (r14 != r15) goto L177
            r14 = 599187(0x92493, float:8.3964E-40)
            r14 = r14 & r7
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r14 == r15) goto L175
            goto L177
        L175:
            r14 = 0
            goto L179
        L177:
            r14 = r17
        L179:
            r15 = r32 & 1
            boolean r14 = r13.K(r15, r14)
            if (r14 == 0) goto L4b8
            r14 = r32 & 112(0x70, float:1.57E-43)
            r15 = 32
            if (r14 != r15) goto L18a
            r19 = r17
            goto L18c
        L18a:
            r19 = 0
        L18c:
            java.lang.Object r15 = r13.H()
            P.S r12 = P.C0363k.f5418a
            if (r19 != 0) goto L196
            if (r15 != r12) goto L19f
        L196:
            F.g r15 = new F.g
            r11 = 1
            r15.<init>(r3, r11)
            r13.d0(r15)
        L19f:
            B5.a r15 = (B5.a) r15
            int r11 = r32 >> 3
            r19 = r11 & 14
            int r21 = r7 >> 15
            r23 = r21 & 112(0x70, float:1.57E-43)
            r23 = r19 | r23
            r26 = r11
            r11 = r7 & 896(0x380, float:1.256E-42)
            r11 = r23 | r11
            r23 = r7
            P.W r7 = P.C0345b.t(r51, r52)
            r28 = r11
            r11 = 0
            P.W r1 = P.C0345b.t(r11, r13)
            r11 = r28 & 14
            r11 = r11 ^ 6
            r0 = 4
            if (r11 <= r0) goto L1cb
            boolean r11 = r13.g(r3)
            if (r11 != 0) goto L1cf
        L1cb:
            r11 = r28 & 6
            if (r11 != r0) goto L1d2
        L1cf:
            r0 = r17
            goto L1d3
        L1d2:
            r0 = 0
        L1d3:
            boolean r11 = r13.g(r7)
            r0 = r0 | r11
            boolean r11 = r13.g(r1)
            r0 = r0 | r11
            boolean r11 = r13.g(r15)
            r0 = r0 | r11
            java.lang.Object r11 = r13.H()
            if (r0 != 0) goto L1ea
            if (r11 != r12) goto L215
        L1ea:
            P.S r0 = P.S.f5375t
            C.k r11 = new C.k
            r9 = 2
            r11.<init>(r7, r1, r15, r9)
            P.C r1 = P.C0345b.n(r11, r0)
            B0.K r7 = new B0.K
            r9 = 9
            r7.<init>(r9, r1, r3)
            P.C r38 = P.C0345b.n(r7, r0)
            C.i r34 = new C.i
            r35 = 0
            r36 = 2
            java.lang.Class<P.S0> r37 = P.S0.class
            java.lang.String r39 = "value"
            java.lang.String r40 = "getValue()Ljava/lang/Object;"
            r34.<init>(r35, r36, r37, r38, r39, r40)
            r11 = r34
            r13.d0(r11)
        L215:
            H5.h r11 = (H5.h) r11
            java.lang.Object r0 = r13.H()
            if (r0 != r12) goto L224
            M5.w r0 = P.C0345b.k(r13)
            r13.d0(r0)
        L224:
            M5.w r0 = (M5.InterfaceC0261w) r0
            r15 = 32
            if (r14 != r15) goto L22d
            r1 = r17
            goto L22e
        L22d:
            r1 = 0
        L22e:
            java.lang.Object r7 = r13.H()
            if (r1 != 0) goto L236
            if (r7 != r12) goto L23f
        L236:
            F.g r7 = new F.g
            r1 = 0
            r7.<init>(r3, r1)
            r13.d0(r7)
        L23f:
            B5.a r7 = (B5.a) r7
            r1 = 65520(0xfff0, float:9.1813E-41)
            r1 = r32 & r1
            int r9 = r32 >> 9
            r15 = 458752(0x70000, float:6.42848E-40)
            r28 = r9 & r15
            r1 = r1 | r28
            r28 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r28
            r1 = r1 | r9
            int r9 = r23 << 21
            r34 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r34
            r1 = r1 | r9
            int r9 = r23 << 15
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            r35 = r9 & r23
            r1 = r1 | r35
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            r9 = r9 & r35
            r1 = r1 | r9
            r9 = r1 & 112(0x70, float:1.57E-43)
            r9 = r9 ^ 48
            r36 = r15
            r15 = 32
            if (r9 <= r15) goto L277
            boolean r9 = r13.g(r3)
            if (r9 != 0) goto L27b
        L277:
            r9 = r1 & 48
            if (r9 != r15) goto L27e
        L27b:
            r9 = r17
            goto L27f
        L27e:
            r9 = 0
        L27f:
            r15 = r1 & 896(0x380, float:1.256E-42)
            r15 = r15 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r15 <= r3) goto L28d
            boolean r15 = r13.g(r4)
            if (r15 != 0) goto L291
        L28d:
            r15 = r1 & 384(0x180, float:5.38E-43)
            if (r15 != r3) goto L294
        L291:
            r3 = r17
            goto L295
        L294:
            r3 = 0
        L295:
            r3 = r3 | r9
            r9 = r1 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r9 <= r15) goto L2a5
            r9 = 0
            boolean r20 = r13.h(r9)
            if (r20 != 0) goto L2a9
        L2a5:
            r9 = r1 & 3072(0xc00, float:4.305E-42)
            if (r9 != r15) goto L2ac
        L2a9:
            r9 = r17
            goto L2ad
        L2ac:
            r9 = 0
        L2ad:
            r3 = r3 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r1
            r9 = r9 ^ 24576(0x6000, float:3.4438E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r9 <= r15) goto L2be
            boolean r9 = r13.g(r10)
            if (r9 != 0) goto L2c2
        L2be:
            r9 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r9 != r15) goto L2c5
        L2c2:
            r9 = r17
            goto L2c6
        L2c5:
            r9 = 0
        L2c6:
            r3 = r3 | r9
            r9 = r1 & r23
            r9 = r9 ^ r30
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            if (r9 <= r15) goto L2d5
            boolean r2 = r13.g(r2)
            if (r2 != 0) goto L2d9
        L2d5:
            r2 = r1 & r30
            if (r2 != r15) goto L2dc
        L2d9:
            r2 = r17
            goto L2dd
        L2dc:
            r2 = 0
        L2dd:
            r2 = r2 | r3
            r3 = r1 & r35
            r3 = r3 ^ r33
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 <= r9) goto L2ec
            boolean r3 = r13.g(r8)
            if (r3 != 0) goto L2f0
        L2ec:
            r3 = r1 & r33
            if (r3 != r9) goto L2f3
        L2f0:
            r3 = r17
            goto L2f4
        L2f3:
            r3 = 0
        L2f4:
            r2 = r2 | r3
            r3 = r1 & r28
            r3 = r3 ^ r25
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r3 <= r9) goto L303
            boolean r3 = r13.d(r5)
            if (r3 != 0) goto L307
        L303:
            r3 = r1 & r25
            if (r3 != r9) goto L30a
        L307:
            r3 = r17
            goto L30b
        L30a:
            r3 = 0
        L30b:
            r2 = r2 | r3
            r3 = r1 & r34
            r3 = r3 ^ r27
            r9 = 8388608(0x800000, float:1.17549435E-38)
            if (r3 <= r9) goto L31a
            boolean r3 = r13.g(r6)
            if (r3 != 0) goto L31e
        L31a:
            r3 = r1 & r27
            if (r3 != r9) goto L321
        L31e:
            r6 = r17
            goto L322
        L321:
            r6 = 0
        L322:
            r2 = r2 | r6
            r3 = r21 & 14
            r3 = r3 ^ 6
            r6 = 4
            r9 = r50
            if (r3 <= r6) goto L332
            boolean r3 = r13.g(r9)
            if (r3 != 0) goto L336
        L332:
            r3 = r21 & 6
            if (r3 != r6) goto L339
        L336:
            r3 = r17
            goto L33a
        L339:
            r3 = 0
        L33a:
            r2 = r2 | r3
            boolean r3 = r13.g(r7)
            r2 = r2 | r3
            r3 = r1 & r36
            r3 = r3 ^ r24
            r15 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r15) goto L350
            r3 = 0
            boolean r18 = r13.e(r3)
            if (r18 != 0) goto L355
            goto L351
        L350:
            r3 = 0
        L351:
            r1 = r1 & r24
            if (r1 != r15) goto L358
        L355:
            r1 = r17
            goto L359
        L358:
            r1 = r3
        L359:
            r1 = r1 | r2
            boolean r2 = r13.g(r0)
            r1 = r1 | r2
            java.lang.Object r2 = r13.H()
            if (r1 != 0) goto L372
            if (r2 != r12) goto L368
            goto L372
        L368:
            r4 = r0
            r0 = r3
            r1 = r10
            r10 = r11
            r15 = 32
            r3 = r42
            r11 = r6
            goto L386
        L372:
            F.A r2 = new F.A
            r1 = r11
            r11 = r6
            r6 = r1
            r1 = r10
            r15 = 32
            r10 = r0
            r0 = r3
            r3 = r42
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r4 = r10
            r10 = r6
            r13.d0(r2)
        L386:
            r18 = r2
            B5.e r18 = (B5.e) r18
            r2 = r19 ^ 6
            if (r2 <= r11) goto L394
            boolean r2 = r13.g(r3)
            if (r2 != 0) goto L398
        L394:
            r2 = r26 & 6
            if (r2 != r11) goto L39b
        L398:
            r2 = r17
            goto L39c
        L39b:
            r2 = r0
        L39c:
            boolean r5 = r13.h(r0)
            r2 = r2 | r5
            java.lang.Object r5 = r13.H()
            if (r2 != 0) goto L3a9
            if (r5 != r12) goto L3b1
        L3a9:
            F.k r5 = new F.k
            r5.<init>(r3, r0)
            r13.d0(r5)
        L3b1:
            E.P r5 = (E.P) r5
            if (r14 != r15) goto L3b8
            r2 = r17
            goto L3b9
        L3b8:
            r2 = r0
        L3b9:
            r6 = r32 & r36
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r6 != r7) goto L3c2
            r6 = r17
            goto L3c3
        L3c2:
            r6 = r0
        L3c3:
            r2 = r2 | r6
            java.lang.Object r6 = r13.H()
            if (r2 != 0) goto L3d0
            if (r6 != r12) goto L3cd
            goto L3d0
        L3cd:
            r2 = r44
            goto L3da
        L3d0:
            F.U r6 = new F.U
            r2 = r44
            r6.<init>(r2, r3)
            r13.d0(r6)
        L3da:
            F.U r6 = (F.U) r6
            P.z r7 = w.AbstractC1781f.f17959a
            java.lang.Object r7 = r13.k(r7)
            w.c r7 = (w.InterfaceC1775c) r7
            if (r14 != r15) goto L3e9
            r8 = r17
            goto L3ea
        L3e9:
            r8 = r0
        L3ea:
            boolean r9 = r13.g(r7)
            r8 = r8 | r9
            java.lang.Object r9 = r13.H()
            if (r8 != 0) goto L3f7
            if (r9 != r12) goto L3ff
        L3f7:
            F.o r9 = new F.o
            r9.<init>(r3, r7)
            r13.d0(r9)
        L3ff:
            F.o r9 = (F.C0161o) r9
            c0.j r14 = c0.C0722j.f10095q
            if (r45 == 0) goto L456
            r7 = 1935359245(0x735b3d0d, float:1.7369862E31)
            r13.S(r7)
            int r7 = r32 >> 21
            r7 = r7 & 112(0x70, float:1.57E-43)
            r7 = r19 | r7
            r8 = r7 & 14
            r8 = r8 ^ 6
            if (r8 <= r11) goto L41d
            boolean r8 = r13.g(r3)
            if (r8 != 0) goto L421
        L41d:
            r8 = r7 & 6
            if (r8 != r11) goto L424
        L421:
            r8 = r17
            goto L425
        L424:
            r8 = r0
        L425:
            r11 = r7 & 112(0x70, float:1.57E-43)
            r11 = r11 ^ 48
            if (r11 <= r15) goto L431
            boolean r11 = r13.e(r0)
            if (r11 != 0) goto L438
        L431:
            r7 = r7 & 48
            if (r7 != r15) goto L436
            goto L438
        L436:
            r17 = r0
        L438:
            r7 = r8 | r17
            java.lang.Object r8 = r13.H()
            if (r7 != 0) goto L442
            if (r8 != r12) goto L44a
        L442:
            F.n r8 = new F.n
            r8.<init>(r3)
            r13.d0(r8)
        L44a:
            F.n r8 = (F.C0160n) r8
            E.k r7 = r3.f1836v
            c0.m r7 = androidx.compose.foundation.lazy.layout.a.a(r8, r7, r1)
            r13.p(r0)
            goto L460
        L456:
            r7 = 1935788068(0x7361c824, float:1.7888277E31)
            r13.S(r7)
            r13.p(r0)
            r7 = r14
        L460:
            C.x r8 = r3.f1839y
            r11 = r41
            c0.m r8 = r11.d(r8)
            E.e r12 = r3.f1837w
            c0.m r8 = r8.d(r12)
            r12 = r45
            c0.m r5 = androidx.compose.foundation.lazy.layout.a.b(r8, r10, r5, r1, r12)
            if (r12 == 0) goto L484
            F.t r8 = new F.t
            r8.<init>(r0, r3, r4)
            c0.m r0 = I0.j.a(r14, r0, r8)
            c0.m r0 = r5.d(r0)
            goto L488
        L484:
            c0.m r0 = r5.d(r14)
        L488:
            c0.m r0 = r0.d(r7)
            y.i r7 = r3.f1832r
            r8 = r46
            r2 = r0
            r4 = r1
            r5 = r12
            c0.m r0 = androidx.compose.foundation.a.f(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r3
            F.j r2 = new F.j
            r3 = 0
            r2.<init>(r3, r1)
            c0.m r2 = v0.u.a(r14, r1, r2)
            c0.m r0 = r0.d(r2)
            r8 = r48
            r2 = 0
            c0.m r3 = androidx.compose.ui.input.nestedscroll.a.a(r0, r8, r2)
            E.K r4 = r1.f1835u
            r7 = 0
            r2 = r10
            r6 = r13
            r5 = r18
            E.C.a(r2, r3, r4, r5, r6, r7)
            goto L4be
        L4b8:
            r11 = r1
            r1 = r3
            r8 = r12
            r52.N()
        L4be:
            P.o0 r14 = r52.r()
            if (r14 == 0) goto L4e1
            F.f r0 = new F.f
            r3 = r43
            r4 = r44
            r5 = r45
            r6 = r46
            r7 = r47
            r9 = r49
            r10 = r50
            r12 = r53
            r13 = r54
            r2 = r1
            r1 = r11
            r11 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.f5482d = r0
        L4e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.g(c0.m, F.e, A.L, x.h, boolean, v.l, float, u0.a, c0.d, x.m, X.e, P.o, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(C0371o c0371o, InterfaceC0725m interfaceC0725m) {
        C0016m c0016m = C0016m.f120c;
        int i = c0371o.f5454P;
        InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725m);
        InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
        InterfaceC0046k.f452a.getClass();
        D d5 = C0045j.f445b;
        G0 g02 = c0371o.f5456a;
        c0371o.W();
        if (c0371o.f5453O) {
            c0371o.l(d5);
        } else {
            c0371o.g0();
        }
        C0345b.u(C0045j.f448e, c0371o, c0016m);
        C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
        C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
        C0044i c0044i = C0045j.f;
        if (c0371o.f5453O || !m.a(c0371o.H(), Integer.valueOf(i))) {
            i.o(i, c0371o, i, c0044i);
        }
        c0371o.p(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long i(int i, int i7) {
        if (i < 0 || i7 < 0) {
            Q0.a.a("start and end cannot be negative. [start: " + i + ", end: " + i7 + ']');
        }
        long j = (((long) i7) & 4294967295L) | (((long) i) << 32);
        int i8 = E.f3088c;
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String j(Object[] objArr, int i, int i7, AbstractC1403f abstractC1403f) {
        StringBuilder sb = new StringBuilder((i7 * 3) + 2);
        sb.append("[");
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i8];
            if (obj == abstractC1403f) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final u k(d6.u uVar) {
        InterfaceC1540i interfaceC1540iO;
        int i = uVar.f12435t;
        long j = uVar.f12428A;
        long j7 = uVar.f12429B;
        d6.l lVar = uVar.f12437v;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = lVar.iterator();
        while (true) {
            C1193b c1193b = (C1193b) it;
            if (!c1193b.hasNext()) {
                break;
            }
            C1371j c1371j = (C1371j) c1193b.next();
            String str = (String) c1371j.f15080q;
            String str2 = (String) c1371j.f15081r;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        s sVar = new s(x.O(linkedHashMap));
        w wVar = uVar.f12438w;
        return new u(i, j, j7, sVar, (wVar == null || (interfaceC1540iO = wVar.O()) == null) ? null : new v(interfaceC1540iO), uVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d6.s l(Q2.t r5, s5.c r6) {
        /*
            boolean r0 = r6 instanceof T2.d
            if (r0 == 0) goto L13
            r0 = r6
            T2.d r0 = (T2.d) r0
            int r1 = r0.f7441r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7441r = r1
            goto L18
        L13:
            T2.d r0 = new T2.d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7440q
            int r0 = r0.f7441r
            r1 = 0
            if (r0 == 0) goto L3f
            r5 = 1
            if (r0 != r5) goto L37
            m5.AbstractC1362a.e(r6)
            q6.j r6 = (q6.C1541j) r6
            if (r6 == 0) goto L32
            k3.c r5 = new k3.c
            r5.<init>(r6)
            r6 = r1
            r0 = r6
            r2 = r0
            goto L54
        L32:
            r5 = r1
            r6 = r5
            r0 = r6
            r2 = r0
            goto L50
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            m5.AbstractC1362a.e(r6)
            L0.l r6 = new L0.l
            r6.<init>()
            java.lang.String r0 = r5.f6577a
            r6.u(r0)
            java.lang.String r0 = r5.f6578b
            r2 = r0
            r0 = r6
        L50:
            r4 = r6
            r6 = r5
            r5 = r1
            r1 = r4
        L54:
            r1.o(r2, r5)
            Q2.s r5 = r6.f6579c
            c3.c r6 = new c3.c
            r1 = 1
            r6.<init>(r1)
            java.util.Map r5 = r5.f6576a
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L69:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L85:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r6.b(r2, r3)
            goto L85
        L95:
            d6.l r5 = r6.d()
            r0.getClass()
            c3.c r5 = r5.h()
            r0.f3127d = r5
            d6.s r5 = r0.c()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.l(Q2.t, s5.c):d6.s");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final b6.i m(Y5.b bVar) {
        m.e(bVar, "<this>");
        b6.i iVar = bVar instanceof b6.i ? (b6.i) bVar : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + kotlin.jvm.internal.z.a(bVar.getClass()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(androidx.lifecycle.AbstractC0654q r5, s5.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof Y2.e
            if (r0 == 0) goto L13
            r0 = r6
            Y2.e r0 = (Y2.e) r0
            int r1 = r0.f8210t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8210t = r1
            goto L18
        L13:
            Y2.e r0 = new Y2.e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8209s
            int r1 = r0.f8210t
            m5.y r2 = m5.C1386y.f15098a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            kotlin.jvm.internal.y r5 = r0.f8208r
            androidx.lifecycle.q r0 = r0.f8207q
            m5.AbstractC1362a.e(r6)     // Catch: java.lang.Throwable -> L2b
            goto L72
        L2b:
            r6 = move-exception
            goto L81
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            m5.AbstractC1362a.e(r6)
            androidx.lifecycle.p r6 = r5.b()
            androidx.lifecycle.p r1 = androidx.lifecycle.EnumC0653p.f9559t
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L45
            return r2
        L45:
            kotlin.jvm.internal.y r6 = new kotlin.jvm.internal.y
            r6.<init>()
            r0.f8207q = r5     // Catch: java.lang.Throwable -> L7c
            r0.f8208r = r6     // Catch: java.lang.Throwable -> L7c
            r0.f8210t = r3     // Catch: java.lang.Throwable -> L7c
            M5.h r1 = new M5.h     // Catch: java.lang.Throwable -> L7c
            q5.c r0 = n5.AbstractC1397A.v(r0)     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7c
            r1.s()     // Catch: java.lang.Throwable -> L7c
            H2.c r0 = new H2.c     // Catch: java.lang.Throwable -> L7c
            r3 = 1
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7c
            r6.f14268q = r0     // Catch: java.lang.Throwable -> L7c
            r5.a(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L7c
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r0 != r1) goto L70
            return r1
        L70:
            r0 = r5
            r5 = r6
        L72:
            java.lang.Object r5 = r5.f14268q
            androidx.lifecycle.w r5 = (androidx.lifecycle.InterfaceC0659w) r5
            if (r5 == 0) goto L7b
            r0.c(r5)
        L7b:
            return r2
        L7c:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L81:
            java.lang.Object r5 = r5.f14268q
            androidx.lifecycle.w r5 = (androidx.lifecycle.InterfaceC0659w) r5
            if (r5 == 0) goto L8a
            r0.c(r5)
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.a.n(androidx.lifecycle.q, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double o(double d5, double d7, double d8) {
        if (d7 <= d8) {
            return d5 < d7 ? d7 : d5 > d8 ? d8 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d8 + " is less than minimum " + d7 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float p(float f, float f7, float f8) {
        if (f7 <= f8) {
            return f < f7 ? f7 : f > f8 ? f8 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f8 + " is less than minimum " + f7 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int q(int i, int i7, int i8) {
        if (i7 <= i8) {
            return i < i7 ? i7 : i > i8 ? i8 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i8 + " is less than minimum " + i7 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long r(long j, long j7, long j8) {
        if (j7 <= j8) {
            return j < j7 ? j7 : j > j8 ? j8 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j8 + " is less than minimum " + j7 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Comparable s(Float f, G5.a aVar) {
        float f7 = aVar.f2016b;
        float f8 = aVar.f2015a;
        if (f8 <= f7) {
            return (!G5.a.a(f, Float.valueOf(f8)) || G5.a.a(Float.valueOf(f8), f)) ? (!G5.a.a(Float.valueOf(f7), f) || G5.a.a(f, Float.valueOf(f7))) ? f : Float.valueOf(f7) : Float.valueOf(f8);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long t(int i, int i7, V2.h hVar, g gVar, V2.h hVar2) {
        int i8;
        int i9;
        if (!m.a(hVar, V2.h.f7964c)) {
            i = N(hVar.f7965a, gVar);
            i7 = N(hVar.f7966b, gVar);
        }
        V2.c cVar = hVar2.f7965a;
        V2.c cVar2 = hVar2.f7966b;
        if ((cVar instanceof V2.a) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i9 = ((V2.a) cVar).f7957a)) {
            i = i9;
        }
        if ((cVar2 instanceof V2.a) && i7 != Integer.MIN_VALUE && i7 != Integer.MAX_VALUE && i7 > (i8 = ((V2.a) cVar2).f7957a)) {
            i7 = i8;
        }
        return (((long) i7) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final double u(int i, int i7, int i8, int i9, g gVar) {
        double d5 = ((double) i8) / ((double) i);
        double d7 = ((double) i9) / ((double) i7);
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d5, d7);
        }
        if (iOrdinal == 1) {
            return Math.min(d5, d7);
        }
        throw new e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void v(V5.c cVar, Y5.a aVar, String str) {
        m.e(cVar, "<this>");
        B bQ = aVar.q();
        cVar.getClass();
        bQ.getClass();
        kotlin.jvm.internal.B.d(1, null);
        N.f(str, null);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String w(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case 96980:
                return !lowerCase.equals("avi") ? "*/*" : "video/x-msvideo";
            case 97669:
                return !lowerCase.equals("bmp") ? "*/*" : "image/bmp";
            case 99640:
                return !lowerCase.equals("doc") ? "*/*" : "application/msword";
            case 102340:
                return !lowerCase.equals("gif") ? "*/*" : "image/gif";
            case 105441:
                return !lowerCase.equals("jpg") ? "*/*" : "image/jpeg";
            case 108184:
                return !lowerCase.equals("mkv") ? "*/*" : "video/x-matroska";
            case 108272:
                return !lowerCase.equals("mp3") ? "*/*" : "audio/mpeg";
            case 108273:
                return !lowerCase.equals("mp4") ? "*/*" : "video/mp4";
            case 108308:
                return !lowerCase.equals("mov") ? "*/*" : "video/quicktime";
            case 109967:
                return !lowerCase.equals("ogg") ? "*/*" : "audio/ogg";
            case 110834:
                return !lowerCase.equals("pdf") ? "*/*" : "application/pdf";
            case 111145:
                return !lowerCase.equals("png") ? "*/*" : "image/png";
            case 111220:
                return !lowerCase.equals("ppt") ? "*/*" : "application/vnd.ms-powerpoint";
            case 115312:
                return !lowerCase.equals("txt") ? "*/*" : "text/plain";
            case 117484:
                return !lowerCase.equals("wav") ? "*/*" : "audio/wav";
            case 118783:
                return !lowerCase.equals("xls") ? "*/*" : "application/vnd.ms-excel";
            case 118807:
                return !lowerCase.equals("xml") ? "*/*" : "application/xml";
            case 3088960:
                return !lowerCase.equals("docx") ? "*/*" : "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
            case 3213227:
                return !lowerCase.equals("html") ? "*/*" : "text/html";
            case 3268712:
                return !lowerCase.equals("jpeg") ? "*/*" : "image/jpeg";
            case 3447940:
                return !lowerCase.equals("pptx") ? "*/*" : "application/vnd.openxmlformats-officedocument.presentationml.presentation";
            case 3645337:
                return !lowerCase.equals("webm") ? "*/*" : "video/webm";
            case 3645340:
                return !lowerCase.equals("webp") ? "*/*" : "image/webp";
            case 3682393:
                return !lowerCase.equals("xlsx") ? "*/*" : "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
            default:
                return "*/*";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int y(p pVar, EnumC1778d0 enumC1778d0) {
        return (int) (enumC1778d0 == EnumC1778d0.f17945q ? pVar.f1273o & 4294967295L : pVar.f1273o >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0050o z(InterfaceC1540i interfaceC1540i) {
        InputStream inputStreamY = interfaceC1540i.Y();
        J0 j02 = new J0();
        j02.f15672a = null;
        j02.f15673b = null;
        j02.f15674c = false;
        j02.f15676e = false;
        j02.f = null;
        j02.f15677g = null;
        j02.f15678h = false;
        j02.i = null;
        if (!inputStreamY.markSupported()) {
            inputStreamY = new BufferedInputStream(inputStreamY);
        }
        try {
            inputStreamY.mark(3);
            int i = inputStreamY.read() + (inputStreamY.read() << 8);
            inputStreamY.reset();
            if (i == 35615) {
                inputStreamY = new BufferedInputStream(new GZIPInputStream(inputStreamY));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamY.mark(4096);
            j02.B(inputStreamY);
            G0 g02 = j02.f15672a;
            C0050o c0050o = new C0050o();
            c0050o.f499q = g02;
            return c0050o;
        } finally {
            try {
                inputStreamY.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void K(View view, float f) {
        if (f1467a) {
            try {
                q2.y.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f1467a = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void L(View view, int i) {
        if (!f1469c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1468b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f1469c = true;
        }
        Field field = f1468b;
        if (field != null) {
            try {
                f1468b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float x(View view) {
        if (f1467a) {
            try {
                return q2.y.a(view);
            } catch (NoSuchMethodError unused) {
                f1467a = false;
            }
        }
        return view.getAlpha();
    }
}
