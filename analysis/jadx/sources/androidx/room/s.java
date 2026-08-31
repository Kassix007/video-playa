package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* JADX INFO: loaded from: classes.dex */
public final class s extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f9768a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f9768a = multiInstanceInvalidationService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        l callback = (l) iInterface;
        kotlin.jvm.internal.m.e(callback, "callback");
        kotlin.jvm.internal.m.e(cookie, "cookie");
        this.f9768a.f9709r.remove((Integer) cookie);
    }
}
