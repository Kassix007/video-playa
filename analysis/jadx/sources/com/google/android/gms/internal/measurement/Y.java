package com.google.android.gms.internal.measurement;

import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10766u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f10767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f10768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f10769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10771z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0863t0 c0863t0, String str, String str2, Object obj, boolean z5) {
        super(c0863t0, true);
        this.f10767v = str;
        this.f10768w = str2;
        this.f10771z = obj;
        this.f10769x = z5;
        Objects.requireNonNull(c0863t0);
        this.f10770y = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        switch (this.f10766u) {
            case 0:
                J j = this.f10770y.f;
                AbstractC1887A.g(j);
                j.setUserProperty(this.f10767v, this.f10768w, new D3.b(this.f10771z), this.f10769x, this.f10999q);
                break;
            default:
                J j7 = this.f10770y.f;
                AbstractC1887A.g(j7);
                j7.getUserProperties(this.f10767v, this.f10768w, this.f10769x, (G) this.f10771z);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public void b() {
        switch (this.f10766u) {
            case 1:
                ((G) this.f10771z).a(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0863t0 c0863t0, String str, String str2, boolean z5, G g7) {
        super(c0863t0, true);
        this.f10767v = str;
        this.f10768w = str2;
        this.f10769x = z5;
        this.f10771z = g7;
        Objects.requireNonNull(c0863t0);
        this.f10770y = c0863t0;
    }
}
