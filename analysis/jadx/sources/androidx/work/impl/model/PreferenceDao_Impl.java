package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.G;
import androidx.room.j;
import androidx.room.w;
import androidx.room.z;
import j2.InterfaceC1161g;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l6.d;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDao_Impl implements PreferenceDao {
    private final w __db;
    private final j __insertionAdapterOfPreference;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PreferenceDao_Impl(w wVar) {
        this.__db = wVar;
        this.__insertionAdapterOfPreference = new j(wVar) { // from class: androidx.work.impl.model.PreferenceDao_Impl.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: bind(Lj2/g;Ljava/lang/Object;)V */
            @Override // androidx.room.j
            public void bind(InterfaceC1161g interfaceC1161g, Preference preference) {
                interfaceC1161g.m(1, preference.getKey());
                if (preference.getValue() == null) {
                    interfaceC1161g.s(2);
                } else {
                    interfaceC1161g.H(2, preference.getValue().longValue());
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.PreferenceDao
    public Long getLongValue(String str) {
        z zVarA = z.a(1, "SELECT long_value FROM Preference where `key`=?");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            Long lValueOf = null;
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.PreferenceDao
    public G getObservableLongValue(String str) {
        final z zVarA = z.a(1, "SELECT long_value FROM Preference where `key`=?");
        zVarA.m(1, str);
        return this.__db.getInvalidationTracker().b(new String[]{"Preference"}, false, new Callable<Long>() { // from class: androidx.work.impl.model.PreferenceDao_Impl.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                Cursor cursorB = d.B(PreferenceDao_Impl.this.__db, zVarA, false);
                try {
                    Long lValueOf = null;
                    if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                        lValueOf = Long.valueOf(cursorB.getLong(0));
                    }
                    return lValueOf;
                } finally {
                    cursorB.close();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.PreferenceDao
    public void insertPreference(Preference preference) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfPreference.insert(preference);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
