package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum X1 implements InterfaceC0860s2 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f10758q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    X1(int i) {
        this.f10758q = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10758q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0860s2
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f10758q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
