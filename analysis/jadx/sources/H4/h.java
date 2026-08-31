package H4;

import java.util.Objects;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f2182u = new h(0, new Object[0]);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient Object[] f2183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f2184t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(int i, Object[] objArr) {
        this.f2183s = objArr;
        this.f2184t = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.d, H4.a
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f2183s;
        int i = this.f2184t;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final Object[] g() {
        return this.f2183s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1918b.f(i, this.f2184t);
        Object obj = this.f2183s[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final int h() {
        return this.f2184t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final int i() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2184t;
    }
}
