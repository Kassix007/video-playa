package androidx.work;

import B5.e;
import M5.EnumC0262x;
import androidx.concurrent.futures.k;
import androidx.concurrent.futures.l;
import java.util.concurrent.Executor;
import m5.InterfaceC1366e;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f9795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1366e f9797t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(Object obj, Object obj2, InterfaceC1366e interfaceC1366e, int i) {
        this.f9794q = i;
        this.f9795r = obj;
        this.f9796s = obj2;
        this.f9797t = interfaceC1366e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.concurrent.futures.l
    public final Object b(k kVar) {
        switch (this.f9794q) {
            case 0:
                return ListenableFutureKt.executeAsync$lambda$4((Executor) this.f9795r, (String) this.f9796s, (B5.a) this.f9797t, kVar);
            default:
                return ListenableFutureKt.launchFuture$lambda$1((InterfaceC1529h) this.f9795r, (EnumC0262x) this.f9796s, (e) this.f9797t, kVar);
        }
    }
}
