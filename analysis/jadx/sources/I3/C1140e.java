package i3;

import a3.C0632k;
import a3.y;
import android.graphics.Path;
import h3.C1122a;

/* JADX INFO: renamed from: i3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1140e implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f13571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1122a f13572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1122a f13573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1122a f13574e;
    public final C1122a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13576h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1140e(String str, int i, Path.FillType fillType, C1122a c1122a, C1122a c1122a2, C1122a c1122a3, C1122a c1122a4, boolean z5) {
        this.f13570a = i;
        this.f13571b = fillType;
        this.f13572c = c1122a;
        this.f13573d = c1122a2;
        this.f13574e = c1122a3;
        this.f = c1122a4;
        this.f13575g = str;
        this.f13576h = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new c3.i(yVar, c0632k, bVar, this);
    }
}
