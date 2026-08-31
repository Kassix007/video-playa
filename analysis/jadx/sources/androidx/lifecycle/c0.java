package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0662z f9531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EnumC0652o f9532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9533s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c0(C0662z registry, EnumC0652o event) {
        kotlin.jvm.internal.m.e(registry, "registry");
        kotlin.jvm.internal.m.e(event, "event");
        this.f9531q = registry;
        this.f9532r = event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9533s) {
            return;
        }
        this.f9531q.f(this.f9532r);
        this.f9533s = true;
    }
}
