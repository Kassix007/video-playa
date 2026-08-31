package U4;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: renamed from: U4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0546m implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7843r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0546m(P.W w3, int i) {
        this.f7842q = i;
        this.f7843r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f7842q) {
            case 0:
                Context it = (Context) obj;
                kotlin.jvm.internal.m.e(it, "it");
                View view = (View) this.f7843r.getValue();
                kotlin.jvm.internal.m.b(view);
                return view;
            case 1:
                Context it2 = (Context) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                View view2 = (View) this.f7843r.getValue();
                kotlin.jvm.internal.m.b(view2);
                return view2;
            case 2:
                Context it3 = (Context) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return (WebView) this.f7843r.getValue();
            case 3:
                InterfaceC0725m it4 = (InterfaceC0725m) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                this.f7843r.setValue(it4);
                return C1386y.f15098a;
            case 4:
                this.f7843r.setValue(Boolean.FALSE);
                return C1386y.f15098a;
            default:
                Context it5 = (Context) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                View view3 = (View) this.f7843r.getValue();
                kotlin.jvm.internal.m.b(view3);
                return view3;
        }
    }
}
