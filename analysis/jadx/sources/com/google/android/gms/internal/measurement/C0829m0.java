package com.google.android.gms.internal.measurement;

import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0829m0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10903u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC0849q0 f10904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10905w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0829m0(C0863t0 c0863t0, BinderC0849q0 binderC0849q0, int i) {
        super(c0863t0, true);
        this.f10903u = i;
        switch (i) {
            case 1:
                this.f10904v = binderC0849q0;
                Objects.requireNonNull(c0863t0);
                this.f10905w = c0863t0;
                super(c0863t0, true);
                break;
            default:
                this.f10904v = binderC0849q0;
                Objects.requireNonNull(c0863t0);
                this.f10905w = c0863t0;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        switch (this.f10903u) {
            case 0:
                J j = this.f10905w.f;
                AbstractC1887A.g(j);
                j.registerOnMeasurementEventListener(this.f10904v);
                break;
            default:
                J j7 = this.f10905w.f;
                AbstractC1887A.g(j7);
                j7.unregisterOnMeasurementEventListener(this.f10904v);
                break;
        }
    }
}
