package H1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f2090A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f2091B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f2092C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f2093D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final byte[] f2094E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final d f2095F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final d[][] f2096G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final d[] f2097H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final HashMap[] f2098I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final HashMap[] f2099J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Set f2100K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final HashMap f2101L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Charset f2102M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final byte[] f2103N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final byte[] f2104O;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f2105m = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f2106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f2107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f2108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f2109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f2110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f2111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f2112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f2113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f2114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f2115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f2116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f2117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f2118z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileDescriptor f2119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f2120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap[] f2122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f2123e;
    public ByteOrder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2125h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f2127l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f2106n = new int[]{8, 8, 8};
        f2107o = new int[]{8};
        f2108p = new byte[]{-1, -40, -1};
        f2109q = new byte[]{102, 116, 121, 112};
        f2110r = new byte[]{109, 105, 102, 49};
        f2111s = new byte[]{104, 101, 105, 99};
        f2112t = new byte[]{97, 118, 105, 102};
        f2113u = new byte[]{97, 118, 105, 115};
        f2114v = new byte[]{79, 76, 89, 77, 80, 0};
        f2115w = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f2116x = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f2117y = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f2118z = new byte[]{82, 73, 70, 70};
        f2090A = new byte[]{87, 69, 66, 80};
        f2091B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f2092C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f2093D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f2094E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f2095F = new d("StripOffsets", 273, 3);
        f2096G = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f2097H = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f2098I = new HashMap[10];
        f2099J = new HashMap[10];
        f2100K = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f2101L = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f2102M = charsetForName;
        f2103N = "Exif\u0000\u0000".getBytes(charsetForName);
        f2104O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr6 = f2096G;
            if (i >= dVarArr6.length) {
                HashMap map = f2101L;
                d[] dVarArr7 = f2097H;
                map.put(Integer.valueOf(dVarArr7[0].f2084a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f2084a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f2084a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f2084a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f2084a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f2084a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f2098I[i] = new HashMap();
            f2099J[i] = new HashMap();
            for (d dVar : dVarArr6[i]) {
                f2098I[i].put(Integer.valueOf(dVar.f2084a), dVar);
                f2099J[i].put(dVar.f2085b, dVar);
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:36:0x0097, B:42:0x00aa, B:39:0x009f, B:40:0x00a3, B:41:0x00a7, B:43:0x00b4, B:45:0x00bd, B:47:0x00c3, B:49:0x00c9, B:51:0x00cf, B:56:0x00dd), top: B:68:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.io.InputStream r10) throws java.io.IOException {
        /*
            r9 = this;
            r9.<init>()
            H1.d[][] r0 = H1.g.f2096G
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r9.f2122d = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r9.f2123e = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.f = r1
            boolean r1 = r10 instanceof android.content.res.AssetManager.AssetInputStream
            java.lang.String r2 = "ExifInterface"
            boolean r3 = H1.g.f2105m
            r4 = 0
            if (r1 == 0) goto L27
            r1 = r10
            android.content.res.AssetManager$AssetInputStream r1 = (android.content.res.AssetManager.AssetInputStream) r1
            r9.f2120b = r1
            r9.f2119a = r4
            goto L4d
        L27:
            boolean r1 = r10 instanceof java.io.FileInputStream
            if (r1 == 0) goto L49
            r1 = r10
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1
            java.io.FileDescriptor r5 = r1.getFD()
            int r6 = android.system.OsConstants.SEEK_CUR     // Catch: java.lang.Exception -> L42
            r7 = 0
            android.system.Os.lseek(r5, r7, r6)     // Catch: java.lang.Exception -> L42
            r9.f2120b = r4
            java.io.FileDescriptor r1 = r1.getFD()
            r9.f2119a = r1
            goto L4d
        L42:
            if (r3 == 0) goto L49
            java.lang.String r1 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r2, r1)
        L49:
            r9.f2120b = r4
            r9.f2119a = r4
        L4d:
            r1 = 0
            r4 = r1
        L4f:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            if (r4 >= r5) goto L67
            java.util.HashMap[] r5 = r9.f2122d     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r6.<init>()     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r5[r4] = r6     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            int r4 = r4 + 1
            goto L4f
        L5e:
            r10 = move-exception
            goto Le3
        L61:
            r10 = move-exception
            goto Ldb
        L64:
            r10 = move-exception
            goto Ldb
        L67:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r4 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r10, r4)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            int r10 = r9.f(r0)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r9.f2121c = r10     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r10 == r7) goto Lb4
            if (r10 == r6) goto Lb4
            if (r10 == r5) goto Lb4
            if (r10 != r4) goto L84
            goto Lb4
        L84:
            H1.f r10 = new H1.f     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            int r0 = r9.f2121c     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r1 = 12
            if (r0 == r1) goto La7
            r1 = 15
            if (r0 != r1) goto L94
            goto La7
        L94:
            r1 = 7
            if (r0 != r1) goto L9b
            r9.g(r10)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            goto Laa
        L9b:
            r1 = 10
            if (r0 != r1) goto La3
            r9.k(r10)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            goto Laa
        La3:
            r9.j(r10)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            goto Laa
        La7:
            r9.d(r10, r0)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
        Laa:
            int r0 = r9.f2125h     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r10.b(r0)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r9.u(r10)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            goto Ld2
        Lb4:
            H1.b r10 = new H1.b     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            int r0 = r9.f2121c     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            if (r0 != r7) goto Lc1
            r9.e(r10, r1, r1)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            goto Ld2
        Lc1:
            if (r0 != r5) goto Lc7
            r9.h(r10)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            goto Ld2
        Lc7:
            if (r0 != r6) goto Lcd
            r9.i(r10)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
            goto Ld2
        Lcd:
            if (r0 != r4) goto Ld2
            r9.l(r10)     // Catch: java.lang.Throwable -> L5e java.lang.UnsupportedOperationException -> L61 java.io.IOException -> L64
        Ld2:
            r9.a()
            if (r3 == 0) goto Lf2
        Ld7:
            r9.p()
            goto Lf2
        Ldb:
            if (r3 == 0) goto Lec
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r2, r0, r10)     // Catch: java.lang.Throwable -> L5e
            goto Lec
        Le3:
            r9.a()
            if (r3 == 0) goto Leb
            r9.p()
        Leb:
            throw r10
        Lec:
            r9.a()
            if (r3 == 0) goto Lf2
            goto Ld7
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.g.<init>(java.io.InputStream):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ByteOrder q(b bVar) throws IOException {
        short s6 = bVar.readShort();
        boolean z5 = f2105m;
        if (s6 == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s6 == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f2122d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(f2102M);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            int i = cVarC.f2080a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f2088a / eVar.f2089b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f2088a / eVar2.f2089b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f2088a / eVar3.f2089b)));
            }
            if (!f2100K.contains(str)) {
                return cVarC.f(this.f);
            }
            try {
                return Double.toString(cVarC.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c c(String str) {
        c cVar;
        int i;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f2105m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.f2121c) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (cVar2 = this.f2127l) != null)) {
            return cVar2;
        }
        for (int i7 = 0; i7 < f2096G.length; i7++) {
            c cVar3 = (c) this.f2122d[i7].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f2127l) == null) {
            return null;
        }
        return cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void d(f fVar, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i7 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f2122d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata3), this.f));
                }
                if (strExtractMetadata2 != null) {
                    int i8 = Integer.parseInt(strExtractMetadata2);
                    mapArr[0].put("Orientation", c.c(i8 != 90 ? i8 != 180 ? i8 != 270 ? 1 : 8 : 3 : 6, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata4);
                    int i10 = Integer.parseInt(strExtractMetadata5);
                    if (i10 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(i9);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i11 = i9 + 6;
                    int i12 = i10 - 6;
                    if (!Arrays.equals(bArr, f2103N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i12];
                    fVar.readFully(bArr2);
                    this.f2125h = i11;
                    r(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata8);
                    int i14 = Integer.parseInt(strExtractMetadata9);
                    long j = i13;
                    fVar.b(j);
                    byte[] bArr3 = new byte[i14];
                    fVar.readFully(bArr3);
                    this.f2127l = new c(j, bArr3, 1, i14);
                }
                if (f2105m) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e7) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e7);
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x009e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158 A[LOOP:0: B:10:0x0034->B:55:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(H1.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            java.lang.String r3 = "ExifInterface"
            boolean r4 = H1.g.f2105m
            if (r4 == 0) goto L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getJpegAttributes starting with: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L1d:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f2077s = r5
            byte r5 = r1.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r5 != r7) goto L1a2
            byte r8 = r1.readByte()
            r9 = -40
            if (r8 != r9) goto L18a
            r5 = 2
            r6 = r5
        L34:
            byte r8 = r1.readByte()
            if (r8 != r7) goto L170
            byte r8 = r1.readByte()
            if (r4 == 0) goto L57
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Found JPEG segment indicator: "
            r9.<init>(r10)
            r10 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r3, r9)
        L57:
            r9 = -39
            if (r8 == r9) goto L16b
            r9 = -38
            if (r8 != r9) goto L61
            goto L16b
        L61:
            int r9 = r1.readUnsignedShort()
            int r10 = r9 + (-2)
            r11 = 4
            int r6 = r6 + r11
            if (r4 == 0) goto L8f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "JPEG segment: "
            r12.<init>(r13)
            r13 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r12.append(r13)
            java.lang.String r13 = " (length: "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r13 = ")"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.d(r3, r12)
        L8f:
            java.lang.String r12 = "Invalid length"
            if (r10 < 0) goto L165
            r13 = -31
            r14 = 0
            if (r8 == r13) goto L10c
            r13 = -2
            r15 = 1
            java.util.HashMap[] r7 = r0.f2122d
            if (r8 == r13) goto Le1
            switch(r8) {
                case -64: goto Lac;
                case -63: goto Lac;
                case -62: goto Lac;
                case -61: goto Lac;
                default: goto La1;
            }
        La1:
            switch(r8) {
                case -59: goto Lac;
                case -58: goto Lac;
                case -57: goto Lac;
                default: goto La4;
            }
        La4:
            switch(r8) {
                case -55: goto Lac;
                case -54: goto Lac;
                case -53: goto Lac;
                default: goto La7;
            }
        La7:
            switch(r8) {
                case -51: goto Lac;
                case -50: goto Lac;
                case -49: goto Lac;
                default: goto Laa;
            }
        Laa:
            goto L156
        Lac:
            r1.a(r15)
            r8 = r7[r2]
            if (r2 == r11) goto Lb6
            java.lang.String r10 = "ImageLength"
            goto Lb8
        Lb6:
            java.lang.String r10 = "ThumbnailImageLength"
        Lb8:
            int r13 = r1.readUnsignedShort()
            long r13 = (long) r13
            java.nio.ByteOrder r15 = r0.f
            H1.c r13 = H1.c.a(r13, r15)
            r8.put(r10, r13)
            r7 = r7[r2]
            if (r2 == r11) goto Lcd
            java.lang.String r8 = "ImageWidth"
            goto Lcf
        Lcd:
            java.lang.String r8 = "ThumbnailImageWidth"
        Lcf:
            int r10 = r1.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r13 = r0.f
            H1.c r10 = H1.c.a(r10, r13)
            r7.put(r8, r10)
            int r10 = r9 + (-7)
            goto L156
        Le1:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.b(r9)
            if (r10 != 0) goto L10a
            r7 = r7[r15]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = H1.g.f2102M
            r10.<init>(r8, r11)
            java.lang.String r8 = "\u0000"
            java.lang.String r8 = r10.concat(r8)
            byte[] r8 = r8.getBytes(r11)
            H1.c r10 = new H1.c
            int r11 = r8.length
            r10.<init>(r8, r5, r11)
            r7.put(r9, r10)
        L10a:
            r10 = r14
            goto L156
        L10c:
            byte[] r7 = new byte[r10]
            r1.readFully(r7)
            int r8 = r6 + r10
            byte[] r9 = H1.g.f2103N
            boolean r11 = Q2.g.N(r7, r9)
            if (r11 == 0) goto L132
            int r11 = r9.length
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r11, r10)
            int r6 = r24 + r6
            int r9 = r9.length
            int r6 = r6 + r9
            r0.f2125h = r6
            r0.r(r2, r7)
            H1.b r6 = new H1.b
            r6.<init>(r7)
            r0.u(r6)
            goto L154
        L132:
            byte[] r9 = H1.g.f2104O
            boolean r11 = Q2.g.N(r7, r9)
            if (r11 == 0) goto L154
            int r11 = r9.length
            int r6 = r6 + r11
            int r9 = r9.length
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r9, r10)
            H1.c r16 = new H1.c
            int r9 = r7.length
            long r10 = (long) r6
            r20 = 1
            r19 = r7
            r21 = r9
            r17 = r10
            r16.<init>(r17, r19, r20, r21)
            r6 = r16
            r0.f2127l = r6
        L154:
            r6 = r8
            goto L10a
        L156:
            if (r10 < 0) goto L15f
            r1.a(r10)
            int r6 = r6 + r10
            r7 = -1
            goto L34
        L15f:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L165:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L16b:
            java.nio.ByteOrder r2 = r0.f
            r1.f2077s = r2
            return
        L170:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid marker:"
            r2.<init>(r3)
            r3 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L18a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1a2:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.g.e(H1.b, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r0.reset()
            r0 = 0
        L12:
            byte[] r5 = H1.g.f2108p
            int r6 = r5.length
            r7 = 4
            if (r0 >= r6) goto L1c1
            r6 = r3[r0]
            r5 = r5[r0]
            if (r6 == r5) goto L1bb
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r0 = r0.getBytes(r5)
            r5 = 0
        L29:
            int r6 = r0.length
            if (r5 >= r6) goto L1b8
            r6 = r3[r5]
            r8 = r0[r5]
            if (r6 == r8) goto L1b2
            r6 = 1
            H1.b r8 = new H1.b     // Catch: java.lang.Throwable -> Ld9 java.lang.Exception -> Ldd
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Ld9 java.lang.Exception -> Ldd
            int r0 = r8.readInt()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            long r9 = (long) r0     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            byte[] r0 = new byte[r7]     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            r8.readFully(r0)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            byte[] r11 = H1.g.f2109q     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            if (r0 != 0) goto L52
        L4a:
            r8.close()
            r18 = 0
            r0 = 0
            goto Lef
        L52:
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 8
            if (r0 != 0) goto L71
            long r9 = r8.readLong()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6c
            r15 = 16
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 >= 0) goto L65
            goto L4a
        L65:
            r18 = 0
            goto L73
        L68:
            r0 = move-exception
            r5 = r8
            goto L1ac
        L6c:
            r0 = move-exception
            r18 = 0
            goto Le1
        L71:
            r15 = r13
            goto L65
        L73:
            long r4 = (long) r2
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L79
            r9 = r4
        L79:
            long r9 = r9 - r15
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L85
        L7e:
            r8.close()
        L81:
            r0 = r18
            goto Lef
        L85:
            byte[] r0 = new byte[r7]     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            r4 = 0
            r2 = r18
            r13 = r2
            r14 = r13
        L8d:
            r15 = 4
            long r15 = r9 / r15
            int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r15 >= 0) goto L7e
            r8.readFully(r0)     // Catch: java.lang.Throwable -> L68 java.io.EOFException -> L7e java.lang.Exception -> Lc2
            int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r15 != 0) goto L9d
            goto Ld7
        L9d:
            byte[] r15 = H1.g.f2110r     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            boolean r15 = java.util.Arrays.equals(r0, r15)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            if (r15 == 0) goto La7
            r2 = r6
            goto Lc5
        La7:
            byte[] r15 = H1.g.f2111s     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            boolean r15 = java.util.Arrays.equals(r0, r15)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            if (r15 == 0) goto Lb1
            r13 = r6
            goto Lc5
        Lb1:
            byte[] r15 = H1.g.f2112t     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            boolean r15 = java.util.Arrays.equals(r0, r15)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            if (r15 != 0) goto Lc4
            byte[] r15 = H1.g.f2113u     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            boolean r15 = java.util.Arrays.equals(r0, r15)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> Lc2
            if (r15 == 0) goto Lc5
            goto Lc4
        Lc2:
            r0 = move-exception
            goto Le1
        Lc4:
            r14 = r6
        Lc5:
            if (r2 == 0) goto Ld7
            if (r13 == 0) goto Lcf
            r8.close()
            r0 = 12
            goto Lef
        Lcf:
            if (r14 == 0) goto Ld7
            r8.close()
            r0 = 15
            goto Lef
        Ld7:
            long r4 = r4 + r11
            goto L8d
        Ld9:
            r0 = move-exception
            r5 = 0
            goto L1ac
        Ldd:
            r0 = move-exception
            r18 = 0
            r8 = 0
        Le1:
            boolean r2 = H1.g.f2105m     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto Lec
            java.lang.String r2 = "ExifInterface"
            java.lang.String r4 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r4, r0)     // Catch: java.lang.Throwable -> L68
        Lec:
            if (r8 == 0) goto L81
            goto L7e
        Lef:
            if (r0 == 0) goto Lf2
            return r0
        Lf2:
            H1.b r2 = new H1.b     // Catch: java.lang.Throwable -> L117 java.lang.Exception -> L11a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L117 java.lang.Exception -> L11a
            java.nio.ByteOrder r0 = q(r2)     // Catch: java.lang.Throwable -> L114 java.lang.Exception -> L122
            r1.f = r0     // Catch: java.lang.Throwable -> L114 java.lang.Exception -> L122
            r2.f2077s = r0     // Catch: java.lang.Throwable -> L114 java.lang.Exception -> L122
            short r0 = r2.readShort()     // Catch: java.lang.Throwable -> L114 java.lang.Exception -> L122
            r4 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r4) goto L10f
            r4 = 21330(0x5352, float:2.989E-41)
            if (r0 != r4) goto L10c
            goto L10f
        L10c:
            r0 = r18
            goto L110
        L10f:
            r0 = r6
        L110:
            r2.close()
            goto L129
        L114:
            r0 = move-exception
            r5 = r2
            goto L11c
        L117:
            r0 = move-exception
            r5 = 0
            goto L11c
        L11a:
            r2 = 0
            goto L122
        L11c:
            if (r5 == 0) goto L121
            r5.close()
        L121:
            throw r0
        L122:
            if (r2 == 0) goto L127
            r2.close()
        L127:
            r0 = r18
        L129:
            if (r0 == 0) goto L12d
            r0 = 7
            return r0
        L12d:
            H1.b r2 = new H1.b     // Catch: java.lang.Throwable -> L14f java.lang.Exception -> L152
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14f java.lang.Exception -> L152
            java.nio.ByteOrder r0 = q(r2)     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14d
            r1.f = r0     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14d
            r2.f2077s = r0     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14d
            short r0 = r2.readShort()     // Catch: java.lang.Throwable -> L14a java.lang.Exception -> L14d
            r4 = 85
            if (r0 != r4) goto L144
            r0 = r6
            goto L146
        L144:
            r0 = r18
        L146:
            r2.close()
            goto L161
        L14a:
            r0 = move-exception
            r5 = r2
            goto L154
        L14d:
            r5 = r2
            goto L15a
        L14f:
            r0 = move-exception
            r5 = 0
            goto L154
        L152:
            r5 = 0
            goto L15a
        L154:
            if (r5 == 0) goto L159
            r5.close()
        L159:
            throw r0
        L15a:
            if (r5 == 0) goto L15f
            r5.close()
        L15f:
            r0 = r18
        L161:
            if (r0 == 0) goto L166
            r0 = 10
            return r0
        L166:
            r0 = r18
        L168:
            byte[] r2 = H1.g.f2116x
            int r4 = r2.length
            if (r0 >= r4) goto L179
            r4 = r3[r0]
            r2 = r2[r0]
            if (r4 == r2) goto L176
            r0 = r18
            goto L17a
        L176:
            int r0 = r0 + 1
            goto L168
        L179:
            r0 = r6
        L17a:
            if (r0 == 0) goto L17f
            r0 = 13
            return r0
        L17f:
            r0 = r18
        L181:
            byte[] r2 = H1.g.f2118z
            int r4 = r2.length
            if (r0 >= r4) goto L192
            r4 = r3[r0]
            r2 = r2[r0]
            if (r4 == r2) goto L18f
        L18c:
            r6 = r18
            goto L1a6
        L18f:
            int r0 = r0 + 1
            goto L181
        L192:
            r0 = r18
        L194:
            byte[] r4 = H1.g.f2090A
            int r5 = r4.length
            if (r0 >= r5) goto L1a6
            int r5 = r2.length
            int r5 = r5 + r0
            int r5 = r5 + r7
            r5 = r3[r5]
            r4 = r4[r0]
            if (r5 == r4) goto L1a3
            goto L18c
        L1a3:
            int r0 = r0 + 1
            goto L194
        L1a6:
            if (r6 == 0) goto L1ab
            r0 = 14
            return r0
        L1ab:
            return r18
        L1ac:
            if (r5 == 0) goto L1b1
            r5.close()
        L1b1:
            throw r0
        L1b2:
            r18 = 0
            int r5 = r5 + 1
            goto L29
        L1b8:
            r0 = 9
            return r0
        L1bb:
            r18 = 0
            int r0 = r0 + 1
            goto L12
        L1c1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.g.f(java.io.BufferedInputStream):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(f fVar) throws Throwable {
        int i;
        int i7;
        j(fVar);
        HashMap[] mapArr = this.f2122d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f2083d);
            fVar2.f2077s = this.f;
            byte[] bArr = f2114v;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f2115w;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i8 = iArr[2];
                int i9 = iArr[0];
                if (i8 <= i9 || (i = iArr[3]) <= (i7 = iArr[1])) {
                    return;
                }
                int i10 = (i8 - i9) + 1;
                int i11 = (i - i7) + 1;
                if (i10 < i11) {
                    int i12 = i10 + i11;
                    i11 = i12 - i11;
                    i10 = i12 - i11;
                }
                c cVarC = c.c(i10, this.f);
                c cVarC2 = c.c(i11, this.f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(b bVar) throws Throwable {
        if (f2105m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f2077s = ByteOrder.BIG_ENDIAN;
        int i = bVar.f2076r;
        bVar.a(f2116x.length);
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            if (z5 && z6) {
                return;
            }
            try {
                int i7 = bVar.readInt();
                int i8 = bVar.readInt();
                int i9 = bVar.f2076r;
                int i10 = i9 + i7 + 4;
                int i11 = i9 - i;
                if (i11 == 16 && i8 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i8 == 1229278788) {
                    return;
                }
                if (i8 == 1700284774 && !z5) {
                    this.f2125h = i11;
                    byte[] bArr = new byte[i7];
                    bVar.readFully(bArr);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i8 >>> 24);
                    crc32.update(i8 >>> 16);
                    crc32.update(i8 >>> 8);
                    crc32.update(i8);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i12) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(0, bArr);
                    x();
                    u(new b(bArr));
                    z5 = true;
                } else if (i8 == 1767135348 && !z6) {
                    byte[] bArr2 = f2117y;
                    if (i7 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i13 = bVar.f2076r - i;
                            int i14 = i7 - length;
                            byte[] bArr4 = new byte[i14];
                            bVar.readFully(bArr4);
                            this.f2127l = new c(i13, bArr4, 1, i14);
                            z6 = true;
                        }
                    }
                }
                bVar.a(i10 - bVar.f2076r);
            } catch (EOFException e7) {
                throw new IOException("Encountered corrupt PNG file.", e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(b bVar) throws Throwable {
        boolean z5 = f2105m;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i7 = ByteBuffer.wrap(bArr2).getInt();
        int i8 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i7];
        bVar.a(i - bVar.f2076r);
        bVar.readFully(bArr4);
        e(new b(bArr4), i, 5);
        bVar.a(i8 - bVar.f2076r);
        bVar.f2077s = ByteOrder.BIG_ENDIAN;
        int i9 = bVar.readInt();
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f2095F.f2084a) {
                short s6 = bVar.readShort();
                short s7 = bVar.readShort();
                c cVarC = c.c(s6, this.f);
                c cVarC2 = c.c(s7, this.f);
                HashMap[] mapArr = this.f2122d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z5) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s6) + ", width: " + ((int) s7));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(f fVar) throws Throwable {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f2121c == 8) {
            HashMap[] mapArr = this.f2122d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f2083d);
                fVar2.f2077s = this.f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(f fVar) throws Throwable {
        if (f2105m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f2122d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f2083d), (int) cVar.f2082c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(b bVar) throws Throwable {
        if (f2105m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f2077s = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f2118z.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = f2090A;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i7 = bVar.readInt();
                int i8 = length + 8;
                if (Arrays.equals(f2091B, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i7];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f2103N;
                    if (Q2.g.N(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i7);
                    }
                    this.f2125h = i8;
                    r(0, bArrCopyOfRange);
                    u(new b(bArrCopyOfRange));
                    return;
                }
                if (i7 % 2 == 1) {
                    i7++;
                }
                length = i8 + i7;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i7);
            } catch (EOFException e7) {
                throw new IOException("Encountered corrupt WebP file.", e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f);
        int iE2 = cVar2.e(this.f);
        if (this.f2121c == 7) {
            iE += this.i;
        }
        if (iE > 0 && iE2 > 0 && this.f2120b == null && this.f2119a == null) {
            bVar.a(iE);
            bVar.readFully(new byte[iE2]);
        }
        if (f2105m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f) <= 512 && cVar2.e(this.f) <= 512;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(f fVar) throws IOException {
        ByteOrder byteOrderQ = q(fVar);
        this.f = byteOrderQ;
        fVar.f2077s = byteOrderQ;
        int unsignedShort = fVar.readUnsignedShort();
        int i = this.f2121c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i7 = fVar.readInt();
        if (i7 < 8) {
            throw new IOException(i.i(i7, "Invalid first Ifd offset: "));
        }
        int i8 = i7 - 8;
        if (i8 > 0) {
            fVar.a(i8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f2122d;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbL = i.l("The size of tag group[", "]: ", i);
            sbL.append(mapArr[i].size());
            Log.d("ExifInterface", sbL.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f) + "'");
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(int i, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(H1.f r30, int r31) throws java.io.IOException {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            int r3 = r1.f2076r
            int r4 = r1.f2079u
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r5 = r0.f2123e
            r5.add(r3)
            short r3 = r1.readShort()
            java.lang.String r6 = "ExifInterface"
            boolean r7 = H1.g.f2105m
            if (r7 == 0) goto L2e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "numberOfDirectoryEntry: "
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
        L2e:
            if (r3 > 0) goto L32
            goto L3ab
        L32:
            r9 = 0
        L33:
            java.util.HashMap[] r12 = r0.f2122d
            if (r9 >= r3) goto L33a
            int r14 = r1.readUnsignedShort()
            int r15 = r1.readUnsignedShort()
            int r8 = r1.readInt()
            r16 = 0
            int r10 = r1.f2076r
            long r10 = (long) r10
            r18 = 4
            long r10 = r10 + r18
            java.util.HashMap[] r20 = H1.g.f2098I
            r13 = r20[r2]
            r22 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            java.lang.Object r3 = r13.get(r3)
            H1.d r3 = (H1.d) r3
            if (r7 == 0) goto L8b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            r23 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r24 = r9
            if (r3 == 0) goto L71
            java.lang.String r9 = r3.f2085b
        L6e:
            r25 = r12
            goto L73
        L71:
            r9 = 0
            goto L6e
        L73:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r26 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r5 = new java.lang.Object[]{r13, r7, r9, r12, r5}
            java.lang.String r7 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r5 = java.lang.String.format(r7, r5)
            android.util.Log.d(r6, r5)
            goto L93
        L8b:
            r26 = r5
            r23 = r7
            r24 = r9
            r25 = r12
        L93:
            r9 = 3
            r12 = 7
            if (r3 != 0) goto Lae
            if (r23 == 0) goto Laa
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r13.<init>(r7)
            r13.append(r14)
            java.lang.String r7 = r13.toString()
            android.util.Log.d(r6, r7)
        Laa:
            r27 = r10
            goto L14a
        Lae:
            if (r15 <= 0) goto Lb5
            int[] r7 = H1.g.f2093D
            int r13 = r7.length
            if (r15 < r13) goto Lb9
        Lb5:
            r27 = r10
            goto L137
        Lb9:
            int r13 = r3.f2086c
            if (r13 == r12) goto Ld2
            if (r15 != r12) goto Lc0
            goto Ld2
        Lc0:
            if (r13 == r15) goto Ld2
            int r12 = r3.f2087d
            if (r12 != r15) goto Lc7
            goto Ld2
        Lc7:
            r5 = 4
            if (r13 == r5) goto Ld0
            if (r12 != r5) goto Lcd
            goto Ld0
        Lcd:
            r5 = 9
            goto Ld4
        Ld0:
            if (r15 != r9) goto Lcd
        Ld2:
            r5 = 7
            goto L10a
        Ld4:
            if (r13 == r5) goto Ld8
            if (r12 != r5) goto Ldd
        Ld8:
            r5 = 8
            if (r15 != r5) goto Ldd
            goto Ld2
        Ldd:
            r5 = 12
            if (r13 == r5) goto Le3
            if (r12 != r5) goto Le8
        Le3:
            r5 = 11
            if (r15 != r5) goto Le8
            goto Ld2
        Le8:
            if (r23 == 0) goto Laa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Skip the tag entry since data format ("
            r5.<init>(r7)
            java.lang.String[] r7 = H1.g.f2092C
            r7 = r7[r15]
            r5.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r5.append(r7)
            java.lang.String r7 = r3.f2085b
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
            goto Laa
        L10a:
            if (r15 != r5) goto L10d
            r15 = r13
        L10d:
            long r12 = (long) r8
            r5 = r7[r15]
            r27 = r10
            long r9 = (long) r5
            long r12 = r12 * r9
            int r5 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r5 < 0) goto L122
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r5 <= 0) goto L120
            goto L122
        L120:
            r5 = 1
            goto L14d
        L122:
            if (r23 == 0) goto L135
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r5.<init>(r9)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
        L135:
            r5 = 0
            goto L14d
        L137:
            if (r23 == 0) goto L14a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Skip the tag entry since data format is invalid: "
            r5.<init>(r9)
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r6, r5)
        L14a:
            r12 = r16
            goto L135
        L14d:
            if (r5 != 0) goto L158
            r10 = r27
            r1.b(r10)
            r10 = r26
            goto L32e
        L158:
            r10 = r27
            int r5 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            java.lang.String r9 = "Compression"
            if (r5 <= 0) goto L1d8
            int r5 = r1.readInt()
            if (r23 == 0) goto L17a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r19 = r14
            java.lang.String r14 = "seek to data offset: "
            r7.<init>(r14)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r6, r7)
            goto L17c
        L17a:
            r19 = r14
        L17c:
            int r7 = r0.f2121c
            r14 = 7
            if (r7 != r14) goto L18d
            java.lang.String r7 = "MakerNote"
            java.lang.String r14 = r3.f2085b
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L191
            r0.i = r5
        L18d:
            r14 = r3
            r27 = r10
            goto L1d3
        L191:
            r7 = 6
            if (r2 != r7) goto L18d
            java.lang.String r14 = "ThumbnailImage"
            java.lang.String r7 = r3.f2085b
            boolean r7 = r14.equals(r7)
            if (r7 == 0) goto L18d
            r0.j = r5
            r0.f2126k = r8
            java.nio.ByteOrder r7 = r0.f
            r14 = 6
            H1.c r7 = H1.c.c(r14, r7)
            int r14 = r0.j
            r27 = r10
            long r10 = (long) r14
            java.nio.ByteOrder r14 = r0.f
            H1.c r10 = H1.c.a(r10, r14)
            int r11 = r0.f2126k
            r14 = r3
            long r2 = (long) r11
            java.nio.ByteOrder r11 = r0.f
            H1.c r2 = H1.c.a(r2, r11)
            r21 = 4
            r3 = r25[r21]
            r3.put(r9, r7)
            r3 = r25[r21]
            java.lang.String r7 = "JPEGInterchangeFormat"
            r3.put(r7, r10)
            r3 = r25[r21]
            java.lang.String r7 = "JPEGInterchangeFormatLength"
            r3.put(r7, r2)
        L1d3:
            long r2 = (long) r5
            r1.b(r2)
            goto L1dd
        L1d8:
            r27 = r10
            r19 = r14
            r14 = r3
        L1dd:
            java.util.HashMap r2 = H1.g.f2101L
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r23 == 0) goto L204
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "nextIfdType: "
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r5 = " byteCount: "
            r3.append(r5)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r6, r3)
        L204:
            if (r2 == 0) goto L2c0
            r7 = 3
            if (r15 == r7) goto L232
            r5 = 4
            if (r15 == r5) goto L226
            r5 = 8
            if (r15 == r5) goto L221
            r5 = 9
            if (r15 == r5) goto L21b
            r3 = 13
            if (r15 == r3) goto L21b
            r7 = -1
            goto L237
        L21b:
            int r3 = r1.readInt()
        L21f:
            long r7 = (long) r3
            goto L237
        L221:
            short r3 = r1.readShort()
            goto L21f
        L226:
            int r3 = r1.readInt()
            long r7 = (long) r3
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            goto L237
        L232:
            int r3 = r1.readUnsignedShort()
            goto L21f
        L237:
            if (r23 == 0) goto L24c
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.String r5 = r14.f2085b
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            java.lang.String r5 = "Offset: %d, tagName: %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)
            android.util.Log.d(r6, r3)
        L24c:
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            java.lang.String r5 = ")"
            r9 = -1
            if (r3 <= 0) goto L25b
            if (r4 == r9) goto L25e
            long r10 = (long) r4
            int r3 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r3 >= 0) goto L25b
            goto L25e
        L25b:
            r10 = r26
            goto L297
        L25e:
            int r3 = (int) r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10 = r26
            boolean r3 = r10.contains(r3)
            if (r3 != 0) goto L278
            r1.b(r7)
            int r2 = r2.intValue()
            r0.s(r1, r2)
        L275:
            r2 = r27
            goto L2bc
        L278:
            if (r23 == 0) goto L275
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r9 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.<init>(r9)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r7)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r6, r2)
            goto L275
        L297:
            if (r23 == 0) goto L275
            java.lang.String r2 = "Skip jump into the IFD since its offset is invalid: "
            java.lang.String r2 = C0.S.k(r2, r7)
            if (r4 == r9) goto L2b8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " (total length: "
            r3.append(r2)
            r3.append(r4)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
        L2b8:
            android.util.Log.d(r6, r2)
            goto L275
        L2bc:
            r1.b(r2)
            goto L32e
        L2c0:
            r10 = r26
            r2 = r27
            int r5 = r1.f2076r
            int r11 = r0.f2125h
            int r5 = r5 + r11
            int r11 = (int) r12
            byte[] r11 = new byte[r11]
            r1.readFully(r11)
            H1.c r16 = new H1.c
            long r12 = (long) r5
            r21 = r8
            r19 = r11
            r17 = r12
            r20 = r15
            r16.<init>(r17, r19, r20, r21)
            r5 = r16
            r8 = r25[r31]
            java.lang.String r11 = r14.f2085b
            r8.put(r11, r5)
            java.lang.String r8 = "DNGVersion"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L2f1
            r7 = 3
            r0.f2121c = r7
        L2f1:
            java.lang.String r7 = "Make"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L301
            java.lang.String r7 = "Model"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L30f
        L301:
            java.nio.ByteOrder r7 = r0.f
            java.lang.String r7 = r5.f(r7)
            java.lang.String r8 = "PENTAX"
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L320
        L30f:
            boolean r7 = r9.equals(r11)
            if (r7 == 0) goto L324
            java.nio.ByteOrder r7 = r0.f
            int r5 = r5.e(r7)
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L324
        L320:
            r5 = 8
            r0.f2121c = r5
        L324:
            int r5 = r1.f2076r
            long r7 = (long) r5
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 == 0) goto L32e
            r1.b(r2)
        L32e:
            int r9 = r24 + 1
            short r9 = (short) r9
            r2 = r31
            r5 = r10
            r3 = r22
            r7 = r23
            goto L33
        L33a:
            r10 = r5
            r23 = r7
            r25 = r12
            r16 = 0
            int r2 = r1.readInt()
            if (r23 == 0) goto L358
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            android.util.Log.d(r6, r3)
        L358:
            long r3 = (long) r2
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 <= 0) goto L398
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r5 = r10.contains(r5)
            if (r5 != 0) goto L384
            r1.b(r3)
            r5 = 4
            r2 = r25[r5]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L377
            r0.s(r1, r5)
            return
        L377:
            r2 = 5
            r3 = r25[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L3ab
            r0.s(r1, r2)
            return
        L384:
            if (r23 == 0) goto L3ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r6, r1)
            return
        L398:
            if (r23 == 0) goto L3ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r6, r1)
        L3ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.g.s(H1.f, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(String str, String str2, int i) {
        HashMap[] mapArr = this.f2122d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (c) map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(b bVar) throws Throwable {
        c cVar;
        int iE;
        HashMap map = this.f2122d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f);
            int[] iArr2 = f2106n;
            if (Arrays.equals(iArr2, iArr) || (this.f2121c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f)) == 1 && Arrays.equals(iArr, f2107o)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrR = Q2.g.r(cVar4.g(this.f));
                long[] jArrR2 = Q2.g.r(cVar5.g(this.f));
                if (jArrR == null || jArrR.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrR2 == null || jArrR2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrR.length != jArrR2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j7 : jArrR2) {
                    j += j7;
                }
                byte[] bArr = new byte[(int) j];
                this.f2124g = true;
                int i = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < jArrR.length; i8++) {
                    int i9 = (int) jArrR[i8];
                    int i10 = (int) jArrR2[i8];
                    if (i8 < jArrR.length - 1 && i9 + i10 != jArrR[i8 + 1]) {
                        this.f2124g = false;
                    }
                    int i11 = i9 - i;
                    if (i11 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.a(i11);
                        int i12 = i + i11;
                        byte[] bArr2 = new byte[i10];
                        try {
                            bVar.readFully(bArr2);
                            i = i12 + i10;
                            System.arraycopy(bArr2, 0, bArr, i7, i10);
                            i7 += i10;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i10 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i11 + " bytes.");
                        return;
                    }
                }
                if (this.f2124g) {
                    long j8 = jArrR[0];
                    return;
                }
                return;
            }
        }
        if (f2105m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(int i, int i7) throws Throwable {
        HashMap[] mapArr = this.f2122d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z5 = f2105m;
        if (zIsEmpty || mapArr[i7].isEmpty()) {
            if (z5) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i].get("ImageLength");
        c cVar2 = (c) mapArr[i].get("ImageWidth");
        c cVar3 = (c) mapArr[i7].get("ImageLength");
        c cVar4 = (c) mapArr[i7].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z5) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z5) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f);
        int iE2 = cVar2.e(this.f);
        int iE3 = cVar3.e(this.f);
        int iE4 = cVar4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i7];
        mapArr[i7] = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(f fVar, int i) throws Throwable {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f2122d;
        c cVar = (c) mapArr[i].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f2080a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f);
                cVarC2 = c.b(eVarArr[1], this.f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f);
                cVarC2 = c.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", cVarC);
            mapArr[i].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f);
            int iE2 = cVar4.e(this.f);
            int iE3 = cVar5.e(this.f);
            int iE4 = cVar3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f);
            c cVarC4 = c.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", cVarC3);
            mapArr[i].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i].get("ImageLength");
        c cVar7 = (c) mapArr[i].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f);
            int iE6 = cVar8.e(this.f);
            fVar.b(iE5);
            byte[] bArr = new byte[iE6];
            fVar.readFully(bArr);
            e(new b(bArr), iE5, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x() throws Throwable {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f2122d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", "Orientation", 0);
        t("ThumbnailImageLength", "ImageLength", 0);
        t("ThumbnailImageWidth", "ImageWidth", 0);
        t("ThumbnailOrientation", "Orientation", 5);
        t("ThumbnailImageLength", "ImageLength", 5);
        t("ThumbnailImageWidth", "ImageWidth", 5);
        t("Orientation", "ThumbnailOrientation", 4);
        t("ImageLength", "ThumbnailImageLength", 4);
        t("ImageWidth", "ThumbnailImageWidth", 4);
    }
}
