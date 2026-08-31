.class public final Landroidx/room/c;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:LO5/b;

.field public r:I

.field public final synthetic s:Landroidx/room/w;

.field public final synthetic t:Landroidx/room/d;

.field public final synthetic u:LO5/e;

.field public final synthetic v:Ljava/util/concurrent/Callable;

.field public final synthetic w:LO5/e;


# direct methods
.method public constructor <init>(Landroidx/room/w;Landroidx/room/d;LO5/e;Ljava/util/concurrent/Callable;LO5/e;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/room/c;->s:Landroidx/room/w;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/room/c;->t:Landroidx/room/d;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/room/c;->u:LO5/e;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/room/c;->v:Ljava/util/concurrent/Callable;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/room/c;->w:LO5/e;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ls5/i;-><init>(ILq5/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 7

    .line 1
    new-instance v0, Landroidx/room/c;

    .line 2
    .line 3
    iget-object v4, p0, Landroidx/room/c;->v:Ljava/util/concurrent/Callable;

    .line 4
    .line 5
    iget-object v5, p0, Landroidx/room/c;->w:LO5/e;

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/room/c;->s:Landroidx/room/w;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/room/c;->t:Landroidx/room/d;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/room/c;->u:LO5/e;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Landroidx/room/c;-><init>(Landroidx/room/w;Landroidx/room/d;LO5/e;Ljava/util/concurrent/Callable;LO5/e;Lq5/c;)V

    .line 15
    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Landroidx/room/c;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/room/c;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroidx/room/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Landroidx/room/c;->r:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Landroidx/room/c;->t:Landroidx/room/d;

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/room/c;->s:Landroidx/room/w;

    .line 8
    .line 9
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v2, :cond_1

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/room/c;->q:LO5/b;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_3

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-object v0, p0, Landroidx/room/c;->q:LO5/b;

    .line 34
    .line 35
    :try_start_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, v3}, Landroidx/room/q;->a(Landroidx/room/n;)V

    .line 47
    .line 48
    .line 49
    :try_start_2
    iget-object p1, p0, Landroidx/room/c;->u:LO5/e;

    .line 50
    .line 51
    new-instance v0, LO5/b;

    .line 52
    .line 53
    invoke-direct {v0, p1}, LO5/b;-><init>(LO5/e;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_0
    iput-object v0, p0, Landroidx/room/c;->q:LO5/b;

    .line 57
    .line 58
    iput v2, p0, Landroidx/room/c;->r:I

    .line 59
    .line 60
    invoke-virtual {v0, p0}, LO5/b;->b(Ls5/c;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v5, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    invoke-virtual {v0}, LO5/b;->c()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Landroidx/room/c;->v:Ljava/util/concurrent/Callable;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object v6, p0, Landroidx/room/c;->w:LO5/e;

    .line 85
    .line 86
    iput-object v0, p0, Landroidx/room/c;->q:LO5/b;

    .line 87
    .line 88
    iput v1, p0, Landroidx/room/c;->r:I

    .line 89
    .line 90
    invoke-interface {v6, p1, p0}, LO5/w;->k(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    if-ne p1, v5, :cond_3

    .line 95
    .line 96
    :goto_2
    return-object v5

    .line 97
    :cond_5
    invoke-virtual {v4}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, v3}, Landroidx/room/q;->d(Landroidx/room/n;)V

    .line 102
    .line 103
    .line 104
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 105
    .line 106
    return-object p1

    .line 107
    :goto_3
    invoke-virtual {v4}, Landroidx/room/w;->getInvalidationTracker()Landroidx/room/q;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0, v3}, Landroidx/room/q;->d(Landroidx/room/n;)V

    .line 112
    .line 113
    .line 114
    throw p1
.end method
