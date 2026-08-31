package M;

import P.C0363k;
import P.C0371o;
import P.C0372o0;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: M.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0201c f3440a = new C0201c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f3441b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        float f = O.k.f4180a;
        float f7 = O.k.f4182c;
        f3441b = 640;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(InterfaceC0725m interfaceC0725m, float f, float f7, j0.E e7, long j, C0371o c0371o, int i) {
        float f8;
        float f9;
        j0.E e8;
        long jE;
        InterfaceC0725m interfaceC0725m2;
        j0.E e9;
        long j7;
        InterfaceC0725m interfaceC0725m3;
        float f10;
        float f11;
        c0371o.U(-1364277227);
        if (((i | 9654) & 9363) == 9362 && c0371o.x()) {
            c0371o.N();
            interfaceC0725m3 = interfaceC0725m;
            f10 = f;
            f11 = f7;
            e9 = e7;
            j7 = j;
        } else {
            c0371o.P();
            if ((i & 1) == 0 || c0371o.w()) {
                float f12 = O.k.f4181b;
                float f13 = O.k.f4180a;
                H.d dVar = ((C0) c0371o.k(D0.f3295a)).f3292e;
                f8 = f12;
                f9 = f13;
                e8 = dVar;
                jE = AbstractC0217k.e(19, c0371o);
                interfaceC0725m2 = C0722j.f10095q;
            } else {
                c0371o.N();
                interfaceC0725m2 = interfaceC0725m;
                f8 = f;
                f9 = f7;
                e8 = e7;
                jE = j;
            }
            c0371o.q();
            String strA = N.s.a(R.string.m3c_bottom_sheet_drag_handle_description, c0371o);
            InterfaceC0725m interfaceC0725mC = androidx.compose.foundation.layout.b.c(interfaceC0725m2, 0.0f, G0.f3308a, 1);
            boolean zG = c0371o.g(strA);
            Object objH = c0371o.H();
            if (zG || objH == C0363k.f5418a) {
                objH = new I0.k(strA, 1);
                c0371o.d0(objH);
            }
            L0.a(I0.j.a(interfaceC0725mC, false, (B5.c) objH), e8, jE, 0L, 0.0f, 0.0f, X.k.d(-1039573072, new C0197a(f8, f9), c0371o), c0371o, 12582912, 120);
            e9 = e8;
            j7 = jE;
            interfaceC0725m3 = interfaceC0725m2;
            f10 = f8;
            f11 = f9;
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0199b(this, interfaceC0725m3, f10, f11, e9, j7, i);
        }
    }
}
