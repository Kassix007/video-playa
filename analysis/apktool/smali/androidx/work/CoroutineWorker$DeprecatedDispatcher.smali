.class final Landroidx/work/CoroutineWorker$DeprecatedDispatcher;
.super LM5/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/CoroutineWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DeprecatedDispatcher"
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/work/CoroutineWorker$DeprecatedDispatcher;

.field private static final dispatcher:LM5/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->INSTANCE:Landroidx/work/CoroutineWorker$DeprecatedDispatcher;

    .line 7
    .line 8
    sget-object v0, LM5/H;->a:LT5/e;

    .line 9
    .line 10
    sput-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->dispatcher:LM5/s;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LM5/s;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public dispatch(Lq5/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "block"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->dispatcher:LM5/s;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, LM5/s;->dispatch(Lq5/h;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final getDispatcher()LM5/s;
    .locals 1

    .line 1
    sget-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->dispatcher:LM5/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public isDispatchNeeded(Lq5/h;)Z
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Landroidx/work/CoroutineWorker$DeprecatedDispatcher;->dispatcher:LM5/s;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LM5/s;->isDispatchNeeded(Lq5/h;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method
