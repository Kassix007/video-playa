package D;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p[] f1278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f1279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1281e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1282g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(int i, p[] pVarArr, r rVar, List list, int i7) {
        this.f1277a = i;
        this.f1278b = pVarArr;
        this.f1279c = rVar;
        this.f1280d = list;
        this.f1281e = i7;
        int iMax = 0;
        for (p pVar : pVarArr) {
            iMax = Math.max(iMax, pVar.f1269k);
        }
        this.f = iMax;
        int i8 = iMax + this.f1281e;
        this.f1282g = i8 >= 0 ? i8 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p[] a(int i, int i7, int i8) {
        p[] pVarArr = this.f1278b;
        int length = pVarArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            p pVar = pVarArr[i9];
            int i12 = i10 + 1;
            int i13 = (int) ((C0117b) this.f1280d.get(i10)).f1191a;
            pVar.k(i, this.f1279c.f1284b[i11], i7, i8, this.f1277a, i11);
            i11 += i13;
            i9++;
            i10 = i12;
        }
        return pVarArr;
    }
}
