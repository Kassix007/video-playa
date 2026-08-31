package i3;

import C0.S;
import a3.C0632k;
import a3.y;
import c3.s;
import h3.C1122a;

/* JADX INFO: loaded from: classes.dex */
public final class o implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1122a f13620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13621d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(String str, int i, C1122a c1122a, boolean z5) {
        this.f13618a = str;
        this.f13619b = i;
        this.f13620c = c1122a;
        this.f13621d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new s(yVar, bVar, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f13618a);
        sb.append(", index=");
        return S.o(sb, this.f13619b, '}');
    }
}
