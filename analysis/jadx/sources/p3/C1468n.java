package p3;

import java.util.ArrayList;

/* JADX INFO: renamed from: p3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1468n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f15795c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f15796d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1468n(int i, String str) {
        this.f15793a = 0;
        this.f15794b = null;
        this.f15793a = i == 0 ? 1 : i;
        this.f15794b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str, String str2, int i) {
        if (this.f15795c == null) {
            this.f15795c = new ArrayList();
        }
        this.f15795c.add(new C1447b(str, str2, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f15793a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.f15794b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList arrayList = this.f15795c;
        int i7 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                C1447b c1447b = (C1447b) obj;
                sb.append('[');
                String str2 = c1447b.f15752a;
                String str3 = c1447b.f15754c;
                sb.append(str2);
                int iA = O.c.a(c1447b.f15753b);
                if (iA == 1) {
                    sb.append('=');
                    sb.append(str3);
                } else if (iA == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (iA == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList arrayList2 = this.f15796d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                sb.append(':');
                sb.append((InterfaceC1453e) obj2);
            }
        }
        return sb.toString();
    }
}
