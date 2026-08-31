package M;

import B0.C0029a;
import m5.C1386y;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N.r f3322c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I0(boolean z5, W0.c cVar, J0 j02, B5.c cVar2, boolean z6) {
        this.f3320a = z5;
        this.f3321b = z6;
        if (z5 && j02 == J0.f3325s) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z6 && j02 == J0.f3323q) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f3322c = new N.r(j02, new C0029a(17, cVar), new A0.d(8, cVar), G0.f3309b, cVar2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object a(I0 i02, J0 j02, s5.i iVar) {
        Object objB = androidx.compose.material3.internal.a.b(i02.f3322c, j02, i02.f3322c.f3975k.e(), iVar);
        return objB == EnumC1580a.f16356q ? objB : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(s5.i iVar) {
        if (this.f3321b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objA = a(this, J0.f3323q, iVar);
        return objA == EnumC1580a.f16356q ? objA : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        return this.f3322c.f3973g.getValue() != J0.f3323q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(s5.i iVar) {
        if (this.f3320a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objA = a(this, J0.f3325s, iVar);
        return objA == EnumC1580a.f16356q ? objA : C1386y.f15098a;
    }
}
