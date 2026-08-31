.class public final LM5/Z;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:LB5/a;


# direct methods
.method public constructor <init>(LB5/a;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM5/Z;->r:LB5/a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance v0, LM5/Z;

    .line 2
    .line 3
    iget-object v1, p0, LM5/Z;->r:LB5/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LM5/Z;-><init>(LB5/a;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LM5/Z;->q:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LM5/Z;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LM5/Z;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LM5/Z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LM5/Z;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LM5/w;

    .line 7
    .line 8
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, LM5/Z;->r:LB5/a;

    .line 13
    .line 14
    :try_start_0
    new-instance v1, LM5/t0;

    .line 15
    .line 16
    invoke-direct {v1}, LM5/t0;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, LM5/y;->n(Lq5/h;)LM5/b0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-static {p1, v2, v1}, LM5/y;->q(LM5/b0;ZLM5/e0;)LM5/J;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v1, LM5/t0;->v:LM5/J;

    .line 29
    .line 30
    sget-object p1, LM5/t0;->w:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x2

    .line 39
    if-eq v2, p1, :cond_3

    .line 40
    .line 41
    const/4 p1, 0x3

    .line 42
    if-ne v2, p1, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {v2}, LM5/t0;->n(I)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    throw p1

    .line 50
    :cond_2
    const/4 v3, 0x0

    .line 51
    invoke-virtual {p1, v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 52
    .line 53
    .line 54
    move-result v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    if-eqz v2, :cond_0

    .line 56
    .line 57
    :cond_3
    :goto_0
    :try_start_1
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    :try_start_2
    invoke-virtual {v1}, LM5/t0;->m()V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :catch_0
    move-exception p1

    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    invoke-virtual {v1}, LM5/t0;->m()V

    .line 69
    .line 70
    .line 71
    throw p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 72
    :goto_1
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 73
    .line 74
    const-string v1, "Blocking call was interrupted due to parent cancellation"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    throw p1
.end method
