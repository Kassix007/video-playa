package O3;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4617q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f4620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f4621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f4622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f4623w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U(X x6, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f4618r = i;
        this.f4619s = str;
        this.f4620t = obj;
        this.f4621u = obj2;
        this.f4622v = obj3;
        this.f4623w = x6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4617q) {
            case 0:
                X x6 = (X) this.f4623w;
                C0288h0 c0288h0 = ((C0323t0) x6.f4346r).f5076u;
                C0323t0.j(c0288h0);
                if (!c0288h0.f4356s) {
                    Log.println(6, x6.y(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (x6.f4667t == 0) {
                    C0284g c0284g = ((C0323t0) x6.f4346r).f5075t;
                    if (c0284g.f4858v == null) {
                        synchronized (c0284g) {
                            try {
                                if (c0284g.f4858v == null) {
                                    C0323t0 c0323t0 = (C0323t0) c0284g.f4346r;
                                    ApplicationInfo applicationInfo = c0323t0.f5072q.getApplicationInfo();
                                    String strA = B3.b.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c0284g.f4858v = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (c0284g.f4858v == null) {
                                        c0284g.f4858v = Boolean.TRUE;
                                        X x7 = c0323t0.f5077v;
                                        C0323t0.l(x7);
                                        x7.f4670w.b("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c0284g.f4858v.booleanValue()) {
                        x6.f4667t = 'C';
                    } else {
                        x6.f4667t = 'c';
                    }
                    break;
                }
                if (x6.f4668u < 0) {
                    ((C0323t0) x6.f4346r).f5075t.t();
                    x6.f4668u = 130000L;
                }
                int i = this.f4618r;
                char c7 = x6.f4667t;
                long j = x6.f4668u;
                String str2 = this.f4619s;
                Object obj = this.f4620t;
                Object obj2 = this.f4621u;
                Object obj3 = this.f4622v;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strZ = X.z(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c7).length() + String.valueOf(j).length() + 1 + strZ.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c7);
                sb.append(j);
                sb.append(":");
                sb.append(strZ);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                C0285g0 c0285g0 = c0288h0.f4895v;
                if (c0285g0 != null) {
                    String str3 = (String) c0285g0.f4862d;
                    C0288h0 c0288h02 = (C0288h0) c0285g0.f4863e;
                    c0288h02.o();
                    if (((C0288h0) c0285g0.f4863e).s().getLong((String) c0285g0.f4860b, 0L) == 0) {
                        c0285g0.d();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesS = c0288h02.s();
                    String str4 = (String) c0285g0.f4861c;
                    long j7 = sharedPreferencesS.getLong(str4, 0L);
                    if (j7 <= 0) {
                        SharedPreferences.Editor editorEdit = c0288h02.s().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    Y1 y12 = ((C0323t0) c0288h02.f4346r).f5080y;
                    C0323t0.j(y12);
                    long jNextLong = y12.l0().nextLong() & Long.MAX_VALUE;
                    long j8 = j7 + 1;
                    long j9 = Long.MAX_VALUE / j8;
                    SharedPreferences.Editor editorEdit2 = c0288h02.s().edit();
                    if (jNextLong < j9) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j8);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((Z) this.f4620t).e(this.f4619s, this.f4618r, (Throwable) this.f4621u, (byte[]) this.f4622v, (Map) this.f4623w);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ U(String str, Z z5, int i, IOException iOException, byte[] bArr, Map map) {
        AbstractC1887A.g(z5);
        this.f4620t = z5;
        this.f4618r = i;
        this.f4621u = iOException;
        this.f4622v = bArr;
        this.f4619s = str;
        this.f4623w = map;
    }
}
