package i3;

import a3.C0632k;
import a3.y;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13617c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(String str, List list, boolean z5) {
        this.f13615a = str;
        this.f13616b = list;
        this.f13617c = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        return new c3.e(yVar, bVar, this, c0632k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ShapeGroup{name='" + this.f13615a + "' Shapes: " + Arrays.toString(this.f13616b.toArray()) + '}';
    }
}
