.class public final LN/w;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:LU5/a;

.field public r:Ljava/lang/Object;

.field public s:LN/x;

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lv/W;

.field public final synthetic w:LN/x;

.field public final synthetic x:Ls5/i;


# direct methods
.method public constructor <init>(Lv/W;LN/x;LB5/c;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/w;->v:Lv/W;

    .line 2
    .line 3
    iput-object p2, p0, LN/w;->w:LN/x;

    .line 4
    .line 5
    check-cast p3, Ls5/i;

    .line 6
    .line 7
    iput-object p3, p0, LN/w;->x:Ls5/i;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 4

    .line 1
    new-instance v0, LN/w;

    .line 2
    .line 3
    iget-object v1, p0, LN/w;->w:LN/x;

    .line 4
    .line 5
    iget-object v2, p0, LN/w;->x:Ls5/i;

    .line 6
    .line 7
    iget-object v3, p0, LN/w;->v:Lv/W;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, LN/w;-><init>(Lv/W;LN/x;LB5/c;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LN/w;->u:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LN/w;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LN/w;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LN/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LN/w;->t:I

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
    iget-object v0, p0, LN/w;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LN/x;

    .line 17
    .line 18
    iget-object v1, p0, LN/w;->q:LU5/a;

    .line 19
    .line 20
    iget-object v2, p0, LN/w;->u:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, LN/v;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    iget-object v0, p0, LN/w;->s:LN/x;

    .line 41
    .line 42
    iget-object v2, p0, LN/w;->r:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LB5/c;

    .line 45
    .line 46
    iget-object v5, p0, LN/w;->q:LU5/a;

    .line 47
    .line 48
    iget-object v6, p0, LN/w;->u:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v6, LN/v;

    .line 51
    .line 52
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, LN/w;->u:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, LM5/w;

    .line 62
    .line 63
    new-instance v0, LN/v;

    .line 64
    .line 65
    invoke-interface {p1}, LM5/w;->d()Lq5/h;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v5, LM5/t;->r:LM5/t;

    .line 70
    .line 71
    invoke-interface {p1, v5}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    check-cast p1, LM5/b0;

    .line 79
    .line 80
    iget-object v5, p0, LN/w;->v:Lv/W;

    .line 81
    .line 82
    invoke-direct {v0, v5, p1}, LN/v;-><init>(Lv/W;LM5/b0;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, LN/w;->w:LN/x;

    .line 86
    .line 87
    iget-object v5, p1, LN/x;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 88
    .line 89
    :goto_0
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, LN/v;

    .line 94
    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    iget-object v7, v0, LN/v;->a:Lv/W;

    .line 98
    .line 99
    iget-object v8, v6, LN/v;->a:Lv/W;

    .line 100
    .line 101
    invoke-virtual {v7, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-ltz v7, :cond_3

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 109
    .line 110
    const-string v0, "Current mutation had a higher priority"

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_4
    :goto_1
    invoke-virtual {v5, v6, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_b

    .line 121
    .line 122
    if-eqz v6, :cond_5

    .line 123
    .line 124
    iget-object v5, v6, LN/v;->b:LM5/b0;

    .line 125
    .line 126
    invoke-interface {v5, v3}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    iget-object v5, p1, LN/x;->b:LU5/c;

    .line 130
    .line 131
    iput-object v0, p0, LN/w;->u:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v5, p0, LN/w;->q:LU5/a;

    .line 134
    .line 135
    iget-object v6, p0, LN/w;->x:Ls5/i;

    .line 136
    .line 137
    iput-object v6, p0, LN/w;->r:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object p1, p0, LN/w;->s:LN/x;

    .line 140
    .line 141
    iput v2, p0, LN/w;->t:I

    .line 142
    .line 143
    invoke-virtual {v5, p0}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    if-ne v2, v4, :cond_6

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    move-object v2, v6

    .line 151
    move-object v6, v0

    .line 152
    move-object v0, p1

    .line 153
    :goto_2
    :try_start_1
    iput-object v6, p0, LN/w;->u:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v5, p0, LN/w;->q:LU5/a;

    .line 156
    .line 157
    iput-object v0, p0, LN/w;->r:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v3, p0, LN/w;->s:LN/x;

    .line 160
    .line 161
    iput v1, p0, LN/w;->t:I

    .line 162
    .line 163
    invoke-interface {v2, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 167
    if-ne p1, v4, :cond_7

    .line 168
    .line 169
    :goto_3
    return-object v4

    .line 170
    :cond_7
    move-object v1, v5

    .line 171
    move-object v2, v6

    .line 172
    :goto_4
    :try_start_2
    iget-object v0, v0, LN/x;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 173
    .line 174
    :cond_8
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_9

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 185
    if-eq v4, v2, :cond_8

    .line 186
    .line 187
    :goto_5
    check-cast v1, LU5/c;

    .line 188
    .line 189
    invoke-virtual {v1, v3}, LU5/c;->g(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    return-object p1

    .line 193
    :catchall_1
    move-exception p1

    .line 194
    goto :goto_8

    .line 195
    :catchall_2
    move-exception p1

    .line 196
    move-object v1, v5

    .line 197
    move-object v2, v6

    .line 198
    :goto_6
    :try_start_3
    iget-object v0, v0, LN/x;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 199
    .line 200
    :goto_7
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-nez v4, :cond_a

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    if-ne v4, v2, :cond_a

    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_a
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 214
    :goto_8
    check-cast v1, LU5/c;

    .line 215
    .line 216
    invoke-virtual {v1, v3}, LU5/c;->g(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    throw p1

    .line 220
    :cond_b
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    if-eq v7, v6, :cond_4

    .line 225
    .line 226
    goto/16 :goto_0
.end method
