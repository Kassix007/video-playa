package w;

import F.C0162p;
import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;
import v0.InterfaceC1746o;

/* JADX INFO: renamed from: w.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1812v extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C f18082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1746o f18083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0162p f18084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A.J f18085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1814w f18086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1814w f18087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ B0.j0 f18088y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812v(C c7, InterfaceC1746o interfaceC1746o, C0162p c0162p, A.J j, C1814w c1814w, C1814w c1814w2, B0.j0 j0Var, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18082s = c7;
        this.f18083t = interfaceC1746o;
        this.f18084u = c0162p;
        this.f18085v = j;
        this.f18086w = c1814w;
        this.f18087x = c1814w2;
        this.f18088y = j0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1812v c1812v = new C1812v(this.f18082s, this.f18083t, this.f18084u, this.f18085v, this.f18086w, this.f18087x, this.f18088y, interfaceC1524c);
        c1812v.f18081r = obj;
        return c1812v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1812v) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f18080q
            m5.y r1 = m5.C1386y.f15098a
            w.C r2 = r13.f18082s
            r3 = 1
            if (r0 == 0) goto L1f
            if (r0 != r3) goto L17
            java.lang.Object r0 = r13.f18081r
            r3 = r0
            M5.w r3 = (M5.InterfaceC0261w) r3
            m5.AbstractC1362a.e(r14)     // Catch: java.util.concurrent.CancellationException -> L14
            return r1
        L14:
            r0 = move-exception
        L15:
            r14 = r0
            goto L56
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            m5.AbstractC1362a.e(r14)
            java.lang.Object r14 = r13.f18081r
            M5.w r14 = (M5.InterfaceC0261w) r14
            w.d0 r7 = r2.f17744G     // Catch: java.util.concurrent.CancellationException -> L54
            v0.o r0 = r13.f18083t     // Catch: java.util.concurrent.CancellationException -> L54
            F.p r8 = r13.f18084u     // Catch: java.util.concurrent.CancellationException -> L54
            A.J r11 = r13.f18085v     // Catch: java.util.concurrent.CancellationException -> L54
            w.w r10 = r13.f18086w     // Catch: java.util.concurrent.CancellationException -> L54
            w.w r5 = r13.f18087x     // Catch: java.util.concurrent.CancellationException -> L54
            B0.j0 r9 = r13.f18088y     // Catch: java.util.concurrent.CancellationException -> L54
            r13.f18081r = r14     // Catch: java.util.concurrent.CancellationException -> L54
            r13.f18080q = r3     // Catch: java.util.concurrent.CancellationException -> L54
            float r3 = w.AbstractC1810u.f18077a     // Catch: java.util.concurrent.CancellationException -> L54
            kotlin.jvm.internal.x r6 = new kotlin.jvm.internal.x     // Catch: java.util.concurrent.CancellationException -> L54
            r6.<init>()     // Catch: java.util.concurrent.CancellationException -> L54
            w.t r4 = new w.t     // Catch: java.util.concurrent.CancellationException -> L54
            r12 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.util.concurrent.CancellationException -> L54
            java.lang.Object r14 = w.AbstractC1802p0.c(r0, r4, r13)     // Catch: java.util.concurrent.CancellationException -> L54
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r14 != r0) goto L4e
            goto L4f
        L4e:
            r14 = r1
        L4f:
            if (r14 != r0) goto L65
            return r0
        L52:
            r3 = r14
            goto L15
        L54:
            r0 = move-exception
            goto L52
        L56:
            O5.e r0 = r2.f17748K
            if (r0 == 0) goto L5f
            w.o r2 = w.C1799o.f18034a
            r0.j(r2)
        L5f:
            boolean r0 = M5.AbstractC0263y.r(r3)
            if (r0 == 0) goto L66
        L65:
            return r1
        L66:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1812v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
