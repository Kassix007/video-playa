package C0;

import android.os.Bundle;
import i1.C1134a;
import w1.C1839b;

/* JADX INFO: loaded from: classes.dex */
public final class E extends C1134a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f810s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1839b f811t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(C1839b c1839b, int i) {
        super(17);
        this.f810s = i;
        this.f811t = c1839b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.C1134a
    public void r(int i, x1.e eVar, String str, Bundle bundle) {
        switch (this.f810s) {
            case 0:
                ((I) this.f811t).j(i, eVar, str, bundle);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:655:0x0300 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:661:0x036d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:668:0x03da */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0c85  */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r1v109, types: [n5.s] */
    /* JADX WARN: Type inference failed for: r1v110, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v111, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.util.ArrayList] */
    @Override // i1.C1134a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x1.e s(int r44) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            int r2 = r0.f810s
            w1.b r3 = r0.f811t
            switch(r2) {
                case 0: goto L1d;
                default: goto Lb;
            }
        Lb:
            D1.a r3 = (D1.a) r3
            x1.e r1 = r3.n(r1)
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.f18345a
            android.view.accessibility.AccessibilityNodeInfo r1 = android.view.accessibility.AccessibilityNodeInfo.obtain(r1)
            x1.e r2 = new x1.e
            r2.<init>(r1)
            return r2
        L1d:
            C0.I r3 = (C0.I) r3
            C0.A r2 = r3.f854d
            C0.n r4 = r2.getViewTreeOwners()
            if (r4 == 0) goto L34
            androidx.lifecycle.x r4 = r4.f1065a
            androidx.lifecycle.q r4 = r4.getLifecycle()
            if (r4 == 0) goto L34
            androidx.lifecycle.p r4 = r4.b()
            goto L35
        L34:
            r4 = 0
        L35:
            androidx.lifecycle.p r6 = androidx.lifecycle.EnumC0653p.f9556q
            if (r4 != r6) goto L3a
            goto L4f
        L3a:
            android.view.accessibility.AccessibilityNodeInfo r4 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            x1.e r6 = new x1.e
            r6.<init>(r4)
            r.k r7 = r3.s()
            java.lang.Object r7 = r7.b(r1)
            C0.W0 r7 = (C0.W0) r7
            if (r7 != 0) goto L54
        L4f:
            r9 = r3
            r5 = 0
            r3 = r1
            goto Lc74
        L54:
            I0.m r8 = r7.f941a
            r9 = -1
            if (r1 != r9) goto L6b
            android.view.ViewParent r10 = r2.getParentForAccessibility()
            boolean r11 = r10 instanceof android.view.View
            if (r11 == 0) goto L64
            android.view.View r10 = (android.view.View) r10
            goto L65
        L64:
            r10 = 0
        L65:
            r6.f18346b = r9
            r4.setParent(r10)
            goto L91
        L6b:
            I0.m r10 = r8.j()
            if (r10 == 0) goto L78
            int r10 = r10.f2270g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L79
        L78:
            r10 = 0
        L79:
            if (r10 == 0) goto Lc8b
            int r10 = r10.intValue()
            I0.n r11 = r2.getSemanticsOwner()
            I0.m r11 = r11.a()
            int r11 = r11.f2270g
            if (r10 != r11) goto L8c
            r10 = r9
        L8c:
            r6.f18346b = r10
            r4.setParent(r2, r10)
        L91:
            r6.f18347c = r1
            r4.setSource(r2, r1)
            android.graphics.Rect r7 = r3.k(r7)
            r4.setBoundsInScreen(r7)
            r.S r7 = r3.f869v
            android.content.Context r10 = r2.getContext()
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r11 = "android.view.View"
            r6.i(r11)
            I0.i r11 = r8.f2268d
            I0.i r12 = r8.f2268d
            r.G r13 = r11.f2257q
            I0.s r14 = I0.p.f2293C
            boolean r14 = r13.c(r14)
            if (r14 == 0) goto Lbf
            java.lang.String r14 = "android.widget.EditText"
            r6.i(r14)
        Lbf:
            I0.s r14 = I0.p.f2323y
            boolean r14 = r13.c(r14)
            if (r14 == 0) goto Lcc
            java.lang.String r14 = "android.widget.TextView"
            r6.i(r14)
        Lcc:
            I0.s r14 = I0.p.f2320v
            java.lang.Object r14 = r13.g(r14)
            if (r14 != 0) goto Ld5
            r14 = 0
        Ld5:
            I0.f r14 = (I0.f) r14
            r15 = 4
            r16 = 0
            if (r14 == 0) goto L125
            int r9 = r14.f2230a
            boolean r5 = r8.f2269e
            if (r5 != 0) goto Lec
            java.util.List r5 = I0.m.h(r15, r8)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L125
        Lec:
            java.lang.String r5 = "AccessibilityNodeInfo.roleDescription"
            if (r9 != r15) goto Lff
            r9 = 2131820850(0x7f110132, float:1.9274427E38)
            java.lang.String r9 = r10.getString(r9)
            android.os.Bundle r15 = r4.getExtras()
            r15.putCharSequence(r5, r9)
            goto L125
        Lff:
            r15 = 2
            if (r9 != r15) goto L111
            r9 = 2131820849(0x7f110131, float:1.9274425E38)
            java.lang.String r9 = r10.getString(r9)
            android.os.Bundle r15 = r4.getExtras()
            r15.putCharSequence(r5, r9)
            goto L125
        L111:
            java.lang.String r5 = C0.W.r(r9)
            r15 = 5
            if (r9 != r15) goto L122
            boolean r9 = r8.m()
            if (r9 != 0) goto L122
            boolean r9 = r11.f2259s
            if (r9 == 0) goto L125
        L122:
            r6.i(r5)
        L125:
            android.content.Context r5 = r2.getContext()
            java.lang.String r5 = r5.getPackageName()
            r4.setPackageName(r5)
            boolean r5 = C0.W.k(r8)
            r4.setImportantForAccessibility(r5)
            r5 = 4
            java.util.List r9 = I0.m.h(r5, r8)
            r5 = r9
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r15 = 0
        L144:
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.f18345a
            if (r15 >= r5) goto L188
            java.lang.Object r19 = r9.get(r15)
            r20 = r5
            r5 = r19
            I0.m r5 = (I0.m) r5
            r19 = r9
            r.k r9 = r3.s()
            r21 = r15
            int r15 = r5.f2270g
            boolean r9 = r9.a(r15)
            if (r9 == 0) goto L181
            C0.k0 r9 = r2.getAndroidViewsHandler$ui_release()
            java.util.HashMap r9 = r9.getLayoutNodeToHolder()
            B0.L r15 = r5.f2267c
            java.lang.Object r9 = r9.get(r15)
            Z0.j r9 = (Z0.j) r9
            int r5 = r5.f2270g
            r15 = -1
            if (r5 != r15) goto L178
            goto L181
        L178:
            if (r9 == 0) goto L17e
            r4.addChild(r9)
            goto L181
        L17e:
            r0.addChild(r2, r5)
        L181:
            int r15 = r21 + 1
            r9 = r19
            r5 = r20
            goto L144
        L188:
            int r5 = r3.f861n
            r9 = 1
            if (r1 != r5) goto L196
            r0.setAccessibilityFocused(r9)
            x1.d r5 = x1.d.f18332g
            r6.b(r5)
            goto L19f
        L196:
            r5 = 0
            r0.setAccessibilityFocused(r5)
            x1.d r5 = x1.d.f
            r6.b(r5)
        L19f:
            L0.d r5 = C0.M.e(r8)
            if (r5 == 0) goto L44a
            r2.getFontFamilyResolver()
            W0.c r22 = r2.getDensity()
            B0.G0 r15 = r3.f847I
            android.text.SpannableString r9 = new android.text.SpannableString
            r25 = r2
            java.lang.String r2 = r5.f3106r
            r26 = r7
            java.util.List r7 = r5.f3105q
            r9.<init>(r2)
            java.util.ArrayList r5 = r5.f3107s
            r27 = r2
            if (r5 == 0) goto L2c3
            int r2 = r5.size()
            r28 = r12
            r12 = 0
        L1c8:
            if (r12 >= r2) goto L2b4
            java.lang.Object r19 = r5.get(r12)
            r29 = r2
            r2 = r19
            L0.c r2 = (L0.C0191c) r2
            r30 = r5
            java.lang.Object r5 = r2.f3101a
            L0.y r5 = (L0.y) r5
            r31 = r12
            int r12 = r2.f3102b
            int r2 = r2.f3103c
            V0.p r1 = r5.f3227a
            r32 = r10
            r33 = r11
            long r10 = r1.a()
            r34 = r0
            long r0 = r5.f3228b
            r20 = r0
            O0.j r0 = r5.f3229c
            O0.h r1 = r5.f3230d
            r35 = r0
            V0.q r0 = r5.j
            r36 = r3
            R0.b r3 = r5.f3234k
            r37 = r13
            r38 = r14
            long r13 = r5.f3235l
            r39 = r13
            V0.l r13 = r5.f3236m
            V0.p r5 = r5.f3227a
            r14 = r4
            r19 = r5
            long r4 = r19.a()
            boolean r4 = j0.o.c(r10, r4)
            r41 = 16
            if (r4 == 0) goto L21a
            r5 = r19
            goto L228
        L21a:
            int r4 = (r10 > r41 ? 1 : (r10 == r41 ? 0 : -1))
            if (r4 == 0) goto L225
            V0.c r4 = new V0.c
            r4.<init>(r10)
        L223:
            r5 = r4
            goto L228
        L225:
            V0.n r4 = V0.n.f7941a
            goto L223
        L228:
            long r4 = r5.a()
            com.google.android.gms.internal.measurement.P1.R(r9, r4, r12, r2)
            r24 = r2
            r19 = r9
            r23 = r12
            com.google.android.gms.internal.measurement.P1.T(r19, r20, r22, r23, r24)
            r2 = r19
            r4 = r23
            r5 = r24
            if (r35 != 0) goto L246
            if (r1 == 0) goto L243
            goto L246
        L243:
            r1 = 33
            goto L261
        L246:
            if (r35 != 0) goto L24b
            O0.j r9 = O0.j.f4281s
            goto L24d
        L24b:
            r9 = r35
        L24d:
            if (r1 == 0) goto L252
            int r1 = r1.f4278a
            goto L253
        L252:
            r1 = 0
        L253:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            int r1 = com.google.android.gms.internal.measurement.K1.p(r9, r1)
            r10.<init>(r1)
            r1 = 33
            r2.setSpan(r10, r4, r5, r1)
        L261:
            if (r13 == 0) goto L27d
            int r9 = r13.f7939a
            r10 = r9 | 1
            if (r10 != r9) goto L271
            android.text.style.UnderlineSpan r10 = new android.text.style.UnderlineSpan
            r10.<init>()
            r2.setSpan(r10, r4, r5, r1)
        L271:
            r10 = r9 | 2
            if (r10 != r9) goto L27d
            android.text.style.StrikethroughSpan r9 = new android.text.style.StrikethroughSpan
            r9.<init>()
            r2.setSpan(r9, r4, r5, r1)
        L27d:
            if (r0 == 0) goto L289
            android.text.style.ScaleXSpan r9 = new android.text.style.ScaleXSpan
            float r0 = r0.f7945a
            r9.<init>(r0)
            r2.setSpan(r9, r4, r5, r1)
        L289:
            com.google.android.gms.internal.measurement.P1.W(r2, r3, r4, r5)
            int r0 = (r39 > r41 ? 1 : (r39 == r41 ? 0 : -1))
            if (r0 == 0) goto L29c
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r3 = j0.AbstractC1145B.v(r39)
            r0.<init>(r3)
            r2.setSpan(r0, r4, r5, r1)
        L29c:
            int r12 = r31 + 1
            r1 = r44
            r9 = r2
            r4 = r14
            r2 = r29
            r5 = r30
            r10 = r32
            r11 = r33
            r0 = r34
            r3 = r36
            r13 = r37
            r14 = r38
            goto L1c8
        L2b4:
            r34 = r0
            r36 = r3
            r2 = r9
            r32 = r10
            r33 = r11
            r37 = r13
            r38 = r14
            r14 = r4
            goto L2c6
        L2c3:
            r28 = r12
            goto L2b4
        L2c6:
            int r0 = r27.length()
            n5.s r1 = n5.s.f15299q
            if (r7 == 0) goto L2ff
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r7.size()
            r3.<init>(r4)
            r4 = r7
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L2df:
            if (r5 >= r4) goto L300
            java.lang.Object r9 = r7.get(r5)
            r10 = r9
            L0.c r10 = (L0.C0191c) r10
            java.lang.Object r11 = r10.f3101a
            boolean r11 = r11 instanceof L0.H
            if (r11 == 0) goto L2fc
            int r11 = r10.f3102b
            int r10 = r10.f3103c
            r12 = 0
            boolean r10 = L0.AbstractC0193e.a(r12, r0, r11, r10)
            if (r10 == 0) goto L2fc
            r3.add(r9)
        L2fc:
            int r5 = r5 + 1
            goto L2df
        L2ff:
            r3 = r1
        L300:
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r4 = 0
        L308:
            if (r4 >= r0) goto L335
            java.lang.Object r5 = r3.get(r4)
            L0.c r5 = (L0.C0191c) r5
            java.lang.Object r9 = r5.f3101a
            L0.H r9 = (L0.H) r9
            int r10 = r5.f3102b
            int r5 = r5.f3103c
            boolean r11 = r9 instanceof L0.H
            if (r11 == 0) goto L32f
            android.text.style.TtsSpan$VerbatimBuilder r11 = new android.text.style.TtsSpan$VerbatimBuilder
            java.lang.String r9 = r9.f3095a
            r11.<init>(r9)
            android.text.style.TtsSpan r9 = r11.build()
            r11 = 33
            r2.setSpan(r9, r10, r5, r11)
            int r4 = r4 + 1
            goto L308
        L32f:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L335:
            int r0 = r27.length()
            if (r7 == 0) goto L36c
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r7.size()
            r3.<init>(r4)
            r4 = r7
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L34c:
            if (r5 >= r4) goto L36d
            java.lang.Object r9 = r7.get(r5)
            r10 = r9
            L0.c r10 = (L0.C0191c) r10
            java.lang.Object r11 = r10.f3101a
            boolean r11 = r11 instanceof L0.G
            if (r11 == 0) goto L369
            int r11 = r10.f3102b
            int r10 = r10.f3103c
            r12 = 0
            boolean r10 = L0.AbstractC0193e.a(r12, r0, r11, r10)
            if (r10 == 0) goto L369
            r3.add(r9)
        L369:
            int r5 = r5 + 1
            goto L34c
        L36c:
            r3 = r1
        L36d:
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r4 = 0
        L375:
            if (r4 >= r0) goto L3a3
            java.lang.Object r5 = r3.get(r4)
            L0.c r5 = (L0.C0191c) r5
            java.lang.Object r9 = r5.f3101a
            L0.G r9 = (L0.G) r9
            int r10 = r5.f3102b
            int r5 = r5.f3103c
            java.lang.Object r11 = r15.f234r
            java.util.WeakHashMap r11 = (java.util.WeakHashMap) r11
            java.lang.Object r12 = r11.get(r9)
            if (r12 != 0) goto L399
            android.text.style.URLSpan r12 = new android.text.style.URLSpan
            java.lang.String r13 = r9.f3094a
            r12.<init>(r13)
            r11.put(r9, r12)
        L399:
            android.text.style.URLSpan r12 = (android.text.style.URLSpan) r12
            r11 = 33
            r2.setSpan(r12, r10, r5, r11)
            int r4 = r4 + 1
            goto L375
        L3a3:
            int r0 = r27.length()
            if (r7 == 0) goto L3da
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r7.size()
            r1.<init>(r3)
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
        L3ba:
            if (r4 >= r3) goto L3da
            java.lang.Object r5 = r7.get(r4)
            r9 = r5
            L0.c r9 = (L0.C0191c) r9
            java.lang.Object r10 = r9.f3101a
            boolean r10 = r10 instanceof L0.j
            if (r10 == 0) goto L3d7
            int r10 = r9.f3102b
            int r9 = r9.f3103c
            r12 = 0
            boolean r9 = L0.AbstractC0193e.a(r12, r0, r10, r9)
            if (r9 == 0) goto L3d7
            r1.add(r5)
        L3d7:
            int r4 = r4 + 1
            goto L3ba
        L3da:
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r3 = 0
        L3e2:
            if (r3 >= r0) goto L443
            java.lang.Object r4 = r1.get(r3)
            L0.c r4 = (L0.C0191c) r4
            int r5 = r4.f3102b
            java.lang.Object r7 = r4.f3101a
            int r9 = r4.f3103c
            if (r5 == r9) goto L43e
            r10 = r7
            L0.j r10 = (L0.j) r10
            boolean r11 = r10 instanceof L0.i
            if (r11 == 0) goto L424
            r10.getClass()
            L0.c r4 = new L0.c
            java.lang.String r10 = "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url"
            kotlin.jvm.internal.m.c(r7, r10)
            L0.i r7 = (L0.i) r7
            r4.<init>(r5, r9, r7)
            java.lang.Object r10 = r15.f235s
            java.util.WeakHashMap r10 = (java.util.WeakHashMap) r10
            java.lang.Object r11 = r10.get(r4)
            if (r11 != 0) goto L41c
            android.text.style.URLSpan r11 = new android.text.style.URLSpan
            java.lang.String r7 = r7.f3120a
            r11.<init>(r7)
            r10.put(r4, r11)
        L41c:
            android.text.style.URLSpan r11 = (android.text.style.URLSpan) r11
            r4 = 33
            r2.setSpan(r11, r5, r9, r4)
            goto L440
        L424:
            java.lang.Object r7 = r15.f236t
            java.util.WeakHashMap r7 = (java.util.WeakHashMap) r7
            java.lang.Object r11 = r7.get(r4)
            if (r11 != 0) goto L436
            S0.f r11 = new S0.f
            r11.<init>(r10)
            r7.put(r4, r11)
        L436:
            android.text.style.ClickableSpan r11 = (android.text.style.ClickableSpan) r11
            r4 = 33
            r2.setSpan(r11, r5, r9, r4)
            goto L440
        L43e:
            r4 = 33
        L440:
            int r3 = r3 + 1
            goto L3e2
        L443:
            java.lang.CharSequence r0 = C0.I.K(r2)
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            goto L45f
        L44a:
            r34 = r0
            r25 = r2
            r36 = r3
            r26 = r7
            r32 = r10
            r33 = r11
            r28 = r12
            r37 = r13
            r38 = r14
            r14 = r4
            r0 = r16
        L45f:
            r6.n(r0)
            I0.s r0 = I0.p.f2298H
            r1 = r37
            boolean r2 = r1.c(r0)
            if (r2 == 0) goto L482
            r2 = 1
            r14.setContentInvalid(r2)
            java.lang.Object r0 = r1.g(r0)
            if (r0 != 0) goto L478
            r0 = r16
        L478:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = r34
            r2.setError(r0)
        L47f:
            r0 = r32
            goto L485
        L482:
            r2 = r34
            goto L47f
        L485:
            java.lang.String r3 = C0.M.d(r8, r0)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L493
            E0.e.g(r2, r3)
            goto L49c
        L493:
            android.os.Bundle r4 = r2.getExtras()
            java.lang.String r5 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r4.putCharSequence(r5, r3)
        L49c:
            boolean r3 = C0.M.c(r8)
            r2.setCheckable(r3)
            I0.s r3 = I0.p.f2296F
            java.lang.Object r3 = r1.g(r3)
            if (r3 != 0) goto L4ad
            r3 = r16
        L4ad:
            K0.a r3 = (K0.a) r3
            if (r3 == 0) goto L4c2
            K0.a r4 = K0.a.f2848q
            if (r3 != r4) goto L4ba
            r4 = 1
            r2.setChecked(r4)
            goto L4c2
        L4ba:
            K0.a r4 = K0.a.f2849r
            if (r3 != r4) goto L4c2
            r12 = 0
            r2.setChecked(r12)
        L4c2:
            I0.s r3 = I0.p.f2295E
            java.lang.Object r3 = r1.g(r3)
            if (r3 != 0) goto L4cc
            r3 = r16
        L4cc:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L4eb
            boolean r3 = r3.booleanValue()
            if (r38 != 0) goto L4da
            r4 = r38
            r7 = 4
            goto L4e5
        L4da:
            r4 = r38
            int r5 = r4.f2230a
            r7 = 4
            if (r5 != r7) goto L4e5
            r14.setSelected(r3)
            goto L4e8
        L4e5:
            r2.setChecked(r3)
        L4e8:
            r3 = r33
            goto L4ef
        L4eb:
            r4 = r38
            r7 = 4
            goto L4e8
        L4ef:
            boolean r5 = r3.f2259s
            if (r5 == 0) goto L4fd
            java.util.List r5 = I0.m.h(r7, r8)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L517
        L4fd:
            I0.s r5 = I0.p.f2302a
            java.lang.Object r5 = r1.g(r5)
            if (r5 != 0) goto L507
            r5 = r16
        L507:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L512
            java.lang.Object r5 = n5.l.m0(r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L514
        L512:
            r5 = r16
        L514:
            r2.setContentDescription(r5)
        L517:
            I0.s r5 = I0.p.f2321w
            java.lang.Object r5 = r1.g(r5)
            if (r5 != 0) goto L521
            r5 = r16
        L521:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L54a
            r7 = r8
        L526:
            if (r7 == 0) goto L544
            I0.i r9 = r7.f2268d
            I0.s r10 = I0.q.f2325a
            r.G r11 = r9.f2257q
            boolean r11 = r11.c(r10)
            if (r11 == 0) goto L53f
            java.lang.Object r7 = r9.h(r10)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L545
        L53f:
            I0.m r7 = r7.j()
            goto L526
        L544:
            r7 = 0
        L545:
            if (r7 == 0) goto L54a
            r14.setViewIdResourceName(r5)
        L54a:
            I0.s r5 = I0.p.f2308h
            java.lang.Object r5 = r1.g(r5)
            if (r5 != 0) goto L554
            r5 = r16
        L554:
            m5.y r5 = (m5.C1386y) r5
            r7 = 28
            if (r5 == 0) goto L568
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r7) goto L563
            r5 = 1
            m0.o.v(r2, r5)
            goto L568
        L563:
            r5 = 1
            r15 = 2
            r6.h(r15, r5)
        L568:
            I0.s r5 = I0.p.f2297G
            boolean r5 = r1.c(r5)
            r14.setPassword(r5)
            I0.s r5 = I0.p.f2300J
            boolean r5 = r1.c(r5)
            r14.setEditable(r5)
            I0.s r5 = I0.p.f2301K
            java.lang.Object r5 = r1.g(r5)
            if (r5 != 0) goto L584
            r5 = r16
        L584:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L58d
            int r5 = r5.intValue()
            goto L58e
        L58d:
            r5 = -1
        L58e:
            r2.setMaxTextLength(r5)
            boolean r5 = C0.M.a(r8)
            r2.setEnabled(r5)
            I0.s r5 = I0.p.f2309k
            boolean r9 = r1.c(r5)
            r2.setFocusable(r9)
            boolean r9 = r14.isFocusable()
            if (r9 == 0) goto L5cf
            java.lang.Object r3 = r3.h(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.setFocused(r3)
            boolean r3 = r14.isFocused()
            if (r3 == 0) goto L5c6
            r15 = 2
            r6.a(r15)
            r3 = r44
            r9 = r36
            r9.f862o = r3
        L5c4:
            r10 = 1
            goto L5d4
        L5c6:
            r3 = r44
            r9 = r36
            r10 = 1
            r6.a(r10)
            goto L5d4
        L5cf:
            r3 = r44
            r9 = r36
            goto L5c4
        L5d4:
            boolean r11 = C0.W.j(r8)
            r11 = r11 ^ r10
            r2.setVisibleToUser(r11)
            I0.s r10 = I0.p.j
            java.lang.Object r10 = r1.g(r10)
            if (r10 != 0) goto L5e6
            r10 = r16
        L5e6:
            if (r10 != 0) goto Lc85
            r12 = 0
            r2.setClickable(r12)
            I0.s r10 = I0.h.f2234a
            I0.s r10 = I0.h.f2235b
            java.lang.Object r10 = r1.g(r10)
            if (r10 != 0) goto L5f8
            r10 = r16
        L5f8:
            I0.a r10 = (I0.a) r10
            r11 = 16
            r12 = 3
            if (r10 == 0) goto L64d
            I0.s r13 = I0.p.f2295E
            java.lang.Object r13 = r1.g(r13)
            if (r13 != 0) goto L609
            r13 = r16
        L609:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.m.a(r13, r15)
            if (r4 != 0) goto L613
        L611:
            r7 = 0
            goto L619
        L613:
            int r15 = r4.f2230a
            r7 = 4
            if (r15 != r7) goto L611
            r7 = 1
        L619:
            if (r7 != 0) goto L629
            if (r4 != 0) goto L61f
        L61d:
            r4 = 0
            goto L624
        L61f:
            int r4 = r4.f2230a
            if (r4 != r12) goto L61d
            r4 = 1
        L624:
            if (r4 == 0) goto L627
            goto L629
        L627:
            r4 = 0
            goto L62a
        L629:
            r4 = 1
        L62a:
            if (r4 == 0) goto L633
            if (r4 == 0) goto L631
            if (r13 != 0) goto L631
            goto L633
        L631:
            r4 = 0
            goto L634
        L633:
            r4 = 1
        L634:
            r2.setClickable(r4)
            boolean r4 = C0.M.a(r8)
            if (r4 == 0) goto L64d
            boolean r4 = r14.isClickable()
            if (r4 == 0) goto L64d
            x1.d r4 = new x1.d
            java.lang.String r7 = r10.f2221a
            r4.<init>(r11, r7)
            r6.b(r4)
        L64d:
            r4 = 0
            r2.setLongClickable(r4)
            I0.s r4 = I0.h.f2236c
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L65b
            r4 = r16
        L65b:
            I0.a r4 = (I0.a) r4
            if (r4 == 0) goto L675
            r10 = 1
            r2.setLongClickable(r10)
            boolean r7 = C0.M.a(r8)
            if (r7 == 0) goto L675
            x1.d r7 = new x1.d
            r10 = 32
            java.lang.String r4 = r4.f2221a
            r7.<init>(r10, r4)
            r6.b(r7)
        L675:
            I0.s r4 = I0.h.f2245o
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L67f
            r4 = r16
        L67f:
            I0.a r4 = (I0.a) r4
            if (r4 == 0) goto L68f
            x1.d r7 = new x1.d
            r10 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r4 = r4.f2221a
            r7.<init>(r10, r4)
            r6.b(r7)
        L68f:
            boolean r4 = C0.M.a(r8)
            if (r4 == 0) goto L722
            I0.s r4 = I0.h.j
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L69f
            r4 = r16
        L69f:
            I0.a r4 = (I0.a) r4
            if (r4 == 0) goto L6af
            x1.d r7 = new x1.d
            r10 = 2097152(0x200000, float:2.938736E-39)
            java.lang.String r4 = r4.f2221a
            r7.<init>(r10, r4)
            r6.b(r7)
        L6af:
            I0.s r4 = I0.h.f2244n
            java.lang.Object r1 = r1.g(r4)
            if (r1 != 0) goto L6b9
            r1 = r16
        L6b9:
            I0.a r1 = (I0.a) r1
            if (r1 == 0) goto L6ca
            x1.d r4 = new x1.d
            r7 = 16908372(0x1020054, float:2.3877464E-38)
            java.lang.String r1 = r1.f2221a
            r4.<init>(r7, r1)
            r6.b(r4)
        L6ca:
            I0.s r1 = I0.h.f2246p
            r4 = r28
            r.G r7 = r4.f2257q
            java.lang.Object r1 = r7.g(r1)
            if (r1 != 0) goto L6d8
            r1 = r16
        L6d8:
            I0.a r1 = (I0.a) r1
            if (r1 == 0) goto L6e8
            x1.d r7 = new x1.d
            r10 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r1 = r1.f2221a
            r7.<init>(r10, r1)
            r6.b(r7)
        L6e8:
            I0.s r1 = I0.h.f2247q
            r.G r7 = r4.f2257q
            java.lang.Object r1 = r7.g(r1)
            if (r1 != 0) goto L6f4
            r1 = r16
        L6f4:
            I0.a r1 = (I0.a) r1
            if (r1 == 0) goto L724
            boolean r7 = r2.isFocused()
            if (r7 == 0) goto L724
            C0.i r7 = r25.m3getClipboardManager()
            android.content.ClipboardManager r7 = r7.f1044a
            android.content.ClipDescription r7 = r7.getPrimaryClipDescription()
            if (r7 == 0) goto L711
            java.lang.String r10 = "text/*"
            boolean r7 = r7.hasMimeType(r10)
            goto L712
        L711:
            r7 = 0
        L712:
            if (r7 == 0) goto L724
            x1.d r7 = new x1.d
            r10 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r1 = r1.f2221a
            r7.<init>(r10, r1)
            r6.b(r7)
            goto L724
        L722:
            r4 = r28
        L724:
            java.lang.String r1 = C0.I.t(r8)
            if (r1 == 0) goto L733
            int r1 = r1.length()
            if (r1 != 0) goto L731
            goto L733
        L731:
            r1 = 0
            goto L734
        L733:
            r1 = 1
        L734:
            if (r1 != 0) goto L805
            int r1 = r9.r(r8)
            int r7 = r9.q(r8)
            r2.setTextSelection(r1, r7)
            I0.s r1 = I0.h.i
            r.G r7 = r4.f2257q
            java.lang.Object r1 = r7.g(r1)
            if (r1 != 0) goto L74d
            r1 = r16
        L74d:
            I0.a r1 = (I0.a) r1
            x1.d r7 = new x1.d
            if (r1 == 0) goto L756
            java.lang.String r1 = r1.f2221a
            goto L758
        L756:
            r1 = r16
        L758:
            r10 = 131072(0x20000, float:1.83671E-40)
            r7.<init>(r10, r1)
            r6.b(r7)
            r1 = 256(0x100, float:3.59E-43)
            r6.a(r1)
            r1 = 512(0x200, float:7.175E-43)
            r6.a(r1)
            r1 = 11
            r2.setMovementGranularities(r1)
            I0.s r1 = I0.p.f2302a
            r.G r7 = r4.f2257q
            java.lang.Object r1 = r7.g(r1)
            if (r1 != 0) goto L77b
            r1 = r16
        L77b:
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L78a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L788
            goto L78a
        L788:
            r1 = 0
            goto L78b
        L78a:
            r1 = 1
        L78b:
            if (r1 == 0) goto L805
            I0.s r1 = I0.h.f2234a
            r.G r7 = r4.f2257q
            boolean r1 = r7.c(r1)
            if (r1 == 0) goto L805
            I0.s r1 = I0.p.f2293C
            r.G r7 = r4.f2257q
            boolean r1 = r7.c(r1)
            if (r1 == 0) goto L7b4
            r.G r1 = r4.f2257q
            java.lang.Object r1 = r1.g(r5)
            if (r1 != 0) goto L7ab
            r1 = r16
        L7ab:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.m.a(r1, r5)
            if (r1 != 0) goto L7b4
            goto L7f7
        L7b4:
            B0.L r1 = r8.f2267c
            B0.L r1 = r1.s()
        L7ba:
            if (r1 == 0) goto L7d7
            I0.i r5 = r1.u()
            if (r5 == 0) goto L7d2
            boolean r7 = r5.f2259s
            r10 = 1
            if (r7 != r10) goto L7d2
            I0.s r7 = I0.p.f2293C
            r.G r5 = r5.f2257q
            boolean r5 = r5.c(r7)
            if (r5 == 0) goto L7d2
            goto L7d9
        L7d2:
            B0.L r1 = r1.s()
            goto L7ba
        L7d7:
            r1 = r16
        L7d9:
            if (r1 == 0) goto L7f9
            I0.i r1 = r1.u()
            if (r1 == 0) goto L7f4
            I0.s r5 = I0.p.f2309k
            r.G r1 = r1.f2257q
            java.lang.Object r1 = r1.g(r5)
            if (r1 != 0) goto L7ed
            r1 = r16
        L7ed:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.m.a(r1, r5)
            goto L7f5
        L7f4:
            r1 = 0
        L7f5:
            if (r1 != 0) goto L7f9
        L7f7:
            r1 = 1
            goto L7fa
        L7f9:
            r1 = 0
        L7fa:
            if (r1 != 0) goto L805
            int r1 = r2.getMovementGranularities()
            r1 = r1 | 20
            r2.setMovementGranularities(r1)
        L805:
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r1 < r5) goto L84a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r10 = "androidx.compose.ui.semantics.id"
            r7.add(r10)
            java.lang.CharSequence r10 = r6.g()
            if (r10 == 0) goto L824
            int r10 = r10.length()
            if (r10 != 0) goto L822
            goto L824
        L822:
            r10 = 0
            goto L825
        L824:
            r10 = 1
        L825:
            if (r10 != 0) goto L836
            I0.s r10 = I0.h.f2234a
            r.G r13 = r4.f2257q
            boolean r10 = r13.c(r10)
            if (r10 == 0) goto L836
            java.lang.String r10 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            r7.add(r10)
        L836:
            I0.s r10 = I0.p.f2321w
            r.G r13 = r4.f2257q
            boolean r10 = r13.c(r10)
            if (r10 == 0) goto L845
            java.lang.String r10 = "androidx.compose.ui.semantics.testTag"
            r7.add(r10)
        L845:
            if (r1 < r5) goto L84a
            d0.l.q(r2, r7)
        L84a:
            I0.s r5 = I0.p.f2304c
            r.G r7 = r4.f2257q
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto L856
            r5 = r16
        L856:
            I0.e r5 = (I0.e) r5
            if (r5 == 0) goto L8f3
            G5.a r7 = r5.f2229b
            float r10 = r5.f2228a
            I0.s r13 = I0.h.f2240h
            r.G r14 = r4.f2257q
            boolean r14 = r14.c(r13)
            if (r14 == 0) goto L86e
            java.lang.String r14 = "android.widget.SeekBar"
            r6.i(r14)
            goto L873
        L86e:
            java.lang.String r14 = "android.widget.ProgressBar"
            r6.i(r14)
        L873:
            I0.e r14 = I0.e.f2227c
            if (r5 == r14) goto L893
            float r14 = r7.f2015a
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            float r14 = r14.floatValue()
            float r7 = r7.f2016b
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            float r7 = r7.floatValue()
            r15 = 1
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r7 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r15, r14, r7, r10)
            r2.setRangeInfo(r7)
        L893:
            boolean r4 = r4.d(r13)
            if (r4 == 0) goto L8f3
            boolean r4 = C0.M.a(r8)
            if (r4 == 0) goto L8f3
            G5.a r4 = r5.a()
            float r4 = r4.f2016b
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            float r4 = r4.floatValue()
            G5.a r7 = r5.a()
            float r7 = r7.f2015a
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            float r7 = r7.floatValue()
            int r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r13 >= 0) goto L8c0
            r4 = r7
        L8c0:
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 >= 0) goto L8c9
            x1.d r4 = x1.d.f18333h
            r6.b(r4)
        L8c9:
            G5.a r4 = r5.a()
            float r4 = r4.f2015a
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            float r4 = r4.floatValue()
            G5.a r5 = r5.a()
            float r5 = r5.f2016b
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r5 = r5.floatValue()
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 <= 0) goto L8ea
            r4 = r5
        L8ea:
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8f3
            x1.d r4 = x1.d.i
            r6.b(r4)
        L8f3:
            boolean r4 = C0.M.a(r8)
            if (r4 == 0) goto L918
            I0.i r4 = r8.f2268d
            I0.s r5 = I0.h.f2240h
            r.G r4 = r4.f2257q
            java.lang.Object r4 = r4.g(r5)
            if (r4 != 0) goto L907
            r4 = r16
        L907:
            I0.a r4 = (I0.a) r4
            if (r4 == 0) goto L918
            x1.d r5 = new x1.d
            r7 = 16908349(0x102003d, float:2.38774E-38)
            java.lang.String r4 = r4.f2221a
            r5.<init>(r7, r4)
            r6.b(r5)
        L918:
            I0.i r4 = r8.i()
            I0.s r5 = I0.p.f
            r.G r4 = r4.f2257q
            java.lang.Object r4 = r4.g(r5)
            if (r4 != 0) goto L928
            r4 = r16
        L928:
            I0.b r4 = (I0.b) r4
            if (r4 == 0) goto L939
            int r5 = r4.f2223a
            int r4 = r4.f2224b
            r7 = 0
            I2.l r4 = I2.l.a(r5, r4, r7)
            r6.j(r4)
            goto L99c
        L939:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            I0.i r5 = r8.i()
            I0.s r7 = I0.p.f2306e
            r.G r5 = r5.f2257q
            java.lang.Object r5 = r5.g(r7)
            if (r5 != 0) goto L94e
            r5 = r16
        L94e:
            if (r5 == 0) goto L979
            r7 = 4
            java.util.List r5 = I0.m.h(r7, r8)
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r10 = 0
        L95d:
            if (r10 >= r7) goto L979
            java.lang.Object r13 = r5.get(r10)
            I0.m r13 = (I0.m) r13
            I0.i r14 = r13.i()
            I0.s r15 = I0.p.f2295E
            r.G r14 = r14.f2257q
            boolean r14 = r14.c(r15)
            if (r14 == 0) goto L976
            r4.add(r13)
        L976:
            int r10 = r10 + 1
            goto L95d
        L979:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L99c
            boolean r5 = a.AbstractC0597a.l(r4)
            if (r5 == 0) goto L987
            r7 = 1
            goto L98b
        L987:
            int r7 = r4.size()
        L98b:
            if (r5 == 0) goto L993
            int r4 = r4.size()
        L991:
            r5 = 0
            goto L995
        L993:
            r4 = 1
            goto L991
        L995:
            I2.l r4 = I2.l.a(r7, r4, r5)
            r6.j(r4)
        L99c:
            a.AbstractC0597a.P(r8, r6)
            I0.i r4 = r8.k()
            I0.s r5 = I0.p.f2317s
            java.lang.Object r4 = Q2.g.G(r4, r5)
            I0.g r4 = (I0.g) r4
            I0.i r5 = r8.k()
            I0.s r7 = I0.h.f2237d
            java.lang.Object r5 = Q2.g.G(r5, r7)
            I0.a r5 = (I0.a) r5
            r7 = 0
            if (r4 == 0) goto La37
            if (r5 == 0) goto La37
            I0.i r10 = r8.i()
            I0.s r13 = I0.p.f
            r.G r10 = r10.f2257q
            java.lang.Object r10 = r10.g(r13)
            if (r10 != 0) goto L9cc
            r10 = r16
        L9cc:
            if (r10 != 0) goto L9e3
            I0.i r10 = r8.i()
            I0.s r13 = I0.p.f2306e
            r.G r10 = r10.f2257q
            java.lang.Object r10 = r10.g(r13)
            if (r10 != 0) goto L9de
            r10 = r16
        L9de:
            if (r10 == 0) goto L9e1
            goto L9e3
        L9e1:
            r10 = 0
            goto L9e4
        L9e3:
            r10 = 1
        L9e4:
            if (r10 != 0) goto L9eb
            java.lang.String r10 = "android.widget.HorizontalScrollView"
            r6.i(r10)
        L9eb:
            E.Q r10 = r4.f2232b
            java.lang.Object r10 = r10.invoke()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 <= 0) goto L9ff
            r10 = 1
            r6.m(r10)
        L9ff:
            boolean r10 = C0.M.a(r8)
            if (r10 == 0) goto La37
            boolean r10 = C0.I.y(r4)
            if (r10 == 0) goto La1e
            x1.d r10 = x1.d.f18333h
            r6.b(r10)
            boolean r10 = C0.M.f(r8)
            if (r10 != 0) goto La19
            x1.d r10 = x1.d.f18339p
            goto La1b
        La19:
            x1.d r10 = x1.d.f18337n
        La1b:
            r6.b(r10)
        La1e:
            boolean r4 = C0.I.x(r4)
            if (r4 == 0) goto La37
            x1.d r4 = x1.d.i
            r6.b(r4)
            boolean r4 = C0.M.f(r8)
            if (r4 != 0) goto La32
            x1.d r4 = x1.d.f18337n
            goto La34
        La32:
            x1.d r4 = x1.d.f18339p
        La34:
            r6.b(r4)
        La37:
            I0.i r4 = r8.k()
            I0.s r10 = I0.p.f2318t
            java.lang.Object r4 = Q2.g.G(r4, r10)
            I0.g r4 = (I0.g) r4
            if (r4 == 0) goto Lab0
            if (r5 == 0) goto Lab0
            I0.i r5 = r8.i()
            I0.s r10 = I0.p.f
            r.G r5 = r5.f2257q
            java.lang.Object r5 = r5.g(r10)
            if (r5 != 0) goto La57
            r5 = r16
        La57:
            if (r5 != 0) goto La6e
            I0.i r5 = r8.i()
            I0.s r10 = I0.p.f2306e
            r.G r5 = r5.f2257q
            java.lang.Object r5 = r5.g(r10)
            if (r5 != 0) goto La69
            r5 = r16
        La69:
            if (r5 == 0) goto La6c
            goto La6e
        La6c:
            r5 = 0
            goto La6f
        La6e:
            r5 = 1
        La6f:
            if (r5 != 0) goto La76
            java.lang.String r5 = "android.widget.ScrollView"
            r6.i(r5)
        La76:
            E.Q r5 = r4.f2232b
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto La8a
            r10 = 1
            r6.m(r10)
        La8a:
            boolean r5 = C0.M.a(r8)
            if (r5 == 0) goto Lab0
            boolean r5 = C0.I.y(r4)
            if (r5 == 0) goto Laa0
            x1.d r5 = x1.d.f18333h
            r6.b(r5)
            x1.d r5 = x1.d.f18338o
            r6.b(r5)
        Laa0:
            boolean r4 = C0.I.x(r4)
            if (r4 == 0) goto Lab0
            x1.d r4 = x1.d.i
            r6.b(r4)
            x1.d r4 = x1.d.f18336m
            r6.b(r4)
        Lab0:
            r4 = 29
            if (r1 < r4) goto Lab7
            C0.W.a(r8, r6)
        Lab7:
            I0.i r4 = r8.k()
            I0.s r5 = I0.p.f2305d
            java.lang.Object r4 = Q2.g.G(r4, r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 28
            if (r1 < r5) goto Lacb
            m0.o.p(r2, r4)
            goto Lad4
        Lacb:
            android.os.Bundle r1 = r2.getExtras()
            java.lang.String r5 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r1.putCharSequence(r5, r4)
        Lad4:
            boolean r1 = C0.M.a(r8)
            if (r1 == 0) goto Lc1c
            I0.i r1 = r8.k()
            I0.s r4 = I0.h.f2248r
            java.lang.Object r1 = Q2.g.G(r1, r4)
            I0.a r1 = (I0.a) r1
            if (r1 == 0) goto Laf6
            x1.d r4 = new x1.d
            r5 = 262144(0x40000, float:3.67342E-40)
            java.lang.String r1 = r1.a()
            r4.<init>(r5, r1)
            r6.b(r4)
        Laf6:
            I0.i r1 = r8.k()
            I0.s r4 = I0.h.f2249s
            java.lang.Object r1 = Q2.g.G(r1, r4)
            I0.a r1 = (I0.a) r1
            if (r1 == 0) goto Lb12
            x1.d r4 = new x1.d
            r5 = 524288(0x80000, float:7.34684E-40)
            java.lang.String r1 = r1.a()
            r4.<init>(r5, r1)
            r6.b(r4)
        Lb12:
            I0.i r1 = r8.k()
            I0.s r4 = I0.h.f2250t
            java.lang.Object r1 = Q2.g.G(r1, r4)
            I0.a r1 = (I0.a) r1
            if (r1 == 0) goto Lb2e
            x1.d r4 = new x1.d
            r5 = 1048576(0x100000, float:1.469368E-39)
            java.lang.String r1 = r1.a()
            r4.<init>(r5, r1)
            r6.b(r4)
        Lb2e:
            I0.i r1 = r8.k()
            I0.s r4 = I0.h.f2252v
            boolean r1 = r1.d(r4)
            if (r1 == 0) goto Lc1c
            I0.i r1 = r8.k()
            java.lang.Object r1 = r1.h(r4)
            java.util.List r1 = (java.util.List) r1
            int r4 = r1.size()
            r.u r5 = C0.I.f838P
            int r7 = r5.f16252b
            if (r4 >= r7) goto Lc01
            r.S r4 = new r.S
            r7 = 0
            r4.<init>(r7)
            r.B r7 = r.L.a()
            r10 = r26
            boolean r13 = r10.f16167q
            if (r13 == 0) goto Lb61
            r.r.a(r10)
        Lb61:
            int[] r13 = r10.f16168r
            int r14 = r10.f16170t
            int r13 = s.AbstractC1585a.a(r14, r3, r13)
            if (r13 < 0) goto Lb6d
            r13 = 1
            goto Lb6e
        Lb6d:
            r13 = 0
        Lb6e:
            if (r13 == 0) goto Lbe3
            java.lang.Object r13 = r10.c(r3)
            r.B r13 = (r.C1543B) r13
            int[] r11 = new int[r11]
            int[] r14 = r5.f16251a
            int r5 = r5.f16252b
            r15 = 0
            r18 = 0
        Lb7f:
            if (r15 >= r5) goto Lbaf
            r20 = r14[r15]
            r21 = r12
            int r12 = r18 + 1
            r22 = r5
            int r5 = r11.length
            if (r5 >= r12) goto Lba2
            int r5 = r11.length
            int r5 = r5 * 3
            r17 = 2
            int r5 = r5 / 2
            int r5 = java.lang.Math.max(r12, r5)
            int[] r5 = java.util.Arrays.copyOf(r11, r5)
            java.lang.String r11 = "copyOf(...)"
            kotlin.jvm.internal.m.d(r5, r11)
            r11 = r5
            goto Lba4
        Lba2:
            r17 = 2
        Lba4:
            r11[r18] = r20
            int r15 = r15 + 1
            r18 = r12
            r12 = r21
            r5 = r22
            goto Lb7f
        Lbaf:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r12 = r1
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            if (r12 > 0) goto Lbd7
            int r1 = r5.size()
            if (r1 > 0) goto Lbc4
            goto Lbec
        Lbc4:
            r12 = 0
            java.lang.Object r0 = r5.get(r12)
            C0.S.t(r0)
            if (r18 <= 0) goto Lbd1
            r0 = r11[r12]
            throw r16
        Lbd1:
            java.lang.String r0 = "Index must be between 0 and size"
            s.AbstractC1585a.d(r0)
            throw r16
        Lbd7:
            r12 = 0
            java.lang.Object r0 = r1.get(r12)
            C0.S.t(r0)
            kotlin.jvm.internal.m.b(r13)
            throw r16
        Lbe3:
            r11 = r1
            java.util.Collection r11 = (java.util.Collection) r11
            int r11 = r11.size()
            if (r11 > 0) goto Lbf5
        Lbec:
            r.S r1 = r9.f868u
            r1.e(r3, r4)
            r10.e(r3, r7)
            goto Lc1c
        Lbf5:
            r12 = 0
            java.lang.Object r0 = r1.get(r12)
            C0.S.t(r0)
            r5.c(r12)
            throw r16
        Lc01:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't have more than "
            r1.<init>(r2)
            int r2 = r5.f16252b
            r1.append(r2)
            java.lang.String r2 = " custom actions for one widget"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc1c:
            boolean r0 = C0.M.g(r8, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r1 < r5) goto Lc2a
            m0.o.q(r2, r0)
            goto Lc2e
        Lc2a:
            r10 = 1
            r6.h(r10, r0)
        Lc2e:
            r.t r0 = r9.f843E
            int r0 = r0.d(r3)
            r15 = -1
            if (r0 == r15) goto Lc54
            C0.k0 r1 = r25.getAndroidViewsHandler$ui_release()
            Z0.j r1 = C0.W.p(r1, r0)
            if (r1 == 0) goto Lc47
            r2.setTraversalBefore(r1)
            r1 = r25
            goto Lc4c
        Lc47:
            r1 = r25
            r2.setTraversalBefore(r1, r0)
        Lc4c:
            java.lang.String r0 = r9.f845G
            r4 = r16
            r9.j(r3, r6, r0, r4)
            goto Lc58
        Lc54:
            r4 = r16
            r1 = r25
        Lc58:
            r.t r0 = r9.f844F
            int r0 = r0.d(r3)
            r15 = -1
            if (r0 == r15) goto Lc73
            C0.k0 r1 = r1.getAndroidViewsHandler$ui_release()
            Z0.j r0 = C0.W.p(r1, r0)
            if (r0 == 0) goto Lc73
            r2.setTraversalAfter(r0)
            java.lang.String r0 = r9.f846H
            r9.j(r3, r6, r0, r4)
        Lc73:
            r5 = r6
        Lc74:
            boolean r0 = r9.f865r
            if (r0 == 0) goto Lc84
            int r0 = r9.f861n
            if (r3 != r0) goto Lc7e
            r9.f863p = r5
        Lc7e:
            int r0 = r9.f862o
            if (r3 != r0) goto Lc84
            r9.f864q = r5
        Lc84:
            return r5
        Lc85:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        Lc8b:
            r3 = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "semanticsNode "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " has null parent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            y0.AbstractC1904a.c(r0)
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.E.s(int):x1.e");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.C1134a
    public final x1.e t(int i) {
        switch (this.f810s) {
            case 0:
                I i7 = (I) this.f811t;
                if (i != 1) {
                    if (i == 2) {
                        return s(i7.f861n);
                    }
                    throw new IllegalArgumentException(k1.i.i(i, "Unknown focus type: "));
                }
                int i8 = i7.f862o;
                if (i8 == Integer.MIN_VALUE) {
                    return null;
                }
                return s(i8);
            default:
                D1.a aVar = (D1.a) this.f811t;
                int i9 = i == 2 ? aVar.f1331k : aVar.f1332l;
                if (i9 == Integer.MIN_VALUE) {
                    return null;
                }
                return s(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:143:0x020b) to fix multi-entry loop: BACK_EDGE: B:143:0x020b -> B:144:0x020c */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x020c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0704  */
    @Override // i1.C1134a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(int r26, int r27, android.os.Bundle r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            int r4 = r0.f810s
            r5 = 32768(0x8000, float:4.5918E-41)
            r6 = 16
            r7 = 128(0x80, float:1.794E-43)
            r8 = 64
            r9 = -1
            w1.b r10 = r0.f811t
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 65536(0x10000, float:9.18355E-41)
            r13 = 2
            r14 = 1
            r15 = 0
            switch(r4) {
                case 0: goto L97;
                default: goto L20;
            }
        L20:
            D1.a r10 = (D1.a) r10
            com.google.android.material.chip.Chip r4 = r10.i
            if (r1 == r9) goto L90
            if (r2 == r14) goto L8b
            if (r2 == r13) goto L86
            if (r2 == r8) goto L60
            if (r2 == r7) goto L53
            g4.d r10 = (g4.C1087d) r10
            com.google.android.material.chip.Chip r3 = r10.f13072q
            if (r2 != r6) goto L51
            if (r1 != 0) goto L3b
            boolean r14 = r3.performClick()
            goto L96
        L3b:
            if (r1 != r14) goto L51
            r3.playSoundEffect(r15)
            android.view.View$OnClickListener r1 = r3.f11463x
            if (r1 == 0) goto L48
            r1.onClick(r3)
            r15 = r14
        L48:
            boolean r1 = r3.f11456I
            if (r1 == 0) goto L51
            g4.d r1 = r3.f11455H
            r1.q(r14, r14)
        L51:
            r14 = r15
            goto L96
        L53:
            int r2 = r10.f1331k
            if (r2 != r1) goto L51
            r10.f1331k = r11
            r4.invalidate()
            r10.q(r1, r12)
            goto L96
        L60:
            android.view.accessibility.AccessibilityManager r2 = r10.f1330h
            boolean r3 = r2.isEnabled()
            if (r3 == 0) goto L51
            boolean r2 = r2.isTouchExplorationEnabled()
            if (r2 != 0) goto L6f
            goto L51
        L6f:
            int r2 = r10.f1331k
            if (r2 == r1) goto L51
            if (r2 == r11) goto L7d
            r10.f1331k = r11
            r4.invalidate()
            r10.q(r2, r12)
        L7d:
            r10.f1331k = r1
            r4.invalidate()
            r10.q(r1, r5)
            goto L96
        L86:
            boolean r14 = r10.j(r1)
            goto L96
        L8b:
            boolean r14 = r10.p(r1)
            goto L96
        L90:
            java.util.WeakHashMap r1 = w1.AbstractC1835K.f18149a
            boolean r14 = r4.performAccessibilityAction(r2, r3)
        L96:
            return r14
        L97:
            C0.I r10 = (C0.I) r10
            r16 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r16)
            C0.A r5 = r10.f854d
            r.k r12 = r10.s()
            java.lang.Object r12 = r12.b(r1)
            C0.W0 r12 = (C0.W0) r12
            if (r12 == 0) goto Lb1
            I0.m r12 = r12.f941a
            if (r12 != 0) goto Lb5
        Lb1:
            r20 = r15
            goto L82f
        Lb5:
            int r11 = r12.f2270g
            I0.i r6 = r12.f2268d
            r.G r9 = r6.f2257q
            r15 = 0
            if (r2 == r8) goto L832
            if (r2 == r7) goto L818
            r8 = 512(0x200, float:7.175E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r2 == r7) goto L699
            if (r2 == r8) goto L699
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r2 == r6) goto L679
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r2 == r6) goto L64e
            boolean r6 = C0.M.a(r12)
            if (r6 != 0) goto Lda
        Ld6:
            r20 = 0
            goto L82f
        Lda:
            if (r2 == r14) goto L62e
            if (r2 == r13) goto L60e
            switch(r2) {
                case 16: goto L5e5;
                case 32: goto L5c5;
                case 4096: goto L3d3;
                case 8192: goto L3d3;
                case 32768: goto L3b3;
                case 65536: goto L393;
                case 262144: goto L373;
                case 524288: goto L353;
                case 1048576: goto L333;
                case 2097152: goto L300;
                case 16908342: goto L1f5;
                case 16908349: goto L1c1;
                case 16908372: goto L1a1;
                default: goto Le1;
            }
        Le1:
            switch(r2) {
                case 16908344: goto L3d3;
                case 16908345: goto L3d3;
                case 16908346: goto L3d3;
                case 16908347: goto L3d3;
                default: goto Le4;
            }
        Le4:
            switch(r2) {
                case 16908358: goto L181;
                case 16908359: goto L161;
                case 16908360: goto L141;
                case 16908361: goto L121;
                default: goto Le7;
            }
        Le7:
            r.S r3 = r10.f868u
            java.lang.Object r1 = r3.c(r1)
            r.S r1 = (r.S) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.c(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 != 0) goto Lfa
            goto Ld6
        Lfa:
            I0.s r1 = I0.h.f2252v
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L103
            goto L104
        L103:
            r15 = r1
        L104:
            java.util.List r15 = (java.util.List) r15
            if (r15 != 0) goto L109
            goto Ld6
        L109:
            r1 = r15
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            if (r1 > 0) goto L113
            goto Ld6
        L113:
            r1 = 0
            java.lang.Object r1 = r15.get(r1)
            r1.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        L121:
            I0.s r1 = I0.h.f2256z
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L12a
            goto L12b
        L12a:
            r15 = r1
        L12b:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L141:
            I0.s r1 = I0.h.f2254x
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L14a
            goto L14b
        L14a:
            r15 = r1
        L14b:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L161:
            I0.s r1 = I0.h.f2255y
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L16a
            goto L16b
        L16a:
            r15 = r1
        L16b:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L181:
            I0.s r1 = I0.h.f2253w
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L18a
            goto L18b
        L18a:
            r15 = r1
        L18b:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L1a1:
            I0.s r1 = I0.h.f2244n
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L1aa
            goto L1ab
        L1aa:
            r15 = r1
        L1ab:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L1c1:
            if (r3 == 0) goto Ld6
            java.lang.String r1 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r2 = r3.containsKey(r1)
            if (r2 != 0) goto L1cd
            goto Ld6
        L1cd:
            I0.s r2 = I0.h.f2240h
            java.lang.Object r2 = r9.g(r2)
            if (r2 != 0) goto L1d6
            goto L1d7
        L1d6:
            r15 = r2
        L1d7:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r2 = r15.f2222b
            B5.c r2 = (B5.c) r2
            if (r2 == 0) goto Ld6
            float r1 = r3.getFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r1 = r2.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L1f5:
            I0.m r1 = r12.j()
            if (r1 == 0) goto L20b
            I0.i r2 = r1.f2268d
            I0.s r3 = I0.h.f2237d
            r.G r2 = r2.f2257q
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L208
            r2 = r15
        L208:
            I0.a r2 = (I0.a) r2
            goto L20c
        L20b:
            r2 = r15
        L20c:
            if (r1 == 0) goto L227
            if (r2 == 0) goto L211
            goto L227
        L211:
            I0.m r1 = r1.j()
            if (r1 == 0) goto L20b
            I0.i r2 = r1.f2268d
            I0.s r3 = I0.h.f2237d
            r.G r2 = r2.f2257q
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L224
            r2 = r15
        L224:
            I0.a r2 = (I0.a) r2
            goto L20c
        L227:
            if (r1 != 0) goto L22b
            goto Ld6
        L22b:
            I0.i r3 = r1.f2268d
            r.G r3 = r3.f2257q
            B0.L r1 = r1.f2267c
            B0.g0 r4 = r1.f268U
            B0.v r4 = r4.f430b
            i0.c r4 = z0.AbstractC1938O.d(r4)
            B0.g0 r1 = r1.f268U
            B0.v r1 = r1.f430b
            z0.m r1 = r1.h()
            r5 = 0
            if (r1 == 0) goto L24c
            B0.n0 r1 = (B0.n0) r1
            long r7 = r1.F(r5)
            goto L24d
        L24c:
            r7 = r5
        L24d:
            i0.c r1 = r4.e(r7)
            B0.n0 r4 = r12.c()
            if (r4 == 0) goto L268
            c0.l r7 = r4.B0()
            boolean r7 = r7.f10099D
            if (r7 == 0) goto L260
            goto L261
        L260:
            r4 = r15
        L261:
            if (r4 == 0) goto L268
            long r7 = r4.F(r5)
            goto L269
        L268:
            r7 = r5
        L269:
            B0.n0 r4 = r12.c()
            if (r4 == 0) goto L271
            long r5 = r4.f18666s
        L271:
            long r4 = com.google.android.gms.internal.measurement.P1.d0(r5)
            i0.c r4 = com.google.android.gms.internal.measurement.AbstractC0836n2.c(r7, r4)
            I0.s r5 = I0.p.f2317s
            java.lang.Object r5 = r3.g(r5)
            if (r5 != 0) goto L282
            r5 = r15
        L282:
            I0.g r5 = (I0.g) r5
            I0.s r5 = I0.p.f2318t
            java.lang.Object r3 = r3.g(r5)
            if (r3 != 0) goto L28d
            goto L28e
        L28d:
            r15 = r3
        L28e:
            I0.g r15 = (I0.g) r15
            float r3 = r4.f13522a
            float r5 = r1.f13522a
            float r3 = r3 - r5
            float r5 = r4.f13524c
            float r6 = r1.f13524c
            float r5 = r5 - r6
            float r6 = java.lang.Math.signum(r3)
            float r7 = java.lang.Math.signum(r5)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L2b5
            float r6 = java.lang.Math.abs(r3)
            float r7 = java.lang.Math.abs(r5)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L2b3
            goto L2b7
        L2b3:
            r3 = r5
            goto L2b7
        L2b5:
            r3 = r16
        L2b7:
            boolean r5 = C0.M.f(r12)
            if (r5 == 0) goto L2be
            float r3 = -r3
        L2be:
            float r5 = r4.f13523b
            float r6 = r1.f13523b
            float r5 = r5 - r6
            float r4 = r4.f13525d
            float r1 = r1.f13525d
            float r4 = r4 - r1
            float r1 = java.lang.Math.signum(r5)
            float r6 = java.lang.Math.signum(r4)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L2e2
            float r1 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.abs(r4)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L2e4
            r4 = r5
            goto L2e4
        L2e2:
            r4 = r16
        L2e4:
            if (r2 == 0) goto Ld6
            m5.e r1 = r2.f2222b
            B5.e r1 = (B5.e) r1
            if (r1 == 0) goto Ld6
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            java.lang.Object r1 = r1.invoke(r2, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L300:
            if (r3 == 0) goto L309
            java.lang.String r1 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r1 = r3.getString(r1)
            goto L30a
        L309:
            r1 = r15
        L30a:
            I0.s r2 = I0.h.j
            java.lang.Object r2 = r9.g(r2)
            if (r2 != 0) goto L313
            goto L314
        L313:
            r15 = r2
        L314:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r2 = r15.f2222b
            B5.c r2 = (B5.c) r2
            if (r2 == 0) goto Ld6
            L0.d r3 = new L0.d
            if (r1 != 0) goto L324
            java.lang.String r1 = ""
        L324:
            r3.<init>(r1)
            java.lang.Object r1 = r2.invoke(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L333:
            I0.s r1 = I0.h.f2250t
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L33c
            goto L33d
        L33c:
            r15 = r1
        L33d:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L353:
            I0.s r1 = I0.h.f2249s
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L35c
            goto L35d
        L35c:
            r15 = r1
        L35d:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L373:
            I0.s r1 = I0.h.f2248r
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L37c
            goto L37d
        L37c:
            r15 = r1
        L37d:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L393:
            I0.s r1 = I0.h.f2246p
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L39c
            goto L39d
        L39c:
            r15 = r1
        L39d:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L3b3:
            I0.s r1 = I0.h.f2247q
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L3bc
            goto L3bd
        L3bc:
            r15 = r1
        L3bd:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r1 = r15.f2222b
            B5.a r1 = (B5.a) r1
            if (r1 == 0) goto Ld6
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L3d3:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r2 != r1) goto L3d9
            r1 = r14
            goto L3da
        L3d9:
            r1 = 0
        L3da:
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r3) goto L3e0
            r3 = r14
            goto L3e1
        L3e0:
            r3 = 0
        L3e1:
            r5 = 16908345(0x1020039, float:2.387739E-38)
            if (r2 != r5) goto L3e8
            r5 = r14
            goto L3e9
        L3e8:
            r5 = 0
        L3e9:
            r6 = 16908347(0x102003b, float:2.3877394E-38)
            if (r2 != r6) goto L3f0
            r6 = r14
            goto L3f1
        L3f0:
            r6 = 0
        L3f1:
            r7 = 16908344(0x1020038, float:2.3877386E-38)
            if (r2 != r7) goto L3f8
            r7 = r14
            goto L3f9
        L3f8:
            r7 = 0
        L3f9:
            r8 = 16908346(0x102003a, float:2.3877392E-38)
            if (r2 != r8) goto L400
            r2 = r14
            goto L401
        L400:
            r2 = 0
        L401:
            if (r5 != 0) goto L40c
            if (r6 != 0) goto L40c
            if (r1 != 0) goto L40c
            if (r3 == 0) goto L40a
            goto L40c
        L40a:
            r8 = 0
            goto L40d
        L40c:
            r8 = r14
        L40d:
            if (r7 != 0) goto L417
            if (r2 != 0) goto L417
            if (r1 != 0) goto L417
            if (r3 == 0) goto L416
            goto L417
        L416:
            r14 = 0
        L417:
            if (r1 != 0) goto L41b
            if (r3 == 0) goto L469
        L41b:
            I0.s r1 = I0.p.f2304c
            java.lang.Object r1 = r9.g(r1)
            if (r1 != 0) goto L424
            r1 = r15
        L424:
            I0.e r1 = (I0.e) r1
            I0.s r2 = I0.h.f2240h
            java.lang.Object r2 = r9.g(r2)
            if (r2 != 0) goto L42f
            r2 = r15
        L42f:
            I0.a r2 = (I0.a) r2
            if (r1 == 0) goto L469
            G5.a r10 = r1.f2229b
            if (r2 == 0) goto L469
            float r4 = r10.f2016b
            float r5 = r10.f2015a
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L441
            r6 = r5
            goto L442
        L441:
            r6 = r4
        L442:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 <= 0) goto L447
            goto L448
        L447:
            r4 = r5
        L448:
            float r6 = r6 - r4
            r4 = 20
            float r4 = (float) r4
            float r6 = r6 / r4
            if (r3 == 0) goto L450
            float r6 = -r6
        L450:
            m5.e r2 = r2.f2222b
            B5.c r2 = (B5.c) r2
            if (r2 == 0) goto Ld6
            float r1 = r1.f2228a
            float r1 = r1 + r6
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r1 = r2.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r14 = r1.booleanValue()
            goto L860
        L469:
            B0.L r1 = r12.f2267c
            B0.g0 r1 = r1.f268U
            B0.v r1 = r1.f430b
            i0.c r1 = z0.AbstractC1938O.d(r1)
            long r1 = r1.b()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            I0.s r11 = I0.h.f2233A
            java.lang.Object r11 = r9.g(r11)
            if (r11 != 0) goto L485
            r11 = r15
        L485:
            I0.a r11 = (I0.a) r11
            if (r11 == 0) goto L4a3
            m5.e r11 = r11.f2222b
            B5.c r11 = (B5.c) r11
            if (r11 == 0) goto L4a3
            java.lang.Object r11 = r11.invoke(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L4a3
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            java.lang.Float r10 = (java.lang.Float) r10
            goto L4a4
        L4a3:
            r10 = r15
        L4a4:
            I0.s r11 = I0.h.f2237d
            java.lang.Object r11 = r9.g(r11)
            if (r11 != 0) goto L4ad
            r11 = r15
        L4ad:
            I0.a r11 = (I0.a) r11
            if (r11 != 0) goto L4b3
            goto Ld6
        L4b3:
            m5.e r11 = r11.f2222b
            I0.s r13 = I0.p.f2317s
            java.lang.Object r13 = r9.g(r13)
            if (r13 != 0) goto L4be
            r13 = r15
        L4be:
            I0.g r13 = (I0.g) r13
            if (r13 == 0) goto L542
            if (r8 == 0) goto L542
            if (r10 == 0) goto L4cd
            float r8 = r10.floatValue()
            r26 = r1
            goto L4d8
        L4cd:
            r8 = 32
            r26 = r1
            long r0 = r26 >> r8
            int r0 = (int) r0
            float r8 = java.lang.Float.intBitsToFloat(r0)
        L4d8:
            if (r5 != 0) goto L4dc
            if (r3 == 0) goto L4dd
        L4dc:
            float r8 = -r8
        L4dd:
            boolean r0 = C0.M.f(r12)
            if (r0 == 0) goto L4e8
            if (r5 != 0) goto L4e7
            if (r6 == 0) goto L4e8
        L4e7:
            float r8 = -r8
        L4e8:
            boolean r0 = C0.I.w(r13, r8)
            if (r0 == 0) goto L544
            I0.s r0 = I0.h.f2254x
            boolean r1 = r9.c(r0)
            if (r1 != 0) goto L513
            I0.s r1 = I0.h.f2256z
            boolean r1 = r9.c(r1)
            if (r1 == 0) goto L4ff
            goto L513
        L4ff:
            B5.e r11 = (B5.e) r11
            if (r11 == 0) goto Ld6
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            java.lang.Object r0 = r11.invoke(r0, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            goto L860
        L513:
            int r1 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r1 <= 0) goto L524
            I0.s r0 = I0.h.f2256z
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L520
            goto L521
        L520:
            r15 = r0
        L521:
            I0.a r15 = (I0.a) r15
            goto L52e
        L524:
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L52b
            goto L52c
        L52b:
            r15 = r0
        L52c:
            I0.a r15 = (I0.a) r15
        L52e:
            if (r15 == 0) goto Ld6
            m5.e r0 = r15.f2222b
            B5.a r0 = (B5.a) r0
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            goto L860
        L542:
            r26 = r1
        L544:
            I0.s r0 = I0.p.f2318t
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L54d
            r0 = r15
        L54d:
            I0.g r0 = (I0.g) r0
            if (r0 == 0) goto Ld6
            if (r14 == 0) goto Ld6
            if (r10 == 0) goto L55a
            float r1 = r10.floatValue()
            goto L566
        L55a:
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r26 & r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
        L566:
            if (r7 != 0) goto L56a
            if (r3 == 0) goto L56b
        L56a:
            float r1 = -r1
        L56b:
            boolean r0 = C0.I.w(r0, r1)
            if (r0 == 0) goto Ld6
            I0.s r0 = I0.h.f2253w
            boolean r2 = r9.c(r0)
            if (r2 != 0) goto L596
            I0.s r2 = I0.h.f2255y
            boolean r2 = r9.c(r2)
            if (r2 == 0) goto L582
            goto L596
        L582:
            B5.e r11 = (B5.e) r11
            if (r11 == 0) goto Ld6
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r11.invoke(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            goto L860
        L596:
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 <= 0) goto L5a7
            I0.s r0 = I0.h.f2255y
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L5a3
            goto L5a4
        L5a3:
            r15 = r0
        L5a4:
            I0.a r15 = (I0.a) r15
            goto L5b1
        L5a7:
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L5ae
            goto L5af
        L5ae:
            r15 = r0
        L5af:
            I0.a r15 = (I0.a) r15
        L5b1:
            if (r15 == 0) goto Ld6
            m5.e r0 = r15.f2222b
            B5.a r0 = (B5.a) r0
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            goto L860
        L5c5:
            I0.s r0 = I0.h.f2236c
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L5ce
            goto L5cf
        L5ce:
            r15 = r0
        L5cf:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r0 = r15.f2222b
            B5.a r0 = (B5.a) r0
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            goto L860
        L5e5:
            I0.s r0 = I0.h.f2235b
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L5ee
            r0 = r15
        L5ee:
            I0.a r0 = (I0.a) r0
            if (r0 == 0) goto L601
            m5.e r0 = r0.f2222b
            B5.a r0 = (B5.a) r0
            if (r0 == 0) goto L601
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L5fe:
            r2 = 12
            goto L603
        L601:
            r0 = r15
            goto L5fe
        L603:
            C0.I.D(r10, r1, r14, r15, r2)
            if (r0 == 0) goto Ld6
            boolean r14 = r0.booleanValue()
            goto L860
        L60e:
            I0.s r0 = I0.p.f2309k
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L617
            goto L618
        L617:
            r15 = r0
        L618:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.m.a(r15, r0)
            if (r0 == 0) goto Ld6
            h0.g r0 = r5.getFocusOwner()
            h0.h r0 = (h0.C1115h) r0
            r1 = 0
            r2 = 8
            r0.b(r2, r1, r14)
            goto L860
        L62e:
            I0.s r0 = I0.h.f2251u
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L637
            goto L638
        L637:
            r15 = r0
        L638:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r0 = r15.f2222b
            B5.a r0 = (B5.a) r0
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            goto L860
        L64e:
            if (r3 == 0) goto L65a
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
            r1 = -1
            int r19 = r3.getInt(r0, r1)
            r0 = r19
            goto L65c
        L65a:
            r1 = -1
            r0 = r1
        L65c:
            if (r3 == 0) goto L666
            java.lang.String r2 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r9 = r3.getInt(r2, r1)
        L664:
            r1 = 0
            goto L668
        L666:
            r9 = -1
            goto L664
        L668:
            boolean r14 = r10.J(r12, r0, r9, r1)
            if (r14 == 0) goto L860
            int r0 = r10.z(r11)
            r2 = 12
            C0.I.D(r10, r0, r1, r15, r2)
            goto L860
        L679:
            I0.s r0 = I0.h.f2245o
            java.lang.Object r0 = r9.g(r0)
            if (r0 != 0) goto L682
            goto L683
        L682:
            r15 = r0
        L683:
            I0.a r15 = (I0.a) r15
            if (r15 == 0) goto Ld6
            m5.e r0 = r15.f2222b
            B5.a r0 = (B5.a) r0
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            goto L860
        L699:
            if (r3 == 0) goto Ld6
            java.lang.String r0 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r0 = r3.getInt(r0)
            java.lang.String r1 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r1 = r3.getBoolean(r1)
            if (r2 != r7) goto L6ab
            r2 = r14
            goto L6ac
        L6ab:
            r2 = 0
        L6ac:
            java.lang.Integer r3 = r10.f871x
            if (r3 != 0) goto L6b2
        L6b0:
            r3 = -1
            goto L6b9
        L6b2:
            int r3 = r3.intValue()
            if (r11 == r3) goto L6c1
            goto L6b0
        L6b9:
            r10.f870w = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r10.f871x = r3
        L6c1:
            java.lang.String r3 = C0.I.t(r12)
            if (r3 == 0) goto Ld6
            int r4 = r3.length()
            if (r4 != 0) goto L6cf
            goto Ld6
        L6cf:
            java.lang.String r4 = C0.I.t(r12)
            if (r4 == 0) goto L7a1
            int r11 = r4.length()
            if (r11 != 0) goto L6dd
            goto L7a1
        L6dd:
            if (r0 == r14) goto L777
            if (r0 == r13) goto L74d
            r5 = 4
            if (r0 == r5) goto L704
            r11 = 8
            if (r0 == r11) goto L6ee
            r11 = 16
            if (r0 == r11) goto L704
            goto L7a1
        L6ee:
            C0.e r5 = C0.C0073e.f1024c
            if (r5 != 0) goto L6f9
            C0.e r5 = new C0.e
            r5.<init>()
            C0.C0073e.f1024c = r5
        L6f9:
            C0.e r15 = C0.C0073e.f1024c
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator"
            kotlin.jvm.internal.m.c(r15, r5)
            r15.f990a = r4
            goto L7a1
        L704:
            I0.s r11 = I0.h.f2234a
            boolean r11 = r9.c(r11)
            if (r11 != 0) goto L70e
            goto L7a1
        L70e:
            L0.C r6 = C0.W.h(r6)
            if (r6 != 0) goto L716
            goto L7a1
        L716:
            if (r0 != r5) goto L72f
            C0.c r5 = C0.C0069c.f994g
            if (r5 != 0) goto L723
            C0.c r5 = new C0.c
            r5.<init>(r13)
            C0.C0069c.f994g = r5
        L723:
            C0.c r15 = C0.C0069c.f994g
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator"
            kotlin.jvm.internal.m.c(r15, r5)
            r15.f990a = r4
            r15.f997d = r6
            goto L7a1
        L72f:
            C0.d r5 = C0.C0071d.f999e
            if (r5 != 0) goto L73f
            C0.d r5 = new C0.d
            r5.<init>()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            C0.C0071d.f999e = r5
        L73f:
            C0.d r15 = C0.C0071d.f999e
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator"
            kotlin.jvm.internal.m.c(r15, r5)
            r15.f990a = r4
            r15.f1001c = r6
            r15.f1002d = r12
            goto L7a1
        L74d:
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            C0.c r6 = C0.C0069c.f
            if (r6 != 0) goto L76c
            C0.c r6 = new C0.c
            r6.<init>(r14)
            java.text.BreakIterator r5 = java.text.BreakIterator.getWordInstance(r5)
            r6.f997d = r5
            C0.C0069c.f = r6
        L76c:
            C0.c r15 = C0.C0069c.f
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator"
            kotlin.jvm.internal.m.c(r15, r5)
            r15.o(r4)
            goto L7a1
        L777:
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            C0.c r6 = C0.C0069c.f993e
            if (r6 != 0) goto L797
            C0.c r6 = new C0.c
            r11 = 0
            r6.<init>(r11)
            java.text.BreakIterator r5 = java.text.BreakIterator.getCharacterInstance(r5)
            r6.f997d = r5
            C0.C0069c.f993e = r6
        L797:
            C0.c r15 = C0.C0069c.f993e
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator"
            kotlin.jvm.internal.m.c(r15, r5)
            r15.o(r4)
        L7a1:
            if (r15 != 0) goto L7a5
            goto Ld6
        L7a5:
            int r4 = r10.q(r12)
            r5 = -1
            if (r4 != r5) goto L7b5
            if (r2 == 0) goto L7b0
            r3 = 0
            goto L7b4
        L7b0:
            int r3 = r3.length()
        L7b4:
            r4 = r3
        L7b5:
            if (r2 == 0) goto L7bc
            int[] r3 = r15.f(r4)
            goto L7c0
        L7bc:
            int[] r3 = r15.l(r4)
        L7c0:
            if (r3 != 0) goto L7c4
            goto Ld6
        L7c4:
            r20 = 0
            r21 = r3[r20]
            r22 = r3[r14]
            if (r1 == 0) goto L7f2
            I0.s r1 = I0.p.f2302a
            boolean r1 = r9.c(r1)
            if (r1 != 0) goto L7f2
            I0.s r1 = I0.p.f2293C
            boolean r1 = r9.c(r1)
            if (r1 == 0) goto L7f2
            int r1 = r10.r(r12)
            r3 = -1
            if (r1 != r3) goto L7ea
            if (r2 == 0) goto L7e8
            r1 = r21
            goto L7ea
        L7e8:
            r1 = r22
        L7ea:
            if (r2 == 0) goto L7ef
            r3 = r22
            goto L7fa
        L7ef:
            r3 = r21
            goto L7fa
        L7f2:
            if (r2 == 0) goto L7f7
            r1 = r22
            goto L7f9
        L7f7:
            r1 = r21
        L7f9:
            r3 = r1
        L7fa:
            if (r2 == 0) goto L7ff
            r19 = r7
            goto L801
        L7ff:
            r19 = r8
        L801:
            C0.F r17 = new C0.F
            long r23 = android.os.SystemClock.uptimeMillis()
            r20 = r0
            r18 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r2 = r17
            r0 = r18
            r10.f840B = r2
            r10.J(r0, r1, r3, r14)
            goto L860
        L818:
            r20 = 0
            int r0 = r10.f861n
            if (r0 != r1) goto L82f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10.f861n = r0
            r10.f863p = r15
            r5.invalidate()
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = 12
            C0.I.D(r10, r1, r0, r15, r2)
            goto L860
        L82f:
            r14 = r20
            goto L860
        L832:
            r20 = 0
            android.view.accessibility.AccessibilityManager r0 = r10.f856g
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L82f
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L82f
            int r0 = r10.f861n
            if (r0 != r1) goto L847
            goto L82f
        L847:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L853
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 12
            C0.I.D(r10, r0, r2, r15, r3)
            goto L855
        L853:
            r3 = 12
        L855:
            r10.f861n = r1
            r5.invalidate()
            r0 = 32768(0x8000, float:4.5918E-41)
            C0.I.D(r10, r1, r0, r15, r3)
        L860:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.E.x(int, int, android.os.Bundle):boolean");
    }
}
