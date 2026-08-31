package e3;

import M5.C0247h;
import a3.InterfaceC0621B;
import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
public final class q implements InterfaceC0621B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0247h f12612b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ q(C0247h c0247h, int i) {
        this.f12611a = i;
        this.f12612b = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a3.InterfaceC0621B
    public final void onResult(Object obj) {
        switch (this.f12611a) {
            case 0:
                C0247h c0247h = this.f12612b;
                if (!c0247h.w()) {
                    c0247h.resumeWith(obj);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                C0247h c0247h2 = this.f12612b;
                if (!c0247h2.w()) {
                    kotlin.jvm.internal.m.b(th);
                    c0247h2.resumeWith(AbstractC1362a.b(th));
                }
                break;
        }
    }
}
