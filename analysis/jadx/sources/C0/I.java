package C0;

import L0.C0189a;
import L0.C0192d;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import i0.C1131c;
import i1.C1134a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import m5.C1386y;
import r.AbstractC1559j;
import r.AbstractC1560k;
import r.AbstractC1561l;
import r.C1548G;
import r.C1555f;
import r.C1568t;
import r.C1569u;
import r.C1570v;
import s.AbstractC1585a;
import w1.C1839b;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class I extends C1839b {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final C1569u f838P;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f839A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public F f840B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1570v f841C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final r.w f842D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1568t f843E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C1568t f844F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f845G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f846H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final B0.G0 f847I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C1570v f848J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public V0 f849K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f850L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RunnableC0089m f851M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ArrayList f852N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final H f853O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f855e = Integer.MIN_VALUE;
    public final H f = new H(this, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f857h;
    public final B i;
    public final C j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f859l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E f860m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x1.e f863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x1.e f864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1570v f866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1570v f867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r.S f868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r.S f869v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1555f f872y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final O5.e f873z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C1569u c1569u = AbstractC1559j.f16215a;
        C1569u c1569u2 = new C1569u(32);
        int i = c1569u2.f16252b;
        if (i < 0) {
            AbstractC1585a.d("");
            throw null;
        }
        int i7 = i + 32;
        c1569u2.b(i7);
        int[] iArr2 = c1569u2.f16251a;
        int i8 = c1569u2.f16252b;
        if (i != i8) {
            n5.k.C0(i7, i, i8, iArr2, iArr2);
        }
        n5.k.F0(i, 0, 12, iArr, iArr2);
        c1569u2.f16252b += 32;
        f838P = c1569u2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [C0.B] */
    /* JADX WARN: Type inference failed for: r2v5, types: [C0.C] */
    public I(A a7) {
        this.f854d = a7;
        Object systemService = a7.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f856g = accessibilityManager;
        this.f857h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: C0.B
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z5) {
                I i = this.f783a;
                i.f858k = z5 ? i.f856g.getEnabledAccessibilityServiceList(-1) : n5.s.f15299q;
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: C0.C
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z5) {
                I i = this.f786a;
                i.f858k = i.f856g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f858k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f859l = new Handler(Looper.getMainLooper());
        this.f860m = new E(this, 0);
        this.f861n = Integer.MIN_VALUE;
        this.f862o = Integer.MIN_VALUE;
        this.f866s = new C1570v();
        this.f867t = new C1570v();
        this.f868u = new r.S(0);
        this.f869v = new r.S(0);
        this.f870w = -1;
        this.f872y = new C1555f(0);
        this.f873z = l6.d.e(1, null, 6);
        this.f839A = true;
        C1570v c1570v = AbstractC1561l.f16221a;
        kotlin.jvm.internal.m.c(c1570v, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f841C = c1570v;
        this.f842D = new r.w();
        this.f843E = new C1568t();
        this.f844F = new C1568t();
        this.f845G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f846H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f847I = new B0.G0(15);
        this.f848J = new C1570v();
        I0.m mVarA = a7.getSemanticsOwner().a();
        kotlin.jvm.internal.m.c(c1570v, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f849K = new V0(mVarA, c1570v);
        a7.addOnAttachStateChangeListener(new D(0, this));
        int i = 1;
        this.f851M = new RunnableC0089m(i, this);
        this.f852N = new ArrayList();
        this.f853O = new H(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void D(I i, int i7, int i8, Integer num, int i9) {
        if ((i9 & 4) != 0) {
            num = null;
        }
        i.C(i7, i8, num, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                kotlin.jvm.internal.m.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String t(I0.m mVar) {
        C0192d c0192d;
        if (mVar != null) {
            I0.i iVar = mVar.f2268d;
            C1548G c1548g = iVar.f2257q;
            I0.s sVar = I0.p.f2302a;
            if (c1548g.c(sVar)) {
                return Y0.a.a(62, ",", (List) iVar.h(sVar));
            }
            I0.s sVar2 = I0.p.f2293C;
            if (c1548g.c(sVar2)) {
                Object objG = c1548g.g(sVar2);
                if (objG == null) {
                    objG = null;
                }
                C0192d c0192d2 = (C0192d) objG;
                if (c0192d2 != null) {
                    return c0192d2.f3106r;
                }
            } else {
                Object objG2 = c1548g.g(I0.p.f2323y);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (c0192d = (C0192d) n5.l.m0(list)) != null) {
                    return c0192d.f3106r;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean w(I0.g gVar, float f) {
        E.Q q7 = gVar.f2231a;
        if (f >= 0.0f || ((Number) q7.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) q7.invoke()).floatValue() < ((Number) gVar.f2232b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean x(I0.g gVar) {
        E.Q q7 = gVar.f2231a;
        if (((Number) q7.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) q7.invoke()).floatValue();
        ((Number) gVar.f2232b.invoke()).floatValue();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean y(I0.g gVar) {
        E.Q q7 = gVar.f2231a;
        if (((Number) q7.invoke()).floatValue() < ((Number) gVar.f2232b.invoke()).floatValue()) {
            return true;
        }
        ((Number) q7.invoke()).floatValue();
        return false;
    }

    /* JADX DEBUG: Class process forced to load method for inline: I0.m.h(int, I0.m):java.util.List */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(I0.m r20, C0.V0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = r.AbstractC1562m.f16222a
            r.w r3 = new r.w
            r3.<init>()
            r4 = 4
            java.util.List r5 = I0.m.h(r4, r1)
            B0.L r6 = r1.f2267c
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
            r9 = r8
        L1d:
            if (r9 >= r7) goto L43
            java.lang.Object r10 = r5.get(r9)
            I0.m r10 = (I0.m) r10
            r.k r11 = r0.s()
            int r10 = r10.f2270g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L40
            r.w r11 = r2.f938b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3d
            r0.v(r6)
            return
        L3d:
            r3.a(r10)
        L40:
            int r9 = r9 + 1
            goto L1d
        L43:
            r.w r2 = r2.f938b
            int[] r5 = r2.f16254b
            long[] r2 = r2.f16253a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8e
            r9 = r8
        L4f:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L89
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L69:
            if (r14 >= r12) goto L87
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L83
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L83
            r0.v(r6)
            return
        L83:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L69
        L87:
            if (r12 != r13) goto L8e
        L89:
            if (r9 == r7) goto L8e
            int r9 = r9 + 1
            goto L4f
        L8e:
            java.util.List r1 = I0.m.h(r4, r1)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L99:
            if (r8 >= r2) goto Lc0
            java.lang.Object r3 = r1.get(r8)
            I0.m r3 = (I0.m) r3
            r.k r4 = r0.s()
            int r5 = r3.f2270g
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto Lbd
            r.v r4 = r0.f848J
            int r5 = r3.f2270g
            java.lang.Object r4 = r4.b(r5)
            kotlin.jvm.internal.m.b(r4)
            C0.V0 r4 = (C0.V0) r4
            r0.A(r3, r4)
        Lbd:
            int r8 = r8 + 1
            goto L99
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.I.A(I0.m, C0.V0):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean B(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f865r = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f865r = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean C(int i, int i7, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !u()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i7);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(Y0.a.a(62, ",", list));
        }
        return B(accessibilityEventO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(String str, int i, int i7) {
        AccessibilityEvent accessibilityEventO = o(z(i), 32);
        accessibilityEventO.setContentChangeTypes(i7);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        B(accessibilityEventO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(int i) {
        F f = this.f840B;
        if (f != null) {
            I0.m mVar = f.f814a;
            if (i != mVar.f2270g) {
                return;
            }
            if (SystemClock.uptimeMillis() - f.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(z(mVar.f2270g), 131072);
                accessibilityEventO.setFromIndex(f.f817d);
                accessibilityEventO.setToIndex(f.f818e);
                accessibilityEventO.setAction(f.f815b);
                accessibilityEventO.setMovementGranularity(f.f816c);
                accessibilityEventO.getText().add(t(mVar));
                B(accessibilityEventO);
            }
        }
        this.f840B = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(r.AbstractC1560k r57) {
        /*
            r56 = this;
            r0 = r56
            r6 = r57
            r1 = 64
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r9 = r0.f852N
            r8.<init>(r9)
            r9.clear()
            int[] r10 = r6.f16217b
            long[] r11 = r6.f16216a
            int r1 = r11.length
            r12 = 2
            int r13 = r1 + (-2)
            r14 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            if (r13 < 0) goto L63d
            r15 = r14
        L24:
            r3 = r11[r15]
            r16 = r12
            r17 = r13
            long r12 = ~r3
            r18 = 7
            long r12 = r12 << r18
            long r12 = r12 & r3
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r19
            int r1 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r1 == 0) goto L61d
            int r1 = r15 - r17
            int r1 = ~r1
            int r1 = r1 >>> 31
            r12 = 8
            int r13 = 8 - r1
            r21 = r3
            r1 = r14
        L47:
            if (r1 >= r13) goto L609
            r23 = 255(0xff, double:1.26E-321)
            long r3 = r21 & r23
            r25 = 128(0x80, double:6.32E-322)
            int r3 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r3 >= 0) goto L5e2
            int r3 = r15 << 3
            int r3 = r3 + r1
            r3 = r10[r3]
            r.v r4 = r0.f848J
            java.lang.Object r4 = r4.b(r3)
            C0.V0 r4 = (C0.V0) r4
            if (r4 != 0) goto L64
            goto L5e2
        L64:
            I0.i r4 = r4.f937a
            r.G r5 = r4.f2257q
            java.lang.Object r27 = r6.b(r3)
            r14 = r27
            C0.W0 r14 = (C0.W0) r14
            r27 = 0
            if (r14 == 0) goto L77
            I0.m r14 = r14.f941a
            goto L79
        L77:
            r14 = r27
        L79:
            if (r14 == 0) goto L5db
            r28 = r12
            B0.L r12 = r14.f2267c
            I0.i r6 = r14.f2268d
            r29 = r10
            int r10 = r14.f2270g
            r30 = r11
            r.G r11 = r6.f2257q
            r31 = r15
            java.lang.Object[] r15 = r11.f16134b
            r32 = r15
            java.lang.Object[] r15 = r11.f16135c
            r33 = r15
            long[] r15 = r11.f16133a
            r34 = r1
            int r1 = r15.length
            int r1 = r1 + (-2)
            r35 = r15
            if (r1 < 0) goto L591
            r39 = r12
            r38 = r13
            r15 = 0
            r37 = 0
        La5:
            r12 = r35[r15]
            r40 = r14
            r41 = r15
            long r14 = ~r12
            long r14 = r14 << r18
            long r14 = r14 & r12
            long r14 = r14 & r19
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 == 0) goto L56e
            int r15 = r41 - r1
            int r14 = ~r15
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r15 = 0
        Lbd:
            if (r15 >= r14) goto L55b
            long r42 = r12 & r23
            int r42 = (r42 > r25 ? 1 : (r42 == r25 ? 0 : -1))
            if (r42 >= 0) goto L536
            int r42 = r41 << 3
            int r42 = r42 + r15
            r43 = r32[r42]
            r44 = r1
            r1 = r33[r42]
            r42 = r4
            r4 = r43
            I0.s r4 = (I0.s) r4
            r45 = r12
            I0.s r12 = I0.p.f2317s
            boolean r13 = kotlin.jvm.internal.m.a(r4, r12)
            if (r13 != 0) goto Leb
            I0.s r13 = I0.p.f2318t
            boolean r13 = kotlin.jvm.internal.m.a(r4, r13)
            if (r13 == 0) goto Le8
            goto Leb
        Le8:
            r43 = 0
            goto Lfe
        Leb:
            C0.U0 r13 = C0.W.e(r3, r8)
            if (r13 == 0) goto Lf4
            r43 = 0
            goto Lfb
        Lf4:
            C0.U0 r13 = new C0.U0
            r13.<init>(r3, r9)
            r43 = 1
        Lfb:
            r9.add(r13)
        Lfe:
            if (r43 != 0) goto L11b
            java.lang.Object r13 = r5.g(r4)
            if (r13 != 0) goto L108
            r13 = r27
        L108:
            boolean r13 = kotlin.jvm.internal.m.a(r1, r13)
            if (r13 == 0) goto L11b
            r51 = r7
            r43 = r8
            r13 = r39
            r8 = r2
            r7 = r3
            r2 = r5
        L117:
            r3 = r44
            goto L533
        L11b:
            I0.s r13 = I0.p.f2305d
            boolean r43 = kotlin.jvm.internal.m.a(r4, r13)
            if (r43 == 0) goto L143
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.m.c(r1, r4)
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r5.c(r13)
            if (r4 == 0) goto L135
            r4 = r28
            r0.E(r1, r3, r4)
        L135:
            r51 = r7
            r43 = r8
            r13 = r39
            r8 = r2
            r7 = r3
            r2 = r5
            r3 = r44
        L140:
            r5 = 0
            goto L533
        L143:
            I0.s r13 = I0.p.f2303b
            boolean r13 = kotlin.jvm.internal.m.a(r4, r13)
            if (r13 == 0) goto L14d
            r13 = 1
            goto L153
        L14d:
            I0.s r13 = I0.p.f2296F
            boolean r13 = kotlin.jvm.internal.m.a(r4, r13)
        L153:
            if (r13 == 0) goto L168
            int r1 = r0.z(r3)
            r4 = 8
            r13 = 2048(0x800, float:2.87E-42)
            D(r0, r1, r13, r7, r4)
            int r1 = r0.z(r3)
            D(r0, r1, r13, r2, r4)
            goto L135
        L168:
            r43 = r8
            r13 = 2048(0x800, float:2.87E-42)
            I0.s r8 = I0.p.f2304c
            boolean r8 = kotlin.jvm.internal.m.a(r4, r8)
            if (r8 == 0) goto L18d
            int r1 = r0.z(r3)
            r4 = 8
            D(r0, r1, r13, r7, r4)
            int r1 = r0.z(r3)
            D(r0, r1, r13, r2, r4)
        L184:
            r8 = r2
            r2 = r5
            r51 = r7
            r13 = r39
        L18a:
            r5 = 0
            r7 = r3
            goto L117
        L18d:
            I0.s r8 = I0.p.f2295E
            boolean r13 = kotlin.jvm.internal.m.a(r4, r8)
            r47 = r13
            r13 = 4
            if (r47 == 0) goto L247
            I0.s r1 = I0.p.f2320v
            java.lang.Object r1 = r11.g(r1)
            if (r1 != 0) goto L1a2
            r1 = r27
        L1a2:
            I0.f r1 = (I0.f) r1
            if (r1 != 0) goto L1a8
        L1a6:
            r1 = 0
            goto L1ad
        L1a8:
            int r1 = r1.f2230a
            if (r1 != r13) goto L1a6
            r1 = 1
        L1ad:
            if (r1 == 0) goto L233
            java.lang.Object r1 = r11.g(r8)
            if (r1 != 0) goto L1b7
            r1 = r27
        L1b7:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.m.a(r1, r4)
            if (r1 == 0) goto L226
            int r1 = r0.z(r3)
            android.view.accessibility.AccessibilityEvent r1 = r0.o(r1, r13)
            I0.m r4 = new I0.m
            r8 = r40
            c0.l r12 = r8.f2265a
            r13 = r39
            r8 = 1
            r4.<init>(r12, r8, r13, r6)
            I0.i r12 = r4.i()
            I0.s r8 = I0.p.f2302a
            r.G r12 = r12.f2257q
            java.lang.Object r8 = r12.g(r8)
            if (r8 != 0) goto L1e3
            r8 = r27
        L1e3:
            java.util.List r8 = (java.util.List) r8
            r12 = 62
            r39 = r4
            java.lang.String r4 = ","
            if (r8 == 0) goto L1f2
            java.lang.String r8 = Y0.a.a(r12, r4, r8)
            goto L1f4
        L1f2:
            r8 = r27
        L1f4:
            I0.i r12 = r39.i()
            r39 = r13
            I0.s r13 = I0.p.f2323y
            r.G r12 = r12.f2257q
            java.lang.Object r12 = r12.g(r13)
            if (r12 != 0) goto L206
            r12 = r27
        L206:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L211
            r13 = 62
            java.lang.String r4 = Y0.a.a(r13, r4, r12)
            goto L213
        L211:
            r4 = r27
        L213:
            if (r8 == 0) goto L218
            r1.setContentDescription(r8)
        L218:
            if (r4 == 0) goto L221
            java.util.List r8 = r1.getText()
            r8.add(r4)
        L221:
            r0.B(r1)
            goto L184
        L226:
            int r1 = r0.z(r3)
            r4 = 8
            r8 = 2048(0x800, float:2.87E-42)
            D(r0, r1, r8, r2, r4)
            goto L184
        L233:
            r4 = 8
            r8 = 2048(0x800, float:2.87E-42)
            int r1 = r0.z(r3)
            D(r0, r1, r8, r7, r4)
            int r1 = r0.z(r3)
            D(r0, r1, r8, r2, r4)
            goto L184
        L247:
            r36 = r13
            r13 = r39
            I0.s r8 = I0.p.f2302a
            boolean r8 = kotlin.jvm.internal.m.a(r4, r8)
            if (r8 == 0) goto L26d
            int r4 = r0.z(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r36)
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            kotlin.jvm.internal.m.c(r1, r12)
            java.util.List r1 = (java.util.List) r1
            r12 = 2048(0x800, float:2.87E-42)
            r0.C(r4, r12, r8, r1)
            r8 = r2
            r2 = r5
            r51 = r7
            goto L18a
        L26d:
            I0.s r8 = I0.p.f2293C
            boolean r39 = kotlin.jvm.internal.m.a(r4, r8)
            r47 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r49 = 32
            java.lang.String r50 = ""
            if (r39 == 0) goto L3a9
            I0.s r1 = I0.h.j
            boolean r1 = r11.c(r1)
            if (r1 == 0) goto L392
            java.lang.Object r1 = r5.g(r8)
            if (r1 != 0) goto L28e
            r1 = r27
        L28e:
            L0.d r1 = (L0.C0192d) r1
            if (r1 == 0) goto L293
            goto L295
        L293:
            r1 = r50
        L295:
            java.lang.Object r4 = r11.g(r8)
            if (r4 != 0) goto L29d
            r4 = r27
        L29d:
            L0.d r4 = (L0.C0192d) r4
            if (r4 == 0) goto L2a2
            goto L2a4
        L2a2:
            r4 = r50
        L2a4:
            java.lang.CharSequence r8 = K(r4)
            int r12 = r1.length()
            r39 = r2
            int r2 = r4.length()
            r50 = r2
            if (r12 <= r2) goto L2b7
            goto L2b8
        L2b7:
            r2 = r12
        L2b8:
            r51 = r7
            r7 = 0
        L2bb:
            r52 = r2
            if (r7 >= r2) goto L2d3
            char r2 = r1.charAt(r7)
            r53 = r12
            char r12 = r4.charAt(r7)
            if (r2 == r12) goto L2cc
            goto L2d5
        L2cc:
            int r7 = r7 + 1
            r2 = r52
            r12 = r53
            goto L2bb
        L2d3:
            r53 = r12
        L2d5:
            r2 = 0
        L2d6:
            int r12 = r52 - r7
            if (r2 >= r12) goto L2f1
            int r12 = r53 + (-1)
            int r12 = r12 - r2
            char r12 = r1.charAt(r12)
            int r54 = r50 + (-1)
            r55 = r2
            int r2 = r54 - r55
            char r2 = r4.charAt(r2)
            if (r12 == r2) goto L2ee
            goto L2f3
        L2ee:
            int r2 = r55 + 1
            goto L2d6
        L2f1:
            r55 = r2
        L2f3:
            int r12 = r53 - r55
            int r12 = r12 - r7
            int r2 = r50 - r55
            int r2 = r2 - r7
            I0.s r4 = I0.p.f2297G
            boolean r52 = r5.c(r4)
            boolean r4 = r11.c(r4)
            r53 = r4
            I0.s r4 = I0.p.f2293C
            boolean r4 = r5.c(r4)
            if (r4 == 0) goto L314
            if (r52 != 0) goto L314
            if (r53 == 0) goto L314
            r54 = 1
            goto L316
        L314:
            r54 = 0
        L316:
            if (r4 == 0) goto L31f
            if (r52 == 0) goto L31f
            if (r53 != 0) goto L31f
            r52 = 1
            goto L321
        L31f:
            r52 = 0
        L321:
            if (r54 != 0) goto L325
            if (r52 == 0) goto L328
        L325:
            r53 = r5
            goto L34b
        L328:
            int r4 = r0.z(r3)
            r53 = r5
            r5 = 16
            android.view.accessibility.AccessibilityEvent r4 = r0.o(r4, r5)
            r4.setFromIndex(r7)
            r4.setRemovedCount(r12)
            r4.setAddedCount(r2)
            r4.setBeforeText(r1)
            java.util.List r1 = r4.getText()
            r1.add(r8)
            r7 = r3
            r2 = r39
            goto L35e
        L34b:
            int r1 = r0.z(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r50)
            r2 = r3
            r3 = r39
            r7 = r2
            r5 = r8
            r2 = r39
            android.view.accessibility.AccessibilityEvent r4 = r0.p(r1, r2, r3, r4, r5)
        L35e:
            java.lang.String r1 = "android.widget.EditText"
            r4.setClassName(r1)
            r0.B(r4)
            if (r54 != 0) goto L372
            if (r52 == 0) goto L36b
            goto L372
        L36b:
            r8 = r2
        L36c:
            r3 = r44
            r2 = r53
            goto L140
        L372:
            I0.s r1 = I0.p.f2294D
            java.lang.Object r1 = r6.h(r1)
            L0.E r1 = (L0.E) r1
            r39 = r2
            long r1 = r1.f3089a
            r54 = r1
            long r1 = r54 >> r49
            int r1 = (int) r1
            r4.setFromIndex(r1)
            long r1 = r54 & r47
            int r1 = (int) r1
            r4.setToIndex(r1)
            r0.B(r4)
        L38f:
            r8 = r39
            goto L36c
        L392:
            r39 = r2
            r53 = r5
            r51 = r7
            r7 = r3
            int r1 = r0.z(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r4 = 8
            r8 = 2048(0x800, float:2.87E-42)
            D(r0, r1, r8, r2, r4)
            goto L38f
        L3a9:
            r39 = r2
            r53 = r5
            r51 = r7
            r7 = r3
            I0.s r2 = I0.p.f2294D
            boolean r3 = kotlin.jvm.internal.m.a(r4, r2)
            if (r3 == 0) goto L403
            java.lang.Object r1 = r11.g(r8)
            if (r1 != 0) goto L3c0
            r1 = r27
        L3c0:
            L0.d r1 = (L0.C0192d) r1
            if (r1 == 0) goto L3cb
            java.lang.String r1 = r1.f3106r
            if (r1 != 0) goto L3c9
            goto L3cb
        L3c9:
            r50 = r1
        L3cb:
            java.lang.Object r1 = r6.h(r2)
            L0.E r1 = (L0.E) r1
            long r1 = r1.f3089a
            r2 = r1
            int r1 = r0.z(r7)
            long r4 = r2 >> r49
            int r4 = (int) r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            long r2 = r2 & r47
            int r2 = (int) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r2 = r50.length()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.CharSequence r5 = K(r50)
            r8 = r4
            r4 = r2
            r2 = r8
            r8 = r39
            android.view.accessibility.AccessibilityEvent r1 = r0.p(r1, r2, r3, r4, r5)
            r0.B(r1)
            r0.F(r10)
            goto L36c
        L403:
            r8 = r39
            r3 = r44
            r2 = r53
            boolean r5 = kotlin.jvm.internal.m.a(r4, r12)
            if (r5 == 0) goto L411
            r5 = 1
            goto L417
        L411:
            I0.s r5 = I0.p.f2318t
            boolean r5 = kotlin.jvm.internal.m.a(r4, r5)
        L417:
            if (r5 == 0) goto L45a
            r0.v(r13)
            C0.U0 r1 = C0.W.e(r7, r9)
            kotlin.jvm.internal.m.b(r1)
            java.lang.Object r4 = r11.g(r12)
            if (r4 != 0) goto L42b
            r4 = r27
        L42b:
            I0.g r4 = (I0.g) r4
            r1.f934u = r4
            I0.s r4 = I0.p.f2318t
            java.lang.Object r4 = r11.g(r4)
            if (r4 != 0) goto L439
            r4 = r27
        L439:
            I0.g r4 = (I0.g) r4
            r1.f935v = r4
            java.util.List r4 = r1.f931r
            boolean r4 = r4.contains(r1)
            if (r4 != 0) goto L447
            goto L140
        L447:
            C0.A r4 = r0.f854d
            B0.v0 r4 = r4.getSnapshotObserver()
            B0.K r5 = new B0.K
            r12 = 6
            r5.<init>(r12, r1, r0)
            C0.H r12 = r0.f853O
            r4.a(r1, r12, r5)
            goto L140
        L45a:
            I0.s r5 = I0.p.f2309k
            boolean r5 = kotlin.jvm.internal.m.a(r4, r5)
            if (r5 == 0) goto L48a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.m.c(r1, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L47d
            int r1 = r0.z(r10)
            r4 = 8
            android.view.accessibility.AccessibilityEvent r1 = r0.o(r1, r4)
            r0.B(r1)
            goto L47f
        L47d:
            r4 = 8
        L47f:
            int r1 = r0.z(r10)
            r12 = 2048(0x800, float:2.87E-42)
            D(r0, r1, r12, r8, r4)
            goto L140
        L48a:
            I0.s r5 = I0.h.f2252v
            boolean r12 = kotlin.jvm.internal.m.a(r4, r5)
            if (r12 == 0) goto L4fa
            java.lang.Object r1 = r6.h(r5)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r2.g(r5)
            if (r4 != 0) goto L4a0
            r4 = r27
        L4a0:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L4f0
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r12 = r1
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            if (r12 > 0) goto L4e2
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r12 = r4
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            if (r12 > 0) goto L4d4
            boolean r4 = r5.containsAll(r1)
            if (r4 == 0) goto L4d1
            boolean r1 = r1.containsAll(r5)
            if (r1 != 0) goto L4cd
            goto L4d1
        L4cd:
            r37 = 0
            goto L533
        L4d1:
            r37 = 1
            goto L533
        L4d4:
            r5 = 0
            java.lang.Object r1 = r4.get(r5)
            r1.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        L4e2:
            r5 = 0
            java.lang.Object r1 = r1.get(r5)
            r1.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        L4f0:
            r5 = 0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L533
            goto L4d1
        L4fa:
            r5 = 0
            boolean r12 = r1 instanceof I0.a
            if (r12 == 0) goto L4d1
            I0.a r1 = (I0.a) r1
            java.lang.Object r4 = r2.g(r4)
            if (r4 != 0) goto L509
            r4 = r27
        L509:
            java.util.Comparator[] r12 = C0.M.f890a
            if (r1 != r4) goto L50e
            goto L52f
        L50e:
            boolean r12 = r4 instanceof I0.a
            if (r12 != 0) goto L513
            goto L52d
        L513:
            java.lang.String r12 = r1.f2221a
            I0.a r4 = (I0.a) r4
            java.lang.String r5 = r4.f2221a
            m5.e r4 = r4.f2222b
            boolean r5 = kotlin.jvm.internal.m.a(r12, r5)
            if (r5 != 0) goto L522
            goto L52d
        L522:
            m5.e r1 = r1.f2222b
            if (r1 != 0) goto L529
            if (r4 == 0) goto L529
            goto L52d
        L529:
            if (r1 == 0) goto L52f
            if (r4 != 0) goto L52f
        L52d:
            r1 = 0
            goto L530
        L52f:
            r1 = 1
        L530:
            if (r1 != 0) goto L4cd
            goto L4d1
        L533:
            r4 = 8
            goto L545
        L536:
            r42 = r4
            r51 = r7
            r43 = r8
            r45 = r12
            r13 = r39
            r8 = r2
            r7 = r3
            r2 = r5
            r3 = r1
            goto L533
        L545:
            long r44 = r45 >> r4
            int r15 = r15 + 1
            r5 = r2
            r1 = r3
            r28 = r4
            r3 = r7
            r2 = r8
            r39 = r13
            r4 = r42
            r8 = r43
            r12 = r44
            r7 = r51
            goto Lbd
        L55b:
            r42 = r4
            r51 = r7
            r43 = r8
            r4 = r28
            r13 = r39
            r8 = r2
            r7 = r3
            r2 = r5
            r3 = r1
            if (r14 != r4) goto L59f
        L56b:
            r1 = r41
            goto L57b
        L56e:
            r42 = r4
            r51 = r7
            r43 = r8
            r13 = r39
            r8 = r2
            r7 = r3
            r2 = r5
            r3 = r1
            goto L56b
        L57b:
            if (r1 == r3) goto L59f
            int r15 = r1 + 1
            r5 = r2
            r1 = r3
            r3 = r7
            r2 = r8
            r39 = r13
            r14 = r40
            r4 = r42
            r8 = r43
            r7 = r51
            r28 = 8
            goto La5
        L591:
            r42 = r4
            r51 = r7
            r43 = r8
            r38 = r13
            r40 = r14
            r8 = r2
            r7 = r3
            r37 = 0
        L59f:
            if (r37 != 0) goto L5ca
            java.util.Comparator[] r1 = C0.M.f890a
            java.util.Iterator r1 = r42.iterator()
        L5a7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c7
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            I0.i r3 = r40.i()
            java.lang.Object r2 = r2.getKey()
            I0.s r2 = (I0.s) r2
            r.G r3 = r3.f2257q
            boolean r2 = r3.c(r2)
            if (r2 != 0) goto L5a7
            r15 = 1
            goto L5c8
        L5c7:
            r15 = 0
        L5c8:
            r37 = r15
        L5ca:
            if (r37 == 0) goto L5d8
            int r1 = r0.z(r7)
            r4 = 8
            r12 = 2048(0x800, float:2.87E-42)
            D(r0, r1, r12, r8, r4)
            goto L5f2
        L5d8:
            r4 = 8
            goto L5f2
        L5db:
            java.lang.String r1 = "no value for specified key"
            C2.e r1 = C0.S.i(r1)
            throw r1
        L5e2:
            r34 = r1
            r51 = r7
            r43 = r8
            r29 = r10
            r30 = r11
            r4 = r12
            r38 = r13
            r31 = r15
            r8 = r2
        L5f2:
            long r21 = r21 >> r4
            int r1 = r34 + 1
            r6 = r57
            r12 = r4
            r2 = r8
            r10 = r29
            r11 = r30
            r15 = r31
            r13 = r38
            r8 = r43
            r7 = r51
            r14 = 0
            goto L47
        L609:
            r51 = r7
            r43 = r8
            r29 = r10
            r30 = r11
            r4 = r12
            r12 = r13
            r31 = r15
            r8 = r2
            if (r12 != r4) goto L63d
            r14 = r31
        L61a:
            r1 = r17
            goto L628
        L61d:
            r51 = r7
            r43 = r8
            r29 = r10
            r30 = r11
            r8 = r2
            r14 = r15
            goto L61a
        L628:
            if (r14 == r1) goto L63d
            int r15 = r14 + 1
            r6 = r57
            r13 = r1
            r2 = r8
            r12 = r16
            r10 = r29
            r11 = r30
            r8 = r43
            r7 = r51
            r14 = 0
            goto L24
        L63d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.I.G(r.k):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(B0.L l7, r.w wVar) {
        I0.i iVarU;
        if (l7.F() && !this.f854d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(l7)) {
            B0.L l8 = null;
            if (!l7.f268U.d(8)) {
                l7 = l7.s();
                while (true) {
                    if (l7 == null) {
                        l7 = null;
                        break;
                    } else if (l7.f268U.d(8)) {
                        break;
                    } else {
                        l7 = l7.s();
                    }
                }
            }
            if (l7 == null || (iVarU = l7.u()) == null) {
                return;
            }
            if (!iVarU.f2259s) {
                B0.L lS = l7.s();
                while (true) {
                    if (lS != null) {
                        I0.i iVarU2 = lS.u();
                        if (iVarU2 != null && iVarU2.f2259s) {
                            l8 = lS;
                            break;
                        }
                        lS = lS.s();
                    } else {
                        break;
                    }
                }
                if (l8 != null) {
                    l7 = l8;
                }
            }
            int i = l7.f280r;
            if (wVar.a(i)) {
                D(this, z(i), 2048, 1, 8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(B0.L l7) {
        if (l7.F() && !this.f854d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(l7)) {
            int i = l7.f280r;
            I0.g gVar = (I0.g) this.f866s.b(i);
            I0.g gVar2 = (I0.g) this.f867t.b(i);
            if (gVar == null && gVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (gVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) gVar.f2231a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) gVar.f2232b.invoke()).floatValue());
            }
            if (gVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) gVar2.f2231a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) gVar2.f2232b.invoke()).floatValue());
            }
            B(accessibilityEventO);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean J(I0.m mVar, int i, int i7, boolean z5) {
        String strT;
        I0.i iVar = mVar.f2268d;
        int i8 = mVar.f2270g;
        I0.s sVar = I0.h.i;
        if (iVar.f2257q.c(sVar) && M.a(mVar)) {
            B5.f fVar = (B5.f) ((I0.a) mVar.f2268d.h(sVar)).f2222b;
            if (fVar != null) {
                return ((Boolean) fVar.invoke(Integer.valueOf(i), Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
            }
        } else if ((i != i7 || i7 != this.f870w) && (strT = t(mVar)) != null) {
            if (i < 0 || i != i7 || i7 > strT.length()) {
                i = -1;
            }
            this.f870w = i;
            boolean z6 = strT.length() > 0;
            B(p(z(i8), z6 ? Integer.valueOf(this.f870w) : null, z6 ? Integer.valueOf(this.f870w) : null, z6 ? Integer.valueOf(strT.length()) : null, strT));
            F(i8);
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v13, resolved type: java.lang.String */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            r32 = this;
            r0 = r32
            r.w r1 = new r.w
            r1.<init>()
            r.w r2 = r0.f842D
            int[] r3 = r2.f16254b
            long[] r4 = r2.f16253a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r.v r6 = r0.f848J
            r14 = 8
            if (r5 < 0) goto L9d
            r7 = 0
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
        L1b:
            r9 = r4[r7]
            r8 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = ~r9
            long r11 = r11 << r8
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L95
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L34:
            if (r12 >= r11) goto L90
            long r22 = r9 & r18
            int r13 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r22 = r8
            r.k r8 = r0.s()
            java.lang.Object r8 = r8.b(r13)
            C0.W0 r8 = (C0.W0) r8
            r23 = 0
            if (r8 == 0) goto L54
            I0.m r8 = r8.f941a
            goto L56
        L54:
            r8 = r23
        L56:
            if (r8 == 0) goto L64
            I0.i r8 = r8.f2268d
            I0.s r15 = I0.p.f2305d
            r.G r8 = r8.f2257q
            boolean r8 = r8.c(r15)
            if (r8 != 0) goto L8a
        L64:
            r1.a(r13)
            java.lang.Object r8 = r6.b(r13)
            C0.V0 r8 = (C0.V0) r8
            if (r8 == 0) goto L80
            I0.i r8 = r8.f937a
            I0.s r15 = I0.p.f2305d
            r.G r8 = r8.f2257q
            java.lang.Object r8 = r8.g(r15)
            if (r8 != 0) goto L7c
            goto L7e
        L7c:
            r23 = r8
        L7e:
            java.lang.String r23 = (java.lang.String) r23
        L80:
            r8 = r23
            r15 = 32
            r0.E(r8, r13, r15)
            goto L8a
        L88:
            r22 = r8
        L8a:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r8 = r22
            goto L34
        L90:
            r22 = r8
            if (r11 != r14) goto La8
            goto L97
        L95:
            r22 = r8
        L97:
            if (r7 == r5) goto La8
            int r7 = r7 + 1
            goto L1b
        L9d:
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
        La8:
            int[] r3 = r1.f16254b
            long[] r1 = r1.f16253a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L183
            r5 = 0
        Lb2:
            r7 = r1[r5]
            long r9 = ~r7
            long r9 = r9 << r22
            long r9 = r9 & r7
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L177
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Lc6:
            if (r10 >= r9) goto L171
            long r11 = r7 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L161
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            int r12 = java.lang.Integer.hashCode(r11)
            r13 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r12 = r12 * r13
            int r13 = r12 << 16
            r12 = r12 ^ r13
            r13 = r12 & 127(0x7f, float:1.78E-43)
            int r15 = r2.f16255c
            int r12 = r12 >>> 7
            r12 = r12 & r15
            r24 = r14
            r23 = 0
        Le9:
            long[] r14 = r2.f16253a
            int r25 = r12 >> 3
            r26 = r12 & 7
            r27 = r1
            int r1 = r26 << 3
            r28 = r14[r25]
            long r28 = r28 >>> r1
            int r25 = r25 + 1
            r25 = r14[r25]
            int r14 = 64 - r1
            long r25 = r25 << r14
            r30 = r7
            long r7 = (long) r1
            long r7 = -r7
            r1 = 63
            long r7 = r7 >> r1
            long r7 = r25 & r7
            long r7 = r28 | r7
            r1 = r15
            long r14 = (long) r13
            r25 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r14 = r14 * r25
            long r14 = r14 ^ r7
            long r25 = r14 - r25
            long r14 = ~r14
            long r14 = r25 & r14
            long r14 = r14 & r20
        L11b:
            r25 = 0
            int r28 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r28 == 0) goto L13f
            int r25 = java.lang.Long.numberOfTrailingZeros(r14)
            int r25 = r25 >> 3
            int r25 = r12 + r25
            r25 = r25 & r1
            r28 = r1
            int[] r1 = r2.f16254b
            r1 = r1[r25]
            if (r1 != r11) goto L136
        L133:
            r1 = r25
            goto L14e
        L136:
            r25 = 1
            long r25 = r14 - r25
            long r14 = r14 & r25
            r1 = r28
            goto L11b
        L13f:
            r28 = r1
            long r14 = ~r7
            r1 = 6
            long r14 = r14 << r1
            long r7 = r7 & r14
            long r7 = r7 & r20
            int r1 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r1 == 0) goto L154
            r25 = -1
            goto L133
        L14e:
            if (r1 < 0) goto L167
            r2.f(r1)
            goto L167
        L154:
            int r23 = r23 + 8
            int r12 = r12 + r23
            r12 = r12 & r28
            r1 = r27
            r15 = r28
            r7 = r30
            goto Le9
        L161:
            r27 = r1
            r30 = r7
            r24 = r14
        L167:
            long r7 = r30 >> r24
            int r10 = r10 + 1
            r14 = r24
            r1 = r27
            goto Lc6
        L171:
            r27 = r1
            r1 = r14
            if (r9 != r1) goto L183
            goto L179
        L177:
            r27 = r1
        L179:
            if (r5 == r4) goto L183
            int r5 = r5 + 1
            r1 = r27
            r14 = 8
            goto Lb2
        L183:
            r6.c()
            r.k r1 = r0.s()
            int[] r3 = r1.f16217b
            java.lang.Object[] r4 = r1.f16218c
            long[] r1 = r1.f16216a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L1fc
            r7 = 0
        L196:
            r8 = r1[r7]
            long r10 = ~r8
            long r10 = r10 << r22
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L1f5
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r24 = 8
            int r14 = 8 - r10
            r10 = 0
        L1ac:
            if (r10 >= r14) goto L1f0
            long r11 = r8 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L1ea
            int r11 = r7 << 3
            int r11 = r11 + r10
            r12 = r3[r11]
            r11 = r4[r11]
            C0.W0 r11 = (C0.W0) r11
            I0.m r11 = r11.f941a
            I0.i r13 = r11.f2268d
            I0.s r15 = I0.p.f2305d
            r.G r13 = r13.f2257q
            boolean r13 = r13.c(r15)
            if (r13 == 0) goto L1de
            boolean r13 = r2.a(r12)
            if (r13 == 0) goto L1de
            I0.i r13 = r11.f2268d
            java.lang.Object r13 = r13.h(r15)
            java.lang.String r13 = (java.lang.String) r13
            r15 = 16
            r0.E(r13, r12, r15)
        L1de:
            C0.V0 r13 = new C0.V0
            r.k r15 = r0.s()
            r13.<init>(r11, r15)
            r6.h(r12, r13)
        L1ea:
            r11 = 8
            long r8 = r8 >> r11
            int r10 = r10 + 1
            goto L1ac
        L1f0:
            r11 = 8
            if (r14 != r11) goto L1fc
            goto L1f7
        L1f5:
            r11 = 8
        L1f7:
            if (r7 == r5) goto L1fc
            int r7 = r7 + 1
            goto L196
        L1fc:
            C0.V0 r1 = new C0.V0
            C0.A r2 = r0.f854d
            I0.n r2 = r2.getSemanticsOwner()
            I0.m r2 = r2.a()
            r.k r3 = r0.s()
            r1.<init>(r2, r3)
            r0.f849K = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.I.L():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final C1134a b(View view) {
        return this.f860m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i, x1.e eVar, String str, Bundle bundle) {
        I0.m mVar;
        int i7;
        float fH;
        float fH2;
        float fG;
        float fG2;
        int i8;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f18345a;
        W0 w02 = (W0) s().b(i);
        if (w02 == null || (mVar = w02.f941a) == null) {
            return;
        }
        I0.i iVar = mVar.f2268d;
        C1548G c1548g = iVar.f2257q;
        String strT = t(mVar);
        if (kotlin.jvm.internal.m.a(str, this.f845G)) {
            int iD = this.f843E.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, this.f846H)) {
            int iD2 = this.f844F.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean z5 = false;
        if (!c1548g.c(I0.h.f2234a) || bundle == null || !kotlin.jvm.internal.m.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            I0.s sVar = I0.p.f2321w;
            if (!c1548g.c(sVar) || bundle == null || !kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.testTag")) {
                if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, mVar.f2270g);
                    return;
                }
                return;
            } else {
                Object objG = c1548g.g(sVar);
                String str2 = (String) (objG == null ? null : objG);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i9 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i10 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i10 > 0 && i9 >= 0) {
            if (i9 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                L0.C cH = W.h(iVar);
                if (cH == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i9 + i11;
                    if (i12 >= cH.f3078a.f3071a.f3106r.length()) {
                        arrayList.add(z5);
                        i7 = i9;
                        i8 = i11;
                    } else {
                        E.a0 a0Var = cH.f3079b;
                        C0192d c0192d = (C0192d) ((L0.l) a0Var.f1530c).f3125b;
                        if (i12 < 0 || i12 >= c0192d.f3106r.length()) {
                            StringBuilder sbL = k1.i.l("offset(", ") is out of bounds [0, ", i12);
                            sbL.append(c0192d.f3106r.length());
                            sbL.append(')');
                            Q0.a.a(sbL.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) a0Var.f1532e;
                        L0.n nVar = (L0.n) arrayList2.get(AbstractC1918b.o(i12, arrayList2));
                        C0189a c0189a = nVar.f3157a;
                        int iA = nVar.a(i12);
                        CharSequence charSequence = c0189a.f3100e;
                        if (iA < 0 || iA >= charSequence.length()) {
                            StringBuilder sbL2 = k1.i.l("offset(", ") is out of bounds [0,", iA);
                            sbL2.append(charSequence.length());
                            sbL2.append(')');
                            Q0.a.a(sbL2.toString());
                        }
                        M0.j jVar = c0189a.f3099d;
                        Layout layout = jVar.f3712e;
                        int lineForOffset = layout.getLineForOffset(iA);
                        float f = jVar.f(lineForOffset);
                        float fD = jVar.d(lineForOffset);
                        i7 = i9;
                        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean zIsRtlCharAt = layout.isRtlCharAt(iA);
                        if (!z6 || zIsRtlCharAt) {
                            if (z6 && zIsRtlCharAt) {
                                fG = jVar.h(iA, false);
                                fG2 = jVar.h(iA + 1, true);
                            } else if (zIsRtlCharAt) {
                                fG = jVar.g(iA, false);
                                fG2 = jVar.g(iA + 1, true);
                            } else {
                                fH = jVar.h(iA, false);
                                fH2 = jVar.h(iA + 1, true);
                            }
                            float f7 = fG;
                            fH = fG2;
                            fH2 = f7;
                        } else {
                            fH = jVar.g(iA, false);
                            fH2 = jVar.g(iA + 1, true);
                        }
                        RectF rectF2 = new RectF(fH, f, fH2, fD);
                        float f8 = rectF2.left;
                        float f9 = rectF2.top;
                        float f10 = rectF2.right;
                        float f11 = rectF2.bottom;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(nVar.f)) & 4294967295L);
                        i8 = i11;
                        int i13 = (int) (jFloatToRawIntBits >> 32);
                        float fIntBitsToFloat = Float.intBitsToFloat(i13) + f8;
                        int i14 = (int) (jFloatToRawIntBits & 4294967295L);
                        C1131c c1131c = new C1131c(fIntBitsToFloat, Float.intBitsToFloat(i14) + f9, Float.intBitsToFloat(i13) + f10, Float.intBitsToFloat(i14) + f11);
                        B0.n0 n0VarC = mVar.c();
                        long jF = 0;
                        if (n0VarC != null) {
                            if (!n0VarC.B0().f10099D) {
                                n0VarC = null;
                            }
                            if (n0VarC != null) {
                                jF = n0VarC.F(0L);
                            }
                        }
                        C1131c c1131cE = c1131c.e(jF);
                        C1131c c1131cE2 = mVar.e();
                        C1131c c1131cC = ((((c1131cE.f13522a > c1131cE2.f13524c ? 1 : (c1131cE.f13522a == c1131cE2.f13524c ? 0 : -1)) < 0) & ((c1131cE2.f13522a > c1131cE.f13524c ? 1 : (c1131cE2.f13522a == c1131cE.f13524c ? 0 : -1)) < 0)) & ((c1131cE.f13523b > c1131cE2.f13525d ? 1 : (c1131cE.f13523b == c1131cE2.f13525d ? 0 : -1)) < 0)) & ((c1131cE2.f13523b > c1131cE.f13525d ? 1 : (c1131cE2.f13523b == c1131cE.f13525d ? 0 : -1)) < 0) ? c1131cE.c(c1131cE2) : null;
                        if (c1131cC != null) {
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(c1131cC.f13523b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1131cC.f13522a)) << 32);
                            A a7 = this.f854d;
                            long jY = a7.y(jFloatToRawIntBits2);
                            long jY2 = a7.y((((long) Float.floatToRawIntBits(c1131cC.f13524c)) << 32) | (((long) Float.floatToRawIntBits(c1131cC.f13525d)) & 4294967295L));
                            rectF = new RectF(Float.intBitsToFloat((int) (jY >> 32)), Float.intBitsToFloat((int) (jY & 4294967295L)), Float.intBitsToFloat((int) (jY2 >> 32)), Float.intBitsToFloat((int) (jY2 & 4294967295L)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i11 = i8 + 1;
                    i9 = i7;
                    z5 = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Rect k(W0 w02) {
        Rect rect = w02.f942b;
        float f = rect.left;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(rect.top)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        A a7 = this.f854d;
        long jY = a7.y(jFloatToRawIntBits);
        long jY2 = a7.y((((long) Float.floatToRawIntBits(rect.right)) << 32) | (((long) Float.floatToRawIntBits(rect.bottom)) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jY >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jY & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jY2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jY2 & 4294967295L))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
    
        if (M5.AbstractC0263y.h(r4, r2) == r6) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x005f, B:29:0x0075, B:31:0x007d, B:34:0x0088, B:36:0x008e, B:37:0x009d, B:39:0x00a5, B:40:0x00c1, B:42:0x00d0, B:45:0x00de, B:20:0x0048), top: B:56:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fa -> B:48:0x00fd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(s5.c r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof C0.G
            if (r2 == 0) goto L17
            r2 = r0
            C0.G r2 = (C0.G) r2
            int r3 = r2.f827v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f827v = r3
            goto L1c
        L17:
            C0.G r2 = new C0.G
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.f825t
            int r3 = r2.f827v
            r4 = 2
            r5 = 1
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r3 == 0) goto L4c
            if (r3 == r5) goto L42
            if (r3 != r4) goto L3a
            O5.b r3 = r2.f824s
            r.w r7 = r2.f823r
            C0.I r8 = r2.f822q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Throwable -> L37
            r0 = r4
            r10 = r5
            goto Lfd
        L37:
            r0 = move-exception
            goto L10f
        L3a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L42:
            O5.b r3 = r2.f824s
            r.w r7 = r2.f823r
            C0.I r8 = r2.f822q
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Throwable -> L37
            goto L75
        L4c:
            m5.AbstractC1362a.e(r0)
            r.w r0 = new r.w     // Catch: java.lang.Throwable -> L10d
            r0.<init>()     // Catch: java.lang.Throwable -> L10d
            O5.e r3 = r1.f873z     // Catch: java.lang.Throwable -> L10d
            r3.getClass()     // Catch: java.lang.Throwable -> L10d
            O5.b r7 = new O5.b     // Catch: java.lang.Throwable -> L10d
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L10d
            r8 = r1
        L5f:
            r2.f822q = r8     // Catch: java.lang.Throwable -> L37
            r2.f823r = r0     // Catch: java.lang.Throwable -> L37
            r2.f824s = r7     // Catch: java.lang.Throwable -> L37
            r2.f827v = r5     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r7.b(r2)     // Catch: java.lang.Throwable -> L37
            if (r3 != r6) goto L6f
            goto Lfc
        L6f:
            r16 = r7
            r7 = r0
            r0 = r3
            r3 = r16
        L75:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L37
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L103
            r3.c()     // Catch: java.lang.Throwable -> L37
            boolean r0 = r8.u()     // Catch: java.lang.Throwable -> L37
            r.f r9 = r8.f872y
            if (r0 == 0) goto Ldd
            int r0 = r9.f16201s     // Catch: java.lang.Throwable -> L37
            r10 = 0
            r11 = r10
        L8c:
            if (r11 >= r0) goto L9d
            java.lang.Object[] r12 = r9.f16200r     // Catch: java.lang.Throwable -> L37
            r12 = r12[r11]     // Catch: java.lang.Throwable -> L37
            B0.L r12 = (B0.L) r12     // Catch: java.lang.Throwable -> L37
            r8.H(r12, r7)     // Catch: java.lang.Throwable -> L37
            r8.I(r12)     // Catch: java.lang.Throwable -> L37
            int r11 = r11 + 1
            goto L8c
        L9d:
            r7.f16256d = r10     // Catch: java.lang.Throwable -> L37
            long[] r0 = r7.f16253a     // Catch: java.lang.Throwable -> L37
            long[] r10 = r.O.f16162a     // Catch: java.lang.Throwable -> L37
            if (r0 == r10) goto Lc1
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            n5.k.K0(r0, r10)     // Catch: java.lang.Throwable -> L37
            long[] r0 = r7.f16253a     // Catch: java.lang.Throwable -> L37
            int r10 = r7.f16255c     // Catch: java.lang.Throwable -> L37
            int r11 = r10 >> 3
            r10 = r10 & 7
            int r10 = r10 << 3
            r12 = r0[r11]     // Catch: java.lang.Throwable -> L37
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 << r10
            long r4 = ~r14     // Catch: java.lang.Throwable -> L37
            long r4 = r4 & r12
            long r4 = r4 | r14
            r0[r11] = r4     // Catch: java.lang.Throwable -> L37
        Lc1:
            int r0 = r7.f16255c     // Catch: java.lang.Throwable -> L37
            int r0 = r.O.a(r0)     // Catch: java.lang.Throwable -> L37
            int r4 = r7.f16256d     // Catch: java.lang.Throwable -> L37
            int r0 = r0 - r4
            r7.f16257e = r0     // Catch: java.lang.Throwable -> L37
            boolean r0 = r8.f850L     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Ldb
            r10 = 1
            r8.f850L = r10     // Catch: java.lang.Throwable -> L37
            android.os.Handler r0 = r8.f859l     // Catch: java.lang.Throwable -> L37
            C0.m r4 = r8.f851M     // Catch: java.lang.Throwable -> L37
            r0.post(r4)     // Catch: java.lang.Throwable -> L37
            goto Lde
        Ldb:
            r10 = 1
            goto Lde
        Ldd:
            r10 = r5
        Lde:
            r9.clear()     // Catch: java.lang.Throwable -> L37
            r.v r0 = r8.f866s     // Catch: java.lang.Throwable -> L37
            r0.c()     // Catch: java.lang.Throwable -> L37
            r.v r0 = r8.f867t     // Catch: java.lang.Throwable -> L37
            r0.c()     // Catch: java.lang.Throwable -> L37
            long r4 = r8.f857h     // Catch: java.lang.Throwable -> L37
            r2.f822q = r8     // Catch: java.lang.Throwable -> L37
            r2.f823r = r7     // Catch: java.lang.Throwable -> L37
            r2.f824s = r3     // Catch: java.lang.Throwable -> L37
            r0 = 2
            r2.f827v = r0     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = M5.AbstractC0263y.h(r4, r2)     // Catch: java.lang.Throwable -> L37
            if (r4 != r6) goto Lfd
        Lfc:
            return r6
        Lfd:
            r4 = r0
            r0 = r7
            r5 = r10
            r7 = r3
            goto L5f
        L103:
            r.f r0 = r8.f872y
            r0.clear()
            m5.y r0 = m5.C1386y.f15098a
            return r0
        L10b:
            r8 = r1
            goto L10f
        L10d:
            r0 = move-exception
            goto L10b
        L10f:
            r.f r2 = r8.f872y
            r2.clear()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.I.l(s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r23, int r24, long r25) {
        /*
            r22 = this;
            r0 = r23
            r1 = r25
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            boolean r3 = kotlin.jvm.internal.m.a(r3, r4)
            if (r3 != 0) goto L1a
        L16:
            r16 = 0
            goto L13e
        L1a:
            r.k r3 = r22.s()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r5 = i0.C1130b.b(r1, r5)
            if (r5 != 0) goto L16
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r5 & r1
            r7 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r5 = r5 + r7
            r7 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L16
            r5 = 1
            if (r0 != r5) goto L47
            I0.s r0 = I0.p.f2318t
            goto L4b
        L47:
            if (r0 != 0) goto L138
            I0.s r0 = I0.p.f2317s
        L4b:
            java.lang.Object[] r6 = r3.f16218c
            long[] r3 = r3.f16216a
            int r7 = r3.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L16
            r8 = 0
            r9 = 0
        L56:
            r10 = r3[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L12c
            int r12 = r8 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L70:
            if (r14 >= r12) goto L125
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L116
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r6[r15]
            C0.W0 r15 = (C0.W0) r15
            r16 = 0
            android.graphics.Rect r4 = r15.f942b
            int r5 = r4.left
            float r5 = (float) r5
            r23 = r13
            int r13 = r4.top
            float r13 = (float) r13
            int r1 = r4.right
            float r1 = (float) r1
            int r2 = r4.bottom
            float r2 = (float) r2
            r4 = 32
            r18 = r1
            r19 = r2
            long r1 = r25 >> r4
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = r1
            long r1 = r25 & r20
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r2 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r2 < 0) goto Lb4
            r2 = 1
            goto Lb6
        Lb4:
            r2 = r16
        Lb6:
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 >= 0) goto Lbc
            r4 = 1
            goto Lbe
        Lbc:
            r4 = r16
        Lbe:
            r2 = r2 & r4
            int r4 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r4 < 0) goto Lc5
            r4 = 1
            goto Lc7
        Lc5:
            r4 = r16
        Lc7:
            r2 = r2 & r4
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 >= 0) goto Lce
            r1 = 1
            goto Ld0
        Lce:
            r1 = r16
        Ld0:
            r1 = r1 & r2
            if (r1 != 0) goto Ld4
            goto L11a
        Ld4:
            I0.m r1 = r15.f941a
            I0.i r1 = r1.f2268d
            r.G r1 = r1.f2257q
            java.lang.Object r1 = r1.g(r0)
            if (r1 != 0) goto Le1
            r1 = 0
        Le1:
            I0.g r1 = (I0.g) r1
            if (r1 != 0) goto Le6
            goto L11a
        Le6:
            E.Q r2 = r1.f2231a
            if (r24 >= 0) goto Lfb
            java.lang.Object r1 = r2.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L11a
        Lf9:
            r9 = 1
            goto L11a
        Lfb:
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            E.Q r1 = r1.f2232b
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L11a
            goto Lf9
        L116:
            r23 = r13
            r16 = 0
        L11a:
            long r10 = r10 >> r23
            int r14 = r14 + 1
            r13 = r23
            r1 = r25
            r5 = 1
            goto L70
        L125:
            r1 = r13
            r16 = 0
            if (r12 != r1) goto L12b
            goto L12e
        L12b:
            return r9
        L12c:
            r16 = 0
        L12e:
            if (r8 == r7) goto L137
            int r8 = r8 + 1
            r1 = r25
            r5 = 1
            goto L56
        L137:
            return r9
        L138:
            C2.e r0 = new C2.e
            r0.<init>()
            throw r0
        L13e:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.I.m(boolean, int, long):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                A(this.f854d.getSemanticsOwner().a(), this.f849K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                G(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AccessibilityEvent o(int i, int i7) {
        W0 w02;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i7);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        A a7 = this.f854d;
        accessibilityEventObtain.setPackageName(a7.getContext().getPackageName());
        accessibilityEventObtain.setSource(a7, i);
        if (u() && (w02 = (W0) s().b(i)) != null) {
            accessibilityEventObtain.setPassword(w02.f941a.f2268d.f2257q.c(I0.p.f2297G));
        }
        return accessibilityEventObtain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q(I0.m mVar) {
        I0.i iVar = mVar.f2268d;
        I0.i iVar2 = mVar.f2268d;
        I0.s sVar = I0.p.f2302a;
        if (!iVar.f2257q.c(I0.p.f2302a)) {
            I0.s sVar2 = I0.p.f2294D;
            if (iVar2.f2257q.c(sVar2)) {
                return (int) (((L0.E) iVar2.h(sVar2)).f3089a & 4294967295L);
            }
        }
        return this.f870w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int r(I0.m mVar) {
        I0.i iVar = mVar.f2268d;
        I0.i iVar2 = mVar.f2268d;
        I0.s sVar = I0.p.f2302a;
        if (!iVar.f2257q.c(I0.p.f2302a)) {
            I0.s sVar2 = I0.p.f2294D;
            if (iVar2.f2257q.c(sVar2)) {
                return (int) (((L0.E) iVar2.h(sVar2)).f3089a >> 32);
            }
        }
        return this.f870w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC1560k s() {
        if (this.f839A) {
            this.f839A = false;
            A a7 = this.f854d;
            this.f841C = W.f(a7.getSemanticsOwner());
            if (u()) {
                C1570v c1570v = this.f841C;
                Resources resources = a7.getContext().getResources();
                Comparator[] comparatorArr = M.f890a;
                C1568t c1568t = this.f843E;
                c1568t.a();
                C1568t c1568t2 = this.f844F;
                c1568t2.a();
                W0 w02 = (W0) c1570v.b(-1);
                I0.m mVar = w02 != null ? w02.f941a : null;
                kotlin.jvm.internal.m.b(mVar);
                ArrayList arrayListH = M.h(M.f(mVar), AbstractC0836n2.z(mVar), c1570v, resources);
                int iU = AbstractC0836n2.u(arrayListH);
                int i = 1;
                if (1 <= iU) {
                    while (true) {
                        int i7 = ((I0.m) arrayListH.get(i - 1)).f2270g;
                        int i8 = ((I0.m) arrayListH.get(i)).f2270g;
                        c1568t.f(i7, i8);
                        c1568t2.f(i8, i7);
                        if (i == iU) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f841C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u() {
        return this.f856g.isEnabled() && !this.f858k.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(B0.L l7) {
        if (this.f872y.add(l7)) {
            this.f873z.j(C1386y.f15098a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int z(int i) {
        if (i == this.f854d.getSemanticsOwner().a().f2270g) {
            return -1;
        }
        return i;
    }
}
