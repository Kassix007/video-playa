package I2;

import android.content.Context;
import m5.C1376o;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U2.e f2379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1376o f2380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1376o f2381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f2382e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(Context context, U2.e eVar, C1376o c1376o, C1376o c1376o2, g gVar) {
        this.f2378a = context;
        this.f2379b = eVar;
        this.f2380c = c1376o;
        this.f2381d = c1376o2;
        this.f2382e = gVar;
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
        if (!kotlin.jvm.internal.m.a(this.f2378a, tVar.f2378a) || !this.f2379b.equals(tVar.f2379b) || !this.f2380c.equals(tVar.f2380c) || !this.f2381d.equals(tVar.f2381d)) {
            return false;
        }
        Object obj2 = j.f2362a;
        return obj2.equals(obj2) && this.f2382e.equals(tVar.f2382e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f2382e.hashCode() + ((j.f2362a.hashCode() + ((this.f2381d.hashCode() + ((this.f2380c.hashCode() + ((this.f2379b.hashCode() + (this.f2378a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Options(application=" + this.f2378a + ", defaults=" + this.f2379b + ", memoryCacheLazy=" + this.f2380c + ", diskCacheLazy=" + this.f2381d + ", eventListenerFactory=" + j.f2362a + ", componentRegistry=" + this.f2382e + ", logger=null)";
    }
}
