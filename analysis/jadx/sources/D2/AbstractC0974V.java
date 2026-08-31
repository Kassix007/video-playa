package d2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: renamed from: d2.V, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0974V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final List f12031s = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f12033b;
    public int j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f12046r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12034c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12035d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12036e = -1;
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12037g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AbstractC0974V f12038h = null;
    public AbstractC0974V i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f12039k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f12040l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12041m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0966M f12042n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12043o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12044p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12045q = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0974V(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f12032a = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        this.j = i | this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        int i = this.f12037g;
        return i == -1 ? this.f12034c : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List c() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.f12039k) == null || arrayList.size() == 0) ? f12031s : this.f12040l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d() {
        View view = this.f12032a;
        return (view.getParent() == null || view.getParent() == this.f12046r) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        return (this.j & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f() {
        return (this.j & 4) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        if ((this.j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        return !this.f12032a.hasTransientState();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h() {
        return (this.j & 8) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        return this.f12042n != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j() {
        return (this.j & 256) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k() {
        return (this.j & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, boolean z5) {
        if (this.f12035d == -1) {
            this.f12035d = this.f12034c;
        }
        if (this.f12037g == -1) {
            this.f12037g = this.f12034c;
        }
        if (z5) {
            this.f12037g += i;
        }
        this.f12034c += i;
        View view = this.f12032a;
        if (view.getLayoutParams() != null) {
            ((C0961H) view.getLayoutParams()).f11991c = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        this.j = 0;
        this.f12034c = -1;
        this.f12035d = -1;
        this.f12036e = -1L;
        this.f12037g = -1;
        this.f12041m = 0;
        this.f12038h = null;
        this.i = null;
        ArrayList arrayList = this.f12039k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f12044p = 0;
        this.f12045q = -1;
        RecyclerView.j(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(boolean z5) {
        int i = this.f12041m;
        int i7 = z5 ? i - 1 : i + 1;
        this.f12041m = i7;
        if (i7 < 0) {
            this.f12041m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z5 && i7 == 1) {
            this.j |= 16;
        } else if (z5 && i7 == 0) {
            this.j &= -17;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o() {
        return (this.j & 128) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p() {
        return (this.j & 32) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f12034c + " id=" + this.f12036e + ", oldPos=" + this.f12035d + ", pLpos:" + this.f12037g);
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f12043o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.f12041m + ")");
        }
        if ((this.j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f12032a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
