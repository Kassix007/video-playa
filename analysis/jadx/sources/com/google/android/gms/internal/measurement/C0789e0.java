package com.google.android.gms.internal.measurement;

import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0789e0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f10829u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10830v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0789e0(C0863t0 c0863t0, long j) {
        super(c0863t0, true);
        this.f10829u = j;
        Objects.requireNonNull(c0863t0);
        this.f10830v = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        J j = this.f10830v.f;
        AbstractC1887A.g(j);
        j.setSessionTimeoutDuration(this.f10829u);
    }
}
