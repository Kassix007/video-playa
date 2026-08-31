package a5;

import M.AbstractC0235x;
import P.C0371o;
import android.graphics.Color;
import c0.C0722j;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import j0.AbstractC1145B;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f8952r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n(String str, int i) {
        this.f8951q = i;
        this.f8952r = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8951q) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    D5.a.c(AbstractC0836n2.F(R.drawable.chevron_up, c0371o, 0), null, androidx.compose.foundation.layout.c.f9279c, null, null, 0.0f, new j0.j(AbstractC1145B.b(Color.parseColor(this.f8952r)), 5), c0371o, 432, 56);
                } else {
                    c0371o.N();
                }
                break;
            default:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0371o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC0235x.a(AbstractC0836n2.F(R.drawable.baseline_arrow_back_ios, c0371o2, 6), androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.c.c(C0722j.f10095q, 30), 4), AbstractC1145B.b(Color.parseColor(this.f8952r)), c0371o2, 432);
                } else {
                    c0371o2.N();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
