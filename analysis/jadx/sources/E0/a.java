package E0;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1611a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [E0.a.a(boolean, int, int, int, int):E0.a] */
    public /* synthetic */ a(Object obj) {
        this.f1611a = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a a(boolean z5, int i, int i7, int i8, int i9) {
        return new a(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i7, i8, i9, false, z5));
    }
}
