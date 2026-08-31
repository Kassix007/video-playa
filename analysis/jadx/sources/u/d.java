package U;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n[] f7495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7497s = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(m mVar, n[] nVarArr) {
        this.f7495q = nVarArr;
        nVarArr[0].a(mVar.f7516d, Integer.bitCount(mVar.f7513a) * 2, 0);
        this.f7496r = 0;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        int i = this.f7496r;
        n[] nVarArr = this.f7495q;
        n nVar = nVarArr[i];
        if (nVar.f7519s < nVar.f7518r) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                n nVar2 = nVarArr[i];
                int i7 = nVar2.f7519s;
                Object[] objArr = nVar2.f7517q;
                if (i7 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f7519s = i7 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.f7496r = iB;
                return;
            }
            if (i > 0) {
                n nVar3 = nVarArr[i - 1];
                int i8 = nVar3.f7519s;
                int length2 = nVar3.f7517q.length;
                nVar3.f7519s = i8 + 1;
            }
            nVarArr[i].a(m.f7512e.f7516d, 0, 0);
            i--;
        }
        this.f7497s = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(int i) {
        n[] nVarArr = this.f7495q;
        n nVar = nVarArr[i];
        int i7 = nVar.f7519s;
        if (i7 < nVar.f7518r) {
            return i;
        }
        Object[] objArr = nVar.f7517q;
        if (i7 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i7];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i == 6) {
            n nVar2 = nVarArr[i + 1];
            Object[] objArr2 = mVar.f7516d;
            nVar2.a(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i + 1].a(mVar.f7516d, Integer.bitCount(mVar.f7513a) * 2, 0);
        }
        return b(i + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7497s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public Object next() {
        if (!this.f7497s) {
            throw new NoSuchElementException();
        }
        Object next = this.f7495q[this.f7496r].next();
        a();
        return next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
