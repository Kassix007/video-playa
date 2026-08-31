package n4;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import l.C1211n;
import l.MenuC1209l;
import l.SubMenuC1197D;
import l.x;
import l4.C1236f;
import q2.AbstractC1513r;
import q2.C1496a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b4.b f15278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15280s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void d(Parcelable parcelable) {
        if (parcelable instanceof f) {
            b4.b bVar = this.f15278q;
            f fVar = (f) parcelable;
            int i = fVar.f15276q;
            int size = bVar.f15265U.f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                MenuItem item = bVar.f15265U.getItem(i7);
                if (i == item.getItemId()) {
                    bVar.f15272w = i;
                    bVar.f15273x = i7;
                    item.setChecked(true);
                    break;
                }
                i7++;
            }
            Context context = this.f15278q.getContext();
            C1236f c1236f = fVar.f15277r;
            SparseArray sparseArray = new SparseArray(c1236f.size());
            for (int i8 = 0; i8 < c1236f.size(); i8++) {
                int iKeyAt = c1236f.keyAt(i8);
                Y3.b bVar2 = (Y3.b) c1236f.valueAt(i8);
                sparseArray.put(iKeyAt, bVar2 != null ? new Y3.a(context, bVar2) : null);
            }
            b4.b bVar3 = this.f15278q;
            SparseArray sparseArray2 = bVar3.f15253I;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                int iKeyAt2 = sparseArray.keyAt(i9);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (Y3.a) sparseArray.get(iKeyAt2));
                }
            }
            c[] cVarArr = bVar3.f15271v;
            if (cVarArr != null) {
                for (c cVar : cVarArr) {
                    Y3.a aVar = (Y3.a) sparseArray2.get(cVar.getId());
                    if (aVar != null) {
                        cVar.setBadge(aVar);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean g(C1211n c1211n) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final int getId() {
        return this.f15280s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void h(boolean z5) {
        C1496a c1496a;
        if (this.f15279r) {
            return;
        }
        if (z5) {
            this.f15278q.b();
            return;
        }
        b4.b bVar = this.f15278q;
        MenuC1209l menuC1209l = bVar.f15265U;
        if (menuC1209l == null || bVar.f15271v == null) {
            return;
        }
        int size = menuC1209l.f.size();
        if (size != bVar.f15271v.length) {
            bVar.b();
            return;
        }
        int i = bVar.f15272w;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = bVar.f15265U.getItem(i7);
            if (item.isChecked()) {
                bVar.f15272w = item.getItemId();
                bVar.f15273x = i7;
            }
        }
        if (i != bVar.f15272w && (c1496a = bVar.f15266q) != null) {
            AbstractC1513r.a(bVar, c1496a);
        }
        int i8 = bVar.f15270u;
        boolean z6 = i8 != -1 ? i8 == 0 : bVar.f15265U.l().size() > 3;
        for (int i9 = 0; i9 < size; i9++) {
            bVar.f15264T.f15279r = true;
            bVar.f15271v[i9].setLabelVisibilityMode(bVar.f15270u);
            bVar.f15271v[i9].setShifting(z6);
            bVar.f15271v[i9].b((C1211n) bVar.f15265U.getItem(i9));
            bVar.f15264T.f15279r = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void i(Context context, MenuC1209l menuC1209l) {
        this.f15278q.f15265U = menuC1209l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean j() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final Parcelable k() {
        f fVar = new f();
        fVar.f15276q = this.f15278q.getSelectedItemId();
        SparseArray<Y3.a> badgeDrawables = this.f15278q.getBadgeDrawables();
        C1236f c1236f = new C1236f();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            Y3.a aVarValueAt = badgeDrawables.valueAt(i);
            c1236f.put(iKeyAt, aVarValueAt != null ? aVarValueAt.f8224u.f8260a : null);
        }
        fVar.f15277r = c1236f;
        return fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean l(SubMenuC1197D subMenuC1197D) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean m(C1211n c1211n) {
        return false;
    }

    @Override // l.x
    public final void b(MenuC1209l menuC1209l, boolean z5) {
    }
}
