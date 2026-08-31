package m6;

import O3.B;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public class f implements n {
    public static final e f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f15106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f15107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f15108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f15109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f15110e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(Class cls) throws NoSuchMethodException {
        this.f15106a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.m.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f15107b = declaredMethod;
        this.f15108c = cls.getMethod("setHostname", String.class);
        this.f15109d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f15110e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m6.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f15106a.isInstance(sSLSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m6.n
    public final String b(SSLSocket sSLSocket) {
        if (this.f15106a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f15109d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, J5.a.f2809a);
                }
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                Throwable cause = e8.getCause();
                if (!(cause instanceof NullPointerException) || !kotlin.jvm.internal.m.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e8);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m6.n
    public final boolean c() {
        boolean z5 = l6.c.f14592e;
        return l6.c.f14592e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m6.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (this.f15106a.isInstance(sSLSocket)) {
            try {
                this.f15107b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f15108c.invoke(sSLSocket, str);
                }
                Method method = this.f15110e;
                l6.m mVar = l6.m.f14610a;
                method.invoke(sSLSocket, B.e(protocols));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }
}
