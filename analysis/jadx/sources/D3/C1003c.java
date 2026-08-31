package d3;

import java.util.List;
import o3.C1415a;

/* JADX INFO: renamed from: d3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1003c implements InterfaceC1002b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f12224q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1415a f12226s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f12227t = -1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1415a f12225r = b(0.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1003c(List list) {
        this.f12224q = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final float a() {
        return ((C1415a) this.f12224q.get(r0.size() - 1)).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1415a b(float f) {
        List list = this.f12224q;
        C1415a c1415a = (C1415a) list.get(list.size() - 1);
        if (f >= c1415a.b()) {
            return c1415a;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C1415a c1415a2 = (C1415a) list.get(size);
            if (this.f12225r != c1415a2 && f >= c1415a2.b() && f < c1415a2.a()) {
                return c1415a2;
            }
        }
        return (C1415a) list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final boolean c(float f) {
        C1415a c1415a = this.f12226s;
        C1415a c1415a2 = this.f12225r;
        if (c1415a == c1415a2 && this.f12227t == f) {
            return true;
        }
        this.f12226s = c1415a2;
        this.f12227t = f;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final float d() {
        return ((C1415a) this.f12224q.get(0)).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final C1415a f() {
        return this.f12225r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final boolean h(float f) {
        C1415a c1415a = this.f12225r;
        if (f >= c1415a.b() && f < c1415a.a()) {
            return !this.f12225r.c();
        }
        this.f12225r = b(f);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final boolean isEmpty() {
        return false;
    }
}
