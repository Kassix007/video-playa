package P;

import a0.AbstractC0606h;
import a0.C0601c;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: P.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0354f0 extends a0.v implements Parcelable, a0.o {
    public static final Parcelable.Creator<C0354f0> CREATOR = new C0352e0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final I0 f5400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public H0 f5401s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0354f0(Object obj, I0 i02) {
        this.f5400r = i02;
        AbstractC0606h abstractC0606hK = a0.n.k();
        H0 h02 = new H0(abstractC0606hK.g(), obj);
        if (!(abstractC0606hK instanceof C0601c)) {
            h02.f8709b = new H0(1, obj);
        }
        this.f5401s = h02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.o
    public final I0 a() {
        return this.f5400r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w d() {
        return this.f5401s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final a0.w g(a0.w wVar, a0.w wVar2, a0.w wVar3) {
        if (this.f5400r.a(((H0) wVar2).f5313c, ((H0) wVar3).f5313c)) {
            return wVar2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        return ((H0) a0.n.t(this.f5401s, this)).f5313c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final void h(a0.w wVar) {
        kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f5401s = (H0) wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.W
    public final void setValue(Object obj) {
        AbstractC0606h abstractC0606hK;
        H0 h02 = (H0) a0.n.i(this.f5401s);
        if (this.f5400r.a(h02.f5313c, obj)) {
            return;
        }
        H0 h03 = this.f5401s;
        synchronized (a0.n.f8680b) {
            abstractC0606hK = a0.n.k();
            ((H0) a0.n.o(h03, this, abstractC0606hK, h02)).f5313c = obj;
        }
        a0.n.n(abstractC0606hK, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableState(value=" + ((H0) a0.n.i(this.f5401s)).f5313c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i7;
        parcel.writeValue(getValue());
        S s6 = S.f5374s;
        I0 i02 = this.f5400r;
        if (kotlin.jvm.internal.m.a(i02, s6)) {
            i7 = 0;
        } else if (kotlin.jvm.internal.m.a(i02, S.f5377v)) {
            i7 = 1;
        } else {
            if (!kotlin.jvm.internal.m.a(i02, S.f5375t)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i7 = 2;
        }
        parcel.writeInt(i7);
    }
}
