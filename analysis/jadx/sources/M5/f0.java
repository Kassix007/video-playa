package M5;

import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends C0247h {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i0 f3847y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f0(InterfaceC1524c interfaceC1524c, i0 i0Var) {
        super(1, interfaceC1524c);
        this.f3847y = i0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C0247h
    public final Throwable p(i0 i0Var) {
        Throwable thC;
        i0 i0Var2 = this.f3847y;
        i0Var2.getClass();
        Object obj = i0.f3864q.get(i0Var2);
        return (!(obj instanceof h0) || (thC = ((h0) obj).c()) == null) ? obj instanceof C0255p ? ((C0255p) obj).f3878a : i0Var.v() : thC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C0247h
    public final String z() {
        return "AwaitContinuation";
    }
}
