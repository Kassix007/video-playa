package e5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: e5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1056a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SQLiteDatabase f12642q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056a(Context context) {
        super(context, "notificationDatabase.db", (SQLiteDatabase.CursorFactory) null, 1);
        m.e(context, "context");
        this.f12642q = getWritableDatabase();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Cursor a() {
        Cursor cursorRawQuery = this.f12642q.rawQuery("Select * from NotificationData", null);
        m.d(cursorRawQuery, "rawQuery(...)");
        return cursorRawQuery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(String id) {
        m.e(id, "id");
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", "read");
        SQLiteDatabase sQLiteDatabase = this.f12642q;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("Select * from NotificationData where id=?", new String[]{id});
        m.d(cursorRawQuery, "rawQuery(...)");
        if (cursorRawQuery.getCount() > 0) {
            sQLiteDatabase.update("NotificationData", contentValues, "id=?", new String[]{id});
        }
        cursorRawQuery.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("create Table NotificationData(id TEXT primary key,title TEXT,body TEXT,image TEXT,deeplink TEXT,read TEXT,time TEXT)");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i7) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("drop Table if exists NotificationData");
        }
    }
}
