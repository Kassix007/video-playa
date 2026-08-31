.class final Landroidx/work/ListenableFutureKt$launchFuture$1$2;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/ListenableFutureKt;->launchFuture(Lq5/h;LM5/x;LB5/e;)LI4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls5/i;",
        "LB5/e;"
    }
.end annotation

.annotation runtime Ls5/e;
    c = "androidx.work.ListenableFutureKt$launchFuture$1$2"
    f = "ListenableFuture.kt"
    l = {
        0x2a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $block:LB5/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5/e;"
        }
    .end annotation
.end field

.field final synthetic $completer:Landroidx/concurrent/futures/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/k;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(LB5/e;Landroidx/concurrent/futures/k;Lq5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5/e;",
            "Landroidx/concurrent/futures/k;",
            "Lq5/c<",
            "-",
            "Landroidx/work/ListenableFutureKt$launchFuture$1$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->$block:LB5/e;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->$completer:Landroidx/concurrent/futures/k;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq5/c<",
            "*>;)",
            "Lq5/c<",
            "Lm5/y;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->$block:LB5/e;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->$completer:Landroidx/concurrent/futures/k;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Landroidx/work/ListenableFutureKt$launchFuture$1$2;-><init>(LB5/e;Landroidx/concurrent/futures/k;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(LM5/w;Lq5/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LM5/w;",
            "Lq5/c<",
            "-",
            "Lm5/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    move-result-object p1

    check-cast p1, Landroidx/work/ListenableFutureKt$launchFuture$1$2;

    sget-object p2, Lm5/y;->a:Lm5/y;

    invoke-virtual {p1, p2}, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LM5/w;

    check-cast p2, Lq5/c;

    invoke-virtual {p0, p1, p2}, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->invoke(LM5/w;Lq5/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->label:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LM5/w;

    .line 28
    .line 29
    :try_start_1
    iget-object v0, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->$block:LB5/e;

    .line 30
    .line 31
    iput v1, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->label:I

    .line 32
    .line 33
    invoke-interface {v0, p1, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 38
    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    :try_start_2
    iget-object v0, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->$completer:Landroidx/concurrent/futures/k;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/k;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :goto_1
    iget-object v0, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->$completer:Landroidx/concurrent/futures/k;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/k;->b(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catch_0
    iget-object p1, p0, Landroidx/work/ListenableFutureKt$launchFuture$1$2;->$completer:Landroidx/concurrent/futures/k;

    .line 55
    .line 56
    iput-boolean v1, p1, Landroidx/concurrent/futures/k;->d:Z

    .line 57
    .line 58
    iget-object v0, p1, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/n;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, v0, Landroidx/concurrent/futures/n;->r:Landroidx/concurrent/futures/m;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/j;->cancel(Z)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    const/4 v0, 0x0

    .line 71
    iput-object v0, p1, Landroidx/concurrent/futures/k;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v0, p1, Landroidx/concurrent/futures/k;->b:Landroidx/concurrent/futures/n;

    .line 74
    .line 75
    iput-object v0, p1, Landroidx/concurrent/futures/k;->c:Landroidx/concurrent/futures/p;

    .line 76
    .line 77
    :cond_3
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 78
    .line 79
    return-object p1
.end method
