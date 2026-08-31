package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f11546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f11547r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f11547r = uVar;
        this.f11546q = materialCalendarGridView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f11546q;
        r rVarA = materialCalendarGridView.a();
        if (i < rVarA.a() || i > rVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((l) this.f11547r.f11551d.f14120q).f11497m0.f11472s.f11479q) {
            throw null;
        }
    }
}
