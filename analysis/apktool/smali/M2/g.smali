.class public final LM2/g;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LM2/h;

.field public final synthetic s:LU2/g;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:LU2/n;

.field public final synthetic v:LI2/i;

.field public final synthetic w:LP2/a;

.field public final synthetic x:LM2/k;


# direct methods
.method public constructor <init>(LM2/h;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;LP2/a;LM2/k;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/g;->r:LM2/h;

    .line 2
    .line 3
    iput-object p2, p0, LM2/g;->s:LU2/g;

    .line 4
    .line 5
    iput-object p3, p0, LM2/g;->t:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, LM2/g;->u:LU2/n;

    .line 8
    .line 9
    iput-object p5, p0, LM2/g;->v:LI2/i;

    .line 10
    .line 11
    iput-object p6, p0, LM2/g;->w:LP2/a;

    .line 12
    .line 13
    iput-object p7, p0, LM2/g;->x:LM2/k;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Ls5/i;-><init>(ILq5/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 9

    .line 1
    new-instance v0, LM2/g;

    .line 2
    .line 3
    iget-object v6, p0, LM2/g;->w:LP2/a;

    .line 4
    .line 5
    iget-object v7, p0, LM2/g;->x:LM2/k;

    .line 6
    .line 7
    iget-object v1, p0, LM2/g;->r:LM2/h;

    .line 8
    .line 9
    iget-object v2, p0, LM2/g;->s:LU2/g;

    .line 10
    .line 11
    iget-object v3, p0, LM2/g;->t:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v4, p0, LM2/g;->u:LU2/n;

    .line 14
    .line 15
    iget-object v5, p0, LM2/g;->v:LI2/i;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, LM2/g;-><init>(LM2/h;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;LP2/a;LM2/k;Lq5/c;)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, LM2/g;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LM2/g;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LM2/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 4
    .line 5
    iget v0, v5, LM2/g;->q:I

    .line 6
    .line 7
    const/4 v7, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v7, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v5, LM2/g;->r:LM2/h;

    .line 30
    .line 31
    iget-object v1, v5, LM2/g;->s:LU2/g;

    .line 32
    .line 33
    iget-object v2, v5, LM2/g;->t:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v3, v5, LM2/g;->u:LU2/n;

    .line 36
    .line 37
    iget-object v4, v5, LM2/g;->v:LI2/i;

    .line 38
    .line 39
    iput v7, v5, LM2/g;->q:I

    .line 40
    .line 41
    invoke-static/range {v0 .. v5}, LM2/h;->b(LM2/h;LU2/g;Ljava/lang/Object;LU2/n;LI2/i;Ls5/c;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-ne v0, v6, :cond_2

    .line 46
    .line 47
    return-object v6

    .line 48
    :cond_2
    :goto_0
    check-cast v0, LM2/a;

    .line 49
    .line 50
    iget-object v1, v5, LM2/g;->r:LM2/h;

    .line 51
    .line 52
    iget-object v1, v1, LM2/h;->b:LY2/a;

    .line 53
    .line 54
    monitor-enter v1

    .line 55
    :try_start_0
    iget-object v2, v1, LY2/a;->q:Ljava/lang/ref/WeakReference;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, LI2/y;

    .line 62
    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    iget-object v3, v1, LY2/a;->r:Landroid/content/Context;

    .line 66
    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    iget-object v2, v2, LI2/y;->a:LI2/t;

    .line 70
    .line 71
    iget-object v2, v2, LI2/t;->a:Landroid/content/Context;

    .line 72
    .line 73
    iput-object v2, v1, LY2/a;->r:Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_3
    invoke-virtual {v1}, LY2/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_1
    monitor-exit v1

    .line 86
    iget-object v1, v5, LM2/g;->r:LM2/h;

    .line 87
    .line 88
    iget-object v1, v1, LM2/h;->d:Lk3/c;

    .line 89
    .line 90
    iget-object v9, v5, LM2/g;->w:LP2/a;

    .line 91
    .line 92
    iget-object v2, v5, LM2/g;->s:LU2/g;

    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    if-eqz v9, :cond_6

    .line 96
    .line 97
    iget-object v2, v2, LU2/g;->h:LU2/b;

    .line 98
    .line 99
    iget-boolean v2, v2, LU2/b;->r:Z

    .line 100
    .line 101
    if-eqz v2, :cond_6

    .line 102
    .line 103
    iget-object v2, v0, LM2/a;->a:LI2/n;

    .line 104
    .line 105
    invoke-interface {v2}, LI2/n;->d()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_5

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    iget-object v1, v1, Lk3/c;->q:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, LI2/y;

    .line 115
    .line 116
    iget-object v1, v1, LI2/y;->a:LI2/t;

    .line 117
    .line 118
    iget-object v1, v1, LI2/t;->c:Lm5/o;

    .line 119
    .line 120
    invoke-virtual {v1}, Lm5/o;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, LP2/c;

    .line 125
    .line 126
    if-nez v1, :cond_7

    .line 127
    .line 128
    :cond_6
    :goto_2
    move v1, v3

    .line 129
    goto :goto_4

    .line 130
    :cond_7
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string v4, "coil#is_sampled"

    .line 136
    .line 137
    iget-boolean v6, v0, LM2/a;->b:Z

    .line 138
    .line 139
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    invoke-interface {v2, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    iget-object v4, v0, LM2/a;->d:Ljava/lang/String;

    .line 147
    .line 148
    if-eqz v4, :cond_8

    .line 149
    .line 150
    const-string v6, "coil#disk_cache_key"

    .line 151
    .line 152
    invoke-interface {v2, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    :cond_8
    iget-object v10, v0, LM2/a;->a:LI2/n;

    .line 156
    .line 157
    invoke-static {v2}, Ln5/A;->F(Ljava/util/Map;)Ljava/util/Map;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    const-string v2, "Image size must be non-negative: "

    .line 162
    .line 163
    iget-object v4, v1, LP2/c;->c:Ljava/lang/Object;

    .line 164
    .line 165
    monitor-enter v4

    .line 166
    :try_start_1
    invoke-interface {v10}, LI2/n;->c()J

    .line 167
    .line 168
    .line 169
    move-result-wide v12

    .line 170
    const-wide/16 v14, 0x0

    .line 171
    .line 172
    cmp-long v6, v12, v14

    .line 173
    .line 174
    if-ltz v6, :cond_9

    .line 175
    .line 176
    iget-object v8, v1, LP2/c;->a:LP2/f;

    .line 177
    .line 178
    invoke-interface/range {v8 .. v13}, LP2/f;->m(LP2/a;LI2/n;Ljava/util/Map;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 179
    .line 180
    .line 181
    monitor-exit v4

    .line 182
    move v1, v7

    .line 183
    goto :goto_4

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    goto :goto_3

    .line 186
    :cond_9
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 208
    :goto_3
    monitor-exit v4

    .line 209
    throw v0

    .line 210
    :goto_4
    iget-object v9, v0, LM2/a;->a:LI2/n;

    .line 211
    .line 212
    iget-object v10, v5, LM2/g;->s:LU2/g;

    .line 213
    .line 214
    iget-object v11, v0, LM2/a;->c:LJ2/h;

    .line 215
    .line 216
    iget-object v2, v5, LM2/g;->w:LP2/a;

    .line 217
    .line 218
    if-eqz v1, :cond_a

    .line 219
    .line 220
    :goto_5
    move-object v12, v2

    .line 221
    goto :goto_6

    .line 222
    :cond_a
    const/4 v2, 0x0

    .line 223
    goto :goto_5

    .line 224
    :goto_6
    iget-object v13, v0, LM2/a;->d:Ljava/lang/String;

    .line 225
    .line 226
    iget-boolean v14, v0, LM2/a;->b:Z

    .line 227
    .line 228
    iget-object v0, v5, LM2/g;->x:LM2/k;

    .line 229
    .line 230
    if-eqz v0, :cond_b

    .line 231
    .line 232
    iget-boolean v0, v0, LM2/k;->c:Z

    .line 233
    .line 234
    if-eqz v0, :cond_b

    .line 235
    .line 236
    move v15, v7

    .line 237
    goto :goto_7

    .line 238
    :cond_b
    move v15, v3

    .line 239
    :goto_7
    new-instance v8, LU2/p;

    .line 240
    .line 241
    invoke-direct/range {v8 .. v15}, LU2/p;-><init>(LI2/n;LU2/g;LJ2/h;LP2/a;Ljava/lang/String;ZZ)V

    .line 242
    .line 243
    .line 244
    return-object v8

    .line 245
    :goto_8
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 246
    throw v0
.end method
