package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1410f implements Iterable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1407c f15317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1407c f15318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WeakHashMap f15319s = new WeakHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15320t = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1407c d(Object obj) {
        C1407c c1407c = this.f15317q;
        while (c1407c != null && !c1407c.f15310q.equals(obj)) {
            c1407c = c1407c.f15312s;
        }
        return c1407c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((o.C1406b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof o.C1410f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o.f r7 = (o.C1410f) r7
            int r1 = r6.f15320t
            int r3 = r7.f15320t
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            o.b r3 = (o.C1406b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            o.b r4 = (o.C1406b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            o.b r7 = (o.C1406b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1410f.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object g(Object obj) {
        C1407c c1407cD = d(obj);
        if (c1407cD == null) {
            return null;
        }
        this.f15320t--;
        WeakHashMap weakHashMap = this.f15319s;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1409e) it.next()).a(c1407cD);
            }
        }
        C1407c c1407c = c1407cD.f15313t;
        if (c1407c != null) {
            c1407c.f15312s = c1407cD.f15312s;
        } else {
            this.f15317q = c1407cD.f15312s;
        }
        C1407c c1407c2 = c1407cD.f15312s;
        if (c1407c2 != null) {
            c1407c2.f15313t = c1407c;
        } else {
            this.f15318r = c1407c;
        }
        c1407cD.f15312s = null;
        c1407cD.f15313t = null;
        return c1407cD.f15311r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C1406b c1406b = (C1406b) it;
            if (!c1406b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c1406b.next()).hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1406b c1406b = new C1406b(this.f15317q, this.f15318r, 0);
        this.f15319s.put(c1406b, Boolean.FALSE);
        return c1406b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1406b c1406b = (C1406b) it;
            if (!c1406b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1406b.next()).toString());
            if (c1406b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
