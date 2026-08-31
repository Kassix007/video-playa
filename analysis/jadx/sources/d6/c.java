package d6;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f12305n = new c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f12306o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12311e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12313h;
    public final int i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f12314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f12315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f12316m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        f12306o = new c(false, false, -1, -1, false, false, false, seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(boolean z5, boolean z6, int i, int i7, boolean z7, boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, String str) {
        this.f12307a = z5;
        this.f12308b = z6;
        this.f12309c = i;
        this.f12310d = i7;
        this.f12311e = z7;
        this.f = z8;
        this.f12312g = z9;
        this.f12313h = i8;
        this.i = i9;
        this.j = z10;
        this.f12314k = z11;
        this.f12315l = z12;
        this.f12316m = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = this.f12316m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f12307a) {
            sb.append("no-cache, ");
        }
        if (this.f12308b) {
            sb.append("no-store, ");
        }
        int i = this.f12309c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i7 = this.f12310d;
        if (i7 != -1) {
            sb.append("s-maxage=");
            sb.append(i7);
            sb.append(", ");
        }
        if (this.f12311e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.f12312g) {
            sb.append("must-revalidate, ");
        }
        int i8 = this.f12313h;
        if (i8 != -1) {
            sb.append("max-stale=");
            sb.append(i8);
            sb.append(", ");
        }
        int i9 = this.i;
        if (i9 != -1) {
            sb.append("min-fresh=");
            sb.append(i9);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.f12314k) {
            sb.append("no-transform, ");
        }
        if (this.f12315l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f12316m = string;
        return string;
    }
}
