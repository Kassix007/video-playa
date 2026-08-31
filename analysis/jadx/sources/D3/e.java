package d3;

import O3.D;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1002b f12232c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z.m f12234e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12230a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12231b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12233d = 0.0f;
    public Object f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12235g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12236h = -1.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(List list) {
        InterfaceC1002b dVar;
        if (list.isEmpty()) {
            dVar = new D(20);
        } else {
            dVar = list.size() == 1 ? new d(list) : new C1003c(list);
        }
        this.f12232c = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(InterfaceC1001a interfaceC1001a) {
        this.f12230a.add(interfaceC1001a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float b() {
        if (this.f12236h == -1.0f) {
            this.f12236h = this.f12232c.a();
        }
        return this.f12236h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c() {
        Interpolator interpolator;
        C1415a c1415aF = this.f12232c.f();
        if (c1415aF == null || c1415aF.c() || (interpolator = c1415aF.f15415d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d() {
        if (this.f12231b) {
            return 0.0f;
        }
        C1415a c1415aF = this.f12232c.f();
        if (c1415aF.c()) {
            return 0.0f;
        }
        return (this.f12233d - c1415aF.b()) / (c1415aF.a() - c1415aF.b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object e() {
        float fD = d();
        Z.m mVar = this.f12234e;
        InterfaceC1002b interfaceC1002b = this.f12232c;
        if (mVar == null && interfaceC1002b.c(fD) && !k()) {
            return this.f;
        }
        C1415a c1415aF = interfaceC1002b.f();
        Interpolator interpolator = c1415aF.f15416e;
        Interpolator interpolator2 = c1415aF.f;
        Object objF = (interpolator == null || interpolator2 == null) ? f(c1415aF, c()) : g(c1415aF, fD, interpolator.getInterpolation(fD), interpolator2.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(C1415a c1415a, float f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object g(C1415a c1415a, float f, float f7, float f8) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12230a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC1001a) arrayList.get(i)).b();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(float f) {
        InterfaceC1002b interfaceC1002b = this.f12232c;
        if (interfaceC1002b.isEmpty()) {
            return;
        }
        if (this.f12235g == -1.0f) {
            this.f12235g = interfaceC1002b.d();
        }
        float f7 = this.f12235g;
        if (f < f7) {
            if (f7 == -1.0f) {
                this.f12235g = interfaceC1002b.d();
            }
            f = this.f12235g;
        } else if (f > b()) {
            f = b();
        }
        if (f == this.f12233d) {
            return;
        }
        this.f12233d = f;
        if (interfaceC1002b.h(f)) {
            h();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Z.m mVar) {
        Z.m mVar2 = this.f12234e;
        if (mVar2 != null) {
            mVar2.getClass();
        }
        this.f12234e = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean k() {
        return false;
    }
}
