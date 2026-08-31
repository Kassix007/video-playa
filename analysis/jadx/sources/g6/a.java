package g6;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f13178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13179d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(String name, boolean z5) {
        m.e(name, "name");
        this.f13176a = name;
        this.f13177b = z5;
        this.f13179d = -1L;
    }

    public abstract long a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f13176a;
    }
}
