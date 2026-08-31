package androidx.work.impl;

import e2.AbstractC1037b;
import j2.InterfaceC1155a;

/* JADX INFO: loaded from: classes.dex */
final class WorkDatabase_AutoMigration_22_23_Impl extends AbstractC1037b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkDatabase_AutoMigration_22_23_Impl() {
        super(22, 23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.AbstractC1037b
    public void migrate(InterfaceC1155a interfaceC1155a) {
        interfaceC1155a.l("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
