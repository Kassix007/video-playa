package C0;

import M5.InterfaceC0261w;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public O5.v f779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public O5.b f780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O5.e f782t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(O5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f782t = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new A0(this.f782t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0059 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: O5.e */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: O5.e */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: O5.e */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: O5.e */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: O5.e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0034, B:19:0x003c, B:20:0x004a, B:26:0x0058, B:14:0x0027, B:28:0x005b, B:30:0x0060, B:31:0x0061, B:13:0x0021, B:21:0x004b, B:23:0x0051), top: B:43:0x0006, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:17:0x0034). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r5.a r0 = r5.EnumC1580a.f16356q
            int r1 = r7.f781s
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            O5.b r1 = r7.f780r
            O5.v r4 = r7.f779q
            m5.AbstractC1362a.e(r8)     // Catch: java.lang.Throwable -> L12
            goto L34
        L12:
            r8 = move-exception
            goto L68
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            m5.AbstractC1362a.e(r8)
            O5.e r4 = r7.f782t
            O5.b r8 = new O5.b     // Catch: java.lang.Throwable -> L12
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L12
            r1 = r8
        L27:
            r7.f779q = r4     // Catch: java.lang.Throwable -> L12
            r7.f780r = r1     // Catch: java.lang.Throwable -> L12
            r7.f781s = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r1.b(r7)     // Catch: java.lang.Throwable -> L12
            if (r8 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L62
            java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L12
            m5.y r8 = (m5.C1386y) r8     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r8 = C0.B0.f785b     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = a0.n.f8680b     // Catch: java.lang.Throwable -> L12
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L12
            a0.c r6 = a0.n.i     // Catch: java.lang.Throwable -> L5f
            r.H r6 = r6.f8653h     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L58
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L5f
            if (r6 != r3) goto L58
            r5 = r3
        L58:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L27
            a0.n.a()     // Catch: java.lang.Throwable -> L12
            goto L27
        L5f:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            throw r0     // Catch: java.lang.Throwable -> L12
        L62:
            r4.a(r2)
            m5.y r8 = m5.C1386y.f15098a
            return r8
        L68:
            throw r8     // Catch: java.lang.Throwable -> L69
        L69:
            r0 = move-exception
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L71
            r2 = r8
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L71:
            if (r2 != 0) goto L7d
            java.lang.String r1 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            r2.<init>(r1)
            r2.initCause(r8)
        L7d:
            r4.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.A0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
