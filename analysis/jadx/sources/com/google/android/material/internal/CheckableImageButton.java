package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.i;
import l4.C1231a;
import m.C1336v;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C1336v implements Checkable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f11558w = {R.attr.state_checked};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11561v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wnapp.smspariaz.R.attr.imageButtonStyle);
        this.f11560u = true;
        this.f11561v = true;
        AbstractC1835K.m(this, new i(2, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11559t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f11559t ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f11558w) : super.onCreateDrawableState(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1231a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1231a c1231a = (C1231a) parcelable;
        super.onRestoreInstanceState(c1231a.f1163q);
        setChecked(c1231a.f14499s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1231a c1231a = new C1231a(super.onSaveInstanceState());
        c1231a.f14499s = this.f11559t;
        return c1231a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckable(boolean z5) {
        if (this.f11560u != z5) {
            this.f11560u = z5;
            sendAccessibilityEvent(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (!this.f11560u || this.f11559t == z5) {
            return;
        }
        this.f11559t = z5;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPressable(boolean z5) {
        this.f11561v = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setPressed(boolean z5) {
        if (this.f11561v) {
            super.setPressed(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11559t);
    }
}
