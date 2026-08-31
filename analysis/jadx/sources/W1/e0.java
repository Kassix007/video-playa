package w1;

import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f18196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n1.b[] f18197b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e0() {
        this(new o0((o0) null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        n1.b[] bVarArr = this.f18197b;
        if (bVarArr != null) {
            n1.b bVarG = bVarArr[0];
            n1.b bVarG2 = bVarArr[1];
            o0 o0Var = this.f18196a;
            if (bVarG2 == null) {
                bVarG2 = o0Var.f18232a.g(2);
            }
            if (bVarG == null) {
                bVarG = o0Var.f18232a.g(1);
            }
            g(n1.b.a(bVarG, bVarG2));
            n1.b bVar = this.f18197b[AbstractC1918b.t(16)];
            if (bVar != null) {
                f(bVar);
            }
            n1.b bVar2 = this.f18197b[AbstractC1918b.t(32)];
            if (bVar2 != null) {
                d(bVar2);
            }
            n1.b bVar3 = this.f18197b[AbstractC1918b.t(64)];
            if (bVar3 != null) {
                h(bVar3);
            }
        }
    }

    public abstract o0 b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(int i, n1.b bVar) {
        if (this.f18197b == null) {
            this.f18197b = new n1.b[10];
        }
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i & i7) != 0) {
                this.f18197b[AbstractC1918b.t(i7)] = bVar;
            }
        }
    }

    public abstract void e(n1.b bVar);

    public abstract void g(n1.b bVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public e0(o0 o0Var) {
        this.f18196a = o0Var;
    }

    public void d(n1.b bVar) {
    }

    public void f(n1.b bVar) {
    }

    public void h(n1.b bVar) {
    }
}
