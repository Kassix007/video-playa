package f2;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f12702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f12704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f12705t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(int i, int i7, String str, String str2) {
        this.f12702q = i;
        this.f12703r = i7;
        this.f12704s = str;
        this.f12705t = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        m.e(other, "other");
        int i = this.f12702q - other.f12702q;
        return i == 0 ? this.f12703r - other.f12703r : i;
    }
}
