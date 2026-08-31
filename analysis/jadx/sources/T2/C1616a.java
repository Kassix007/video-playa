package t2;

import a.AbstractC0597a;
import android.content.Context;

/* JADX INFO: renamed from: t2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1616a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1616a f16674a = new C1616a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l f16675b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final l a(Context context) {
        l lVar = f16675b;
        if (lVar != null) {
            return lVar;
        }
        synchronized (f16674a) {
            l lVar2 = f16675b;
            if (lVar2 != null) {
                return lVar2;
            }
            context.getApplicationContext();
            l lVarU = AbstractC0597a.u(context);
            f16675b = lVarU;
            return lVarU;
        }
    }
}
