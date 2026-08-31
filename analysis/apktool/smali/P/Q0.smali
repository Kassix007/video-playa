.class public final LP/Q0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Lr/H;

.field public r:LB5/c;

.field public s:LO5/i;

.field public t:LR4/L0;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:LB5/a;


# direct methods
.method public constructor <init>(LB5/a;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/Q0;->x:LB5/a;

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
    new-instance v0, LP/Q0;

    .line 2
    .line 3
    iget-object v1, p0, LP/Q0;->x:LB5/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LP/Q0;-><init>(LB5/a;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LP/Q0;->w:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP5/i;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LP/Q0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LP/Q0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LP/Q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 17
    .line 18
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 4
    .line 5
    iget v2, v1, LP/Q0;->v:I

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    if-eq v2, v6, :cond_2

    .line 14
    .line 15
    if-eq v2, v4, :cond_1

    .line 16
    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    iget-object v2, v1, LP/Q0;->u:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v7, v1, LP/Q0;->t:LR4/L0;

    .line 22
    .line 23
    iget-object v8, v1, LP/Q0;->s:LO5/i;

    .line 24
    .line 25
    iget-object v9, v1, LP/Q0;->r:LB5/c;

    .line 26
    .line 27
    iget-object v10, v1, LP/Q0;->q:Lr/H;

    .line 28
    .line 29
    iget-object v11, v1, LP/Q0;->w:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v11, LP5/i;

    .line 32
    .line 33
    :try_start_0
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto/16 :goto_b

    .line 40
    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    iget-object v2, v1, LP/Q0;->u:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v7, v1, LP/Q0;->t:LR4/L0;

    .line 52
    .line 53
    iget-object v8, v1, LP/Q0;->s:LO5/i;

    .line 54
    .line 55
    iget-object v9, v1, LP/Q0;->r:LB5/c;

    .line 56
    .line 57
    iget-object v10, v1, LP/Q0;->q:Lr/H;

    .line 58
    .line 59
    iget-object v11, v1, LP/Q0;->w:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v11, LP5/i;

    .line 62
    .line 63
    :try_start_1
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    .line 66
    move-object/from16 v12, p1

    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :cond_2
    iget-object v2, v1, LP/Q0;->u:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v7, v1, LP/Q0;->t:LR4/L0;

    .line 73
    .line 74
    iget-object v8, v1, LP/Q0;->s:LO5/i;

    .line 75
    .line 76
    iget-object v9, v1, LP/Q0;->r:LB5/c;

    .line 77
    .line 78
    iget-object v10, v1, LP/Q0;->q:Lr/H;

    .line 79
    .line 80
    iget-object v11, v1, LP/Q0;->w:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v11, LP5/i;

    .line 83
    .line 84
    :try_start_2
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-static/range {p1 .. p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object v2, v1, LP/Q0;->w:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v11, v2

    .line 94
    check-cast v11, LP5/i;

    .line 95
    .line 96
    new-instance v10, Lr/H;

    .line 97
    .line 98
    invoke-direct {v10}, Lr/H;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v9, LP/P0;

    .line 102
    .line 103
    invoke-direct {v9, v10, v5}, LP/P0;-><init>(Lr/H;I)V

    .line 104
    .line 105
    .line 106
    const v2, 0x7fffffff

    .line 107
    .line 108
    .line 109
    const/4 v7, 0x6

    .line 110
    const/4 v8, 0x0

    .line 111
    invoke-static {v2, v8, v7}, Ll6/d;->e(ILO5/a;I)LO5/e;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    new-instance v2, LA/e0;

    .line 116
    .line 117
    const/16 v7, 0xa

    .line 118
    .line 119
    invoke-direct {v2, v7, v8}, LA/e0;-><init>(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v7, La0/n;->a:LB0/G0;

    .line 123
    .line 124
    sget-object v7, La0/a;->s:La0/a;

    .line 125
    .line 126
    invoke-static {v7}, La0/n;->f(LB5/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    sget-object v7, La0/n;->b:Ljava/lang/Object;

    .line 130
    .line 131
    monitor-enter v7

    .line 132
    :try_start_3
    sget-object v12, La0/n;->g:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v12, Ljava/util/Collection;

    .line 135
    .line 136
    invoke-static {v12, v2}, Ln5/l;->v0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    sput-object v12, La0/n;->g:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 141
    .line 142
    monitor-exit v7

    .line 143
    new-instance v7, LR4/L0;

    .line 144
    .line 145
    const/16 v12, 0x9

    .line 146
    .line 147
    invoke-direct {v7, v12, v2}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :try_start_4
    invoke-static {}, La0/n;->k()La0/h;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2, v9}, La0/h;->u(LB5/c;)La0/h;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    iget-object v12, v1, LP/Q0;->x:LB5/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 159
    .line 160
    :try_start_5
    invoke-virtual {v2}, La0/h;->j()La0/h;

    .line 161
    .line 162
    .line 163
    move-result-object v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 164
    :try_start_6
    invoke-interface {v12}, LB5/a;->invoke()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 168
    :try_start_7
    invoke-static {v13}, La0/h;->q(La0/h;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 169
    .line 170
    .line 171
    :try_start_8
    invoke-virtual {v2}, La0/h;->c()V

    .line 172
    .line 173
    .line 174
    iput-object v11, v1, LP/Q0;->w:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v10, v1, LP/Q0;->q:Lr/H;

    .line 177
    .line 178
    iput-object v9, v1, LP/Q0;->r:LB5/c;

    .line 179
    .line 180
    iput-object v8, v1, LP/Q0;->s:LO5/i;

    .line 181
    .line 182
    iput-object v7, v1, LP/Q0;->t:LR4/L0;

    .line 183
    .line 184
    iput-object v12, v1, LP/Q0;->u:Ljava/lang/Object;

    .line 185
    .line 186
    iput v6, v1, LP/Q0;->v:I

    .line 187
    .line 188
    invoke-interface {v11, v12, v1}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    if-ne v2, v0, :cond_4

    .line 193
    .line 194
    goto/16 :goto_7

    .line 195
    .line 196
    :cond_4
    move-object v2, v12

    .line 197
    :goto_0
    iput-object v11, v1, LP/Q0;->w:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v10, v1, LP/Q0;->q:Lr/H;

    .line 200
    .line 201
    iput-object v9, v1, LP/Q0;->r:LB5/c;

    .line 202
    .line 203
    iput-object v8, v1, LP/Q0;->s:LO5/i;

    .line 204
    .line 205
    iput-object v7, v1, LP/Q0;->t:LR4/L0;

    .line 206
    .line 207
    iput-object v2, v1, LP/Q0;->u:Ljava/lang/Object;

    .line 208
    .line 209
    iput v4, v1, LP/Q0;->v:I

    .line 210
    .line 211
    invoke-interface {v8, v1}, LO5/v;->h(Ls5/i;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    if-ne v12, v0, :cond_5

    .line 216
    .line 217
    goto/16 :goto_7

    .line 218
    .line 219
    :cond_5
    :goto_1
    check-cast v12, Ljava/util/Set;

    .line 220
    .line 221
    move v13, v5

    .line 222
    :goto_2
    if-nez v13, :cond_b

    .line 223
    .line 224
    iget-object v13, v10, Lr/H;->b:[Ljava/lang/Object;

    .line 225
    .line 226
    iget-object v14, v10, Lr/H;->a:[J

    .line 227
    .line 228
    array-length v15, v14

    .line 229
    sub-int/2addr v15, v4

    .line 230
    if-ltz v15, :cond_a

    .line 231
    .line 232
    move v4, v5

    .line 233
    :goto_3
    aget-wide v5, v14, v4

    .line 234
    .line 235
    move/from16 p1, v4

    .line 236
    .line 237
    not-long v3, v5

    .line 238
    const/16 v16, 0x7

    .line 239
    .line 240
    shl-long v3, v3, v16

    .line 241
    .line 242
    and-long/2addr v3, v5

    .line 243
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    and-long v3, v3, v16

    .line 249
    .line 250
    cmp-long v3, v3, v16

    .line 251
    .line 252
    if-eqz v3, :cond_9

    .line 253
    .line 254
    sub-int v4, p1, v15

    .line 255
    .line 256
    not-int v3, v4

    .line 257
    ushr-int/lit8 v3, v3, 0x1f

    .line 258
    .line 259
    const/16 v4, 0x8

    .line 260
    .line 261
    rsub-int/lit8 v3, v3, 0x8

    .line 262
    .line 263
    move/from16 v16, v4

    .line 264
    .line 265
    const/4 v4, 0x0

    .line 266
    :goto_4
    if-ge v4, v3, :cond_8

    .line 267
    .line 268
    const-wide/16 v17, 0xff

    .line 269
    .line 270
    and-long v17, v5, v17

    .line 271
    .line 272
    const-wide/16 v19, 0x80

    .line 273
    .line 274
    cmp-long v17, v17, v19

    .line 275
    .line 276
    if-gez v17, :cond_6

    .line 277
    .line 278
    shl-int/lit8 v17, p1, 0x3

    .line 279
    .line 280
    add-int v17, v17, v4

    .line 281
    .line 282
    move/from16 v18, v4

    .line 283
    .line 284
    aget-object v4, v13, v17

    .line 285
    .line 286
    invoke-interface {v12, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_7

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_6
    move/from16 v18, v4

    .line 294
    .line 295
    :cond_7
    shr-long v5, v5, v16

    .line 296
    .line 297
    add-int/lit8 v4, v18, 0x1

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_8
    move/from16 v4, v16

    .line 301
    .line 302
    if-ne v3, v4, :cond_a

    .line 303
    .line 304
    :cond_9
    move/from16 v5, p1

    .line 305
    .line 306
    if-eq v5, v15, :cond_a

    .line 307
    .line 308
    add-int/lit8 v4, v5, 0x1

    .line 309
    .line 310
    const/4 v3, 0x3

    .line 311
    goto :goto_3

    .line 312
    :cond_a
    const/4 v13, 0x0

    .line 313
    goto :goto_6

    .line 314
    :cond_b
    :goto_5
    const/4 v13, 0x1

    .line 315
    :goto_6
    invoke-interface {v8}, LO5/v;->i()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v3}, LO5/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    move-object v12, v3

    .line 324
    check-cast v12, Ljava/util/Set;

    .line 325
    .line 326
    if-nez v12, :cond_e

    .line 327
    .line 328
    if-eqz v13, :cond_d

    .line 329
    .line 330
    invoke-virtual {v10}, Lr/H;->b()V

    .line 331
    .line 332
    .line 333
    invoke-static {}, La0/n;->k()La0/h;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    invoke-virtual {v3, v9}, La0/h;->u(LB5/c;)La0/h;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    iget-object v4, v1, LP/Q0;->x:LB5/a;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 342
    .line 343
    :try_start_9
    invoke-virtual {v3}, La0/h;->j()La0/h;

    .line 344
    .line 345
    .line 346
    move-result-object v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 347
    :try_start_a
    invoke-interface {v4}, LB5/a;->invoke()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 351
    :try_start_b
    invoke-static {v5}, La0/h;->q(La0/h;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 352
    .line 353
    .line 354
    :try_start_c
    invoke-virtual {v3}, La0/h;->c()V

    .line 355
    .line 356
    .line 357
    invoke-static {v4, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    if-nez v3, :cond_d

    .line 362
    .line 363
    iput-object v11, v1, LP/Q0;->w:Ljava/lang/Object;

    .line 364
    .line 365
    iput-object v10, v1, LP/Q0;->q:Lr/H;

    .line 366
    .line 367
    iput-object v9, v1, LP/Q0;->r:LB5/c;

    .line 368
    .line 369
    iput-object v8, v1, LP/Q0;->s:LO5/i;

    .line 370
    .line 371
    iput-object v7, v1, LP/Q0;->t:LR4/L0;

    .line 372
    .line 373
    iput-object v4, v1, LP/Q0;->u:Ljava/lang/Object;

    .line 374
    .line 375
    const/4 v3, 0x3

    .line 376
    iput v3, v1, LP/Q0;->v:I

    .line 377
    .line 378
    invoke-interface {v11, v4, v1}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 382
    if-ne v2, v0, :cond_c

    .line 383
    .line 384
    :goto_7
    return-object v0

    .line 385
    :cond_c
    move-object v2, v4

    .line 386
    :goto_8
    const/4 v4, 0x2

    .line 387
    const/4 v5, 0x0

    .line 388
    const/4 v6, 0x1

    .line 389
    goto/16 :goto_0

    .line 390
    .line 391
    :cond_d
    const/4 v3, 0x3

    .line 392
    goto :goto_8

    .line 393
    :catchall_1
    move-exception v0

    .line 394
    goto :goto_9

    .line 395
    :catchall_2
    move-exception v0

    .line 396
    :try_start_d
    invoke-static {v5}, La0/h;->q(La0/h;)V

    .line 397
    .line 398
    .line 399
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 400
    :goto_9
    :try_start_e
    invoke-virtual {v3}, La0/h;->c()V

    .line 401
    .line 402
    .line 403
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 404
    :cond_e
    const/4 v3, 0x3

    .line 405
    const/4 v4, 0x2

    .line 406
    const/4 v5, 0x0

    .line 407
    const/4 v6, 0x1

    .line 408
    goto/16 :goto_2

    .line 409
    .line 410
    :catchall_3
    move-exception v0

    .line 411
    goto :goto_a

    .line 412
    :catchall_4
    move-exception v0

    .line 413
    :try_start_f
    invoke-static {v13}, La0/h;->q(La0/h;)V

    .line 414
    .line 415
    .line 416
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 417
    :goto_a
    :try_start_10
    invoke-virtual {v2}, La0/h;->c()V

    .line 418
    .line 419
    .line 420
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 421
    :goto_b
    invoke-virtual {v7}, LR4/L0;->e()V

    .line 422
    .line 423
    .line 424
    throw v0

    .line 425
    :catchall_5
    move-exception v0

    .line 426
    monitor-exit v7

    .line 427
    throw v0
.end method
