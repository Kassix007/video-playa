package O3;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* JADX INFO: loaded from: classes.dex */
public final class P extends H {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f4547v = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0302m f4548t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4549u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P(C0323t0 c0323t0) {
        super(c0323t0);
        this.f4548t = new C0302m(this, ((C0323t0) this.f4346r).f5072q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.H
    public final boolean r() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        int iDelete;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        o();
        try {
            SQLiteDatabase sQLiteDatabaseU = u();
            if (sQLiteDatabaseU == null || (iDelete = sQLiteDatabaseU.delete("messages", null, null)) <= 0) {
                return;
            }
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4666E.c(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e7) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.c(e7, "Error resetting local analytics data. error");
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[PHI: r5
  0x0070: PHI (r5v4 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:32:0x0081, B:28:0x006e, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            java.lang.Object r1 = r11.f4346r
            O3.t0 r1 = (O3.C0323t0) r1
            r11.o()
            boolean r2 = r11.f4549u
            r3 = 0
            if (r2 == 0) goto L10
            goto L99
        L10:
            android.content.Context r2 = r1.f5072q
            java.lang.String r4 = "google_app_measurement_local.db"
            java.io.File r2 = r2.getDatabasePath(r4)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L99
            r2 = 5
            r5 = r2
            r4 = r3
        L21:
            if (r4 >= r2) goto L8d
            r6 = 0
            r7 = 1
            android.database.sqlite.SQLiteDatabase r6 = r11.u()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            if (r6 != 0) goto L2e
            r11.f4549u = r7     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            goto L99
        L2e:
            r6.beginTransaction()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            java.lang.String[] r10 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            r6.delete(r8, r9, r10)     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            r6.endTransaction()     // Catch: java.lang.Throwable -> L4b android.database.sqlite.SQLiteException -> L4d android.database.sqlite.SQLiteDatabaseLockedException -> L68 android.database.sqlite.SQLiteFullException -> L74
            r6.close()
            return r7
        L4b:
            r0 = move-exception
            goto L87
        L4d:
            r8 = move-exception
            if (r6 == 0) goto L59
            boolean r9 = r6.inTransaction()     // Catch: java.lang.Throwable -> L4b
            if (r9 == 0) goto L59
            r6.endTransaction()     // Catch: java.lang.Throwable -> L4b
        L59:
            O3.X r9 = r1.f5077v     // Catch: java.lang.Throwable -> L4b
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> L4b
            O3.V r9 = r9.f4670w     // Catch: java.lang.Throwable -> L4b
            r9.c(r8, r0)     // Catch: java.lang.Throwable -> L4b
            r11.f4549u = r7     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L84
            goto L70
        L68:
            long r7 = (long) r5     // Catch: java.lang.Throwable -> L4b
            android.os.SystemClock.sleep(r7)     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 + 20
            if (r6 == 0) goto L84
        L70:
            r6.close()
            goto L84
        L74:
            r8 = move-exception
            O3.X r9 = r1.f5077v     // Catch: java.lang.Throwable -> L4b
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> L4b
            O3.V r9 = r9.f4670w     // Catch: java.lang.Throwable -> L4b
            r9.c(r8, r0)     // Catch: java.lang.Throwable -> L4b
            r11.f4549u = r7     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L84
            goto L70
        L84:
            int r4 = r4 + 1
            goto L21
        L87:
            if (r6 == 0) goto L8c
            r6.close()
        L8c:
            throw r0
        L8d:
            O3.X r0 = r1.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4673z
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.b(r1)
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.P.t():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SQLiteDatabase u() {
        if (this.f4549u) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f4548t.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f4549u = true;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: SQLiteException -> 0x0093, SQLiteDatabaseLockedException -> 0x009a, SQLiteFullException -> 0x009e, all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int r19, byte[] r20) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Object r0 = r1.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            r1.o()
            boolean r2 = r1.f4549u
            r3 = 0
            if (r2 == 0) goto Lf
            goto L65
        Lf:
            O3.g r2 = r0.f5075t
            O3.X r4 = r0.f5077v
            O3.E r5 = O3.F.f4420c1
            r6 = 0
            boolean r2 = r2.y(r6, r5)
            if (r2 == 0) goto L25
            O3.N r2 = r0.q()
            O3.a2 r2 = r2.s(r6)
            goto L26
        L25:
            r2 = r6
        L26:
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r19)
            java.lang.String r9 = "type"
            r7.put(r9, r8)
            java.lang.String r8 = "entry"
            r9 = r20
            r7.put(r8, r9)
            O3.g r0 = r0.f5075t
            boolean r0 = r0.y(r6, r5)
            if (r0 == 0) goto L57
            if (r2 == 0) goto L57
            java.lang.String r0 = "app_version"
            java.lang.String r5 = r2.f4731s
            r7.put(r0, r5)
            long r8 = r2.f4738z
            java.lang.String r0 = "app_version_int"
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r7.put(r0, r2)
        L57:
            r2 = 5
            r8 = r2
            r5 = r3
        L5a:
            if (r5 >= r2) goto L182
            r9 = 1
            android.database.sqlite.SQLiteDatabase r10 = r1.u()     // Catch: java.lang.Throwable -> L113 android.database.sqlite.SQLiteException -> L117 android.database.sqlite.SQLiteDatabaseLockedException -> L13f android.database.sqlite.SQLiteFullException -> L156
            if (r10 != 0) goto L7b
            r1.f4549u = r9     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69 android.database.sqlite.SQLiteDatabaseLockedException -> L70 android.database.sqlite.SQLiteFullException -> L74
        L65:
            return r3
        L66:
            r0 = move-exception
            goto L177
        L69:
            r0 = move-exception
            r17 = r3
            r20 = r9
            goto L10d
        L70:
            r17 = r3
            goto L10f
        L74:
            r0 = move-exception
            r17 = r3
            r20 = r9
            goto L111
        L7b:
            r10.beginTransaction()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69 android.database.sqlite.SQLiteDatabaseLockedException -> L70 android.database.sqlite.SQLiteFullException -> L74
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r11 = r10.rawQuery(r0, r6)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L69 android.database.sqlite.SQLiteDatabaseLockedException -> L70 android.database.sqlite.SQLiteFullException -> L74
            r12 = 0
            if (r11 == 0) goto La5
            boolean r0 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            if (r0 == 0) goto La5
            long r12 = r11.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            goto La5
        L93:
            r0 = move-exception
            r17 = r3
        L96:
            r20 = r9
            goto L11e
        L9a:
            r17 = r3
            goto L143
        L9e:
            r0 = move-exception
            r17 = r3
        La1:
            r20 = r9
            goto L15b
        La5:
            r14 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            java.lang.String r14 = "messages"
            if (r0 < 0) goto Lf4
            O3.C0323t0.l(r4)     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            O3.V r0 = r4.f4670w     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            java.lang.String r15 = "Data loss, local db full"
            r0.b(r15)     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            java.lang.String r0 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            r15 = 100001(0x186a1, double:4.9407E-319)
            long r15 = r15 - r12
            java.lang.String r12 = java.lang.Long.toString(r15)     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            java.lang.String[] r12 = new java.lang.String[]{r12}     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            int r0 = r10.delete(r14, r0, r12)     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            long r12 = (long) r0     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            int r0 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r0 == 0) goto Lf4
            O3.C0323t0.l(r4)     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            O3.V r0 = r4.f4670w     // Catch: android.database.sqlite.SQLiteException -> L93 android.database.sqlite.SQLiteDatabaseLockedException -> L9a android.database.sqlite.SQLiteFullException -> L9e java.lang.Throwable -> L154
            java.lang.String r2 = "Different delete count than expected in local db. expected, received, difference"
            r17 = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> Lf0 android.database.sqlite.SQLiteFullException -> Lf2 android.database.sqlite.SQLiteDatabaseLockedException -> L143 java.lang.Throwable -> L154
            r20 = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch: android.database.sqlite.SQLiteException -> Leb android.database.sqlite.SQLiteFullException -> Led android.database.sqlite.SQLiteDatabaseLockedException -> L143 java.lang.Throwable -> L154
            long r15 = r15 - r12
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch: android.database.sqlite.SQLiteException -> Leb android.database.sqlite.SQLiteFullException -> Led android.database.sqlite.SQLiteDatabaseLockedException -> L143 java.lang.Throwable -> L154
            r0.e(r2, r3, r9, r12)     // Catch: android.database.sqlite.SQLiteException -> Leb android.database.sqlite.SQLiteFullException -> Led android.database.sqlite.SQLiteDatabaseLockedException -> L143 java.lang.Throwable -> L154
            goto Lf8
        Leb:
            r0 = move-exception
            goto L11e
        Led:
            r0 = move-exception
            goto L15b
        Lf0:
            r0 = move-exception
            goto L96
        Lf2:
            r0 = move-exception
            goto La1
        Lf4:
            r17 = r3
            r20 = r9
        Lf8:
            r10.insertOrThrow(r14, r6, r7)     // Catch: android.database.sqlite.SQLiteException -> Leb android.database.sqlite.SQLiteFullException -> Led android.database.sqlite.SQLiteDatabaseLockedException -> L143 java.lang.Throwable -> L154
            r10.setTransactionSuccessful()     // Catch: android.database.sqlite.SQLiteException -> Leb android.database.sqlite.SQLiteFullException -> Led android.database.sqlite.SQLiteDatabaseLockedException -> L143 java.lang.Throwable -> L154
            r10.endTransaction()     // Catch: android.database.sqlite.SQLiteException -> Leb android.database.sqlite.SQLiteFullException -> Led android.database.sqlite.SQLiteDatabaseLockedException -> L143 java.lang.Throwable -> L154
            if (r11 == 0) goto L106
            r11.close()
        L106:
            r10.close()
            return r20
        L10a:
            r6 = r11
            goto L177
        L10d:
            r11 = r6
            goto L11e
        L10f:
            r11 = r6
            goto L143
        L111:
            r11 = r6
            goto L15b
        L113:
            r0 = move-exception
            r10 = r6
            goto L177
        L117:
            r0 = move-exception
            r17 = r3
            r20 = r9
            r10 = r6
            r11 = r10
        L11e:
            if (r10 == 0) goto L129
            boolean r2 = r10.inTransaction()     // Catch: java.lang.Throwable -> L154
            if (r2 == 0) goto L129
            r10.endTransaction()     // Catch: java.lang.Throwable -> L154
        L129:
            O3.C0323t0.l(r4)     // Catch: java.lang.Throwable -> L154
            O3.V r2 = r4.f4670w     // Catch: java.lang.Throwable -> L154
            java.lang.String r3 = "Error writing entry to local database"
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L154
            r2 = r20
            r1.f4549u = r2     // Catch: java.lang.Throwable -> L154
            if (r11 == 0) goto L13c
            r11.close()
        L13c:
            if (r10 == 0) goto L170
            goto L150
        L13f:
            r17 = r3
            r10 = r6
            r11 = r10
        L143:
            long r2 = (long) r8
            android.os.SystemClock.sleep(r2)     // Catch: java.lang.Throwable -> L154
            int r8 = r8 + 20
            if (r11 == 0) goto L14e
            r11.close()
        L14e:
            if (r10 == 0) goto L170
        L150:
            r10.close()
            goto L170
        L154:
            r0 = move-exception
            goto L10a
        L156:
            r0 = move-exception
            r17 = r3
            r10 = r6
            r11 = r10
        L15b:
            O3.C0323t0.l(r4)     // Catch: java.lang.Throwable -> L154
            O3.V r2 = r4.f4670w     // Catch: java.lang.Throwable -> L154
            java.lang.String r3 = "Error writing entry; local database full"
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L154
            r2 = 1
            r1.f4549u = r2     // Catch: java.lang.Throwable -> L154
            if (r11 == 0) goto L16d
            r11.close()
        L16d:
            if (r10 == 0) goto L170
            goto L150
        L170:
            int r5 = r5 + 1
            r3 = r17
            r2 = 5
            goto L5a
        L177:
            if (r6 == 0) goto L17c
            r6.close()
        L17c:
            if (r10 == 0) goto L181
            r10.close()
        L181:
            throw r0
        L182:
            r17 = r3
            O3.C0323t0.l(r4)
            O3.V r0 = r4.f4666E
            java.lang.String r2 = "Failed to write entry to local database"
            r0.b(r2)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.P.v(int, byte[]):boolean");
    }
}
