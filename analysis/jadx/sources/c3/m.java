package c3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class m implements n, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f10183a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f10184b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f10185c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f10186d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i3.h f10187e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(i3.h hVar) {
        this.f10187e = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Path.Op op) {
        Path path = this.f10184b;
        path.reset();
        Path path2 = this.f10183a;
        path2.reset();
        ArrayList arrayList = this.f10186d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                ArrayList arrayList2 = (ArrayList) eVar.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathE = ((n) arrayList2.get(size2)).e();
                    Matrix matrixE = eVar.f10133d;
                    d3.q qVar = eVar.f10138l;
                    if (qVar != null) {
                        matrixE = qVar.e();
                    } else {
                        matrixE.reset();
                    }
                    pathE.transform(matrixE);
                    path.addPath(pathE);
                }
            } else {
                path.addPath(nVar.e());
            }
        }
        int i = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List listD = eVar2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listD;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathE2 = ((n) arrayList3.get(i)).e();
                Matrix matrixE2 = eVar2.f10133d;
                d3.q qVar2 = eVar2.f10138l;
                if (qVar2 != null) {
                    matrixE2 = qVar2.e();
                } else {
                    matrixE2.reset();
                }
                pathE2.transform(matrixE2);
                path2.addPath(pathE2);
                i++;
            }
        } else {
            path2.set(nVar2.e());
        }
        this.f10185c.op(path2, path, op);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final void c(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10186d;
            if (i >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i)).c(list, list2);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.k
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof n) {
                this.f10186d.add((n) dVar);
                listIterator.remove();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.n
    public final Path e() {
        Path path = this.f10185c;
        path.reset();
        i3.h hVar = this.f10187e;
        if (!hVar.f13592b) {
            int iA = O.c.a(hVar.f13591a);
            if (iA == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.f10186d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i)).e());
                    i++;
                }
            } else {
                if (iA == 1) {
                    b(Path.Op.UNION);
                    return path;
                }
                if (iA == 2) {
                    b(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iA == 3) {
                    b(Path.Op.INTERSECT);
                    return path;
                }
                if (iA == 4) {
                    b(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
