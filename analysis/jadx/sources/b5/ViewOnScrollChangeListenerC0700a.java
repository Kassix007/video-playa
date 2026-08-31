package b5;

import R4.C0468k1;
import android.view.View;

/* JADX INFO: renamed from: b5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnScrollChangeListenerC0700a implements View.OnScrollChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f10012b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnScrollChangeListenerC0700a(C0468k1 c0468k1, int i) {
        this.f10011a = i;
        this.f10012b = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i7, int i8, int i9) {
        switch (this.f10011a) {
            case 0:
                C0468k1 c0468k1 = this.f10012b;
                if (c0468k1.f7068a0) {
                    c0468k1.f7066Z = i7;
                }
                break;
            default:
                C0468k1 c0468k12 = this.f10012b;
                if (c0468k12.f7068a0) {
                    c0468k12.f7066Z = i7;
                }
                break;
        }
    }
}
