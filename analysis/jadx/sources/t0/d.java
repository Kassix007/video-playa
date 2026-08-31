package t0;

import C0.C0110x;
import android.view.KeyEvent;
import c0.AbstractC0724l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0724l implements c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0110x f16672E;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // t0.c
    public final boolean K(KeyEvent keyEvent) {
        C0110x c0110x = this.f16672E;
        if (c0110x != null) {
            return ((Boolean) c0110x.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // t0.c
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }
}
