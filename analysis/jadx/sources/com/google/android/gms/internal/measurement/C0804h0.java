package com.google.android.gms.internal.measurement;

import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0804h0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G f10858v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10859w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0804h0(C0863t0 c0863t0, G g7, int i, boolean z5) {
        super(c0863t0, true);
        this.f10857u = i;
        this.f10858v = g7;
        this.f10859w = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        switch (this.f10857u) {
            case 0:
                J j = this.f10859w.f;
                AbstractC1887A.g(j);
                j.getGmpAppId(this.f10858v);
                break;
            case 1:
                J j7 = this.f10859w.f;
                AbstractC1887A.g(j7);
                j7.getCachedAppInstanceId(this.f10858v);
                break;
            case 2:
                J j8 = this.f10859w.f;
                AbstractC1887A.g(j8);
                j8.generateEventId(this.f10858v);
                break;
            case 3:
                J j9 = this.f10859w.f;
                AbstractC1887A.g(j9);
                j9.getCurrentScreenName(this.f10858v);
                break;
            case 4:
                J j10 = this.f10859w.f;
                AbstractC1887A.g(j10);
                j10.getCurrentScreenClass(this.f10858v);
                break;
            case 5:
                J j11 = this.f10859w.f;
                AbstractC1887A.g(j11);
                j11.getAppInstanceId(this.f10858v);
                break;
            default:
                J j12 = this.f10859w.f;
                AbstractC1887A.g(j12);
                j12.getSessionId(this.f10858v);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void b() {
        switch (this.f10857u) {
            case 0:
                this.f10858v.a(null);
                break;
            case 1:
                this.f10858v.a(null);
                break;
            case 2:
                this.f10858v.a(null);
                break;
            case 3:
                this.f10858v.a(null);
                break;
            case 4:
                this.f10858v.a(null);
                break;
            case 5:
                this.f10858v.a(null);
                break;
            default:
                this.f10858v.a(null);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0804h0(C0863t0 c0863t0, G g7, int i) {
        super(c0863t0, true);
        this.f10857u = i;
        switch (i) {
            case 1:
                this.f10858v = g7;
                Objects.requireNonNull(c0863t0);
                this.f10859w = c0863t0;
                super(c0863t0, true);
                break;
            case 2:
                this.f10858v = g7;
                Objects.requireNonNull(c0863t0);
                this.f10859w = c0863t0;
                super(c0863t0, true);
                break;
            case 3:
                this.f10858v = g7;
                Objects.requireNonNull(c0863t0);
                this.f10859w = c0863t0;
                super(c0863t0, true);
                break;
            case 4:
                this.f10858v = g7;
                Objects.requireNonNull(c0863t0);
                this.f10859w = c0863t0;
                super(c0863t0, true);
                break;
            default:
                this.f10858v = g7;
                Objects.requireNonNull(c0863t0);
                this.f10859w = c0863t0;
                break;
        }
    }
}
