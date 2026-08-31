package i3;

import a3.C0632k;
import a3.y;
import android.graphics.Path;
import h3.C1122a;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f13611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1122a f13613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1122a f13614e;
    public final boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(String str, boolean z5, Path.FillType fillType, C1122a c1122a, C1122a c1122a2, boolean z6) {
        this.f13612c = str;
        this.f13610a = z5;
        this.f13611b = fillType;
        this.f13613d = c1122a;
        this.f13614e = c1122a2;
        this.f = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new c3.h(yVar, bVar, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f13610a + '}';
    }
}
