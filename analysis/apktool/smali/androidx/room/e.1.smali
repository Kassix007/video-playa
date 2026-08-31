.class public final Landroidx/room/e;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Z

.field public final synthetic t:Landroidx/room/w;

.field public final synthetic u:LP5/i;

.field public final synthetic v:[Ljava/lang/String;

.field public final synthetic w:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(ZLandroidx/room/w;LP5/i;[Ljava/lang/String;Ljava/util/concurrent/Callable;Lq5/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/room/e;->s:Z

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/room/e;->t:Landroidx/room/w;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/room/e;->u:LP5/i;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/room/e;->v:[Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/room/e;->w:Ljava/util/concurrent/Callable;

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
    new-instance v0, Landroidx/room/e;

    .line 2
    .line 3
    iget-object v4, p0, Landroidx/room/e;->v:[Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, Landroidx/room/e;->w:Ljava/util/concurrent/Callable;

    .line 6
    .line 7
    iget-boolean v1, p0, Landroidx/room/e;->s:Z

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/room/e;->t:Landroidx/room/w;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/room/e;->u:LP5/i;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Landroidx/room/e;-><init>(ZLandroidx/room/w;LP5/i;[Ljava/lang/String;Ljava/util/concurrent/Callable;Lq5/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Landroidx/room/e;->r:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/room/e;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroidx/room/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Landroidx/room/e;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1

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
    iget-object p1, p0, Landroidx/room/e;->r:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LM5/w;

    .line 28
    .line 29
    const/4 v0, -0x1

    .line 30
    const/4 v3, 0x6

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static {v0, v4, v3}, Ll6/d;->e(ILO5/a;I)LO5/e;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    new-instance v7, Landroidx/room/d;

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/room/e;->v:[Ljava/lang/String;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-direct {v7, v0, v8, v3}, Landroidx/room/d;-><init>([Ljava/lang/String;Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v8, v1}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v3, Landroidx/room/E;->q:LO3/D;

    .line 52
    .line 53
    invoke-interface {v0, v3}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-nez v0, :cond_7

    .line 58
    .line 59
    iget-boolean v0, p0, Landroidx/room/e;->s:Z

    .line 60
    .line 61
    iget-object v3, p0, Landroidx/room/e;->t:Landroidx/room/w;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {v3}, Landroidx/room/w;->getBackingFieldMap()Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v5, "TransactionDispatcher"

    .line 70
    .line 71
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    if-nez v6, :cond_2

    .line 76
    .line 77
    invoke-virtual {v3}, Landroidx/room/w;->getTransactionExecutor()Ljava/util/concurrent/Executor;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v3}, LM5/y;->k(Ljava/util/concurrent/Executor;)LM5/s;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_2
    check-cast v6, LM5/s;

    .line 89
    .line 90
    :goto_0
    move-object v0, v6

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {v3}, Landroidx/room/w;->getBackingFieldMap()Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v5, "QueryDispatcher"

    .line 97
    .line 98
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-nez v6, :cond_4

    .line 103
    .line 104
    invoke-virtual {v3}, Landroidx/room/w;->getQueryExecutor()Ljava/util/concurrent/Executor;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v3}, LM5/y;->k(Ljava/util/concurrent/Executor;)LM5/s;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_4
    check-cast v6, LM5/s;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :goto_1
    const/4 v3, 0x0

    .line 119
    const/4 v5, 0x7

    .line 120
    invoke-static {v3, v4, v5}, Ll6/d;->e(ILO5/a;I)LO5/e;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    new-instance v5, Landroidx/room/c;

    .line 125
    .line 126
    iget-object v9, p0, Landroidx/room/e;->w:Ljava/util/concurrent/Callable;

    .line 127
    .line 128
    const/4 v11, 0x0

    .line 129
    iget-object v6, p0, Landroidx/room/e;->t:Landroidx/room/w;

    .line 130
    .line 131
    invoke-direct/range {v5 .. v11}, Landroidx/room/c;-><init>(Landroidx/room/w;Landroidx/room/d;LO5/e;Ljava/util/concurrent/Callable;LO5/e;Lq5/c;)V

    .line 132
    .line 133
    .line 134
    const/4 v3, 0x2

    .line 135
    invoke-static {p1, v0, v4, v5, v3}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 136
    .line 137
    .line 138
    iput v2, p0, Landroidx/room/e;->q:I

    .line 139
    .line 140
    iget-object p1, p0, Landroidx/room/e;->u:LP5/i;

    .line 141
    .line 142
    invoke-static {p1, v10, v2, p0}, LP5/H;->h(LP5/i;LO5/v;ZLq5/c;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 147
    .line 148
    if-ne p1, v0, :cond_5

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_5
    move-object p1, v1

    .line 152
    :goto_2
    if-ne p1, v0, :cond_6

    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_6
    return-object v1

    .line 156
    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 159
    .line 160
    .line 161
    throw p1
.end method
