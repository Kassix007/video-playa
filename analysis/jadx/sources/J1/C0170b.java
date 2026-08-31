package J1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: J1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0170b implements Parcelable {
    public static final Parcelable.Creator<C0170b> CREATOR = new A1.i(3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CharSequence f2620A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f2621B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f2622C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f2623D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f2624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f2625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f2626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f2627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2629v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f2632y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f2633z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0170b(C0169a c0169a) {
        int size = c0169a.f2605a.size();
        this.f2624q = new int[size * 6];
        if (!c0169a.f2610g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2625r = new ArrayList(size);
        this.f2626s = new int[size];
        this.f2627t = new int[size];
        int i = 0;
        for (int i7 = 0; i7 < size; i7++) {
            O o6 = (O) c0169a.f2605a.get(i7);
            int i8 = i + 1;
            this.f2624q[i] = o6.f2581a;
            ArrayList arrayList = this.f2625r;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = o6.f2582b;
            arrayList.add(abstractComponentCallbacksC0185q != null ? abstractComponentCallbacksC0185q.f2722u : null);
            int[] iArr = this.f2624q;
            iArr[i8] = o6.f2583c ? 1 : 0;
            iArr[i + 2] = o6.f2584d;
            iArr[i + 3] = o6.f2585e;
            int i9 = i + 5;
            iArr[i + 4] = o6.f;
            i += 6;
            iArr[i9] = o6.f2586g;
            this.f2626s[i7] = o6.f2587h.ordinal();
            this.f2627t[i7] = o6.i.ordinal();
        }
        this.f2628u = c0169a.f;
        this.f2629v = c0169a.f2611h;
        this.f2630w = c0169a.f2619r;
        this.f2631x = c0169a.i;
        this.f2632y = c0169a.j;
        this.f2633z = c0169a.f2612k;
        this.f2620A = c0169a.f2613l;
        this.f2621B = c0169a.f2614m;
        this.f2622C = c0169a.f2615n;
        this.f2623D = c0169a.f2616o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2624q);
        parcel.writeStringList(this.f2625r);
        parcel.writeIntArray(this.f2626s);
        parcel.writeIntArray(this.f2627t);
        parcel.writeInt(this.f2628u);
        parcel.writeString(this.f2629v);
        parcel.writeInt(this.f2630w);
        parcel.writeInt(this.f2631x);
        TextUtils.writeToParcel(this.f2632y, parcel, 0);
        parcel.writeInt(this.f2633z);
        TextUtils.writeToParcel(this.f2620A, parcel, 0);
        parcel.writeStringList(this.f2621B);
        parcel.writeStringList(this.f2622C);
        parcel.writeInt(this.f2623D ? 1 : 0);
    }

    public C0170b(Parcel parcel) {
        this.f2624q = parcel.createIntArray();
        this.f2625r = parcel.createStringArrayList();
        this.f2626s = parcel.createIntArray();
        this.f2627t = parcel.createIntArray();
        this.f2628u = parcel.readInt();
        this.f2629v = parcel.readString();
        this.f2630w = parcel.readInt();
        this.f2631x = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2632y = (CharSequence) creator.createFromParcel(parcel);
        this.f2633z = parcel.readInt();
        this.f2620A = (CharSequence) creator.createFromParcel(parcel);
        this.f2621B = parcel.createStringArrayList();
        this.f2622C = parcel.createStringArrayList();
        this.f2623D = parcel.readInt() != 0;
    }
}
