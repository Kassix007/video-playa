package v;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import w.C1784g0;

/* JADX INFO: renamed from: v.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1709d extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f17320u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y.i f17321v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1728x f17322w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709d(C1784g0 c1784g0, long j, y.i iVar, C1728x c1728x, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17319t = c1784g0;
        this.f17320u = j;
        this.f17321v = iVar;
        this.f17322w = c1728x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1709d c1709d = new C1709d(this.f17319t, this.f17320u, this.f17321v, this.f17322w, interfaceC1524c);
        c1709d.f17318s = obj;
        return c1709d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1709d) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r14.a(r1, r17) != r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if (r14.a(r3, r17) == r9) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f17317r
            m5.y r2 = m5.C1386y.f15098a
            v.x r4 = r0.f17322w
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 2
            r13 = 1
            y.i r14 = r0.f17321v
            r15 = 0
            r5.a r3 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L48
            if (r1 == r13) goto L3d
            if (r1 == r12) goto L36
            if (r1 == r11) goto L2c
            if (r1 == r10) goto L27
            if (r1 != r9) goto L1f
            goto L27
        L1f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L27:
            m5.AbstractC1362a.e(r18)
            goto Ld2
        L2c:
            java.lang.Object r1 = r0.f17318s
            y.l r1 = (y.l) r1
            m5.AbstractC1362a.e(r18)
            r9 = r3
            goto Laa
        L36:
            boolean r1 = r0.f17316q
            m5.AbstractC1362a.e(r18)
            r9 = r3
            goto L90
        L3d:
            java.lang.Object r1 = r0.f17318s
            M5.b0 r1 = (M5.InterfaceC0241b0) r1
            m5.AbstractC1362a.e(r18)
            r9 = r3
            r3 = r18
            goto L6f
        L48:
            m5.AbstractC1362a.e(r18)
            java.lang.Object r1 = r0.f17318s
            M5.w r1 = (M5.InterfaceC0261w) r1
            r5 = r3
            v.c r3 = new v.c
            y.i r7 = r0.f17321v
            r8 = 0
            r16 = r5
            long r5 = r0.f17320u
            r9 = r16
            r3.<init>(r4, r5, r7, r8)
            M5.B r1 = M5.AbstractC0263y.t(r1, r15, r15, r3, r11)
            r0.f17318s = r1
            r0.f17317r = r13
            w.g0 r3 = r0.f17319t
            java.lang.Object r3 = r3.g(r0)
            if (r3 != r9) goto L6f
            goto Ld1
        L6f:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r5 = r1.b()
            if (r5 == 0) goto Lb5
            r0.f17318s = r15
            r0.f17316q = r3
            r0.f17317r = r12
            r1.a(r15)
            java.lang.Object r1 = r1.f(r0)
            if (r1 != r9) goto L8b
            goto L8c
        L8b:
            r1 = r2
        L8c:
            if (r1 != r9) goto L8f
            goto Ld1
        L8f:
            r1 = r3
        L90:
            if (r1 == 0) goto Ld2
            y.k r1 = new y.k
            long r5 = r0.f17320u
            r1.<init>(r5)
            y.l r3 = new y.l
            r3.<init>(r1)
            r0.f17318s = r3
            r0.f17317r = r11
            java.lang.Object r1 = r14.a(r1, r0)
            if (r1 != r9) goto La9
            goto Ld1
        La9:
            r1 = r3
        Laa:
            r0.f17318s = r15
            r0.f17317r = r10
            java.lang.Object r1 = r14.a(r1, r0)
            if (r1 != r9) goto Ld2
            goto Ld1
        Lb5:
            y.k r1 = r4.f17415O
            if (r1 == 0) goto Ld2
            if (r3 == 0) goto Lc1
            y.l r3 = new y.l
            r3.<init>(r1)
            goto Lc6
        Lc1:
            y.j r3 = new y.j
            r3.<init>(r1)
        Lc6:
            r0.f17318s = r15
            r1 = 5
            r0.f17317r = r1
            java.lang.Object r1 = r14.a(r3, r0)
            if (r1 != r9) goto Ld2
        Ld1:
            return r9
        Ld2:
            r4.f17415O = r15
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1709d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
