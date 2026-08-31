package i3;

import a3.C0632k;
import a3.y;
import h3.C1122a;

/* JADX INFO: renamed from: i3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1137b implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3.e f13564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1122a f13565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13567e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1137b(String str, h3.e eVar, C1122a c1122a, boolean z5, boolean z6) {
        this.f13563a = str;
        this.f13564b = eVar;
        this.f13565c = c1122a;
        this.f13566d = z5;
        this.f13567e = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new c3.g(yVar, bVar, this);
    }
}
