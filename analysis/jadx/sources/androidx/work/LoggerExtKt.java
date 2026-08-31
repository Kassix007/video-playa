package androidx.work;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class LoggerExtKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void logd(String tag, B5.a block) {
        m.e(tag, "tag");
        m.e(block, "block");
        Logger.get().debug(tag, (String) block.invoke());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void loge(String tag, B5.a block) {
        m.e(tag, "tag");
        m.e(block, "block");
        Logger.get().error(tag, (String) block.invoke());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void logi(String tag, B5.a block) {
        m.e(tag, "tag");
        m.e(block, "block");
        Logger.get().info(tag, (String) block.invoke());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final void logd(String tag, Throwable t6, B5.a block) {
        m.e(tag, "tag");
        m.e(t6, "t");
        m.e(block, "block");
        Logger.get().debug(tag, (String) block.invoke(), t6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final void loge(String tag, Throwable t6, B5.a block) {
        m.e(tag, "tag");
        m.e(t6, "t");
        m.e(block, "block");
        Logger.get().error(tag, (String) block.invoke(), t6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final void logi(String tag, Throwable t6, B5.a block) {
        m.e(tag, "tag");
        m.e(t6, "t");
        m.e(block, "block");
        Logger.get().info(tag, (String) block.invoke(), t6);
    }
}
