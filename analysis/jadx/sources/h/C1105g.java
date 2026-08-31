package h;

import com.web2native.MainActivity;
import d.InterfaceC0949a;

/* JADX INFO: renamed from: h.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1105g implements InterfaceC0949a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f13294a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1105g(MainActivity mainActivity) {
        this.f13294a = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d.InterfaceC0949a
    public final void a(b.l lVar) {
        MainActivity mainActivity = this.f13294a;
        l lVarL = mainActivity.l();
        lVarL.a();
        ((Z.m) mainActivity.f9894t.f8313s).h("androidx:appcompat");
        lVarL.c();
    }
}
