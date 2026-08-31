package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class o<S> extends v {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f11531l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public b f11532m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f2723v;
        }
        this.f11531l0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f11532m0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(i(), this.f11531l0));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f11531l0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11532m0);
    }
}
