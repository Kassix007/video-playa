package b;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC0685b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f9924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0683A f9925r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z(C0683A c0683a, u onBackPressedCallback) {
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        this.f9925r = c0683a;
        this.f9924q = onBackPressedCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [B5.a, kotlin.jvm.internal.k] */
    @Override // b.InterfaceC0685b
    public final void cancel() {
        C0683A c0683a = this.f9925r;
        n5.j jVar = c0683a.f9847b;
        u uVar = this.f9924q;
        jVar.remove(uVar);
        if (kotlin.jvm.internal.m.a(c0683a.f9848c, uVar)) {
            uVar.a();
            c0683a.f9848c = null;
        }
        uVar.f9910b.remove(this);
        ?? r02 = uVar.f9911c;
        if (r02 != 0) {
            r02.invoke();
        }
        uVar.f9911c = null;
    }
}
