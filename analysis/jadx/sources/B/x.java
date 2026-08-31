package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class x implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f9916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f9918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f9919d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(v vVar, v vVar2, w wVar, w wVar2) {
        this.f9916a = vVar;
        this.f9917b = vVar2;
        this.f9918c = wVar;
        this.f9919d = wVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackCancelled() {
        this.f9919d.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackInvoked() {
        this.f9918c.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
        this.f9917b.invoke(new C0684a(backEvent));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
        this.f9916a.invoke(new C0684a(backEvent));
    }
}
