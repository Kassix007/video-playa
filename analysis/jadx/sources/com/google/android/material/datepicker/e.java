package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.wnapp.smspariaz.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11480d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f11481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11483c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f11480d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e() {
        Calendar calendarC = y.c(null);
        this.f11481a = calendarC;
        this.f11482b = calendarC.getMaximum(7);
        this.f11483c = calendarC.getFirstDayOfWeek();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f11482b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i7 = this.f11482b;
        if (i >= i7) {
            return null;
        }
        int i8 = i + this.f11483c;
        if (i8 > i7) {
            i8 -= i7;
        }
        return Integer.valueOf(i8);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i7 = i + this.f11483c;
        int i8 = this.f11482b;
        if (i7 > i8) {
            i7 -= i8;
        }
        Calendar calendar = this.f11481a;
        calendar.set(7, i7);
        textView.setText(calendar.getDisplayName(7, f11480d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar calendarC = y.c(null);
        this.f11481a = calendarC;
        this.f11482b = calendarC.getMaximum(7);
        this.f11483c = i;
    }
}
