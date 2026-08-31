package S1;

import J1.J;
import androidx.lifecycle.f0;
import r.S;

/* JADX INFO: loaded from: classes.dex */
public class a extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f7304c = new J(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f7305b = new S(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.f0
    public final void b() {
        S s6 = this.f7305b;
        if (s6.f() > 0) {
            s6.g(0).getClass();
            throw new ClassCastException();
        }
        int i = s6.f16170t;
        Object[] objArr = s6.f16169s;
        for (int i7 = 0; i7 < i; i7++) {
            objArr[i7] = null;
        }
        s6.f16170t = 0;
        s6.f16167q = false;
    }
}
