package C3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f1186b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f1187a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c cVar = new c();
        cVar.f1187a = null;
        f1186b = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b a(Context context) {
        b bVar;
        c cVar = f1186b;
        synchronized (cVar) {
            try {
                if (cVar.f1187a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f1187a = new b(context);
                }
                bVar = cVar.f1187a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
