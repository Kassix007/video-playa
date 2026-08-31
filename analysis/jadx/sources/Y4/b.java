package Y4;

import a.AbstractC0597a;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import m5.C1386y;
import org.json.JSONObject;
import y4.C1917a;
import y4.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f8271r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(d dVar, int i) {
        this.f8270q = i;
        this.f8271r = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        C1917a c1917a = (C1917a) obj;
        switch (this.f8270q) {
            case 0:
                d dVar = this.f8271r;
                int i = dVar.j.f18651a;
                if (i == 0) {
                    if (c1917a.f18620c == 11) {
                        dVar.a();
                    }
                } else if (i == 1 && c1917a.f18619b == 3) {
                    dVar.b(c1917a, m.a(1).a());
                }
                break;
            case 1:
                d dVar2 = this.f8271r;
                k3.c cVar = dVar2.f8279h;
                String string = ((SharedPreferences) cVar.f14120q).getString("STORED_DATE", "");
                if (string == null) {
                    string = "";
                }
                if (!J5.m.U0(string)) {
                    String string2 = ((SharedPreferences) cVar.f14120q).getString("STORED_DATE", "");
                    if (string2 == null) {
                        string2 = "";
                    }
                    if (!J5.m.U0(string2)) {
                        String string3 = ((SharedPreferences) cVar.f14120q).getString("STORED_DATE", "");
                        String str = string3 != null ? string3 : "";
                        String strB = AbstractC0597a.B();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date date = simpleDateFormat.parse(strB);
                        kotlin.jvm.internal.m.b(date);
                        Date date2 = simpleDateFormat.parse(str);
                        kotlin.jvm.internal.m.b(date2);
                        if (((int) ((date.getTime() - date2.getTime()) / ((long) 86400000))) == 0 && c1917a.f18619b == 2) {
                            dVar2.b(c1917a, dVar2.j);
                        }
                    }
                } else if (c1917a.f18619b == 2) {
                    dVar2.b(c1917a, dVar2.j);
                }
                break;
            case 2:
                int i7 = c1917a.f18619b;
                d dVar3 = this.f8271r;
                if (i7 == 2) {
                    JSONObject jSONObject = dVar3.f8277e;
                    jSONObject.put("isUpdateAvailable", true);
                    jSONObject.put("latestVersion", c1917a.f18618a);
                    dVar3.f8275c.invoke(jSONObject);
                } else {
                    dVar3.f8277e.put("isUpdateAvailable", false);
                    dVar3.f8275c.invoke(dVar3.f8277e);
                }
                break;
            default:
                if (c1917a.f18619b == 2) {
                    d dVar4 = this.f8271r;
                    dVar4.f = true;
                    dVar4.b(c1917a, dVar4.j);
                }
                break;
        }
        return C1386y.f15098a;
    }
}
