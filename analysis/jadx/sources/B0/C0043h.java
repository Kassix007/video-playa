package B0;

import h0.InterfaceC1116i;

/* JADX INFO: renamed from: B0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043h implements InterfaceC1116i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0043h f436a = new C0043h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f437b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h0.InterfaceC1116i
    public final boolean a() {
        Boolean bool = f437b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw C0.S.i("canFocus is read before it is written");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h0.InterfaceC1116i
    public final void b(boolean z5) {
        f437b = Boolean.valueOf(z5);
    }
}
