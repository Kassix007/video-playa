package y4;

import B5.e;
import J5.t;
import L0.n;
import P.C0345b;
import P.C0371o;
import P.C0372o0;
import R4.C0468k1;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.web2native.MainActivity;
import i1.C1134a;
import i5.C1143a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import m5.C1386y;
import n5.AbstractC1397A;
import o3.C1416b;
import w.EnumC1778d0;
import y4.AbstractC1918b;
import z.AbstractC1923a;

/* JADX INFO: renamed from: y4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1918b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C1134a f18623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile k3.d f18624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k3.c f18625c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int A(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean B(byte b7) {
        return b7 > -65;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0351  */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r46v0, types: [P.o] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(c0.InterfaceC0725m r37, C.A r38, A.L r39, w.I r40, boolean r41, v.C1717l r42, c0.C0715c r43, A.InterfaceC0010g r44, B5.c r45, P.C0371o r46, int r47, int r48) {
        /*
            r1 = r37
            r3 = r38
            r4 = r39
            r0 = r41
            r7 = r43
            r6 = r44
            r11 = r46
            r12 = r47
            r13 = r48
            r2 = 924924659(0x37213af3, float:9.610073E-6)
            r11.U(r2)
            r2 = r12 & 6
            if (r2 != 0) goto L27
            boolean r2 = r11.g(r1)
            if (r2 == 0) goto L24
            r2 = 4
            goto L25
        L24:
            r2 = 2
        L25:
            r2 = r2 | r12
            goto L28
        L27:
            r2 = r12
        L28:
            r8 = r12 & 48
            if (r8 != 0) goto L38
            boolean r8 = r11.g(r3)
            if (r8 == 0) goto L35
            r8 = 32
            goto L37
        L35:
            r8 = 16
        L37:
            r2 = r2 | r8
        L38:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L48
            boolean r8 = r11.g(r4)
            if (r8 == 0) goto L45
            r8 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r8 = 128(0x80, float:1.794E-43)
        L47:
            r2 = r2 | r8
        L48:
            r8 = r12 & 3072(0xc00, float:4.305E-42)
            r10 = 0
            r16 = 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L5b
            boolean r8 = r11.h(r10)
            if (r8 == 0) goto L58
            r8 = 2048(0x800, float:2.87E-42)
            goto L5a
        L58:
            r8 = r16
        L5a:
            r2 = r2 | r8
        L5b:
            r8 = r12 & 24576(0x6000, float:3.4438E-41)
            r10 = 1
            if (r8 != 0) goto L6c
            boolean r8 = r11.h(r10)
            if (r8 == 0) goto L69
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L6b
        L69:
            r8 = 8192(0x2000, float:1.14794E-41)
        L6b:
            r2 = r2 | r8
        L6c:
            r8 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 & r12
            if (r8 != 0) goto L81
            r8 = r40
            boolean r20 = r11.g(r8)
            if (r20 == 0) goto L7c
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L7e
        L7c:
            r20 = 65536(0x10000, float:9.18355E-41)
        L7e:
            r2 = r2 | r20
            goto L83
        L81:
            r8 = r40
        L83:
            r20 = 1572864(0x180000, float:2.204052E-39)
            r21 = r12 & r20
            if (r21 != 0) goto L96
            boolean r21 = r11.h(r0)
            if (r21 == 0) goto L92
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L94
        L92:
            r21 = 524288(0x80000, float:7.34684E-40)
        L94:
            r2 = r2 | r21
        L96:
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r22 = r12 & r21
            r5 = r42
            if (r22 != 0) goto Lab
            boolean r23 = r11.g(r5)
            if (r23 == 0) goto La7
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto La9
        La7:
            r23 = 4194304(0x400000, float:5.877472E-39)
        La9:
            r2 = r2 | r23
        Lab:
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 | r23
            r24 = 805306368(0x30000000, float:4.656613E-10)
            r25 = r12 & r24
            if (r25 != 0) goto Lc2
            boolean r25 = r11.g(r7)
            if (r25 == 0) goto Lbe
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lc0
        Lbe:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        Lc0:
            r2 = r2 | r25
        Lc2:
            r25 = r2
            r2 = r13 & 6
            if (r2 != 0) goto Ld6
            boolean r2 = r11.g(r6)
            if (r2 == 0) goto Ld1
            r17 = 4
            goto Ld3
        Ld1:
            r17 = 2
        Ld3:
            r2 = r13 | r17
            goto Ld7
        Ld6:
            r2 = r13
        Ld7:
            r2 = r2 | 432(0x1b0, float:6.05E-43)
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto Lea
            r9 = r45
            boolean r26 = r11.i(r9)
            if (r26 == 0) goto Le7
            r16 = 2048(0x800, float:2.87E-42)
        Le7:
            r2 = r2 | r16
            goto Lec
        Lea:
            r9 = r45
        Lec:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r25 & r16
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r15) goto Lff
            r10 = r2 & 1171(0x493, float:1.641E-42)
            r15 = 1170(0x492, float:1.64E-42)
            if (r10 == r15) goto Lfd
            goto Lff
        Lfd:
            r10 = 0
            goto L100
        Lff:
            r10 = 1
        L100:
            r15 = r25 & 1
            boolean r10 = r11.K(r15, r10)
            if (r10 == 0) goto L391
            int r10 = r25 >> 3
            r15 = r10 & 14
            int r10 = r2 >> 6
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | r15
            P.W r14 = P.C0345b.t(r45, r46)
            r27 = r10 & 14
            r28 = r2
            r2 = r27 ^ 6
            r5 = 4
            if (r2 <= r5) goto L124
            boolean r2 = r11.g(r3)
            if (r2 != 0) goto L128
        L124:
            r2 = r10 & 6
            if (r2 != r5) goto L12a
        L128:
            r2 = 1
            goto L12b
        L12a:
            r2 = 0
        L12b:
            java.lang.Object r5 = r11.H()
            P.S r10 = P.C0363k.f5418a
            if (r2 != 0) goto L135
            if (r5 != r10) goto L175
        L135:
            C.c r2 = new C.c
            r2.<init>()
            P.c0 r5 = new P.c0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r5.<init>(r8)
            r2.f596a = r5
            P.c0 r5 = new P.c0
            r5.<init>(r8)
            r2.f597b = r5
            P.S r5 = P.S.f5375t
            C.j r8 = new C.j
            r9 = 0
            r8.<init>(r14, r9)
            P.C r8 = P.C0345b.n(r8, r5)
            C.k r9 = new C.k
            r14 = 0
            r9.<init>(r8, r3, r2, r14)
            P.C r33 = P.C0345b.n(r9, r5)
            C.i r29 = new C.i
            r30 = 0
            r31 = 0
            java.lang.Class<P.S0> r32 = P.S0.class
            java.lang.String r34 = "value"
            java.lang.String r35 = "getValue()Ljava/lang/Object;"
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r5 = r29
            r11.d0(r5)
        L175:
            H5.h r5 = (H5.h) r5
            int r2 = r25 >> 9
            r8 = r2 & 112(0x70, float:1.57E-43)
            r8 = r8 | r15
            r9 = r8 & 14
            r9 = r9 ^ 6
            r14 = 4
            if (r9 <= r14) goto L189
            boolean r9 = r11.g(r3)
            if (r9 != 0) goto L18d
        L189:
            r9 = r8 & 6
            if (r9 != r14) goto L18f
        L18d:
            r9 = 1
            goto L190
        L18f:
            r9 = 0
        L190:
            r14 = r8 & 112(0x70, float:1.57E-43)
            r14 = r14 ^ 48
            r27 = r2
            r2 = 32
            if (r14 <= r2) goto L1a1
            r14 = 1
            boolean r16 = r11.h(r14)
            if (r16 != 0) goto L1a5
        L1a1:
            r8 = r8 & 48
            if (r8 != r2) goto L1a7
        L1a5:
            r14 = 1
            goto L1a8
        L1a7:
            r14 = 0
        L1a8:
            r2 = r9 | r14
            java.lang.Object r8 = r11.H()
            if (r2 != 0) goto L1b2
            if (r8 != r10) goto L1ba
        L1b2:
            C.d r8 = new C.d
            r8.<init>(r3)
            r11.d0(r8)
        L1ba:
            r14 = r8
            E.P r14 = (E.P) r14
            java.lang.Object r2 = r11.H()
            if (r2 != r10) goto L1ca
            M5.w r2 = P.C0345b.k(r11)
            r11.d0(r2)
        L1ca:
            M5.w r2 = (M5.InterfaceC0261w) r2
            P.T0 r8 = C0.AbstractC0103t0.f1115g
            java.lang.Object r8 = r11.k(r8)
            j0.t r8 = (j0.t) r8
            P.z r9 = C0.AbstractC0103t0.f1128v
            java.lang.Object r9 = r11.k(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r29 = r2
            if (r9 != 0) goto L1e7
            E.E r9 = E.f0.f1563a
            goto L1e8
        L1e7:
            r9 = 0
        L1e8:
            r30 = 65520(0xfff0, float:9.1813E-41)
            r30 = r25 & r30
            r31 = 458752(0x70000, float:6.42848E-40)
            r31 = r27 & r31
            r30 = r30 | r31
            r31 = 3670016(0x380000, float:5.142788E-39)
            r27 = r27 & r31
            r27 = r30 | r27
            int r30 = r28 << 18
            r32 = 29360128(0x1c00000, float:7.052966E-38)
            r33 = r30 & r32
            r27 = r27 | r33
            r33 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r30 & r33
            r27 = r27 | r30
            int r28 = r28 << 27
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r28 & r30
            r2 = r27 | r28
            r27 = r2 & 112(0x70, float:1.57E-43)
            r28 = r5
            r5 = r27 ^ 48
            r12 = 32
            if (r5 <= r12) goto L21f
            boolean r5 = r11.g(r3)
            if (r5 != 0) goto L223
        L21f:
            r5 = r2 & 48
            if (r5 != r12) goto L225
        L223:
            r5 = 1
            goto L226
        L225:
            r5 = 0
        L226:
            r12 = r2 & 896(0x380, float:1.256E-42)
            r12 = r12 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r12 <= r3) goto L234
            boolean r12 = r11.g(r4)
            if (r12 != 0) goto L238
        L234:
            r12 = r2 & 384(0x180, float:5.38E-43)
            if (r12 != r3) goto L23a
        L238:
            r3 = 1
            goto L23b
        L23a:
            r3 = 0
        L23b:
            r3 = r3 | r5
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 ^ 3072(0xc00, float:4.305E-42)
            r12 = 2048(0x800, float:2.87E-42)
            if (r5 <= r12) goto L24c
            r5 = 0
            boolean r18 = r11.h(r5)
            if (r18 != 0) goto L251
            goto L24d
        L24c:
            r5 = 0
        L24d:
            r5 = r2 & 3072(0xc00, float:4.305E-42)
            if (r5 != r12) goto L253
        L251:
            r5 = 1
            goto L254
        L253:
            r5 = 0
        L254:
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r2
            r5 = r5 ^ 24576(0x6000, float:3.4438E-41)
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r5 <= r12) goto L267
            r5 = 1
            boolean r19 = r11.h(r5)
            if (r19 != 0) goto L26c
            goto L268
        L267:
            r5 = 1
        L268:
            r5 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r5 != r12) goto L26e
        L26c:
            r5 = 1
            goto L26f
        L26e:
            r5 = 0
        L26f:
            r3 = r3 | r5
            r5 = r2 & r31
            r5 = r5 ^ r20
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r5 <= r12) goto L27e
            boolean r5 = r11.g(r7)
            if (r5 != 0) goto L282
        L27e:
            r5 = r2 & r20
            if (r5 != r12) goto L284
        L282:
            r5 = 1
            goto L285
        L284:
            r5 = 0
        L285:
            r3 = r3 | r5
            r5 = r2 & r32
            r5 = r5 ^ r21
            r12 = 8388608(0x800000, float:1.17549435E-38)
            if (r5 <= r12) goto L298
            r5 = 0
            boolean r12 = r11.g(r5)
            if (r12 != 0) goto L296
            goto L299
        L296:
            r12 = 1
            goto L29a
        L298:
            r5 = 0
        L299:
            r12 = 0
        L29a:
            r3 = r3 | r12
            r12 = r2 & r33
            r12 = r12 ^ r23
            r19 = r2
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 <= r2) goto L2ae
            boolean r2 = r11.g(r5)
            if (r2 != 0) goto L2ac
            goto L2ae
        L2ac:
            r2 = 1
            goto L2af
        L2ae:
            r2 = 0
        L2af:
            r2 = r2 | r3
            r3 = r19 & r30
            r3 = r3 ^ r24
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 <= r5) goto L2be
            boolean r3 = r11.g(r6)
            if (r3 != 0) goto L2c2
        L2be:
            r3 = r19 & r24
            if (r3 != r5) goto L2c4
        L2c2:
            r3 = 1
            goto L2c5
        L2c4:
            r3 = 0
        L2c5:
            r2 = r2 | r3
            boolean r3 = r11.g(r8)
            r2 = r2 | r3
            boolean r3 = r11.g(r9)
            r2 = r2 | r3
            java.lang.Object r3 = r11.H()
            if (r2 != 0) goto L2e4
            if (r3 != r10) goto L2d9
            goto L2e4
        L2d9:
            r2 = r3
            r36 = r10
            r10 = r28
            r12 = 0
            r26 = 1
            r3 = r38
            goto L2f9
        L2e4:
            C.o r2 = new C.o
            r3 = r38
            r36 = r10
            r5 = r28
            r12 = 0
            r26 = 1
            r10 = r7
            r7 = r29
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r10 = r5
            r11.d0(r2)
        L2f9:
            r17 = r2
            B5.e r17 = (B5.e) r17
            w.d0 r4 = w.EnumC1778d0.f17945q
            if (r0 == 0) goto L351
            r2 = -1513147781(0xffffffffa5cf327b, float:-3.5942983E-16)
            r11.S(r2)
            int r2 = r25 >> 21
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r15
            r5 = r2 & 14
            r5 = r5 ^ 6
            r6 = 4
            if (r5 <= r6) goto L319
            boolean r5 = r11.g(r3)
            if (r5 != 0) goto L31d
        L319:
            r5 = r2 & 6
            if (r5 != r6) goto L320
        L31d:
            r5 = r26
            goto L321
        L320:
            r5 = r12
        L321:
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 ^ 48
            r6 = 32
            if (r2 <= r6) goto L32f
            boolean r2 = r11.e(r12)
            if (r2 != 0) goto L331
        L32f:
            r26 = r12
        L331:
            r2 = r5 | r26
            java.lang.Object r5 = r11.H()
            if (r2 != 0) goto L33d
            r2 = r36
            if (r5 != r2) goto L345
        L33d:
            C.e r5 = new C.e
            r5.<init>(r3)
            r11.d0(r5)
        L345:
            C.e r5 = (C.e) r5
            E.k r2 = r3.f573n
            c0.m r2 = androidx.compose.foundation.lazy.layout.a.a(r5, r2, r4)
            r11.p(r12)
            goto L35c
        L351:
            r2 = -1512720880(0xffffffffa5d5b610, float:-3.707298E-16)
            r11.S(r2)
            r11.p(r12)
            c0.j r2 = c0.C0722j.f10095q
        L35c:
            C.x r5 = r3.f570k
            c0.m r5 = r1.d(r5)
            E.e r6 = r3.f571l
            c0.m r5 = r5.d(r6)
            c0.m r5 = androidx.compose.foundation.lazy.layout.a.b(r5, r10, r14, r4, r0)
            c0.m r2 = r5.d(r2)
            androidx.compose.foundation.lazy.layout.b r5 = r3.f572m
            c0.m r5 = r5.i
            c0.m r2 = r2.d(r5)
            y.i r7 = r3.f
            r9 = 0
            r6 = r40
            r8 = r42
            r5 = r0
            c0.m r0 = androidx.compose.foundation.a.f(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r3
            E.K r4 = r8.f574o
            r7 = 0
            r3 = r0
            r2 = r10
            r6 = r11
            r5 = r17
            E.C.a(r2, r3, r4, r5, r6, r7)
            goto L395
        L391:
            r8 = r3
            r46.N()
        L395:
            P.o0 r12 = r46.r()
            if (r12 == 0) goto L3b4
            C.l r0 = new C.l
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r9 = r45
            r10 = r47
            r2 = r8
            r11 = r13
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f5482d = r0
        L3b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.AbstractC1918b.a(c0.m, C.A, A.L, w.I, boolean, v.l, c0.c, A.g, B5.c, P.o, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(final boolean z5, final B5.e eVar, C0371o c0371o, final int i) {
        c0371o.U(1818896922);
        int i7 = (c0371o.h(z5) ? 4 : 2) | i | (c0371o.i(eVar) ? 32 : 16);
        if ((i7 & 19) == 18 && c0371o.x()) {
            c0371o.N();
        } else {
            AbstractC1397A.f(z5, eVar, c0371o, i7 & 126);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B5.e(z5, eVar, i) { // from class: V1.a

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ boolean f7955q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ e f7956r;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iW = C0345b.w(1);
                    AbstractC1918b.b(this.f7955q, this.f7956r, (C0371o) obj, iW);
                    return C1386y.f15098a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(g6.a aVar, g6.c cVar, String str) {
        g6.d.f13186h.getClass();
        g6.d.j.fine(cVar.f13182b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f13176a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(StringBuilder sb, int i) {
        for (int i7 = 0; i7 < i; i7++) {
            sb.append("?");
            if (i7 < i - 1) {
                sb.append(",");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String e(String str, int i, int i7) {
        if (i < 0) {
            return C3.a.H("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i7 >= 0) {
            return C3.a.H("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i7));
        }
        throw new IllegalArgumentException(k1.i.i(i7, "negative size: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(int i, int i7) {
        String strH;
        if (i < 0 || i >= i7) {
            if (i < 0) {
                strH = C3.a.H("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
            } else {
                if (i7 < 0) {
                    throw new IllegalArgumentException(k1.i.i(i7, "negative size: "));
                }
                strH = C3.a.H("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean g(R4.C0468k1 r17) {
        /*
            r0 = r17
            java.lang.String r1 = "dataObjects"
            kotlin.jvm.internal.m.e(r0, r1)
            R4.i r1 = r0.f7073d
            com.web2native.MainActivity r2 = r0.f7071c
            java.lang.String r3 = "onboarding_prefs"
            r4 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)
            java.lang.String r3 = "appLoadedFirstTime"
            boolean r5 = r2.getBoolean(r3, r4)
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L4a
            if (r1 == 0) goto L21
            R4.Y0 r5 = r1.f7000c
            goto L22
        L21:
            r5 = r7
        L22:
            if (r5 == 0) goto L4a
            if (r1 == 0) goto L33
            R4.Y0 r5 = r1.f7000c
            if (r5 == 0) goto L33
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = r5.f6895c
            boolean r5 = r8.equals(r5)
            goto L34
        L33:
            r5 = r4
        L34:
            if (r5 == 0) goto L4a
            if (r1 == 0) goto L45
            R4.Y0 r5 = r1.f7000c
            if (r5 == 0) goto L45
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = r5.f6893a
            boolean r5 = r8.equals(r5)
            goto L46
        L45:
            r5 = r4
        L46:
            if (r5 == 0) goto L4a
            r5 = r6
            goto L4b
        L4a:
            r5 = r4
        L4b:
            if (r5 == 0) goto L58
            android.content.SharedPreferences$Editor r8 = r2.edit()
            android.content.SharedPreferences$Editor r3 = r8.putBoolean(r3, r6)
            r3.apply()
        L58:
            if (r1 == 0) goto L5d
            R4.Y0 r3 = r1.f7000c
            goto L5e
        L5d:
            r3 = r7
        L5e:
            r8 = 0
            java.lang.String r10 = "appStartingDay"
            if (r3 == 0) goto Lc5
            if (r1 == 0) goto L6d
            R4.Y0 r3 = r1.f7000c
            if (r3 == 0) goto L6d
            java.lang.Integer r3 = r3.f6894b
            goto L6e
        L6d:
            r3 = r7
        L6e:
            kotlin.jvm.internal.m.b(r3)
            int r3 = r3.intValue()
            long r11 = r2.getLong(r10, r8)
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L7f
        L7d:
            r3 = r6
            goto L99
        L7f:
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r11
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r11 = r11.toDays(r13)
            long r13 = (long) r3
            long r11 = r13 - r11
            r15 = 1
            int r3 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r3 < 0) goto L98
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 > 0) goto L98
            goto L7d
        L98:
            r3 = r4
        L99:
            if (r3 == 0) goto Lc5
            if (r1 == 0) goto Laa
            R4.Y0 r3 = r1.f7000c
            if (r3 == 0) goto Laa
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = r3.f6895c
            boolean r3 = r11.equals(r3)
            goto Lab
        Laa:
            r3 = r4
        Lab:
            if (r3 == 0) goto Lc5
            if (r1 == 0) goto Lc0
            R4.Y0 r3 = r1.f7000c
            if (r3 == 0) goto Lc0
            java.lang.Integer r3 = r3.f6894b
            if (r3 != 0) goto Lb8
            goto Lc0
        Lb8:
            int r3 = r3.intValue()
            if (r3 != 0) goto Lc0
            r3 = r6
            goto Lc1
        Lc0:
            r3 = r4
        Lc1:
            if (r3 != 0) goto Lc5
            r3 = r6
            goto Lc6
        Lc5:
            r3 = r4
        Lc6:
            if (r3 == 0) goto Ldf
            long r11 = r2.getLong(r10, r8)
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 != 0) goto Ldf
            long r8 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putLong(r10, r8)
            r2.apply()
        Ldf:
            if (r1 == 0) goto Le4
            R4.Y0 r2 = r1.f7000c
            goto Le5
        Le4:
            r2 = r7
        Le5:
            if (r2 == 0) goto L108
            if (r1 == 0) goto Lf6
            R4.Y0 r2 = r1.f7000c
            if (r2 == 0) goto Lf6
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = r2.f6895c
            boolean r2 = r8.equals(r2)
            goto Lf7
        Lf6:
            r2 = r4
        Lf7:
            if (r2 == 0) goto L108
            if (r5 != 0) goto L108
            if (r3 != 0) goto L108
            O3.D r0 = r0.f7054N
            if (r0 == 0) goto L102
            goto L108
        L102:
            java.lang.String r0 = "inAppPurchaseUtil"
            kotlin.jvm.internal.m.k(r0)
            throw r7
        L108:
            if (r1 == 0) goto L10d
            R4.Y0 r0 = r1.f7000c
            goto L10e
        L10d:
            r0 = r7
        L10e:
            if (r0 == 0) goto L126
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == 0) goto L116
            R4.Y0 r7 = r1.f7000c
        L116:
            kotlin.jvm.internal.m.b(r7)
            java.lang.Boolean r1 = r7.f6895c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L126
            if (r5 != 0) goto L126
            if (r3 != 0) goto L126
            return r6
        L126:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.AbstractC1918b.g(R4.k1):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(int i, int i7) {
        if (i < 0 || i > i7) {
            throw new IndexOutOfBoundsException(e(FirebaseAnalytics.Param.INDEX, i, i7));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(int i, int i7, int i8) {
        if (i < 0 || i7 < i || i7 > i8) {
            throw new IndexOutOfBoundsException((i < 0 || i > i8) ? e("start index", i, i8) : (i7 < 0 || i7 > i8) ? e("end index", i7, i8) : C3.a.H("end index (%s) must not be less than start index (%s)", Integer.valueOf(i7), Integer.valueOf(i)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(long j, EnumC1778d0 enumC1778d0) {
        if (enumC1778d0 == EnumC1778d0.f17945q) {
            if (W0.a.g(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC1923a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (W0.a.h(j) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC1923a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Boolean k(String str, List regexList) {
        kotlin.jvm.internal.m.e(regexList, "regexList");
        Boolean bool = Boolean.FALSE;
        Iterator it = regexList.iterator();
        while (it.hasNext()) {
            C1143a c1143a = (C1143a) it.next();
            String str2 = c1143a.f13642c;
            String str3 = c1143a.f13641b;
            String str4 = c1143a.f13640a;
            Pattern patternCompile = Pattern.compile(str2, 66);
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            if (str3.equals("ALL_PAGES")) {
                return s(str4);
            }
            if (str3.equals("MULTIPLE_PAGE") && patternCompile.matcher(str).find()) {
                return s(str4);
            }
            if (str3.equals("SINGLE_PAGE") && patternCompile.matcher(str).matches()) {
                return s(str4);
            }
            if (str3.equals("CUSTOM") && patternCompile.matcher(str).find()) {
                return s(str4);
            }
        }
        return bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (D5.a.u(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap l(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, V2.h r10, V2.g r11, boolean r12) {
        /*
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L4e
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r9 == 0) goto L21
            boolean r5 = l6.d.v(r9)
            if (r5 == 0) goto L1f
            goto L21
        L1f:
            r5 = r9
            goto L23
        L21:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L23:
            if (r4 != r5) goto L4e
            if (r12 == 0) goto L28
            goto L4d
        L28:
            int r12 = r0.getWidth()
            int r4 = r0.getHeight()
            V2.h r5 = V2.h.f7964c
            long r4 = D5.a.t(r12, r4, r10, r11, r5)
            long r6 = r4 >> r3
            int r12 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            double r4 = D5.a.u(r5, r6, r12, r4, r11)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L4e
        L4d:
            return r0
        L4e:
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r12 = Y2.j.b(r8)
            r0 = 512(0x200, float:7.175E-43)
            if (r12 <= 0) goto L5b
            goto L5c
        L5b:
            r12 = r0
        L5c:
            int r4 = Y2.j.a(r8)
            if (r4 <= 0) goto L63
            r0 = r4
        L63:
            V2.h r4 = V2.h.f7964c
            long r4 = D5.a.t(r12, r0, r10, r11, r4)
            long r6 = r4 >> r3
            int r10 = (int) r6
            long r1 = r1 & r4
            int r1 = (int) r1
            double r10 = D5.a.u(r12, r0, r10, r1, r11)
            double r1 = (double) r12
            double r1 = r1 * r10
            int r12 = D5.a.F(r1)
            double r0 = (double) r0
            double r10 = r10 * r0
            int r10 = D5.a.F(r10)
            if (r9 == 0) goto L86
            boolean r11 = l6.d.v(r9)
            if (r11 == 0) goto L88
        L86:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L88:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r10, r9)
            android.graphics.Rect r11 = r8.getBounds()
            int r0 = r11.left
            int r1 = r11.top
            int r2 = r11.right
            int r11 = r11.bottom
            r3 = 0
            r8.setBounds(r3, r3, r12, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r8.draw(r10)
            r8.setBounds(r0, r1, r2, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.AbstractC1918b.l(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, V2.h, V2.g, boolean):android.graphics.Bitmap");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int n(int i, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i7 <= i) {
            return i;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i7) {
            iHighestOneBit = Integer.highestOneBit(i7 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int o(int i, List list) {
        int i7;
        int i8 = ((n) n5.l.r0(list)).f3159c;
        if (i > ((n) n5.l.r0(list)).f3159c) {
            Q0.a.a("Index " + i + " should be less or equal than last line's end " + i8);
        }
        int size = list.size() - 1;
        int i9 = 0;
        while (true) {
            if (i9 > size) {
                i7 = -(i9 + 1);
                break;
            }
            i7 = (i9 + size) >>> 1;
            n nVar = (n) list.get(i7);
            byte b7 = nVar.f3158b > i ? (byte) 1 : nVar.f3159c <= i ? (byte) -1 : (byte) 0;
            if (b7 >= 0) {
                if (b7 <= 0) {
                    break;
                }
                size = i7 - 1;
            } else {
                i9 = i7 + 1;
            }
        }
        if (i7 >= 0 && i7 < list.size()) {
            return i7;
        }
        StringBuilder sbL = k1.i.l("Found paragraph index ", " should be in range [0, ", i7);
        sbL.append(list.size());
        sbL.append(").\nDebug info: index=");
        sbL.append(i);
        sbL.append(", paragraphs=[");
        sbL.append(Y0.a.a(31, null, list));
        sbL.append(']');
        Q0.a.a(sbL.toString());
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int p(int i, List list) {
        int size = list.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            n nVar = (n) list.get(i8);
            byte b7 = nVar.f3160d > i ? (byte) 1 : nVar.f3161e <= i ? (byte) -1 : (byte) 0;
            if (b7 < 0) {
                i7 = i8 + 1;
            } else {
                if (b7 <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String q(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Boolean s(String str) {
        if (str.equals("EXTERNAL")) {
            return Boolean.TRUE;
        }
        if (str.equals("CUSTOM")) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int t(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(k1.i.i(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String v(MainActivity mainActivity) {
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = mainActivity.getAssets().open("appConfig.json");
        } catch (IOException unused) {
            inputStreamOpen = null;
        }
        if (inputStreamOpen == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            Charset charsetForName = Charset.forName("UTF-8");
            kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
            return new String(bArr, charsetForName);
        } catch (IOException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void w(String str, WebView view, HashMap customHeaders, C0468k1 dataObject) {
        kotlin.jvm.internal.m.e(view, "view");
        kotlin.jvm.internal.m.e(customHeaders, "customHeaders");
        kotlin.jvm.internal.m.e(dataObject, "dataObject");
        try {
            if (t.G0(str, "w2n://", false)) {
                C3.a.C(dataObject, str);
                return;
            }
            WebBackForwardList webBackForwardListCopyBackForwardList = view.copyBackForwardList();
            kotlin.jvm.internal.m.d(webBackForwardListCopyBackForwardList, "copyBackForwardList(...)");
            if (webBackForwardListCopyBackForwardList.getCurrentIndex() <= 0) {
                if (customHeaders.isEmpty()) {
                    view.loadUrl(str);
                    return;
                } else {
                    view.loadUrl(str, customHeaders);
                    return;
                }
            }
            String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
            HashMap map = new HashMap();
            map.put("Referer", url);
            if (!customHeaders.isEmpty()) {
                map.putAll(customHeaders);
            }
            view.loadUrl(str, map);
        } catch (Exception unused) {
            view.loadUrl(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int x(ArrayList arrayList, String str) {
        int size = arrayList.size();
        int i = -1;
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            int i9 = i7 + 1;
            if (i7 < 0) {
                AbstractC0836n2.N();
                throw null;
            }
            String pattern = (String) obj;
            kotlin.jvm.internal.m.e(pattern, "pattern");
            Pattern patternCompile = Pattern.compile(pattern, 66);
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            if (patternCompile.matcher(String.valueOf(str)).matches() || (!t.A0((String) arrayList.get(i7), "$))", false) && !t.A0((String) arrayList.get(i7), "$)", false) && patternCompile.matcher(String.valueOf(str)).find())) {
                i = i7;
            }
            i7 = i9;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static F1.b y(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i7 = 0;
        while (true) {
            if (i7 >= i) {
                j = -1;
                break;
            }
            int i8 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i8) {
                break;
            }
            i7++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i9 = 0; i9 < j7; i9++) {
                int i10 = byteBufferDuplicate.getInt();
                long j8 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i10 || 1701669481 == i10) {
                    byteBufferDuplicate.position((int) (j8 + j));
                    F1.b bVar = new F1.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f1944t = byteBufferDuplicate;
                    bVar.f1941q = iPosition;
                    int i11 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f1942r = i11;
                    bVar.f1943s = ((ByteBuffer) bVar.f1944t).getShort(i11);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void z(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public abstract void r(C1416b c1416b, float f, float f7);

    public abstract void u(Object obj);
}
