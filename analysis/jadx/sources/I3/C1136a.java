package i3;

import E.c0;
import J1.A;
import P5.H;
import android.content.ClipData;
import android.os.Build;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.measurement.O1;
import e4.C1055e;
import i1.C1134a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k3.C1186a;
import l.InterfaceC1207j;
import l.MenuC1209l;
import m.InterfaceC1318m;
import r.C1566q;
import r5.EnumC1580a;
import t.AbstractC1599H;
import t.K;
import u.AbstractC1644d;
import u.AbstractC1663q;
import u.C0;
import u.C1623B;
import u.C1649f0;
import u.E0;
import u.InterfaceC1622A;
import u.r;
import u2.C1692m;
import u2.C1693n;
import v0.C1743l;
import v0.C1744m;
import v0.C1745n;
import w.InterfaceC1788i0;
import w1.C1856t;
import w1.InterfaceC1842e;
import w2.C1863a;
import w2.C1864b;
import w2.C1867e;
import x.AbstractC1880l;
import x.C1869a;
import x.C1875g;
import x.InterfaceC1870b;
import x3.AbstractC1893e;
import x3.InterfaceC1891c;
import x3.InterfaceC1892d;
import z4.InterfaceC1969c;

/* JADX INFO: renamed from: i3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1136a implements InterfaceC1207j, InterfaceC1318m, r, E0, E2.i, InterfaceC1842e, InterfaceC1870b, InterfaceC1892d, InterfaceC1891c, InterfaceC1969c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f13562r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [n1.e.a(android.content.Context, m1.d, android.content.res.Resources, int, java.lang.String, int, int, m1.b, boolean):android.graphics.Typeface] */
    public /* synthetic */ C1136a(int i) {
        this.f13561q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:344:0x052d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:355:0x065c */
    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r25v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r25v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r25v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r25v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r25v5, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r26v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r26v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r26v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r26v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r26v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r26v5, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x040a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList r(i3.C1136a r38, java.lang.String r39) {
        /*
            r0 = r38
            r1 = r39
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length()
            r5 = 0
        Le:
            r6 = 32
            if (r5 >= r3) goto L1f
            char r7 = r1.charAt(r5)
            int r7 = kotlin.jvm.internal.m.f(r7, r6)
            if (r7 > 0) goto L1f
            int r5 = r5 + 1
            goto Le
        L1f:
            if (r3 <= r5) goto L30
            int r7 = r3 + (-1)
            char r7 = r1.charAt(r7)
            int r7 = kotlin.jvm.internal.m.f(r7, r6)
            if (r7 > 0) goto L30
            int r3 = r3 + (-1)
            goto L1f
        L30:
            r7 = 0
        L31:
            if (r5 >= r3) goto L67a
        L33:
            int r8 = r5 + 1
            char r5 = r1.charAt(r5)
            r9 = r5 | 32
            int r10 = r9 + (-97)
            int r11 = r9 + (-122)
            int r11 = r11 * r10
            r10 = 101(0x65, float:1.42E-43)
            if (r11 > 0) goto L47
            if (r9 == r10) goto L47
            goto L4a
        L47:
            if (r8 < r3) goto L677
            r5 = 0
        L4a:
            if (r5 == 0) goto L674
            r9 = r5 | 32
            r12 = 122(0x7a, float:1.71E-43)
            if (r9 == r12) goto L406
            r7 = 0
        L53:
            if (r8 >= r3) goto L62
            char r9 = r1.charAt(r8)
            int r9 = kotlin.jvm.internal.m.f(r9, r6)
            if (r9 > 0) goto L62
            int r8 = r8 + 1
            goto L53
        L62:
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r9 = 2143289344(0x7fc00000, float:NaN)
            if (r8 != r3) goto L7f
            r12 = r6
            r16 = r7
            long r6 = (long) r8
            long r6 = r6 << r12
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            long r8 = r8 & r14
            long r6 = r6 | r8
            r19 = r12
        L79:
            r21 = r14
            r20 = 1
            goto L3be
        L7f:
            r12 = r6
            r16 = r7
            char r6 = r1.charAt(r8)
            r7 = 45
            if (r6 != r7) goto L8f
            r17 = 1
        L8c:
            r18 = r9
            goto L92
        L8f:
            r17 = 0
            goto L8c
        L92:
            r9 = 46
            r19 = r12
            r12 = 10
            if (r17 == 0) goto Lc6
            int r6 = r8 + 1
            if (r6 != r3) goto La9
            long r6 = (long) r6
            long r6 = r6 << r19
            int r8 = java.lang.Float.floatToRawIntBits(r18)
            long r8 = (long) r8
            long r8 = r8 & r14
            long r6 = r6 | r8
            goto L79
        La9:
            r20 = 1
            char r13 = r1.charAt(r6)
            r21 = r14
            int r14 = r13 + (-48)
            char r14 = (char) r14
            if (r14 >= r12) goto Lb7
            goto Lcc
        Lb7:
            if (r13 == r9) goto Lcc
            long r6 = (long) r6
            long r6 = r6 << r19
            int r8 = java.lang.Float.floatToRawIntBits(r18)
            long r8 = (long) r8
        Lc1:
            long r8 = r8 & r21
            long r6 = r6 | r8
            goto L3be
        Lc6:
            r21 = r14
            r20 = 1
            r13 = r6
            r6 = r8
        Lcc:
            int r14 = r1.length()
            r23 = 0
            r15 = r6
            r25 = r23
        Ld5:
            r27 = 10
            if (r15 == r3) goto Lf3
            int r11 = r13 + (-48)
            char r4 = (char) r11
            if (r4 >= r12) goto Lf3
            long r25 = r25 * r27
            r4 = r8
            long r7 = (long) r11
            long r25 = r25 + r7
            int r15 = r15 + 1
            if (r15 >= r14) goto Lee
            char r7 = r1.charAt(r15)
            r13 = r7
            goto Lef
        Lee:
            r13 = 0
        Lef:
            r8 = r4
            r7 = 45
            goto Ld5
        Lf3:
            r4 = r8
            int r7 = r15 - r6
            if (r15 == r3) goto L18e
            if (r13 != r9) goto L18e
            int r13 = r15 + 1
            r8 = r13
            r31 = 16
        Lff:
            int r9 = r3 - r8
            r33 = 48
            r11 = 4
            if (r9 < r11) goto L163
            char r9 = r1.charAt(r8)
            long r10 = (long) r9
            int r9 = r8 + 1
            char r9 = r1.charAt(r9)
            r35 = r13
            long r12 = (long) r9
            long r12 = r12 << r31
            long r9 = r10 | r12
            int r11 = r8 + 2
            char r11 = r1.charAt(r11)
            long r11 = (long) r11
            long r11 = r11 << r19
            long r9 = r9 | r11
            int r11 = r8 + 3
            char r11 = r1.charAt(r11)
            long r11 = (long) r11
            long r11 = r11 << r33
            long r9 = r9 | r11
            r11 = 13511005043687472(0x30003000300030, double:8.90070286343755E-308)
            long r11 = r9 - r11
            r36 = 19703549022044230(0x46004600460046, double:2.447700077935472E-307)
            long r9 = r9 + r36
            long r9 = r9 | r11
            r36 = -35747867511423104(0xff80ff80ff80ff80, double:-1.4920556421249022E306)
            long r9 = r9 & r36
            int r9 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r9 == 0) goto L148
            r9 = -1
            goto L151
        L148:
            r9 = 281475406208040961(0x3e80064000a0001, double:7.696495802097085E-290)
            long r11 = r11 * r9
            long r9 = r11 >>> r33
            int r9 = (int) r9
        L151:
            if (r9 < 0) goto L165
            r10 = 10000(0x2710, double:4.9407E-320)
            long r25 = r25 * r10
            long r9 = (long) r9
            long r25 = r25 + r9
            int r8 = r8 + 4
            r13 = r35
            r10 = 101(0x65, float:1.42E-43)
            r12 = 10
            goto Lff
        L163:
            r35 = r13
        L165:
            if (r8 >= r14) goto L16c
            char r9 = r1.charAt(r8)
            goto L16d
        L16c:
            r9 = 0
        L16d:
            r13 = r9
        L16e:
            if (r8 == r3) goto L187
            int r9 = r13 + (-48)
            char r10 = (char) r9
            r11 = 10
            if (r10 >= r11) goto L187
            long r25 = r25 * r27
            long r9 = (long) r9
            long r25 = r25 + r9
            int r8 = r8 + 1
            if (r8 >= r14) goto L185
            char r9 = r1.charAt(r8)
            goto L16d
        L185:
            r13 = 0
            goto L16e
        L187:
            int r9 = r35 - r8
            int r7 = r7 - r9
            r10 = r9
            r9 = r35
            goto L195
        L18e:
            r31 = 16
            r33 = 48
            r8 = r15
            r9 = r8
            r10 = 0
        L195:
            if (r7 != 0) goto L1a1
            long r6 = (long) r8
            long r6 = r6 << r19
            int r4 = java.lang.Float.floatToRawIntBits(r18)
        L19e:
            long r8 = (long) r4
            goto Lc1
        L1a1:
            r11 = r13 | 32
            r13 = 101(0x65, float:1.42E-43)
            if (r11 != r13) goto L1f8
            int r11 = r8 + 1
            if (r11 >= r14) goto L1b4
            char r18 = r1.charAt(r11)
            r13 = r18
        L1b1:
            r12 = 45
            goto L1b6
        L1b4:
            r13 = 0
            goto L1b1
        L1b6:
            if (r13 != r12) goto L1bb
            r12 = r20
            goto L1bc
        L1bb:
            r12 = 0
        L1bc:
            r30 = r4
            if (r12 != 0) goto L1c4
            r4 = 43
            if (r13 != r4) goto L1c6
        L1c4:
            int r11 = r8 + 2
        L1c6:
            char r4 = r1.charAt(r11)
            r13 = 0
        L1cb:
            if (r11 == r3) goto L1ee
            int r4 = r4 + (-48)
            r35 = r10
            char r10 = (char) r4
            r36 = r4
            r4 = 10
            if (r10 >= r4) goto L1f0
            r10 = 1024(0x400, float:1.435E-42)
            if (r13 >= r10) goto L1e0
            int r13 = r13 * 10
            int r13 = r13 + r36
        L1e0:
            int r11 = r11 + 1
            if (r11 >= r14) goto L1e9
            char r10 = r1.charAt(r11)
            goto L1ea
        L1e9:
            r10 = 0
        L1ea:
            r4 = r10
            r10 = r35
            goto L1cb
        L1ee:
            r35 = r10
        L1f0:
            if (r12 == 0) goto L1f4
            int r4 = -r13
            goto L1f5
        L1f4:
            r4 = r13
        L1f5:
            int r10 = r35 + r4
            goto L1fe
        L1f8:
            r30 = r4
            r35 = r10
            r11 = r8
            r4 = 0
        L1fe:
            r12 = 19
            r34 = -9223372036854775808
            if (r7 <= r12) goto L297
            char r13 = r1.charAt(r6)
            r36 = r6
        L20a:
            if (r11 == r3) goto L22f
            r12 = r33
            if (r13 == r12) goto L214
            r12 = 46
            if (r13 != r12) goto L217
        L214:
            r12 = 48
            goto L21a
        L217:
            r12 = 19
            goto L22f
        L21a:
            if (r13 != r12) goto L21e
            int r7 = r7 + (-1)
        L21e:
            int r12 = r36 + 1
            if (r12 >= r14) goto L227
            char r13 = r1.charAt(r12)
            goto L228
        L227:
            r13 = 0
        L228:
            r36 = r12
            r12 = 19
            r33 = 48
            goto L20a
        L22f:
            if (r7 <= r12) goto L297
            char r7 = r1.charAt(r6)
            r25 = r23
        L237:
            r12 = -8223372036854775808(0x8de0b6b3a7640000, double:-7.832953389245686E-242)
            r10 = r6
            if (r6 == r15) goto L25d
            r32 = r7
            long r6 = r25 ^ r34
            int r6 = java.lang.Long.compare(r6, r12)
            if (r6 >= 0) goto L25d
            long r25 = r25 * r27
            r33 = 48
            int r7 = r32 + (-48)
            long r6 = (long) r7
            long r25 = r25 + r6
            int r6 = r10 + 1
            if (r6 >= r14) goto L25b
            char r7 = r1.charAt(r6)
            goto L237
        L25b:
            r7 = 0
            goto L237
        L25d:
            long r6 = r25 ^ r34
            int r6 = java.lang.Long.compare(r6, r12)
            if (r6 < 0) goto L26d
            int r15 = r15 - r10
            int r10 = r15 + r4
        L268:
            r4 = r20
            r6 = r25
            goto L29a
        L26d:
            char r6 = r1.charAt(r9)
            r7 = r9
        L272:
            if (r7 == r8) goto L292
            r10 = r6
            r15 = r7
            long r6 = r25 ^ r34
            int r6 = java.lang.Long.compare(r6, r12)
            if (r6 >= 0) goto L293
            long r25 = r25 * r27
            r33 = 48
            int r6 = r10 + (-48)
            long r6 = (long) r6
            long r25 = r25 + r6
            int r7 = r15 + 1
            if (r7 >= r14) goto L290
            char r6 = r1.charAt(r7)
            goto L272
        L290:
            r6 = 0
            goto L272
        L292:
            r15 = r7
        L293:
            int r9 = r9 - r15
            int r10 = r9 + r4
            goto L268
        L297:
            r6 = r25
            r4 = 0
        L29a:
            r8 = -10
            if (r8 > r10) goto L2ca
            r8 = 11
            if (r10 >= r8) goto L2ca
            if (r4 != 0) goto L2ca
            long r8 = r6 ^ r34
            r12 = -9223372036837998592(0x8000000001000000, double:-8.289046E-317)
            int r4 = java.lang.Long.compare(r8, r12)
            if (r4 > 0) goto L2ca
            float r4 = (float) r6
            float[] r6 = p0.AbstractC1434b.f15524a
            if (r10 >= 0) goto L2bb
            int r7 = -r10
            r6 = r6[r7]
            float r4 = r4 / r6
            goto L2be
        L2bb:
            r6 = r6[r10]
            float r4 = r4 * r6
        L2be:
            if (r17 == 0) goto L2c1
            float r4 = -r4
        L2c1:
            long r6 = (long) r11
            long r6 = r6 << r19
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            goto L19e
        L2ca:
            int r4 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r4 != 0) goto L2dd
            if (r17 == 0) goto L2d3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L2d4
        L2d3:
            r4 = 0
        L2d4:
            long r6 = (long) r11
            long r6 = r6 << r19
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            goto L19e
        L2dd:
            r4 = -126(0xffffffffffffff82, float:NaN)
            java.lang.String r8 = "substring(...)"
            if (r4 > r10) goto L3a8
            r4 = 128(0x80, float:1.794E-43)
            if (r10 >= r4) goto L3a8
            int r4 = r10 + 325
            long[] r9 = p0.AbstractC1434b.f15525b
            r12 = r9[r4]
            int r4 = java.lang.Long.numberOfLeadingZeros(r6)
            long r6 = r6 << r4
            long r14 = r6 & r21
            long r6 = r6 >>> r19
            long r25 = r12 & r21
            long r12 = r12 >>> r19
            long r27 = r6 * r12
            long r12 = r12 * r14
            long r6 = r6 * r25
            long r14 = r14 * r25
            long r14 = r14 >>> r19
            long r6 = r6 + r14
            long r14 = r12 & r21
            long r6 = r6 + r14
            long r6 = r6 >>> r19
            long r27 = r27 + r6
            long r6 = r12 >>> r19
            long r27 = r27 + r6
            r6 = 63
            long r12 = r27 >>> r6
            int r7 = (int) r12
            int r9 = r7 + 9
            long r12 = r27 >>> r9
            r7 = r7 ^ 1
            int r4 = r4 + r7
            r14 = 511(0x1ff, double:2.525E-321)
            long r25 = r27 & r14
            int r7 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r7 == 0) goto L331
            int r7 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            r14 = 1
            if (r7 != 0) goto L334
            r25 = 3
            long r25 = r12 & r25
            int r7 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r7 != 0) goto L334
        L331:
            r4 = r30
            goto L394
        L334:
            long r12 = r12 + r14
            long r12 = r12 >>> r20
            r25 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            int r7 = (r12 > r25 ? 1 : (r12 == r25 ? 0 : -1))
            if (r7 < 0) goto L341
            int r4 = r4 + (-1)
            r12 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
        L341:
            r25 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            long r12 = r12 & r25
            r25 = 217706(0x3526a, double:1.07561E-318)
            long r9 = (long) r10
            long r9 = r9 * r25
            long r9 = r9 >> r31
            r25 = r14
            r7 = 1024(0x400, float:1.435E-42)
            long r14 = (long) r7
            long r9 = r9 + r14
            long r6 = (long) r6
            long r9 = r9 + r6
            long r6 = (long) r4
            long r9 = r9 - r6
            int r4 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r4 < 0) goto L364
            r6 = 2046(0x7fe, double:1.011E-320)
            int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r4 <= 0) goto L367
        L364:
            r4 = r30
            goto L380
        L367:
            r4 = 52
            long r6 = r9 << r4
            long r6 = r6 | r12
            if (r17 == 0) goto L370
            r23 = r34
        L370:
            long r6 = r6 | r23
            double r6 = java.lang.Double.longBitsToDouble(r6)
            float r4 = (float) r6
            long r6 = (long) r11
            long r6 = r6 << r19
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            goto L19e
        L380:
            java.lang.String r4 = r1.substring(r4, r11)
            kotlin.jvm.internal.m.d(r4, r8)
            float r4 = java.lang.Float.parseFloat(r4)
            long r6 = (long) r11
            long r6 = r6 << r19
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            goto L19e
        L394:
            java.lang.String r4 = r1.substring(r4, r11)
            kotlin.jvm.internal.m.d(r4, r8)
            float r4 = java.lang.Float.parseFloat(r4)
            long r6 = (long) r11
            long r6 = r6 << r19
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            goto L19e
        L3a8:
            r4 = r30
            java.lang.String r4 = r1.substring(r4, r11)
            kotlin.jvm.internal.m.d(r4, r8)
            float r4 = java.lang.Float.parseFloat(r4)
            long r6 = (long) r11
            long r6 = r6 << r19
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            goto L19e
        L3be:
            long r8 = r6 >>> r19
            int r4 = (int) r8
            long r6 = r6 & r21
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 != 0) goto L3e7
            java.lang.Object r7 = r0.f13562r
            float[] r7 = (float[]) r7
            int r8 = r16 + 1
            r7[r16] = r6
            int r9 = r7.length
            if (r8 < r9) goto L3e4
            int r9 = r8 * 2
            float[] r9 = new float[r9]
            r0.f13562r = r9
            int r10 = r7.length
            r11 = 0
            java.lang.System.arraycopy(r7, r11, r9, r11, r10)
        L3e4:
            r7 = r8
            r8 = r4
            goto L3ea
        L3e7:
            r8 = r4
            r7 = r16
        L3ea:
            if (r8 >= r3) goto L3f7
            char r4 = r1.charAt(r8)
            r9 = 44
            if (r4 != r9) goto L3f7
            int r8 = r8 + 1
            goto L3ea
        L3f7:
            if (r8 >= r3) goto L40a
            boolean r4 = java.lang.Float.isNaN(r6)
            if (r4 == 0) goto L400
            goto L40a
        L400:
            r6 = r19
            r10 = 101(0x65, float:1.42E-43)
            goto L53
        L406:
            r19 = r6
            r20 = 1
        L40a:
            java.lang.Object r4 = r0.f13562r
            float[] r4 = (float[]) r4
            r6 = 2
            switch(r5) {
                case 65: goto L629;
                case 67: goto L600;
                case 72: goto L5eb;
                case 76: goto L5d2;
                case 77: goto L5ad;
                case 81: goto L58f;
                case 83: goto L571;
                case 84: goto L55b;
                case 86: goto L549;
                case 90: goto L540;
                case 97: goto L4fd;
                case 99: goto L4d7;
                case 104: goto L4c5;
                case 108: goto L4af;
                case 109: goto L48a;
                case 113: goto L46c;
                case 115: goto L44e;
                case 116: goto L438;
                case 118: goto L426;
                case 122: goto L540;
                default: goto L412;
            }
        L412:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown command for: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L426:
            int r5 = r7 + (-1)
            r6 = 0
        L429:
            if (r6 > r5) goto L545
            p0.y r9 = new p0.y
            r10 = r4[r6]
            r9.<init>(r10)
            r2.add(r9)
            int r6 = r6 + 1
            goto L429
        L438:
            int r5 = r7 + (-2)
            r6 = 0
        L43b:
            if (r6 > r5) goto L545
            p0.x r9 = new p0.x
            r10 = r4[r6]
            int r11 = r6 + 1
            r11 = r4[r11]
            r9.<init>(r10, r11)
            r2.add(r9)
            int r6 = r6 + 2
            goto L43b
        L44e:
            int r5 = r7 + (-4)
            r6 = 0
        L451:
            if (r6 > r5) goto L545
            p0.w r9 = new p0.w
            r10 = r4[r6]
            int r11 = r6 + 1
            r11 = r4[r11]
            int r12 = r6 + 2
            r12 = r4[r12]
            int r13 = r6 + 3
            r13 = r4[r13]
            r9.<init>(r10, r11, r12, r13)
            r2.add(r9)
            int r6 = r6 + 4
            goto L451
        L46c:
            int r5 = r7 + (-4)
            r6 = 0
        L46f:
            if (r6 > r5) goto L545
            p0.v r9 = new p0.v
            r10 = r4[r6]
            int r11 = r6 + 1
            r11 = r4[r11]
            int r12 = r6 + 2
            r12 = r4[r12]
            int r13 = r6 + 3
            r13 = r4[r13]
            r9.<init>(r10, r11, r12, r13)
            r2.add(r9)
            int r6 = r6 + 4
            goto L46f
        L48a:
            int r5 = r7 + (-2)
            if (r5 < 0) goto L545
            p0.u r9 = new p0.u
            r29 = 0
            r10 = r4[r29]
            r11 = r4[r20]
            r9.<init>(r10, r11)
            r2.add(r9)
        L49c:
            if (r6 > r5) goto L545
            p0.t r9 = new p0.t
            r10 = r4[r6]
            int r11 = r6 + 1
            r11 = r4[r11]
            r9.<init>(r10, r11)
            r2.add(r9)
            int r6 = r6 + 2
            goto L49c
        L4af:
            int r5 = r7 + (-2)
            r11 = 0
        L4b2:
            if (r11 > r5) goto L545
            p0.t r6 = new p0.t
            r9 = r4[r11]
            int r10 = r11 + 1
            r10 = r4[r10]
            r6.<init>(r9, r10)
            r2.add(r6)
            int r11 = r11 + 2
            goto L4b2
        L4c5:
            int r5 = r7 + (-1)
            r11 = 0
        L4c8:
            if (r11 > r5) goto L545
            p0.s r6 = new p0.s
            r9 = r4[r11]
            r6.<init>(r9)
            r2.add(r6)
            int r11 = r11 + 1
            goto L4c8
        L4d7:
            int r5 = r7 + (-6)
            r11 = 0
        L4da:
            if (r11 > r5) goto L545
            p0.r r12 = new p0.r
            r13 = r4[r11]
            int r6 = r11 + 1
            r14 = r4[r6]
            int r6 = r11 + 2
            r15 = r4[r6]
            int r6 = r11 + 3
            r16 = r4[r6]
            int r6 = r11 + 4
            r17 = r4[r6]
            int r6 = r11 + 5
            r18 = r4[r6]
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2.add(r12)
            int r11 = r11 + 6
            goto L4da
        L4fd:
            int r5 = r7 + (-7)
            r11 = 0
        L500:
            if (r11 > r5) goto L545
            p0.q r21 = new p0.q
            r22 = r4[r11]
            int r6 = r11 + 1
            r23 = r4[r6]
            int r6 = r11 + 2
            r24 = r4[r6]
            int r6 = r11 + 3
            r6 = r4[r6]
            r9 = 0
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 == 0) goto L51c
            r25 = r20
            goto L51e
        L51c:
            r25 = 0
        L51e:
            int r6 = r11 + 4
            r6 = r4[r6]
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 == 0) goto L52b
            r26 = r20
            goto L52d
        L52b:
            r26 = 0
        L52d:
            int r6 = r11 + 5
            r27 = r4[r6]
            int r6 = r11 + 6
            r28 = r4[r6]
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r6 = r21
            r2.add(r6)
            int r11 = r11 + 7
            goto L500
        L540:
            p0.i r4 = p0.C1441i.f15581c
            r2.add(r4)
        L545:
            r29 = 0
            goto L66f
        L549:
            int r5 = r7 + (-1)
            r11 = 0
        L54c:
            if (r11 > r5) goto L545
            p0.z r6 = new p0.z
            r9 = r4[r11]
            r6.<init>(r9)
            r2.add(r6)
            int r11 = r11 + 1
            goto L54c
        L55b:
            int r5 = r7 + (-2)
            r11 = 0
        L55e:
            if (r11 > r5) goto L545
            p0.p r6 = new p0.p
            r9 = r4[r11]
            int r10 = r11 + 1
            r10 = r4[r10]
            r6.<init>(r9, r10)
            r2.add(r6)
            int r11 = r11 + 2
            goto L55e
        L571:
            int r5 = r7 + (-4)
            r11 = 0
        L574:
            if (r11 > r5) goto L545
            p0.o r6 = new p0.o
            r9 = r4[r11]
            int r10 = r11 + 1
            r10 = r4[r10]
            int r12 = r11 + 2
            r12 = r4[r12]
            int r13 = r11 + 3
            r13 = r4[r13]
            r6.<init>(r9, r10, r12, r13)
            r2.add(r6)
            int r11 = r11 + 4
            goto L574
        L58f:
            int r5 = r7 + (-4)
            r11 = 0
        L592:
            if (r11 > r5) goto L545
            p0.n r6 = new p0.n
            r9 = r4[r11]
            int r10 = r11 + 1
            r10 = r4[r10]
            int r12 = r11 + 2
            r12 = r4[r12]
            int r13 = r11 + 3
            r13 = r4[r13]
            r6.<init>(r9, r10, r12, r13)
            r2.add(r6)
            int r11 = r11 + 4
            goto L592
        L5ad:
            int r5 = r7 + (-2)
            if (r5 < 0) goto L545
            p0.m r9 = new p0.m
            r29 = 0
            r10 = r4[r29]
            r11 = r4[r20]
            r9.<init>(r10, r11)
            r2.add(r9)
        L5bf:
            if (r6 > r5) goto L66f
            p0.l r9 = new p0.l
            r10 = r4[r6]
            int r11 = r6 + 1
            r11 = r4[r11]
            r9.<init>(r10, r11)
            r2.add(r9)
            int r6 = r6 + 2
            goto L5bf
        L5d2:
            r29 = 0
            int r5 = r7 + (-2)
            r11 = r29
        L5d8:
            if (r11 > r5) goto L66f
            p0.l r6 = new p0.l
            r9 = r4[r11]
            int r10 = r11 + 1
            r10 = r4[r10]
            r6.<init>(r9, r10)
            r2.add(r6)
            int r11 = r11 + 2
            goto L5d8
        L5eb:
            r29 = 0
            int r5 = r7 + (-1)
            r11 = r29
        L5f1:
            if (r11 > r5) goto L66f
            p0.k r6 = new p0.k
            r9 = r4[r11]
            r6.<init>(r9)
            r2.add(r6)
            int r11 = r11 + 1
            goto L5f1
        L600:
            r29 = 0
            int r5 = r7 + (-6)
            r11 = r29
        L606:
            if (r11 > r5) goto L66f
            p0.j r12 = new p0.j
            r13 = r4[r11]
            int r6 = r11 + 1
            r14 = r4[r6]
            int r6 = r11 + 2
            r15 = r4[r6]
            int r6 = r11 + 3
            r16 = r4[r6]
            int r6 = r11 + 4
            r17 = r4[r6]
            int r6 = r11 + 5
            r18 = r4[r6]
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2.add(r12)
            int r11 = r11 + 6
            goto L606
        L629:
            r29 = 0
            int r5 = r7 + (-7)
            r11 = r29
        L62f:
            if (r11 > r5) goto L66f
            p0.h r21 = new p0.h
            r22 = r4[r11]
            int r6 = r11 + 1
            r23 = r4[r6]
            int r6 = r11 + 2
            r24 = r4[r6]
            int r6 = r11 + 3
            r6 = r4[r6]
            r9 = 0
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 == 0) goto L64b
            r25 = r20
            goto L64d
        L64b:
            r25 = r29
        L64d:
            int r6 = r11 + 4
            r6 = r4[r6]
            int r6 = java.lang.Float.compare(r6, r9)
            if (r6 == 0) goto L65a
            r26 = r20
            goto L65c
        L65a:
            r26 = r29
        L65c:
            int r6 = r11 + 5
            r27 = r4[r6]
            int r6 = r11 + 6
            r28 = r4[r6]
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r6 = r21
            r2.add(r6)
            int r11 = r11 + 7
            goto L62f
        L66f:
            r5 = r8
            r6 = r19
            goto L31
        L674:
            r5 = r8
            goto L31
        L677:
            r5 = r8
            goto L33
        L67a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C1136a.r(i3.a, java.lang.String):java.util.ArrayList");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.E0, u.B0
    public boolean a() {
        ((c0) this.f13562r).getClass();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public long b(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return ((c0) this.f13562r).b(abstractC1663q, abstractC1663q2, abstractC1663q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.InterfaceC1892d
    public void c(com.google.android.gms.common.b bVar) {
        AbstractC1893e abstractC1893e = (AbstractC1893e) this.f13562r;
        if (bVar.f10323r == 0) {
            abstractC1893e.m(null, abstractC1893e.s());
            return;
        }
        InterfaceC1891c interfaceC1891c = abstractC1893e.f18423F;
        if (interfaceC1891c != null) {
            interfaceC1891c.onConnectionFailed(bVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1842e
    public ClipData d() {
        return ((ContentInfo) this.f13562r).getClip();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public boolean e(MenuC1209l menuC1209l, MenuItem menuItem) {
        InterfaceC1318m interfaceC1318m = ((ActionMenuView) this.f13562r).f9156P;
        if (interfaceC1318m == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((C1136a) interfaceC1318m).f13562r).f9194W.f16685r).iterator();
        while (it.hasNext()) {
            if (((A) it.next()).f2503a.o()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E2.i
    public Object f(t2.j jVar) {
        return H.j(new C1692m(((C1693n) this.f13562r).f17172w, 0), jVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public AbstractC1663q g(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return ((c0) this.f13562r).g(j, abstractC1663q, abstractC1663q2, abstractC1663q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.r
    public InterfaceC1622A get(int i) {
        return (C1623B) this.f13562r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1842e
    public int h() {
        return ((ContentInfo) this.f13562r).getFlags();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public void i(MenuC1209l menuC1209l) {
        C1134a c1134a = ((ActionMenuView) this.f13562r).f9151K;
        if (c1134a != null) {
            c1134a.i(menuC1209l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1842e
    public ContentInfo j() {
        return (ContentInfo) this.f13562r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1186a k() {
        C1864b c1864bC;
        K2.a aVar = (K2.a) this.f13562r;
        C1867e c1867e = (C1867e) aVar.f2862e;
        synchronized (c1867e) {
            aVar.a(true);
            c1864bC = c1867e.c(((C1863a) aVar.f2860c).f18250a);
        }
        if (c1864bC != null) {
            return new C1186a(1, c1864bC);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public AbstractC1663q n(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return ((c0) this.f13562r).n(j, abstractC1663q, abstractC1663q2, abstractC1663q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1842e
    public int o() {
        return ((ContentInfo) this.f13562r).getSource();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.InterfaceC1891c
    public void onConnectionFailed(com.google.android.gms.common.b bVar) {
        ((u3.f) this.f13562r).onConnectionFailed(bVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public AbstractC1663q p(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return ((c0) this.f13562r).p(abstractC1663q, abstractC1663q2, abstractC1663q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x.InterfaceC1870b
    public Object q(InterfaceC1788i0 interfaceC1788i0, Float f, Float f7, B5.c cVar, C1875g c1875g) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f7.floatValue();
        Object objC = AbstractC1880l.c(interfaceC1788i0, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, AbstractC1644d.a(0.0f, fFloatValue2, 28), (C1649f0) this.f13562r, cVar, c1875g);
        return objC == EnumC1580a.f16356q ? objC : (C1869a) objC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O1 s(Z.m mVar, C0.A a7) {
        int i;
        long jM;
        long j;
        boolean z5;
        C1566q c1566q = (C1566q) this.f13562r;
        List list = (List) mVar.f8312r;
        C1566q c1566q2 = new C1566q(list.size());
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            C1745n c1745n = (C1745n) list.get(i7);
            long j7 = c1745n.f17475a;
            C1744m c1744m = (C1744m) c1566q.b(j7);
            if (c1744m == null) {
                i = i7;
                j = c1745n.f17476b;
                jM = c1745n.f17478d;
                z5 = false;
            } else {
                long j8 = c1744m.f17472a;
                boolean z6 = c1744m.f17474c;
                i = i7;
                jM = a7.M(c1744m.f17473b);
                j = j8;
                z5 = z6;
            }
            long j9 = c1745n.f17475a;
            List list2 = list;
            int i8 = size;
            c1566q2.e(j9, new C1743l(j9, c1745n.f17476b, c1745n.f17478d, c1745n.f17479e, c1745n.f, j, jM, z5, c1745n.f17480g, c1745n.i, c1745n.j, c1745n.f17482k));
            boolean z7 = c1745n.f17479e;
            if (z7) {
                c1566q.e(j7, new C1744m(c1745n.f17476b, c1745n.f17477c, z7));
            } else {
                c1566q.f(j7);
            }
            i7 = i + 1;
            list = list2;
            size = i8;
        }
        return new O1(c1566q2, mVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f13561q) {
            case 14:
                return "ContentInfoCompat{" + ((ContentInfo) this.f13562r) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.InterfaceC1969c
    public Object zza() {
        y4.e eVar = (y4.e) ((InterfaceC1969c) this.f13562r).zza();
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1136a(int i, Object obj) {
        this.f13561q = i;
        this.f13562r = obj;
    }

    public C1136a(W0.c cVar) {
        this.f13561q = 7;
        float f = K.f16589a;
        C1055e c1055e = new C1055e();
        c1055e.f12640a = f;
        float fB = cVar.b();
        float f7 = AbstractC1599H.f16587a;
        c1055e.f12641b = fB * 386.0878f * 160.0f * 0.84f;
        this.f13562r = c1055e;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r10
  0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1136a(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 8
            r0.f13561q = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            u.s[][] r4 = new u.C1664s[r2][]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L6b
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r11) goto L31
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 == r10) goto L2a
            r10 = 5
            if (r9 == r10) goto L2a
            r13 = r8
            goto L35
        L2a:
            r13 = r10
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r13 = r7
            goto L35
        L31:
            r7 = r11
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            u.s[] r11 = new u.C1664s[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            u.s r12 = new u.s
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L47
        L65:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L14
        L6b:
            r0.f13562r = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C1136a.<init>(int[], float[], float[][]):void");
    }

    public C1136a(View view) {
        this.f13561q = 15;
        if (Build.VERSION.SDK_INT >= 30) {
            C1856t c1856t = new C1856t(14, view);
            c1856t.f18241s = view;
            this.f13562r = c1856t;
            return;
        }
        this.f13562r = new C1134a(14, view);
    }

    public C1136a() {
        this.f13561q = 12;
        this.f13562r = new C1566q((Object) null);
    }

    public C1136a(ContentInfo contentInfo) {
        this.f13561q = 14;
        contentInfo.getClass();
        this.f13562r = c4.a.h(contentInfo);
    }

    public C1136a(float f, AbstractC1663q abstractC1663q) {
        Object c1136a;
        this.f13561q = 10;
        int[] iArr = C0.f16759a;
        if (abstractC1663q != null) {
            c1136a = new C1134a(f, abstractC1663q);
        } else {
            c1136a = new C1136a(f);
        }
        this.f13562r = new c0(c1136a);
    }

    public C1136a(float f) {
        this.f13561q = 9;
        this.f13562r = new C1623B(f, 0.01f);
    }
}
