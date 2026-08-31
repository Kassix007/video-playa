package androidx.work;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class Data_Kt {
    private static final String TAG;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String strTagWithPrefix = Logger.tagWithPrefix("Data");
        m.d(strTagWithPrefix, "tagWithPrefix(\"Data\")");
        TAG = strTagWithPrefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean[] convertPrimitiveArray(boolean[] zArr) {
        int length = zArr.length;
        Boolean[] boolArr = new Boolean[length];
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Byte[] convertPrimitiveArray(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer[] convertPrimitiveArray(int[] iArr) {
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long[] convertPrimitiveArray(long[] jArr) {
        int length = jArr.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float[] convertPrimitiveArray(float[] fArr) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double[] convertPrimitiveArray(double[] dArr) {
        int length = dArr.length;
        Double[] dArr2 = new Double[length];
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }
}
