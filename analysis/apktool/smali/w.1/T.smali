.class public final Lw/T;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LO5/i;


# direct methods
.method public constructor <init>(LO5/i;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/T;->s:LO5/i;

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
    new-instance v0, Lw/T;

    .line 2
    .line 3
    iget-object v1, p0, Lw/T;->s:LO5/i;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lw/T;-><init>(LO5/i;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lw/T;->r:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lw/T;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/T;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/T;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lw/T;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lw/T;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LM5/b0;

    .line 12
    .line 13
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lw/T;->r:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LM5/w;

    .line 33
    .line 34
    new-instance v0, Lw/S;

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    invoke-direct {v0, v3, v2}, Ls5/i;-><init>(ILq5/c;)V

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x3

    .line 41
    invoke-static {p1, v2, v2, v0, v3}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :try_start_1
    iget-object p1, p0, Lw/T;->s:LO5/i;

    .line 46
    .line 47
    iput-object v0, p0, Lw/T;->r:Ljava/lang/Object;

    .line 48
    .line 49
    iput v1, p0, Lw/T;->q:I

    .line 50
    .line 51
    invoke-interface {p1, p0}, LO5/v;->h(Ls5/i;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 56
    .line 57
    if-ne p1, v1, :cond_2

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    :goto_0
    :try_start_2
    check-cast p1, Lw/Q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    invoke-interface {v0, v2}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :goto_1
    invoke-interface {v0, v2}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 67
    .line 68
    .line 69
    throw p1
.end method
