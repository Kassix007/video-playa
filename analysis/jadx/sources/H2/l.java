package H2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class l implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f2155a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w2.g f2156b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H2.i, Y2.c
    public boolean a() {
        boolean z5;
        synchronized (h.f2143a) {
            try {
                int i = h.f2145c;
                h.f2145c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > h.f2146d + ((long) 30000)) {
                    h.f2145c = 0;
                    h.f2146d = SystemClock.uptimeMillis();
                    String[] list = h.f2144b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    h.f2147e = list.length < 800;
                }
                z5 = h.f2147e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H2.i
    public boolean c(E2.h hVar) {
        C3.a aVar = hVar.f1688a;
        if ((aVar instanceof E2.a ? ((E2.a) aVar).f1676t : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        C3.a aVar2 = hVar.f1689b;
        return (aVar2 instanceof E2.a ? ((E2.a) aVar2).f1676t : Integer.MAX_VALUE) > 100;
    }
}
