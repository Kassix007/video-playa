package Q2;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f6579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I2.m f6580d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(String str, String str2, s sVar, I2.m mVar) {
        this.f6577a = str;
        this.f6578b = str2;
        this.f6579c = sVar;
        this.f6580d = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.f6577a, tVar.f6577a) && kotlin.jvm.internal.m.a(this.f6578b, tVar.f6578b) && kotlin.jvm.internal.m.a(this.f6579c, tVar.f6579c) && kotlin.jvm.internal.m.a(this.f6580d, tVar.f6580d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6580d.f2367a.hashCode() + ((this.f6579c.f6576a.hashCode() + S.h(this.f6578b, this.f6577a.hashCode() * 31, 31)) * 961);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NetworkRequest(url=" + this.f6577a + ", method=" + this.f6578b + ", headers=" + this.f6579c + ", body=null, extras=" + this.f6580d + ')';
    }
}
