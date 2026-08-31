package kotlin.jvm.internal;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements H5.c, e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map f14260r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Class f14261q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List listA = AbstractC0836n2.A(B5.a.class, B5.c.class, B5.e.class, B5.f.class, B5.g.class, X.b.class, B5.h.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, B5.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, X.b.class, B5.d.class);
        ArrayList arrayList = new ArrayList(n5.m.c0(listA, 10));
        int i = 0;
        for (Object obj : listA) {
            int i7 = i + 1;
            if (i < 0) {
                AbstractC0836n2.N();
                throw null;
            }
            arrayList.add(new C1371j((Class) obj, Integer.valueOf(i)));
            i = i7;
        }
        f14260r = n5.x.N(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(Class jClass) {
        m.e(jClass, "jClass");
        this.f14261q = jClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f14261q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        String strC;
        Class jClass = this.f14261q;
        m.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strC2 = B.c(jClass.getName());
            return strC2 == null ? jClass.getCanonicalName() : strC2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strC = B.c(componentType.getName())) != null) {
            strConcat = strC.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c() {
        String strE;
        Class jClass = this.f14261q;
        m.e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strE2 = B.e(jClass.getName());
                return strE2 == null ? jClass.getSimpleName() : strE2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strE = B.e(componentType.getName())) != null) {
                strConcat = strE.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return J5.m.h1(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return J5.m.g1('$', simpleName, simpleName);
        }
        return J5.m.h1(simpleName, enclosingConstructor.getName() + '$');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(Object obj) {
        Class jClass = this.f14261q;
        m.e(jClass, "jClass");
        Map map = f14260r;
        m.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return B.d(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC0836n2.t(z.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof f) && AbstractC0836n2.t(this).equals(AbstractC0836n2.t((H5.c) obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0836n2.t(this).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14261q + " (Kotlin reflection is not available)";
    }
}
