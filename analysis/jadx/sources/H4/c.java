package H4;

import java.util.Iterator;
import java.util.ListIterator;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f2171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f2172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f2173u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(d dVar, int i, int i7) {
        this.f2173u = dVar;
        this.f2171s = i;
        this.f2172t = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final Object[] g() {
        return this.f2173u.g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1918b.f(i, this.f2172t);
        return this.f2173u.get(i + this.f2171s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final int h() {
        return this.f2173u.i() + this.f2171s + this.f2172t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final int i() {
        return this.f2173u.i() + this.f2171s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
    @Override // H4.d, java.util.List
    /* JADX INFO: renamed from: l */
    public final d subList(int i, int i7) {
        AbstractC1918b.i(i, i7, this.f2172t);
        int i8 = this.f2171s;
        return this.f2173u.subList(i + i8, i7 + i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2172t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // H4.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
