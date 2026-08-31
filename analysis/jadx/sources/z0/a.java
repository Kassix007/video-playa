package Z0;

import B0.C0056v;
import a1.C0615h;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.K1;
import java.util.List;
import w1.Q;
import w1.o0;
import z0.AbstractC1938O;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8316t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        super(1);
        this.f8315s = i;
        this.f8316t = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final o0 d(o0 o0Var, List list) {
        switch (this.f8315s) {
            case 0:
                return ((r) this.f8316t).n(o0Var);
            default:
                C0615h c0615h = (C0615h) this.f8316t;
                if (c0615h.f8734B) {
                    return o0Var;
                }
                View childAt = c0615h.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c0615h.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c0615h.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? o0Var : o0Var.f18232a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.Q
    public final v3.l e(v3.l lVar) {
        switch (this.f8315s) {
            case 0:
                C0056v c0056v = ((r) this.f8316t).f8356O.f268U.f430b;
                if (!c0056v.f517a0.f10099D) {
                    return lVar;
                }
                long jK = K1.K(c0056v.F(0L));
                int i = (int) (jK >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i7 = (int) (jK & 4294967295L);
                if (i7 < 0) {
                    i7 = 0;
                }
                long jE = AbstractC1938O.f(c0056v).E();
                int i8 = (int) (jE >> 32);
                int i9 = (int) (jE & 4294967295L);
                long j = c0056v.f18666s;
                long jK2 = K1.K(c0056v.F((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i10 = i8 - ((int) (jK2 >> 32));
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = i9 - ((int) (4294967295L & jK2));
                int i12 = i11 >= 0 ? i11 : 0;
                return (i == 0 && i7 == 0 && i10 == 0 && i12 == 0) ? lVar : new v3.l(2, j.m((n1.b) lVar.f17579r, i, i7, i10, i12), j.m((n1.b) lVar.f17580s, i, i7, i10, i12));
            default:
                C0615h c0615h = (C0615h) this.f8316t;
                if (c0615h.f8734B) {
                    return lVar;
                }
                View childAt = c0615h.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c0615h.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c0615h.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return lVar;
                }
                n1.b bVarB = n1.b.b(iMax, iMax2, iMax3, iMax4);
                int i13 = bVarB.f15125a;
                n1.b bVar = (n1.b) lVar.f17579r;
                int i14 = bVarB.f15126b;
                int i15 = bVarB.f15127c;
                int i16 = bVarB.f15128d;
                return new v3.l(2, o0.e(bVar, i13, i14, i15, i16), o0.e((n1.b) lVar.f17580s, i13, i14, i15, i16));
        }
    }
}
