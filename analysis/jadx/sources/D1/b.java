package D1;

import android.graphics.Rect;
import java.util.Comparator;
import s4.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1334a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1335b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1337d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(boolean z5, e eVar) {
        this.f1336c = z5;
        this.f1337d = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1337d.getClass();
        Rect rect = this.f1334a;
        ((x1.e) obj).f(rect);
        Rect rect2 = this.f1335b;
        ((x1.e) obj2).f(rect2);
        int i = rect.top;
        int i7 = rect2.top;
        if (i < i7) {
            return -1;
        }
        if (i > i7) {
            return 1;
        }
        int i8 = rect.left;
        int i9 = rect2.left;
        boolean z5 = this.f1336c;
        if (i8 < i9) {
            return z5 ? 1 : -1;
        }
        if (i8 > i9) {
            return z5 ? -1 : 1;
        }
        int i10 = rect.bottom;
        int i11 = rect2.bottom;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.right;
        int i13 = rect2.right;
        if (i12 < i13) {
            return z5 ? 1 : -1;
        }
        if (i12 > i13) {
            return z5 ? -1 : 1;
        }
        return 0;
    }
}
