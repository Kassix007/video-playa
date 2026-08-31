package k2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.work.impl.utils.PreferenceUtils;
import j2.InterfaceC1155a;
import j2.InterfaceC1160f;
import j2.InterfaceC1161g;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: k2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1178b implements InterfaceC1155a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f14088r = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f14089s = new String[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SQLiteDatabase f14090q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1178b(SQLiteDatabase sQLiteDatabase) {
        this.f14090q = sQLiteDatabase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final boolean D() {
        SQLiteDatabase sQLiteDatabase = this.f14090q;
        m.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final void I(Object[] objArr) {
        this.f14090q.execSQL(PreferenceUtils.INSERT_PREFERENCE, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final void J() {
        this.f14090q.setTransactionSuccessful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final void L() {
        this.f14090q.beginTransactionNonExclusive();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final Cursor P(InterfaceC1160f interfaceC1160f) {
        Cursor cursorRawQueryWithFactory = this.f14090q.rawQueryWithFactory(new C1177a(1, new S0.c(2, interfaceC1160f)), interfaceC1160f.e(), f14089s, null);
        m.d(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final int S(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f14088r[3]);
        sb.append("WorkSpec SET ");
        int i = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i7 = size; i7 < length; i7++) {
            objArr2[i7] = objArr[i7 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        String string = sb.toString();
        m.d(string, "StringBuilder().apply(builderAction).toString()");
        InterfaceC1161g interfaceC1161gR = r(string);
        Q2.g.m(interfaceC1161gR, objArr2);
        return ((C1185i) interfaceC1161gR).f14112r.executeUpdateDelete();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final Cursor V(String query) {
        m.e(query, "query");
        return P(new Z.m(query));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f14090q.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final void g() {
        this.f14090q.endTransaction();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final void h() {
        this.f14090q.beginTransaction();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final boolean isOpen() {
        return this.f14090q.isOpen();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final void l(String sql) {
        m.e(sql, "sql");
        this.f14090q.execSQL(sql);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final InterfaceC1161g r(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f14090q.compileStatement(str);
        m.d(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C1185i(sQLiteStatementCompileStatement);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final Cursor x(InterfaceC1160f interfaceC1160f, CancellationSignal cancellationSignal) {
        String sql = interfaceC1160f.e();
        C1177a c1177a = new C1177a(0, interfaceC1160f);
        m.e(sql, "sql");
        Cursor cursorRawQueryWithFactory = this.f14090q.rawQueryWithFactory(c1177a, sql, f14089s, null, cancellationSignal);
        m.d(cursorRawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return cursorRawQueryWithFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1155a
    public final boolean y() {
        return this.f14090q.inTransaction();
    }
}
