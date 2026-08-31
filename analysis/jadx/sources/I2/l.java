package I2;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;
import u4.C1702e;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l f2364b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2365a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [I2.l.a(int, int, int):I2.l] */
    public /* synthetic */ l(Object obj) {
        this.f2365a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static l a(int i, int i7, int i8) {
        return new l(AccessibilityNodeInfo.CollectionInfo.obtain(i, i7, false, i8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public l() {
        this.f2365a = new Object();
        new Handler(Looper.getMainLooper(), new C1702e(0, this));
    }
}
