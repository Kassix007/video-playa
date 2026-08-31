package y4;

import android.app.PendingIntent;

/* JADX INFO: renamed from: y4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1917a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f18621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PendingIntent f18622e;
    public boolean f = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1917a(int i, int i7, int i8, long j, long j7, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f18618a = i;
        this.f18619b = i7;
        this.f18620c = i8;
        this.f18621d = pendingIntent;
        this.f18622e = pendingIntent2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final PendingIntent a(m mVar) {
        PendingIntent pendingIntent;
        int i = mVar.f18651a;
        if (i == 0) {
            PendingIntent pendingIntent2 = this.f18622e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i != 1 || (pendingIntent = this.f18621d) == null) {
            return null;
        }
        return pendingIntent;
    }
}
