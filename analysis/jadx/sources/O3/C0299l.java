package O3;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.C0815j1;
import com.google.android.gms.internal.measurement.C0820k1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w0.C1824c;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0299l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4944c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0299l(C0305n c0305n, String str) {
        this.f4944c = c0305n;
        AbstractC1887A.d(str);
        this.f4943b = str;
        this.f4942a = -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List a() {
        List list;
        C0305n c0305n = (C0305n) this.f4944c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f4943b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c0305n.f0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f4942a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j7 = cursorQuery.getLong(3);
                        boolean z5 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f4942a) {
                            this.f4942a = j;
                        }
                        try {
                            C0815j1 c0815j1 = (C0815j1) C0270b0.b0(C0820k1.z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            c0815j1.b();
                            ((C0820k1) c0815j1.f11012r).F(string);
                            long j8 = cursorQuery.getLong(2);
                            c0815j1.b();
                            ((C0820k1) c0815j1.f11012r).G(j8);
                            arrayList.add(new C0296k(j, j7, z5, (C0820k1) c0815j1.e()));
                        } catch (IOException e7) {
                            X x6 = ((C0323t0) c0305n.f4346r).f5077v;
                            C0323t0.l(x6);
                            x6.f4670w.d(X.w(str), e7, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    list = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e8) {
                X x7 = ((C0323t0) c0305n.f4346r).f5077v;
                C0323t0.l(x7);
                x7.f4670w.d(X.w(str), e8, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public C0299l(C0305n c0305n, String str, long j) {
        this.f4944c = c0305n;
        AbstractC1887A.d(str);
        this.f4943b = str;
        this.f4942a = c0305n.L("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public C0299l() {
        this.f4943b = new C1824c();
        this.f4944c = new C1824c();
    }
}
