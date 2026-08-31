package S0;

import B0.C;
import B0.G0;
import E1.l;
import L0.F;
import L0.p;
import L0.t;
import P.S0;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f7282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O0.d f7285e;
    public final W0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f7286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f7287h;
    public final M0.e i;
    public G0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7289l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:453:0x0388 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x089c A[LOOP:7: B:427:0x089a->B:428:0x089c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x08dc  */
    /* JADX WARN: Type inference failed for: r1v0, types: [S0.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v39, types: [S0.d] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r39, L0.F r40, java.util.List r41, java.util.List r42, O0.d r43, W0.c r44) throws java.lang.Throwable {
        /*
            r38 = this;
            r1 = r38
            r0 = r40
            r2 = r41
            r3 = r44
            r1.<init>()
            r4 = r39
            r1.f7281a = r4
            r1.f7282b = r0
            r1.f7283c = r2
            r4 = r42
            r1.f7284d = r4
            r4 = r43
            r1.f7285e = r4
            r1.f = r3
            S0.e r4 = new S0.e
            float r5 = r3.b()
            r6 = 1
            r4.<init>(r6)
            r4.density = r5
            V0.l r5 = V0.l.f7937b
            r4.f7291b = r5
            r5 = 3
            r4.f7292c = r5
            j0.D r7 = j0.D.f13677d
            r4.f7293d = r7
            r1.f7286g = r4
            L0.t r7 = r0.f3093c
            k3.c r7 = S0.i.f7301a
            k3.c r7 = S0.i.f7301a
            java.lang.Object r8 = r7.f14120q
            P.S0 r8 = (P.S0) r8
            if (r8 == 0) goto L43
            goto L52
        L43:
            boolean r8 = E1.l.c()
            if (r8 == 0) goto L50
            P.S0 r8 = r7.m()
            r7.f14120q = r8
            goto L52
        L50:
            S0.k r8 = S0.j.f7302a
        L52:
            java.lang.Object r7 = r8.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1.f7288k = r7
            L0.q r7 = r0.f3092b
            int r7 = r7.f3167b
            L0.y r8 = r0.f3091a
            R0.b r8 = r8.f3234k
            r9 = 4
            r10 = 2
            r11 = 0
            if (r7 != r9) goto L6d
        L6b:
            r7 = r10
            goto L9c
        L6d:
            r9 = 5
            if (r7 != r9) goto L72
        L70:
            r7 = r5
            goto L9c
        L72:
            if (r7 != r6) goto L76
            r7 = r11
            goto L9c
        L76:
            if (r7 != r10) goto L7a
            r7 = r6
            goto L9c
        L7a:
            if (r7 != r5) goto L7d
            goto L81
        L7d:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r9) goto L8f6
        L81:
            if (r8 == 0) goto L8f
            java.util.List r7 = r8.f6692q
            java.lang.Object r7 = r7.get(r11)
            R0.a r7 = (R0.a) r7
            java.util.Locale r7 = r7.f6690a
            if (r7 != 0) goto L93
        L8f:
            java.util.Locale r7 = java.util.Locale.getDefault()
        L93:
            int r7 = android.text.TextUtils.getLayoutDirectionFromLocale(r7)
            if (r7 == 0) goto L6b
            if (r7 == r6) goto L70
            goto L6b
        L9c:
            r1.f7289l = r7
            S0.c r7 = new S0.c
            r7.<init>(r11, r1)
            L0.q r8 = r0.f3092b
            V0.t r8 = r8.i
            if (r8 != 0) goto Lab
            V0.t r8 = V0.t.f7951c
        Lab:
            boolean r9 = r8.f7954b
            if (r9 == 0) goto Lb6
            int r9 = r4.getFlags()
            r9 = r9 | 128(0x80, float:1.794E-43)
            goto Lbc
        Lb6:
            int r9 = r4.getFlags()
            r9 = r9 & (-129(0xffffffffffffff7f, float:NaN))
        Lbc:
            r4.setFlags(r9)
            int r8 = r8.f7953a
            if (r8 != r6) goto Ld0
            int r5 = r4.getFlags()
            r5 = r5 | 64
            r4.setFlags(r5)
            r4.setHinting(r11)
            goto Le5
        Ld0:
            if (r8 != r10) goto Ld9
            r4.getFlags()
            r4.setHinting(r6)
            goto Le5
        Ld9:
            if (r8 != r5) goto Le2
            r4.getFlags()
            r4.setHinting(r11)
            goto Le5
        Le2:
            r4.getFlags()
        Le5:
            L0.y r0 = r0.f3091a
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r8 = r11
        Lef:
            if (r8 >= r5) goto L102
            java.lang.Object r10 = r2.get(r8)
            r12 = r10
            L0.c r12 = (L0.C0191c) r12
            java.lang.Object r12 = r12.f3101a
            boolean r12 = r12 instanceof L0.y
            if (r12 == 0) goto Lff
            goto L103
        Lff:
            int r8 = r8 + 1
            goto Lef
        L102:
            r10 = 0
        L103:
            if (r10 == 0) goto L107
            r2 = r6
            goto L108
        L107:
            r2 = r11
        L108:
            long r12 = r0.f3228b
            java.lang.String r5 = r0.f3232g
            R0.b r8 = r0.f3234k
            V0.p r10 = r0.f3227a
            V0.q r14 = r0.j
            r40 = r10
            r39 = 0
            long r9 = r0.f3233h
            r42 = r6
            r43 = r7
            long r6 = W0.n.b(r12)
            r16 = r12
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r13 = W0.o.a(r6, r11)
            if (r13 == 0) goto L137
            r11 = r16
            float r6 = r3.T(r11)
            r4.setTextSize(r6)
            goto L14e
        L137:
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r6 = W0.o.a(r6, r11)
            if (r6 == 0) goto L14e
            float r6 = r4.getTextSize()
            float r7 = W0.n.c(r16)
            float r7 = r7 * r6
            r4.setTextSize(r7)
        L14e:
            O0.p r6 = r0.f
            if (r6 != 0) goto L160
            O0.h r7 = r0.f3230d
            if (r7 != 0) goto L160
            O0.j r7 = r0.f3229c
            if (r7 == 0) goto L15b
            goto L160
        L15b:
            r16 = r43
            r43 = r2
            goto L1ab
        L160:
            O0.j r7 = r0.f3229c
            if (r7 != 0) goto L166
            O0.j r7 = O0.j.f4281s
        L166:
            O0.h r11 = r0.f3230d
            if (r11 == 0) goto L16d
            int r11 = r11.f4278a
            goto L16e
        L16d:
            r11 = 0
        L16e:
            O0.i r12 = r0.f3231e
            if (r12 == 0) goto L175
            int r12 = r12.f4279a
            goto L178
        L175:
            r12 = 65535(0xffff, float:9.1834E-41)
        L178:
            java.lang.String r13 = "null cannot be cast to non-null type android.graphics.Typeface"
            r15 = r43
            r43 = r2
            java.lang.Object r2 = r15.f7280r
            S0.d r2 = (S0.d) r2
            r16 = r15
            O0.d r15 = r2.f7285e
            O0.e r15 = (O0.e) r15
            O0.r r6 = r15.b(r6, r7, r11, r12)
            boolean r7 = r6 instanceof O0.r
            if (r7 != 0) goto L1a1
            B0.G0 r7 = new B0.G0
            B0.G0 r11 = r2.j
            r7.<init>(r6, r11)
            r2.j = r7
            java.lang.Object r2 = r7.f234r
            kotlin.jvm.internal.m.c(r2, r13)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            goto L1a8
        L1a1:
            java.lang.Object r2 = r6.f4294q
            kotlin.jvm.internal.m.c(r2, r13)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
        L1a8:
            r4.setTypeface(r2)
        L1ab:
            if (r8 == 0) goto L23a
            R0.b r6 = R0.b.f6691s
            B0.G0 r6 = R0.c.f6694a
            r6.getClass()
            android.os.LocaleList r7 = android.os.LocaleList.getDefault()
            java.lang.Object r11 = r6.f236t
            O3.D r11 = (O3.D) r11
            monitor-enter(r11)
            java.lang.Object r12 = r6.f235s     // Catch: java.lang.Throwable -> L1ea
            R0.b r12 = (R0.b) r12     // Catch: java.lang.Throwable -> L1ea
            if (r12 == 0) goto L1cb
            java.lang.Object r13 = r6.f234r     // Catch: java.lang.Throwable -> L1ea
            android.os.LocaleList r13 = (android.os.LocaleList) r13     // Catch: java.lang.Throwable -> L1ea
            if (r7 != r13) goto L1cb
            monitor-exit(r11)
            goto L1f6
        L1cb:
            int r12 = r7.size()     // Catch: java.lang.Throwable -> L1ea
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1ea
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L1ea
            r15 = 0
        L1d5:
            if (r15 >= r12) goto L1ec
            R0.a r2 = new R0.a     // Catch: java.lang.Throwable -> L1ea
            r18 = r12
            java.util.Locale r12 = r7.get(r15)     // Catch: java.lang.Throwable -> L1ea
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L1ea
            r13.add(r2)     // Catch: java.lang.Throwable -> L1ea
            int r15 = r15 + 1
            r12 = r18
            goto L1d5
        L1ea:
            r0 = move-exception
            goto L238
        L1ec:
            R0.b r12 = new R0.b     // Catch: java.lang.Throwable -> L1ea
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L1ea
            r6.f234r = r7     // Catch: java.lang.Throwable -> L1ea
            r6.f235s = r12     // Catch: java.lang.Throwable -> L1ea
            monitor-exit(r11)
        L1f6:
            boolean r2 = r8.equals(r12)
            if (r2 != 0) goto L23a
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 10
            int r7 = n5.m.c0(r8, r6)
            r2.<init>(r7)
            java.util.List r6 = r8.f6692q
            java.util.Iterator r6 = r6.iterator()
        L20d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L21f
            java.lang.Object r7 = r6.next()
            R0.a r7 = (R0.a) r7
            java.util.Locale r7 = r7.f6690a
            r2.add(r7)
            goto L20d
        L21f:
            r15 = 0
            java.util.Locale[] r6 = new java.util.Locale[r15]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            int r6 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            android.os.LocaleList r6 = new android.os.LocaleList
            r6.<init>(r2)
            r4.setTextLocales(r6)
            goto L23a
        L238:
            monitor-exit(r11)
            throw r0
        L23a:
            if (r5 == 0) goto L247
            java.lang.String r2 = ""
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L247
            r4.setFontFeatureSettings(r5)
        L247:
            if (r14 == 0) goto L265
            V0.q r2 = V0.q.f7944c
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L265
            float r2 = r4.getTextScaleX()
            float r5 = r14.f7945a
            float r2 = r2 * r5
            r4.setTextScaleX(r2)
            float r2 = r4.getTextSkewX()
            float r5 = r14.f7946b
            float r2 = r2 + r5
            r4.setTextSkewX(r2)
        L265:
            long r5 = r40.a()
            r4.d(r5)
            j0.B r2 = r40.b()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            float r7 = r40.c()
            r4.c(r2, r5, r7)
            j0.D r2 = r0.f3237n
            r4.f(r2)
            V0.l r2 = r0.f3236m
            r4.g(r2)
            l0.c r2 = r0.f3238o
            r4.e(r2)
            long r5 = W0.n.b(r9)
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = W0.o.a(r5, r7)
            r5 = 0
            if (r2 == 0) goto L2bb
            float r2 = W0.n.c(r9)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L2a4
            goto L2bb
        L2a4:
            float r2 = r4.getTextSize()
            float r6 = r4.getTextScaleX()
            float r6 = r6 * r2
            float r2 = r3.T(r9)
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 != 0) goto L2b6
            goto L2d1
        L2b6:
            float r2 = r2 / r6
            r4.setLetterSpacing(r2)
            goto L2d1
        L2bb:
            long r2 = W0.n.b(r9)
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r2 = W0.o.a(r2, r11)
            if (r2 == 0) goto L2d1
            float r2 = W0.n.c(r9)
            r4.setLetterSpacing(r2)
        L2d1:
            long r2 = r0.f3235l
            V0.a r0 = r0.i
            if (r43 == 0) goto L2f2
            long r6 = W0.n.b(r9)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r4 = W0.o.a(r6, r11)
            if (r4 == 0) goto L2f2
            float r4 = W0.n.c(r9)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L2ef
            goto L2f2
        L2ef:
            r4 = r42
            goto L2f3
        L2f2:
            r4 = 0
        L2f3:
            long r6 = j0.o.f13722g
            boolean r8 = j0.o.c(r2, r6)
            if (r8 != 0) goto L306
            long r11 = j0.o.f
            boolean r8 = j0.o.c(r2, r11)
            if (r8 != 0) goto L306
            r8 = r42
            goto L307
        L306:
            r8 = 0
        L307:
            if (r0 == 0) goto L315
            float r11 = r0.f7918a
            int r11 = java.lang.Float.compare(r11, r5)
            if (r11 != 0) goto L312
            goto L315
        L312:
            r11 = r42
            goto L316
        L315:
            r11 = 0
        L316:
            if (r4 != 0) goto L31f
            if (r8 != 0) goto L31f
            if (r11 != 0) goto L31f
            r0 = r39
            goto L355
        L31f:
            if (r4 == 0) goto L324
        L321:
            r28 = r9
            goto L327
        L324:
            long r9 = W0.n.f8027c
            goto L321
        L327:
            if (r8 == 0) goto L32c
            r33 = r2
            goto L32e
        L32c:
            r33 = r6
        L32e:
            if (r11 == 0) goto L333
            r30 = r0
            goto L335
        L333:
            r30 = r39
        L335:
            L0.y r18 = new L0.y
            r36 = 0
            r37 = 63103(0xf67f, float:8.8426E-41)
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r31 = 0
            r32 = 0
            r35 = 0
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r35, r36, r37)
            r0 = r18
        L355:
            if (r0 == 0) goto L386
            java.util.List r2 = r1.f7283c
            int r2 = r2.size()
            int r2 = r2 + 1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
        L365:
            if (r4 >= r2) goto L388
            if (r4 != 0) goto L376
            L0.c r6 = new L0.c
            java.lang.String r7 = r1.f7281a
            int r7 = r7.length()
            r15 = 0
            r6.<init>(r15, r7, r0)
            goto L380
        L376:
            java.util.List r6 = r1.f7283c
            int r7 = r4 + (-1)
            java.lang.Object r6 = r6.get(r7)
            L0.c r6 = (L0.C0191c) r6
        L380:
            r3.add(r6)
            int r4 = r4 + 1
            goto L365
        L386:
            java.util.List r3 = r1.f7283c
        L388:
            java.lang.String r0 = r1.f7281a
            S0.e r2 = r1.f7286g
            float r2 = r2.getTextSize()
            L0.F r4 = r1.f7282b
            java.util.List r6 = r1.f7284d
            W0.c r10 = r1.f
            boolean r7 = r1.f7288k
            S0.a r8 = S0.b.f7278a
            if (r7 == 0) goto L3b9
            boolean r7 = E1.l.c()
            if (r7 == 0) goto L3b9
            L0.t r7 = r4.f3093c
            if (r7 == 0) goto L3a8
            L0.s r7 = r7.f3176a
        L3a8:
            E1.l r7 = E1.l.a()
            int r8 = r0.length()
            r15 = 0
            java.lang.CharSequence r7 = r7.f(r15, r8, r15, r0)
            kotlin.jvm.internal.m.b(r7)
            goto L3ba
        L3b9:
            r7 = r0
        L3ba:
            boolean r8 = r3.isEmpty()
            r11 = 0
            r13 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            if (r8 == 0) goto L3e4
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L3e4
            L0.q r8 = r4.f3092b
            V0.r r8 = r8.f3169d
            V0.r r9 = V0.r.f7947c
            boolean r8 = kotlin.jvm.internal.m.a(r8, r9)
            if (r8 == 0) goto L3e4
            L0.q r8 = r4.f3092b
            long r8 = r8.f3168c
            long r8 = r8 & r13
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L3e4
            goto L8de
        L3e4:
            boolean r8 = r7 instanceof android.text.Spannable
            if (r8 == 0) goto L3eb
            android.text.Spannable r7 = (android.text.Spannable) r7
            goto L3f1
        L3eb:
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r7)
            r7 = r8
        L3f1:
            L0.y r8 = r4.f3091a
            L0.q r9 = r4.f3092b
            V0.l r8 = r8.f3236m
            r40 = r5
            V0.l r5 = V0.l.f7938c
            boolean r5 = kotlin.jvm.internal.m.a(r8, r5)
            r8 = 33
            if (r5 == 0) goto L40d
            S0.a r5 = S0.b.f7278a
            int r0 = r0.length()
            r15 = 0
            r7.setSpan(r5, r15, r0, r8)
        L40d:
            L0.t r0 = r4.f3093c
            if (r0 == 0) goto L418
            L0.s r0 = r0.f3176a
            if (r0 == 0) goto L418
            boolean r0 = r0.f3175a
            goto L419
        L418:
            r0 = 0
        L419:
            if (r0 == 0) goto L43c
            V0.i r0 = r9.f
            if (r0 != 0) goto L43c
            r43 = r11
            long r11 = r9.f3168c
            float r0 = com.google.android.gms.internal.measurement.P1.Q(r11, r2, r10)
            boolean r5 = java.lang.Float.isNaN(r0)
            if (r5 != 0) goto L43a
            N0.g r5 = new N0.g
            r5.<init>(r0)
            int r0 = r7.length()
            r15 = 0
            r7.setSpan(r5, r15, r0, r8)
        L43a:
            r15 = 0
            goto L496
        L43c:
            r43 = r11
            V0.i r0 = r9.f
            if (r0 != 0) goto L444
            V0.i r0 = V0.i.f7930c
        L444:
            long r11 = r9.f3168c
            float r19 = com.google.android.gms.internal.measurement.P1.Q(r11, r2, r10)
            boolean r5 = java.lang.Float.isNaN(r19)
            if (r5 != 0) goto L43a
            int r5 = r7.length()
            if (r5 != 0) goto L457
            goto L45f
        L457:
            char r5 = J5.m.V0(r7)
            r11 = 10
            if (r5 != r11) goto L468
        L45f:
            int r5 = r7.length()
            int r5 = r5 + 1
        L465:
            r20 = r5
            goto L46d
        L468:
            int r5 = r7.length()
            goto L465
        L46d:
            N0.h r18 = new N0.h
            int r5 = r0.f7932b
            r11 = r5 & 1
            if (r11 <= 0) goto L478
            r21 = r42
            goto L47a
        L478:
            r21 = 0
        L47a:
            r5 = r5 & 16
            if (r5 <= 0) goto L481
            r22 = r42
            goto L483
        L481:
            r22 = 0
        L483:
            float r0 = r0.f7931a
            r24 = 0
            r23 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r0 = r18
            int r5 = r7.length()
            r15 = 0
            r7.setSpan(r0, r15, r5, r8)
        L496:
            V0.r r0 = r9.f3169d
            if (r0 == 0) goto L534
            long r11 = r0.f7948a
            r18 = r13
            long r13 = r0.f7949b
            r0 = r9
            long r8 = com.google.android.gms.internal.measurement.AbstractC0836n2.y(r15)
            boolean r5 = W0.n.a(r11, r8)
            if (r5 == 0) goto L4b5
            long r8 = com.google.android.gms.internal.measurement.AbstractC0836n2.y(r15)
            boolean r5 = W0.n.a(r13, r8)
            if (r5 != 0) goto L4bb
        L4b5:
            long r8 = r11 & r18
            int r5 = (r8 > r43 ? 1 : (r8 == r43 ? 0 : -1))
            if (r5 != 0) goto L4bf
        L4bb:
            r43 = r0
            goto L536
        L4bf:
            long r8 = r13 & r18
            int r5 = (r8 > r43 ? 1 : (r8 == r43 ? 0 : -1))
            if (r5 != 0) goto L4c6
            goto L4bb
        L4c6:
            long r8 = W0.n.b(r11)
            r43 = r0
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r5 = W0.o.a(r8, r0)
            if (r5 == 0) goto L4e1
            float r5 = r10.T(r11)
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L4f4
        L4e1:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r5 = W0.o.a(r8, r0)
            if (r5 == 0) goto L4f2
            float r5 = W0.n.c(r11)
            float r5 = r5 * r2
            goto L4f4
        L4f2:
            r5 = r40
        L4f4:
            long r8 = W0.n.b(r13)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r17 = W0.o.a(r8, r11)
            if (r17 == 0) goto L508
            float r2 = r10.T(r13)
            goto L516
        L508:
            boolean r8 = W0.o.a(r8, r0)
            if (r8 == 0) goto L514
            float r0 = W0.n.c(r13)
            float r2 = r2 * r0
            goto L516
        L514:
            r2 = r40
        L516:
            android.text.style.LeadingMarginSpan$Standard r0 = new android.text.style.LeadingMarginSpan$Standard
            double r8 = (double) r5
            double r8 = java.lang.Math.ceil(r8)
            float r1 = (float) r8
            int r1 = (int) r1
            double r8 = (double) r2
            double r8 = java.lang.Math.ceil(r8)
            float r2 = (float) r8
            int r2 = (int) r2
            r0.<init>(r1, r2)
            int r1 = r7.length()
            r2 = 33
            r15 = 0
            r7.setSpan(r0, r15, r1, r2)
            goto L536
        L534:
            r43 = r9
        L536:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r1.size()
            r5 = 0
        L547:
            if (r5 >= r2) goto L577
            java.lang.Object r8 = r3.get(r5)
            L0.c r8 = (L0.C0191c) r8
            java.lang.Object r9 = r8.f3101a
            boolean r11 = r9 instanceof L0.y
            if (r11 == 0) goto L574
            r11 = r9
            L0.y r11 = (L0.y) r11
            O0.p r12 = r11.f
            if (r12 != 0) goto L567
            O0.h r12 = r11.f3230d
            if (r12 != 0) goto L567
            O0.j r11 = r11.f3229c
            if (r11 == 0) goto L565
            goto L567
        L565:
            r11 = 0
            goto L569
        L567:
            r11 = r42
        L569:
            if (r11 != 0) goto L571
            L0.y r9 = (L0.y) r9
            O0.i r9 = r9.f3231e
            if (r9 == 0) goto L574
        L571:
            r0.add(r8)
        L574:
            int r5 = r5 + 1
            goto L547
        L577:
            L0.y r2 = r4.f3091a
            O0.p r4 = r2.f
            if (r4 != 0) goto L588
            O0.h r5 = r2.f3230d
            if (r5 != 0) goto L588
            O0.j r5 = r2.f3229c
            if (r5 == 0) goto L586
            goto L588
        L586:
            r5 = 0
            goto L58a
        L588:
            r5 = r42
        L58a:
            if (r5 != 0) goto L594
            O0.i r5 = r2.f3231e
            if (r5 == 0) goto L591
            goto L594
        L591:
            r2 = r39
            goto L5c0
        L594:
            O0.j r5 = r2.f3229c
            O0.h r8 = r2.f3230d
            O0.i r2 = r2.f3231e
            L0.y r18 = new L0.y
            r36 = 0
            r37 = 65475(0xffc3, float:9.175E-41)
            r19 = 0
            r21 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 0
            r25 = r2
            r26 = r4
            r23 = r5
            r24 = r8
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r35, r36, r37)
            r2 = r18
        L5c0:
            F.p r4 = new F.p
            r8 = r42
            r5 = r16
            r4.<init>(r8, r7, r5)
            int r5 = r0.size()
            if (r5 > r8) goto L606
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L602
            r15 = 0
            java.lang.Object r5 = r0.get(r15)
            L0.c r5 = (L0.C0191c) r5
            java.lang.Object r5 = r5.f3101a
            L0.y r5 = (L0.y) r5
            if (r2 != 0) goto L5e3
            goto L5e7
        L5e3:
            L0.y r5 = r2.c(r5)
        L5e7:
            java.lang.Object r2 = r0.get(r15)
            L0.c r2 = (L0.C0191c) r2
            int r2 = r2.f3102b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.get(r15)
            L0.c r0 = (L0.C0191c) r0
            int r0 = r0.f3103c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.invoke(r5, r2, r0)
        L602:
            r16 = r1
            goto L696
        L606:
            int r5 = r0.size()
            int r8 = r5 * 2
            int[] r9 = new int[r8]
            int r11 = r0.size()
            r12 = 0
        L613:
            if (r12 >= r11) goto L628
            java.lang.Object r13 = r0.get(r12)
            L0.c r13 = (L0.C0191c) r13
            int r14 = r13.f3102b
            r9[r12] = r14
            int r14 = r12 + r5
            int r13 = r13.f3103c
            r9[r14] = r13
            int r12 = r12 + 1
            goto L613
        L628:
            r12 = 1
            if (r8 <= r12) goto L62e
            java.util.Arrays.sort(r9)
        L62e:
            if (r8 == 0) goto L8ec
            r15 = 0
            r5 = r9[r15]
            r11 = 0
        L634:
            if (r11 >= r8) goto L602
            r12 = r9[r11]
            if (r12 != r5) goto L641
            r17 = r0
            r16 = r1
            r18 = r2
            goto L68d
        L641:
            int r13 = r0.size()
            r15 = r2
            r14 = 0
        L647:
            if (r14 >= r13) goto L679
            java.lang.Object r16 = r0.get(r14)
            r17 = r0
            r0 = r16
            L0.c r0 = (L0.C0191c) r0
            r16 = r1
            int r1 = r0.f3102b
            r18 = r2
            int r2 = r0.f3103c
            if (r1 == r2) goto L670
            boolean r1 = L0.AbstractC0193e.a(r5, r12, r1, r2)
            if (r1 == 0) goto L670
            java.lang.Object r0 = r0.f3101a
            L0.y r0 = (L0.y) r0
            if (r15 != 0) goto L66b
        L669:
            r15 = r0
            goto L670
        L66b:
            L0.y r0 = r15.c(r0)
            goto L669
        L670:
            int r14 = r14 + 1
            r1 = r16
            r0 = r17
            r2 = r18
            goto L647
        L679:
            r17 = r0
            r16 = r1
            r18 = r2
            if (r15 == 0) goto L68c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r4.invoke(r15, r0, r1)
        L68c:
            r5 = r12
        L68d:
            int r11 = r11 + 1
            r1 = r16
            r0 = r17
            r2 = r18
            goto L634
        L696:
            int r0 = r16.size()
            r1 = 0
            r2 = 0
        L69c:
            if (r1 >= r0) goto L7f0
            java.lang.Object r4 = r3.get(r1)
            L0.c r4 = (L0.C0191c) r4
            java.lang.Object r5 = r4.f3101a
            boolean r8 = r5 instanceof L0.y
            if (r8 == 0) goto L6be
            int r11 = r4.f3102b
            int r12 = r4.f3103c
            if (r11 < 0) goto L6be
            int r4 = r7.length()
            if (r11 >= r4) goto L6be
            if (r12 <= r11) goto L6be
            int r4 = r7.length()
            if (r12 <= r4) goto L6c9
        L6be:
            r44 = r0
            r4 = r1
            r17 = r10
            r0 = r43
            r43 = r2
            goto L7e4
        L6c9:
            L0.y r5 = (L0.y) r5
            V0.a r4 = r5.i
            long r13 = r5.f3233h
            V0.p r8 = r5.f3227a
            if (r4 == 0) goto L6e0
            float r4 = r4.f7918a
            N0.a r9 = new N0.a
            r15 = 0
            r9.<init>(r15, r4)
            r4 = 33
            r7.setSpan(r9, r11, r12, r4)
        L6e0:
            r44 = r0
            r4 = r1
            long r0 = r8.a()
            com.google.android.gms.internal.measurement.P1.R(r7, r0, r11, r12)
            j0.B r0 = r8.b()
            float r1 = r8.c()
            if (r0 == 0) goto L70c
            boolean r8 = r0 instanceof j0.G
            if (r8 == 0) goto L700
            j0.G r0 = (j0.G) r0
            long r0 = r0.f13692e
            com.google.android.gms.internal.measurement.P1.R(r7, r0, r11, r12)
            goto L70c
        L700:
            U0.b r8 = new U0.b
            j0.l r0 = (j0.l) r0
            r8.<init>(r0, r1)
            r0 = 33
            r7.setSpan(r8, r11, r12, r0)
        L70c:
            V0.l r0 = r5.f3236m
            if (r0 == 0) goto L72b
            int r0 = r0.f7939a
            N0.k r1 = new N0.k
            r8 = r0 | 1
            if (r8 != r0) goto L71a
            r8 = 1
            goto L71b
        L71a:
            r8 = 0
        L71b:
            r9 = r0 | 2
            if (r9 != r0) goto L721
            r0 = 1
            goto L722
        L721:
            r0 = 0
        L722:
            r1.<init>(r8, r0)
            r0 = 33
            r7.setSpan(r1, r11, r12, r0)
            goto L72d
        L72b:
            r0 = 33
        L72d:
            long r8 = r5.f3228b
            r1 = r0
            r0 = r43
            com.google.android.gms.internal.measurement.P1.T(r7, r8, r10, r11, r12)
            java.lang.String r8 = r5.f3232g
            if (r8 == 0) goto L742
            N0.b r9 = new N0.b
            r15 = 0
            r9.<init>(r15, r8)
            r7.setSpan(r9, r11, r12, r1)
        L742:
            V0.q r8 = r5.j
            if (r8 == 0) goto L75c
            android.text.style.ScaleXSpan r9 = new android.text.style.ScaleXSpan
            float r15 = r8.f7945a
            r9.<init>(r15)
            r7.setSpan(r9, r11, r12, r1)
            N0.a r9 = new N0.a
            float r8 = r8.f7946b
            r15 = 1
            r9.<init>(r15, r8)
            r7.setSpan(r9, r11, r12, r1)
            goto L75d
        L75c:
            r15 = 1
        L75d:
            R0.b r8 = r5.f3234k
            com.google.android.gms.internal.measurement.P1.W(r7, r8, r11, r12)
            long r8 = r5.f3235l
            r18 = 16
            int r17 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r17 == 0) goto L776
            android.text.style.BackgroundColorSpan r15 = new android.text.style.BackgroundColorSpan
            int r8 = j0.AbstractC1145B.v(r8)
            r15.<init>(r8)
            r7.setSpan(r15, r11, r12, r1)
        L776:
            j0.D r8 = r5.f3237n
            if (r8 == 0) goto L7b1
            r43 = r2
            long r1 = r8.f13679b
            N0.j r15 = new N0.j
            r17 = r10
            long r9 = r8.f13678a
            int r9 = j0.AbstractC1145B.v(r9)
            r10 = 32
            r19 = r1
            long r1 = r19 >> r10
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r23 = r13
            long r13 = r19 & r21
            int r2 = (int) r13
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r8 = r8.f13680c
            int r10 = (r8 > r40 ? 1 : (r8 == r40 ? 0 : -1))
            if (r10 != 0) goto L7a8
            r8 = 1
        L7a8:
            r15.<init>(r9, r1, r2, r8)
            r9 = 33
            r7.setSpan(r15, r11, r12, r9)
            goto L7b8
        L7b1:
            r9 = r1
            r43 = r2
            r17 = r10
            r23 = r13
        L7b8:
            l0.c r1 = r5.f3238o
            if (r1 == 0) goto L7c4
            U0.a r2 = new U0.a
            r2.<init>(r1)
            r7.setSpan(r2, r11, r12, r9)
        L7c4:
            long r1 = W0.n.b(r23)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r1 = W0.o.a(r1, r11)
            if (r1 != 0) goto L7e2
            long r1 = W0.n.b(r23)
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r1 = W0.o.a(r1, r11)
            if (r1 == 0) goto L7e4
        L7e2:
            r2 = 1
            goto L7e6
        L7e4:
            r2 = r43
        L7e6:
            int r1 = r4 + 1
            r43 = r0
            r10 = r17
            r0 = r44
            goto L69c
        L7f0:
            r0 = r43
            r43 = r2
            r17 = r10
            if (r43 == 0) goto L86c
            int r1 = r16.size()
            r2 = 0
        L7fd:
            if (r2 >= r1) goto L86c
            java.lang.Object r4 = r3.get(r2)
            L0.c r4 = (L0.C0191c) r4
            java.lang.Object r5 = r4.f3101a
            L0.b r5 = (L0.InterfaceC0190b) r5
            boolean r8 = r5 instanceof L0.y
            if (r8 == 0) goto L821
            int r8 = r4.f3102b
            int r4 = r4.f3103c
            if (r8 < 0) goto L821
            int r10 = r7.length()
            if (r8 >= r10) goto L821
            if (r4 <= r8) goto L821
            int r10 = r7.length()
            if (r4 <= r10) goto L826
        L821:
            r14 = r17
            r9 = 33
            goto L867
        L826:
            L0.y r5 = (L0.y) r5
            long r10 = r5.f3233h
            long r12 = W0.n.b(r10)
            r14 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r5 = W0.o.a(r12, r14)
            if (r5 == 0) goto L845
            N0.f r5 = new N0.f
            r14 = r17
            float r10 = r14.T(r10)
            r5.<init>(r10)
            goto L860
        L845:
            r19 = r10
            r14 = r17
            r9 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r5 = W0.o.a(r12, r9)
            if (r5 == 0) goto L85e
            N0.e r5 = new N0.e
            float r9 = W0.n.c(r19)
            r5.<init>(r9)
            goto L860
        L85e:
            r5 = r39
        L860:
            r9 = 33
            if (r5 == 0) goto L867
            r7.setSpan(r5, r8, r4, r9)
        L867:
            int r2 = r2 + 1
            r17 = r14
            goto L7fd
        L86c:
            r14 = r17
            V0.r r0 = r0.f3169d
            if (r0 == 0) goto L895
            long r0 = r0.f7948a
            long r4 = W0.n.b(r0)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = W0.o.a(r4, r11)
            if (r2 == 0) goto L887
            r14.T(r0)
            goto L895
        L887:
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r2 = W0.o.a(r4, r11)
            if (r2 == 0) goto L895
            W0.n.c(r0)
        L895:
            int r0 = r16.size()
            r1 = 0
        L89a:
            if (r1 >= r0) goto L8a7
            java.lang.Object r2 = r3.get(r1)
            L0.c r2 = (L0.C0191c) r2
            java.lang.Object r2 = r2.f3101a
            int r1 = r1 + 1
            goto L89a
        L8a7:
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L8dc
            r15 = 0
            java.lang.Object r0 = r6.get(r15)
            L0.c r0 = (L0.C0191c) r0
            java.lang.Object r1 = r0.f3101a
            if (r1 != 0) goto L8d6
            int r1 = r0.f3102b
            int r0 = r0.f3103c
            java.lang.Class<E1.B> r2 = E1.B.class
            java.lang.Object[] r0 = r7.getSpans(r1, r0, r2)
            int r1 = r0.length
            r11 = r15
        L8c7:
            if (r11 >= r1) goto L8d3
            r2 = r0[r11]
            E1.B r2 = (E1.B) r2
            r7.removeSpan(r2)
            int r11 = r11 + 1
            goto L8c7
        L8d3:
            N0.i r0 = new N0.i
            throw r39
        L8d6:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L8dc:
            r1 = r38
        L8de:
            r1.f7287h = r7
            M0.e r0 = new M0.e
            S0.e r2 = r1.f7286g
            int r3 = r1.f7289l
            r0.<init>(r7, r2, r3)
            r1.i = r0
            return
        L8ec:
            r1 = r38
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r2 = "Array is empty."
            r0.<init>(r2)
            throw r0
        L8f6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid TextDirection."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.d.<init>(java.lang.String, L0.F, java.util.List, java.util.List, O0.d, W0.c):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // L0.p
    public final boolean a() {
        G0 g02 = this.j;
        if (g02 != null ? g02.K() : false) {
            return true;
        }
        if (!this.f7288k) {
            t tVar = this.f7282b.f3093c;
            k3.c cVar = i.f7301a;
            k3.c cVar2 = i.f7301a;
            S0 s0M = (S0) cVar2.f14120q;
            if (s0M == null) {
                if (l.c()) {
                    s0M = cVar2.m();
                    cVar2.f14120q = s0M;
                } else {
                    s0M = j.f7302a;
                }
            }
            if (((Boolean) s0M.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // L0.p
    public final float b() {
        return this.i.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c() {
        float f;
        M0.e eVar = this.i;
        float f7 = eVar.f3702e;
        TextPaint textPaint = eVar.f3699b;
        if (!Float.isNaN(f7)) {
            return eVar.f3702e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = eVar.f3698a;
        lineInstance.setText(new M0.b(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C(2));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C1371j(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                C1371j c1371j = (C1371j) priorityQueue.peek();
                if (c1371j != null && ((Number) c1371j.f15081r).intValue() - ((Number) c1371j.f15080q).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new C1371j(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C1371j c1371j2 = (C1371j) it.next();
            float desiredWidth = Layout.getDesiredWidth(eVar.b(), ((Number) c1371j2.f15080q).intValue(), ((Number) c1371j2.f15081r).intValue(), textPaint);
            while (it.hasNext()) {
                C1371j c1371j3 = (C1371j) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(eVar.b(), ((Number) c1371j3.f15080q).intValue(), ((Number) c1371j3.f15081r).intValue(), textPaint));
            }
            f = desiredWidth;
        }
        eVar.f3702e = f;
        return f;
    }
}
