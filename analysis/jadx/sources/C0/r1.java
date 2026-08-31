package C0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.clearcut.C0736a;
import com.google.android.gms.internal.measurement.M1;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1104b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(int i, Object obj) {
        super(null);
        this.f1103a = i;
        this.f1104b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.ContentObserver
    public void onChange(boolean z5) {
        switch (this.f1103a) {
            case 1:
                C0736a c0736a = (C0736a) this.f1104b;
                synchronized (c0736a.f10479d) {
                    c0736a.f10480e = null;
                    break;
                }
                C0736a c0736a2 = (C0736a) this.f1104b;
                synchronized (c0736a2.f) {
                    try {
                        Iterator it = c0736a2.f10481g.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                ((AtomicBoolean) ((m.c1) this.f1104b).f14765a).set(true);
                return;
            case 3:
                M1 m12 = (M1) this.f1104b;
                synchronized (m12.f10670e) {
                    m12.f = null;
                    m12.f10668c.run();
                    break;
                }
                synchronized (m12) {
                    try {
                        Iterator it2 = m12.f10671g.iterator();
                        if (it2.hasNext()) {
                            if (it2.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } finally {
                    }
                }
                return;
            default:
                super.onChange(z5);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(m.c1 c1Var) {
        super(null);
        this.f1103a = 2;
        Objects.requireNonNull(c1Var);
        this.f1104b = c1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(O5.e eVar, Handler handler) {
        super(handler);
        this.f1103a = 0;
        this.f1104b = eVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z5, Uri uri) {
        switch (this.f1103a) {
            case 0:
                ((O5.e) this.f1104b).j(C1386y.f15098a);
                break;
            default:
                super.onChange(z5, uri);
                break;
        }
    }
}
