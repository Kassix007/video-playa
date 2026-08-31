package h0;

import B0.AbstractC0041g;
import B0.L;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f13439a = new q();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        int i = 0;
        if (AbstractC1111d.s(oVar) && AbstractC1111d.s(oVar2)) {
            L lU = AbstractC0041g.u(oVar);
            L lU2 = AbstractC0041g.u(oVar2);
            if (!kotlin.jvm.internal.m.a(lU, lU2)) {
                Object[] objArr = new L[16];
                int i7 = 0;
                while (lU != null) {
                    int i8 = i7 + 1;
                    if (objArr.length < i8) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i8, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i7 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i7 + 0);
                    }
                    objArr[0] = lU;
                    i7++;
                    lU = lU.s();
                }
                Object[] objArr3 = new L[16];
                int i9 = 0;
                while (lU2 != null) {
                    int i10 = i9 + 1;
                    if (objArr3.length < i10) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i10, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i9 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i9 + 0);
                    }
                    objArr3[0] = lU2;
                    i9++;
                    lU2 = lU2.s();
                }
                int iMin = Math.min(i7 - 1, i9 - 1);
                if (iMin >= 0) {
                    while (kotlin.jvm.internal.m.a(objArr[i], objArr3[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return kotlin.jvm.internal.m.f(((L) objArr[i]).t(), ((L) objArr3[i]).t());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC1111d.s(oVar)) {
                return -1;
            }
            if (AbstractC1111d.s(oVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
