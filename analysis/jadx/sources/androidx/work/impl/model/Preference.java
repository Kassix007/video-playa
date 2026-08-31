package androidx.work.impl.model;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class Preference {
    private final String key;
    private final Long value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Preference(String key, Long l7) {
        m.e(key, "key");
        this.key = key;
        this.value = l7;
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preference.key;
        }
        if ((i & 2) != 0) {
            l7 = preference.value;
        }
        return preference.copy(str, l7);
    }

    public final String component1() {
        return this.key;
    }

    public final Long component2() {
        return this.value;
    }

    public final Preference copy(String key, Long l7) {
        m.e(key, "key");
        return new Preference(key, l7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return m.a(this.key, preference.key) && m.a(this.value, preference.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Long getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l7 = this.value;
        return iHashCode + (l7 == null ? 0 : l7.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(String key, boolean z5) {
        this(key, Long.valueOf(z5 ? 1L : 0L));
        m.e(key, "key");
    }
}
