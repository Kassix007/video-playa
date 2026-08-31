package Z5;

import com.google.android.gms.internal.measurement.I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X5.f[] f8552a = new X5.f[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V5.a[] f8553b = new V5.a[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0594x a(V5.a aVar, String str) {
        return new C0594x(str, new C0595y(aVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Set b(X5.f fVar) {
        kotlin.jvm.internal.m.e(fVar, "<this>");
        if (fVar instanceof InterfaceC0581j) {
            return ((InterfaceC0581j) fVar).f();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int iD = fVar.d();
        for (int i = 0; i < iD; i++) {
            hashSet.add(fVar.e(i));
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final X5.f[] c(List list) {
        X5.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (X5.f[]) list.toArray(new X5.f[0])) == null) ? f8552a : fVarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int d(X5.f fVar, X5.f[] typeParams) {
        kotlin.jvm.internal.m.e(typeParams, "typeParams");
        int iHashCode = (fVar.b().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iD = fVar.d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i7 = iD - 1;
            int i8 = i * 31;
            String strB = fVar.i(fVar.d() - iD).b();
            if (strB != null) {
                iHashCode2 = strB.hashCode();
            }
            i = i8 + iHashCode2;
            iD = i7;
        }
        int iD2 = fVar.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i9 = iD2 - 1;
            int i10 = iHashCode3 * 31;
            I1 i1C = fVar.i(fVar.d() - iD2).c();
            iHashCode3 = i10 + (i1C != null ? i1C.hashCode() : 0);
            iD2 = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(int i, int i7, X5.f descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i8 = (~i) & i7;
        for (int i9 = 0; i9 < 32; i9++) {
            if ((i8 & 1) != 0) {
                arrayList.add(descriptor.e(i9));
            }
            i8 >>>= 1;
        }
        String serialName = descriptor.b();
        kotlin.jvm.internal.m.e(serialName, "serialName");
        throw new V5.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(String str, kotlin.jvm.internal.f fVar) {
        String string;
        String str2 = "in the polymorphic scope of '" + fVar.c() + '\'';
        if (str == null) {
            string = "Class discriminator was missing and no default serializers were registered " + str2 + '.';
        } else {
            StringBuilder sbR = C0.S.r("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            k1.i.s(sbR, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbR.append(fVar.c());
            sbR.append("' has to be sealed and '@Serializable'.");
            string = sbR.toString();
        }
        throw new V5.d(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String g(X5.f fVar) {
        return n5.l.q0(D5.a.O(0, fVar.d()), ", ", fVar.b() + '(', ")", new J5.i(8, fVar), 24);
    }
}
