package H4;

import java.util.Objects;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class l extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient Object[] f2191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f2192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f2193u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(Object[] objArr, int i, int i7) {
        this.f2191s = objArr;
        this.f2192t = i;
        this.f2193u = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1918b.f(i, this.f2193u);
        Object obj = this.f2191s[(i * 2) + this.f2192t];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2193u;
    }
}
