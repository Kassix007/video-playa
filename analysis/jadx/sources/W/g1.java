package w;

import M5.AbstractC0263y;
import M5.EnumC0262x;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.InterfaceC1746o;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3.u f17975a = new e3.u(3, null, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[LOOP:0: B:19:0x004e->B:20:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(v0.y r7, s5.a r8) {
        /*
            boolean r0 = r8 instanceof w.J0
            if (r0 == 0) goto L13
            r0 = r8
            w.J0 r0 = (w.J0) r0
            int r1 = r0.f17810s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17810s = r1
            goto L18
        L13:
            w.J0 r0 = new w.J0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17809r
            int r1 = r0.f17810s
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            v0.y r7 = r0.f17808q
            m5.AbstractC1362a.e(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            m5.AbstractC1362a.e(r8)
        L32:
            r0.f17808q = r7
            r0.f17810s = r2
            v0.g r8 = v0.EnumC1738g.f17455r
            java.lang.Object r8 = r7.a(r8, r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r8 != r1) goto L41
            return r1
        L41:
            v0.f r8 = (v0.C1737f) r8
            java.lang.Object r1 = r8.f17451a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = r4
        L4e:
            if (r5 >= r3) goto L5c
            java.lang.Object r6 = r1.get(r5)
            v0.l r6 = (v0.C1743l) r6
            r6.a()
            int r5 = r5 + 1
            goto L4e
        L5c:
            java.lang.Object r8 = r8.f17451a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
        L65:
            if (r4 >= r1) goto L75
            java.lang.Object r3 = r8.get(r4)
            v0.l r3 = (v0.C1743l) r3
            boolean r3 = r3.f17463d
            if (r3 == 0) goto L72
            goto L32
        L72:
            int r4 = r4 + 1
            goto L65
        L75:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w.g1.a(v0.y, s5.a):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(v0.y r9, boolean r10, v0.EnumC1738g r11, s5.a r12) {
        /*
            boolean r0 = r12 instanceof w.I0
            if (r0 == 0) goto L13
            r0 = r12
            w.I0 r0 = (w.I0) r0
            int r1 = r0.f17803u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17803u = r1
            goto L18
        L13:
            w.I0 r0 = new w.I0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f17802t
            int r1 = r0.f17803u
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r9 = r0.f17801s
            v0.g r10 = r0.f17800r
            v0.y r11 = r0.f17799q
            m5.AbstractC1362a.e(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            m5.AbstractC1362a.e(r12)
        L3a:
            r0.f17799q = r9
            r0.f17800r = r11
            r0.f17801s = r10
            r0.f17803u = r2
            java.lang.Object r12 = r9.a(r11, r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r12 != r1) goto L4b
            return r1
        L4b:
            v0.f r12 = (v0.C1737f) r12
            java.lang.Object r1 = r12.f17451a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = r4
        L58:
            if (r5 >= r3) goto L7f
            java.lang.Object r6 = r1.get(r5)
            v0.l r6 = (v0.C1743l) r6
            if (r10 == 0) goto L74
            boolean r7 = r6.b()
            if (r7 != 0) goto L72
            boolean r7 = r6.f17466h
            if (r7 != 0) goto L72
            boolean r6 = r6.f17463d
            if (r6 == 0) goto L72
            r6 = r2
            goto L78
        L72:
            r6 = r4
            goto L78
        L74:
            boolean r6 = v0.v.a(r6)
        L78:
            if (r6 != 0) goto L7c
            r1 = r4
            goto L80
        L7c:
            int r5 = r5 + 1
            goto L58
        L7f:
            r1 = r2
        L80:
            if (r1 == 0) goto L3a
            java.lang.Object r9 = r12.f17451a
            java.lang.Object r9 = r9.get(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w.g1.b(v0.y, boolean, v0.g, s5.a):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object d(InterfaceC1746o interfaceC1746o, B5.c cVar, B5.c cVar2, InterfaceC1524c interfaceC1524c, int i) {
        if ((i & 2) != 0) {
            cVar = null;
        }
        Object objG = AbstractC0263y.g(new b1(interfaceC1746o, f17975a, cVar, cVar2, null), interfaceC1524c);
        return objG == EnumC1580a.f16356q ? objG : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static M5.B e(InterfaceC0261w interfaceC0261w, InterfaceC0241b0 interfaceC0241b0, B5.e eVar) {
        return AbstractC0263y.t(interfaceC0261w, null, EnumC0262x.f3898t, new c1(interfaceC0241b0, eVar, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(v0.y r6, v0.EnumC1738g r7, s5.a r8) {
        /*
            boolean r0 = r8 instanceof w.d1
            if (r0 == 0) goto L13
            r0 = r8
            w.d1 r0 = (w.d1) r0
            int r1 = r0.f17950s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17950s = r1
            goto L18
        L13:
            w.d1 r0 = new w.d1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f17949r
            int r1 = r0.f17950s
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            kotlin.jvm.internal.y r6 = r0.f17948q
            m5.AbstractC1362a.e(r8)     // Catch: v0.C1739h -> L5a
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            m5.AbstractC1362a.e(r8)
            kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
            r8.<init>()
            w.L r1 = w.L.f17819a
            r8.f14268q = r1
            C0.b1 r1 = r6.e()     // Catch: v0.C1739h -> L5a
            long r3 = r1.b()     // Catch: v0.C1739h -> L5a
            w.e1 r1 = new w.e1     // Catch: v0.C1739h -> L5a
            r5 = 0
            r1.<init>(r7, r8, r5)     // Catch: v0.C1739h -> L5a
            r0.f17948q = r8     // Catch: v0.C1739h -> L5a
            r0.f17950s = r2     // Catch: v0.C1739h -> L5a
            java.lang.Object r6 = r6.h(r3, r1, r0)     // Catch: v0.C1739h -> L5a
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r6 != r7) goto L56
            return r7
        L56:
            r6 = r8
        L57:
            java.lang.Object r6 = r6.f14268q
            return r6
        L5a:
            w.N r6 = w.N.f17823a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w.g1.f(v0.y, v0.g, s5.a):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r15 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a4 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(v0.y r13, v0.EnumC1738g r14, s5.a r15) {
        /*
            boolean r0 = r15 instanceof w.f1
            if (r0 == 0) goto L13
            r0 = r15
            w.f1 r0 = (w.f1) r0
            int r1 = r0.f17968t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17968t = r1
            goto L18
        L13:
            w.f1 r0 = new w.f1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f17967s
            int r1 = r0.f17968t
            r2 = 2
            r3 = 0
            r4 = 1
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r2) goto L33
            v0.g r13 = r0.f17966r
            v0.y r14 = r0.f17965q
            m5.AbstractC1362a.e(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La7
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            v0.g r13 = r0.f17966r
            v0.y r14 = r0.f17965q
            m5.AbstractC1362a.e(r15)
            goto L56
        L43:
            m5.AbstractC1362a.e(r15)
        L46:
            r0.f17965q = r13
            r0.f17966r = r14
            r0.f17968t = r4
            java.lang.Object r15 = r13.a(r14, r0)
            if (r15 != r5) goto L53
            goto La6
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            v0.f r15 = (v0.C1737f) r15
            java.lang.Object r15 = r15.f17451a
            r1 = r15
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r6 = r3
        L62:
            if (r6 >= r1) goto Lc9
            java.lang.Object r7 = r15.get(r6)
            v0.l r7 = (v0.C1743l) r7
            boolean r7 = v0.v.b(r7)
            if (r7 != 0) goto Lc6
            r1 = r15
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r6 = r3
        L78:
            if (r6 >= r1) goto L98
            java.lang.Object r7 = r15.get(r6)
            v0.l r7 = (v0.C1743l) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lc1
            v0.A r8 = r14.f17509v
            long r8 = r8.f17434N
            long r10 = r14.c()
            boolean r7 = v0.v.e(r7, r8, r10)
            if (r7 == 0) goto L95
            goto Lc1
        L95:
            int r6 = r6 + 1
            goto L78
        L98:
            r0.f17965q = r14
            r0.f17966r = r13
            r0.f17968t = r2
            v0.g r15 = v0.EnumC1738g.f17456s
            java.lang.Object r15 = r14.a(r15, r0)
            if (r15 != r5) goto L2e
        La6:
            return r5
        La7:
            v0.f r15 = (v0.C1737f) r15
            java.lang.Object r15 = r15.f17451a
            r1 = r15
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r6 = r3
        Lb3:
            if (r6 >= r1) goto L46
            java.lang.Object r7 = r15.get(r6)
            v0.l r7 = (v0.C1743l) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lc3
        Lc1:
            r13 = 0
            return r13
        Lc3:
            int r6 = r6 + 1
            goto Lb3
        Lc6:
            int r6 = r6 + 1
            goto L62
        Lc9:
            java.lang.Object r13 = r15.get(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w.g1.g(v0.y, v0.g, s5.a):java.lang.Object");
    }
}
