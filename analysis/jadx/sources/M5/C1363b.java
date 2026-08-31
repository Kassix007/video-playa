package m5;

import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: m5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1363b implements InterfaceC1524c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b6.g f15070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC1524c f15071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f15072s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return C1530i.f16022q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        this.f15071r = null;
        this.f15072s = obj;
    }
}
