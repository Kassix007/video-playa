package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import h.C1103e;
import k.AbstractC1168a;
import l.C1211n;
import m.C1281T0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements View.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11495r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k(int i, Object obj) {
        this.f11494q = i;
        this.f11495r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f11494q) {
            case 0:
                l lVar = (l) this.f11495r;
                int i = lVar.f11499o0;
                if (i == 2) {
                    lVar.H(1);
                } else if (i == 1) {
                    lVar.H(2);
                }
                break;
            case 1:
                C1103e c1103e = (C1103e) this.f11495r;
                Message messageObtain = (view != c1103e.f13273g || (message3 = c1103e.i) == null) ? (view != c1103e.j || (message2 = c1103e.f13276l) == null) ? (view != c1103e.f13277m || (message = c1103e.f13279o) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c1103e.f13266C.obtainMessage(1, c1103e.f13269b).sendToTarget();
                break;
            case 2:
                ((AbstractC1168a) this.f11495r).a();
                break;
            case 3:
                C1281T0 c1281t0 = ((Toolbar) this.f11495r).f9199e0;
                C1211n c1211n = c1281t0 == null ? null : c1281t0.f14710r;
                if (c1211n != null) {
                    c1211n.collapseActionView();
                }
                break;
            default:
                C1211n itemData = ((n4.c) view).getItemData();
                b4.b bVar = (b4.b) this.f11495r;
                if (!bVar.f15265U.q(itemData, bVar.f15264T, 0)) {
                    itemData.setChecked(true);
                }
                break;
        }
    }
}
