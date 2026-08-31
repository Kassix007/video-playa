package androidx.compose.material3.internal;

import B5.e;
import N.b;
import N.r;
import c0.InterfaceC0725m;
import m5.C1386y;
import r5.EnumC1580a;
import s5.i;
import v.W;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(B5.a r4, B5.e r5, s5.c r6) {
        /*
            boolean r0 = r6 instanceof N.c
            if (r0 == 0) goto L13
            r0 = r6
            N.c r0 = (N.c) r0
            int r1 = r0.f3920r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3920r = r1
            goto L18
        L13:
            N.c r0 = new N.c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3919q
            int r1 = r0.f3920r
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            m5.AbstractC1362a.e(r6)     // Catch: N.C0265a -> L41
            goto L41
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            m5.AbstractC1362a.e(r6)
            N.g r6 = new N.g     // Catch: N.C0265a -> L41
            r1 = 0
            r6.<init>(r4, r5, r1)     // Catch: N.C0265a -> L41
            r0.f3920r = r2     // Catch: N.C0265a -> L41
            java.lang.Object r4 = M5.AbstractC0263y.g(r6, r0)     // Catch: N.C0265a -> L41
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r4 != r5) goto L41
            return r5
        L41:
            m5.y r4 = m5.C1386y.f15098a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.a.a(B5.a, B5.e, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object b(r rVar, Object obj, float f, i iVar) {
        Object objA = rVar.a(obj, W.f17278q, new b(rVar, f, null), iVar);
        return objA == EnumC1580a.f16356q ? objA : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0725m c(InterfaceC0725m interfaceC0725m, r rVar, e eVar) {
        return interfaceC0725m.d(new DraggableAnchorsElement(rVar, eVar));
    }
}
