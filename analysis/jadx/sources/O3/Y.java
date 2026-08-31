package O3;

import android.os.Bundle;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4679a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4683e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Y() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Y c(C0328v c0328v) {
        return new Y(c0328v.f5091q, c0328v.f5093s, c0328v.f5092r.c0(), c0328v.f5094t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(d6.a r6, h6.h r7, java.util.ArrayList r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4683e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            h6.j r1 = (h6.j) r1
            java.lang.String r3 = "connection"
            kotlin.jvm.internal.m.d(r1, r3)
            monitor-enter(r1)
            r3 = 1
            if (r9 == 0) goto L28
            k6.n r4 = r1.f13504g     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L23
            r2 = r3
        L23:
            if (r2 == 0) goto L33
            goto L28
        L26:
            r6 = move-exception
            goto L35
        L28:
            boolean r2 = r1.h(r6, r8)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L33
            r7.b(r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)
            return r3
        L33:
            monitor-exit(r1)
            goto L8
        L35:
            monitor-exit(r1)
            throw r6
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.Y.a(d6.a, h6.h, java.util.ArrayList, boolean):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b(h6.j jVar, long j) {
        byte[] bArr = e6.b.f12673a;
        ArrayList arrayList = jVar.f13511p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + jVar.f13500b.f12444a.f12301h + " was leaked. Did you forget to close a response body?";
                l6.m mVar = l6.m.f14610a;
                l6.m.f14610a.j(((h6.f) reference).f13482a, str);
                arrayList.remove(i);
                jVar.j = true;
                if (arrayList.isEmpty()) {
                    jVar.f13512q = j - this.f4680b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: android.util.Pair */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: android.util.Pair */
    /* JADX DEBUG: Multi-variable search result rejected for r0v67, resolved type: android.util.Pair */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[PHI: r8 r16 r17
  0x00ff: PHI (r8v6 android.database.Cursor) = (r8v7 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r16v3 com.google.android.gms.internal.measurement.k1) = (r16v5 com.google.android.gms.internal.measurement.k1), (r16v10 com.google.android.gms.internal.measurement.k1) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.measurement.C0820k1 d(com.google.android.gms.internal.measurement.C0820k1 r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            r20 = this;
            r1 = r20
            r7 = r21
            r3 = r22
            java.lang.String r0 = r7.s()
            java.util.List r14 = r7.p()
            java.lang.Object r2 = r1.f4683e
            O3.c r2 = (O3.C0272c) r2
            O3.T1 r4 = r2.f4510s
            O3.T1 r5 = r2.f4510s
            java.lang.Object r2 = r2.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            r4.i0()
            java.lang.String r6 = "_eid"
            com.google.android.gms.internal.measurement.n1 r8 = O3.C0270b0.w(r7, r6)
            r9 = 0
            if (r8 != 0) goto L28
            r8 = r9
            goto L2c
        L28:
            java.io.Serializable r8 = O3.C0270b0.D(r8)
        L2c:
            r10 = r8
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L243
            java.lang.String r8 = "_ep"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L1fb
            r4.i0()
            java.lang.String r0 = "_en"
            com.google.android.gms.internal.measurement.n1 r0 = O3.C0270b0.w(r7, r0)
            if (r0 != 0) goto L46
            r0 = r9
            goto L4a
        L46:
            java.io.Serializable r0 = O3.C0270b0.D(r0)
        L4a:
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto L60
            O3.X r0 = r2.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4671x
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.c(r10, r2)
            return r9
        L60:
            java.lang.Object r0 = r1.f4681c
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0
            if (r0 == 0) goto L81
            java.lang.Object r0 = r1.f4682d
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L81
            long r16 = r10.longValue()
            java.lang.Object r0 = r1.f4682d
            java.lang.Long r0 = (java.lang.Long) r0
            long r18 = r0.longValue()
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L7d
            goto L81
        L7d:
            r17 = 0
            goto L152
        L81:
            O3.n r0 = r4.f4609s
            O3.T1.S(r0)
            java.lang.Object r4 = r0.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            r0.o()
            r0.p()
            android.database.sqlite.SQLiteDatabase r0 = r0.f0()     // Catch: java.lang.Throwable -> L10e android.database.sqlite.SQLiteException -> L112
            java.lang.String r8 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r13 = r10.toString()     // Catch: java.lang.Throwable -> L10e android.database.sqlite.SQLiteException -> L112
            java.lang.String[] r13 = new java.lang.String[]{r3, r13}     // Catch: java.lang.Throwable -> L10e android.database.sqlite.SQLiteException -> L112
            android.database.Cursor r8 = r0.rawQuery(r8, r13)     // Catch: java.lang.Throwable -> L10e android.database.sqlite.SQLiteException -> L112
            boolean r0 = r8.moveToFirst()     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            if (r0 != 0) goto Lc4
            O3.X r0 = r4.f5077v     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            O3.V r0 = r0.f4666E     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r13 = "Main event not found"
            r0.b(r13)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r8.close()
            r0 = r9
            r16 = r0
        Lba:
            r17 = 0
            goto L12d
        Lbe:
            r0 = move-exception
            goto L10b
        Lc0:
            r0 = move-exception
            r16 = r9
            goto L108
        Lc4:
            r0 = 0
            byte[] r0 = r8.getBlob(r0)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r13 = 1
            long r16 = r8.getLong(r13)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.Long r13 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r16 = r9
            com.google.android.gms.internal.measurement.j1 r9 = com.google.android.gms.internal.measurement.C0820k1.z()     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lec android.database.sqlite.SQLiteException -> L107
            com.google.android.gms.internal.measurement.p2 r0 = O3.C0270b0.b0(r9, r0)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lec android.database.sqlite.SQLiteException -> L107
            com.google.android.gms.internal.measurement.j1 r0 = (com.google.android.gms.internal.measurement.C0815j1) r0     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lec android.database.sqlite.SQLiteException -> L107
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lec android.database.sqlite.SQLiteException -> L107
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lec android.database.sqlite.SQLiteException -> L107
            android.util.Pair r0 = android.util.Pair.create(r0, r13)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> L107
            r8.close()
            goto Lba
        Lec:
            r0 = move-exception
            O3.X r9 = r4.f5077v     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> L107
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> L107
            O3.V r9 = r9.f4670w     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> L107
            java.lang.String r13 = "Failed to merge main event. appId, eventId"
            r17 = 0
            O3.W r11 = O3.X.w(r3)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> L105
            r9.e(r13, r11, r10, r0)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> L105
        Lff:
            r8.close()
        L102:
            r0 = r16
            goto L12d
        L105:
            r0 = move-exception
            goto L11e
        L107:
            r0 = move-exception
        L108:
            r17 = 0
            goto L11e
        L10b:
            r9 = r8
            goto L1f5
        L10e:
            r0 = move-exception
            r16 = r9
            goto L118
        L112:
            r0 = move-exception
            r16 = r9
            r17 = 0
            goto L11c
        L118:
            r9 = r16
            goto L1f5
        L11c:
            r8 = r16
        L11e:
            O3.X r4 = r4.f5077v     // Catch: java.lang.Throwable -> Lbe
            O3.C0323t0.l(r4)     // Catch: java.lang.Throwable -> Lbe
            O3.V r4 = r4.f4670w     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r9 = "Error selecting main event"
            r4.c(r0, r9)     // Catch: java.lang.Throwable -> Lbe
            if (r8 == 0) goto L102
            goto Lff
        L12d:
            if (r0 == 0) goto L1e8
            java.lang.Object r4 = r0.first
            if (r4 != 0) goto L135
            goto L1e8
        L135:
            com.google.android.gms.internal.measurement.k1 r4 = (com.google.android.gms.internal.measurement.C0820k1) r4
            r1.f4681c = r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r8 = r0.longValue()
            r1.f4680b = r8
            r5.i0()
            java.lang.Object r0 = r1.f4681c
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0
            java.io.Serializable r0 = O3.C0270b0.x(r0, r6)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f4682d = r0
        L152:
            long r8 = r1.f4680b
            r11 = -1
            long r8 = r8 + r11
            r1.f4680b = r8
            int r0 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r0 > 0) goto L191
            O3.n r0 = r5.f4609s
            O3.T1.S(r0)
            java.lang.Object r4 = r0.f4346r
            O3.t0 r4 = (O3.C0323t0) r4
            r0.o()
            O3.X r6 = r4.f5077v
            O3.C0323t0.l(r6)
            O3.V r6 = r6.f4666E
            java.lang.String r8 = "Clearing complex main event info. appId"
            r6.c(r3, r8)
            android.database.sqlite.SQLiteDatabase r0 = r0.f0()     // Catch: android.database.sqlite.SQLiteException -> L183
            java.lang.String r6 = "delete from main_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: android.database.sqlite.SQLiteException -> L183
            r0.execSQL(r6, r3)     // Catch: android.database.sqlite.SQLiteException -> L183
            goto L1a1
        L183:
            r0 = move-exception
            O3.X r3 = r4.f5077v
            O3.C0323t0.l(r3)
            O3.V r3 = r3.f4670w
            java.lang.String r4 = "Error clearing complex main event"
            r3.c(r0, r4)
            goto L1a1
        L191:
            O3.n r8 = r5.f4609s
            O3.T1.S(r8)
            long r11 = r1.f4680b
            java.lang.Object r0 = r1.f4681c
            r13 = r0
            com.google.android.gms.internal.measurement.k1 r13 = (com.google.android.gms.internal.measurement.C0820k1) r13
            r9 = r3
            r8.H(r9, r10, r11, r13)
        L1a1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r3 = r1.f4681c
            com.google.android.gms.internal.measurement.k1 r3 = (com.google.android.gms.internal.measurement.C0820k1) r3
            java.util.List r3 = r3.p()
            java.util.Iterator r3 = r3.iterator()
        L1b2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1cf
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.measurement.n1 r4 = (com.google.android.gms.internal.measurement.C0835n1) r4
            r5.i0()
            java.lang.String r6 = r4.q()
            com.google.android.gms.internal.measurement.n1 r6 = O3.C0270b0.w(r7, r6)
            if (r6 != 0) goto L1b2
            r0.add(r4)
            goto L1b2
        L1cf:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L1da
            r0.addAll(r14)
            r14 = r0
            goto L1e6
        L1da:
            O3.X r0 = r2.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4671x
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.c(r15, r2)
        L1e6:
            r0 = r15
            goto L243
        L1e8:
            O3.X r0 = r2.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4671x
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.d(r15, r10, r2)
            return r16
        L1f5:
            if (r9 == 0) goto L1fa
            r9.close()
        L1fa:
            throw r0
        L1fb:
            r16 = r9
            r17 = 0
            r1.f4682d = r10
            r1.f4681c = r7
            r4.i0()
            java.lang.Long r3 = java.lang.Long.valueOf(r17)
            java.lang.String r5 = "_epc"
            com.google.android.gms.internal.measurement.n1 r5 = O3.C0270b0.w(r7, r5)
            if (r5 != 0) goto L215
            r9 = r16
            goto L219
        L215:
            java.io.Serializable r9 = O3.C0270b0.D(r5)
        L219:
            if (r9 != 0) goto L21c
            goto L21d
        L21c:
            r3 = r9
        L21d:
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            r1.f4680b = r5
            int r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r3 > 0) goto L236
            O3.X r2 = r2.f5077v
            O3.C0323t0.l(r2)
            O3.V r2 = r2.f4671x
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.c(r0, r3)
            goto L243
        L236:
            O3.n r2 = r4.f4609s
            O3.T1.S(r2)
            long r5 = r1.f4680b
            r3 = r22
            r4 = r10
            r2.H(r3, r4, r5, r7)
        L243:
            com.google.android.gms.internal.measurement.p2 r2 = r21.i()
            com.google.android.gms.internal.measurement.j1 r2 = (com.google.android.gms.internal.measurement.C0815j1) r2
            r2.b()
            com.google.android.gms.internal.measurement.q2 r3 = r2.f11012r
            com.google.android.gms.internal.measurement.k1 r3 = (com.google.android.gms.internal.measurement.C0820k1) r3
            r3.F(r0)
            r2.b()
            com.google.android.gms.internal.measurement.q2 r0 = r2.f11012r
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0
            r0.D()
            r2.b()
            com.google.android.gms.internal.measurement.q2 r0 = r2.f11012r
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0
            r0.C(r14)
            com.google.android.gms.internal.measurement.q2 r0 = r2.e()
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.Y.d(com.google.android.gms.internal.measurement.k1, java.lang.String):com.google.android.gms.internal.measurement.k1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0328v e() {
        return new C0328v((String) this.f4681c, new C0325u(new Bundle((Bundle) this.f4683e)), (String) this.f4682d, this.f4680b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f4679a) {
            case 0:
                String str = (String) this.f4682d;
                String string = ((Bundle) this.f4683e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f4681c;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                k1.i.s(sb, "origin=", str, ",name=", str2);
                return k1.i.k(sb, ",params=", string);
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Y(String str, String str2, Bundle bundle, long j) {
        this.f4681c = str;
        this.f4682d = str2;
        this.f4683e = bundle;
        this.f4680b = j;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [O3.c.s(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList] */
    public /* synthetic */ Y(C0272c c0272c) {
        this.f4683e = c0272c;
    }

    public Y(g6.d taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        kotlin.jvm.internal.m.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        this.f4680b = timeUnit.toNanos(5L);
        this.f4681c = taskRunner.e();
        this.f4682d = new g6.b(this, k1.i.k(new StringBuilder(), e6.b.f, " ConnectionPool"));
        this.f4683e = new ConcurrentLinkedQueue();
    }
}
