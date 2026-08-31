package B2;

import I2.n;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f550b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(int i) {
        switch (i) {
            case 1:
                this.f549a = new LinkedHashMap();
                break;
            default:
                this.f549a = new LinkedHashMap();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        WeakReference weakReference;
        this.f550b = 0;
        Iterator it = this.f549a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                f fVar = (f) l.m0(arrayList);
                if (((fVar == null || (weakReference = fVar.f546b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    int i8 = i7 - i;
                    if (((f) arrayList.get(i8)).f546b.get() == null) {
                        arrayList.remove(i8);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        WeakReference weakReference;
        int i = this.f550b;
        this.f550b = i + 1;
        if (i >= 10) {
            this.f550b = 0;
            Iterator it = this.f549a.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    P2.e eVar = (P2.e) l.m0(arrayList);
                    if (((eVar == null || (weakReference = eVar.f5624a) == null) ? null : (n) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size; i8++) {
                        int i9 = i8 - i7;
                        if (((P2.e) arrayList.get(i9)).f5624a.get() == null) {
                            arrayList.remove(i9);
                            i7++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void c(a aVar, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = this.f549a;
            Object arrayList = linkedHashMap.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(aVar, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            f fVar = new f(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    arrayList2.add(fVar);
                    break;
                }
                f fVar2 = (f) arrayList2.get(i7);
                if (i < fVar2.f548d) {
                    i7++;
                } else if (fVar2.f545a == iIdentityHashCode && fVar2.f546b.get() == bitmap) {
                    arrayList2.set(i7, fVar);
                } else {
                    arrayList2.add(i7, fVar);
                }
            }
            int i8 = this.f550b;
            this.f550b = i8 + 1;
            if (i8 >= 10) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(P2.a aVar, n nVar, Map map, long j) {
        LinkedHashMap linkedHashMap = this.f549a;
        Object arrayList = linkedHashMap.get(aVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(aVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        P2.e eVar = new P2.e(new WeakReference(nVar), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                P2.e eVar2 = (P2.e) arrayList2.get(i);
                if (j < eVar2.f5626c) {
                    i++;
                } else if (eVar2.f5624a.get() == nVar) {
                    arrayList2.set(i, eVar);
                } else {
                    arrayList2.add(i, eVar);
                }
            }
        } else {
            arrayList2.add(eVar);
        }
        b();
    }
}
