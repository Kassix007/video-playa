package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.wnapp.smspariaz.R;
import d2.AbstractC0974V;
import java.util.WeakHashMap;
import w1.AbstractC1835K;
import w1.C1860x;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0974V {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f11548t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f11549u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(LinearLayout linearLayout, boolean z5) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f11548t = textView;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        new C1860x(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(textView, Boolean.TRUE);
        this.f11549u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z5) {
            return;
        }
        textView.setVisibility(8);
    }
}
