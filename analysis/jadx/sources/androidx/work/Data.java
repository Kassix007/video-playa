package androidx.work;

import B5.e;
import android.annotation.SuppressLint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import k1.i;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import m5.InterfaceC1364c;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
public final class Data {
    public static final Companion Companion = new Companion(null);
    public static final Data EMPTY = new Builder().build();

    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_DATA_BYTES = 10240;
    private static final String NULL_STRING_V1 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    private static final short STREAM_MAGIC = -21521;
    private static final short STREAM_VERSION = 1;
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;
    private final Map<String, Object> values;

    public static final class Builder {
        private final Map<String, Object> values = new LinkedHashMap();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final Builder putDirect(String str, Object obj) {
            this.values.put(str, obj);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Data build() {
            Data data = new Data((Map<String, ?>) this.values);
            Data.Companion.toByteArrayInternalV1(data);
            return data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder put(String key, Object obj) {
            m.e(key, "key");
            Map<String, Object> map = this.values;
            if (obj == null) {
                obj = null;
            } else {
                f fVarA = z.a(obj.getClass());
                if (!(fVarA.equals(z.a(Boolean.TYPE)) ? true : fVarA.equals(z.a(Byte.TYPE)) ? true : fVarA.equals(z.a(Integer.TYPE)) ? true : fVarA.equals(z.a(Long.TYPE)) ? true : fVarA.equals(z.a(Float.TYPE)) ? true : fVarA.equals(z.a(Double.TYPE)) ? true : fVarA.equals(z.a(String.class)) ? true : fVarA.equals(z.a(Boolean[].class)) ? true : fVarA.equals(z.a(Byte[].class)) ? true : fVarA.equals(z.a(Integer[].class)) ? true : fVarA.equals(z.a(Long[].class)) ? true : fVarA.equals(z.a(Float[].class)) ? true : fVarA.equals(z.a(Double[].class)) ? true : fVarA.equals(z.a(String[].class)))) {
                    if (fVarA.equals(z.a(boolean[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((boolean[]) obj);
                    } else if (fVarA.equals(z.a(byte[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((byte[]) obj);
                    } else if (fVarA.equals(z.a(int[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((int[]) obj);
                    } else if (fVarA.equals(z.a(long[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((long[]) obj);
                    } else if (fVarA.equals(z.a(float[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((float[]) obj);
                    } else {
                        if (!fVarA.equals(z.a(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + fVarA);
                        }
                        obj = Data_Kt.convertPrimitiveArray((double[]) obj);
                    }
                }
            }
            map.put(key, obj);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putAll(Data data) {
            m.e(data, "data");
            putAll(data.values);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putBoolean(String key, boolean z5) {
            m.e(key, "key");
            return putDirect(key, Boolean.valueOf(z5));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putBooleanArray(String key, boolean[] value) {
            m.e(key, "key");
            m.e(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putByte(String key, byte b7) {
            m.e(key, "key");
            return putDirect(key, Byte.valueOf(b7));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putByteArray(String key, byte[] value) {
            m.e(key, "key");
            m.e(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putDouble(String key, double d5) {
            m.e(key, "key");
            return putDirect(key, Double.valueOf(d5));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putDoubleArray(String key, double[] value) {
            m.e(key, "key");
            m.e(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putFloat(String key, float f) {
            m.e(key, "key");
            return putDirect(key, Float.valueOf(f));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putFloatArray(String key, float[] value) {
            m.e(key, "key");
            m.e(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putInt(String key, int i) {
            m.e(key, "key");
            return putDirect(key, Integer.valueOf(i));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putIntArray(String key, int[] value) {
            m.e(key, "key");
            m.e(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putLong(String key, long j) {
            m.e(key, "key");
            return putDirect(key, Long.valueOf(j));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putLongArray(String key, long[] value) {
            m.e(key, "key");
            m.e(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putString(String key, String str) {
            m.e(key, "key");
            return putDirect(key, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder putStringArray(String key, String[] value) {
            m.e(key, "key");
            m.e(value, "value");
            return putDirect(key, value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final Builder putAll(Map<String, ? extends Object> values) {
            m.e(values, "values");
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.Data.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static final boolean fromByteArray$isObjectStream(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b7 = (byte) (-21267);
            boolean z5 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b7) {
                z5 = true;
            }
            byteArrayInputStream.reset();
            return z5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static final void fromByteArray$readHeader(DataInputStream dataInputStream) throws IOException {
            short s6 = dataInputStream.readShort();
            if (s6 != -21521) {
                throw new IllegalStateException(i.i(s6, "Magic number doesn't match: ").toString());
            }
            short s7 = dataInputStream.readShort();
            if (s7 != 1) {
                throw new IllegalStateException(i.i(s7, "Unsupported version number: ").toString());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static final Object fromByteArray$readValue(DataInputStream dataInputStream, byte b7) throws IOException {
            if (b7 == 0) {
                return null;
            }
            if (b7 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b7 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b7 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b7 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b7 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b7 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b7 == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b7 == 8) {
                int i7 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i7];
                while (i < i7) {
                    boolArr[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return boolArr;
            }
            if (b7 == 9) {
                int i8 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i8];
                while (i < i8) {
                    bArr[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return bArr;
            }
            if (b7 == 10) {
                int i9 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i9];
                while (i < i9) {
                    numArr[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return numArr;
            }
            if (b7 == 11) {
                int i10 = dataInputStream.readInt();
                Long[] lArr = new Long[i10];
                while (i < i10) {
                    lArr[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return lArr;
            }
            if (b7 == 12) {
                int i11 = dataInputStream.readInt();
                Float[] fArr = new Float[i11];
                while (i < i11) {
                    fArr[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return fArr;
            }
            if (b7 == 13) {
                int i12 = dataInputStream.readInt();
                Double[] dArr = new Double[i12];
                while (i < i12) {
                    dArr[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return dArr;
            }
            if (b7 != 14) {
                throw new IllegalStateException(i.i(b7, "Unsupported type "));
            }
            int i13 = dataInputStream.readInt();
            String[] strArr = new String[i13];
            while (i < i13) {
                String utf = dataInputStream.readUTF();
                if (m.a(utf, Data.NULL_STRING_V1)) {
                    utf = null;
                }
                strArr[i] = utf;
                i++;
            }
            return strArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static final void toByteArrayInternalV1$writeArray(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i;
            f fVarA = z.a(objArr.getClass());
            if (fVarA.equals(z.a(Boolean[].class))) {
                i = 8;
            } else if (fVarA.equals(z.a(Byte[].class))) {
                i = 9;
            } else if (fVarA.equals(z.a(Integer[].class))) {
                i = 10;
            } else if (fVarA.equals(z.a(Long[].class))) {
                i = 11;
            } else if (fVarA.equals(z.a(Float[].class))) {
                i = 12;
            } else if (fVarA.equals(z.a(Double[].class))) {
                i = 13;
            } else {
                if (!fVarA.equals(z.a(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + z.a(objArr.getClass()).b());
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b7 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b7 != null ? b7.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l7 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l7 != null ? l7.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d5 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d5 != null ? d5.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = Data.NULL_STRING_V1;
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + z.a(obj.getClass()).c());
                }
                toByteArrayInternalV1$writeArray(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private static final void toByteArrayInternalV1$writeHeader(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final Data fromByteArray(byte[] bytes) {
            m.e(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return Data.EMPTY;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i = 0;
                if (fromByteArray$isObjectStream(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i7 = objectInputStream.readInt();
                        while (i < i7) {
                            String utf = objectInputStream.readUTF();
                            m.d(utf, "readUTF()");
                            linkedHashMap.put(utf, objectInputStream.readObject());
                            i++;
                        }
                        objectInputStream.close();
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        fromByteArray$readHeader(dataInputStream);
                        int i8 = dataInputStream.readInt();
                        while (i < i8) {
                            Object objFromByteArray$readValue = fromByteArray$readValue(dataInputStream, dataInputStream.readByte());
                            String key = dataInputStream.readUTF();
                            m.d(key, "key");
                            linkedHashMap.put(key, objFromByteArray$readValue);
                            i++;
                        }
                        dataInputStream.close();
                    } finally {
                    }
                }
            } catch (IOException e7) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e7);
            } catch (ClassNotFoundException e8) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e8);
            }
            return new Data(linkedHashMap);
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        @InterfaceC1364c
        public final byte[] toByteArrayInternalV0(Data data) {
            m.e(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeInt(data.size());
                        for (Map.Entry entry : data.values.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            objectOutputStream.writeUTF(str);
                            objectOutputStream.writeObject(value);
                        }
                        objectOutputStream.close();
                        byteArrayOutputStream.close();
                        if (byteArrayOutputStream.size() > 10240) {
                            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        m.d(byteArray, "{\n                val st…ByteArray()\n            }");
                        return byteArray;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e7) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e7);
                return new byte[0];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final byte[] toByteArrayInternalV1(Data data) {
            m.e(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    toByteArrayInternalV1$writeHeader(dataOutputStream);
                    dataOutputStream.writeInt(data.size());
                    for (Map.Entry entry : data.values.entrySet()) {
                        toByteArrayInternalV1$writeEntry(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    m.d(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                } finally {
                }
            } catch (IOException e7) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e7);
                return new byte[0];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Data(Data other) {
        m.e(other, "other");
        this.values = new HashMap(other.values);
    }

    public static final Data fromByteArray(byte[] bArr) {
        return Companion.fromByteArray(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <T> T getOrDefault(String str, T t6) {
        this.values.get(str);
        m.j();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <T, TArray> TArray getTypedArray(String str, e eVar) {
        Object[] objArr;
        Object obj = this.values.get(str);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        m.j();
        throw null;
    }

    @InterfaceC1364c
    public static final byte[] toByteArrayInternalV0(Data data) {
        return Companion.toByteArrayInternalV0(data);
    }

    public static final byte[] toByteArrayInternalV1(Data data) {
        return Companion.toByteArrayInternalV1(data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L6a
            java.lang.Class<androidx.work.Data> r2 = androidx.work.Data.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L14
            goto L6a
        L14:
            androidx.work.Data r8 = (androidx.work.Data) r8
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.util.Set r2 = r2.keySet()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.values
            java.util.Set r3 = r3.keySet()
            boolean r3 = kotlin.jvm.internal.m.a(r2, r3)
            if (r3 != 0) goto L29
            return r1
        L29:
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.values
            java.lang.Object r4 = r4.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.values
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L61
            if (r3 != 0) goto L4a
            goto L61
        L4a:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5c
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = n5.k.A0(r5, r3)
            goto L66
        L5c:
            boolean r3 = r4.equals(r3)
            goto L66
        L61:
            if (r4 != r3) goto L65
            r3 = r0
            goto L66
        L65:
            r3 = r1
        L66:
            if (r3 != 0) goto L2d
            return r1
        L69:
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getBoolean(String key, boolean z5) {
        m.e(key, "key");
        Object objValueOf = Boolean.valueOf(z5);
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean[] getBooleanArray(String key) {
        Object[] objArr;
        m.e(key, "key");
        Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        Data$getBooleanArray$$inlined$getTypedArray$1 data$getBooleanArray$$inlined$getTypedArray$1 = new Data$getBooleanArray$$inlined$getTypedArray$1(obj);
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((Boolean) data$getBooleanArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).booleanValue();
        }
        return zArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte getByte(String key, byte b7) {
        m.e(key, "key");
        Object objValueOf = Byte.valueOf(b7);
        Object obj = this.values.get(key);
        if (obj instanceof Byte) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).byteValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] getByteArray(String key) {
        Object[] objArr;
        m.e(key, "key");
        Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        Data$getByteArray$$inlined$getTypedArray$1 data$getByteArray$$inlined$getTypedArray$1 = new Data$getByteArray$$inlined$getTypedArray$1(obj);
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((Number) data$getByteArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).byteValue();
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double getDouble(String key, double d5) {
        m.e(key, "key");
        Object objValueOf = Double.valueOf(d5);
        Object obj = this.values.get(key);
        if (obj instanceof Double) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).doubleValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double[] getDoubleArray(String key) {
        Object[] objArr;
        m.e(key, "key");
        Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        Data$getDoubleArray$$inlined$getTypedArray$1 data$getDoubleArray$$inlined$getTypedArray$1 = new Data$getDoubleArray$$inlined$getTypedArray$1(obj);
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((Number) data$getDoubleArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).doubleValue();
        }
        return dArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getFloat(String key, float f) {
        m.e(key, "key");
        Object objValueOf = Float.valueOf(f);
        Object obj = this.values.get(key);
        if (obj instanceof Float) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float[] getFloatArray(String key) {
        Object[] objArr;
        m.e(key, "key");
        Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        Data$getFloatArray$$inlined$getTypedArray$1 data$getFloatArray$$inlined$getTypedArray$1 = new Data$getFloatArray$$inlined$getTypedArray$1(obj);
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Number) data$getFloatArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).floatValue();
        }
        return fArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInt(String key, int i) {
        m.e(key, "key");
        Object objValueOf = Integer.valueOf(i);
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] getIntArray(String key) {
        Object[] objArr;
        m.e(key, "key");
        Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        Data$getIntArray$$inlined$getTypedArray$1 data$getIntArray$$inlined$getTypedArray$1 = new Data$getIntArray$$inlined$getTypedArray$1(obj);
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) data$getIntArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).intValue();
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map<String, Object> getKeyValueMap() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.values);
        m.d(mapUnmodifiableMap, "unmodifiableMap(values)");
        return mapUnmodifiableMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getLong(String key, long j) {
        m.e(key, "key");
        Object objValueOf = Long.valueOf(j);
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long[] getLongArray(String key) {
        Object[] objArr;
        m.e(key, "key");
        Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        Data$getLongArray$$inlined$getTypedArray$1 data$getLongArray$$inlined$getTypedArray$1 = new Data$getLongArray$$inlined$getTypedArray$1(obj);
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) data$getLongArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).longValue();
        }
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getString(String key) {
        m.e(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final String[] getStringArray(String key) {
        Object[] objArr;
        m.e(key, "key");
        Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        Data$getStringArray$$inlined$getTypedArray$1 data$getStringArray$$inlined$getTypedArray$1 = new Data$getStringArray$$inlined$getTypedArray$1(obj);
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = data$getStringArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i));
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T> boolean hasKey$work_runtime_release(String key) {
        m.e(key, "key");
        m.j();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final <T> boolean hasKeyWithValueOfType(String key, Class<T> klass) {
        m.e(key, "key");
        m.e(klass, "klass");
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.values.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] toByteArray() {
        return Companion.toByteArrayInternalV1(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = "Data {" + l.q0(this.values.entrySet(), null, null, null, Data$toString$1$content$1.INSTANCE, 31) + "}";
        m.d(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    /* JADX INFO: renamed from: androidx.work.Data$getTypedArray$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements B5.c {
        final /* synthetic */ Object $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj) {
            super(1);
            this.$value = obj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final T invoke(int i) {
            Object obj = ((Object[]) this.$value)[i];
            m.j();
            throw null;
        }

        @Override // B5.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public Data(Map<String, ?> values) {
        m.e(values, "values");
        this.values = new HashMap(values);
    }
}
