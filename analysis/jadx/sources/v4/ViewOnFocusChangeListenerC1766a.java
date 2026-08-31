package v4;

import android.view.View;

/* JADX INFO: renamed from: v4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1766a implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f17612b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnFocusChangeListenerC1766a(n nVar, int i) {
        this.f17611a = i;
        this.f17612b = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        switch (this.f17611a) {
            case 0:
                d dVar = (d) this.f17612b;
                dVar.t(dVar.u());
                break;
            default:
                j jVar = (j) this.f17612b;
                jVar.f17633l = z5;
                jVar.q();
                if (!z5) {
                    jVar.t(false);
                    jVar.f17634m = false;
                }
                break;
        }
    }
}
