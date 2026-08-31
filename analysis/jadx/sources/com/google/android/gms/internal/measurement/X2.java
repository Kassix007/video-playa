package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import r.C1552c;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public final class X2 extends AbstractSet {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f10759q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Map f10760r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ X2(Map map, int i) {
        this.f10759q = i;
        this.f10760r = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f10759q) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((U2) this.f10760r).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f10759q) {
            case 0:
                ((U2) this.f10760r).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f10759q) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((U2) this.f10760r).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f10759q) {
            case 0:
                return new W2((U2) this.f10760r);
            default:
                return new C1552c((C1554e) this.f10760r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f10759q) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((U2) this.f10760r).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f10759q) {
            case 0:
                return ((U2) this.f10760r).size();
            default:
                return ((C1554e) this.f10760r).f16166s;
        }
    }
}
