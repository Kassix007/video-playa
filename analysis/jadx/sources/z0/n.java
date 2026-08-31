package Z0;

import B0.t0;
import P.C0367m;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f8376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.c f8377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0367m f8378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z.i f8379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8380u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f8381v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, B5.c cVar, C0367m c0367m, Z.i iVar, int i, View view) {
        super(0);
        this.f8376q = context;
        this.f8377r = cVar;
        this.f8378s = c0367m;
        this.f8379t = iVar;
        this.f8380u = i;
        this.f8381v = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f8381v;
        kotlin.jvm.internal.m.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new r(this.f8376q, this.f8377r, this.f8378s, this.f8379t, this.f8380u, (t0) callback).getLayoutNode();
    }
}
