package androidx.work.impl;

import e2.InterfaceC1036a;
import j2.InterfaceC1155a;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class AutoMigration_19_20 implements InterfaceC1036a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.InterfaceC1036a
    public void onPostMigrate(InterfaceC1155a db) {
        m.e(db, "db");
        db.l("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
