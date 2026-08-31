package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.D;
import androidx.room.j;
import androidx.room.w;
import androidx.room.z;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import j2.InterfaceC1161g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l6.d;

/* JADX INFO: loaded from: classes.dex */
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {
    private final w __db;
    private final j __insertionAdapterOfSystemIdInfo;
    private final D __preparedStmtOfRemoveSystemIdInfo;
    private final D __preparedStmtOfRemoveSystemIdInfo_1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SystemIdInfoDao_Impl(w wVar) {
        this.__db = wVar;
        this.__insertionAdapterOfSystemIdInfo = new j(wVar) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: bind(Lj2/g;Ljava/lang/Object;)V */
            @Override // androidx.room.j
            public void bind(InterfaceC1161g interfaceC1161g, SystemIdInfo systemIdInfo) {
                interfaceC1161g.m(1, systemIdInfo.workSpecId);
                interfaceC1161g.H(2, systemIdInfo.getGeneration());
                interfaceC1161g.H(3, systemIdInfo.systemId);
            }
        };
        this.__preparedStmtOfRemoveSystemIdInfo = new D(wVar) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        };
        this.__preparedStmtOfRemoveSystemIdInfo_1 = new D(wVar) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(String str, int i) {
        z zVarA = z.a(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        zVarA.m(1, str);
        zVarA.H(2, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            return cursorB.moveToFirst() ? new SystemIdInfo(cursorB.getString(AbstractC0836n2.r(cursorB, "work_spec_id")), cursorB.getInt(AbstractC0836n2.r(cursorB, "generation")), cursorB.getInt(AbstractC0836n2.r(cursorB, "system_id"))) : null;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.SystemIdInfoDao
    public List<String> getWorkSpecIds() {
        z zVarA = z.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
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
    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(SystemIdInfo systemIdInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSystemIdInfo.insert(systemIdInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str, int i) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfRemoveSystemIdInfo.acquire();
        interfaceC1161gAcquire.m(1, str);
        interfaceC1161gAcquire.H(2, i);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfRemoveSystemIdInfo.release(interfaceC1161gAcquire);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfRemoveSystemIdInfo_1.acquire();
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
            this.__preparedStmtOfRemoveSystemIdInfo_1.release(interfaceC1161gAcquire);
        }
    }
}
