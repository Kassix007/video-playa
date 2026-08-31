package D;

import B0.G0;
import C0.S;
import E.C0126i;
import E.Y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C1193b;
import x3.C1899k;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f1292e;
    public Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(h hVar) {
        this.f1288a = 0;
        this.f1290c = hVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1899k(0, 0));
        this.f1291d = arrayList;
        this.f1292e = new ArrayList();
        this.f = n5.s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void m(u uVar, String str, int i, String str2, int i7) {
        if ((i7 & 2) != 0) {
            i = uVar.f1289b;
        }
        if ((i7 & 4) != 0) {
            str2 = "";
        }
        uVar.l(str, str2, i);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int A(int i) {
        C0126i c0126iF = ((h) this.f1290c).f1214c.f(i);
        int i7 = i - c0126iF.f1567a;
        return (int) ((C0117b) ((f) c0126iF.f1569c).f1207a.invoke(s.f1285a, Integer.valueOf(i7))).f1191a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean B() {
        int iZ = z();
        String str = (String) this.f;
        if (iZ >= str.length() || iZ == -1 || str.charAt(iZ) != ',') {
            return false;
        }
        this.f1289b++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C(char c7) {
        String str = (String) this.f;
        int i = this.f1289b;
        if (i > 0 && c7 == '\"') {
            try {
                this.f1289b = i - 1;
                String strJ = j();
                this.f1289b = i;
                if (kotlin.jvm.internal.m.a(strJ, "null")) {
                    l("Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", this.f1289b - 1);
                    throw null;
                }
            } catch (Throwable th) {
                this.f1289b = i;
                throw th;
            }
        }
        String strJ2 = b6.e.j(b6.e.c(c7));
        int i7 = this.f1289b;
        int i8 = i7 - 1;
        m(this, "Expected " + strJ2 + ", but had '" + ((i7 == str.length() || i8 < 0) ? "EOF" : String.valueOf(str.charAt(i8))) + "' instead", i8, null, 4);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a(CharSequence charSequence, int i) {
        int i7 = i + 4;
        if (i7 < charSequence.length()) {
            ((StringBuilder) this.f1292e).append((char) (q(charSequence, i + 3) + (q(charSequence, i) << 12) + (q(charSequence, i + 1) << 8) + (q(charSequence, i + 2) << 4)));
            return i7;
        }
        this.f1289b = i;
        if (i7 < charSequence.length()) {
            return a(charSequence, this.f1289b);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean b() {
        int i = this.f1289b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1289b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.f1289b = i;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(int i, String str) {
        String str2 = (String) this.f;
        if (str2.length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (str.charAt(i7) != (str2.charAt(i + i7) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f1289b = str.length() + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String d() {
        String str = (String) this.f;
        g('\"');
        int i = this.f1289b;
        int iR0 = J5.m.R0(str, '\"', i, 4);
        if (iR0 == -1) {
            j();
            int i7 = this.f1289b;
            m(this, S.n("Expected quotation mark '\"', but had '", (i7 == str.length() || i7 < 0) ? "EOF" : String.valueOf(str.charAt(i7)), "' instead"), i7, null, 4);
            throw null;
        }
        int i8 = i;
        while (i8 < iR0) {
            if (str.charAt(i8) == '\\') {
                int iY = this.f1289b;
                char cCharAt = str.charAt(i8);
                boolean z5 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        ((StringBuilder) this.f1292e).append((CharSequence) str, iY, i8);
                        int iY2 = y(i8 + 1);
                        if (iY2 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iY2 + 1;
                        char cCharAt2 = str.charAt(iY2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c7 = cCharAt2 < 'u' ? b6.a.f10018a[cCharAt2] : (char) 0;
                            if (c7 == 0) {
                                m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f1292e).append(c7);
                        }
                        iY = y(iA);
                        if (iY == -1) {
                            m(this, "Unexpected EOF", iY, null, 4);
                            throw null;
                        }
                    } else {
                        i8++;
                        if (i8 >= str.length()) {
                            ((StringBuilder) this.f1292e).append((CharSequence) str, iY, i8);
                            iY = y(i8);
                            if (iY == -1) {
                                m(this, "Unexpected EOF", iY, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i8);
                        }
                    }
                    i8 = iY;
                    z5 = true;
                    cCharAt = str.charAt(i8);
                }
                String string = !z5 ? str.subSequence(iY, i8).toString() : k(iY, i8);
                this.f1289b = i8 + 1;
                return string;
            }
            i8++;
        }
        this.f1289b = iR0 + 1;
        String strSubstring = str.substring(i, iR0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte e() {
        String str = (String) this.f;
        int i = this.f1289b;
        while (i != -1 && i < str.length()) {
            int i7 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1289b = i7;
                return b6.e.c(cCharAt);
            }
            i = i7;
        }
        this.f1289b = str.length();
        return (byte) 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte f(byte b7) {
        String str = (String) this.f;
        byte bE = e();
        if (bE == b7) {
            return bE;
        }
        String strJ = b6.e.j(b7);
        int i = this.f1289b;
        int i7 = i - 1;
        m(this, "Expected " + strJ + ", but had '" + ((i == str.length() || i7 < 0) ? "EOF" : String.valueOf(str.charAt(i7))) + "' instead", i7, null, 4);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(char c7) {
        int i = this.f1289b;
        if (i == -1) {
            C(c7);
            throw null;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            int i7 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f1289b = i7;
                if (cCharAt == c7) {
                    return;
                }
                C(c7);
                throw null;
            }
            i = i7;
        }
        this.f1289b = -1;
        C(c7);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:134:0x003d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:138:0x003d */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0182, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0188, code lost:
    
        throw new C2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0191, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0194, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0195, code lost:
    
        m(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019b, code lost:
    
        m(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        m(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0116, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0118, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0120, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
    
        m(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012d, code lost:
    
        m(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0133, code lost:
    
        r21.f1289b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013c, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0146, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0148, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0160, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0164, code lost:
    
        m(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        m(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long h() {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.z()
            int r1 = r0.y(r1)
            java.lang.Object r2 = r0.f
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.length()
            java.lang.String r4 = "EOF"
            r5 = 6
            r6 = 0
            r7 = 0
            if (r1 >= r3) goto L1a1
            r3 = -1
            if (r1 == r3) goto L1a1
            char r3 = r2.charAt(r1)
            r8 = 34
            if (r3 != r8) goto L32
            int r1 = r1 + 1
            int r3 = r2.length()
            if (r1 == r3) goto L2e
            r3 = 1
            goto L33
        L2e:
            m(r0, r4, r7, r6, r5)
            throw r6
        L32:
            r3 = r7
        L33:
            r12 = r1
            r11 = r7
            r13 = r11
            r14 = r13
            r9 = 0
            r16 = 0
            r18 = 0
        L3d:
            int r15 = r2.length()
            java.lang.String r8 = "Numeric value overflow"
            if (r12 == r15) goto L102
            char r15 = r2.charAt(r12)
            r5 = 101(0x65, float:1.42E-43)
            if (r15 == r5) goto L51
            r5 = 69
            if (r15 != r5) goto L75
        L51:
            if (r13 != 0) goto L75
            if (r12 == r1) goto L5d
            int r12 = r12 + 1
            r5 = 6
            r8 = 34
            r11 = 1
            r13 = 1
            goto L3d
        L5d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected symbol "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = " in numeric literal"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5 = 6
            m(r0, r1, r7, r6, r5)
            throw r6
        L75:
            java.lang.String r5 = "Unexpected symbol '-' in numeric literal"
            r6 = 45
            if (r15 != r6) goto L8d
            if (r13 == 0) goto L8d
            if (r12 == r1) goto L87
            int r12 = r12 + 1
            r11 = r7
        L82:
            r5 = 6
            r6 = 0
            r8 = 34
            goto L3d
        L87:
            r6 = 6
            r8 = 0
            m(r0, r5, r7, r8, r6)
            throw r8
        L8d:
            r6 = 0
            r6 = 43
            if (r15 != r6) goto La6
            if (r13 == 0) goto La6
            if (r12 == r1) goto L9e
            int r12 = r12 + 1
            r5 = 6
            r6 = 0
            r8 = 34
            r11 = 1
            goto L3d
        L9e:
            java.lang.String r1 = "Unexpected symbol '+' in numeric literal"
            r2 = 0
            r6 = 6
            m(r0, r1, r7, r2, r6)
            throw r2
        La6:
            r20 = r3
            r3 = 0
            r6 = 6
            r3 = 45
            if (r15 != r3) goto Lbf
            if (r12 != r1) goto Lba
            int r12 = r12 + 1
            r5 = r6
            r3 = r20
            r6 = 0
            r8 = 34
            r14 = 1
            goto L3d
        Lba:
            r3 = 0
            m(r0, r5, r7, r3, r6)
            throw r3
        Lbf:
            byte r3 = b6.e.c(r15)
            if (r3 != 0) goto L104
            int r12 = r12 + 1
            int r3 = r15 + (-48)
            if (r3 < 0) goto Le9
            r5 = 10
            if (r3 >= r5) goto Le9
            if (r13 == 0) goto Ld8
            long r5 = (long) r5
            long r9 = r9 * r5
            long r5 = (long) r3
            long r9 = r9 + r5
        Ld5:
            r3 = r20
            goto L82
        Ld8:
            long r5 = (long) r5
            long r16 = r16 * r5
            long r5 = (long) r3
            long r16 = r16 - r5
            int r3 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r3 > 0) goto Le3
            goto Ld5
        Le3:
            r3 = 0
            r6 = 6
            m(r0, r8, r7, r3, r6)
            throw r3
        Le9:
            r3 = 0
            r6 = 6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected symbol '"
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = "' in numeric literal"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m(r0, r1, r7, r3, r6)
            throw r3
        L102:
            r20 = r3
        L104:
            if (r12 == r1) goto L108
            r3 = 1
            goto L109
        L108:
            r3 = r7
        L109:
            if (r1 == r12) goto L112
            if (r14 == 0) goto L116
            int r5 = r12 + (-1)
            if (r1 == r5) goto L112
            goto L116
        L112:
            r3 = 0
            r6 = 6
            goto L19b
        L116:
            if (r20 == 0) goto L133
            if (r3 == 0) goto L12d
            char r1 = r2.charAt(r12)
            r2 = 34
            if (r1 != r2) goto L125
            int r12 = r12 + 1
            goto L133
        L125:
            java.lang.String r1 = "Expected closing quotation mark"
            r3 = 0
            r6 = 6
            m(r0, r1, r7, r3, r6)
            throw r3
        L12d:
            r3 = 0
            r6 = 6
            m(r0, r4, r7, r3, r6)
            throw r3
        L133:
            r0.f1289b = r12
            r1 = r16
            if (r13 == 0) goto L189
            double r1 = (double) r1
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r11 != 0) goto L145
            double r5 = (double) r9
            double r5 = -r5
            double r3 = java.lang.Math.pow(r3, r5)
            goto L14d
        L145:
            r5 = 1
            if (r11 != r5) goto L183
            double r5 = (double) r9
            double r3 = java.lang.Math.pow(r3, r5)
        L14d:
            double r1 = r1 * r3
            r3 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L17d
            r3 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L17d
            double r3 = java.lang.Math.floor(r1)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L164
            long r10 = (long) r1
            goto L18a
        L164:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't convert "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " to Long"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 0
            r6 = 6
            m(r0, r1, r7, r3, r6)
            throw r3
        L17d:
            r3 = 0
            r6 = 6
            m(r0, r8, r7, r3, r6)
            throw r3
        L183:
            C2.e r1 = new C2.e
            r1.<init>()
            throw r1
        L189:
            r10 = r1
        L18a:
            if (r14 == 0) goto L18d
            return r10
        L18d:
            r1 = -9223372036854775808
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 == 0) goto L195
            long r1 = -r10
            return r1
        L195:
            r3 = 0
            r6 = 6
            m(r0, r8, r7, r3, r6)
            throw r3
        L19b:
            java.lang.String r1 = "Expected numeric literal"
            m(r0, r1, r7, r3, r6)
            throw r3
        L1a1:
            r3 = r6
            r6 = r5
            m(r0, r4, r7, r3, r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: D.u.h():long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String i() {
        String str = (String) this.f1291d;
        if (str == null) {
            return d();
        }
        kotlin.jvm.internal.m.b(str);
        this.f1291d = null;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String j() {
        String str = (String) this.f;
        String str2 = (String) this.f1291d;
        if (str2 != null) {
            kotlin.jvm.internal.m.b(str2);
            this.f1291d = null;
            return str2;
        }
        int iZ = z();
        if (iZ >= str.length() || iZ == -1) {
            m(this, "EOF", iZ, null, 4);
            throw null;
        }
        byte bC = b6.e.c(str.charAt(iZ));
        if (bC == 1) {
            return i();
        }
        if (bC != 0) {
            m(this, "Expected beginning of the string, but got " + str.charAt(iZ), 0, null, 6);
            throw null;
        }
        boolean z5 = false;
        while (b6.e.c(str.charAt(iZ)) == 0) {
            iZ++;
            if (iZ >= str.length()) {
                ((StringBuilder) this.f1292e).append((CharSequence) str, this.f1289b, iZ);
                int iY = y(iZ);
                if (iY == -1) {
                    this.f1289b = iZ;
                    return k(0, 0);
                }
                iZ = iY;
                z5 = true;
            }
        }
        String string = !z5 ? str.subSequence(this.f1289b, iZ).toString() : k(this.f1289b, iZ);
        this.f1289b = iZ;
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String k(int i, int i7) {
        ((StringBuilder) this.f1292e).append((CharSequence) this.f, i, i7);
        StringBuilder sb = (StringBuilder) this.f1292e;
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(String message, String hint, int i) {
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(hint, "hint");
        throw b6.e.a(i, (String) this.f, message + " at path: " + ((Y) this.f1290c).i() + (hint.length() == 0 ? "" : "\n".concat(hint)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T1.p n(int i) {
        return p(i, (T1.r) this.f1290c, null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T1.p o(String route, boolean z5) {
        Object next;
        T1.r rVar;
        kotlin.jvm.internal.m.e(route, "route");
        r.S s6 = (r.S) this.f1291d;
        kotlin.jvm.internal.m.e(s6, "<this>");
        Iterator it = ((I5.a) I5.k.Q(new C1193b(6, s6))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            T1.p pVar = (T1.p) next;
            if (J5.t.B0((String) pVar.f7404r.f8095e, route, false) || pVar.f7404r.f(route) != null) {
                break;
            }
        }
        T1.p pVar2 = (T1.p) next;
        if (pVar2 != null) {
            return pVar2;
        }
        if (!z5 || (rVar = ((T1.r) this.f1290c).f7405s) == null) {
            return null;
        }
        u uVar = rVar.f7413v;
        uVar.getClass();
        if (J5.m.U0(route)) {
            return null;
        }
        return uVar.o(route, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T1.p p(int i, T1.p pVar, T1.p pVar2, boolean z5) {
        T1.r rVar = (T1.r) this.f1290c;
        r.S s6 = (r.S) this.f1291d;
        T1.p pVarP = (T1.p) s6.c(i);
        if (pVar2 != null) {
            if (kotlin.jvm.internal.m.a(pVarP, pVar2) && kotlin.jvm.internal.m.a(pVarP.f7405s, pVar2.f7405s)) {
                return pVarP;
            }
            pVarP = null;
        } else if (pVarP != null) {
            return pVarP;
        }
        if (z5) {
            Iterator it = ((I5.a) I5.k.Q(new C1193b(6, s6))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pVarP = null;
                    break;
                }
                T1.p pVar3 = (T1.p) it.next();
                pVarP = (!(pVar3 instanceof T1.r) || kotlin.jvm.internal.m.a(pVar3, pVar)) ? null : ((T1.r) pVar3).f7413v.p(i, rVar, pVar2, true);
                if (pVarP != null) {
                    break;
                }
            }
        }
        if (pVarP != null) {
            return pVarP;
        }
        T1.r rVar2 = rVar.f7405s;
        if (rVar2 == null || rVar2.equals(pVar)) {
            return null;
        }
        T1.r rVar3 = rVar.f7405s;
        kotlin.jvm.internal.m.b(rVar3);
        return rVar3.f7413v.p(i, rVar, pVar2, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int q(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public t r(int i) {
        ?? r02;
        int i7 = this.f1289b;
        int i8 = i * i7;
        int iT = t() - i8;
        if (i7 > iT) {
            i7 = iT;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i7 == this.f.size()) {
            r02 = this.f;
        } else {
            ArrayList arrayList = new ArrayList(i7);
            for (int i9 = 0; i9 < i7; i9++) {
                arrayList.add(new C0117b(1));
            }
            this.f = arrayList;
            r02 = arrayList;
        }
        return new t(i8, r02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int s(int i) {
        if (t() <= 0) {
            return 0;
        }
        if (i >= t()) {
            AbstractC1923a.a("ItemIndex > total count");
        }
        return i / this.f1289b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int t() {
        return ((h) this.f1290c).f1214c.f1519b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f1288a) {
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f);
                sb.append("', currentPosition=");
                return S.o(sb, this.f1289b, ')');
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T1.o u(T1.o oVar, G0 g02, boolean z5, T1.p pVar) {
        T1.o oVarI;
        T1.r rVar = (T1.r) this.f1290c;
        ArrayList arrayList = new ArrayList();
        Iterator it = rVar.iterator();
        while (true) {
            W1.m mVar = (W1.m) it;
            if (!mVar.hasNext()) {
                break;
            }
            T1.p pVar2 = (T1.p) mVar.next();
            oVarI = kotlin.jvm.internal.m.a(pVar2, pVar) ? null : pVar2.h(g02);
            if (oVarI != null) {
                arrayList.add(oVarI);
            }
        }
        T1.o oVar2 = (T1.o) n5.l.t0(arrayList);
        T1.r rVar2 = rVar.f7405s;
        if (rVar2 != null && z5 && !rVar2.equals(pVar)) {
            oVarI = rVar2.i(g02, rVar);
        }
        return (T1.o) n5.l.t0(n5.k.M0(new T1.o[]{oVar, oVar2, oVarI}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String v(String keyToMatch) {
        kotlin.jvm.internal.m.e(keyToMatch, "keyToMatch");
        int i = this.f1289b;
        try {
            if (e() == 6 && kotlin.jvm.internal.m.a(x(), keyToMatch)) {
                this.f1291d = null;
                if (e() == 5) {
                    return x();
                }
            }
            return null;
        } finally {
            this.f1289b = i;
            this.f1291d = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte w() {
        String str = (String) this.f;
        int i = this.f1289b;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.f1289b = iY;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iY);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f1289b = iY;
                return b6.e.c(cCharAt);
            }
            i = iY + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String x() {
        if (w() != 1) {
            return null;
        }
        String strI = i();
        this.f1291d = strI;
        return strI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int y(int i) {
        if (i < ((String) this.f).length()) {
            return i;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int z() {
        char cCharAt;
        int i = this.f1289b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.f1289b = i;
        return i;
    }

    public u(T1.r rVar) {
        this.f1288a = 1;
        this.f1290c = rVar;
        this.f1291d = new r.S(0);
    }

    public u(String source) {
        this.f1288a = 2;
        kotlin.jvm.internal.m.e(source, "source");
        Y y6 = new Y(6, (byte) 0);
        y6.f1520c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        y6.f1521d = iArr;
        y6.f1519b = -1;
        this.f1290c = y6;
        this.f1292e = new StringBuilder();
        this.f = source;
    }
}
