package com.google.android.material.datepicker;

import O3.D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wnapp.smspariaz.R;
import d2.AbstractC0974V;
import d2.AbstractC1000z;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC1000z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f11466c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A(l lVar) {
        this.f11466c = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC1000z
    public final int a() {
        return this.f11466c.f11497m0.f11475v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC1000z
    public final void c(AbstractC0974V abstractC0974V, int i) {
        l lVar = this.f11466c;
        int i7 = lVar.f11497m0.f11470q.f11536s + i;
        TextView textView = ((z) abstractC0974V).f11556t;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i7)));
        Context context = textView.getContext();
        textView.setContentDescription(y.b().get(1) == i7 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i7)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i7)));
        c cVar = lVar.f11500p0;
        if (y.b().get(1) == i7) {
            D d5 = cVar.f11478b;
        } else {
            D d7 = cVar.f11477a;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC1000z
    public final AbstractC0974V d(ViewGroup viewGroup) {
        return new z((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
