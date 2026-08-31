package M;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import u.C1642c;

/* JADX INFO: loaded from: classes.dex */
public final class I implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0261w f3317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1642c f3318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B5.a f3319c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(B5.a aVar, C1642c c1642c, InterfaceC0261w interfaceC0261w) {
        this.f3317a = interfaceC0261w;
        this.f3318b = c1642c;
        this.f3319c = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackCancelled() {
        AbstractC0263y.t(this.f3317a, null, null, new F(this.f3318b, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackInvoked() {
        this.f3319c.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0263y.t(this.f3317a, null, null, new G(this.f3318b, backEvent, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0263y.t(this.f3317a, null, null, new H(this.f3318b, backEvent, null), 3);
    }
}
