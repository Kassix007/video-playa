package i3;

import a3.C0632k;
import a3.y;
import c3.u;
import h3.C1123b;

/* JADX INFO: loaded from: classes.dex */
public final class q implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1123b f13630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1123b f13631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1123b f13632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13633e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(String str, int i, C1123b c1123b, C1123b c1123b2, C1123b c1123b3, boolean z5) {
        this.f13629a = i;
        this.f13630b = c1123b;
        this.f13631c = c1123b2;
        this.f13632d = c1123b3;
        this.f13633e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new u(bVar, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Trim Path: {start: " + this.f13630b + ", end: " + this.f13631c + ", offset: " + this.f13632d + "}";
    }
}
