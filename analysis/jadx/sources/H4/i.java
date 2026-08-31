package H4;

import java.util.AbstractMap;
import java.util.Objects;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f2185s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(j jVar) {
        this.f2185s = jVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        j jVar = this.f2185s;
        AbstractC1918b.f(i, jVar.f2188v);
        Object[] objArr = jVar.f2187u;
        int i7 = i * 2;
        Object obj = objArr[i7];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i7 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2185s.f2188v;
    }
}
