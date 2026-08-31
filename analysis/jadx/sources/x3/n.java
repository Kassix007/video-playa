package x3;

import java.util.Arrays;
import u3.InterfaceC1696a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC1696a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f18500b = new n(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18501a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [x3.n.<clinit>():void] */
    public /* synthetic */ n(String str) {
        this.f18501a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return AbstractC1887A.j(this.f18501a, ((n) obj).f18501a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18501a});
    }
}
