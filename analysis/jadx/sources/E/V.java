package E;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final V f1512q = new V(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        Map mapB = ((W) obj2).b();
        if (mapB.isEmpty()) {
            return null;
        }
        return mapB;
    }
}
