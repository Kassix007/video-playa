package s2;

import android.os.Parcel;
import android.util.SparseIntArray;
import k1.i;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f16448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f16449e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16451h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16452k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1554e(0), new C1554e(0), new C1554e(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s2.a
    public final b a() {
        Parcel parcel = this.f16449e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.f16450g;
        }
        return new b(parcel, iDataPosition, i, i.k(new StringBuilder(), this.f16451h, "  "), this.f16445a, this.f16446b, this.f16447c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s2.a
    public final boolean e(int i) {
        while (this.j < this.f16450g) {
            int i7 = this.f16452k;
            if (i7 == i) {
                return true;
            }
            if (String.valueOf(i7).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i8 = this.j;
            Parcel parcel = this.f16449e;
            parcel.setDataPosition(i8);
            int i9 = parcel.readInt();
            this.f16452k = parcel.readInt();
            this.j += i9;
        }
        return this.f16452k == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s2.a
    public final void h(int i) {
        int i7 = this.i;
        SparseIntArray sparseIntArray = this.f16448d;
        Parcel parcel = this.f16449e;
        if (i7 >= 0) {
            int i8 = sparseIntArray.get(i7);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i8);
            parcel.writeInt(iDataPosition - i8);
            parcel.setDataPosition(iDataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i7, String str, C1554e c1554e, C1554e c1554e2, C1554e c1554e3) {
        super(c1554e, c1554e2, c1554e3);
        this.f16448d = new SparseIntArray();
        this.i = -1;
        this.f16452k = -1;
        this.f16449e = parcel;
        this.f = i;
        this.f16450g = i7;
        this.j = i;
        this.f16451h = str;
    }
}
