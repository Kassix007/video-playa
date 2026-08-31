package k2;

import E.Y;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.I1;
import j2.InterfaceC1155a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.m;
import l2.C1226a;

/* JADX INFO: renamed from: k2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1182f extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f14096x = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f14097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1179c f14098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Y f14099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14101u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1226a f14102v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14103w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182f(Context context, String str, final C1179c c1179c, final Y callback, boolean z5) {
        String string;
        super(context, str, null, callback.f1519b, new DatabaseErrorHandler() { // from class: k2.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                Y callback2 = callback;
                m.e(callback2, "$callback");
                int i = C1182f.f14096x;
                m.d(dbObj, "dbObj");
                C1178b c1178bO0 = I1.o0(c1179c, dbObj);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c1178bO0 + ".path");
                SQLiteDatabase sQLiteDatabase = c1178bO0.f14090q;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        Y.e(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        c1178bO0.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            m.d(obj, "p.second");
                            Y.e((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            Y.e(path2);
                        }
                    }
                }
            }
        });
        m.e(callback, "callback");
        this.f14097q = context;
        this.f14098r = c1179c;
        this.f14099s = callback;
        this.f14100t = z5;
        if (str == null) {
            string = UUID.randomUUID().toString();
            m.d(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        this.f14102v = new C1226a(string, context.getCacheDir());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1155a a(boolean z5) {
        C1226a c1226a = this.f14102v;
        try {
            c1226a.a((this.f14103w || getDatabaseName() == null) ? false : true);
            this.f14101u = false;
            SQLiteDatabase sQLiteDatabaseC = c(z5);
            if (!this.f14101u) {
                C1178b c1178bO0 = I1.o0(this.f14098r, sQLiteDatabaseC);
                c1226a.b();
                return c1178bO0;
            }
            close();
            InterfaceC1155a interfaceC1155aA = a(z5);
            c1226a.b();
            return interfaceC1155aA;
        } catch (Throwable th) {
            c1226a.b();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SQLiteDatabase b(boolean z5) {
        if (z5) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            m.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        m.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 5, expect 1 */
    public final SQLiteDatabase c(boolean z5) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z6 = this.f14103w;
        Context context = this.f14097q;
        if (databaseName != null && !z6 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return b(z5);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return b(z5);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C1181e) {
                    C1181e c1181e = th;
                    int iA = O.c.a(c1181e.f14094q);
                    Throwable th2 = c1181e.f14095r;
                    if (iA == 0 || iA == 1 || iA == 2 || iA == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f14100t) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return b(z5);
                } catch (C1181e e7) {
                    throw e7.f14095r;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C1226a c1226a = this.f14102v;
        try {
            HashMap map = C1226a.f14437d;
            c1226a.getClass();
            c1226a.a(false);
            super.close();
            this.f14098r.f14091a = null;
            this.f14103w = false;
        } finally {
            c1226a.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        m.e(db, "db");
        boolean z5 = this.f14101u;
        Y y6 = this.f14099s;
        if (!z5 && y6.f1519b != db.getVersion()) {
            db.setMaxSqlCacheSize(1);
        }
        try {
            I1.o0(this.f14098r, db);
            y6.getClass();
        } catch (Throwable th) {
            throw new C1181e(1, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        m.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f14099s.m(I1.o0(this.f14098r, sqLiteDatabase));
        } catch (Throwable th) {
            throw new C1181e(2, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i, int i7) {
        m.e(db, "db");
        this.f14101u = true;
        try {
            Y y6 = this.f14099s;
            C1178b c1178bO0 = I1.o0(this.f14098r, db);
            y6.getClass();
            y6.o(c1178bO0, i, i7);
        } catch (Throwable th) {
            throw new C1181e(4, th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        m.e(db, "db");
        if (!this.f14101u) {
            try {
                this.f14099s.n(I1.o0(this.f14098r, db));
            } catch (Throwable th) {
                throw new C1181e(5, th);
            }
        }
        this.f14103w = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i7) {
        m.e(sqLiteDatabase, "sqLiteDatabase");
        this.f14101u = true;
        try {
            this.f14099s.o(I1.o0(this.f14098r, sqLiteDatabase), i, i7);
        } catch (Throwable th) {
            throw new C1181e(3, th);
        }
    }
}
