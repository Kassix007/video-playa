package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.wnapp.smspariaz.R;
import d2.AbstractC0974V;
import d2.AbstractC1000z;
import d2.C0961H;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC1000z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.c f11551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11552e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(ContextThemeWrapper contextThemeWrapper, b bVar, k3.c cVar) {
        q qVar = bVar.f11470q;
        q qVar2 = bVar.f11471r;
        q qVar3 = bVar.f11473t;
        if (qVar.f11534q.compareTo(qVar3.f11534q) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (qVar3.f11534q.compareTo(qVar2.f11534q) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f11552e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * r.f11541d) + (n.J(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f11550c = bVar;
        this.f11551d = cVar;
        if (this.f12222a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f12223b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC1000z
    public final int a() {
        return this.f11550c.f11476w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC1000z
    public final long b(int i) {
        Calendar calendarA = y.a(this.f11550c.f11470q.f11534q);
        calendarA.add(2, i);
        calendarA.set(5, 1);
        Calendar calendarA2 = y.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC1000z
    public final void c(AbstractC0974V abstractC0974V, int i) {
        t tVar = (t) abstractC0974V;
        b bVar = this.f11550c;
        Calendar calendarA = y.a(bVar.f11470q.f11534q);
        calendarA.add(2, i);
        q qVar = new q(calendarA);
        tVar.f11548t.setText(qVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) tVar.f11549u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !qVar.equals(materialCalendarGridView.a().f11543a)) {
            new r(qVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC1000z
    public final AbstractC0974V d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!n.J(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0961H(-1, this.f11552e));
        return new t(linearLayout, true);
    }
}
