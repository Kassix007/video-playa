package l6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14602c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(ArrayList arrayList) {
        this.f14600a = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        kotlin.jvm.internal.m.e(proxy, "proxy");
        kotlin.jvm.internal.m.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.m.a(name, "supports") && kotlin.jvm.internal.m.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.m.a(name, "unsupported") && kotlin.jvm.internal.m.a(Void.TYPE, returnType)) {
            this.f14601b = true;
            return null;
        }
        boolean zA = kotlin.jvm.internal.m.a(name, "protocols");
        ArrayList arrayList = this.f14600a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.m.a(name, "selectProtocol") || kotlin.jvm.internal.m.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj2 = list.get(i);
                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f14602c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f14602c = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.m.a(name, "protocolSelected") && !kotlin.jvm.internal.m.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f14602c = (String) obj3;
        return null;
    }
}
