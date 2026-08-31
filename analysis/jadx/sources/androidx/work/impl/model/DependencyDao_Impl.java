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
public final class DependencyDao_Impl implements DependencyDao {
    private final w __db;
    private final j __insertionAdapterOfDependency;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DependencyDao_Impl(w wVar) {
        this.__db = wVar;
        this.__insertionAdapterOfDependency = new j(wVar) { // from class: androidx.work.impl.model.DependencyDao_Impl.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: bind(Lj2/g;Ljava/lang/Object;)V */
            @Override // androidx.room.j
            public void bind(InterfaceC1161g interfaceC1161g, Dependency dependency) {
                interfaceC1161g.m(1, dependency.getWorkSpecId());
                interfaceC1161g.m(2, dependency.getPrerequisiteId());
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.DependencyDao
    public List<String> getDependentWorkIds(String str) {
        z zVarA = z.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
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
    @Override // androidx.work.impl.model.DependencyDao
    public List<String> getPrerequisites(String str) {
        z zVarA = z.a(1, "SELECT prerequisite_id FROM dependency WHERE work_spec_id=?");
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
    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasCompletedAllPrerequisites(String str) {
        z zVarA = z.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        boolean z5 = false;
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            if (cursorB.moveToFirst()) {
                z5 = cursorB.getInt(0) != 0;
            }
            return z5;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasDependents(String str) {
        z zVarA = z.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        boolean z5 = false;
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            if (cursorB.moveToFirst()) {
                z5 = cursorB.getInt(0) != 0;
            }
            return z5;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.DependencyDao
    public void insertDependency(Dependency dependency) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfDependency.insert(dependency);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
