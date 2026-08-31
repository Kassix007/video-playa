package E1;

import android.os.Trace;
import com.google.android.gms.internal.measurement.T1;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ q f1654r = new q(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1655q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [E1.q.<clinit>():void] */
    public /* synthetic */ q(int i) {
        this.f1655q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1655q) {
            case 0:
                try {
                    int i = r1.g.f16278a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (l.c()) {
                        l.a().d();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i7 = r1.g.f16278a;
                    Trace.endSection();
                    throw th;
                }
            default:
                T1.i.incrementAndGet();
                return;
        }
    }
}
