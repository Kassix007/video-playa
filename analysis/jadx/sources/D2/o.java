package D2;

import android.util.Log;
import e2.AbstractC1037b;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import n5.x;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1433a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(int i) {
        switch (i) {
            case 2:
                this.f1433a = new LinkedHashMap();
                break;
            default:
                this.f1433a = new LinkedHashMap();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(kotlin.jvm.internal.f fVar, B5.c initializer) {
        kotlin.jvm.internal.m.e(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f1433a;
        if (!linkedHashMap.containsKey(fVar)) {
            linkedHashMap.put(fVar, new P1.f(fVar, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + fVar.b() + '.').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(AbstractC1037b... migrations) {
        kotlin.jvm.internal.m.e(migrations, "migrations");
        for (AbstractC1037b abstractC1037b : migrations) {
            int i = abstractC1037b.startVersion;
            int i7 = abstractC1037b.endVersion;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.f1433a;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i7))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i7)) + " with " + abstractC1037b);
            }
            treeMap2.put(Integer.valueOf(i7), abstractC1037b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P1.d c() {
        Collection initializers = this.f1433a.values();
        kotlin.jvm.internal.m.e(initializers, "initializers");
        P1.f[] fVarArr = (P1.f[]) initializers.toArray(new P1.f[0]);
        return new P1.d((P1.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public o(p pVar) {
        this.f1433a = x.P(pVar.f1435q);
    }
}
