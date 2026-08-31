package j0;

import android.graphics.Path;
import android.graphics.RectF;
import i0.C1131c;

/* JADX INFO: renamed from: j0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1152g implements InterfaceC1144A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f13707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f13708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f13709c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1152g(Path path) {
        this.f13707a = path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1131c b() {
        if (this.f13708b == null) {
            this.f13708b = new RectF();
        }
        RectF rectF = this.f13708b;
        kotlin.jvm.internal.m.b(rectF);
        this.f13707a.computeBounds(rectF, true);
        return new C1131c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(InterfaceC1144A interfaceC1144A, InterfaceC1144A interfaceC1144A2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(interfaceC1144A instanceof C1152g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C1152g) interfaceC1144A).f13707a;
        if (interfaceC1144A2 instanceof C1152g) {
            return this.f13707a.op(path, ((C1152g) interfaceC1144A2).f13707a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        this.f13707a.reset();
    }
}
