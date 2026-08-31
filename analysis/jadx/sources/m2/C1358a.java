package m2;

import C2.e;
import E3.h;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.wnapp.smspariaz.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: m2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1358a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile C1358a f15050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f15051e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15054c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f15053b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15052a = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1358a(Context context) {
        this.f15054c = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1358a c(Context context) {
        if (f15050d == null) {
            synchronized (f15051e) {
                try {
                    if (f15050d == null) {
                        f15050d = new C1358a(context);
                    }
                } finally {
                }
            }
        }
        return f15050d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f15054c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f15053b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1359b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new e(e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f15052a;
        if (h.E()) {
            try {
                Trace.beginSection(h.O(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1359b interfaceC1359b = (InterfaceC1359b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = interfaceC1359b.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = interfaceC1359b.create(this.f15054c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new e(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
