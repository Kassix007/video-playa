package a0;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s5.h implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long[] f8666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8670v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f8671w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8671w = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        k kVar = new k(this.f8671w, interfaceC1524c);
        kVar.f8670v = obj;
        return kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((I5.j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:26:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bd -> B:37:0x00bf). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            a0.l r1 = r0.f8671w
            long r2 = r1.f8673q
            long r4 = r1.f8675s
            long r6 = r1.f8674r
            int r8 = r0.f8669u
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            r5.a r11 = r5.EnumC1580a.f16356q
            if (r8 == 0) goto L4d
            if (r8 == r10) goto L3e
            if (r8 == r13) goto L34
            if (r8 != r12) goto L2c
            int r1 = r0.f8667s
            java.lang.Object r6 = r0.f8670v
            I5.j r6 = (I5.j) r6
            m5.AbstractC1362a.e(r23)
            r7 = r12
            goto Lbf
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            int r1 = r0.f8667s
            java.lang.Object r8 = r0.f8670v
            I5.j r8 = (I5.j) r8
            m5.AbstractC1362a.e(r23)
            goto L95
        L3e:
            int r1 = r0.f8668t
            int r8 = r0.f8667s
            long[] r15 = r0.f8666r
            java.lang.Object r12 = r0.f8670v
            I5.j r12 = (I5.j) r12
            m5.AbstractC1362a.e(r23)
            int r8 = r8 + r10
            goto L5b
        L4d:
            m5.AbstractC1362a.e(r23)
            java.lang.Object r8 = r0.f8670v
            r12 = r8
            I5.j r12 = (I5.j) r12
            long[] r15 = r1.f8676t
            if (r15 == 0) goto L72
            int r1 = r15.length
            r8 = 0
        L5b:
            if (r8 >= r1) goto L72
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f8670v = r12
            r0.f8666r = r15
            r0.f8667s = r8
            r0.f8668t = r1
            r0.f8669u = r10
            r12.b(r4, r0)
            return r11
        L72:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L98
            r8 = r12
            r1 = 0
        L78:
            if (r1 >= r14) goto L97
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L95
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f8670v = r8
            r0.f8666r = r9
            r0.f8667s = r1
            r0.f8669u = r13
            r8.b(r2, r0)
            return r11
        L95:
            int r1 = r1 + r10
            goto L78
        L97:
            r12 = r8
        L98:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc2
            r6 = r12
            r15 = 0
        L9e:
            if (r15 >= r14) goto Lc2
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbd
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f8670v = r6
            r0.f8666r = r9
            r0.f8667s = r15
            r7 = 3
            r0.f8669u = r7
            r6.b(r1, r0)
            return r11
        Lbd:
            r7 = 3
            r1 = r15
        Lbf:
            int r15 = r1 + 1
            goto L9e
        Lc2:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
