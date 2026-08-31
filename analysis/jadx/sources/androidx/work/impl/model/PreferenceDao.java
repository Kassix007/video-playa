package androidx.work.impl.model;

import androidx.lifecycle.G;

/* JADX INFO: loaded from: classes.dex */
public interface PreferenceDao {
    Long getLongValue(String str);

    G getObservableLongValue(String str);

    void insertPreference(Preference preference);
}
