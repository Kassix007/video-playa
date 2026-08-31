package com.google.android.play.core.install;

/* JADX INFO: loaded from: classes.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11723e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zza(int i, long j, long j7, int i7, String str) {
        this.f11719a = i;
        this.f11720b = j;
        this.f11721c = j7;
        this.f11722d = i7;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f11723e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f11719a == zzaVar.f11719a && this.f11720b == zzaVar.f11720b && this.f11721c == zzaVar.f11721c && this.f11722d == zzaVar.f11722d && this.f11723e.equals(zzaVar.f11723e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = this.f11719a ^ 1000003;
        long j = this.f11720b;
        long j7 = this.f11721c;
        return (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f11722d) * 1000003) ^ this.f11723e.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "InstallState{installStatus=" + this.f11719a + ", bytesDownloaded=" + this.f11720b + ", totalBytesToDownload=" + this.f11721c + ", installErrorCode=" + this.f11722d + ", packageName=" + this.f11723e + "}";
    }
}
