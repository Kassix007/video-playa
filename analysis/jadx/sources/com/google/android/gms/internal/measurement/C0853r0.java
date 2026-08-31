package com.google.android.gms.internal.measurement;

import android.app.Activity;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0853r0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f11020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0858s0 f11021w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0853r0(C0858s0 c0858s0, Activity activity, int i) {
        super(c0858s0.f11030q, true);
        this.f11019u = i;
        switch (i) {
            case 1:
                this.f11020v = activity;
                this.f11021w = c0858s0;
                super(c0858s0.f11030q, true);
                break;
            case 2:
                this.f11020v = activity;
                this.f11021w = c0858s0;
                super(c0858s0.f11030q, true);
                break;
            case 3:
                this.f11020v = activity;
                this.f11021w = c0858s0;
                super(c0858s0.f11030q, true);
                break;
            case 4:
                this.f11020v = activity;
                this.f11021w = c0858s0;
                super(c0858s0.f11030q, true);
                break;
            default:
                this.f11020v = activity;
                this.f11021w = c0858s0;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        switch (this.f11019u) {
            case 0:
                J j = this.f11021w.f11030q.f;
                AbstractC1887A.g(j);
                j.onActivityStartedByScionActivityInfo(X.W(this.f11020v), this.f11000r);
                break;
            case 1:
                J j7 = this.f11021w.f11030q.f;
                AbstractC1887A.g(j7);
                j7.onActivityResumedByScionActivityInfo(X.W(this.f11020v), this.f11000r);
                break;
            case 2:
                J j8 = this.f11021w.f11030q.f;
                AbstractC1887A.g(j8);
                j8.onActivityPausedByScionActivityInfo(X.W(this.f11020v), this.f11000r);
                break;
            case 3:
                J j9 = this.f11021w.f11030q.f;
                AbstractC1887A.g(j9);
                j9.onActivityStoppedByScionActivityInfo(X.W(this.f11020v), this.f11000r);
                break;
            default:
                J j10 = this.f11021w.f11030q.f;
                AbstractC1887A.g(j10);
                j10.onActivityDestroyedByScionActivityInfo(X.W(this.f11020v), this.f11000r);
                break;
        }
    }
}
