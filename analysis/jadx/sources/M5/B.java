package M5;

import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public class B extends AbstractC0238a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3805t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(InterfaceC1529h interfaceC1529h, boolean z5, int i) {
        super(interfaceC1529h, z5);
        this.f3805t = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public boolean F(Throwable th) {
        switch (this.f3805t) {
            case 1:
                AbstractC0263y.p(th, this.f3835s);
                return true;
            default:
                return super.F(th);
        }
    }
}
