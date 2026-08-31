package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import d2.AbstractC0960G;
import d2.AbstractC0963J;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0963J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f11491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f11492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f11493c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(l lVar, u uVar, MaterialButton materialButton) {
        this.f11493c = lVar;
        this.f11491a = uVar;
        this.f11492b = materialButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0963J
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f11492b.getText());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0963J
    public final void b(RecyclerView recyclerView, int i, int i7) {
        int iK0;
        b bVar = this.f11491a.f11550c;
        l lVar = this.f11493c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar.f11502r0.getLayoutManager();
            View viewM0 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
            iK0 = viewM0 == null ? -1 : AbstractC0960G.H(viewM0);
        } else {
            iK0 = ((LinearLayoutManager) lVar.f11502r0.getLayoutManager()).K0();
        }
        Calendar calendarA = y.a(bVar.f11470q.f11534q);
        calendarA.add(2, iK0);
        lVar.f11498n0 = new q(calendarA);
        Calendar calendarA2 = y.a(bVar.f11470q.f11534q);
        calendarA2.add(2, iK0);
        calendarA2.set(5, 1);
        Calendar calendarA3 = y.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = y.f11555a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f11492b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
