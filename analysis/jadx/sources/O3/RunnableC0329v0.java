package O3;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0329v0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a2 f5096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0 f5097s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0329v0(C0 c02, a2 a2Var, int i) {
        this.f5095q = i;
        this.f5096r = a2Var;
        this.f5097s = c02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f5095q) {
            case 0:
                C0 c02 = this.f5097s;
                c02.f4330c.A();
                c02.f4330c.W(this.f5096r);
                break;
            case 1:
                C0 c03 = this.f5097s;
                c03.f4330c.A();
                T1 t12 = c03.f4330c;
                t12.c().o();
                t12.k0();
                a2 a2Var = this.f5096r;
                AbstractC1887A.g(a2Var);
                String str = a2Var.f4729q;
                AbstractC1887A.d(str);
                int i = 0;
                if (t12.d0().y(null, F.f4470z0)) {
                    t12.e().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iW = t12.d0().w(null, F.f4435i0);
                    t12.d0();
                    long jLongValue = jCurrentTimeMillis - ((Long) F.f4424e.a(null)).longValue();
                    while (i < iW && t12.G(null, jLongValue)) {
                        i++;
                    }
                } else {
                    t12.d0();
                    long jIntValue = ((Integer) F.f4441l.a(null)).intValue();
                    while (i < jIntValue && t12.G(str, 0L)) {
                        i++;
                    }
                }
                if (t12.d0().y(null, F.f4363A0)) {
                    t12.c().o();
                    t12.F();
                }
                Q1 q1 = t12.f4616z;
                int iD = C0.S.d(a2Var.f4728U);
                q1.o();
                if (iD == 2 && !Q1.r(str)) {
                    C0300l0 c0300l0 = q1.f4510s.f4607q;
                    T1.S(c0300l0);
                    com.google.android.gms.internal.measurement.O0 o0A = c0300l0.A(str);
                    if (o0A != null && o0A.D() && !o0A.E().q().isEmpty()) {
                        t12.b().f4666E.c(str, "[sgtm] Going background, trigger client side upload. appId");
                        t12.e().getClass();
                        t12.r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 2:
                C0 c04 = this.f5097s;
                c04.f4330c.A();
                T1 t13 = c04.f4330c;
                t13.c().o();
                t13.k0();
                a2 a2Var2 = this.f5096r;
                AbstractC1887A.d(a2Var2.f4729q);
                t13.a0(a2Var2);
                break;
            case 3:
                C0 c05 = this.f5097s;
                c05.f4330c.A();
                T1 t14 = c05.f4330c;
                if (t14.f4595O != null) {
                    ArrayList arrayList = new ArrayList();
                    t14.f4596P = arrayList;
                    arrayList.addAll(t14.f4595O);
                }
                C0305n c0305n = t14.f4609s;
                T1.S(c0305n);
                C0323t0 c0323t0 = (C0323t0) c0305n.f4346r;
                a2 a2Var3 = this.f5096r;
                String str2 = a2Var3.f4729q;
                AbstractC1887A.g(str2);
                AbstractC1887A.d(str2);
                c0305n.o();
                c0305n.p();
                try {
                    SQLiteDatabase sQLiteDatabaseF0 = c0305n.f0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseF0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseF0.delete("events", "app_id=?", strArr) + sQLiteDatabaseF0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseF0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseF0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseF0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseF0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseF0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseF0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseF0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseF0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseF0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseF0.delete("upload_queue", "app_id=?", strArr);
                    if (c0323t0.f5075t.y(null, F.f4436i1)) {
                        iDelete += sQLiteDatabaseF0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        X x6 = c0323t0.f5077v;
                        C0323t0.l(x6);
                        x6.f4666E.d(str2, Integer.valueOf(iDelete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e7) {
                    X x7 = c0323t0.f5077v;
                    C0323t0.l(x7);
                    x7.f4670w.d(X.w(str2), e7, "Error resetting analytics data. appId, error");
                }
                if (a2Var3.f4736x) {
                    t14.W(a2Var3);
                }
                break;
            case 4:
                C0 c06 = this.f5097s;
                c06.f4330c.A();
                T1 t15 = c06.f4330c;
                t15.c().o();
                t15.k0();
                a2 a2Var4 = this.f5096r;
                AbstractC1887A.d(a2Var4.f4729q);
                t15.l0(a2Var4);
                t15.m0(a2Var4);
                break;
            case 5:
                T1 t16 = this.f5097s.f4330c;
                t16.A();
                t16.m0(this.f5096r);
                break;
            default:
                T1 t17 = this.f5097s.f4330c;
                t17.A();
                t17.l0(this.f5096r);
                break;
        }
    }
}
