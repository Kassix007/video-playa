package n5;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import m5.C1378q;
import m5.C1380s;
import m5.C1382u;
import m5.C1385x;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends P1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean A0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!A0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof C1378q) && (obj2 instanceof C1378q)) {
                            if (!Arrays.equals(((C1378q) obj).f15090q, ((C1378q) obj2).f15090q)) {
                            }
                        } else if ((obj instanceof C1385x) && (obj2 instanceof C1385x)) {
                            if (!Arrays.equals(((C1385x) obj).f15097q, ((C1385x) obj2).f15097q)) {
                            }
                        } else if ((obj instanceof C1380s) && (obj2 instanceof C1380s)) {
                            if (!Arrays.equals(((C1380s) obj).f15092q, ((C1380s) obj2).f15092q)) {
                            }
                        } else if ((obj instanceof C1382u) && (obj2 instanceof C1382u)) {
                            if (!Arrays.equals(((C1382u) obj).f15094q, ((C1382u) obj2).f15094q)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void B0(int i, int i7, int i8, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(bArr, i7, destination, i, i8 - i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void C0(int i, int i7, int i8, int[] iArr, int[] destination) {
        kotlin.jvm.internal.m.e(iArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(iArr, i7, destination, i, i8 - i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void D0(int i, int i7, int i8, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(objArr, i7, destination, i, i8 - i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void E0(long[] jArr, long[] destination, int i, int i7, int i8) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        kotlin.jvm.internal.m.e(destination, "destination");
        System.arraycopy(jArr, i7, destination, i, i8 - i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void F0(int i, int i7, int i8, int[] iArr, int[] iArr2) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = iArr.length;
        }
        C0(i, 0, i7, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void G0(int i, int i7, int i8, Object[] objArr, Object[] objArr2) {
        if ((i8 & 4) != 0) {
            i = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = objArr.length;
        }
        D0(0, i, i7, objArr, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] H0(byte[] bArr, int i, int i7) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        P1.n(i7, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i7);
        kotlin.jvm.internal.m.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] I0(Object[] objArr, int i, int i7) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        P1.n(i7, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i7);
        kotlin.jvm.internal.m.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void J0(int i, int i7, Object obj, Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        Arrays.fill(objArr, i, i7, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void K0(long[] jArr, long j) {
        int length = jArr.length;
        kotlin.jvm.internal.m.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList M0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static G5.d N0(int[] iArr) {
        return new G5.d(0, iArr.length - 1, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int O0(long[] jArr) {
        kotlin.jvm.internal.m.e(jArr, "<this>");
        return jArr.length - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int P0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static char Q0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List R0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new i(objArr, false)) : AbstractC0836n2.z(objArr[0]) : s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List x0(Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.m.d(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean y0(int[] iArr, int i) {
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (i == iArr[i7]) {
                break;
            }
            i7++;
        }
        return i7 >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean z0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.m.e(objArr, "<this>");
        return P0(objArr, obj) >= 0;
    }
}
