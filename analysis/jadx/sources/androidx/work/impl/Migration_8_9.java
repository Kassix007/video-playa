package androidx.work.impl;

import e2.AbstractC1037b;
import j2.InterfaceC1155a;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class Migration_8_9 extends AbstractC1037b {
    public static final Migration_8_9 INSTANCE = new Migration_8_9();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Migration_8_9() {
        super(8, 9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.AbstractC1037b
    public void migrate(InterfaceC1155a db) {
        m.e(db, "db");
        db.l("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
