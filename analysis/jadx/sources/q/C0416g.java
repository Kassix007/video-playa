package Q;

import P.D0;
import P.InterfaceC0347c;
import java.util.List;

/* JADX INFO: renamed from: Q.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0416g extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0416g f6501c = new C0416g(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        int i = ((X.f) j.d(0)).f8141a;
        List list = (List) j.d(1);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            int i8 = i + i7;
            interfaceC0347c.c(i8, obj);
            interfaceC0347c.h(i8, obj);
        }
    }
}
