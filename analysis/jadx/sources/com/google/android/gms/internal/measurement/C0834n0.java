package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0834n0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10912A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Long f10913u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f10914v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f10915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Bundle f10916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f10917y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f10918z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0834n0(C0863t0 c0863t0, Long l7, String str, String str2, Bundle bundle, boolean z5, boolean z6) {
        super(c0863t0, true);
        this.f10913u = l7;
        this.f10914v = str;
        this.f10915w = str2;
        this.f10916x = bundle;
        this.f10917y = z5;
        this.f10918z = z6;
        this.f10912A = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        Long l7 = this.f10913u;
        long jLongValue = l7 == null ? this.f10999q : l7.longValue();
        J j = this.f10912A.f;
        AbstractC1887A.g(j);
        j.logEvent(this.f10914v, this.f10915w, this.f10916x, this.f10917y, this.f10918z, jLongValue);
    }
}
