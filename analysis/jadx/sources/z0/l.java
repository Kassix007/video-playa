package Z0;

import B0.AbstractC0041g;
import B0.L;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import c0.AbstractC0724l;
import h0.AbstractC1111d;
import h0.C1115h;
import h0.InterfaceC1114g;
import i0.C1131c;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f8367a = new k();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Rect b(InterfaceC1114g interfaceC1114g, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        h0.o oVarG = AbstractC1111d.g(((C1115h) interfaceC1114g).f13411d);
        C1131c c1131cJ = oVarG != null ? AbstractC1111d.j(oVarG) : null;
        if (c1131cJ == null) {
            return null;
        }
        int i = (int) c1131cJ.f13522a;
        int i7 = iArr[0];
        int i8 = iArr2[0];
        int i9 = (int) c1131cJ.f13523b;
        int i10 = iArr[1];
        int i11 = iArr2[1];
        return new Rect((i + i7) - i8, (i9 + i10) - i11, (((int) c1131cJ.f13524c) + i7) - i8, (((int) c1131cJ.f13525d) + i10) - i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final View c(AbstractC0724l abstractC0724l) {
        r rVar = AbstractC0041g.u(abstractC0724l.f10100q).f252E;
        View interopView = rVar != null ? rVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(r rVar, L l7) {
        long jF = l7.f268U.f430b.F(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jF >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jF & 4294967295L)));
        rVar.layout(iRound, iRound2, rVar.getMeasuredWidth() + iRound, rVar.getMeasuredHeight() + iRound2);
    }
}
