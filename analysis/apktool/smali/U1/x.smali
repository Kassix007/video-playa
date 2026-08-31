.class public final LU1/x;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LU1/i;

.field public final synthetic t:LP/W;

.field public final synthetic u:LP/b0;

.field public final synthetic v:LP/W;


# direct methods
.method public constructor <init>(LU1/i;LP/W;LP/b0;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU1/x;->s:LU1/i;

    .line 2
    .line 3
    iput-object p2, p0, LU1/x;->t:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, LU1/x;->u:LP/b0;

    .line 6
    .line 7
    iput-object p4, p0, LU1/x;->v:LP/W;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, LU1/x;

    .line 2
    .line 3
    iget-object v3, p0, LU1/x;->u:LP/b0;

    .line 4
    .line 5
    iget-object v4, p0, LU1/x;->v:LP/W;

    .line 6
    .line 7
    iget-object v1, p0, LU1/x;->s:LU1/i;

    .line 8
    .line 9
    iget-object v2, p0, LU1/x;->t:LP/W;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LU1/x;-><init>(LU1/i;LP/W;LP/b0;LP/W;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LU1/x;->r:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP5/h;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LU1/x;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU1/x;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU1/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LU1/x;->q:I

    .line 2
    .line 3
    iget-object v1, p0, LU1/x;->v:LP/W;

    .line 4
    .line 5
    iget-object v2, p0, LU1/x;->s:LU1/i;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, LU1/x;->t:LP/W;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v3, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LU1/x;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LT1/d;

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, LU1/x;->r:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, LP5/h;

    .line 36
    .line 37
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v5, p0, LU1/x;->u:LP/b0;

    .line 48
    .line 49
    if-le v0, v3, :cond_2

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-virtual {v5, v0}, LP/b0;->f(F)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v0}, Ln5/l;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, LT1/d;

    .line 66
    .line 67
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v0}, LU1/i;->g(LT1/d;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    check-cast v6, Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    add-int/lit8 v7, v7, -0x2

    .line 90
    .line 91
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, LT1/d;

    .line 96
    .line 97
    invoke-virtual {v2, v6}, LU1/i;->g(LT1/d;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const/4 v0, 0x0

    .line 102
    :goto_0
    :try_start_1
    new-instance v6, LN/f;

    .line 103
    .line 104
    const/4 v7, 0x3

    .line 105
    invoke-direct {v6, v4, v1, v5, v7}, LN/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, LU1/x;->r:Ljava/lang/Object;

    .line 109
    .line 110
    iput v3, p0, LU1/x;->q:I

    .line 111
    .line 112
    invoke-interface {p1, v6, p0}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 116
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 117
    .line 118
    if-ne p1, v5, :cond_3

    .line 119
    .line 120
    return-object v5

    .line 121
    :cond_3
    :goto_1
    :try_start_2
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-le p1, v3, :cond_4

    .line 132
    .line 133
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-interface {v1, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    const/4 p1, 0x0

    .line 142
    invoke-virtual {v2, v0, p1}, LU1/i;->e(LT1/d;Z)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :catch_0
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-le p1, v3, :cond_4

    .line 157
    .line 158
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-interface {v1, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 164
    .line 165
    return-object p1
.end method
