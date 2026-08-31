package d6;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f12445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f12446c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(a aVar, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.m.e(socketAddress, "socketAddress");
        this.f12444a = aVar;
        this.f12445b = proxy;
        this.f12446c = socketAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m.a(xVar.f12444a, this.f12444a) && kotlin.jvm.internal.m.a(xVar.f12445b, this.f12445b) && kotlin.jvm.internal.m.a(xVar.f12446c, this.f12446c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12446c.hashCode() + ((this.f12445b.hashCode() + ((this.f12444a.hashCode() + 527) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Route{" + this.f12446c + '}';
    }
}
