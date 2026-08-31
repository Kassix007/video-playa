package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f10780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10781w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0863t0 c0863t0, Bundle bundle, int i) {
        super(c0863t0, true);
        this.f10779u = i;
        switch (i) {
            case 1:
                this.f10780v = bundle;
                Objects.requireNonNull(c0863t0);
                this.f10781w = c0863t0;
                super(c0863t0, true);
                break;
            case 2:
                this.f10780v = bundle;
                Objects.requireNonNull(c0863t0);
                this.f10781w = c0863t0;
                super(c0863t0, true);
                break;
            default:
                this.f10780v = bundle;
                Objects.requireNonNull(c0863t0);
                this.f10781w = c0863t0;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        switch (this.f10779u) {
            case 0:
                J j = this.f10781w.f;
                AbstractC1887A.g(j);
                j.setConditionalUserProperty(this.f10780v, this.f10999q);
                break;
            case 1:
                J j7 = this.f10781w.f;
                AbstractC1887A.g(j7);
                j7.setConsentThirdParty(this.f10780v, this.f10999q);
                break;
            default:
                J j8 = this.f10781w.f;
                AbstractC1887A.g(j8);
                j8.setDefaultEventParameters(this.f10780v);
                break;
        }
    }
}
