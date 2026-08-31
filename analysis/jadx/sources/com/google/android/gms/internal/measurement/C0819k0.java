package com.google.android.gms.internal.measurement;

import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0819k0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f10882u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10883v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10884w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0819k0(C0863t0 c0863t0, G g7, int i) {
        super(c0863t0, true);
        this.f10882u = g7;
        this.f10883v = i;
        Objects.requireNonNull(c0863t0);
        this.f10884w = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        J j = this.f10884w.f;
        AbstractC1887A.g(j);
        j.getTestFlag(this.f10882u, this.f10883v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void b() {
        this.f10882u.a(null);
    }
}
