.class public final Lv/Y;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:LU5/a;

.field public r:Ljava/lang/Object;

.field public s:Lv/a0;

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lv/a0;

.field public final synthetic w:Ls5/i;


# direct methods
.method public constructor <init>(Lv/a0;LB5/c;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/Y;->v:Lv/a0;

    .line 2
    .line 3
    check-cast p2, Ls5/i;

    .line 4
    .line 5
    iput-object p2, p0, Lv/Y;->w:Ls5/i;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, Lv/Y;

    .line 2
    .line 3
    iget-object v1, p0, Lv/Y;->v:Lv/a0;

    .line 4
    .line 5
    iget-object v2, p0, Lv/Y;->w:Ls5/i;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lv/Y;-><init>(Lv/a0;LB5/c;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lv/Y;->u:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lv/Y;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lv/Y;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lv/Y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lv/Y;->t:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lv/Y;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lv/a0;

    .line 17
    .line 18
    iget-object v1, p0, Lv/Y;->q:LU5/a;

    .line 19
    .line 20
    iget-object v2, p0, Lv/Y;->u:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lv/X;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    iget-object v0, p0, Lv/Y;->s:Lv/a0;

    .line 40
    .line 41
    iget-object v2, p0, Lv/Y;->r:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, LB5/c;

    .line 44
    .line 45
    iget-object v5, p0, Lv/Y;->q:LU5/a;

    .line 46
    .line 47
    iget-object v6, p0, Lv/Y;->u:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v6, Lv/X;

    .line 50
    .line 51
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lv/Y;->u:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, LM5/w;

    .line 61
    .line 62
    new-instance v0, Lv/X;

    .line 63
    .line 64
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object v5, LM5/t;->r:LM5/t;

    .line 69
    .line 70
    invoke-interface {p1, v5}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    check-cast p1, LM5/b0;

    .line 78
    .line 79
    sget-object v5, Lv/W;->q:Lv/W;

    .line 80
    .line 81
    invoke-direct {v0, v5, p1}, Lv/X;-><init>(Lv/W;LM5/b0;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lv/Y;->v:Lv/a0;

    .line 85
    .line 86
    invoke-static {p1, v0}, Lv/a0;->a(Lv/a0;Lv/X;)V

    .line 87
    .line 88
    .line 89
    iget-object v5, p1, Lv/a0;->b:LU5/c;

    .line 90
    .line 91
    iput-object v0, p0, Lv/Y;->u:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v5, p0, Lv/Y;->q:LU5/a;

    .line 94
    .line 95
    iget-object v6, p0, Lv/Y;->w:Ls5/i;

    .line 96
    .line 97
    iput-object v6, p0, Lv/Y;->r:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object p1, p0, Lv/Y;->s:Lv/a0;

    .line 100
    .line 101
    iput v2, p0, Lv/Y;->t:I

    .line 102
    .line 103
    invoke-virtual {v5, p0}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-ne v2, v4, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move-object v2, v6

    .line 111
    move-object v6, v0

    .line 112
    move-object v0, p1

    .line 113
    :goto_0
    :try_start_1
    iput-object v6, p0, Lv/Y;->u:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v5, p0, Lv/Y;->q:LU5/a;

    .line 116
    .line 117
    iput-object v0, p0, Lv/Y;->r:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v3, p0, Lv/Y;->s:Lv/a0;

    .line 120
    .line 121
    iput v1, p0, Lv/Y;->t:I

    .line 122
    .line 123
    invoke-interface {v2, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 127
    if-ne p1, v4, :cond_4

    .line 128
    .line 129
    :goto_1
    return-object v4

    .line 130
    :cond_4
    move-object v1, v5

    .line 131
    move-object v2, v6

    .line 132
    :goto_2
    :try_start_2
    iget-object v0, v0, Lv/a0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 133
    .line 134
    :cond_5
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-eqz v4, :cond_6

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 145
    if-eq v4, v2, :cond_5

    .line 146
    .line 147
    :goto_3
    check-cast v1, LU5/c;

    .line 148
    .line 149
    invoke-virtual {v1, v3}, LU5/c;->g(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    return-object p1

    .line 153
    :catchall_1
    move-exception p1

    .line 154
    goto :goto_6

    .line 155
    :catchall_2
    move-exception p1

    .line 156
    move-object v1, v5

    .line 157
    move-object v2, v6

    .line 158
    :goto_4
    :try_start_3
    iget-object v0, v0, Lv/a0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 159
    .line 160
    :goto_5
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-nez v4, :cond_7

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-ne v4, v2, :cond_7

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_7
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 174
    :goto_6
    check-cast v1, LU5/c;

    .line 175
    .line 176
    invoke-virtual {v1, v3}, LU5/c;->g(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    throw p1
.end method
