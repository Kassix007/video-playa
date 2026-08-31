package a1;

import P.C0371o;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: renamed from: a1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613f extends n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0613f f8731q = new C0613f(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0371o c0371o = (C0371o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
            c0371o.N();
        }
        return C1386y.f15098a;
    }
}
