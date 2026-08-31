package w;

import java.util.Collection;
import v0.C1737f;
import v0.C1743l;

/* JADX INFO: renamed from: w.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1810u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18077a = ((float) 0.125d) / 18;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public static final boolean a(C1737f c1737f, long j) {
        Object obj;
        ?? r62 = c1737f.f17451a;
        int size = ((Collection) r62).size();
        boolean z5 = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i);
            if (v0.v.d(((C1743l) obj).f17460a, j)) {
                break;
            }
            i++;
        }
        C1743l c1743l = (C1743l) obj;
        if (c1743l != null && c1743l.f17463d) {
            z5 = true;
        }
        return true ^ z5;
    }
}
