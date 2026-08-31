package d6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12337a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f12340d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i a() {
        return new i(this.f12337a, this.f12338b, (String[]) this.f12339c, (String[]) this.f12340d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(g... cipherSuites) {
        kotlin.jvm.internal.m.e(cipherSuites, "cipherSuites");
        if (!this.f12337a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (g gVar : cipherSuites) {
            arrayList.add(gVar.f12336a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(String... cipherSuites) {
        kotlin.jvm.internal.m.e(cipherSuites, "cipherSuites");
        if (!this.f12337a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f12339c = (String[]) cipherSuites.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(y... yVarArr) {
        if (!this.f12337a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(yVarArr.length);
        for (y yVar : yVarArr) {
            arrayList.add(yVar.f12453q);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... tlsVersions) {
        kotlin.jvm.internal.m.e(tlsVersions, "tlsVersions");
        if (!this.f12337a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f12340d = (String[]) tlsVersions.clone();
    }
}
