package T1;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7427e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7428g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(boolean z5, boolean z6, int i, boolean z7, boolean z8, int i7, int i8) {
        this.f7423a = z5;
        this.f7424b = z6;
        this.f7425c = i;
        this.f7426d = z7;
        this.f7427e = z8;
        this.f = i7;
        this.f7428g = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f7423a == wVar.f7423a && this.f7424b == wVar.f7424b && this.f7425c == wVar.f7425c && this.f7426d == wVar.f7426d && this.f7427e == wVar.f7427e && this.f == wVar.f && this.f7428g == wVar.f7428g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((((((((((((((((this.f7423a ? 1 : 0) * 31) + (this.f7424b ? 1 : 0)) * 31) + this.f7425c) * 923521) + (this.f7426d ? 1 : 0)) * 31) + (this.f7427e ? 1 : 0)) * 31) + this.f) * 31) + this.f7428g) * 31) - 1) * 31) - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w.class.getSimpleName());
        sb.append("(");
        if (this.f7423a) {
            sb.append("launchSingleTop ");
        }
        if (this.f7424b) {
            sb.append("restoreState ");
        }
        int i = this.f7428g;
        int i7 = this.f;
        if (i7 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i7));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
