package androidx.room;

import M5.InterfaceC0261w;
import java.util.concurrent.Callable;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: androidx.room.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0665c extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public O5.b f9712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f9714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0666d f9715t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O5.e f9716u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Callable f9717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O5.e f9718w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0665c(w wVar, C0666d c0666d, O5.e eVar, Callable callable, O5.e eVar2, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f9714s = wVar;
        this.f9715t = c0666d;
        this.f9716u = eVar;
        this.f9717v = callable;
        this.f9718w = eVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0665c(this.f9714s, this.f9715t, this.f9716u, this.f9717v, this.f9718w, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0665c) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:18:0x0037, B:21:0x0042, B:23:0x004a, B:14:0x0022, B:17:0x0030), top: B:30:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:18:0x0037). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f9713r
            r1 = 2
            r2 = 1
            androidx.room.d r3 = r7.f9715t
            androidx.room.w r4 = r7.f9714s
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r0 == 0) goto L26
            if (r0 == r2) goto L20
            if (r0 != r1) goto L18
            O5.b r0 = r7.f9712q
            m5.AbstractC1362a.e(r8)     // Catch: java.lang.Throwable -> L16
            goto L37
        L16:
            r8 = move-exception
            goto L6a
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            O5.b r0 = r7.f9712q
            m5.AbstractC1362a.e(r8)     // Catch: java.lang.Throwable -> L16
            goto L42
        L26:
            m5.AbstractC1362a.e(r8)
            androidx.room.q r8 = r4.getInvalidationTracker()
            r8.a(r3)
            O5.e r8 = r7.f9716u     // Catch: java.lang.Throwable -> L16
            O5.b r0 = new O5.b     // Catch: java.lang.Throwable -> L16
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L16
        L37:
            r7.f9712q = r0     // Catch: java.lang.Throwable -> L16
            r7.f9713r = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r0.b(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r5) goto L42
            goto L5f
        L42:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L60
            r0.c()     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.Callable r8 = r7.f9717v     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L16
            O5.e r6 = r7.f9718w     // Catch: java.lang.Throwable -> L16
            r7.f9712q = r0     // Catch: java.lang.Throwable -> L16
            r7.f9713r = r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r6.k(r8, r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r5) goto L37
        L5f:
            return r5
        L60:
            androidx.room.q r8 = r4.getInvalidationTracker()
            r8.d(r3)
            m5.y r8 = m5.C1386y.f15098a
            return r8
        L6a:
            androidx.room.q r0 = r4.getInvalidationTracker()
            r0.d(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0665c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
