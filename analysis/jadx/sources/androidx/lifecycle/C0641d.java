package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0641d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0641d f9534c = new C0641d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9535a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9536b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(HashMap map, C0640c c0640c, EnumC0652o enumC0652o, Class cls) {
        EnumC0652o enumC0652o2 = (EnumC0652o) map.get(c0640c);
        if (enumC0652o2 == null || enumC0652o == enumC0652o2) {
            if (enumC0652o2 == null) {
                map.put(c0640c, enumC0652o);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0640c.f9530b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0652o2 + ", new value " + enumC0652o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0639b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f9535a;
        if (superclass != null) {
            C0639b c0639bA = (C0639b) map2.get(superclass);
            if (c0639bA == null) {
                c0639bA = a(superclass, null);
            }
            map.putAll(c0639bA.f9526b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0639b c0639bA2 = (C0639b) map2.get(cls2);
            if (c0639bA2 == null) {
                c0639bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0639bA2.f9526b.entrySet()) {
                b(map, (C0640c) entry.getKey(), (EnumC0652o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            L l7 = (L) method.getAnnotation(L.class);
            if (l7 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0660x.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0652o enumC0652oValue = l7.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0652o.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0652oValue != EnumC0652o.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0640c(i, method), enumC0652oValue, cls);
                z5 = true;
            }
        }
        C0639b c0639b = new C0639b(map);
        map2.put(cls, c0639b);
        this.f9536b.put(cls, Boolean.valueOf(z5));
        return c0639b;
    }
}
