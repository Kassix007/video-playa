package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.utils.PreferenceUtils;
import e2.AbstractC1037b;
import j2.InterfaceC1155a;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class RescheduleMigration extends AbstractC1037b {
    private final Context mContext;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RescheduleMigration(Context mContext, int i, int i7) {
        super(i, i7);
        m.e(mContext, "mContext");
        this.mContext = mContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Context getMContext() {
        return this.mContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // e2.AbstractC1037b
    public void migrate(InterfaceC1155a db) {
        m.e(db, "db");
        if (this.endVersion >= 10) {
            db.I(new Object[]{PreferenceUtils.KEY_RESCHEDULE_NEEDED, 1});
        } else {
            this.mContext.getSharedPreferences(PreferenceUtils.PREFERENCES_FILE_NAME, 0).edit().putBoolean(PreferenceUtils.KEY_RESCHEDULE_NEEDED, true).apply();
        }
    }
}
