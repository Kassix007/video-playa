package com.google.android.gms.internal.measurement;

import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0774b0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10802u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f10803v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10804w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0774b0(C0863t0 c0863t0, String str, int i) {
        super(c0863t0, true);
        this.f10802u = i;
        switch (i) {
            case 1:
                this.f10803v = str;
                Objects.requireNonNull(c0863t0);
                this.f10804w = c0863t0;
                super(c0863t0, true);
                break;
            case 2:
                this.f10803v = str;
                Objects.requireNonNull(c0863t0);
                this.f10804w = c0863t0;
                super(c0863t0, true);
                break;
            default:
                this.f10803v = str;
                Objects.requireNonNull(c0863t0);
                this.f10804w = c0863t0;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        switch (this.f10802u) {
            case 0:
                J j = this.f10804w.f;
                AbstractC1887A.g(j);
                j.setUserId(this.f10803v, this.f10999q);
                break;
            case 1:
                J j7 = this.f10804w.f;
                AbstractC1887A.g(j7);
                j7.beginAdUnitExposure(this.f10803v, this.f11000r);
                break;
            default:
                J j8 = this.f10804w.f;
                AbstractC1887A.g(j8);
                j8.endAdUnitExposure(this.f10803v, this.f11000r);
                break;
        }
    }
}
