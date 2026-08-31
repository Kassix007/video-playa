.class public final Lu/N;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:LU5/a;

.field public r:Ljava/lang/Object;

.field public s:Lu/O;

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lu/O;

.field public final synthetic w:Ls5/i;


# direct methods
.method public constructor <init>(Lu/O;LB5/c;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/N;->v:Lu/O;

    .line 2
    .line 3
    check-cast p2, Ls5/i;

    .line 4
    .line 5
    iput-object p2, p0, Lu/N;->w:Ls5/i;

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
    new-instance v0, Lu/N;

    .line 2
    .line 3
    iget-object v1, p0, Lu/N;->v:Lu/O;

    .line 4
    .line 5
    iget-object v2, p0, Lu/N;->w:Ls5/i;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lu/N;-><init>(Lu/O;LB5/c;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lu/N;->u:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lu/N;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/N;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/N;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lu/N;->t:I

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
    iget-object v0, p0, Lu/N;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lu/O;

    .line 17
    .line 18
    iget-object v1, p0, Lu/N;->q:LU5/a;

    .line 19
    .line 20
    iget-object v2, p0, Lu/N;->u:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lu/M;

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
    iget-object v0, p0, Lu/N;->s:Lu/O;

    .line 41
    .line 42
    iget-object v2, p0, Lu/N;->r:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, LB5/c;

    .line 45
    .line 46
    iget-object v5, p0, Lu/N;->q:LU5/a;

    .line 47
    .line 48
    iget-object v6, p0, Lu/N;->u:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v6, Lu/M;

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
    iget-object p1, p0, Lu/N;->u:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, LM5/w;

    .line 62
    .line 63
    new-instance v0, Lu/M;

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
    invoke-direct {v0, p1}, Lu/M;-><init>(LM5/b0;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lu/N;->v:Lu/O;

    .line 84
    .line 85
    iget-object v5, p1, Lu/O;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 86
    .line 87
    :goto_0
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Lu/M;

    .line 92
    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    sget-object v7, Lu/L;->q:Lu/L;

    .line 96
    .line 97
    invoke-virtual {v7, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-ltz v7, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 105
    .line 106
    const-string v0, "Current mutation had a higher priority"

    .line 107
    .line 108
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_4
    :goto_1
    invoke-virtual {v5, v6, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_b

    .line 117
    .line 118
    if-eqz v6, :cond_5

    .line 119
    .line 120
    iget-object v5, v6, Lu/M;->a:LM5/b0;

    .line 121
    .line 122
    new-instance v6, Lc0/n;

    .line 123
    .line 124
    const-string v7, "Mutation interrupted"

    .line 125
    .line 126
    const/4 v8, 0x1

    .line 127
    invoke-direct {v6, v7, v8}, Lc0/n;-><init>(Ljava/lang/String;I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v5, v6}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    iget-object v5, p1, Lu/O;->b:LU5/c;

    .line 134
    .line 135
    iput-object v0, p0, Lu/N;->u:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v5, p0, Lu/N;->q:LU5/a;

    .line 138
    .line 139
    iget-object v6, p0, Lu/N;->w:Ls5/i;

    .line 140
    .line 141
    iput-object v6, p0, Lu/N;->r:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object p1, p0, Lu/N;->s:Lu/O;

    .line 144
    .line 145
    iput v2, p0, Lu/N;->t:I

    .line 146
    .line 147
    invoke-virtual {v5, p0}, LU5/c;->e(Ls5/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-ne v2, v4, :cond_6

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    move-object v2, v6

    .line 155
    move-object v6, v0

    .line 156
    move-object v0, p1

    .line 157
    :goto_2
    :try_start_1
    iput-object v6, p0, Lu/N;->u:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v5, p0, Lu/N;->q:LU5/a;

    .line 160
    .line 161
    iput-object v0, p0, Lu/N;->r:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v3, p0, Lu/N;->s:Lu/O;

    .line 164
    .line 165
    iput v1, p0, Lu/N;->t:I

    .line 166
    .line 167
    invoke-interface {v2, p0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 171
    if-ne p1, v4, :cond_7

    .line 172
    .line 173
    :goto_3
    return-object v4

    .line 174
    :cond_7
    move-object v1, v5

    .line 175
    move-object v2, v6

    .line 176
    :goto_4
    :try_start_2
    iget-object v0, v0, Lu/O;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 177
    .line 178
    :cond_8
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 189
    if-eq v4, v2, :cond_8

    .line 190
    .line 191
    :goto_5
    check-cast v1, LU5/c;

    .line 192
    .line 193
    invoke-virtual {v1, v3}, LU5/c;->g(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    return-object p1

    .line 197
    :catchall_1
    move-exception p1

    .line 198
    goto :goto_8

    .line 199
    :catchall_2
    move-exception p1

    .line 200
    move-object v1, v5

    .line 201
    move-object v2, v6

    .line 202
    :goto_6
    :try_start_3
    iget-object v0, v0, Lu/O;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 203
    .line 204
    :goto_7
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-nez v4, :cond_a

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    if-ne v4, v2, :cond_a

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_a
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 218
    :goto_8
    check-cast v1, LU5/c;

    .line 219
    .line 220
    invoke-virtual {v1, v3}, LU5/c;->g(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    throw p1

    .line 224
    :cond_b
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    if-eq v7, v6, :cond_4

    .line 229
    .line 230
    goto/16 :goto_0
.end method
