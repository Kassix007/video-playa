package com.google.firebase.logger;

import B5.c;
import C0.S;
import C2.e;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class Logger {
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, Logger> loggers = new ConcurrentHashMap<>();
    private boolean enabled;
    private Level minLevel;
    private final String tag;

    public static final class AndroidLogger extends Logger {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(String tag, boolean z5, Level minLevel) {
            super(tag, z5, minLevel, null);
            m.e(tag, "tag");
            m.e(minLevel, "minLevel");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable th) {
            m.e(level, "level");
            m.e(format, "format");
            m.e(args, "args");
            if (args.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                String tag = getTag();
                return th != null ? Log.v(tag, format, th) : Log.v(tag, format);
            }
            if (i == 2) {
                String tag2 = getTag();
                return th != null ? Log.d(tag2, format, th) : Log.d(tag2, format);
            }
            if (i == 3) {
                String tag3 = getTag();
                return th != null ? Log.i(tag3, format, th) : Log.i(tag3, format);
            }
            if (i == 4) {
                String tag4 = getTag();
                return th != null ? Log.w(tag4, format, th) : Log.w(tag4, format);
            }
            if (i != 5) {
                throw new e();
            }
            String tag5 = getTag();
            return th != null ? Log.e(tag5, format, th) : Log.e(tag5, format);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.google.firebase.logger.Logger.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z5, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z5 = true;
            }
            if ((i & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z5, level);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z5, Level level, int i, Object obj) {
            if ((i & 2) != 0) {
                z5 = true;
            }
            if ((i & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z5, level);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Logger getLogger(String tag, boolean z5, Level minLevel) {
            Object objPutIfAbsent;
            m.e(tag, "tag");
            m.e(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.loggers;
            Object androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new AndroidLogger(tag, z5, minLevel)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            return (Logger) androidLogger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FakeLogger setupFakeLogger(String tag, boolean z5, Level minLevel) {
            m.e(tag, "tag");
            m.e(minLevel, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(tag, z5, minLevel);
            Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static final class FakeLogger extends Logger {
        private final List<String> record;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(String tag, boolean z5, Level minLevel) {
            super(tag, z5, minLevel, null);
            m.e(tag, "tag");
            m.e(minLevel, "minLevel");
            this.record = new ArrayList();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final String toLogMessage(Level level, String str, Object[] objArr, Throwable th) {
            if (objArr.length != 0) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            if (th != null) {
                String str2 = level + ' ' + str + ' ' + Log.getStackTraceString(th);
                if (str2 != null) {
                    return str2;
                }
            }
            return level + ' ' + str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void clearLogMessages() {
            this.record.clear();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean hasLogMessage(String message) {
            m.e(message, "message");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (J5.m.K0((String) it.next(), message)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean hasLogMessageThat(c predicate) {
            m.e(predicate, "predicate");
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.google.firebase.logger.Logger
        public int log(Level level, String format, Object[] args, Throwable th) {
            m.e(level, "level");
            m.e(format, "format");
            m.e(args, "args");
            String logMessage = toLogMessage(level, format, args, th);
            System.out.println((Object) S.w("Log: ", logMessage));
            this.record.add(logMessage);
            return logMessage.length();
        }
    }

    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        Level(int i) {
            this.priority = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getPriority$com_google_firebase_firebase_common() {
            return this.priority;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 boolean), (r3v0 com.google.firebase.logger.Logger$Level) A[MD:(java.lang.String, boolean, com.google.firebase.logger.Logger$Level):void (m)] (LINE:1) call: com.google.firebase.logger.Logger.<init>(java.lang.String, boolean, com.google.firebase.logger.Logger$Level):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Logger(String str, boolean z5, Level level, g gVar) {
        this(str, z5, level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    public static final Logger getLogger(String str, boolean z5, Level level) {
        return Companion.getLogger(str, z5, level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final int logIfAble(Level level, String str, Object[] objArr, Throwable th) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority$com_google_firebase_firebase_common() <= level.getPriority$com_google_firebase_firebase_common() || Log.isLoggable(this.tag, level.getPriority$com_google_firebase_firebase_common())) {
            return log(level, str, objArr, th);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int logIfAble$default(Logger logger, Level level, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    public static final FakeLogger setupFakeLogger(String str, boolean z5, Level level) {
        return Companion.setupFakeLogger(str, z5, level);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int debug(String msg) {
        m.e(msg, "msg");
        return debug$default(this, msg, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int error(String msg) {
        m.e(msg, "msg");
        return error$default(this, msg, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Level getMinLevel() {
        return this.minLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int info(String msg) {
        m.e(msg, "msg");
        return info$default(this, msg, null, 2, null);
    }

    public abstract int log(Level level, String str, Object[] objArr, Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setEnabled(boolean z5) {
        this.enabled = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMinLevel(Level level) {
        m.e(level, "<set-?>");
        this.minLevel = level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int verbose(String msg) {
        m.e(msg, "msg");
        return verbose$default(this, msg, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int warn(String msg) {
        m.e(msg, "msg");
        return warn$default(this, msg, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private Logger(String str, boolean z5, Level level) {
        this.tag = str;
        this.enabled = z5;
        this.minLevel = level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final int debug(String format, Object... args) {
        m.e(format, "format");
        m.e(args, "args");
        return debug$default(this, format, args, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final int error(String format, Object... args) {
        m.e(format, "format");
        m.e(args, "args");
        return error$default(this, format, args, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final int info(String format, Object... args) {
        m.e(format, "format");
        m.e(args, "args");
        return info$default(this, format, args, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final int verbose(String format, Object... args) {
        m.e(format, "format");
        m.e(args, "args");
        return verbose$default(this, format, args, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final int warn(String format, Object... args) {
        m.e(format, "format");
        m.e(args, "args");
        return warn$default(this, format, args, null, 4, null);
    }

    public final int debug(String format, Object[] args, Throwable th) {
        m.e(format, "format");
        m.e(args, "args");
        return logIfAble(Level.DEBUG, format, args, th);
    }

    public final int error(String format, Object[] args, Throwable th) {
        m.e(format, "format");
        m.e(args, "args");
        return logIfAble(Level.ERROR, format, args, th);
    }

    public final int info(String format, Object[] args, Throwable th) {
        m.e(format, "format");
        m.e(args, "args");
        return logIfAble(Level.INFO, format, args, th);
    }

    public final int verbose(String format, Object[] args, Throwable th) {
        m.e(format, "format");
        m.e(args, "args");
        return logIfAble(Level.VERBOSE, format, args, th);
    }

    public final int warn(String format, Object[] args, Throwable th) {
        m.e(format, "format");
        m.e(args, "args");
        return logIfAble(Level.WARN, format, args, th);
    }

    public final int debug(String msg, Throwable th) {
        m.e(msg, "msg");
        return logIfAble$default(this, Level.DEBUG, msg, null, th, 4, null);
    }

    public final int error(String msg, Throwable th) {
        m.e(msg, "msg");
        return logIfAble$default(this, Level.ERROR, msg, null, th, 4, null);
    }

    public final int info(String msg, Throwable th) {
        m.e(msg, "msg");
        return logIfAble$default(this, Level.INFO, msg, null, th, 4, null);
    }

    public final int verbose(String msg, Throwable th) {
        m.e(msg, "msg");
        return logIfAble$default(this, Level.VERBOSE, msg, null, th, 4, null);
    }

    public final int warn(String msg, Throwable th) {
        m.e(msg, "msg");
        return logIfAble$default(this, Level.WARN, msg, null, th, 4, null);
    }
}
