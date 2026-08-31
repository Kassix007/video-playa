package com.google.android.gms.internal.measurement;

import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0824l0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f10891u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10892v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824l0(C0863t0 c0863t0, boolean z5) {
        super(c0863t0, true);
        this.f10891u = z5;
        this.f10892v = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        J j = this.f10892v.f;
        AbstractC1887A.g(j);
        j.setDataCollectionEnabled(this.f10891u);
    }
}
