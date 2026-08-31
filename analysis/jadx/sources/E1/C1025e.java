package e1;

import d1.C0953d;
import g1.C1076f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import n5.t;
import q6.x;

/* JADX INFO: renamed from: e1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1025e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12511a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12515e;
    public Serializable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f12516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f12517h;
    public Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1025e() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(C1026f c1026f, int i, ArrayList arrayList, C1032l c1032l) {
        AbstractC1035o abstractC1035o = c1026f.f12521d;
        C1032l c1032l2 = abstractC1035o.f12541c;
        C1026f c1026f2 = abstractC1035o.i;
        C1026f c1026f3 = abstractC1035o.f12545h;
        if (c1032l2 == null) {
            d1.e eVar = (d1.e) this.f12514d;
            if (abstractC1035o == eVar.f11856d || abstractC1035o == eVar.f11858e) {
                return;
            }
            if (c1032l == null) {
                c1032l = new C1032l();
                c1032l.f12530a = null;
                c1032l.f12531b = new ArrayList();
                c1032l.f12530a = abstractC1035o;
                arrayList.add(c1032l);
            }
            abstractC1035o.f12541c = c1032l;
            c1032l.f12531b.add(abstractC1035o);
            ArrayList arrayList2 = c1026f3.f12525k;
            int size = arrayList2.size();
            int i7 = 0;
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList2.get(i8);
                i8++;
                InterfaceC1024d interfaceC1024d = (InterfaceC1024d) obj;
                if (interfaceC1024d instanceof C1026f) {
                    a((C1026f) interfaceC1024d, i, arrayList, c1032l);
                }
            }
            ArrayList arrayList3 = c1026f2.f12525k;
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList3.get(i9);
                i9++;
                InterfaceC1024d interfaceC1024d2 = (InterfaceC1024d) obj2;
                if (interfaceC1024d2 instanceof C1026f) {
                    a((C1026f) interfaceC1024d2, i, arrayList, c1032l);
                }
            }
            if (i == 1 && (abstractC1035o instanceof C1033m)) {
                ArrayList arrayList4 = ((C1033m) abstractC1035o).f12532k.f12525k;
                int size3 = arrayList4.size();
                int i10 = 0;
                while (i10 < size3) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    InterfaceC1024d interfaceC1024d3 = (InterfaceC1024d) obj3;
                    if (interfaceC1024d3 instanceof C1026f) {
                        a((C1026f) interfaceC1024d3, i, arrayList, c1032l);
                    }
                }
            }
            ArrayList arrayList5 = c1026f3.f12526l;
            int size4 = arrayList5.size();
            int i11 = 0;
            while (i11 < size4) {
                Object obj4 = arrayList5.get(i11);
                i11++;
                a((C1026f) obj4, i, arrayList, c1032l);
            }
            ArrayList arrayList6 = c1026f2.f12526l;
            int size5 = arrayList6.size();
            int i12 = 0;
            while (i12 < size5) {
                Object obj5 = arrayList6.get(i12);
                i12++;
                a((C1026f) obj5, i, arrayList, c1032l);
            }
            if (i == 1 && (abstractC1035o instanceof C1033m)) {
                ArrayList arrayList7 = ((C1033m) abstractC1035o).f12532k.f12526l;
                int size6 = arrayList7.size();
                while (i7 < size6) {
                    Object obj6 = arrayList7.get(i7);
                    i7++;
                    a((C1026f) obj6, i, arrayList, c1032l);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(d1.e r25) {
        /*
            r24 = this;
            r0 = r25
            java.util.ArrayList r1 = r0.f11900q0
            int[] r2 = r0.f11878p0
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        Lc:
            if (r5 >= r3) goto L35b
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            r12 = r6
            d1.d r12 = (d1.C0953d) r12
            int[] r6 = r12.f11878p0
            d1.c[] r7 = r12.f11840Q
            d1.c r8 = r12.f11835L
            d1.c r9 = r12.f11833J
            d1.c r10 = r12.f11834K
            d1.c r11 = r12.f11832I
            r13 = r6[r4]
            r14 = 1
            r6 = r6[r14]
            int r15 = r12.f11862g0
            r16 = r4
            r4 = 8
            if (r15 != r4) goto L35
            r12.f11850a = r14
            r4 = r16
            goto Lc
        L35:
            float r4 = r12.f11885w
            r15 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            r18 = r15
            r15 = 3
            r14 = 2
            if (r17 >= 0) goto L45
            if (r13 != r15) goto L45
            r12.f11880r = r14
        L45:
            float r14 = r12.f11888z
            int r19 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r19 >= 0) goto L50
            if (r6 != r15) goto L50
            r15 = 2
            r12.f11881s = r15
        L50:
            float r15 = r12.f11846W
            r20 = 0
            int r15 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            r0 = 1
            if (r15 <= 0) goto L85
            r15 = 3
            if (r13 != r15) goto L68
            r15 = 2
            if (r6 == r15) goto L61
            if (r6 != r0) goto L63
        L61:
            r0 = 3
            goto L65
        L63:
            r0 = 3
            goto L6a
        L65:
            r12.f11880r = r0
            goto L86
        L68:
            r0 = r15
            r15 = 2
        L6a:
            if (r6 != r0) goto L74
            if (r13 == r15) goto L71
            r15 = 1
            if (r13 != r15) goto L74
        L71:
            r12.f11881s = r0
            goto L86
        L74:
            if (r13 != r0) goto L86
            if (r6 != r0) goto L86
            int r15 = r12.f11880r
            if (r15 != 0) goto L7e
            r12.f11880r = r0
        L7e:
            int r15 = r12.f11881s
            if (r15 != 0) goto L86
            r12.f11881s = r0
            goto L86
        L85:
            r0 = 3
        L86:
            if (r13 != r0) goto L96
            int r0 = r12.f11880r
            r15 = 1
            if (r0 != r15) goto L96
            d1.c r0 = r11.f
            if (r0 == 0) goto L95
            d1.c r0 = r10.f
            if (r0 != 0) goto L96
        L95:
            r13 = 2
        L96:
            r15 = 3
            if (r6 != r15) goto La7
            int r0 = r12.f11881s
            r15 = 1
            if (r0 != r15) goto La7
            d1.c r0 = r9.f
            if (r0 == 0) goto La6
            d1.c r0 = r8.f
            if (r0 != 0) goto La7
        La6:
            r6 = 2
        La7:
            e1.k r0 = r12.f11856d
            r0.f12542d = r13
            int r15 = r12.f11880r
            r0.f12539a = r15
            e1.m r0 = r12.f11858e
            r0.f12542d = r6
            r22 = r1
            int r1 = r12.f11881s
            r0.f12539a = r1
            r0 = 4
            if (r13 == r0) goto Lc2
            r0 = 1
            if (r13 == r0) goto Lc2
            r0 = 2
            if (r13 != r0) goto Ld1
        Lc2:
            r0 = 4
            if (r6 == r0) goto Lcb
            r0 = 1
            if (r6 == r0) goto L306
            r0 = 2
            if (r6 != r0) goto Ld1
        Lcb:
            r7 = r6
            r0 = r13
            r21 = 1
            goto L30a
        Ld1:
            r20 = 1056964608(0x3f000000, float:0.5)
            r8 = 3
            if (r13 != r8) goto L1b4
            if (r6 == r0) goto Le8
            r10 = 1
            if (r6 != r10) goto Ldc
            goto Le8
        Ldc:
            r23 = r8
            r8 = r0
            r0 = r23
            r23 = r10
            r10 = r6
            r6 = r23
            goto L1b8
        Le8:
            if (r15 != r8) goto L12c
            if (r6 != r0) goto Lf5
            r9 = 0
            r11 = 0
            r10 = r0
            r7 = r24
            r8 = r0
            r7.f(r8, r9, r10, r11, r12)
        Lf5:
            int r11 = r12.k()
            float r0 = (float) r11
            float r1 = r12.f11846W
            float r0 = r0 * r1
            float r0 = r0 + r20
            int r9 = (int) r0
            r21 = 1
            r10 = r21
            r7 = r24
            r8 = r21
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.d(r1)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.d(r1)
            r0 = 1
            r12.f11850a = r0
        L124:
            r0 = r25
            r4 = r16
            r1 = r22
            goto Lc
        L12c:
            r8 = r0
            r0 = 1
            r10 = 1
            if (r15 != r0) goto L144
            r9 = 0
            r11 = 0
            r7 = r24
            r10 = r6
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.f12527m = r1
            goto L124
        L144:
            r0 = 2
            if (r15 != r0) goto L182
            r0 = r2[r16]
            if (r0 == r10) goto L154
            r9 = 4
            if (r0 != r9) goto L14f
            goto L154
        L14f:
            r0 = r10
            r10 = r6
            r6 = r0
        L152:
            r0 = 3
            goto L1b8
        L154:
            int r0 = r25.q()
            float r0 = (float) r0
            float r4 = r4 * r0
            float r4 = r4 + r20
            int r9 = (int) r4
            int r11 = r12.k()
            r7 = r24
            r8 = r10
            r10 = r6
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.d(r1)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.d(r1)
            r0 = 1
            r12.f11850a = r0
            goto L124
        L182:
            r0 = r10
            r10 = r6
            r6 = r0
            r0 = 1
            r9 = r7[r16]
            d1.c r9 = r9.f
            if (r9 == 0) goto L192
            r9 = r7[r0]
            d1.c r0 = r9.f
            if (r0 != 0) goto L152
        L192:
            r9 = 0
            r11 = 0
            r7 = r24
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.d(r1)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.d(r1)
            r15 = 1
            r12.f11850a = r15
            goto L124
        L1b4:
            r8 = r0
            r10 = r6
            r6 = 1
            goto L152
        L1b8:
            if (r10 != r0) goto L29a
            if (r13 == r8) goto L1c7
            if (r13 != r6) goto L1bf
            goto L1c7
        L1bf:
            r9 = r0
            r7 = r10
            r0 = r13
            r10 = r8
        L1c3:
            r8 = r6
            r6 = 1
            goto L29f
        L1c7:
            if (r1 != r0) goto L207
            if (r13 != r8) goto L1d3
            r9 = 0
            r11 = 0
            r10 = r8
            r7 = r24
            r7.f(r8, r9, r10, r11, r12)
        L1d3:
            int r9 = r12.q()
            float r0 = r12.f11846W
            int r1 = r12.f11847X
            r4 = -1
            if (r1 != r4) goto L1e0
            float r0 = r18 / r0
        L1e0:
            float r1 = (float) r9
            float r1 = r1 * r0
            float r1 = r1 + r20
            int r11 = (int) r1
            r10 = r6
            r7 = r24
            r8 = r6
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.d(r1)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.d(r1)
            r0 = 1
            r12.f11850a = r0
            goto L124
        L207:
            r0 = 1
            if (r1 != r0) goto L21f
            r9 = 0
            r11 = 0
            r7 = r24
            r10 = r8
            r8 = r13
            r7.f(r8, r9, r10, r11, r12)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.f12527m = r1
            goto L124
        L21f:
            r11 = r8
            r8 = r13
            r9 = 2
            if (r1 != r9) goto L25f
            r7 = r2[r0]
            if (r7 == r6) goto L231
            r0 = 4
            if (r7 != r0) goto L22c
            goto L231
        L22c:
            r0 = r8
            r7 = r10
            r10 = r11
            r9 = 3
            goto L1c3
        L231:
            int r9 = r12.q()
            int r0 = r25.k()
            float r0 = (float) r0
            float r14 = r14 * r0
            float r14 = r14 + r20
            int r11 = (int) r14
            r7 = r24
            r10 = r6
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.d(r1)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.d(r1)
            r15 = 1
            r12.f11850a = r15
            goto L124
        L25f:
            r0 = r8
            r17 = r9
            r8 = r6
            r6 = r7[r17]
            d1.c r6 = r6.f
            if (r6 == 0) goto L277
            r19 = 3
            r6 = r7[r19]
            d1.c r6 = r6.f
            if (r6 != 0) goto L272
            goto L277
        L272:
            r7 = r10
            r10 = r11
        L274:
            r6 = 1
            r9 = 3
            goto L29f
        L277:
            r9 = 0
            r8 = r11
            r11 = 0
            r7 = r24
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.d(r1)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.d(r1)
            r6 = 1
            r12.f11850a = r6
            goto L124
        L29a:
            r7 = r10
            r0 = r13
            r10 = r8
            r8 = r6
            goto L274
        L29f:
            if (r0 != r9) goto L124
            if (r7 != r9) goto L124
            if (r15 == r6) goto L2e8
            if (r1 != r6) goto L2a8
            goto L2e8
        L2a8:
            r0 = 2
            if (r1 != r0) goto L124
            if (r15 != r0) goto L124
            r0 = r2[r16]
            if (r0 != r8) goto L124
            r0 = r2[r6]
            if (r0 != r8) goto L124
            int r0 = r25.q()
            float r0 = (float) r0
            float r4 = r4 * r0
            float r4 = r4 + r20
            int r9 = (int) r4
            int r0 = r25.k()
            float r0 = (float) r0
            float r14 = r14 * r0
            float r14 = r14 + r20
            int r11 = (int) r14
            r10 = r8
            r7 = r24
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.d(r1)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.d(r1)
            r15 = 1
            r12.f11850a = r15
            goto L124
        L2e8:
            r9 = 0
            r11 = 0
            r8 = r10
            r7 = r24
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.f12527m = r1
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.f12527m = r1
            goto L124
        L306:
            r21 = r0
            r7 = r6
            r0 = r13
        L30a:
            int r1 = r12.q()
            r4 = 4
            if (r0 != r4) goto L31e
            int r0 = r25.q()
            int r1 = r11.f11822g
            int r0 = r0 - r1
            int r1 = r10.f11822g
            int r1 = r0 - r1
            r0 = r21
        L31e:
            int r6 = r12.k()
            if (r7 != r4) goto L337
            int r4 = r25.k()
            int r6 = r9.f11822g
            int r4 = r4 - r6
            int r6 = r8.f11822g
            int r6 = r4 - r6
            r10 = r21
            r7 = r24
            r8 = r0
            r9 = r1
            r11 = r6
            goto L33d
        L337:
            r10 = r7
            r8 = r0
            r9 = r1
            r11 = r6
            r7 = r24
        L33d:
            r7.f(r8, r9, r10, r11, r12)
            e1.k r0 = r12.f11856d
            e1.g r0 = r0.f12543e
            int r1 = r12.q()
            r0.d(r1)
            e1.m r0 = r12.f11858e
            e1.g r0 = r0.f12543e
            int r1 = r12.k()
            r0.d(r1)
            r15 = 1
            r12.f11850a = r15
            goto L124
        L35b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1025e.b(d1.e):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        d1.e eVar = (d1.e) this.f12514d;
        ArrayList arrayList = (ArrayList) this.f12516g;
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        d1.e eVar2 = (d1.e) this.f12515e;
        eVar2.f11856d.f();
        eVar2.f11858e.f();
        arrayList2.add(eVar2.f11856d);
        arrayList2.add(eVar2.f11858e);
        ArrayList arrayList3 = eVar2.f11900q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C0953d c0953d = (C0953d) obj;
            if (c0953d instanceof d1.h) {
                C1029i c1029i = new C1029i(c0953d);
                c0953d.f11856d.f();
                c0953d.f11858e.f();
                c1029i.f = ((d1.h) c0953d).f11963u0;
                arrayList2.add(c1029i);
            } else {
                if (c0953d.x()) {
                    if (c0953d.f11852b == null) {
                        c0953d.f11852b = new C1023c(c0953d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0953d.f11852b);
                } else {
                    arrayList2.add(c0953d.f11856d);
                }
                if (c0953d.y()) {
                    if (c0953d.f11854c == null) {
                        c0953d.f11854c = new C1023c(c0953d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0953d.f11854c);
                } else {
                    arrayList2.add(c0953d.f11858e);
                }
                if (c0953d instanceof d1.i) {
                    arrayList2.add(new C1030j(c0953d));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ((AbstractC1035o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            AbstractC1035o abstractC1035o = (AbstractC1035o) obj3;
            if (abstractC1035o.f12540b != eVar2) {
                abstractC1035o.d();
            }
        }
        arrayList.clear();
        e(eVar.f11856d, 0, arrayList);
        e(eVar.f11858e, 1, arrayList);
        this.f12512b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int d(d1.e eVar, int i) {
        ArrayList arrayList;
        int i7;
        long jMax;
        float f;
        d1.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f12516g;
        int size = arrayList2.size();
        long j = 0;
        int i8 = 0;
        long jMax2 = 0;
        while (i8 < size) {
            AbstractC1035o abstractC1035o = ((C1032l) arrayList2.get(i8)).f12530a;
            if (!(abstractC1035o instanceof C1023c) ? !(i != 0 ? (abstractC1035o instanceof C1033m) : (abstractC1035o instanceof C1031k)) : ((C1023c) abstractC1035o).f != i) {
                C1026f c1026f = (i == 0 ? eVar2.f11856d : eVar2.f11858e).f12545h;
                C1026f c1026f2 = (i == 0 ? eVar2.f11856d : eVar2.f11858e).i;
                C1026f c1026f3 = abstractC1035o.f12545h;
                C1026f c1026f4 = abstractC1035o.i;
                boolean zContains = c1026f3.f12526l.contains(c1026f);
                boolean zContains2 = c1026f4.f12526l.contains(c1026f2);
                long j7 = abstractC1035o.j();
                if (zContains && zContains2) {
                    long jB = C1032l.b(c1026f3, j);
                    long jA = C1032l.a(c1026f4, j);
                    long j8 = jB - j7;
                    int i9 = c1026f4.f;
                    arrayList = arrayList2;
                    i7 = size;
                    if (j8 >= (-i9)) {
                        j8 += (long) i9;
                    }
                    long j9 = c1026f3.f;
                    long j10 = ((-jA) - j7) - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    C0953d c0953d = abstractC1035o.f12540b;
                    if (i == 0) {
                        f = c0953d.f11857d0;
                    } else if (i == 1) {
                        f = c0953d.f11859e0;
                    } else {
                        c0953d.getClass();
                        f = -1.0f;
                    }
                    float f7 = f > 0.0f ? (long) ((j8 / (1.0f - f)) + (j10 / f)) : 0L;
                    jMax = (((long) c1026f3.f) + ((((long) ((f7 * f) + 0.5f)) + j7) + ((long) k1.i.a(1.0f, f, f7, 0.5f)))) - ((long) c1026f4.f);
                } else {
                    arrayList = arrayList2;
                    i7 = size;
                    jMax = zContains ? Math.max(C1032l.b(c1026f3, c1026f3.f), ((long) c1026f3.f) + j7) : zContains2 ? Math.max(-C1032l.a(c1026f4, c1026f4.f), ((long) (-c1026f4.f)) + j7) : (abstractC1035o.j() + ((long) c1026f3.f)) - ((long) c1026f4.f);
                }
            } else {
                arrayList = arrayList2;
                i7 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i8++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i7;
            j = 0;
        }
        return (int) jMax2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(AbstractC1035o abstractC1035o, int i, ArrayList arrayList) {
        C1026f c1026f = abstractC1035o.f12545h;
        C1026f c1026f2 = abstractC1035o.i;
        ArrayList arrayList2 = c1026f.f12525k;
        int size = arrayList2.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList2.get(i8);
            i8++;
            InterfaceC1024d interfaceC1024d = (InterfaceC1024d) obj;
            if (interfaceC1024d instanceof C1026f) {
                a((C1026f) interfaceC1024d, i, arrayList, null);
            } else if (interfaceC1024d instanceof AbstractC1035o) {
                a(((AbstractC1035o) interfaceC1024d).f12545h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = c1026f2.f12525k;
        int size2 = arrayList3.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList3.get(i9);
            i9++;
            InterfaceC1024d interfaceC1024d2 = (InterfaceC1024d) obj2;
            if (interfaceC1024d2 instanceof C1026f) {
                a((C1026f) interfaceC1024d2, i, arrayList, null);
            } else if (interfaceC1024d2 instanceof AbstractC1035o) {
                a(((AbstractC1035o) interfaceC1024d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((C1033m) abstractC1035o).f12532k.f12525k;
            int size3 = arrayList4.size();
            while (i7 < size3) {
                Object obj3 = arrayList4.get(i7);
                i7++;
                InterfaceC1024d interfaceC1024d3 = (InterfaceC1024d) obj3;
                if (interfaceC1024d3 instanceof C1026f) {
                    a((C1026f) interfaceC1024d3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(int i, int i7, int i8, int i9, C0953d c0953d) {
        C1022b c1022b = (C1022b) this.i;
        c1022b.f12502a = i;
        c1022b.f12503b = i8;
        c1022b.f12504c = i7;
        c1022b.f12505d = i9;
        ((C1076f) this.f12517h).b(c0953d, c1022b);
        c0953d.O(c1022b.f12506e);
        c0953d.L(c1022b.f);
        c0953d.f11828E = c1022b.f12508h;
        c0953d.I(c1022b.f12507g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g() {
        C1021a c1021a;
        C1025e c1025e = this;
        ArrayList arrayList = ((d1.e) c1025e.f12514d).f11900q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i7 = i + 1;
            C0953d c0953d = (C0953d) arrayList.get(i);
            if (!c0953d.f11850a) {
                int[] iArr = c0953d.f11878p0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = c0953d.f11880r;
                int i11 = c0953d.f11881s;
                boolean z5 = i8 == 2 || (i8 == 3 && i10 == 1);
                boolean z6 = i9 == 2 || (i9 == 3 && i11 == 1);
                C1027g c1027g = c0953d.f11856d.f12543e;
                boolean z7 = c1027g.j;
                C1027g c1027g2 = c0953d.f11858e.f12543e;
                boolean z8 = c1027g2.j;
                boolean z9 = z5;
                if (z7 && z8) {
                    c1025e.f(1, c1027g.f12523g, 1, c1027g2.f12523g, c0953d);
                    c0953d.f11850a = true;
                } else if (z7 && z6) {
                    f(1, c1027g.f12523g, 2, c1027g2.f12523g, c0953d);
                    if (i9 == 3) {
                        c0953d.f11858e.f12543e.f12527m = c0953d.k();
                    } else {
                        c0953d.f11858e.f12543e.d(c0953d.k());
                        c0953d.f11850a = true;
                    }
                } else if (z8 && z9) {
                    f(2, c1027g.f12523g, 1, c1027g2.f12523g, c0953d);
                    if (i8 == 3) {
                        c0953d.f11856d.f12543e.f12527m = c0953d.q();
                    } else {
                        c0953d.f11856d.f12543e.d(c0953d.q());
                        c0953d.f11850a = true;
                    }
                }
                if (c0953d.f11850a && (c1021a = c0953d.f11858e.f12533l) != null) {
                    c1021a.d(c0953d.f11851a0);
                }
                c1025e = this;
            }
            i = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f12511a) {
            case 1:
                Map map = (Map) this.i;
                Long l7 = (Long) this.f12517h;
                Long l8 = (Long) this.f12516g;
                Long l9 = (Long) this.f;
                Long l10 = (Long) this.f12515e;
                ArrayList arrayList = new ArrayList();
                if (this.f12512b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f12513c) {
                    arrayList.add("isDirectory");
                }
                if (l10 != null) {
                    arrayList.add("byteCount=" + l10);
                }
                if (l9 != null) {
                    arrayList.add("createdAt=" + l9);
                }
                if (l8 != null) {
                    arrayList.add("lastModifiedAt=" + l8);
                }
                if (l7 != null) {
                    arrayList.add("lastAccessedAt=" + l7);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return n5.l.q0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1025e(boolean z5, boolean z6, x xVar, Long l7, Long l8, Long l9, Long l10, Map extras) {
        kotlin.jvm.internal.m.e(extras, "extras");
        this.f12512b = z5;
        this.f12513c = z6;
        this.f12514d = xVar;
        this.f12515e = l7;
        this.f = l8;
        this.f12516g = l9;
        this.f12517h = l10;
        this.i = n5.x.O(extras);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r11v0 boolean)
  (r12v0 boolean)
  (r13v0 q6.x)
  (r14v0 java.lang.Long)
  (r15v0 java.lang.Long)
  (r16v0 java.lang.Long)
  (r17v0 java.lang.Long)
  (wrap:n5.t:0x0003: SGET  A[WRAPPED] (LINE:11) n5.t.q n5.t)
 A[MD:(boolean, boolean, q6.x, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map):void (m)] (LINE:12) call: e1.e.<init>(boolean, boolean, q6.x, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map):void type: THIS */
    public /* synthetic */ C1025e(boolean z5, boolean z6, x xVar, Long l7, Long l8, Long l9, Long l10) {
        this(z5, z6, xVar, l7, l8, l9, l10, t.f15300q);
    }
}
