package androidx.work.impl;

import android.content.ContentValues;
import e2.InterfaceC1036a;
import j2.InterfaceC1155a;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class AutoMigration_14_15 implements InterfaceC1036a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.InterfaceC1036a
    public void onPostMigrate(InterfaceC1155a db) {
        m.e(db, "db");
        db.l("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db.S(contentValues, new Object[0]);
    }
}
