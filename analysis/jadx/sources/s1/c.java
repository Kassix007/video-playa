package s1;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16425e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(String str, String str2, String str3, List list) {
        str.getClass();
        this.f16421a = str;
        str2.getClass();
        this.f16422b = str2;
        this.f16423c = str3;
        list.getClass();
        this.f16424d = list;
        this.f16425e = str + "-" + str2 + "-" + str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f16421a + ", mProviderPackage: " + this.f16422b + ", mQuery: " + this.f16423c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f16424d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i7 = 0; i7 < list2.size(); i7++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i7), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
