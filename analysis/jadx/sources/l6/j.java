package l6;

import d6.r;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f14603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f14604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f14605e;
    public final Class f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f14606g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f14603c = method;
        this.f14604d = method2;
        this.f14605e = method3;
        this.f = cls;
        this.f14606g = cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f14605e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((r) obj) != r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n5.m.c0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((r) obj2).f12412q);
        }
        try {
            this.f14603c.invoke(null, sSLSocket, Proxy.newProxyInstance(m.class.getClassLoader(), new Class[]{this.f, this.f14606g}, new i(arrayList2)));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f14604d.invoke(null, sSLSocket));
            kotlin.jvm.internal.m.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z5 = iVar.f14601b;
            if (!z5 && iVar.f14602c == null) {
                m.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z5) {
                return null;
            }
            return iVar.f14602c;
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        }
    }
}
