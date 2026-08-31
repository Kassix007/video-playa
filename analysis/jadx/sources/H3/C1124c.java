package h3;

import d3.o;
import java.util.List;

/* JADX INFO: renamed from: h3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1124c implements e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1123b f13444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1123b f13445r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1124c(C1123b c1123b, C1123b c1123b2) {
        this.f13444q = c1123b;
        this.f13445r = c1123b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public final d3.e f() {
        return new o(this.f13444q.f(), this.f13445r.f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public final List h() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h3.e
    public final boolean i() {
        return this.f13444q.i() && this.f13445r.i();
    }
}
