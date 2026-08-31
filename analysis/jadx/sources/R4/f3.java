package R4;

import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.webkit.HttpAuthHandler;
import android.widget.EditText;
import e5.C1056a;
import e5.C1057b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f3 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6959t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f3(Object obj, Object obj2, Object obj3, int i) {
        this.f6956q = i;
        this.f6957r = obj;
        this.f6958s = obj2;
        this.f6959t = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f6956q) {
            case 0:
                EditText editText = (EditText) this.f6957r;
                EditText editText2 = (EditText) this.f6958s;
                k3.c cVar = (k3.c) this.f6959t;
                String string = editText.getText().toString();
                String string2 = editText2.getText().toString();
                HttpAuthHandler httpAuthHandler = (HttpAuthHandler) cVar.f14120q;
                if (httpAuthHandler != null) {
                    httpAuthHandler.proceed(string, string2);
                }
                break;
            default:
                C1056a c1056a = (C1056a) this.f6957r;
                C1057b c1057b = (C1057b) this.f6958s;
                B5.a aVar = (B5.a) this.f6959t;
                String str = c1057b.f12643a;
                kotlin.jvm.internal.m.b(str);
                c1056a.getClass();
                SQLiteDatabase sQLiteDatabase = c1056a.f12642q;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("Select * from NotificationData where id=?", new String[]{str});
                kotlin.jvm.internal.m.d(cursorRawQuery, "rawQuery(...)");
                if (cursorRawQuery.getCount() > 0) {
                    sQLiteDatabase.delete("NotificationData", "id=?", new String[]{str});
                }
                cursorRawQuery.close();
                aVar.invoke();
                dialogInterface.dismiss();
                break;
        }
    }
}
