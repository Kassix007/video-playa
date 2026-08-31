package w;

import M5.C0247h;
import m0.C1346a;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.C1531j;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.C1731A;
import v0.InterfaceC1746o;

/* JADX INFO: renamed from: w.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1802p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1794l0 f18041a = new C1794l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1792k0 f18042b = new C1792k0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1796m0 f18043c = new C1796m0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final StackTraceElement[] f18044d = new StackTraceElement[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(w.H0 r9, long r10, s5.c r12) {
        /*
            boolean r0 = r12 instanceof w.C1798n0
            if (r0 == 0) goto L13
            r0 = r12
            w.n0 r0 = (w.C1798n0) r0
            int r1 = r0.f18033t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18033t = r1
            goto L18
        L13:
            w.n0 r0 = new w.n0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f18032s
            int r1 = r0.f18033t
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.jvm.internal.v r9 = r0.f18031r
            w.H0 r10 = r0.f18030q
            m5.AbstractC1362a.e(r12)
            r7 = r9
            r9 = r10
            goto L55
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            m5.AbstractC1362a.e(r12)
            kotlin.jvm.internal.v r7 = new kotlin.jvm.internal.v
            r7.<init>()
            w.o0 r3 = new w.o0
            r8 = 0
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r7, r8)
            r0.f18030q = r4
            r0.f18031r = r7
            r0.f18033t = r2
            v.W r9 = v.W.f17278q
            java.lang.Object r9 = r4.f(r9, r3, r0)
            r5.a r10 = r5.EnumC1580a.f16356q
            if (r9 != r10) goto L54
            return r10
        L54:
            r9 = r4
        L55:
            float r10 = r7.f14265q
            long r9 = r9.h(r10)
            i0.b r11 = new i0.b
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w.AbstractC1802p0.a(w.H0, long, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005e -> B:21:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(v0.y r7, v0.EnumC1738g r8, s5.a r9) {
        /*
            boolean r0 = r9 instanceof w.J
            if (r0 == 0) goto L13
            r0 = r9
            w.J r0 = (w.J) r0
            int r1 = r0.f17807t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17807t = r1
            goto L18
        L13:
            w.J r0 = new w.J
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f17806s
            int r1 = r0.f17807t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            v0.g r7 = r0.f17805r
            v0.y r8 = r0.f17804q
            m5.AbstractC1362a.e(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L61
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            m5.AbstractC1362a.e(r9)
            v0.A r9 = r7.f17509v
            v0.f r9 = r9.f17429I
            java.lang.Object r9 = r9.f17451a
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r4 = r2
        L46:
            if (r4 >= r1) goto L80
            java.lang.Object r5 = r9.get(r4)
            v0.l r5 = (v0.C1743l) r5
            boolean r5 = r5.f17463d
            if (r5 == 0) goto L7d
        L52:
            r0.f17804q = r7
            r0.f17805r = r8
            r0.f17807t = r3
            java.lang.Object r9 = r7.a(r8, r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r9 != r1) goto L61
            return r1
        L61:
            v0.f r9 = (v0.C1737f) r9
            java.lang.Object r9 = r9.f17451a
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r4 = r2
        L6d:
            if (r4 >= r1) goto L80
            java.lang.Object r5 = r9.get(r4)
            v0.l r5 = (v0.C1743l) r5
            boolean r5 = r5.f17463d
            if (r5 == 0) goto L7a
            goto L52
        L7a:
            int r4 = r4 + 1
            goto L6d
        L7d:
            int r4 = r4 + 1
            goto L46
        L80:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w.AbstractC1802p0.b(v0.y, v0.g, s5.a):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object c(InterfaceC1746o interfaceC1746o, B5.e eVar, InterfaceC1524c interfaceC1524c) {
        EnumC1580a enumC1580a;
        C1386y c1386y;
        K k7 = new K(interfaceC1524c.getContext(), eVar, null);
        C1731A c1731a = (C1731A) interfaceC1746o;
        c1731a.getClass();
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(interfaceC1524c));
        c0247h.s();
        v0.y yVar = new v0.y(c1731a, c0247h);
        synchronized (c1731a.f17431K) {
            c1731a.f17430J.c(yVar);
            InterfaceC1524c interfaceC1524cV = AbstractC1397A.v(AbstractC1397A.p(k7, yVar, yVar));
            enumC1580a = EnumC1580a.f16356q;
            C1531j c1531j = new C1531j(interfaceC1524cV);
            c1386y = C1386y.f15098a;
            c1531j.resumeWith(c1386y);
        }
        c0247h.u(new C1346a(8, yVar));
        Object objR = c0247h.r();
        return objR == enumC1580a ? objR : c1386y;
    }
}
