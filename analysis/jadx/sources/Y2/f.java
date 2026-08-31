package Y2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y2.c
    public final boolean a() {
        boolean z5;
        synchronized (b.f8201a) {
            try {
                int i = b.f8203c;
                b.f8203c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > b.f8204d + ((long) 30000)) {
                    b.f8203c = 0;
                    b.f8204d = SystemClock.uptimeMillis();
                    String[] list = b.f8202b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    b.f8205e = list.length < 800;
                }
                z5 = b.f8205e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y2.c
    public final boolean b(V2.h hVar) {
        V2.c cVar = hVar.f7965a;
        if ((cVar instanceof V2.a ? ((V2.a) cVar).f7957a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        V2.c cVar2 = hVar.f7966b;
        return (cVar2 instanceof V2.a ? ((V2.a) cVar2).f7957a : Integer.MAX_VALUE) > 100;
    }
}
