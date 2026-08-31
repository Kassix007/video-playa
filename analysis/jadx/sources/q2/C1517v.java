package q2;

import C0.S;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: q2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1517v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f16003b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16002a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16004c = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1517v(View view) {
        this.f16003b = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1517v)) {
            return false;
        }
        C1517v c1517v = (C1517v) obj;
        return this.f16003b == c1517v.f16003b && this.f16002a.equals(c1517v.f16002a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f16002a.hashCode() + (this.f16003b.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strL = S.l(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f16003b + "\n", "    values:");
        HashMap map = this.f16002a;
        for (String str : map.keySet()) {
            strL = strL + "    " + str + ": " + map.get(str) + "\n";
        }
        return strL;
    }
}
