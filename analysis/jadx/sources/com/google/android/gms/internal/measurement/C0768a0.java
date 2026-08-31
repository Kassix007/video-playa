package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0768a0 extends AbstractRunnableC0839o0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10785u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f10786v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f10787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f10788x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f10789y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0768a0(C0863t0 c0863t0, X x6, String str, String str2) {
        super(c0863t0, true);
        this.f10789y = x6;
        this.f10786v = str;
        this.f10787w = str2;
        Objects.requireNonNull(c0863t0);
        this.f10788x = c0863t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public final void a() {
        switch (this.f10785u) {
            case 0:
                J j = this.f10788x.f;
                AbstractC1887A.g(j);
                j.clearConditionalUserProperty(this.f10786v, this.f10787w, (Bundle) this.f10789y);
                break;
            case 1:
                J j7 = this.f10788x.f;
                AbstractC1887A.g(j7);
                j7.getConditionalUserProperties(this.f10786v, this.f10787w, (G) this.f10789y);
                break;
            default:
                J j8 = this.f10788x.f;
                AbstractC1887A.g(j8);
                j8.setCurrentScreenByScionActivityInfo((X) this.f10789y, this.f10786v, this.f10787w, this.f10999q);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0839o0
    public void b() {
        switch (this.f10785u) {
            case 1:
                ((G) this.f10789y).a(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0768a0(C0863t0 c0863t0, String str, String str2, Bundle bundle) {
        super(c0863t0, true);
        this.f10786v = str;
        this.f10787w = str2;
        this.f10789y = bundle;
        Objects.requireNonNull(c0863t0);
        this.f10788x = c0863t0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0768a0(C0863t0 c0863t0, String str, String str2, G g7) {
        super(c0863t0, true);
        this.f10786v = str;
        this.f10787w = str2;
        this.f10789y = g7;
        Objects.requireNonNull(c0863t0);
        this.f10788x = c0863t0;
    }
}
