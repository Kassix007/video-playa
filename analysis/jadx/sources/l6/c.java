package l6;

import O3.B;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import m6.n;
import m6.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f14592e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m6.i f14594d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        boolean z5 = false;
        if (B.l() && Build.VERSION.SDK_INT < 30) {
            z5 = true;
        }
        f14592e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c() throws NoSuchMethodException {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e7) {
            m.f14610a.getClass();
            m.i("unable to load android socket classes", 5, e7);
            oVar = null;
        }
        int i = 0;
        ArrayList arrayListM0 = n5.k.M0(new n[]{oVar, new m6.m(m6.f.f), new m6.m(m6.k.f15115a), new m6.m(m6.h.f15111a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListM0.size();
        while (i < size) {
            Object obj = arrayListM0.get(i);
            i++;
            if (((n) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f14593c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f14594d = new m6.i(method3, method2, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final d b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        m6.b bVar = x509TrustManagerExtensions != null ? new m6.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new p6.a(c(x509TrustManager));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final p6.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.m.e(protocols, "protocols");
        ArrayList arrayList = this.f14593c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((n) obj).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, protocols);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final void e(Socket socket, InetSocketAddress address, int i) throws IOException {
        kotlin.jvm.internal.m.e(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f14593c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((n) obj).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.b(sSLSocket);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final Object g() {
        m6.i iVar = this.f14594d;
        iVar.getClass();
        Method method = iVar.f15112a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = iVar.f15113b;
                kotlin.jvm.internal.m.b(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final boolean h(String hostname) {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.m
    public final void j(Object obj, String message) {
        kotlin.jvm.internal.m.e(message, "message");
        m6.i iVar = this.f14594d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f15114c;
                kotlin.jvm.internal.m.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        m.i(message, 5, null);
    }
}
