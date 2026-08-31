package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import l.C1198a;

/* JADX INFO: renamed from: m.X0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1289X0 implements View.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1198a f14727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1291Y0 f14728r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC1289X0(C1291Y0 c1291y0) {
        this.f14728r = c1291y0;
        Context context = c1291y0.f14730a.getContext();
        CharSequence charSequence = c1291y0.f14736h;
        C1198a c1198a = new C1198a();
        c1198a.f14296e = 4096;
        c1198a.f14297g = 4096;
        c1198a.f14300l = null;
        c1198a.f14301m = null;
        c1198a.f14302n = false;
        c1198a.f14303o = false;
        c1198a.f14304p = 16;
        c1198a.i = context;
        c1198a.f14292a = charSequence;
        this.f14727q = c1198a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1291Y0 c1291y0 = this.f14728r;
        Window.Callback callback = c1291y0.f14737k;
        if (callback == null || !c1291y0.f14738l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f14727q);
    }
}
