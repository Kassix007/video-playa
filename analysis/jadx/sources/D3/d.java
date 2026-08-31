package d3;

import java.util.List;
import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1002b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1415a f12228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f12229r = -1.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(List list) {
        this.f12228q = (C1415a) list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final float a() {
        return this.f12228q.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final boolean c(float f) {
        if (this.f12229r == f) {
            return true;
        }
        this.f12229r = f;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final float d() {
        return this.f12228q.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final C1415a f() {
        return this.f12228q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final boolean h(float f) {
        return !this.f12228q.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1002b
    public final boolean isEmpty() {
        return false;
    }
}
