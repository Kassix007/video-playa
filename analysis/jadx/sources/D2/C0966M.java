package d2;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w1.AbstractC1835K;
import w1.C1839b;

/* JADX INFO: renamed from: d2.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0966M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f12000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12003e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0965L f12004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f12005h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0966M(RecyclerView recyclerView) {
        this.f12005h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f11999a = arrayList;
        this.f12000b = null;
        this.f12001c = new ArrayList();
        this.f12002d = Collections.unmodifiableList(arrayList);
        this.f12003e = 2;
        this.f = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(AbstractC0974V abstractC0974V, boolean z5) {
        RecyclerView.j(abstractC0974V);
        View view = abstractC0974V.f12032a;
        RecyclerView recyclerView = this.f12005h;
        X x6 = recyclerView.f9667z0;
        if (x6 != null) {
            W w3 = x6.f12050e;
            AbstractC1835K.m(view, w3 != null ? (C1839b) w3.f12048e.remove(view) : null);
        }
        if (z5 && recyclerView.f9653s0 != null) {
            recyclerView.f9658v.E(abstractC0974V);
        }
        abstractC0974V.f12046r = null;
        C0965L c0965lC = c();
        c0965lC.getClass();
        int i = abstractC0974V.f;
        ArrayList arrayList = c0965lC.a(i).f11993a;
        if (((C0964K) c0965lC.f11997a.get(i)).f11994b <= arrayList.size()) {
            return;
        }
        abstractC0974V.m();
        arrayList.add(abstractC0974V);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(int i) {
        RecyclerView recyclerView = this.f12005h;
        if (i >= 0 && i < recyclerView.f9653s0.b()) {
            return !recyclerView.f9653s0.f12018g ? i : recyclerView.f9654t.i(i, 0);
        }
        StringBuilder sbL = k1.i.l("invalid position ", ". State item count is ", i);
        sbL.append(recyclerView.f9653s0.b());
        sbL.append(recyclerView.y());
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0965L c() {
        if (this.f12004g == null) {
            C0965L c0965l = new C0965L();
            c0965l.f11997a = new SparseArray();
            c0965l.f11998b = 0;
            this.f12004g = c0965l;
        }
        return this.f12004g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        ArrayList arrayList = this.f12001c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f9599I0;
        Q.J j = this.f12005h.f9651r0;
        int[] iArr2 = (int[]) j.f6479d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        j.f6478c = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        ArrayList arrayList = this.f12001c;
        a((AbstractC0974V) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(View view) {
        AbstractC0974V abstractC0974VI = RecyclerView.I(view);
        boolean zJ = abstractC0974VI.j();
        RecyclerView recyclerView = this.f12005h;
        if (zJ) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC0974VI.i()) {
            abstractC0974VI.f12042n.j(abstractC0974VI);
        } else if (abstractC0974VI.p()) {
            abstractC0974VI.j &= -33;
        }
        g(abstractC0974VI);
        if (recyclerView.f9632a0 == null || abstractC0974VI.g()) {
            return;
        }
        recyclerView.f9632a0.d(abstractC0974VI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(d2.AbstractC0974V r12) {
        /*
            r11 = this;
            boolean r0 = r12.i()
            android.view.View r1 = r12.f12032a
            r2 = 0
            r3 = 1
            androidx.recyclerview.widget.RecyclerView r4 = r11.f12005h
            if (r0 != 0) goto Lf0
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L14
            goto Lf0
        L14:
            boolean r0 = r12.j()
            if (r0 != 0) goto Ld5
            boolean r0 = r12.o()
            if (r0 != 0) goto Lbd
            int r0 = r12.j
            r0 = r0 & 16
            if (r0 != 0) goto L30
            java.util.WeakHashMap r0 = w1.AbstractC1835K.f18149a
            boolean r0 = r1.hasTransientState()
            if (r0 == 0) goto L30
            r0 = r3
            goto L31
        L30:
            r0 = r2
        L31:
            boolean r1 = r12.g()
            if (r1 == 0) goto Lad
            int r1 = r11.f
            if (r1 <= 0) goto La3
            int r1 = r12.j
            r1 = r1 & 526(0x20e, float:7.37E-43)
            if (r1 == 0) goto L42
            goto La3
        L42:
            java.util.ArrayList r1 = r11.f12001c
            int r5 = r1.size()
            int r6 = r11.f
            if (r5 < r6) goto L53
            if (r5 <= 0) goto L53
            r11.e(r2)
            int r5 = r5 + (-1)
        L53:
            int[] r6 = androidx.recyclerview.widget.RecyclerView.f9599I0
            if (r5 <= 0) goto L9e
            Q.J r6 = r4.f9651r0
            int r7 = r12.f12034c
            java.lang.Object r8 = r6.f6479d
            int[] r8 = (int[]) r8
            if (r8 == 0) goto L74
            int r8 = r6.f6478c
            int r8 = r8 * 2
            r9 = r2
        L66:
            if (r9 >= r8) goto L74
            java.lang.Object r10 = r6.f6479d
            int[] r10 = (int[]) r10
            r10 = r10[r9]
            if (r10 != r7) goto L71
            goto L9e
        L71:
            int r9 = r9 + 2
            goto L66
        L74:
            int r5 = r5 + (-1)
        L76:
            if (r5 < 0) goto L9d
            java.lang.Object r6 = r1.get(r5)
            d2.V r6 = (d2.AbstractC0974V) r6
            int r6 = r6.f12034c
            Q.J r7 = r4.f9651r0
            java.lang.Object r8 = r7.f6479d
            int[] r8 = (int[]) r8
            if (r8 == 0) goto L9d
            int r8 = r7.f6478c
            int r8 = r8 * 2
            r9 = r2
        L8d:
            if (r9 >= r8) goto L9d
            java.lang.Object r10 = r7.f6479d
            int[] r10 = (int[]) r10
            r10 = r10[r9]
            if (r10 != r6) goto L9a
            int r5 = r5 + (-1)
            goto L76
        L9a:
            int r9 = r9 + 2
            goto L8d
        L9d:
            int r5 = r5 + r3
        L9e:
            r1.add(r5, r12)
            r1 = r3
            goto La4
        La3:
            r1 = r2
        La4:
            if (r1 != 0) goto Lab
            r11.a(r12, r3)
        La9:
            r2 = r1
            goto Lae
        Lab:
            r3 = r2
            goto La9
        Lad:
            r3 = r2
        Lae:
            Z.m r1 = r4.f9658v
            r1.E(r12)
            if (r2 != 0) goto Lbc
            if (r3 != 0) goto Lbc
            if (r0 == 0) goto Lbc
            r0 = 0
            r12.f12046r = r0
        Lbc:
            return
        Lbd:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r0.<init>(r1)
            java.lang.String r1 = r4.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        Ld5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r4.y()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        Lf0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
            r5.<init>(r6)
            boolean r12 = r12.i()
            r5.append(r12)
            java.lang.String r12 = " isAttached:"
            r5.append(r12)
            android.view.ViewParent r12 = r1.getParent()
            if (r12 == 0) goto L10c
            r2 = r3
        L10c:
            r5.append(r2)
            java.lang.String r12 = r4.y()
            r5.append(r12)
            java.lang.String r12 = r5.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0966M.g(d2.V):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(View view) {
        AbstractC0957D abstractC0957D;
        AbstractC0974V abstractC0974VI = RecyclerView.I(view);
        int i = abstractC0974VI.j & 12;
        RecyclerView recyclerView = this.f12005h;
        if (i == 0 && abstractC0974VI.k() && (abstractC0957D = recyclerView.f9632a0) != null) {
            C0982h c0982h = (C0982h) abstractC0957D;
            if (abstractC0974VI.c().isEmpty() && c0982h.f12121g && !abstractC0974VI.f()) {
                if (this.f12000b == null) {
                    this.f12000b = new ArrayList();
                }
                abstractC0974VI.f12042n = this;
                abstractC0974VI.f12043o = true;
                this.f12000b.add(abstractC0974VI);
                return;
            }
        }
        if (abstractC0974VI.f() && !abstractC0974VI.h() && !recyclerView.f9602A.f12223b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        abstractC0974VI.f12042n = this;
        abstractC0974VI.f12043o = false;
        this.f11999a.add(abstractC0974VI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d2.AbstractC0974V i(int r28, long r29) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            androidx.recyclerview.widget.RecyclerView r2 = r1.f12005h
            d2.S r3 = r2.f9653s0
            if (r0 < 0) goto L547
            int r4 = r3.b()
            if (r0 >= r4) goto L547
            boolean r4 = r3.f12018g
            r5 = 32
            r8 = 0
            if (r4 == 0) goto L82
            java.util.ArrayList r4 = r1.f12000b
            if (r4 == 0) goto L7b
            int r4 = r4.size()
            if (r4 != 0) goto L22
            goto L7b
        L22:
            r9 = r8
        L23:
            if (r9 >= r4) goto L40
            java.util.ArrayList r10 = r1.f12000b
            java.lang.Object r10 = r10.get(r9)
            d2.V r10 = (d2.AbstractC0974V) r10
            boolean r11 = r10.p()
            if (r11 != 0) goto L3d
            int r11 = r10.b()
            if (r11 != r0) goto L3d
            r10.a(r5)
            goto L7c
        L3d:
            int r9 = r9 + 1
            goto L23
        L40:
            d2.z r9 = r2.f9602A
            boolean r9 = r9.f12223b
            if (r9 == 0) goto L7b
            L0.l r9 = r2.f9654t
            int r9 = r9.i(r0, r8)
            if (r9 <= 0) goto L7b
            d2.z r10 = r2.f9602A
            int r10 = r10.a()
            if (r9 >= r10) goto L7b
            d2.z r10 = r2.f9602A
            long r9 = r10.b(r9)
            r11 = r8
        L5d:
            if (r11 >= r4) goto L7b
            java.util.ArrayList r12 = r1.f12000b
            java.lang.Object r12 = r12.get(r11)
            d2.V r12 = (d2.AbstractC0974V) r12
            boolean r13 = r12.p()
            if (r13 != 0) goto L78
            long r13 = r12.f12036e
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L78
            r12.a(r5)
            r10 = r12
            goto L7c
        L78:
            int r11 = r11 + 1
            goto L5d
        L7b:
            r10 = 0
        L7c:
            if (r10 == 0) goto L80
            r4 = 1
            goto L84
        L80:
            r4 = r8
            goto L84
        L82:
            r4 = r8
            r10 = 0
        L84:
            java.util.ArrayList r9 = r1.f11999a
            java.util.ArrayList r11 = r1.f12001c
            if (r10 != 0) goto L231
            int r10 = r9.size()
            r12 = r8
        L8f:
            if (r12 >= r10) goto Lbe
            java.lang.Object r13 = r9.get(r12)
            d2.V r13 = (d2.AbstractC0974V) r13
            boolean r14 = r13.p()
            if (r14 != 0) goto Lbb
            int r14 = r13.b()
            if (r14 != r0) goto Lbb
            boolean r14 = r13.f()
            if (r14 != 0) goto Lbb
            boolean r14 = r3.f12018g
            if (r14 != 0) goto Lb3
            boolean r14 = r13.h()
            if (r14 != 0) goto Lbb
        Lb3:
            r13.a(r5)
            r10 = r13
            r16 = 1
            goto L1b1
        Lbb:
            int r12 = r12 + 1
            goto L8f
        Lbe:
            B0.G0 r10 = r2.f9656u
            java.lang.Object r10 = r10.f236t
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r12 = r10.size()
            r13 = r8
        Lc9:
            if (r13 >= r12) goto Led
            java.lang.Object r14 = r10.get(r13)
            android.view.View r14 = (android.view.View) r14
            d2.V r15 = androidx.recyclerview.widget.RecyclerView.I(r14)
            r16 = 1
            int r7 = r15.b()
            if (r7 != r0) goto Lea
            boolean r7 = r15.f()
            if (r7 != 0) goto Lea
            boolean r7 = r15.h()
            if (r7 != 0) goto Lea
            goto Lf0
        Lea:
            int r13 = r13 + 1
            goto Lc9
        Led:
            r16 = 1
            r14 = 0
        Lf0:
            if (r14 == 0) goto L189
            d2.V r7 = androidx.recyclerview.widget.RecyclerView.I(r14)
            B0.G0 r10 = r2.f9656u
            java.lang.Object r12 = r10.f235s
            O3.T r12 = (O3.T) r12
            java.lang.Object r13 = r10.f234r
            d2.y r13 = (d2.C0999y) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.f12221a
            int r13 = r13.indexOfChild(r14)
            if (r13 < 0) goto L175
            boolean r15 = r12.e(r13)
            if (r15 == 0) goto L161
            r12.b(r13)
            r10.Z(r14)
            B0.G0 r10 = r2.f9656u
            java.lang.Object r12 = r10.f235s
            O3.T r12 = (O3.T) r12
            java.lang.Object r10 = r10.f234r
            d2.y r10 = (d2.C0999y) r10
            androidx.recyclerview.widget.RecyclerView r10 = r10.f12221a
            int r10 = r10.indexOfChild(r14)
            r13 = -1
            if (r10 != r13) goto L129
        L127:
            r10 = r13
            goto L135
        L129:
            boolean r15 = r12.e(r10)
            if (r15 == 0) goto L130
            goto L127
        L130:
            int r12 = r12.c(r10)
            int r10 = r10 - r12
        L135:
            if (r10 == r13) goto L146
            B0.G0 r12 = r2.f9656u
            r12.q(r10)
            r1.h(r14)
            r10 = 8224(0x2020, float:1.1524E-41)
            r7.a(r10)
            r10 = r7
            goto L1b1
        L146:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "layout index should not be -1 after unhiding a view:"
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r2 = r2.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L161:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L175:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L189:
            int r7 = r11.size()
            r10 = r8
        L18e:
            if (r10 >= r7) goto L1b0
            java.lang.Object r12 = r11.get(r10)
            d2.V r12 = (d2.AbstractC0974V) r12
            boolean r13 = r12.f()
            if (r13 != 0) goto L1ad
            int r13 = r12.b()
            if (r13 != r0) goto L1ad
            boolean r13 = r12.d()
            if (r13 != 0) goto L1ad
            r11.remove(r10)
            r10 = r12
            goto L1b1
        L1ad:
            int r10 = r10 + 1
            goto L18e
        L1b0:
            r10 = 0
        L1b1:
            if (r10 == 0) goto L233
            boolean r7 = r10.h()
            if (r7 == 0) goto L1bc
            boolean r7 = r3.f12018g
            goto L1eb
        L1bc:
            int r7 = r10.f12034c
            if (r7 < 0) goto L216
            d2.z r12 = r2.f9602A
            int r12 = r12.a()
            if (r7 >= r12) goto L216
            boolean r7 = r3.f12018g
            if (r7 != 0) goto L1d7
            d2.z r7 = r2.f9602A
            r7.getClass()
            int r7 = r10.f
            if (r7 == 0) goto L1d7
        L1d5:
            r7 = r8
            goto L1eb
        L1d7:
            d2.z r7 = r2.f9602A
            boolean r12 = r7.f12223b
            if (r12 == 0) goto L1e9
            long r12 = r10.f12036e
            int r14 = r10.f12034c
            long r14 = r7.b(r14)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L1d5
        L1e9:
            r7 = r16
        L1eb:
            if (r7 != 0) goto L213
            r7 = 4
            r10.a(r7)
            boolean r7 = r10.i()
            if (r7 == 0) goto L202
            android.view.View r7 = r10.f12032a
            r2.removeDetachedView(r7, r8)
            d2.M r7 = r10.f12042n
            r7.j(r10)
            goto L20e
        L202:
            boolean r7 = r10.p()
            if (r7 == 0) goto L20e
            int r7 = r10.j
            r7 = r7 & (-33)
            r10.j = r7
        L20e:
            r1.g(r10)
            r10 = 0
            goto L233
        L213:
            r4 = r16
            goto L233
        L216:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Inconsistency detected. Invalid view holder adapter position"
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r2 = r2.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L231:
            r16 = 1
        L233:
            r17 = 0
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r10 != 0) goto L3e3
            L0.l r7 = r2.f9654t
            int r7 = r7.i(r0, r8)
            if (r7 < 0) goto L3b3
            r21 = 3
            d2.z r12 = r2.f9602A
            int r12 = r12.a()
            if (r7 >= r12) goto L3b3
            d2.z r12 = r2.f9602A
            r12.getClass()
            d2.z r12 = r2.f9602A
            boolean r13 = r12.f12223b
            if (r13 == 0) goto L2ef
            long r12 = r12.b(r7)
            int r10 = r9.size()
            int r10 = r10 + (-1)
        L263:
            if (r10 < 0) goto L2b7
            java.lang.Object r23 = r9.get(r10)
            r24 = 4
            r14 = r23
            d2.V r14 = (d2.AbstractC0974V) r14
            r23 = r7
            long r6 = r14.f12036e
            android.view.View r15 = r14.f12032a
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 != 0) goto L2b2
            boolean r6 = r14.p()
            if (r6 != 0) goto L2b2
            int r6 = r14.f
            if (r6 != 0) goto L29a
            r14.a(r5)
            boolean r5 = r14.h()
            if (r5 == 0) goto L298
            boolean r5 = r3.f12018g
            if (r5 != 0) goto L298
            int r5 = r14.j
            r5 = r5 & (-15)
            r5 = r5 | 2
            r14.j = r5
        L298:
            r10 = r14
            goto L2e6
        L29a:
            r9.remove(r10)
            r2.removeDetachedView(r15, r8)
            d2.V r6 = androidx.recyclerview.widget.RecyclerView.I(r15)
            r15 = 0
            r6.f12042n = r15
            r6.f12043o = r8
            int r7 = r6.j
            r7 = r7 & (-33)
            r6.j = r7
            r1.g(r6)
        L2b2:
            int r10 = r10 + (-1)
            r7 = r23
            goto L263
        L2b7:
            r23 = r7
            r24 = 4
            int r5 = r11.size()
            int r5 = r5 + (-1)
        L2c1:
            if (r5 < 0) goto L2e1
            java.lang.Object r6 = r11.get(r5)
            d2.V r6 = (d2.AbstractC0974V) r6
            long r9 = r6.f12036e
            int r7 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r7 != 0) goto L2e3
            boolean r7 = r6.d()
            if (r7 != 0) goto L2e3
            int r7 = r6.f
            if (r7 != 0) goto L2de
            r11.remove(r5)
            r10 = r6
            goto L2e6
        L2de:
            r1.e(r5)
        L2e1:
            r10 = 0
            goto L2e6
        L2e3:
            int r5 = r5 + (-1)
            goto L2c1
        L2e6:
            if (r10 == 0) goto L2f1
            r5 = r23
            r10.f12034c = r5
            r4 = r16
            goto L2f1
        L2ef:
            r24 = 4
        L2f1:
            if (r10 != 0) goto L334
            d2.L r5 = r1.c()
            android.util.SparseArray r5 = r5.f11997a
            java.lang.Object r5 = r5.get(r8)
            d2.K r5 = (d2.C0964K) r5
            if (r5 == 0) goto L329
            java.util.ArrayList r5 = r5.f11993a
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L329
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L30f:
            if (r6 < 0) goto L329
            java.lang.Object r7 = r5.get(r6)
            d2.V r7 = (d2.AbstractC0974V) r7
            boolean r7 = r7.d()
            if (r7 != 0) goto L326
            java.lang.Object r5 = r5.remove(r6)
            r26 = r5
            d2.V r26 = (d2.AbstractC0974V) r26
            goto L32b
        L326:
            int r6 = r6 + (-1)
            goto L30f
        L329:
            r26 = 0
        L32b:
            if (r26 == 0) goto L332
            r26.m()
            int[] r5 = androidx.recyclerview.widget.RecyclerView.f9599I0
        L332:
            r10 = r26
        L334:
            if (r10 != 0) goto L3b1
            long r5 = r2.getNanoTime()
            int r7 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r7 == 0) goto L358
            d2.L r7 = r1.f12004g
            d2.K r7 = r7.a(r8)
            long r9 = r7.f11995c
            int r7 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r7 == 0) goto L352
            long r9 = r9 + r5
            int r7 = (r9 > r29 ? 1 : (r9 == r29 ? 0 : -1))
            if (r7 >= 0) goto L350
            goto L352
        L350:
            r7 = r8
            goto L354
        L352:
            r7 = r16
        L354:
            if (r7 != 0) goto L358
            r15 = 0
            return r15
        L358:
            r15 = 0
            d2.z r7 = r2.f9602A
            r7.getClass()
            java.lang.String r9 = "RV CreateView"
            int r10 = r1.g.f16278a     // Catch: java.lang.Throwable -> L3a1
            android.os.Trace.beginSection(r9)     // Catch: java.lang.Throwable -> L3a1
            d2.V r10 = r7.d(r2)     // Catch: java.lang.Throwable -> L3a1
            android.view.View r7 = r10.f12032a     // Catch: java.lang.Throwable -> L3a1
            android.view.ViewParent r9 = r7.getParent()     // Catch: java.lang.Throwable -> L3a1
            if (r9 != 0) goto L3a3
            r10.f = r8     // Catch: java.lang.Throwable -> L3a1
            android.os.Trace.endSection()
            int[] r9 = androidx.recyclerview.widget.RecyclerView.f9599I0
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.D(r7)
            if (r7 == 0) goto L385
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r7)
            r10.f12033b = r9
        L385:
            long r11 = r2.getNanoTime()
            d2.L r7 = r1.f12004g
            long r11 = r11 - r5
            d2.K r5 = r7.a(r8)
            long r6 = r5.f11995c
            int r9 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r9 != 0) goto L397
            goto L39e
        L397:
            long r6 = r6 / r24
            long r6 = r6 * r21
            long r11 = r11 / r24
            long r11 = r11 + r6
        L39e:
            r5.f11995c = r11
            goto L3e8
        L3a1:
            r0 = move-exception
            goto L3ab
        L3a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a1
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3a1
            throw r0     // Catch: java.lang.Throwable -> L3a1
        L3ab:
            int r2 = r1.g.f16278a
            android.os.Trace.endSection()
            throw r0
        L3b1:
            r15 = 0
            goto L3e8
        L3b3:
            r5 = r7
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Inconsistency detected. Invalid item position "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = "(offset:"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ").state:"
            r6.append(r0)
            int r0 = r3.b()
            r6.append(r0)
            java.lang.String r0 = r2.y()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.<init>(r0)
            throw r4
        L3e3:
            r15 = 0
            r21 = 3
            r24 = 4
        L3e8:
            android.view.View r5 = r10.f12032a
            if (r4 == 0) goto L41a
            boolean r6 = r3.f12018g
            if (r6 != 0) goto L41a
            int r6 = r10.j
            r7 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L3f9
            r7 = r16
            goto L3fa
        L3f9:
            r7 = r8
        L3fa:
            if (r7 == 0) goto L41a
            r6 = r6 & (-8193(0xffffffffffffdfff, float:NaN))
            r10.j = r6
            boolean r6 = r3.j
            if (r6 == 0) goto L41a
            d2.AbstractC0957D.b(r10)
            d2.D r6 = r2.f9632a0
            r10.c()
            r6.getClass()
            M.t r6 = new M.t
            r6.<init>()
            r6.a(r10)
            r2.T(r10, r6)
        L41a:
            boolean r6 = r3.f12018g
            if (r6 == 0) goto L427
            boolean r6 = r10.e()
            if (r6 == 0) goto L427
            r10.f12037g = r0
            goto L440
        L427:
            boolean r6 = r10.e()
            if (r6 == 0) goto L445
            int r6 = r10.j
            r6 = r6 & 2
            if (r6 == 0) goto L436
            r6 = r16
            goto L437
        L436:
            r6 = r8
        L437:
            if (r6 != 0) goto L445
            boolean r6 = r10.f()
            if (r6 == 0) goto L440
            goto L445
        L440:
            r0 = r8
            r7 = r16
            goto L519
        L445:
            L0.l r6 = r2.f9654t
            int r6 = r6.i(r0, r8)
            r10.f12046r = r2
            int r7 = r10.f
            long r11 = r2.getNanoTime()
            int r9 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r9 == 0) goto L468
            d2.L r9 = r1.f12004g
            d2.K r7 = r9.a(r7)
            long r13 = r7.f11996d
            int r7 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r7 == 0) goto L468
            long r13 = r13 + r11
            int r7 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r7 >= 0) goto L440
        L468:
            d2.z r7 = r2.f9602A
            r7.getClass()
            r10.f12034c = r6
            boolean r9 = r7.f12223b
            if (r9 == 0) goto L479
            long r13 = r7.b(r6)
            r10.f12036e = r13
        L479:
            int r9 = r10.j
            r9 = r9 & (-520(0xfffffffffffffdf8, float:NaN))
            r9 = r9 | 1
            r10.j = r9
            int r9 = r1.g.f16278a
            java.lang.String r9 = "RV OnBindView"
            android.os.Trace.beginSection(r9)
            r10.c()
            r7.c(r10, r6)
            java.util.ArrayList r6 = r10.f12039k
            if (r6 == 0) goto L495
            r6.clear()
        L495:
            int r6 = r10.j
            r6 = r6 & (-1025(0xfffffffffffffbff, float:NaN))
            r10.j = r6
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            boolean r7 = r6 instanceof d2.C0961H
            if (r7 == 0) goto L4a9
            d2.H r6 = (d2.C0961H) r6
            r7 = r16
            r6.f11991c = r7
        L4a9:
            android.os.Trace.endSection()
            long r6 = r2.getNanoTime()
            d2.L r9 = r1.f12004g
            int r13 = r10.f
            long r6 = r6 - r11
            d2.K r9 = r9.a(r13)
            long r11 = r9.f11996d
            int r13 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r13 != 0) goto L4c0
            goto L4c7
        L4c0:
            long r11 = r11 / r24
            long r11 = r11 * r21
            long r6 = r6 / r24
            long r6 = r6 + r11
        L4c7:
            r9.f11996d = r6
            android.view.accessibility.AccessibilityManager r6 = r2.f9622N
            if (r6 == 0) goto L4d5
            boolean r6 = r6.isEnabled()
            if (r6 == 0) goto L4d5
            r7 = 1
            goto L4d6
        L4d5:
            r7 = r8
        L4d6:
            if (r7 == 0) goto L511
            java.util.WeakHashMap r6 = w1.AbstractC1835K.f18149a
            int r6 = r5.getImportantForAccessibility()
            r7 = 1
            if (r6 != 0) goto L4e4
            r5.setImportantForAccessibility(r7)
        L4e4:
            d2.X r6 = r2.f9667z0
            if (r6 != 0) goto L4e9
            goto L512
        L4e9:
            d2.W r6 = r6.f12050e
            if (r6 == 0) goto L50d
            android.view.View$AccessibilityDelegate r9 = w1.AbstractC1835K.d(r5)
            if (r9 != 0) goto L4f4
            goto L504
        L4f4:
            boolean r11 = r9 instanceof w1.C1838a
            if (r11 == 0) goto L4fe
            w1.a r9 = (w1.C1838a) r9
            w1.b r9 = r9.f18180a
            r15 = r9
            goto L504
        L4fe:
            w1.b r11 = new w1.b
            r11.<init>(r9)
            r15 = r11
        L504:
            if (r15 == 0) goto L50d
            if (r15 == r6) goto L50d
            java.util.WeakHashMap r9 = r6.f12048e
            r9.put(r5, r15)
        L50d:
            w1.AbstractC1835K.m(r5, r6)
            goto L512
        L511:
            r7 = 1
        L512:
            boolean r3 = r3.f12018g
            if (r3 == 0) goto L518
            r10.f12037g = r0
        L518:
            r0 = r7
        L519:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            if (r3 != 0) goto L529
            android.view.ViewGroup$LayoutParams r2 = r2.generateDefaultLayoutParams()
            d2.H r2 = (d2.C0961H) r2
            r5.setLayoutParams(r2)
            goto L53c
        L529:
            boolean r6 = r2.checkLayoutParams(r3)
            if (r6 != 0) goto L539
            android.view.ViewGroup$LayoutParams r2 = r2.generateLayoutParams(r3)
            d2.H r2 = (d2.C0961H) r2
            r5.setLayoutParams(r2)
            goto L53c
        L539:
            r2 = r3
            d2.H r2 = (d2.C0961H) r2
        L53c:
            r2.f11989a = r10
            if (r4 == 0) goto L543
            if (r0 == 0) goto L543
            goto L544
        L543:
            r7 = r8
        L544:
            r2.f11992d = r7
            return r10
        L547:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid item position "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = "("
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = "). Item count:"
            r5.append(r0)
            int r0 = r3.b()
            r5.append(r0)
            java.lang.String r0 = r2.y()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0966M.i(int, long):d2.V");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(AbstractC0974V abstractC0974V) {
        if (abstractC0974V.f12043o) {
            this.f12000b.remove(abstractC0974V);
        } else {
            this.f11999a.remove(abstractC0974V);
        }
        abstractC0974V.f12042n = null;
        abstractC0974V.f12043o = false;
        abstractC0974V.j &= -33;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        AbstractC0960G abstractC0960G = this.f12005h.f9604B;
        this.f = this.f12003e + (abstractC0960G != null ? abstractC0960G.j : 0);
        ArrayList arrayList = this.f12001c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            e(size);
        }
    }
}
