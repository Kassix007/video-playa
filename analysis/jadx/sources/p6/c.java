package p6;

import C0.S;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import k1.i;
import kotlin.jvm.internal.m;
import n5.s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f15903a = new c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && m.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(S.m("endIndex < beginIndex: ", " < 0", length2).toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbL = i.l("endIndex > string.length: ", " > ", length2);
            sbL.append(str.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        long j = 0;
        int i7 = 0;
        while (i7 < length2) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i8 = i7 + 1;
                    char cCharAt2 = i8 < length2 ? str.charAt(i8) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i7 = i8;
                    } else {
                        j += (long) 4;
                        i7 += 2;
                    }
                }
                j += (long) i;
            }
            i7++;
        }
        return length == ((int) j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            java.lang.String r0 = "host"
            kotlin.jvm.internal.m.e(r11, r0)
            byte[] r0 = e6.b.f12673a
            J5.k r0 = e6.b.f12677e
            boolean r0 = r0.c(r11)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L47
            java.lang.String r11 = a.AbstractC0597a.T(r11)
            r0 = 7
            java.util.List r12 = a(r12, r0)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L2b
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2b
            goto L138
        L2b:
            java.util.Iterator r12 = r12.iterator()
        L2f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L138
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = a.AbstractC0597a.T(r0)
            boolean r0 = kotlin.jvm.internal.m.a(r11, r0)
            if (r0 == 0) goto L2f
            goto L137
        L47:
            boolean r0 = b(r11)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r4 = "US"
            if (r0 == 0) goto L5d
            java.util.Locale r0 = java.util.Locale.US
            kotlin.jvm.internal.m.d(r0, r4)
            java.lang.String r11 = r11.toLowerCase(r0)
            kotlin.jvm.internal.m.d(r11, r3)
        L5d:
            r0 = 2
            java.util.List r12 = a(r12, r0)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L73
            r0 = r12
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L73
            goto L138
        L73:
            java.util.Iterator r12 = r12.iterator()
        L77:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L138
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            int r5 = r11.length()
            if (r5 != 0) goto L8b
            goto L105
        L8b:
            java.lang.String r5 = "."
            boolean r6 = J5.t.G0(r11, r5, r2)
            if (r6 != 0) goto L105
            java.lang.String r6 = ".."
            boolean r7 = J5.t.A0(r11, r6, r2)
            if (r7 == 0) goto L9d
            goto L105
        L9d:
            if (r0 == 0) goto L105
            int r7 = r0.length()
            if (r7 != 0) goto La6
            goto L105
        La6:
            boolean r7 = J5.t.G0(r0, r5, r2)
            if (r7 != 0) goto L105
            boolean r6 = J5.t.A0(r0, r6, r2)
            if (r6 == 0) goto Lb3
            goto L105
        Lb3:
            boolean r6 = J5.t.A0(r11, r5, r2)
            if (r6 != 0) goto Lbe
            java.lang.String r6 = r11.concat(r5)
            goto Lbf
        Lbe:
            r6 = r11
        Lbf:
            boolean r7 = J5.t.A0(r0, r5, r2)
            if (r7 != 0) goto Lc9
            java.lang.String r0 = r0.concat(r5)
        Lc9:
            boolean r5 = b(r0)
            if (r5 == 0) goto Ldb
            java.util.Locale r5 = java.util.Locale.US
            kotlin.jvm.internal.m.d(r5, r4)
            java.lang.String r0 = r0.toLowerCase(r5)
            kotlin.jvm.internal.m.d(r0, r3)
        Ldb:
            java.lang.String r5 = "*"
            boolean r5 = J5.m.K0(r0, r5)
            if (r5 != 0) goto Le8
            boolean r0 = kotlin.jvm.internal.m.a(r6, r0)
            goto L135
        Le8:
            java.lang.String r5 = "*."
            boolean r7 = J5.t.G0(r0, r5, r2)
            if (r7 == 0) goto L105
            r7 = 42
            r8 = 4
            int r7 = J5.m.R0(r0, r7, r1, r8)
            r9 = -1
            if (r7 == r9) goto Lfb
            goto L105
        Lfb:
            int r7 = r6.length()
            int r10 = r0.length()
            if (r7 >= r10) goto L107
        L105:
            r0 = r2
            goto L135
        L107:
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L10e
            goto L105
        L10e:
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.m.d(r0, r5)
            boolean r5 = J5.t.A0(r6, r0, r2)
            if (r5 != 0) goto L11e
            goto L105
        L11e:
            int r5 = r6.length()
            int r0 = r0.length()
            int r5 = r5 - r0
            if (r5 <= 0) goto L134
            int r5 = r5 + (-1)
            r0 = 46
            int r0 = J5.m.X0(r6, r0, r5, r8)
            if (r0 == r9) goto L134
            goto L105
        L134:
            r0 = r1
        L135:
            if (r0 == 0) goto L77
        L137:
            return r1
        L138:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        m.e(host, "host");
        m.e(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
