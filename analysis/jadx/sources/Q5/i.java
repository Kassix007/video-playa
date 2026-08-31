package Q5;

import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC0397h f6619t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(InterfaceC0397h interfaceC0397h, InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        super(interfaceC1529h, i, aVar);
        this.f6619t = interfaceC0397h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final Object c(O5.t tVar, InterfaceC1524c interfaceC1524c) {
        Object objG = g(new B(tVar), interfaceC1524c);
        return objG == EnumC1580a.f16356q ? objG : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // Q5.g, P5.InterfaceC0397h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(P5.InterfaceC0398i r7, q5.InterfaceC1524c r8) {
        /*
            r6 = this;
            int r0 = r6.f6614r
            r1 = -3
            r5.a r2 = r5.EnumC1580a.f16356q
            if (r0 != r1) goto L6d
            q5.h r0 = r8.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            M5.q r3 = new M5.q
            r4 = 0
            r5 = 0
            r3.<init>(r4, r5)
            q5.h r4 = r6.f6613q
            java.lang.Object r1 = r4.fold(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
            q5.h r1 = r0.plus(r4)
            goto L2c
        L27:
            r1 = 0
            q5.h r1 = M5.AbstractC0263y.j(r0, r4, r1)
        L2c:
            boolean r3 = kotlin.jvm.internal.m.a(r1, r0)
            if (r3 == 0) goto L39
            java.lang.Object r7 = r6.g(r7, r8)
            if (r7 != r2) goto L74
            return r7
        L39:
            q5.d r3 = q5.C1525d.f16021q
            q5.f r4 = r1.get(r3)
            q5.f r0 = r0.get(r3)
            boolean r0 = kotlin.jvm.internal.m.a(r4, r0)
            if (r0 == 0) goto L6d
            q5.h r0 = r8.getContext()
            boolean r3 = r7 instanceof Q5.B
            if (r3 != 0) goto L5c
            boolean r3 = r7 instanceof Q5.x
            if (r3 == 0) goto L56
            goto L5c
        L56:
            N.f r3 = new N.f
            r3.<init>(r7, r0)
            r7 = r3
        L5c:
            Q5.h r0 = new Q5.h
            r3 = 0
            r0.<init>(r6, r3)
            java.lang.Object r3 = R5.b.m(r1)
            java.lang.Object r7 = Q5.AbstractC0423c.b(r1, r7, r3, r0, r8)
            if (r7 != r2) goto L74
            return r7
        L6d:
            java.lang.Object r7 = super.collect(r7, r8)
            if (r7 != r2) goto L74
            return r7
        L74:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.i.collect(P5.i, q5.c):java.lang.Object");
    }

    public abstract Object g(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final String toString() {
        return this.f6619t + " -> " + super.toString();
    }
}
