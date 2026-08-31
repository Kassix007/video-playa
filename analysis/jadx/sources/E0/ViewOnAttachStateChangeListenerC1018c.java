package e0;

import B0.j0;
import C0.A;
import C0.C0097q;
import C0.RunnableC0089m;
import C0.S;
import C0.U;
import C0.V0;
import C0.W;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.InterfaceC0643f;
import androidx.lifecycle.InterfaceC0660x;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.m;
import r.AbstractC1560k;
import r.AbstractC1561l;
import r.C1570v;

/* JADX INFO: renamed from: e0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1018c implements InterfaceC0643f, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f12480A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1570v f12481B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public V0 f12482C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12483D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final RunnableC0089m f12484E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A f12485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0097q f12486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public E0.c f12487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f12488t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f12489u = 100;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EnumC1016a f12490v = EnumC1016a.f12472q;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12491w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final O5.e f12492x = l6.d.e(1, null, 6);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler f12493y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1570v f12494z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnAttachStateChangeListenerC1018c(A a7, C0097q c0097q) {
        this.f12485q = a7;
        this.f12486r = c0097q;
        C1570v c1570v = AbstractC1561l.f16221a;
        m.c(c1570v, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f12494z = c1570v;
        this.f12481B = new C1570v();
        I0.m mVarA = a7.getSemanticsOwner().a();
        m.c(c1570v, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f12482C = new V0(mVarA, c1570v);
        this.f12484E = new RunnableC0089m(16, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (M5.AbstractC0263y.h(r6, r0) == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(s5.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof e0.C1017b
            if (r0 == 0) goto L13
            r0 = r10
            e0.b r0 = (e0.C1017b) r0
            int r1 = r0.f12479u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12479u = r1
            goto L18
        L13:
            e0.b r0 = new e0.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f12477s
            int r1 = r0.f12479u
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            O5.b r1 = r0.f12476r
            e0.c r5 = r0.f12475q
            m5.AbstractC1362a.e(r10)
        L2d:
            r10 = r5
            goto L4d
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L37:
            O5.b r1 = r0.f12476r
            e0.c r5 = r0.f12475q
            m5.AbstractC1362a.e(r10)
            goto L5d
        L3f:
            m5.AbstractC1362a.e(r10)
            O5.e r10 = r9.f12492x
            r10.getClass()
            O5.b r1 = new O5.b
            r1.<init>(r10)
            r10 = r9
        L4d:
            r0.f12475q = r10
            r0.f12476r = r1
            r0.f12479u = r3
            java.lang.Object r5 = r1.b(r0)
            if (r5 != r4) goto L5a
            goto L8c
        L5a:
            r8 = r5
            r5 = r10
            r10 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8d
            r1.c()
            boolean r10 = r5.i()
            if (r10 == 0) goto L71
            r5.j()
        L71:
            boolean r10 = r5.f12483D
            if (r10 != 0) goto L7e
            r5.f12483D = r3
            android.os.Handler r10 = r5.f12493y
            C0.m r6 = r5.f12484E
            r10.post(r6)
        L7e:
            long r6 = r5.f12489u
            r0.f12475q = r5
            r0.f12476r = r1
            r0.f12479u = r2
            java.lang.Object r10 = M5.AbstractC0263y.h(r6, r0)
            if (r10 != r4) goto L2d
        L8c:
            return r4
        L8d:
            m5.y r10 = m5.C1386y.f15098a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.ViewOnAttachStateChangeListenerC1018c.d(s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(I0.m mVar, B5.e eVar) {
        mVar.getClass();
        List listH = I0.m.h(4, mVar);
        int size = listH.size();
        int i = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = listH.get(i7);
            if (h().a(((I0.m) obj).f2270g)) {
                eVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC1560k h() {
        if (this.f12491w) {
            this.f12491w = false;
            this.f12494z = W.f(this.f12485q.getSemanticsOwner());
            this.f12480A = System.currentTimeMillis();
        }
        return this.f12494z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        return this.f12487s != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        AutofillId autofillIdA;
        E0.c cVar = this.f12487s;
        if (cVar == null) {
            return;
        }
        Object obj = cVar.f1612a;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f12488t;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1019d c1019d = (C1019d) arrayList.get(i);
            int iOrdinal = c1019d.f12497c.ordinal();
            if (iOrdinal == 0) {
                k3.c cVar2 = c1019d.f12498d;
                if (cVar2 != null) {
                    ViewStructure viewStructure = (ViewStructure) cVar2.f14120q;
                    if (Build.VERSION.SDK_INT >= 29) {
                        E0.b.d(A3.a.g(obj), viewStructure);
                    }
                }
            } else if (iOrdinal == 1 && (autofillIdA = cVar.a(c1019d.f12495a)) != null && Build.VERSION.SDK_INT >= 29) {
                E0.b.e(A3.a.g(obj), autofillIdA);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionG = A3.a.g(obj);
            E0.a aVarB = P1.B(cVar.f1613b);
            Objects.requireNonNull(aVarB);
            E0.b.g(contentCaptureSessionG, U.h(aVarB.f1611a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(I0.m mVar, V0 v02) {
        g(mVar, new j0(10, v02, this));
        List listH = I0.m.h(4, mVar);
        int size = listH.size();
        for (int i = 0; i < size; i++) {
            I0.m mVar2 = (I0.m) listH.get(i);
            AbstractC1560k abstractC1560kH = h();
            int i7 = mVar2.f2270g;
            if (abstractC1560kH.a(i7)) {
                C1570v c1570v = this.f12481B;
                if (c1570v.a(i7)) {
                    Object objB = c1570v.b(i7);
                    if (objB == null) {
                        throw S.i("node not present in pruned tree before this change");
                    }
                    k(mVar2, (V0) objB);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, String str) {
        E0.c cVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29 && (cVar = this.f12487s) != null) {
            AutofillId autofillIdA = cVar.a(i);
            if (autofillIdA == null) {
                throw S.i("Invalid content capture ID");
            }
            if (i7 >= 29) {
                E0.b.f(A3.a.g(cVar.f1612a), autofillIdA, str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r18, I0.m r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.i()
            if (r2 != 0) goto Lb
            return
        Lb:
            I0.i r2 = r1.f2268d
            r.G r2 = r2.f2257q
            I0.s r3 = I0.p.f2291A
            java.lang.Object r3 = r2.g(r3)
            r4 = 0
            if (r3 != 0) goto L19
            r3 = r4
        L19:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            e0.a r5 = r0.f12490v
            e0.a r6 = e0.EnumC1016a.f12472q
            if (r5 != r6) goto L45
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.m.a(r3, r5)
            if (r5 == 0) goto L45
            I0.s r3 = I0.h.f2242l
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L32
            r2 = r4
        L32:
            I0.a r2 = (I0.a) r2
            if (r2 == 0) goto L6e
            m5.e r2 = r2.f2222b
            B5.c r2 = (B5.c) r2
            if (r2 == 0) goto L6e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L6e
        L45:
            e0.a r5 = r0.f12490v
            e0.a r6 = e0.EnumC1016a.f12473r
            if (r5 != r6) goto L6e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r3 = kotlin.jvm.internal.m.a(r3, r5)
            if (r3 == 0) goto L6e
            I0.s r3 = I0.h.f2242l
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L5c
            r2 = r4
        L5c:
            I0.a r2 = (I0.a) r2
            if (r2 == 0) goto L6e
            m5.e r2 = r2.f2222b
            B5.c r2 = (B5.c) r2
            if (r2 == 0) goto L6e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L6e:
            int r6 = r1.f2270g
            E0.c r2 = r0.f12487s
            if (r2 != 0) goto L77
        L74:
            r10 = r4
            goto L1bb
        L77:
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r3 >= r5) goto L7e
            goto L74
        L7e:
            C0.A r7 = r0.f12485q
            E0.a r7 = com.google.android.gms.internal.measurement.P1.B(r7)
            if (r7 != 0) goto L87
            goto L74
        L87:
            I0.m r8 = r1.j()
            int r9 = r1.f2270g
            if (r8 == 0) goto L99
            int r7 = r8.f2270g
            long r7 = (long) r7
            android.view.autofill.AutofillId r7 = r2.a(r7)
            if (r7 != 0) goto L9f
            goto L74
        L99:
            java.lang.Object r7 = r7.f1611a
            android.view.autofill.AutofillId r7 = C0.U.h(r7)
        L9f:
            long r10 = (long) r9
            if (r3 < r5) goto Lb2
            java.lang.Object r2 = r2.f1612a
            android.view.contentcapture.ContentCaptureSession r2 = A3.a.g(r2)
            android.view.ViewStructure r2 = E0.b.c(r2, r7, r10)
            k3.c r3 = new k3.c
            r3.<init>(r2)
            goto Lb3
        Lb2:
            r3 = r4
        Lb3:
            if (r3 != 0) goto Lb6
            goto L74
        Lb6:
            java.lang.Object r2 = r3.f14120q
            r10 = r2
            android.view.ViewStructure r10 = (android.view.ViewStructure) r10
            I0.i r2 = r1.f2268d
            I0.s r5 = I0.p.f2297G
            r.G r7 = r2.f2257q
            boolean r5 = r7.c(r5)
            if (r5 == 0) goto Lc8
            goto L74
        Lc8:
            android.os.Bundle r5 = r10.getExtras()
            if (r5 == 0) goto Ldc
            java.lang.String r8 = "android.view.contentcapture.EventTimestamp"
            long r11 = r0.f12480A
            r5.putLong(r8, r11)
            java.lang.String r8 = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"
            r11 = r18
            r5.putInt(r8, r11)
        Ldc:
            I0.s r5 = I0.p.f2321w
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto Le5
            r5 = r4
        Le5:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto Lec
            r10.setId(r9, r4, r4, r5)
        Lec:
            I0.s r5 = I0.p.f2311m
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto Lf5
            r5 = r4
        Lf5:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto Lfe
            java.lang.String r5 = "android.widget.ViewGroup"
            r10.setClassName(r5)
        Lfe:
            I0.s r5 = I0.p.f2323y
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto L107
            r5 = r4
        L107:
            java.util.List r5 = (java.util.List) r5
            r8 = 62
            java.lang.String r9 = "\n"
            if (r5 == 0) goto L11b
            java.lang.String r11 = "android.widget.TextView"
            r10.setClassName(r11)
            java.lang.String r5 = Y0.a.a(r8, r9, r5)
            r10.setText(r5)
        L11b:
            I0.s r5 = I0.p.f2293C
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto L124
            r5 = r4
        L124:
            L0.d r5 = (L0.C0192d) r5
            if (r5 == 0) goto L130
            java.lang.String r11 = "android.widget.EditText"
            r10.setClassName(r11)
            r10.setText(r5)
        L130:
            I0.s r5 = I0.p.f2302a
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto L139
            r5 = r4
        L139:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L144
            java.lang.String r5 = Y0.a.a(r8, r9, r5)
            r10.setContentDescription(r5)
        L144:
            I0.s r5 = I0.p.f2320v
            java.lang.Object r5 = r7.g(r5)
            if (r5 != 0) goto L14d
            r5 = r4
        L14d:
            I0.f r5 = (I0.f) r5
            if (r5 == 0) goto L15c
            int r5 = r5.f2230a
            java.lang.String r5 = C0.W.r(r5)
            if (r5 == 0) goto L15c
            r10.setClassName(r5)
        L15c:
            L0.C r2 = C0.W.h(r2)
            if (r2 == 0) goto L17e
            L0.B r2 = r2.f3078a
            L0.F r5 = r2.f3072b
            W0.c r2 = r2.f3076g
            L0.y r5 = r5.f3091a
            long r7 = r5.f3228b
            float r5 = W0.n.c(r7)
            float r7 = r2.b()
            float r7 = r7 * r5
            float r2 = r2.l()
            float r2 = r2 * r7
            r5 = 0
            r10.setTextStyle(r2, r5, r5, r5)
        L17e:
            I0.m r2 = r1.j()
            i0.c r5 = i0.C1131c.f13521e
            if (r2 != 0) goto L187
            goto L1a5
        L187:
            B0.n0 r7 = r1.c()
            if (r7 == 0) goto L1a5
            c0.l r8 = r7.B0()
            boolean r8 = r8.f10099D
            if (r8 == 0) goto L196
            r4 = r7
        L196:
            if (r4 == 0) goto L1a5
            c0.l r2 = r2.f2265a
            r5 = 8
            B0.n0 r2 = B0.AbstractC0041g.s(r2, r5)
            r5 = 1
            i0.c r5 = r2.I(r4, r5)
        L1a5:
            float r2 = r5.f13522a
            int r11 = (int) r2
            float r4 = r5.f13523b
            int r12 = (int) r4
            float r7 = r5.f13524c
            float r7 = r7 - r2
            int r15 = (int) r7
            float r2 = r5.f13525d
            float r2 = r2 - r4
            int r2 = (int) r2
            r13 = 0
            r14 = 0
            r16 = r2
            r10.setDimens(r11, r12, r13, r14, r15, r16)
            r10 = r3
        L1bb:
            if (r10 != 0) goto L1be
            goto L1cc
        L1be:
            e0.d r5 = new e0.d
            long r7 = r0.f12480A
            e0.e r9 = e0.EnumC1020e.f12499q
            r5.<init>(r6, r7, r9, r10)
            java.util.ArrayList r2 = r0.f12488t
            r2.add(r5)
        L1cc:
            A.e0 r2 = new A.e0
            r3 = 14
            r2.<init>(r3, r0)
            r0.g(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.ViewOnAttachStateChangeListenerC1018c.m(int, I0.m):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void n(InterfaceC0660x interfaceC0660x) {
        this.f12487s = (E0.c) this.f12486r.invoke();
        m(-1, this.f12485q.getSemanticsOwner().a());
        j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(I0.m mVar) {
        if (i()) {
            this.f12488t.add(new C1019d(mVar.f2270g, this.f12480A, EnumC1020e.f12500r, null));
            List listH = I0.m.h(4, mVar);
            int size = listH.size();
            for (int i = 0; i < size; i++) {
                o((I0.m) listH.get(i));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f12493y.removeCallbacks(this.f12484E);
        this.f12487s = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void v(InterfaceC0660x interfaceC0660x) {
        o(this.f12485q.getSemanticsOwner().a());
        j();
        this.f12487s = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
