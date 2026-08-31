package O3;

import B0.C0050o;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4350d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D1(E1 e12) {
        this.f4350d = e12;
        C0323t0 c0323t0 = (C0323t0) e12.f4346r;
        this.f4349c = new C1(this, c0323t0, 0);
        c0323t0.f5052A.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f4347a = jElapsedRealtime;
        this.f4348b = jElapsedRealtime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(Object obj, Object obj2, P2.d dVar) {
        P2.d dVar2 = (P2.d) obj2;
        ((B2.g) ((C0050o) this.f4350d).f499q).d((P2.a) obj, dVar2.f5621a, dVar2.f5622b, dVar2.f5623c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long b() {
        if (this.f4348b == -1) {
            long jC = 0;
            for (Map.Entry entry : ((LinkedHashMap) this.f4349c).entrySet()) {
                jC += c(entry.getKey(), entry.getValue());
            }
            this.f4348b = jC;
        }
        return this.f4348b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long c(Object obj, Object obj2) throws Exception {
        try {
            long j = ((P2.d) obj2).f5623c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e7) {
            this.f4348b = -1L;
            throw e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f4349c;
        while (b() > j) {
            if (linkedHashMap.isEmpty()) {
                if (b() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) n5.l.k0(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f4348b = b() - c(key, value);
            a(key, value, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean e(boolean z5, boolean z6, long j) {
        E1 e12 = (E1) this.f4350d;
        e12.o();
        e12.p();
        C0323t0 c0323t0 = (C0323t0) e12.f4346r;
        boolean zA = c0323t0.a();
        X x6 = c0323t0.f5077v;
        if (zA) {
            C0288h0 c0288h0 = c0323t0.f5076u;
            C0323t0.j(c0288h0);
            C0282f0 c0282f0 = c0288h0.f4883G;
            c0323t0.f5052A.getClass();
            c0282f0.b(System.currentTimeMillis());
        }
        long j7 = j - this.f4347a;
        if (!z5 && j7 < 1000) {
            C0323t0.l(x6);
            x6.f4666E.c(Long.valueOf(j7), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z6) {
            j7 = j - this.f4348b;
            this.f4348b = j;
        }
        C0323t0.l(x6);
        x6.f4666E.c(Long.valueOf(j7), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j7);
        boolean z7 = !c0323t0.f5075t.C();
        C0304m1 c0304m1 = c0323t0.f5053B;
        C0323t0.k(c0304m1);
        Y1.f0(c0304m1.u(z7), bundle, true);
        if (!z6) {
            C0271b1 c0271b1 = c0323t0.f5054C;
            C0323t0.k(c0271b1);
            c0271b1.v("auto", "_e", bundle);
        }
        this.f4347a = j;
        C1 c12 = (C1) this.f4349c;
        c12.c();
        c12.b(((Long) F.f4452q0.a(null)).longValue());
        return true;
    }

    public D1(long j, C0050o c0050o) {
        this.f4350d = c0050o;
        this.f4347a = j;
        this.f4349c = new LinkedHashMap(0, 0.75f, true);
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
