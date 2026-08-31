package O3;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class U0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f4624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f4625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f4626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f4627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f4628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f4629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f4630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0271b1 f4631x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U0(C0271b1 c0271b1, String str, String str2, long j, Bundle bundle, boolean z5, boolean z6, boolean z7) {
        this.f4624q = str;
        this.f4625r = str2;
        this.f4626s = j;
        this.f4627t = bundle;
        this.f4628u = z5;
        this.f4629v = z6;
        this.f4630w = z7;
        this.f4631x = c0271b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f4631x.x(this.f4624q, this.f4625r, this.f4626s, this.f4627t, this.f4628u, this.f4629v, this.f4630w);
    }
}
