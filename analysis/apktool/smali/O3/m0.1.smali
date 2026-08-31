.class public final LO3/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:LO3/p0;


# direct methods
.method public constructor <init>(LO3/p0;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO3/m0;->b:LO3/p0;

    .line 5
    .line 6
    iput-object p2, p0, LO3/m0;->a:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final declared-synchronized uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p1, p0, LO3/m0;->b:LO3/p0;

    .line 3
    .line 4
    iget-object p1, p1, LO3/D0;->r:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LO3/t0;

    .line 7
    .line 8
    iget-object p1, p1, LO3/t0;->v:LO3/X;

    .line 9
    .line 10
    invoke-static {p1}, LO3/t0;->l(LO3/E0;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, LO3/X;->w:LO3/V;

    .line 14
    .line 15
    iget-object v0, p0, LO3/m0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, p2, v0}, LO3/V;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
.end method
