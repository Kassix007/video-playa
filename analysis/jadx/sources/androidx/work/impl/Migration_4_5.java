package androidx.work.impl;

import e2.AbstractC1037b;
import j2.InterfaceC1155a;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class Migration_4_5 extends AbstractC1037b {
    public static final Migration_4_5 INSTANCE = new Migration_4_5();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Migration_4_5() {
        super(4, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.AbstractC1037b
    public void migrate(InterfaceC1155a db) {
        m.e(db, "db");
        db.l("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db.l("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
