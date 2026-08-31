package Q5;

import P5.InterfaceC0398i;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC0398i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Serializable f6630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6633u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m(Serializable serializable, Object obj, Object obj2, Object obj3, int i) {
        this.f6629q = i;
        this.f6630r = serializable;
        this.f6631s = obj;
        this.f6632t = obj2;
        this.f6633u = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    @Override // P5.InterfaceC0398i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, q5.InterfaceC1524c r8) {
        /*
            r6 = this;
            int r0 = r6.f6629q
            switch(r0) {
                case 0: goto L95;
                default: goto L5;
            }
        L5:
            y.h r7 = (y.h) r7
            java.lang.Object r8 = r6.f6632t
            kotlin.jvm.internal.w r8 = (kotlin.jvm.internal.w) r8
            java.lang.Object r0 = r6.f6631s
            kotlin.jvm.internal.w r0 = (kotlin.jvm.internal.w) r0
            java.io.Serializable r1 = r6.f6630r
            kotlin.jvm.internal.w r1 = (kotlin.jvm.internal.w) r1
            boolean r2 = r7 instanceof y.k
            r3 = 1
            if (r2 == 0) goto L1e
            int r7 = r1.f14266q
            int r7 = r7 + r3
            r1.f14266q = r7
            goto L5d
        L1e:
            boolean r2 = r7 instanceof y.l
            if (r2 == 0) goto L29
            int r7 = r1.f14266q
            int r7 = r7 + (-1)
            r1.f14266q = r7
            goto L5d
        L29:
            boolean r2 = r7 instanceof y.j
            if (r2 == 0) goto L34
            int r7 = r1.f14266q
            int r7 = r7 + (-1)
            r1.f14266q = r7
            goto L5d
        L34:
            boolean r2 = r7 instanceof y.f
            if (r2 == 0) goto L3e
            int r7 = r0.f14266q
            int r7 = r7 + r3
            r0.f14266q = r7
            goto L5d
        L3e:
            boolean r2 = r7 instanceof y.g
            if (r2 == 0) goto L49
            int r7 = r0.f14266q
            int r7 = r7 + (-1)
            r0.f14266q = r7
            goto L5d
        L49:
            boolean r2 = r7 instanceof y.d
            if (r2 == 0) goto L53
            int r7 = r8.f14266q
            int r7 = r7 + r3
            r8.f14266q = r7
            goto L5d
        L53:
            boolean r7 = r7 instanceof y.e
            if (r7 == 0) goto L5d
            int r7 = r8.f14266q
            int r7 = r7 + (-1)
            r8.f14266q = r7
        L5d:
            int r7 = r1.f14266q
            r1 = 0
            if (r7 <= 0) goto L64
            r7 = r3
            goto L65
        L64:
            r7 = r1
        L65:
            int r0 = r0.f14266q
            if (r0 <= 0) goto L6b
            r0 = r3
            goto L6c
        L6b:
            r0 = r1
        L6c:
            int r8 = r8.f14266q
            if (r8 <= 0) goto L72
            r8 = r3
            goto L73
        L72:
            r8 = r1
        L73:
            java.lang.Object r2 = r6.f6633u
            v.B r2 = (v.C1705B) r2
            boolean r4 = r2.f17220F
            if (r4 == r7) goto L7e
            r2.f17220F = r7
            r1 = r3
        L7e:
            boolean r7 = r2.f17221G
            if (r7 == r0) goto L85
            r2.f17221G = r0
            r1 = r3
        L85:
            boolean r7 = r2.f17222H
            if (r7 == r8) goto L8c
            r2.f17222H = r8
            goto L8d
        L8c:
            r3 = r1
        L8d:
            if (r3 == 0) goto L92
            B0.AbstractC0041g.l(r2)
        L92:
            m5.y r7 = m5.C1386y.f15098a
            return r7
        L95:
            boolean r0 = r8 instanceof Q5.l
            if (r0 == 0) goto La8
            r0 = r8
            Q5.l r0 = (Q5.l) r0
            int r1 = r0.f6628u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto La8
            int r1 = r1 - r2
            r0.f6628u = r1
            goto Lad
        La8:
            Q5.l r0 = new Q5.l
            r0.<init>(r6, r8)
        Lad:
            java.lang.Object r8 = r0.f6626s
            int r1 = r0.f6628u
            r2 = 1
            if (r1 == 0) goto Lc6
            if (r1 != r2) goto Lbe
            java.lang.Object r7 = r0.f6625r
            Q5.m r0 = r0.f6624q
            m5.AbstractC1362a.e(r8)
            goto Led
        Lbe:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        Lc6:
            m5.AbstractC1362a.e(r8)
            java.io.Serializable r8 = r6.f6630r
            kotlin.jvm.internal.y r8 = (kotlin.jvm.internal.y) r8
            java.lang.Object r8 = r8.f14268q
            M5.b0 r8 = (M5.InterfaceC0241b0) r8
            if (r8 == 0) goto Lec
            Q5.p r1 = new Q5.p
            java.lang.String r3 = "Child of the scoped flow was cancelled"
            r1.<init>(r3)
            r8.a(r1)
            r0.f6624q = r6
            r0.f6625r = r7
            r0.f6628u = r2
            java.lang.Object r8 = r8.f(r0)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r8 != r0) goto Lec
            goto L10d
        Lec:
            r0 = r6
        Led:
            java.io.Serializable r8 = r0.f6630r
            kotlin.jvm.internal.y r8 = (kotlin.jvm.internal.y) r8
            java.lang.Object r1 = r0.f6631s
            M5.w r1 = (M5.InterfaceC0261w) r1
            Q5.k r3 = new Q5.k
            java.lang.Object r4 = r0.f6632t
            Q5.o r4 = (Q5.o) r4
            java.lang.Object r0 = r0.f6633u
            P5.i r0 = (P5.InterfaceC0398i) r0
            r5 = 0
            r3.<init>(r4, r0, r7, r5)
            M5.x r7 = M5.EnumC0262x.f3898t
            M5.B r7 = M5.AbstractC0263y.t(r1, r5, r7, r3, r2)
            r8.f14268q = r7
            m5.y r0 = m5.C1386y.f15098a
        L10d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q5.m.emit(java.lang.Object, q5.c):java.lang.Object");
    }
}
