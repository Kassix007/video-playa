package p3;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r0 implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f15831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15832e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15834h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r0(z0 z0Var, J j) {
        ArrayList arrayList = new ArrayList();
        this.f15828a = arrayList;
        this.f15831d = null;
        this.f15832e = false;
        this.f = true;
        this.f15833g = -1;
        if (j == null) {
            return;
        }
        j.n(this);
        if (this.f15834h) {
            this.f15831d.b((s0) arrayList.get(this.f15833g));
            arrayList.set(this.f15833g, this.f15831d);
            this.f15834h = false;
        }
        s0 s0Var = this.f15831d;
        if (s0Var != null) {
            arrayList.add(s0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void a(float f, float f7) {
        boolean z5 = this.f15834h;
        ArrayList arrayList = this.f15828a;
        if (z5) {
            this.f15831d.b((s0) arrayList.get(this.f15833g));
            arrayList.set(this.f15833g, this.f15831d);
            this.f15834h = false;
        }
        s0 s0Var = this.f15831d;
        if (s0Var != null) {
            arrayList.add(s0Var);
        }
        this.f15829b = f;
        this.f15830c = f7;
        this.f15831d = new s0(f, f7, 0.0f, 0.0f);
        this.f15833g = arrayList.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void b(float f, float f7, float f8, float f9, float f10, float f11) {
        if (this.f || this.f15832e) {
            this.f15831d.a(f, f7);
            this.f15828a.add(this.f15831d);
            this.f15832e = false;
        }
        this.f15831d = new s0(f10, f11, f10 - f8, f11 - f9);
        this.f15834h = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void c(float f, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        this.f15832e = true;
        this.f = false;
        s0 s0Var = this.f15831d;
        z0.f(s0Var.f15836a, s0Var.f15837b, f, f7, f8, z5, z6, f9, f10, this);
        this.f = true;
        this.f15834h = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void close() {
        this.f15828a.add(this.f15831d);
        e(this.f15829b, this.f15830c);
        this.f15834h = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void d(float f, float f7, float f8, float f9) {
        this.f15831d.a(f, f7);
        this.f15828a.add(this.f15831d);
        this.f15831d = new s0(f8, f9, f8 - f, f9 - f7);
        this.f15834h = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.K
    public final void e(float f, float f7) {
        this.f15831d.a(f, f7);
        this.f15828a.add(this.f15831d);
        s0 s0Var = this.f15831d;
        this.f15831d = new s0(f, f7, f - s0Var.f15836a, f7 - s0Var.f15837b);
        this.f15834h = false;
    }
}
