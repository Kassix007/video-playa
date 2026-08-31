package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0639b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9525a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9526b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0639b(HashMap map) {
        this.f9526b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0652o enumC0652o = (EnumC0652o) entry.getValue();
            List arrayList = (List) this.f9525a.get(enumC0652o);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f9525a.put(enumC0652o, arrayList);
            }
            arrayList.add((C0640c) entry.getKey());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(List list, InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0640c c0640c = (C0640c) list.get(size);
                Method method = c0640c.f9530b;
                try {
                    int i = c0640c.f9529a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC0660x);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC0660x, enumC0652o);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to call observer method", e8.getCause());
                }
            }
        }
    }
}
