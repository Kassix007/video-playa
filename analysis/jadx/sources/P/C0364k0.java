package P;

import M5.InterfaceC0261w;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: P.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0364k0 implements W, InterfaceC0261w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1529h f5419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ W f5420r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0364k0(W w3, InterfaceC1529h interfaceC1529h) {
        this.f5419q = interfaceC1529h;
        this.f5420r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0261w
    public final InterfaceC1529h d() {
        return this.f5419q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        return this.f5420r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.W
    public final void setValue(Object obj) {
        this.f5420r.setValue(obj);
    }
}
