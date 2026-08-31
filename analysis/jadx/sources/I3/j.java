package i3;

import a3.C0632k;
import a3.y;
import h3.C1122a;
import h3.C1123b;
import h3.C1125d;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC1138c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13601a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1123b f13603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h3.e f13605e;
    public final Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(String str, C1123b c1123b, C1123b c1123b2, C1125d c1125d, boolean z5) {
        this.f13602b = str;
        this.f13603c = c1123b;
        this.f13605e = c1123b2;
        this.f = c1125d;
        this.f13604d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i3.InterfaceC1138c
    public final c3.d a(y yVar, C0632k c0632k, j3.b bVar) {
        switch (this.f13601a) {
            case 0:
                return new c3.p(yVar, bVar, this);
            default:
                return new c3.q(yVar, bVar, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f13601a) {
            case 0:
                return "RectangleShape{position=" + this.f13605e + ", size=" + ((h3.e) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public j(String str, h3.e eVar, C1122a c1122a, C1123b c1123b, boolean z5) {
        this.f13602b = str;
        this.f13605e = eVar;
        this.f = c1122a;
        this.f13603c = c1123b;
        this.f13604d = z5;
    }
}
