package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.j;
import androidx.room.w;
import androidx.room.z;
import j2.InterfaceC1161g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l6.d;

/* JADX INFO: loaded from: classes.dex */
public final class WorkNameDao_Impl implements WorkNameDao {
    private final w __db;
    private final j __insertionAdapterOfWorkName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkNameDao_Impl(w wVar) {
        this.__db = wVar;
        this.__insertionAdapterOfWorkName = new j(wVar) { // from class: androidx.work.impl.model.WorkNameDao_Impl.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: bind(Lj2/g;Ljava/lang/Object;)V */
            @Override // androidx.room.j
            public void bind(InterfaceC1161g interfaceC1161g, WorkName workName) {
                interfaceC1161g.m(1, workName.getName());
                interfaceC1161g.m(2, workName.getWorkSpecId());
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkNameDao
    public List<String> getNamesForWorkSpecId(String str) {
        z zVarA = z.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
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
    @Override // androidx.work.impl.model.WorkNameDao
    public List<String> getWorkSpecIdsWithName(String str) {
        z zVarA = z.a(1, "SELECT work_spec_id FROM workname WHERE name=?");
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
    @Override // androidx.work.impl.model.WorkNameDao
    public void insert(WorkName workName) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkName.insert(workName);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
