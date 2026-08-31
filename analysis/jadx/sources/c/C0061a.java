package C;

import android.util.Log;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.ArrayList;
import java.util.Iterator;
import p3.AbstractC1446a0;
import p3.C1445a;
import p3.C1449c;
import p3.C1466l;
import p3.C1467m;
import p3.C1468n;
import p3.EnumC1451d;
import p3.J;
import p3.J0;
import p3.S;
import p3.W;
import p3.Y;
import w1.P;

/* JADX INFO: renamed from: C.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0061a implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f585b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f586c = EnumC1451d.f15757r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0061a(int i) {
        this.f584a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(ArrayList arrayList, int i, Y y6) {
        int i7 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        W w3 = y6.f15751b;
        if (obj != w3) {
            return -1;
        }
        Iterator it = w3.f().iterator();
        while (it.hasNext()) {
            if (((AbstractC1446a0) it.next()) == y6) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList f(C1449c c1449c) {
        ArrayList arrayList = new ArrayList();
        while (!c1449c.m()) {
            String str = (String) c1449c.f15670c;
            String strSubstring = null;
            if (!c1449c.m()) {
                int i = c1449c.f15668a;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    c1449c.f15668a = i;
                } else {
                    int iG = c1449c.g();
                    while (true) {
                        if ((iG < 65 || iG > 90) && (iG < 97 || iG > 122)) {
                            break;
                        }
                        iG = c1449c.g();
                    }
                    strSubstring = str.substring(i, c1449c.f15668a);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(EnumC1451d.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!c1449c.x()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean i(C1467m c1467m, int i, ArrayList arrayList, int i7, Y y6) {
        C1468n c1468n = (C1468n) c1467m.f15788a.get(i);
        if (!l(c1468n, y6)) {
            return false;
        }
        int i8 = c1468n.f15793a;
        if (i8 == 1) {
            if (i != 0) {
                while (i7 >= 0) {
                    if (!k(c1467m, i - 1, arrayList, i7)) {
                        i7--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i8 == 2) {
            return k(c1467m, i - 1, arrayList, i7);
        }
        int iD = d(arrayList, i7, y6);
        if (iD <= 0) {
            return false;
        }
        return i(c1467m, i - 1, arrayList, i7, (Y) y6.f15751b.f().get(iD - 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean j(C1467m c1467m, Y y6) {
        ArrayList arrayList = new ArrayList();
        Object obj = y6.f15751b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((AbstractC1446a0) obj).f15751b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c1467m.f15788a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return l((C1468n) c1467m.f15788a.get(0), y6);
        }
        ArrayList arrayList3 = c1467m.f15788a;
        return i(c1467m, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, y6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean k(C1467m c1467m, int i, ArrayList arrayList, int i7) {
        C1468n c1468n = (C1468n) c1467m.f15788a.get(i);
        Y y6 = (Y) arrayList.get(i7);
        if (!l(c1468n, y6)) {
            return false;
        }
        int i8 = c1468n.f15793a;
        if (i8 == 1) {
            if (i != 0) {
                while (i7 > 0) {
                    i7--;
                    if (k(c1467m, i - 1, arrayList, i7)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i8 == 2) {
            return k(c1467m, i - 1, arrayList, i7 - 1);
        }
        int iD = d(arrayList, i7, y6);
        if (iD <= 0) {
            return false;
        }
        return i(c1467m, i - 1, arrayList, i7, (Y) y6.f15751b.f().get(iD - 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(p3.C1468n r7, p3.Y r8) {
        /*
            java.lang.String r0 = r7.f15794b
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r2 = r8.o()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L16
            goto L6c
        L16:
            java.util.ArrayList r0 = r7.f15795c
            if (r0 == 0) goto L53
            int r2 = r0.size()
            r3 = r1
        L1f:
            if (r3 >= r2) goto L53
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            p3.b r4 = (p3.C1447b) r4
            java.lang.String r5 = r4.f15752a
            java.lang.String r4 = r4.f15754c
            java.lang.String r6 = "id"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L4a
            java.lang.String r6 = "class"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3e
            goto L6c
        L3e:
            java.util.ArrayList r5 = r8.f15745g
            if (r5 != 0) goto L43
            goto L6c
        L43:
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto L1f
            goto L6c
        L4a:
            java.lang.String r5 = r8.f15742c
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1f
            goto L6c
        L53:
            java.util.ArrayList r7 = r7.f15796d
            if (r7 == 0) goto L6d
            int r0 = r7.size()
            r2 = r1
        L5c:
            if (r2 >= r0) goto L6d
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            p3.e r3 = (p3.InterfaceC1453e) r3
            boolean r3 = r3.a(r8)
            if (r3 != 0) goto L5c
        L6c:
            return r1
        L6d:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C.C0061a.l(p3.n, p3.Y):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.P
    public void a() {
        if (this.f585b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f586c;
        actionBarContextView.f9110v = null;
        super/*android.view.View*/.setVisibility(this.f584a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.P
    public void b() {
        this.f585b = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.P
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f585b = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(F3.c cVar, C1449c c1449c) throws C1445a {
        int iIntValue;
        char cCharAt;
        int iZ;
        String strB = c1449c.B();
        c1449c.y();
        if (strB == null) {
            throw new C1445a("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f585b && strB.equals("media")) {
            ArrayList arrayListF = f(c1449c);
            if (!c1449c.j('{')) {
                throw new C1445a("Invalid @media rule: missing rule set");
            }
            c1449c.y();
            EnumC1451d enumC1451d = (EnumC1451d) this.f586c;
            int size = arrayListF.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayListF.get(i7);
                i7++;
                EnumC1451d enumC1451d2 = (EnumC1451d) obj;
                if (enumC1451d2 == EnumC1451d.f15756q || enumC1451d2 == enumC1451d) {
                    this.f585b = true;
                    cVar.b(h(c1449c));
                    this.f585b = false;
                    break;
                }
            }
            h(c1449c);
            if (!c1449c.m() && !c1449c.j('}')) {
                throw new C1445a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f585b || !strB.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strB + " rule");
            while (!c1449c.m() && ((iIntValue = c1449c.p().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strA = null;
            if (!c1449c.m()) {
                int i8 = c1449c.f15668a;
                if (c1449c.k("url(")) {
                    c1449c.y();
                    String strA2 = c1449c.A();
                    if (strA2 == null) {
                        String str = (String) c1449c.f15670c;
                        StringBuilder sb = new StringBuilder();
                        while (!c1449c.m() && (cCharAt = str.charAt(c1449c.f15668a)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !J.o(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            c1449c.f15668a++;
                            if (cCharAt == '\\') {
                                if (!c1449c.m()) {
                                    int i9 = c1449c.f15668a;
                                    c1449c.f15668a = i9 + 1;
                                    cCharAt = str.charAt(i9);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iZ2 = C1449c.z(cCharAt);
                                        if (iZ2 != -1) {
                                            for (int i10 = 1; i10 <= 5 && !c1449c.m() && (iZ = C1449c.z(str.charAt(c1449c.f15668a))) != -1; i10++) {
                                                c1449c.f15668a++;
                                                iZ2 = (iZ2 * 16) + iZ;
                                            }
                                            sb.append((char) iZ2);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strA2 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strA2 == null) {
                        c1449c.f15668a = i8;
                    } else {
                        c1449c.y();
                        if (c1449c.m() || c1449c.k(")")) {
                            strA = strA2;
                        } else {
                            c1449c.f15668a = i8;
                        }
                    }
                }
            }
            if (strA == null) {
                strA = c1449c.A();
            }
            if (strA == null) {
                throw new C1445a("Invalid @import rule: expected string or url()");
            }
            c1449c.y();
            f(c1449c);
            if (!c1449c.m() && !c1449c.j(';')) {
                throw new C1445a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c1449c.y();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean g(F3.c cVar, C1449c c1449c) throws C1445a {
        ArrayList arrayListC = c1449c.C();
        int i = 0;
        if (arrayListC == null || arrayListC.isEmpty()) {
            return false;
        }
        if (!c1449c.j('{')) {
            throw new C1445a("Malformed rule block: expected '{'");
        }
        c1449c.y();
        S s6 = new S();
        do {
            String strB = c1449c.B();
            c1449c.y();
            if (!c1449c.j(':')) {
                throw new C1445a("Expected ':'");
            }
            c1449c.y();
            String str = (String) c1449c.f15670c;
            String strSubstring = null;
            if (!c1449c.m()) {
                int i7 = c1449c.f15668a;
                int iCharAt = str.charAt(i7);
                int i8 = i7;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!J.o(iCharAt)) {
                        i8 = c1449c.f15668a + 1;
                    }
                    iCharAt = c1449c.g();
                }
                if (c1449c.f15668a > i7) {
                    strSubstring = str.substring(i7, i8);
                } else {
                    c1449c.f15668a = i7;
                }
            }
            if (strSubstring == null) {
                throw new C1445a("Expected property value");
            }
            c1449c.y();
            if (c1449c.j('!')) {
                c1449c.y();
                if (!c1449c.k("important")) {
                    throw new C1445a("Malformed rule set: found unexpected '!'");
                }
                c1449c.y();
            }
            c1449c.j(';');
            J0.D(s6, strB, strSubstring);
            c1449c.y();
            if (c1449c.m()) {
                break;
            }
        } while (!c1449c.j('}'));
        c1449c.y();
        int size = arrayListC.size();
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            int i9 = this.f584a;
            C1466l c1466l = new C1466l();
            c1466l.f15785a = (C1467m) obj;
            c1466l.f15786b = s6;
            c1466l.f15787c = i9;
            cVar.a(c1466l);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F3.c h(C1449c c1449c) {
        F3.c cVar = new F3.c(2);
        while (!c1449c.m()) {
            try {
                if (!c1449c.k("<!--") && !c1449c.k("-->")) {
                    if (!c1449c.j('@')) {
                        if (!g(cVar, c1449c)) {
                            break;
                        }
                    } else {
                        e(cVar, c1449c);
                    }
                }
            } catch (C1445a e7) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e7.getMessage());
                return cVar;
            }
        }
        return cVar;
    }
}
