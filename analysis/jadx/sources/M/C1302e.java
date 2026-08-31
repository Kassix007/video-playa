package m;

import android.content.Context;
import android.view.View;
import com.wnapp.smspariaz.R;
import i1.C1134a;
import l.AbstractC1217t;
import l.MenuC1209l;
import l.SubMenuC1197D;

/* JADX INFO: renamed from: m.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1302e extends l.v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14772l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1312j f14773m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302e(C1312j c1312j, Context context, MenuC1209l menuC1209l, View view) {
        super(context, menuC1209l, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f14773m = c1312j;
        this.f = 8388613;
        C1134a c1134a = c1312j.f14808N;
        this.f14418h = c1134a;
        AbstractC1217t abstractC1217t = this.i;
        if (abstractC1217t != null) {
            abstractC1217t.f(c1134a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.v
    public final void c() {
        switch (this.f14772l) {
            case 0:
                C1312j c1312j = this.f14773m;
                c1312j.f14805K = null;
                c1312j.f14809O = 0;
                super.c();
                break;
            default:
                C1312j c1312j2 = this.f14773m;
                MenuC1209l menuC1209l = c1312j2.f14812s;
                if (menuC1209l != null) {
                    menuC1209l.c(true);
                }
                c1312j2.f14804J = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302e(C1312j c1312j, Context context, SubMenuC1197D subMenuC1197D, View view) {
        super(context, subMenuC1197D, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f14773m = c1312j;
        if ((subMenuC1197D.f14290A.f14398x & 32) != 32) {
            View view2 = c1312j.f14819z;
            this.f14416e = view2 == null ? (View) c1312j.f14817x : view2;
        }
        C1134a c1134a = c1312j.f14808N;
        this.f14418h = c1134a;
        AbstractC1217t abstractC1217t = this.i;
        if (abstractC1217t != null) {
            abstractC1217t.f(c1134a);
        }
    }
}
