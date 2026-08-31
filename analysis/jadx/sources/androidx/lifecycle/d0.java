package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0662z f9537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f9538b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f9539c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d0(A a7) {
        this.f9537a = new C0662z(a7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(EnumC0652o enumC0652o) {
        c0 c0Var = this.f9539c;
        if (c0Var != null) {
            c0Var.run();
        }
        c0 c0Var2 = new c0(this.f9537a, enumC0652o);
        this.f9539c = c0Var2;
        this.f9538b.postAtFrontOfQueue(c0Var2);
    }
}
