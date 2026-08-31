package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.D;
import androidx.room.j;
import androidx.room.w;
import androidx.room.z;
import androidx.work.Data;
import j2.InterfaceC1161g;
import java.util.Collections;
import java.util.List;
import l6.d;

/* JADX INFO: loaded from: classes.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {
    private final w __db;
    private final j __insertionAdapterOfWorkProgress;
    private final D __preparedStmtOfDelete;
    private final D __preparedStmtOfDeleteAll;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkProgressDao_Impl(w wVar) {
        this.__db = wVar;
        this.__insertionAdapterOfWorkProgress = new j(wVar) { // from class: androidx.work.impl.model.WorkProgressDao_Impl.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: bind(Lj2/g;Ljava/lang/Object;)V */
            @Override // androidx.room.j
            public void bind(InterfaceC1161g interfaceC1161g, WorkProgress workProgress) {
                interfaceC1161g.m(1, workProgress.getWorkSpecId());
                interfaceC1161g.N(2, Data.toByteArrayInternalV1(workProgress.getProgress()));
            }
        };
        this.__preparedStmtOfDelete = new D(wVar) { // from class: androidx.work.impl.model.WorkProgressDao_Impl.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.__preparedStmtOfDeleteAll = new D(wVar) { // from class: androidx.work.impl.model.WorkProgressDao_Impl.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "DELETE FROM WorkProgress";
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkProgressDao
    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfDelete.acquire();
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
            this.__preparedStmtOfDelete.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDeleteAll.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkProgressDao
    public Data getProgressForWorkSpecId(String str) {
        z zVarA = z.a(1, "SELECT progress FROM WorkProgress WHERE work_spec_id=?");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            Data dataFromByteArray = null;
            if (cursorB.moveToFirst()) {
                byte[] blob = cursorB.isNull(0) ? null : cursorB.getBlob(0);
                if (blob != null) {
                    dataFromByteArray = Data.fromByteArray(blob);
                }
            }
            return dataFromByteArray;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkProgressDao
    public void insert(WorkProgress workProgress) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkProgress.insert(workProgress);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
