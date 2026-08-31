package i3;

import a3.C0632k;
import a3.y;
import c3.r;
import h3.C1123b;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.e f13606a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(String str, C1123b c1123b) {
        this.f13606a = c1123b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new r(yVar, bVar, this);
    }
}
