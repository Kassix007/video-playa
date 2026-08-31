package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import d2.AbstractC0960G;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f11485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f11486s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f(l lVar, u uVar, int i) {
        this.f11484q = i;
        this.f11486s = lVar;
        this.f11485r = uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11484q) {
            case 0:
                l lVar = this.f11486s;
                int iK0 = ((LinearLayoutManager) lVar.f11502r0.getLayoutManager()).K0() - 1;
                if (iK0 >= 0) {
                    Calendar calendarA = y.a(this.f11485r.f11550c.f11470q.f11534q);
                    calendarA.add(2, iK0);
                    lVar.G(new q(calendarA));
                }
                break;
            default:
                l lVar2 = this.f11486s;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar2.f11502r0.getLayoutManager();
                View viewM0 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int iH = (viewM0 == null ? -1 : AbstractC0960G.H(viewM0)) + 1;
                if (iH < lVar2.f11502r0.getAdapter().a()) {
                    Calendar calendarA2 = y.a(this.f11485r.f11550c.f11470q.f11534q);
                    calendarA2.add(2, iH);
                    lVar2.G(new q(calendarA2));
                }
                break;
        }
    }
}
