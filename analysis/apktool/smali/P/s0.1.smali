.class public final LP/s0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:LR4/L0;

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:LP/v0;

.field public final synthetic u:LP/u0;

.field public final synthetic v:LP/T;


# direct methods
.method public constructor <init>(LP/v0;LP/u0;LP/T;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/s0;->t:LP/v0;

    .line 2
    .line 3
    iput-object p2, p0, LP/s0;->u:LP/u0;

    .line 4
    .line 5
    iput-object p3, p0, LP/s0;->v:LP/T;

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
    new-instance v0, LP/s0;

    .line 2
    .line 3
    iget-object v1, p0, LP/s0;->u:LP/u0;

    .line 4
    .line 5
    iget-object v2, p0, LP/s0;->v:LP/T;

    .line 6
    .line 7
    iget-object v3, p0, LP/s0;->t:LP/v0;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, LP/s0;-><init>(LP/v0;LP/u0;LP/T;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LP/s0;->s:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LP/s0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LP/s0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LP/s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 2
    .line 3
    iget v1, p0, LP/s0;->r:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LP/s0;->q:LR4/L0;

    .line 12
    .line 13
    iget-object v1, p0, LP/s0;->s:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LM5/b0;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_5

    .line 24
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
    iget-object p1, p0, LP/s0;->s:Ljava/lang/Object;

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
    move-result-object v1

    .line 48
    iget-object p1, p0, LP/s0;->t:LP/v0;

    .line 49
    .line 50
    iget-object v4, p1, LP/v0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v4

    .line 53
    :try_start_1
    iget-object v5, p1, LP/v0;->d:Ljava/lang/Throwable;

    .line 54
    .line 55
    if-nez v5, :cond_d

    .line 56
    .line 57
    iget-object v5, p1, LP/v0;->t:LP5/S;

    .line 58
    .line 59
    invoke-virtual {v5}, LP5/S;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, LP/p0;

    .line 64
    .line 65
    sget-object v6, LP/p0;->r:LP/p0;

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-lez v5, :cond_c

    .line 72
    .line 73
    iget-object v5, p1, LP/v0;->c:LM5/b0;

    .line 74
    .line 75
    if-nez v5, :cond_b

    .line 76
    .line 77
    iput-object v1, p1, LP/v0;->c:LM5/b0;

    .line 78
    .line 79
    invoke-virtual {p1}, LP/v0;->u()LM5/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 80
    .line 81
    .line 82
    monitor-exit v4

    .line 83
    new-instance p1, LA/e0;

    .line 84
    .line 85
    iget-object v4, p0, LP/s0;->t:LP/v0;

    .line 86
    .line 87
    const/16 v5, 0x9

    .line 88
    .line 89
    invoke-direct {p1, v5, v4}, LA/e0;-><init>(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object v4, La0/n;->a:LB0/G0;

    .line 93
    .line 94
    sget-object v4, La0/a;->s:La0/a;

    .line 95
    .line 96
    invoke-static {v4}, La0/n;->f(LB5/c;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    sget-object v4, La0/n;->b:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v4

    .line 102
    :try_start_2
    sget-object v6, La0/n;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v6, Ljava/util/Collection;

    .line 105
    .line 106
    invoke-static {v6, p1}, Ln5/l;->v0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    sput-object v6, La0/n;->g:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 111
    .line 112
    monitor-exit v4

    .line 113
    new-instance v4, LR4/L0;

    .line 114
    .line 115
    invoke-direct {v4, v5, p1}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object p1, LP/v0;->x:LP5/S;

    .line 119
    .line 120
    iget-object p1, p0, LP/s0;->t:LP/v0;

    .line 121
    .line 122
    iget-object p1, p1, LP/v0;->w:LP/S;

    .line 123
    .line 124
    :cond_2
    sget-object v5, LP/v0;->x:LP5/S;

    .line 125
    .line 126
    invoke-virtual {v5}, LP5/S;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    check-cast v6, LS/b;

    .line 131
    .line 132
    move-object v7, v6

    .line 133
    check-cast v7, LV/b;

    .line 134
    .line 135
    sget-object v8, LW/b;->a:LW/b;

    .line 136
    .line 137
    iget-object v9, v7, LV/b;->s:LU/c;

    .line 138
    .line 139
    invoke-virtual {v9, p1}, LU/c;->containsKey(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    if-eqz v10, :cond_3

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_3
    invoke-virtual {v7}, Ln5/a;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-eqz v10, :cond_4

    .line 151
    .line 152
    new-instance v7, LV/a;

    .line 153
    .line 154
    invoke-direct {v7, v8, v8}, LV/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v9, p1, v7}, LU/c;->a(Ljava/lang/Object;LV/a;)LU/c;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    new-instance v8, LV/b;

    .line 162
    .line 163
    invoke-direct {v8, p1, p1, v7}, LV/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LU/c;)V

    .line 164
    .line 165
    .line 166
    move-object v7, v8

    .line 167
    goto :goto_0

    .line 168
    :cond_4
    iget-object v10, v7, LV/b;->r:Ljava/lang/Object;

    .line 169
    .line 170
    invoke-virtual {v9, v10}, LU/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    invoke-static {v11}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    check-cast v11, LV/a;

    .line 178
    .line 179
    new-instance v12, LV/a;

    .line 180
    .line 181
    iget-object v11, v11, LV/a;->a:Ljava/lang/Object;

    .line 182
    .line 183
    invoke-direct {v12, v11, p1}, LV/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v9, v10, v12}, LU/c;->a(Ljava/lang/Object;LV/a;)LU/c;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    new-instance v11, LV/a;

    .line 191
    .line 192
    invoke-direct {v11, v10, v8}, LV/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, p1, v11}, LU/c;->a(Ljava/lang/Object;LV/a;)LU/c;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    new-instance v9, LV/b;

    .line 200
    .line 201
    iget-object v7, v7, LV/b;->q:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-direct {v9, v7, p1, v8}, LV/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LU/c;)V

    .line 204
    .line 205
    .line 206
    move-object v7, v9

    .line 207
    :goto_0
    if-eq v6, v7, :cond_6

    .line 208
    .line 209
    sget-object v8, LQ5/c;->b:LE4/f;

    .line 210
    .line 211
    if-nez v6, :cond_5

    .line 212
    .line 213
    move-object v6, v8

    .line 214
    :cond_5
    invoke-virtual {v5, v6, v7}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-eqz v5, :cond_2

    .line 219
    .line 220
    :cond_6
    :try_start_3
    iget-object p1, p0, LP/s0;->t:LP/v0;

    .line 221
    .line 222
    iget-object v5, p1, LP/v0;->b:Ljava/lang/Object;

    .line 223
    .line 224
    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 225
    :try_start_4
    invoke-virtual {p1}, LP/v0;->x()Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 229
    :try_start_5
    monitor-exit v5

    .line 230
    move-object v5, p1

    .line 231
    check-cast v5, Ljava/util/Collection;

    .line 232
    .line 233
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    const/4 v6, 0x0

    .line 238
    :goto_1
    if-ge v6, v5, :cond_7

    .line 239
    .line 240
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    check-cast v7, LP/u;

    .line 245
    .line 246
    invoke-virtual {v7}, LP/u;->r()V

    .line 247
    .line 248
    .line 249
    add-int/lit8 v6, v6, 0x1

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :catchall_1
    move-exception p1

    .line 253
    move-object v0, v4

    .line 254
    goto :goto_5

    .line 255
    :cond_7
    new-instance p1, LP/r0;

    .line 256
    .line 257
    iget-object v5, p0, LP/s0;->u:LP/u0;

    .line 258
    .line 259
    iget-object v6, p0, LP/s0;->v:LP/T;

    .line 260
    .line 261
    invoke-direct {p1, v5, v6, v2}, LP/r0;-><init>(LP/u0;LP/T;Lq5/c;)V

    .line 262
    .line 263
    .line 264
    iput-object v1, p0, LP/s0;->s:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v4, p0, LP/s0;->q:LR4/L0;

    .line 267
    .line 268
    iput v3, p0, LP/s0;->r:I

    .line 269
    .line 270
    invoke-static {p1, p0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 274
    if-ne p1, v0, :cond_8

    .line 275
    .line 276
    return-object v0

    .line 277
    :cond_8
    move-object v0, v4

    .line 278
    :goto_2
    invoke-virtual {v0}, LR4/L0;->e()V

    .line 279
    .line 280
    .line 281
    iget-object p1, p0, LP/s0;->t:LP/v0;

    .line 282
    .line 283
    iget-object v0, p1, LP/v0;->b:Ljava/lang/Object;

    .line 284
    .line 285
    monitor-enter v0

    .line 286
    :try_start_6
    iget-object v3, p1, LP/v0;->c:LM5/b0;

    .line 287
    .line 288
    if-ne v3, v1, :cond_9

    .line 289
    .line 290
    iput-object v2, p1, LP/v0;->c:LM5/b0;

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :catchall_2
    move-exception p1

    .line 294
    goto :goto_4

    .line 295
    :cond_9
    :goto_3
    invoke-virtual {p1}, LP/v0;->u()LM5/f;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 296
    .line 297
    .line 298
    monitor-exit v0

    .line 299
    sget-object p1, LP/v0;->x:LP5/S;

    .line 300
    .line 301
    iget-object p1, p0, LP/s0;->t:LP/v0;

    .line 302
    .line 303
    iget-object p1, p1, LP/v0;->w:LP/S;

    .line 304
    .line 305
    invoke-static {p1}, LP/S;->b(LP/S;)V

    .line 306
    .line 307
    .line 308
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 309
    .line 310
    return-object p1

    .line 311
    :goto_4
    monitor-exit v0

    .line 312
    throw p1

    .line 313
    :catchall_3
    move-exception p1

    .line 314
    :try_start_7
    monitor-exit v5

    .line 315
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 316
    :goto_5
    invoke-virtual {v0}, LR4/L0;->e()V

    .line 317
    .line 318
    .line 319
    iget-object v0, p0, LP/s0;->t:LP/v0;

    .line 320
    .line 321
    iget-object v3, v0, LP/v0;->b:Ljava/lang/Object;

    .line 322
    .line 323
    monitor-enter v3

    .line 324
    :try_start_8
    iget-object v4, v0, LP/v0;->c:LM5/b0;

    .line 325
    .line 326
    if-ne v4, v1, :cond_a

    .line 327
    .line 328
    iput-object v2, v0, LP/v0;->c:LM5/b0;

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :catchall_4
    move-exception p1

    .line 332
    goto :goto_7

    .line 333
    :cond_a
    :goto_6
    invoke-virtual {v0}, LP/v0;->u()LM5/f;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 334
    .line 335
    .line 336
    monitor-exit v3

    .line 337
    sget-object v0, LP/v0;->x:LP5/S;

    .line 338
    .line 339
    iget-object v0, p0, LP/s0;->t:LP/v0;

    .line 340
    .line 341
    iget-object v0, v0, LP/v0;->w:LP/S;

    .line 342
    .line 343
    invoke-static {v0}, LP/S;->b(LP/S;)V

    .line 344
    .line 345
    .line 346
    throw p1

    .line 347
    :goto_7
    monitor-exit v3

    .line 348
    throw p1

    .line 349
    :catchall_5
    move-exception p1

    .line 350
    monitor-exit v4

    .line 351
    throw p1

    .line 352
    :catchall_6
    move-exception p1

    .line 353
    goto :goto_8

    .line 354
    :cond_b
    :try_start_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 355
    .line 356
    const-string v0, "Recomposer already running"

    .line 357
    .line 358
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw p1

    .line 362
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 363
    .line 364
    const-string v0, "Recomposer shut down"

    .line 365
    .line 366
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw p1

    .line 370
    :cond_d
    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 371
    :goto_8
    monitor-exit v4

    .line 372
    throw p1
.end method
