package U1;

import P5.S;
import androidx.lifecycle.J;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: renamed from: U1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0530a extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7542b = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3.d f7544d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0530a(U u6) {
        Object value;
        u6.getClass();
        L0.l lVar = u6.f9508b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f3125b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) lVar.f3128e;
        try {
            P5.C c7 = (P5.C) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (c7 == null || (value = ((S) c7).getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) lVar.f3127d).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        String string = (String) value;
        if (string == null) {
            string = UUID.randomUUID().toString();
            String key = this.f7542b;
            kotlin.jvm.internal.m.e(key, "key");
            if (string != null) {
                ArrayList arrayList = O1.a.f4296a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (((Class) obj).isInstance(string)) {
                        }
                    }
                }
                throw new IllegalArgumentException(("Can't put value with type " + string.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = O1.a.f4296a;
            Object obj2 = u6.f9507a.get(key);
            J j = obj2 instanceof J ? (J) obj2 : null;
            if (j != null) {
                j.k(string);
            }
            lVar.s(string, key);
        }
        this.f7543c = string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.f0
    public final void b() {
        k3.d dVar = this.f7544d;
        if (dVar == null) {
            kotlin.jvm.internal.m.k("saveableStateHolderRef");
            throw null;
        }
        Z.c cVar = (Z.c) ((WeakReference) dVar.f14122r).get();
        if (cVar != null) {
            cVar.e(this.f7543c);
        }
        k3.d dVar2 = this.f7544d;
        if (dVar2 != null) {
            ((WeakReference) dVar2.f14122r).clear();
        } else {
            kotlin.jvm.internal.m.k("saveableStateHolderRef");
            throw null;
        }
    }
}
