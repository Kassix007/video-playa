package O3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0333w1 extends H {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0321s1 f5107A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ServiceConnectionC0330v1 f5108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public I f5109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile Boolean f5110v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0321s1 f5111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ScheduledExecutorService f5112x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final T f5113y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f5114z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0333w1(C0323t0 c0323t0) {
        super(c0323t0);
        this.f5114z = new ArrayList();
        this.f5113y = new T(c0323t0.f5052A);
        this.f5108t = new ServiceConnectionC0330v1(this);
        this.f5111w = new C0321s1(this, c0323t0, 0);
        this.f5107A = new C0321s1(this, c0323t0, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A() {
        ((C0323t0) this.f4346r).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B() {
        o();
        T t6 = this.f5113y;
        ((B3.a) t6.f4573s).getClass();
        t6.f4572r = SystemClock.elapsedRealtime();
        ((C0323t0) this.f4346r).getClass();
        this.f5111w.b(((Long) F.f4408Y.a(null)).longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(Runnable runnable) {
        o();
        if (F()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f5114z;
        long size = arrayList.size();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        c0323t0.getClass();
        if (size >= 1000) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f5107A.b(60000L);
            u();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D() {
        o();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        V v6 = x6.f4666E;
        ArrayList arrayList = this.f5114z;
        v6.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e7) {
                X x7 = c0323t0.f5077v;
                C0323t0.l(x7);
                x7.f4670w.c(e7, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f5107A.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.a2 E(boolean r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            r0.getClass()
            O3.N r1 = r0.q()
            r2 = 0
            if (r11 == 0) goto Ld3
            O3.X r11 = r0.f5077v
            O3.C0323t0.l(r11)
            java.lang.Object r11 = r11.f4346r
            O3.t0 r11 = (O3.C0323t0) r11
            O3.h0 r0 = r11.f5076u
            O3.C0323t0.j(r0)
            O3.g0 r0 = r0.f4895v
            if (r0 != 0) goto L22
            goto Ld3
        L22:
            O3.h0 r11 = r11.f5076u
            O3.C0323t0.j(r11)
            O3.g0 r11 = r11.f4895v
            java.lang.Object r0 = r11.f4863e
            O3.h0 r0 = (O3.C0288h0) r0
            r0.o()
            r0.o()
            java.lang.Object r3 = r11.f4863e
            O3.h0 r3 = (O3.C0288h0) r3
            android.content.SharedPreferences r3 = r3.s()
            java.lang.Object r4 = r11.f4860b
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            long r3 = r3.getLong(r4, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L4e
            r11.d()
            r3 = r5
            goto L60
        L4e:
            java.lang.Object r7 = r0.f4346r
            O3.t0 r7 = (O3.C0323t0) r7
            B3.a r7 = r7.f5052A
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            long r3 = java.lang.Math.abs(r3)
        L60:
            long r7 = r11.f4859a
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L68
        L66:
            r11 = r2
            goto L9f
        L68:
            long r7 = r7 + r7
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L71
            r11.d()
            goto L66
        L71:
            java.lang.Object r3 = r11.f4862d
            java.lang.String r3 = (java.lang.String) r3
            android.content.SharedPreferences r4 = r0.s()
            java.lang.String r3 = r4.getString(r3, r2)
            java.lang.Object r4 = r11.f4861c
            java.lang.String r4 = (java.lang.String) r4
            android.content.SharedPreferences r0 = r0.s()
            long r7 = r0.getLong(r4, r5)
            r11.d()
            if (r3 == 0) goto L9d
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 > 0) goto L93
            goto L9d
        L93:
            android.util.Pair r11 = new android.util.Pair
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r11.<init>(r3, r0)
            goto L9f
        L9d:
            android.util.Pair r11 = O3.C0288h0.f4876Q
        L9f:
            if (r11 == 0) goto Ld3
            android.util.Pair r0 = O3.C0288h0.f4876Q
            if (r11 != r0) goto La6
            goto Ld3
        La6:
            java.lang.Object r0 = r11.second
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r11 = r11.first
            java.lang.String r11 = (java.lang.String) r11
            int r2 = r0.length()
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r2 = r2 + 1
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = ":"
            r4.append(r0)
            r4.append(r11)
            java.lang.String r2 = r4.toString()
        Ld3:
            O3.a2 r11 = r1.s(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0333w1.E(boolean):O3.a2");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean F() {
        o();
        p();
        return this.f5109u != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #56 {all -> 0x0480, blocks: (B:269:0x0470, B:259:0x0444, B:261:0x044a, B:262:0x044d, B:279:0x0491, B:208:0x037b, B:210:0x0385, B:215:0x0396), top: B:420:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x047c A[PHI: r5 r6 r24 r25 r27 r37 r38
  0x047c: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
  (r5v12 android.database.sqlite.SQLiteDatabase)
  (r5v13 android.database.sqlite.SQLiteDatabase)
  (r5v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
  0x047c: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x04a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(O3.I r67, y3.AbstractC1915a r68, O3.a2 r69) throws java.lang.Throwable {
        /*
            r66 = this;
            r2 = r68
            r66.o()
            r66.p()
            r66.A()
            r3 = r66
            java.lang.Object r0 = r3.f4346r
            r4 = r0
            O3.t0 r4 = (O3.C0323t0) r4
            r4.getClass()
            android.content.Context r5 = r4.f5072q
            O3.X r6 = r4.f5077v
            B3.a r7 = r4.f5052A
            O3.g r8 = r4.f5075t
            r10 = 100
            r11 = r69
            r0 = r10
            r12 = 0
        L23:
            r13 = 1001(0x3e9, float:1.403E-42)
            if (r12 >= r13) goto L6f3
            if (r0 != r10) goto L6f3
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            O3.P r14 = r4.n()
            java.lang.String r15 = "Error reading entries from local database"
            r16 = r10
            java.lang.String r10 = "entry"
            java.lang.String r9 = "type"
            java.lang.String r3 = "rowid"
            java.lang.Object r0 = r14.f4346r
            r18 = r7
            r7 = r0
            O3.t0 r7 = (O3.C0323t0) r7
            r14.o()
            boolean r0 = r14.f4549u
            r69 = r12
            r19 = 0
            if (r0 == 0) goto L58
            r21 = r4
            r22 = r5
            r23 = r6
        L54:
            r1 = 0
        L55:
            r12 = 0
            goto L4d1
        L58:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.Object r0 = r14.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            android.content.Context r0 = r0.f5072q
            r21 = r4
            java.lang.String r4 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r4)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L4cc
            r4 = 5
            r22 = r5
            r23 = r6
            r5 = 0
            r6 = r4
        L78:
            if (r5 >= r4) goto L4bd
            r4 = 1
            android.database.sqlite.SQLiteDatabase r25 = r14.u()     // Catch: java.lang.Throwable -> L431 android.database.sqlite.SQLiteException -> L434 android.database.sqlite.SQLiteDatabaseLockedException -> L462 android.database.sqlite.SQLiteFullException -> L483
            if (r25 != 0) goto Lb8
            r14.f4549u = r4     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L99 android.database.sqlite.SQLiteFullException -> La8
            goto L54
        L84:
            r0 = move-exception
            r5 = r25
            goto L424
        L89:
            r0 = move-exception
            r38 = r3
            r37 = r5
        L8e:
            r27 = r10
            r5 = r25
            r1 = 0
            r24 = 5
        L95:
            r25 = r9
            goto L427
        L99:
            r38 = r3
            r37 = r5
        L9d:
            r27 = r10
            r5 = r25
            r1 = 0
            r24 = 5
        La4:
            r25 = r9
            goto L42a
        La8:
            r0 = move-exception
            r38 = r3
            r37 = r5
        Lad:
            r27 = r10
            r5 = r25
            r1 = 0
            r24 = 5
        Lb4:
            r25 = r9
            goto L42d
        Lb8:
            r25.beginTransaction()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L89 android.database.sqlite.SQLiteDatabaseLockedException -> L99 android.database.sqlite.SQLiteFullException -> La8
            java.lang.String r0 = "3"
            java.lang.String r26 = "messages"
            java.lang.String[] r27 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L408
            java.lang.String r28 = "type=?"
            java.lang.String[] r29 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L408
            java.lang.String r32 = "rowid desc"
            java.lang.String r33 = "1"
            r30 = 0
            r31 = 0
            android.database.Cursor r4 = r25.query(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L408
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L403
            r35 = -1
            if (r0 == 0) goto L101
            r37 = r5
            r5 = 0
            long r26 = r4.getLong(r5)     // Catch: java.lang.Throwable -> Lf3
            r4.close()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> Le8 android.database.sqlite.SQLiteDatabaseLockedException -> Lec android.database.sqlite.SQLiteFullException -> Lef
            goto L108
        Le8:
            r0 = move-exception
            r38 = r3
            goto L8e
        Lec:
            r38 = r3
            goto L9d
        Lef:
            r0 = move-exception
            r38 = r3
            goto Lad
        Lf3:
            r0 = move-exception
        Lf4:
            r38 = r3
            r27 = r10
            r5 = r25
            r1 = 0
            r24 = 5
            r25 = r9
            goto L417
        L101:
            r37 = r5
            r4.close()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L3f8 android.database.sqlite.SQLiteDatabaseLockedException -> L3fc android.database.sqlite.SQLiteFullException -> L3ff
            r26 = r35
        L108:
            int r0 = (r26 > r35 ? 1 : (r26 == r35 ? 0 : -1))
            if (r0 == 0) goto L11e
            java.lang.String r0 = "rowid<?"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> Le8 android.database.sqlite.SQLiteDatabaseLockedException -> Lec android.database.sqlite.SQLiteFullException -> Lef
            java.lang.String r4 = java.lang.String.valueOf(r26)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> Le8 android.database.sqlite.SQLiteDatabaseLockedException -> Lec android.database.sqlite.SQLiteFullException -> Lef
            r17 = 0
            r5[r17] = r4     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> Le8 android.database.sqlite.SQLiteDatabaseLockedException -> Lec android.database.sqlite.SQLiteFullException -> Lef
            r28 = r0
            r29 = r5
            goto L122
        L11e:
            r28 = 0
            r29 = 0
        L122:
            java.lang.String[] r0 = new java.lang.String[]{r3, r9, r10}     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L3f8 android.database.sqlite.SQLiteDatabaseLockedException -> L3fc android.database.sqlite.SQLiteFullException -> L3ff
            O3.g r4 = r7.f5075t     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L3f8 android.database.sqlite.SQLiteDatabaseLockedException -> L3fc android.database.sqlite.SQLiteFullException -> L3ff
            O3.E r5 = O3.F.f4420c1     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L3f8 android.database.sqlite.SQLiteDatabaseLockedException -> L3fc android.database.sqlite.SQLiteFullException -> L3ff
            r38 = r3
            r3 = 0
            boolean r4 = r4.y(r3, r5)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L3ce android.database.sqlite.SQLiteDatabaseLockedException -> L3d9 android.database.sqlite.SQLiteFullException -> L3e3
            r39 = 4
            r40 = 3
            r3 = 2
            if (r4 == 0) goto L16d
            r4 = 5
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L150 android.database.sqlite.SQLiteDatabaseLockedException -> L15a android.database.sqlite.SQLiteFullException -> L163
            r17 = 0
            r0[r17] = r38     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L150 android.database.sqlite.SQLiteDatabaseLockedException -> L15a android.database.sqlite.SQLiteFullException -> L163
            r34 = 1
            r0[r34] = r9     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L150 android.database.sqlite.SQLiteDatabaseLockedException -> L15a android.database.sqlite.SQLiteFullException -> L163
            r0[r3] = r10     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L150 android.database.sqlite.SQLiteDatabaseLockedException -> L15a android.database.sqlite.SQLiteFullException -> L163
            java.lang.String r24 = "app_version"
            r0[r40] = r24     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L150 android.database.sqlite.SQLiteDatabaseLockedException -> L15a android.database.sqlite.SQLiteFullException -> L163
            java.lang.String r24 = "app_version_int"
            r0[r39] = r24     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L150 android.database.sqlite.SQLiteDatabaseLockedException -> L15a android.database.sqlite.SQLiteFullException -> L163
        L14d:
            r27 = r0
            goto L16f
        L150:
            r0 = move-exception
            r24 = r4
            r27 = r10
            r5 = r25
            r1 = 0
            goto L95
        L15a:
            r24 = r4
            r27 = r10
            r5 = r25
            r1 = 0
            goto La4
        L163:
            r0 = move-exception
            r24 = r4
            r27 = r10
            r5 = r25
            r1 = 0
            goto Lb4
        L16d:
            r4 = 5
            goto L14d
        L16f:
            java.lang.String r26 = "messages"
            java.lang.String r32 = "rowid asc"
            java.lang.String r33 = java.lang.Integer.toString(r16)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L3ce android.database.sqlite.SQLiteFullException -> L3e3 android.database.sqlite.SQLiteDatabaseLockedException -> L3ee
            r30 = 0
            r31 = 0
            android.database.Cursor r4 = r25.query(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L3ce android.database.sqlite.SQLiteDatabaseLockedException -> L3d9 android.database.sqlite.SQLiteFullException -> L3e3
            r41 = r25
        L181:
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> L1b6 android.database.sqlite.SQLiteException -> L3a8 android.database.sqlite.SQLiteDatabaseLockedException -> L3b5 android.database.sqlite.SQLiteFullException -> L3c1
            if (r0 == 0) goto L366
            r3 = 0
            long r35 = r4.getLong(r3)     // Catch: java.lang.Throwable -> L1b6 android.database.sqlite.SQLiteException -> L349 android.database.sqlite.SQLiteDatabaseLockedException -> L353 android.database.sqlite.SQLiteFullException -> L35c
            r3 = 1
            int r0 = r4.getInt(r3)     // Catch: java.lang.Throwable -> L1b6 android.database.sqlite.SQLiteException -> L338 android.database.sqlite.SQLiteDatabaseLockedException -> L33e android.database.sqlite.SQLiteFullException -> L343
            r25 = r9
            r3 = 2
            byte[] r9 = r4.getBlob(r3)     // Catch: java.lang.Throwable -> L1b6 android.database.sqlite.SQLiteException -> L327 android.database.sqlite.SQLiteDatabaseLockedException -> L32d android.database.sqlite.SQLiteFullException -> L332
            O3.g r3 = r7.f5075t     // Catch: java.lang.Throwable -> L1b6 android.database.sqlite.SQLiteException -> L327 android.database.sqlite.SQLiteDatabaseLockedException -> L32d android.database.sqlite.SQLiteFullException -> L332
            r27 = r10
            r10 = 0
            boolean r3 = r3.y(r10, r5)     // Catch: java.lang.Throwable -> L1b6 android.database.sqlite.SQLiteException -> L31c android.database.sqlite.SQLiteDatabaseLockedException -> L320 android.database.sqlite.SQLiteFullException -> L323
            if (r3 == 0) goto L1d4
            r3 = r40
            java.lang.String r10 = r4.getString(r3)     // Catch: java.lang.Throwable -> L1b6 android.database.sqlite.SQLiteException -> L1bd android.database.sqlite.SQLiteDatabaseLockedException -> L1c5 android.database.sqlite.SQLiteFullException -> L1cc
            r3 = r39
            long r28 = r4.getLong(r3)     // Catch: java.lang.Throwable -> L1b6 android.database.sqlite.SQLiteException -> L1bd android.database.sqlite.SQLiteDatabaseLockedException -> L1c5 android.database.sqlite.SQLiteFullException -> L1cc
            r64 = r28
            r28 = r4
            r3 = r64
            goto L1d9
        L1b6:
            r0 = move-exception
            r28 = r4
        L1b9:
            r5 = r41
            goto L3a4
        L1bd:
            r0 = move-exception
            r28 = r4
        L1c0:
            r5 = r41
            r1 = 0
            goto L3b1
        L1c5:
            r28 = r4
        L1c7:
            r5 = r41
            r1 = 0
            goto L3bd
        L1cc:
            r0 = move-exception
            r28 = r4
        L1cf:
            r5 = r41
            r1 = 0
            goto L3ca
        L1d4:
            r28 = r4
            r3 = r19
            r10 = 0
        L1d9:
            if (r0 != 0) goto L21e
            r29 = r5
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            int r0 = r9.length     // Catch: java.lang.Throwable -> L208 y3.C1916b -> L20a
            r1 = 0
            r5.unmarshall(r9, r1, r0)     // Catch: java.lang.Throwable -> L208 y3.C1916b -> L20a
            r5.setDataPosition(r1)     // Catch: java.lang.Throwable -> L208 y3.C1916b -> L20a
            android.os.Parcelable$Creator<O3.v> r0 = O3.C0328v.CREATOR     // Catch: java.lang.Throwable -> L208 y3.C1916b -> L20a
            java.lang.Object r0 = r0.createFromParcel(r5)     // Catch: java.lang.Throwable -> L208 y3.C1916b -> L20a
            O3.v r0 = (O3.C0328v) r0     // Catch: java.lang.Throwable -> L208 y3.C1916b -> L20a
            r5.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            if (r0 == 0) goto L1fe
            O3.O r1 = new O3.O     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            r1.<init>(r0, r10, r3)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            r12.add(r1)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
        L1fe:
            r1 = 0
        L1ff:
            r3 = 3
            goto L30d
        L202:
            r0 = move-exception
            goto L1b9
        L204:
            r0 = move-exception
            goto L1c0
        L206:
            r0 = move-exception
            goto L1cf
        L208:
            r0 = move-exception
            goto L21a
        L20a:
            O3.X r0 = r7.f5077v     // Catch: java.lang.Throwable -> L208
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L208
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L208
            java.lang.String r1 = "Failed to load event from local database"
            r0.b(r1)     // Catch: java.lang.Throwable -> L208
            r5.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            goto L1fe
        L21a:
            r5.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            throw r0     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
        L21e:
            r29 = r5
            r1 = 1
            if (r0 != r1) goto L25c
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            int r0 = r9.length     // Catch: java.lang.Throwable -> L23b y3.C1916b -> L23d
            r5 = 0
            r1.unmarshall(r9, r5, r0)     // Catch: java.lang.Throwable -> L23b y3.C1916b -> L23d
            r1.setDataPosition(r5)     // Catch: java.lang.Throwable -> L23b y3.C1916b -> L23d
            android.os.Parcelable$Creator<O3.V1> r0 = O3.V1.CREATOR     // Catch: java.lang.Throwable -> L23b y3.C1916b -> L23d
            java.lang.Object r0 = r0.createFromParcel(r1)     // Catch: java.lang.Throwable -> L23b y3.C1916b -> L23d
            O3.V1 r0 = (O3.V1) r0     // Catch: java.lang.Throwable -> L23b y3.C1916b -> L23d
            r1.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            goto L24d
        L23b:
            r0 = move-exception
            goto L258
        L23d:
            O3.X r0 = r7.f5077v     // Catch: java.lang.Throwable -> L23b
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L23b
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L23b
            java.lang.String r5 = "Failed to load user property from local database"
            r0.b(r5)     // Catch: java.lang.Throwable -> L23b
            r1.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            r0 = 0
        L24d:
            if (r0 == 0) goto L1fe
            O3.O r1 = new O3.O     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            r1.<init>(r0, r10, r3)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            r12.add(r1)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            goto L1fe
        L258:
            r1.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            throw r0     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
        L25c:
            r1 = 2
            if (r0 != r1) goto L299
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            int r0 = r9.length     // Catch: java.lang.Throwable -> L277 y3.C1916b -> L279
            r1 = 0
            r5.unmarshall(r9, r1, r0)     // Catch: java.lang.Throwable -> L277 y3.C1916b -> L279
            r5.setDataPosition(r1)     // Catch: java.lang.Throwable -> L277 y3.C1916b -> L279
            android.os.Parcelable$Creator<O3.e> r0 = O3.C0278e.CREATOR     // Catch: java.lang.Throwable -> L277 y3.C1916b -> L279
            java.lang.Object r0 = r0.createFromParcel(r5)     // Catch: java.lang.Throwable -> L277 y3.C1916b -> L279
            O3.e r0 = (O3.C0278e) r0     // Catch: java.lang.Throwable -> L277 y3.C1916b -> L279
            r5.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            goto L289
        L277:
            r0 = move-exception
            goto L295
        L279:
            O3.X r0 = r7.f5077v     // Catch: java.lang.Throwable -> L277
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L277
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L277
            java.lang.String r1 = "Failed to load conditional user property from local database"
            r0.b(r1)     // Catch: java.lang.Throwable -> L277
            r5.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            r0 = 0
        L289:
            if (r0 == 0) goto L1fe
            O3.O r1 = new O3.O     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            r1.<init>(r0, r10, r3)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            r12.add(r1)     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            goto L1fe
        L295:
            r5.recycle()     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
            throw r0     // Catch: android.database.sqlite.SQLiteDatabaseLockedException -> L1c7 java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L204 android.database.sqlite.SQLiteFullException -> L206
        L299:
            r1 = 4
            if (r0 != r1) goto L2f0
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2e8 android.database.sqlite.SQLiteDatabaseLockedException -> L2eb android.database.sqlite.SQLiteFullException -> L2ed
            int r0 = r9.length     // Catch: java.lang.Throwable -> L2c4 y3.C1916b -> L2c7
            r1 = 0
            r5.unmarshall(r9, r1, r0)     // Catch: java.lang.Throwable -> L2c2 y3.C1916b -> L2c8
            r5.setDataPosition(r1)     // Catch: java.lang.Throwable -> L2c2 y3.C1916b -> L2c8
            android.os.Parcelable$Creator<O3.u> r0 = O3.C0325u.CREATOR     // Catch: java.lang.Throwable -> L2c2 y3.C1916b -> L2c8
            java.lang.Object r0 = r0.createFromParcel(r5)     // Catch: java.lang.Throwable -> L2c2 y3.C1916b -> L2c8
            O3.u r0 = (O3.C0325u) r0     // Catch: java.lang.Throwable -> L2c2 y3.C1916b -> L2c8
            r5.recycle()     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            goto L2d8
        L2b4:
            r0 = move-exception
        L2b5:
            r5 = r41
            goto L3b1
        L2b9:
            r5 = r41
            goto L3bd
        L2bd:
            r0 = move-exception
        L2be:
            r5 = r41
            goto L3ca
        L2c2:
            r0 = move-exception
            goto L2e4
        L2c4:
            r0 = move-exception
            r1 = 0
            goto L2e4
        L2c7:
            r1 = 0
        L2c8:
            O3.X r0 = r7.f5077v     // Catch: java.lang.Throwable -> L2c2
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L2c2
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L2c2
            java.lang.String r9 = "Failed to load default event parameters from local database"
            r0.b(r9)     // Catch: java.lang.Throwable -> L2c2
            r5.recycle()     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            r0 = 0
        L2d8:
            if (r0 == 0) goto L1ff
            O3.O r5 = new O3.O     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            r5.<init>(r0, r10, r3)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            r12.add(r5)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            goto L1ff
        L2e4:
            r5.recycle()     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            throw r0     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
        L2e8:
            r0 = move-exception
        L2e9:
            r1 = 0
            goto L2b5
        L2eb:
            r1 = 0
            goto L2b9
        L2ed:
            r0 = move-exception
        L2ee:
            r1 = 0
            goto L2be
        L2f0:
            r1 = 0
            r3 = 3
            if (r0 != r3) goto L301
            O3.X r0 = r7.f5077v     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            O3.V r0 = r0.f4666E     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            java.lang.String r4 = "Skipping app launch break"
            r0.b(r4)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            goto L30d
        L301:
            O3.X r0 = r7.f5077v     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            java.lang.String r4 = "Unknown record type in local database"
            r0.b(r4)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
        L30d:
            r40 = r3
            r9 = r25
            r10 = r27
            r4 = r28
            r5 = r29
            r3 = 2
            r39 = 4
            goto L181
        L31c:
            r0 = move-exception
            r28 = r4
            goto L2e9
        L320:
            r28 = r4
            goto L2eb
        L323:
            r0 = move-exception
            r28 = r4
            goto L2ee
        L327:
            r0 = move-exception
            r28 = r4
        L32a:
            r27 = r10
            goto L2e9
        L32d:
            r28 = r4
        L32f:
            r27 = r10
            goto L2eb
        L332:
            r0 = move-exception
            r28 = r4
        L335:
            r27 = r10
            goto L2ee
        L338:
            r0 = move-exception
            r28 = r4
            r25 = r9
            goto L32a
        L33e:
            r28 = r4
            r25 = r9
            goto L32f
        L343:
            r0 = move-exception
            r28 = r4
            r25 = r9
            goto L335
        L349:
            r0 = move-exception
            r1 = r3
            r28 = r4
            r25 = r9
            r27 = r10
            goto L2b5
        L353:
            r1 = r3
            r28 = r4
            r25 = r9
            r27 = r10
            goto L2b9
        L35c:
            r0 = move-exception
            r1 = r3
            r28 = r4
            r25 = r9
            r27 = r10
            goto L2be
        L366:
            r28 = r4
            r25 = r9
            r27 = r10
            r1 = 0
            java.lang.String r0 = "messages"
            java.lang.String r3 = "rowid <= ?"
            java.lang.String r4 = java.lang.Long.toString(r35)     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L202 android.database.sqlite.SQLiteException -> L2b4 android.database.sqlite.SQLiteDatabaseLockedException -> L2b9 android.database.sqlite.SQLiteFullException -> L2bd
            r5 = r41
            int r0 = r5.delete(r0, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L392 android.database.sqlite.SQLiteFullException -> L394 android.database.sqlite.SQLiteDatabaseLockedException -> L3bd java.lang.Throwable -> L480
            int r3 = r12.size()     // Catch: android.database.sqlite.SQLiteException -> L392 android.database.sqlite.SQLiteFullException -> L394 android.database.sqlite.SQLiteDatabaseLockedException -> L3bd java.lang.Throwable -> L480
            if (r0 >= r3) goto L396
            O3.X r0 = r7.f5077v     // Catch: android.database.sqlite.SQLiteException -> L392 android.database.sqlite.SQLiteFullException -> L394 android.database.sqlite.SQLiteDatabaseLockedException -> L3bd java.lang.Throwable -> L480
            O3.C0323t0.l(r0)     // Catch: android.database.sqlite.SQLiteException -> L392 android.database.sqlite.SQLiteFullException -> L394 android.database.sqlite.SQLiteDatabaseLockedException -> L3bd java.lang.Throwable -> L480
            O3.V r0 = r0.f4670w     // Catch: android.database.sqlite.SQLiteException -> L392 android.database.sqlite.SQLiteFullException -> L394 android.database.sqlite.SQLiteDatabaseLockedException -> L3bd java.lang.Throwable -> L480
            java.lang.String r3 = "Fewer entries removed from local database than expected"
            r0.b(r3)     // Catch: android.database.sqlite.SQLiteException -> L392 android.database.sqlite.SQLiteFullException -> L394 android.database.sqlite.SQLiteDatabaseLockedException -> L3bd java.lang.Throwable -> L480
            goto L396
        L392:
            r0 = move-exception
            goto L3b1
        L394:
            r0 = move-exception
            goto L3ca
        L396:
            r5.setTransactionSuccessful()     // Catch: android.database.sqlite.SQLiteException -> L392 android.database.sqlite.SQLiteFullException -> L394 android.database.sqlite.SQLiteDatabaseLockedException -> L3bd java.lang.Throwable -> L480
            r5.endTransaction()     // Catch: android.database.sqlite.SQLiteException -> L392 android.database.sqlite.SQLiteFullException -> L394 android.database.sqlite.SQLiteDatabaseLockedException -> L3bd java.lang.Throwable -> L480
            r28.close()
            r5.close()
            goto L4d1
        L3a4:
            r12 = r28
            goto L4b2
        L3a8:
            r0 = move-exception
            r28 = r4
            r25 = r9
            r27 = r10
            goto L1c0
        L3b1:
            r24 = 5
            goto L442
        L3b5:
            r28 = r4
            r25 = r9
            r27 = r10
            goto L1c7
        L3bd:
            r24 = 5
            goto L46f
        L3c1:
            r0 = move-exception
            r28 = r4
            r25 = r9
            r27 = r10
            goto L1cf
        L3ca:
            r24 = 5
            goto L491
        L3ce:
            r0 = move-exception
        L3cf:
            r27 = r10
            r5 = r25
            r1 = 0
            r25 = r9
            r24 = 5
            goto L427
        L3d9:
            r27 = r10
            r5 = r25
            r1 = 0
            r25 = r9
            r24 = 5
            goto L42a
        L3e3:
            r0 = move-exception
        L3e4:
            r27 = r10
            r5 = r25
            r1 = 0
            r25 = r9
            r24 = 5
            goto L42d
        L3ee:
            r27 = r10
            r5 = r25
            r1 = 0
            r25 = r9
            r24 = r4
            goto L42a
        L3f8:
            r0 = move-exception
            r38 = r3
            goto L3cf
        L3fc:
            r38 = r3
            goto L3d9
        L3ff:
            r0 = move-exception
            r38 = r3
            goto L3e4
        L403:
            r0 = move-exception
            r37 = r5
            goto Lf4
        L408:
            r0 = move-exception
            r38 = r3
            r37 = r5
            r27 = r10
            r5 = r25
            r1 = 0
            r24 = 5
            r25 = r9
            r4 = 0
        L417:
            if (r4 == 0) goto L423
            r4.close()     // Catch: java.lang.Throwable -> L41d android.database.sqlite.SQLiteException -> L41f android.database.sqlite.SQLiteFullException -> L421 android.database.sqlite.SQLiteDatabaseLockedException -> L42a
            goto L423
        L41d:
            r0 = move-exception
            goto L424
        L41f:
            r0 = move-exception
            goto L427
        L421:
            r0 = move-exception
            goto L42d
        L423:
            throw r0     // Catch: java.lang.Throwable -> L41d android.database.sqlite.SQLiteException -> L41f android.database.sqlite.SQLiteFullException -> L421 android.database.sqlite.SQLiteDatabaseLockedException -> L42a
        L424:
            r12 = 0
            goto L4b2
        L427:
            r28 = 0
            goto L442
        L42a:
            r28 = 0
            goto L46f
        L42d:
            r28 = 0
            goto L491
        L431:
            r0 = move-exception
            r5 = 0
            goto L424
        L434:
            r0 = move-exception
            r38 = r3
            r37 = r5
            r25 = r9
            r27 = r10
            r1 = 0
            r24 = 5
            r5 = 0
            goto L427
        L442:
            if (r5 == 0) goto L44d
            boolean r3 = r5.inTransaction()     // Catch: java.lang.Throwable -> L480
            if (r3 == 0) goto L44d
            r5.endTransaction()     // Catch: java.lang.Throwable -> L480
        L44d:
            O3.X r3 = r7.f5077v     // Catch: java.lang.Throwable -> L480
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> L480
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> L480
            r3.c(r0, r15)     // Catch: java.lang.Throwable -> L480
            r3 = 1
            r14.f4549u = r3     // Catch: java.lang.Throwable -> L480
            if (r28 == 0) goto L45f
            r28.close()
        L45f:
            if (r5 == 0) goto L4a6
            goto L47c
        L462:
            r38 = r3
            r37 = r5
            r25 = r9
            r27 = r10
            r1 = 0
            r24 = 5
            r5 = 0
            goto L42a
        L46f:
            long r3 = (long) r6
            android.os.SystemClock.sleep(r3)     // Catch: java.lang.Throwable -> L480
            int r6 = r6 + 20
            if (r28 == 0) goto L47a
            r28.close()
        L47a:
            if (r5 == 0) goto L4a6
        L47c:
            r5.close()
            goto L4a6
        L480:
            r0 = move-exception
            goto L3a4
        L483:
            r0 = move-exception
            r38 = r3
            r37 = r5
            r25 = r9
            r27 = r10
            r1 = 0
            r24 = 5
            r5 = 0
            goto L42d
        L491:
            O3.X r3 = r7.f5077v     // Catch: java.lang.Throwable -> L480
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> L480
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> L480
            r3.c(r0, r15)     // Catch: java.lang.Throwable -> L480
            r3 = 1
            r14.f4549u = r3     // Catch: java.lang.Throwable -> L480
            if (r28 == 0) goto L4a3
            r28.close()
        L4a3:
            if (r5 == 0) goto L4a6
            goto L47c
        L4a6:
            int r5 = r37 + 1
            r4 = r24
            r9 = r25
            r10 = r27
            r3 = r38
            goto L78
        L4b2:
            if (r12 == 0) goto L4b7
            r12.close()
        L4b7:
            if (r5 == 0) goto L4bc
            r5.close()
        L4bc:
            throw r0
        L4bd:
            r1 = 0
            O3.X r0 = r7.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4673z
            java.lang.String r3 = "Failed to read events from database in reasonable time"
            r0.b(r3)
            goto L55
        L4cc:
            r22 = r5
            r23 = r6
            r1 = 0
        L4d1:
            if (r12 == 0) goto L4dc
            r13.addAll(r12)
            int r0 = r12.size()
            r3 = r0
            goto L4dd
        L4dc:
            r3 = r1
        L4dd:
            r4 = r16
            if (r2 == 0) goto L4ef
            if (r3 >= r4) goto L4ef
            java.lang.String r0 = r11.f4731s
            long r5 = r11.f4738z
            O3.O r7 = new O3.O
            r7.<init>(r2, r0, r5)
            r13.add(r7)
        L4ef:
            O3.E r0 = O3.F.f4390O0
            r10 = 0
            boolean r5 = r8.y(r10, r0)
            int r6 = r13.size()
            r7 = r1
        L4fb:
            if (r7 >= r6) goto L6d9
            java.lang.Object r0 = r13.get(r7)
            O3.O r0 = (O3.O) r0
            y3.a r9 = r0.f4541a
            O3.E r12 = O3.F.f4420c1
            boolean r14 = r8.y(r10, r12)
            if (r14 == 0) goto L596
            java.lang.String r10 = r0.f4542b
            boolean r14 = android.text.TextUtils.isEmpty(r10)
            if (r14 != 0) goto L596
            long r14 = r0.f4543c
            java.lang.String r0 = r11.f4729q
            java.lang.String r1 = r11.f4730r
            java.lang.String r4 = r11.f4732t
            r25 = r0
            r26 = r1
            long r0 = r11.f4733u
            r31 = r0
            long r0 = r11.f4734v
            r33 = r0
            java.lang.String r0 = r11.f4735w
            boolean r1 = r11.f4736x
            r35 = r0
            boolean r0 = r11.f4737y
            r37 = r0
            java.lang.String r0 = r11.f4708A
            r38 = r0
            r36 = r1
            long r0 = r11.f4709B
            r39 = r0
            int r0 = r11.f4710C
            boolean r1 = r11.f4711D
            r41 = r0
            boolean r0 = r11.f4712E
            r43 = r0
            java.lang.Boolean r0 = r11.f4713F
            r44 = r0
            r42 = r1
            long r0 = r11.f4714G
            r45 = r0
            java.util.List r0 = r11.f4715H
            java.lang.String r1 = r11.f4716I
            r47 = r0
            java.lang.String r0 = r11.f4717J
            r49 = r0
            java.lang.String r0 = r11.f4718K
            r50 = r0
            boolean r0 = r11.f4719L
            r51 = r0
            r48 = r1
            long r0 = r11.f4720M
            r52 = r0
            int r0 = r11.f4721N
            java.lang.String r1 = r11.f4722O
            r54 = r0
            int r0 = r11.f4723P
            r56 = r0
            r55 = r1
            long r0 = r11.f4724Q
            r57 = r0
            java.lang.String r0 = r11.f4725R
            java.lang.String r1 = r11.f4726S
            r59 = r0
            r60 = r1
            long r0 = r11.f4727T
            int r11 = r11.f4728U
            O3.a2 r24 = new O3.a2
            r61 = r0
            r30 = r4
            r27 = r10
            r63 = r11
            r28 = r14
            r24.<init>(r25, r26, r27, r28, r30, r31, r33, r35, r36, r37, r38, r39, r41, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r54, r55, r56, r57, r59, r60, r61, r63)
            r11 = r24
        L596:
            boolean r0 = r9 instanceof O3.C0328v
            if (r0 == 0) goto L669
            if (r5 == 0) goto L5c7
            r18.getClass()     // Catch: android.os.RemoteException -> L5bf
            long r14 = java.lang.System.currentTimeMillis()     // Catch: android.os.RemoteException -> L5bf
            r18.getClass()     // Catch: android.os.RemoteException -> L5ae
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: android.os.RemoteException -> L5ae
            r27 = r14
            r14 = r0
            goto L5cb
        L5ae:
            r0 = move-exception
            r1 = r67
            r27 = r14
            r14 = r19
        L5b5:
            r10 = r21
            r9 = r22
            r4 = r23
        L5bb:
            r23 = r3
            goto L634
        L5bf:
            r0 = move-exception
            r1 = r67
            r14 = r19
            r27 = r14
            goto L5b5
        L5c7:
            r14 = r19
            r27 = r14
        L5cb:
            O3.v r9 = (O3.C0328v) r9     // Catch: android.os.RemoteException -> L630
            r1 = r67
            r1.H(r9, r11)     // Catch: android.os.RemoteException -> L627
            if (r5 == 0) goto L629
            O3.C0323t0.l(r23)     // Catch: android.os.RemoteException -> L627
            r4 = r23
            O3.V r0 = r4.f4666E     // Catch: android.os.RemoteException -> L61f
            java.lang.String r9 = "Logging telemetry for logEvent from database"
            r0.b(r9)     // Catch: android.os.RemoteException -> L61f
            B0.G0 r0 = B0.G0.f231u     // Catch: android.os.RemoteException -> L61f
            if (r0 != 0) goto L5f6
            B0.G0 r0 = new B0.G0     // Catch: android.os.RemoteException -> L5f0
            r10 = r21
            r9 = r22
            r0.<init>(r9, r10)     // Catch: android.os.RemoteException -> L61d
            B0.G0.f231u = r0     // Catch: android.os.RemoteException -> L61d
            goto L5fa
        L5f0:
            r0 = move-exception
            r10 = r21
            r9 = r22
            goto L5bb
        L5f6:
            r10 = r21
            r9 = r22
        L5fa:
            B0.G0 r24 = B0.G0.f231u     // Catch: android.os.RemoteException -> L61d
            r18.getClass()     // Catch: android.os.RemoteException -> L61d
            long r29 = java.lang.System.currentTimeMillis()     // Catch: android.os.RemoteException -> L61d
            r18.getClass()     // Catch: android.os.RemoteException -> L61d
            long r21 = android.os.SystemClock.elapsedRealtime()     // Catch: android.os.RemoteException -> L61d
            r23 = r3
            long r2 = r21 - r14
            int r0 = (int) r2
            r25 = 0
            r26 = r0
            r24.d0(r25, r26, r27, r29)     // Catch: android.os.RemoteException -> L61b
        L616:
            r22 = r9
        L618:
            r3 = 0
            goto L6c9
        L61b:
            r0 = move-exception
            goto L634
        L61d:
            r0 = move-exception
            goto L5bb
        L61f:
            r0 = move-exception
            r23 = r3
            r10 = r21
            r9 = r22
            goto L634
        L627:
            r0 = move-exception
            goto L5b5
        L629:
            r10 = r21
            r4 = r23
            r23 = r3
            goto L618
        L630:
            r0 = move-exception
            r1 = r67
            goto L5b5
        L634:
            O3.C0323t0.l(r4)
            O3.V r2 = r4.f4670w
            java.lang.String r3 = "Failed to send event to the service"
            r2.c(r0, r3)
            if (r5 == 0) goto L616
            int r0 = (r27 > r19 ? 1 : (r27 == r19 ? 0 : -1))
            if (r0 == 0) goto L616
            B0.G0 r0 = B0.G0.f231u
            if (r0 != 0) goto L64f
            B0.G0 r0 = new B0.G0
            r0.<init>(r9, r10)
            B0.G0.f231u = r0
        L64f:
            B0.G0 r24 = B0.G0.f231u
            r18.getClass()
            long r29 = java.lang.System.currentTimeMillis()
            r18.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r14
            int r0 = (int) r2
            r25 = 13
            r26 = r0
            r24.d0(r25, r26, r27, r29)
            goto L616
        L669:
            r1 = r67
            r10 = r21
            r4 = r23
            r23 = r3
            boolean r0 = r9 instanceof O3.V1
            if (r0 == 0) goto L687
            O3.V1 r9 = (O3.V1) r9     // Catch: android.os.RemoteException -> L67b
            r1.e(r9, r11)     // Catch: android.os.RemoteException -> L67b
            goto L618
        L67b:
            r0 = move-exception
            O3.C0323t0.l(r4)
            O3.V r2 = r4.f4670w
            java.lang.String r3 = "Failed to send user property to the service"
            r2.c(r0, r3)
            goto L618
        L687:
            boolean r0 = r9 instanceof O3.C0278e
            if (r0 == 0) goto L69e
            O3.e r9 = (O3.C0278e) r9     // Catch: android.os.RemoteException -> L691
            r1.k(r9, r11)     // Catch: android.os.RemoteException -> L691
            goto L618
        L691:
            r0 = move-exception
            O3.C0323t0.l(r4)
            O3.V r2 = r4.f4670w
            java.lang.String r3 = "Failed to send conditional user property to the service"
            r2.c(r0, r3)
            goto L618
        L69e:
            r3 = 0
            boolean r0 = r8.y(r3, r12)
            if (r0 == 0) goto L6bf
            boolean r0 = r9 instanceof O3.C0325u
            if (r0 == 0) goto L6bf
            O3.u r9 = (O3.C0325u) r9     // Catch: android.os.RemoteException -> L6b3
            android.os.Bundle r0 = r9.c0()     // Catch: android.os.RemoteException -> L6b3
            r1.E(r11, r0)     // Catch: android.os.RemoteException -> L6b3
            goto L6c9
        L6b3:
            r0 = move-exception
            O3.C0323t0.l(r4)
            O3.V r2 = r4.f4670w
            java.lang.String r9 = "Failed to send default event parameters to the service"
            r2.c(r0, r9)
            goto L6c9
        L6bf:
            O3.C0323t0.l(r4)
            O3.V r0 = r4.f4670w
            java.lang.String r2 = "Discarding data. Unrecognized parcel type."
            r0.b(r2)
        L6c9:
            int r7 = r7 + 1
            r2 = r68
            r21 = r10
            r1 = 0
            r10 = r3
            r3 = r23
            r23 = r4
            r4 = 100
            goto L4fb
        L6d9:
            r1 = r67
            r10 = r21
            r4 = r23
            r23 = r3
            int r12 = r69 + 1
            r3 = r66
            r2 = r68
            r6 = r4
            r4 = r10
            r7 = r18
            r5 = r22
            r0 = r23
            r10 = 100
            goto L23
        L6f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0333w1.G(O3.I, y3.a, O3.a2):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(C0278e c0278e) {
        boolean zV;
        o();
        p();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        c0323t0.getClass();
        P pN = c0323t0.n();
        C0323t0 c0323t02 = (C0323t0) pN.f4346r;
        C0323t0.j(c0323t02.f5080y);
        byte[] bArrS = Y1.S(c0278e);
        if (bArrS.length > 131072) {
            X x6 = c0323t02.f5077v;
            C0323t0.l(x6);
            x6.f4671x.b("Conditional user property too long for local database. Sending directly to service");
            zV = false;
        } else {
            zV = pN.v(2, bArrS);
        }
        C(new RunnableC0316q1(this, E(true), zV, new C0278e(c0278e)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.H
    public final boolean r() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(AtomicReference atomicReference) {
        o();
        p();
        C(new RunnableC0335x0(this, atomicReference, E(false)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.o()
            r7.p()
            O3.u r4 = new O3.u
            r4.<init>(r8)
            r7.A()
            java.lang.Object r0 = r7.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.g r1 = r0.f5075t
            r2 = 0
            O3.E r3 = O3.F.f4420c1
            boolean r1 = r1.y(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            O3.P r0 = r0.n()
            java.lang.Object r1 = r0.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            O3.Y1 r3 = r1.f5080y
            O3.X r1 = r1.f5077v
            O3.C0323t0.j(r3)
            byte[] r3 = O3.Y1.S(r4)
            if (r3 != 0) goto L3f
            O3.C0323t0.l(r1)
            O3.V r0 = r1.f4671x
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.b(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            O3.C0323t0.l(r1)
            O3.V r0 = r1.f4671x
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.b(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.v(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            O3.a2 r2 = r7.E(r2)
            O3.T0 r0 = new O3.T0
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0333w1.t(android.os.Bundle):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        o();
        p();
        if (F()) {
            return;
        }
        if (v()) {
            ServiceConnectionC0330v1 serviceConnectionC0330v1 = this.f5108t;
            C0333w1 c0333w1 = serviceConnectionC0330v1.f5100s;
            c0333w1.o();
            Context context = ((C0323t0) c0333w1.f4346r).f5072q;
            synchronized (serviceConnectionC0330v1) {
                try {
                    if (serviceConnectionC0330v1.f5098q) {
                        X x6 = ((C0323t0) serviceConnectionC0330v1.f5100s.f4346r).f5077v;
                        C0323t0.l(x6);
                        x6.f4666E.b("Connection attempt already in progress");
                        return;
                    } else {
                        if (serviceConnectionC0330v1.f5099r != null && (serviceConnectionC0330v1.f5099r.f() || serviceConnectionC0330v1.f5099r.a())) {
                            X x7 = ((C0323t0) serviceConnectionC0330v1.f5100s.f4346r).f5077v;
                            C0323t0.l(x7);
                            x7.f4666E.b("Already awaiting connection attempt");
                            return;
                        }
                        serviceConnectionC0330v1.f5099r = new S(context, Looper.getMainLooper(), x3.K.a(context), com.google.android.gms.common.f.f10343b, 93, serviceConnectionC0330v1, serviceConnectionC0330v1, null);
                        X x8 = ((C0323t0) serviceConnectionC0330v1.f5100s.f4346r).f5077v;
                        C0323t0.l(x8);
                        x8.f4666E.b("Connecting to remote service");
                        serviceConnectionC0330v1.f5098q = true;
                        AbstractC1887A.g(serviceConnectionC0330v1.f5099r);
                        serviceConnectionC0330v1.f5099r.n();
                        return;
                    }
                } finally {
                }
            }
        }
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (c0323t0.f5075t.r()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = c0323t0.f5072q.getPackageManager().queryIntentServices(new Intent().setClassName(c0323t0.f5072q, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            X x9 = c0323t0.f5077v;
            C0323t0.l(x9);
            x9.f4670w.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(c0323t0.f5072q, "com.google.android.gms.measurement.AppMeasurementService"));
        ServiceConnectionC0330v1 serviceConnectionC0330v12 = this.f5108t;
        C0333w1 c0333w12 = serviceConnectionC0330v12.f5100s;
        c0333w12.o();
        Context context2 = ((C0323t0) c0333w12.f4346r).f5072q;
        A3.b bVarA = A3.b.a();
        synchronized (serviceConnectionC0330v12) {
            try {
                if (serviceConnectionC0330v12.f5098q) {
                    X x10 = ((C0323t0) serviceConnectionC0330v12.f5100s.f4346r).f5077v;
                    C0323t0.l(x10);
                    x10.f4666E.b("Connection attempt already in progress");
                    return;
                }
                C0333w1 c0333w13 = serviceConnectionC0330v12.f5100s;
                X x11 = ((C0323t0) c0333w13.f4346r).f5077v;
                C0323t0.l(x11);
                x11.f4666E.b("Using local app measurement service");
                serviceConnectionC0330v12.f5098q = true;
                bVarA.c(context2, context2.getClass().getName(), intent, c0333w13.f5108t, 129, null);
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v() {
        /*
            r9 = this;
            r9.o()
            r9.p()
            java.lang.Boolean r0 = r9.f5110v
            if (r0 != 0) goto L133
            r9.o()
            r9.p()
            java.lang.Object r0 = r9.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.h0 r1 = r0.f5076u
            O3.C0323t0.j(r1)
            r1.o()
            android.content.SharedPreferences r2 = r1.s()
            java.lang.String r3 = "use_service"
            boolean r2 = r2.contains(r3)
            r4 = 0
            if (r2 != 0) goto L2b
            r1 = 0
            goto L37
        L2b:
            android.content.SharedPreferences r1 = r1.s()
            boolean r1 = r1.getBoolean(r3, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L37:
            r2 = 1
            if (r1 == 0) goto L42
            boolean r5 = r1.booleanValue()
            if (r5 == 0) goto L42
            goto L12d
        L42:
            java.lang.Object r5 = r9.f4346r
            O3.t0 r5 = (O3.C0323t0) r5
            O3.N r5 = r5.q()
            r5.p()
            int r5 = r5.f4522D
            if (r5 != r2) goto L54
        L51:
            r4 = r2
            goto Lfd
        L54:
            O3.X r5 = r0.f5077v
            O3.C0323t0.l(r5)
            O3.V r5 = r5.f4666E
            java.lang.String r6 = "Checking service availability"
            r5.b(r6)
            O3.Y1 r5 = r0.f5080y
            O3.C0323t0.j(r5)
            java.lang.Object r5 = r5.f4346r
            O3.t0 r5 = (O3.C0323t0) r5
            com.google.android.gms.common.f r6 = com.google.android.gms.common.f.f10343b
            android.content.Context r5 = r5.f5072q
            r7 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r5 = r6.c(r5, r7)
            if (r5 == 0) goto Lef
            if (r5 == r2) goto Le2
            r6 = 2
            if (r5 == r6) goto Lc0
            r1 = 3
            if (r5 == r1) goto Lb3
            r1 = 9
            if (r5 == r1) goto La6
            r1 = 18
            if (r5 == r1) goto L99
            O3.X r1 = r0.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4673z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.String r5 = "Unexpected service status"
            r1.c(r2, r5)
        L96:
            r2 = r4
            goto Lfd
        L99:
            O3.X r1 = r0.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4673z
            java.lang.String r4 = "Service updating"
            r1.b(r4)
            goto L51
        La6:
            O3.X r1 = r0.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4673z
            java.lang.String r2 = "Service invalid"
            r1.b(r2)
            goto L96
        Lb3:
            O3.X r1 = r0.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4673z
            java.lang.String r2 = "Service disabled"
            r1.b(r2)
            goto L96
        Lc0:
            O3.X r5 = r0.f5077v
            O3.C0323t0.l(r5)
            O3.V r5 = r5.f4665D
            java.lang.String r6 = "Service container out of date"
            r5.b(r6)
            O3.Y1 r5 = r0.f5080y
            O3.C0323t0.j(r5)
            int r5 = r5.U()
            r6 = 17443(0x4423, float:2.4443E-41)
            if (r5 >= r6) goto Lda
            goto Lfd
        Lda:
            if (r1 != 0) goto Ldd
            goto Lde
        Ldd:
            r2 = r4
        Lde:
            r8 = r4
            r4 = r2
            r2 = r8
            goto Lfd
        Le2:
            O3.X r1 = r0.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4666E
            java.lang.String r5 = "Service missing"
            r1.b(r5)
            goto Lfd
        Lef:
            O3.X r1 = r0.f5077v
            O3.C0323t0.l(r1)
            O3.V r1 = r1.f4666E
            java.lang.String r4 = "Service available"
            r1.b(r4)
            goto L51
        Lfd:
            if (r4 != 0) goto L114
            O3.g r1 = r0.f5075t
            boolean r1 = r1.r()
            if (r1 == 0) goto L114
            O3.X r0 = r0.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4670w
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.b(r1)
            goto L12c
        L114:
            if (r2 == 0) goto L12c
            O3.h0 r0 = r0.f5076u
            O3.C0323t0.j(r0)
            r0.o()
            android.content.SharedPreferences r0 = r0.s()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r3, r4)
            r0.apply()
        L12c:
            r2 = r4
        L12d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r9.f5110v = r0
        L133:
            java.lang.Boolean r0 = r9.f5110v
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0333w1.v():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w() {
        o();
        p();
        ServiceConnectionC0330v1 serviceConnectionC0330v1 = this.f5108t;
        if (serviceConnectionC0330v1.f5099r != null && (serviceConnectionC0330v1.f5099r.a() || serviceConnectionC0330v1.f5099r.f())) {
            serviceConnectionC0330v1.f5099r.j();
        }
        serviceConnectionC0330v1.f5099r = null;
        try {
            A3.b.a().b(((C0323t0) this.f4346r).f5072q, serviceConnectionC0330v1);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f5109u = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        o();
        p();
        if (!v()) {
            return true;
        }
        Y1 y12 = ((C0323t0) this.f4346r).f5080y;
        C0323t0.j(y12);
        return y12.U() >= ((Integer) F.f4380J0.a(null)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y() {
        o();
        p();
        if (!v()) {
            return true;
        }
        Y1 y12 = ((C0323t0) this.f4346r).f5080y;
        C0323t0.j(y12);
        return y12.U() >= 241200;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(ComponentName componentName) {
        o();
        if (this.f5109u != null) {
            this.f5109u = null;
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4666E.c(componentName, "Disconnected from device MeasurementService");
            o();
            u();
        }
    }
}
