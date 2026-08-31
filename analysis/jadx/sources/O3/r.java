package O3;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5035e;
    public final C0325u f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(C0323t0 c0323t0, String str, String str2, String str3, long j, long j7, Bundle bundle) {
        C0325u c0325u;
        AbstractC1887A.d(str2);
        AbstractC1887A.d(str3);
        this.f5031a = str2;
        this.f5032b = str3;
        this.f5033c = true == TextUtils.isEmpty(str) ? null : str;
        this.f5034d = j;
        this.f5035e = j7;
        if (j7 != 0 && j7 > j) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(X.w(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c0325u = new C0325u(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    X x7 = c0323t0.f5077v;
                    C0323t0.l(x7);
                    x7.f4670w.b("Param name can't be null");
                    it.remove();
                } else {
                    Y1 y12 = c0323t0.f5080y;
                    C0323t0.j(y12);
                    Object objV = y12.v(bundle2.get(next), next);
                    if (objV == null) {
                        X x8 = c0323t0.f5077v;
                        C0323t0.l(x8);
                        x8.f4673z.c(c0323t0.f5081z.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        Y1 y13 = c0323t0.f5080y;
                        C0323t0.j(y13);
                        y13.D(bundle2, next, objV);
                    }
                }
            }
            c0325u = new C0325u(bundle2);
        }
        this.f = c0325u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r a(C0323t0 c0323t0, long j) {
        return new r(c0323t0, this.f5033c, this.f5031a, this.f5032b, this.f5034d, j, this.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = this.f.toString();
        String str = this.f5031a;
        int length = String.valueOf(str).length();
        String str2 = this.f5032b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        k1.i.s(sb, "Event{appId='", str, "', name='", str2);
        sb.append("', params=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    public r(C0323t0 c0323t0, String str, String str2, String str3, long j, long j7, C0325u c0325u) {
        AbstractC1887A.d(str2);
        AbstractC1887A.d(str3);
        AbstractC1887A.g(c0325u);
        this.f5031a = str2;
        this.f5032b = str3;
        this.f5033c = true == TextUtils.isEmpty(str) ? null : str;
        this.f5034d = j;
        this.f5035e = j7;
        if (j7 != 0 && j7 > j) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4673z.d(X.w(str2), X.w(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f = c0325u;
    }
}
