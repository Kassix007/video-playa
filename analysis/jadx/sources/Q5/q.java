package Q5;

import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f6639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f6640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6641s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6640r = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6639q = obj;
        this.f6641s |= Integer.MIN_VALUE;
        return this.f6640r.emit(null, this);
    }
}
