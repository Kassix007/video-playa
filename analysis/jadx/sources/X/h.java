package X;

import P.AbstractC0366l0;
import P.V0;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractMap implements Map, C5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public W.b f8142q = new W.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public U.m f8143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8144s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8145t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8146u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f8147v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(i iVar) {
        this.f8143r = iVar.f7493q;
        this.f8146u = iVar.f7494r;
        this.f8147v = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final i a() {
        U.m mVar = this.f8143r;
        i iVar = this.f8147v;
        if (mVar != iVar.f7493q) {
            this.f8142q = new W.b();
            iVar = new i(this.f8143r, this.f8146u);
        }
        this.f8147v = iVar;
        return iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(Object obj) {
        return this.f8143r.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(Object obj) {
        return this.f8143r.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f8143r = U.m.f7512e;
        e(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0366l0) {
            return b((AbstractC0366l0) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof V0) {
            return super.containsValue((V0) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d(Object obj) {
        this.f8144s = null;
        U.m mVarN = this.f8143r.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mVarN == null) {
            mVarN = U.m.f7512e;
        }
        this.f8143r = mVarN;
        return this.f8144s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        this.f8146u = i;
        this.f8145t++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new U.f(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0366l0) {
            return (V0) c((AbstractC0366l0) obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0366l0) ? obj2 : (V0) super.getOrDefault((AbstractC0366l0) obj, (V0) obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new U.f(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f8144s = null;
        this.f8143r = this.f8143r.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f8144s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        U.c cVarA = null;
        U.c cVar = map instanceof U.c ? (U.c) map : null;
        if (cVar == null) {
            h hVar = map instanceof h ? (h) map : null;
            if (hVar != null) {
                cVarA = hVar.a();
            }
        } else {
            cVarA = cVar;
        }
        if (cVarA == null) {
            super.putAll(map);
            return;
        }
        W.a aVar = new W.a();
        aVar.f8005a = 0;
        int i = this.f8146u;
        U.m mVar = this.f8143r;
        U.m mVar2 = cVarA.f7493q;
        kotlin.jvm.internal.m.c(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f8143r = mVar.m(mVar2, 0, aVar, this);
        int i7 = (cVarA.f7494r + i) - aVar.f8005a;
        if (i != i7) {
            e(i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f8146u;
        U.m mVarO = this.f8143r.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mVarO == null) {
            mVarO = U.m.f7512e;
        }
        this.f8143r = mVarO;
        return i != this.f8146u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8146u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new U.i(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0366l0) {
            return (V0) d((AbstractC0366l0) obj);
        }
        return null;
    }
}
