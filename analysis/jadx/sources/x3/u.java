package x3;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f18519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1893e f18521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f18523e;
    public final /* synthetic */ AbstractC1893e f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(AbstractC1893e abstractC1893e, int i, Bundle bundle) {
        this.f = abstractC1893e;
        Boolean bool = Boolean.TRUE;
        this.f18521c = abstractC1893e;
        this.f18519a = bool;
        this.f18520b = false;
        this.f18522d = i;
        this.f18523e = bundle;
    }

    public abstract void a(com.google.android.gms.common.b bVar);

    public abstract boolean b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        synchronized (this) {
            this.f18519a = null;
        }
        synchronized (this.f18521c.f18419B) {
            this.f18521c.f18419B.remove(this);
        }
    }
}
