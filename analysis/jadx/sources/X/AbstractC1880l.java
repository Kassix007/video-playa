package x;

import java.util.concurrent.CancellationException;
import u.C1656j;
import w.InterfaceC1788i0;

/* JADX INFO: renamed from: x.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1880l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18324a = 400;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(w.InterfaceC1788i0 r9, float r10, u.C1658l r11, u.C1667v r12, B5.c r13, s5.c r14) {
        /*
            boolean r0 = r14 instanceof x.C1877i
            if (r0 == 0) goto L13
            r0 = r14
            x.i r0 = (x.C1877i) r0
            int r1 = r0.f18312u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18312u = r1
            goto L18
        L13:
            x.i r0 = new x.i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f18311t
            int r1 = r0.f18312u
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            float r10 = r0.f18308q
            kotlin.jvm.internal.v r9 = r0.f18310s
            u.l r11 = r0.f18309r
            m5.AbstractC1362a.e(r14)
            goto L6a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            m5.AbstractC1362a.e(r14)
            kotlin.jvm.internal.v r5 = new kotlin.jvm.internal.v
            r5.<init>()
            java.lang.Object r14 = r11.b()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4c
            r14 = r2
            goto L4d
        L4c:
            r14 = 0
        L4d:
            r14 = r14 ^ r2
            x.j r3 = new x.j
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f18309r = r11
            r0.f18310s = r5
            r0.f18308q = r4
            r0.f18312u = r2
            java.lang.Object r9 = u.AbstractC1644d.e(r11, r12, r14, r3, r0)
            r5.a r10 = r5.EnumC1580a.f16356q
            if (r9 != r10) goto L68
            return r10
        L68:
            r10 = r4
            r9 = r5
        L6a:
            x.a r12 = new x.a
            float r9 = r9.f14265q
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC1880l.a(w.i0, float, u.l, u.v, B5.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(C1656j c1656j, InterfaceC1788i0 interfaceC1788i0, B5.c cVar, float f) {
        float fA;
        try {
            fA = interfaceC1788i0.a(f);
        } catch (CancellationException unused) {
            c1656j.a();
            fA = 0.0f;
        }
        cVar.invoke(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            c1656j.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(w.InterfaceC1788i0 r16, float r17, float r18, u.C1658l r19, u.C1649f0 r20, B5.c r21, s5.c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof x.C1879k
            if (r2 == 0) goto L18
            r2 = r1
            x.k r2 = (x.C1879k) r2
            int r3 = r2.f18323v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f18323v = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            x.k r2 = new x.k
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f18322u
            int r2 = r8.f18323v
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            float r0 = r8.f18319r
            float r2 = r8.f18318q
            kotlin.jvm.internal.v r3 = r8.f18321t
            u.l r4 = r8.f18320s
            m5.AbstractC1362a.e(r1)
            r1 = r0
            r0 = r2
            goto L90
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            m5.AbstractC1362a.e(r1)
            kotlin.jvm.internal.v r12 = new kotlin.jvm.internal.v
            r12.<init>()
            java.lang.Object r1 = r19.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L65
            r2 = r3
            goto L66
        L65:
            r2 = 0
        L66:
            r6 = r2 ^ 1
            x.j r10 = new x.j
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.f18320s = r2
            r8.f18321t = r12
            r8.f18318q = r0
            r8.f18319r = r1
            r8.f18323v = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = u.AbstractC1644d.g(r3, r4, r5, r6, r7, r8)
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r2 != r3) goto L8d
            return r3
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = d(r2, r1)
            x.a r2 = new x.a
            float r3 = r3.f14265q
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            u.l r0 = u.AbstractC1644d.k(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC1880l.c(w.i0, float, float, u.l, u.f0, B5.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float d(float f, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        return (f7 <= 0.0f ? f >= f7 : f <= f7) ? f : f7;
    }
}
