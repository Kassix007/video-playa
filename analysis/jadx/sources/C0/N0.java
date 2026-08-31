package C0;

import android.graphics.Outline;
import j0.C1152g;
import j0.InterfaceC1144A;

/* JADX INFO: loaded from: classes.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0 f903a = new N0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Outline outline, InterfaceC1144A interfaceC1144A) {
        if (!(interfaceC1144A instanceof C1152g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C1152g) interfaceC1144A).f13707a);
    }
}
