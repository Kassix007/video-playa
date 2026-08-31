package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.D;
import androidx.room.j;
import androidx.room.w;
import androidx.room.z;
import j2.InterfaceC1161g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l6.d;

/* JADX INFO: loaded from: classes.dex */
public final class WorkTagDao_Impl implements WorkTagDao {
    private final w __db;
    private final j __insertionAdapterOfWorkTag;
    private final D __preparedStmtOfDeleteByWorkSpecId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkTagDao_Impl(w wVar) {
        this.__db = wVar;
        this.__insertionAdapterOfWorkTag = new j(wVar) { // from class: androidx.work.impl.model.WorkTagDao_Impl.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: bind(Lj2/g;Ljava/lang/Object;)V */
            @Override // androidx.room.j
            public void bind(InterfaceC1161g interfaceC1161g, WorkTag workTag) {
                interfaceC1161g.m(1, workTag.getTag());
                interfaceC1161g.m(2, workTag.getWorkSpecId());
            }
        };
        this.__preparedStmtOfDeleteByWorkSpecId = new D(wVar) { // from class: androidx.work.impl.model.WorkTagDao_Impl.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "DELETE FROM worktag WHERE work_spec_id=?";
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkTagDao
    public void deleteByWorkSpecId(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfDeleteByWorkSpecId.acquire();
        interfaceC1161gAcquire.m(1, str);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteByWorkSpecId.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkTagDao
    public List<String> getTagsForWorkSpecId(String str) {
        z zVarA = z.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkTagDao
    public List<String> getWorkSpecIdsWithTag(String str) {
        z zVarA = z.a(1, "SELECT work_spec_id FROM worktag WHERE tag=?");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkTagDao
    public void insert(WorkTag workTag) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkTag.insert(workTag);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
