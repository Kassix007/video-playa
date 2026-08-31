package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d2.C0971S;

/* JADX INFO: loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f11487E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ l f11488F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, int i, int i7) {
        super(i);
        this.f11488F = lVar;
        this.f11487E = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(C0971S c0971s, int[] iArr) {
        int i = this.f11487E;
        l lVar = this.f11488F;
        if (i == 0) {
            iArr[0] = lVar.f11502r0.getWidth();
            iArr[1] = lVar.f11502r0.getWidth();
        } else {
            iArr[0] = lVar.f11502r0.getHeight();
            iArr[1] = lVar.f11502r0.getHeight();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final void x0(RecyclerView recyclerView, int i) {
        w wVar = new w(recyclerView.getContext());
        wVar.f12201a = i;
        y0(wVar);
    }
}
