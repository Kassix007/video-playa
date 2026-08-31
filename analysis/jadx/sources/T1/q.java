package T1;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f7407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f7409c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7410d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f7411e = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(z zVar, String str) {
        this.f7407a = zVar;
        this.f7408b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p a() {
        p pVarB = b();
        pVarB.getClass();
        W1.l lVar = pVarB.f7404r;
        Iterator it = this.f7409c.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String argumentName = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            kotlin.jvm.internal.m.e(argumentName, "argumentName");
            kotlin.jvm.internal.m.e(null, "argument");
            throw null;
        }
        ArrayList arrayList = this.f7410d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final n navDeepLink = (n) obj;
            kotlin.jvm.internal.m.e(navDeepLink, "navDeepLink");
            lVar.getClass();
            final int i7 = 0;
            ArrayList arrayListB = AbstractC0836n2.B((LinkedHashMap) lVar.f8094d, new B5.c() { // from class: W1.k
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.c
                public final Object invoke(Object obj2) {
                    boolean zContains;
                    String key = (String) obj2;
                    switch (i7) {
                        case 0:
                            kotlin.jvm.internal.m.e(key, "key");
                            zContains = navDeepLink.c().contains(key);
                            break;
                        default:
                            kotlin.jvm.internal.m.e(key, "key");
                            zContains = navDeepLink.c().contains(key);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListB.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + navDeepLink.f7388a + " can't be used to open destination " + ((p) lVar.f8092b) + ".\nFollowing required arguments are missing: " + arrayListB).toString());
            }
            ((ArrayList) lVar.f8093c).add(navDeepLink);
        }
        Iterator it2 = this.f7411e.entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            kotlin.jvm.internal.m.e(null, "action");
            throw null;
        }
        String str = this.f7408b;
        if (str != null) {
            lVar.getClass();
            if (J5.m.U0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(str);
            kotlin.jvm.internal.m.e(uriPattern, "uriPattern");
            final n nVar = new n(uriPattern);
            final int i8 = 1;
            ArrayList arrayListB2 = AbstractC0836n2.B((LinkedHashMap) lVar.f8094d, new B5.c() { // from class: W1.k
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.c
                public final Object invoke(Object obj2) {
                    boolean zContains;
                    String key = (String) obj2;
                    switch (i8) {
                        case 0:
                            kotlin.jvm.internal.m.e(key, "key");
                            zContains = nVar.c().contains(key);
                            break;
                        default:
                            kotlin.jvm.internal.m.e(key, "key");
                            zContains = nVar.c().contains(key);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListB2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + ((p) lVar.f8092b) + ". Following required arguments are missing: " + arrayListB2).toString());
            }
            lVar.f = AbstractC1362a.d(new I2.d(8, uriPattern));
            lVar.f8091a = uriPattern.hashCode();
            lVar.f8095e = str;
        }
        return pVarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p b() {
        return this.f7407a.a();
    }
}
