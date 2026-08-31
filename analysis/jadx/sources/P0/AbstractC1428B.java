package p0;

import l0.InterfaceC1221d;
import m0.C1346a;

/* JADX INFO: renamed from: p0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1428B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B5.c f15475a;

    public abstract void a(InterfaceC1221d interfaceC1221d);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B5.c b() {
        return this.f15475a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        B5.c cVarB = b();
        if (cVarB != null) {
            cVarB.invoke(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(C1346a c1346a) {
        this.f15475a = c1346a;
    }
}
