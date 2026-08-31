package u0;

import M5.InterfaceC0261w;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f17095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f17096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f17097c = new A0.d(27, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0261w f17098d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, long r13, s5.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof u0.C1673b
            if (r0 == 0) goto L14
            r0 = r15
            u0.b r0 = (u0.C1673b) r0
            int r1 = r0.f17091s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f17091s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            u0.b r0 = new u0.b
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f17089q
            int r0 = r6.f17091s
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 != r1) goto L2a
            m5.AbstractC1362a.e(r15)
            goto L83
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            m5.AbstractC1362a.e(r15)
            goto L5f
        L36:
            m5.AbstractC1362a.e(r15)
            u0.g r15 = r10.f17095a
            r0 = 0
            if (r15 == 0) goto L49
            boolean r3 = r15.f10099D
            if (r3 == 0) goto L49
            B0.E0 r15 = B0.AbstractC0041g.j(r15)
            u0.g r15 = (u0.g) r15
            goto L4a
        L49:
            r15 = r0
        L4a:
            r3 = 0
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r15 != 0) goto L64
            u0.g r1 = r10.f17096b
            if (r1 == 0) goto L89
            r6.f17091s = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.n(r2, r4, r6)
            if (r15 != r7) goto L5f
            goto L82
        L5f:
            W0.p r15 = (W0.p) r15
            long r3 = r15.f8030a
            goto L89
        L64:
            r8 = r3
            r2 = r11
            r11 = r8
            r4 = r13
            u0.g r13 = r10.f17095a
            if (r13 == 0) goto L77
            boolean r14 = r13.f10099D
            if (r14 == 0) goto L77
            B0.E0 r13 = B0.AbstractC0041g.j(r13)
            r0 = r13
            u0.g r0 = (u0.g) r0
        L77:
            if (r0 == 0) goto L88
            r6.f17091s = r1
            r1 = r0
            java.lang.Object r15 = r1.n(r2, r4, r6)
            if (r15 != r7) goto L83
        L82:
            return r7
        L83:
            W0.p r15 = (W0.p) r15
            long r3 = r15.f8030a
            goto L89
        L88:
            r3 = r11
        L89:
            W0.p r11 = new W0.p
            r11.<init>(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.d.a(long, long, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, s5.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof u0.c
            if (r0 == 0) goto L13
            r0 = r7
            u0.c r0 = (u0.c) r0
            int r1 = r0.f17094s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17094s = r1
            goto L18
        L13:
            u0.c r0 = new u0.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f17092q
            int r1 = r0.f17094s
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            m5.AbstractC1362a.e(r7)
            goto L4d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            m5.AbstractC1362a.e(r7)
            u0.g r7 = r4.f17095a
            r1 = 0
            if (r7 == 0) goto L40
            boolean r3 = r7.f10099D
            if (r3 == 0) goto L40
            B0.E0 r7 = B0.AbstractC0041g.j(r7)
            r1 = r7
            u0.g r1 = (u0.g) r1
        L40:
            if (r1 == 0) goto L52
            r0.f17094s = r2
            java.lang.Object r7 = r1.I(r5, r0)
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r7 != r5) goto L4d
            return r5
        L4d:
            W0.p r7 = (W0.p) r7
            long r5 = r7.f8030a
            goto L54
        L52:
            r5 = 0
        L54:
            W0.p r7 = new W0.p
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.d.b(long, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [B5.a, kotlin.jvm.internal.n] */
    public final InterfaceC0261w c() {
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f17097c.invoke();
        if (interfaceC0261w != null) {
            return interfaceC0261w;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
