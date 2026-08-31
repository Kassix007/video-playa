package g3;

import C0.S;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f13056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f13057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13059e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(ArrayList arrayList, char c7, double d5, String str, String str2) {
        this.f13055a = arrayList;
        this.f13056b = c7;
        this.f13057c = d5;
        this.f13058d = str;
        this.f13059e = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(char c7, String str, String str2) {
        return str2.hashCode() + S.h(str, c7 * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return a(this.f13056b, this.f13059e, this.f13058d);
    }
}
