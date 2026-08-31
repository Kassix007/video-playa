package androidx.work.impl;

import e2.AbstractC1037b;
import j2.InterfaceC1155a;

/* JADX INFO: loaded from: classes.dex */
final class WorkDatabase_AutoMigration_18_19_Impl extends AbstractC1037b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkDatabase_AutoMigration_18_19_Impl() {
        super(18, 19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.AbstractC1037b
    public void migrate(InterfaceC1155a interfaceC1155a) {
        interfaceC1155a.l("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
