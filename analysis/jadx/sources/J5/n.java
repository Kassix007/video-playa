package J5;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends P1 {
    /* JADX DEBUG: Class process forced to load method for inline: n5.l.p0(java.util.ArrayList, java.lang.StringBuilder):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String x0(String str) {
        List listZ;
        Comparable comparable;
        kotlin.jvm.internal.m.e(str, "<this>");
        g gVar = new g(str);
        if (gVar.hasNext()) {
            Object next = gVar.next();
            if (gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                listZ = arrayList;
            } else {
                listZ = AbstractC0836n2.z(next);
            }
        } else {
            listZ = n5.s.f15299q;
        }
        List list = listZ;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!m.U0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(n5.m.c0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!I1.v0(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listZ.size();
        int iU = AbstractC0836n2.u(listZ);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC0836n2.N();
                throw null;
            }
            String str3 = (String) obj3;
            String strL0 = ((i == 0 || i == iU) && m.U0(str3)) ? null : m.L0(iIntValue, str3);
            if (strL0 != null) {
                arrayList4.add(strL0);
            }
            i = i8;
        }
        StringBuilder sb = new StringBuilder(length3);
        n5.l.o0(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String y0(String str) {
        List listZ;
        kotlin.jvm.internal.m.e(str, "<this>");
        if (m.U0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        g gVar = new g(str);
        if (gVar.hasNext()) {
            Object next = gVar.next();
            if (gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                listZ = arrayList;
            } else {
                listZ = AbstractC0836n2.z(next);
            }
        } else {
            listZ = n5.s.f15299q;
        }
        int length = str.length();
        listZ.size();
        int iU = AbstractC0836n2.u(listZ);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listZ) {
            int i7 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC0836n2.N();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iU) || !m.U0(str2)) {
                int length2 = str2.length();
                int i8 = 0;
                while (true) {
                    if (i8 >= length2) {
                        i8 = -1;
                        break;
                    }
                    if (!I1.v0(str2.charAt(i8))) {
                        break;
                    }
                    i8++;
                }
                if (i8 != -1 && t.F0(str2, "|", i8, false)) {
                    strSubstring = str2.substring("|".length() + i8);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i7;
        }
        StringBuilder sb = new StringBuilder(length);
        n5.l.o0(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
