package com.google.android.gms.internal.measurement;

import android.content.Intent;
import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0779c0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f10815w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0779c0(C0863t0 c0863t0, Object obj, int i) {
        super(c0863t0, true);
        this.f10813u = i;
        this.f10815w = obj;
        this.f10814v = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        switch (this.f10813u) {
            case 0:
                J j = this.f10814v.f;
                AbstractC1887A.g(j);
                j.setMeasurementEnabled(((Boolean) this.f10815w).booleanValue(), this.f10999q);
                break;
            case 1:
                J j7 = this.f10814v.f;
                AbstractC1887A.g(j7);
                j7.retrieveAndUploadBatches(new BinderC0799g0(this, (I4.a) this.f10815w));
                break;
            case 2:
                J j8 = this.f10814v.f;
                AbstractC1887A.g(j8);
                j8.setEventInterceptor((BinderC0844p0) this.f10815w);
                break;
            default:
                J j9 = this.f10814v.f;
                AbstractC1887A.g(j9);
                j9.setSgtmDebugInfo((Intent) this.f10815w);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779c0(C0863t0 c0863t0, BinderC0844p0 binderC0844p0) {
        super(c0863t0, true);
        this.f10813u = 2;
        this.f10815w = binderC0844p0;
        Objects.requireNonNull(c0863t0);
        this.f10814v = c0863t0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779c0(C0863t0 c0863t0, Boolean bool) {
        super(c0863t0, true);
        this.f10813u = 0;
        this.f10815w = bool;
        Objects.requireNonNull(c0863t0);
        this.f10814v = c0863t0;
    }
}
