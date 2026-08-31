.class public final Lw/i;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lw/j;

.field public final synthetic t:Lw/j1;

.field public final synthetic u:Lw/c;


# direct methods
.method public constructor <init>(Lw/j;Lw/j1;Lw/c;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/i;->s:Lw/j;

    .line 2
    .line 3
    iput-object p2, p0, Lw/i;->t:Lw/j1;

    .line 4
    .line 5
    iput-object p3, p0, Lw/i;->u:Lw/c;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 4

    .line 1
    new-instance v0, Lw/i;

    .line 2
    .line 3
    iget-object v1, p0, Lw/i;->t:Lw/j1;

    .line 4
    .line 5
    iget-object v2, p0, Lw/i;->u:Lw/c;

    .line 6
    .line 7
    iget-object v3, p0, Lw/i;->s:Lw/j;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, Lw/i;-><init>(Lw/j;Lw/j1;Lw/c;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lw/i;->r:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, Lw/i;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/i;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v2, p0, Lw/i;->s:Lw/j;

    .line 2
    .line 3
    iget-object v6, v2, Lw/j;->I:LE/k;

    .line 4
    .line 5
    iget v0, p0, Lw/i;->q:I

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    const/4 v8, 0x0

    .line 9
    const/4 v9, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v7, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    goto :goto_2

    .line 21
    :catch_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    move-object v9, p1

    .line 24
    goto :goto_1

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
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lw/i;->r:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, LM5/w;

    .line 39
    .line 40
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, LM5/y;->n(Lq5/h;)LM5/b0;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :try_start_1
    iput-boolean v7, v2, Lw/j;->N:Z

    .line 49
    .line 50
    iget-object p1, v2, Lw/j;->F:Lw/H0;

    .line 51
    .line 52
    sget-object v10, Lv/W;->q:Lv/W;

    .line 53
    .line 54
    new-instance v0, Lw/h;

    .line 55
    .line 56
    iget-object v1, p0, Lw/i;->t:Lw/j1;

    .line 57
    .line 58
    iget-object v3, p0, Lw/i;->u:Lw/c;

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-direct/range {v0 .. v5}, Lw/h;-><init>(Lw/j1;Lw/j;Lw/c;LM5/b0;Lq5/c;)V

    .line 62
    .line 63
    .line 64
    iput v7, p0, Lw/i;->q:I

    .line 65
    .line 66
    invoke-virtual {p1, v10, v0, p0}, Lw/H0;->f(Lv/W;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 71
    .line 72
    if-ne p1, v0, :cond_2

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    :goto_0
    :try_start_2
    invoke-virtual {v6}, LE/k;->b()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    .line 77
    .line 78
    iput-boolean v8, v2, Lw/j;->N:Z

    .line 79
    .line 80
    invoke-virtual {v6, v9}, LE/k;->a(Ljava/util/concurrent/CancellationException;)V

    .line 81
    .line 82
    .line 83
    iput-boolean v8, v2, Lw/j;->K:Z

    .line 84
    .line 85
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 86
    .line 87
    return-object p1

    .line 88
    :goto_1
    :try_start_3
    throw v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    :goto_2
    iput-boolean v8, v2, Lw/j;->N:Z

    .line 90
    .line 91
    invoke-virtual {v6, v9}, LE/k;->a(Ljava/util/concurrent/CancellationException;)V

    .line 92
    .line 93
    .line 94
    iput-boolean v8, v2, Lw/j;->K:Z

    .line 95
    .line 96
    throw p1
.end method
