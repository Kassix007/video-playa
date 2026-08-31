package k2;

import android.database.sqlite.SQLiteStatement;
import j2.InterfaceC1161g;

/* JADX INFO: renamed from: k2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1185i extends C1184h implements InterfaceC1161g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SQLiteStatement f14112r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1185i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f14112r = sQLiteStatement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1161g
    public final long U() {
        return this.f14112r.executeInsert();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j2.InterfaceC1161g
    public final int q() {
        return this.f14112r.executeUpdateDelete();
    }
}
