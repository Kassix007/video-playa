.class public final synthetic LU4/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/F1;

.field public final synthetic r:LR4/k1;

.field public final synthetic s:Z

.field public final synthetic t:LB5/c;

.field public final synthetic u:LP/W;


# direct methods
.method public synthetic constructor <init>(LR4/F1;LR4/k1;ZLB5/c;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/P;->q:LR4/F1;

    iput-object p2, p0, LU4/P;->r:LR4/k1;

    iput-boolean p3, p0, LU4/P;->s:Z

    iput-object p4, p0, LU4/P;->t:LB5/c;

    iput-object p5, p0, LU4/P;->u:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU4/P;->q:LR4/F1;

    .line 4
    .line 5
    iget-object v3, v1, LR4/F1;->a:Ljava/lang/String;

    .line 6
    .line 7
    move-object/from16 v5, p1

    .line 8
    .line 9
    check-cast v5, LP/o;

    .line 10
    .line 11
    move-object/from16 v2, p2

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    and-int/lit8 v4, v2, 0x3

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    const/4 v8, 0x1

    .line 23
    const/4 v9, 0x0

    .line 24
    if-eq v4, v6, :cond_0

    .line 25
    .line 26
    move v4, v8

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v4, v9

    .line 29
    :goto_0
    and-int/2addr v2, v8

    .line 30
    invoke-virtual {v5, v2, v4}, LP/o;->K(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_19

    .line 35
    .line 36
    sget-object v10, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 37
    .line 38
    iget-object v11, v1, LR4/F1;->b:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {v2}, Lj0/B;->b(I)J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    sget-object v2, Lj0/B;->a:LO3/D;

    .line 49
    .line 50
    invoke-static {v10, v6, v7, v2}, Landroidx/compose/foundation/a;->a(Lc0/m;JLj0/E;)Lc0/m;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v2, v8}, LU4/a;->A(Lc0/m;Z)Lc0/m;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v4, LA/i;->e:LA/c;

    .line 59
    .line 60
    sget-object v6, Lc0/b;->C:Lc0/c;

    .line 61
    .line 62
    const/16 v7, 0x36

    .line 63
    .line 64
    invoke-static {v4, v6, v5, v7}, LA/r;->a(LA/g;Lc0/c;LP/o;I)LA/t;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iget v6, v5, LP/o;->P:I

    .line 69
    .line 70
    invoke-virtual {v5}, LP/o;->m()LP/i0;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v5, v2}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget-object v12, LB0/k;->a:LB0/j;

    .line 79
    .line 80
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    sget-object v12, LB0/j;->b:LB0/D;

    .line 84
    .line 85
    invoke-virtual {v5}, LP/o;->W()V

    .line 86
    .line 87
    .line 88
    iget-boolean v13, v5, LP/o;->O:Z

    .line 89
    .line 90
    if-eqz v13, :cond_1

    .line 91
    .line 92
    invoke-virtual {v5, v12}, LP/o;->l(LB5/a;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    invoke-virtual {v5}, LP/o;->g0()V

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object v13, LB0/j;->e:LB0/i;

    .line 100
    .line 101
    invoke-static {v13, v5, v4}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object v14, LB0/j;->d:LB0/i;

    .line 105
    .line 106
    invoke-static {v14, v5, v7}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget-object v15, LB0/j;->f:LB0/i;

    .line 110
    .line 111
    iget-boolean v4, v5, LP/o;->O:Z

    .line 112
    .line 113
    if-nez v4, :cond_2

    .line 114
    .line 115
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-static {v4, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_3

    .line 128
    .line 129
    :cond_2
    invoke-static {v6, v5, v6, v15}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    sget-object v4, LB0/j;->c:LB0/i;

    .line 133
    .line 134
    invoke-static {v4, v5, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    const/4 v7, 0x5

    .line 142
    const/4 v2, 0x0

    .line 143
    move-object/from16 v16, v4

    .line 144
    .line 145
    const/4 v4, 0x0

    .line 146
    move-object/from16 v8, v16

    .line 147
    .line 148
    invoke-static/range {v2 .. v7}, LU4/a;->t(ILjava/lang/String;ZLP/o;II)V

    .line 149
    .line 150
    .line 151
    invoke-static {v10}, LA/u;->a(Lc0/m;)Lc0/m;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    sget-object v3, LA/i;->c:LA/b;

    .line 156
    .line 157
    sget-object v4, Lc0/b;->B:Lc0/c;

    .line 158
    .line 159
    invoke-static {v3, v4, v5, v9}, LA/r;->a(LA/g;Lc0/c;LP/o;I)LA/t;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    iget v4, v5, LP/o;->P:I

    .line 164
    .line 165
    invoke-virtual {v5}, LP/o;->m()LP/i0;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-static {v5, v2}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v5}, LP/o;->W()V

    .line 174
    .line 175
    .line 176
    iget-boolean v7, v5, LP/o;->O:Z

    .line 177
    .line 178
    if-eqz v7, :cond_4

    .line 179
    .line 180
    invoke-virtual {v5, v12}, LP/o;->l(LB5/a;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_4
    invoke-virtual {v5}, LP/o;->g0()V

    .line 185
    .line 186
    .line 187
    :goto_2
    invoke-static {v13, v5, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v14, v5, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    iget-boolean v3, v5, LP/o;->O:Z

    .line 194
    .line 195
    if-nez v3, :cond_5

    .line 196
    .line 197
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-static {v3, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    if-nez v3, :cond_6

    .line 210
    .line 211
    :cond_5
    invoke-static {v4, v5, v4, v15}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 212
    .line 213
    .line 214
    :cond_6
    invoke-static {v8, v5, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    if-eqz v11, :cond_7

    .line 218
    .line 219
    invoke-static {v11}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, LR4/R1;

    .line 224
    .line 225
    if-eqz v2, :cond_7

    .line 226
    .line 227
    iget-object v2, v2, LR4/R1;->a:Ljava/util/List;

    .line 228
    .line 229
    if-eqz v2, :cond_7

    .line 230
    .line 231
    check-cast v2, Ljava/lang/Iterable;

    .line 232
    .line 233
    check-cast v2, Ljava/util/List;

    .line 234
    .line 235
    invoke-static {v2}, Ln5/l;->j0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    goto :goto_3

    .line 240
    :cond_7
    sget-object v2, Ln5/s;->q:Ln5/s;

    .line 241
    .line 242
    :goto_3
    const/4 v3, 0x0

    .line 243
    if-eqz v11, :cond_8

    .line 244
    .line 245
    invoke-static {v11}, Ln5/l;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    check-cast v4, LR4/R1;

    .line 250
    .line 251
    if-eqz v4, :cond_8

    .line 252
    .line 253
    iget-object v4, v4, LR4/R1;->c:Ljava/lang/Integer;

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_8
    move-object v4, v3

    .line 257
    :goto_4
    invoke-static {v2, v4, v5, v9}, LU4/a;->o(Ljava/util/List;Ljava/lang/Integer;LP/o;I)V

    .line 258
    .line 259
    .line 260
    const/4 v2, 0x1

    .line 261
    invoke-virtual {v5, v2}, LP/o;->p(Z)V

    .line 262
    .line 263
    .line 264
    iget-object v2, v0, LU4/P;->r:LR4/k1;

    .line 265
    .line 266
    iget-object v4, v2, LR4/k1;->d:LR4/i;

    .line 267
    .line 268
    const/16 v6, 0x32

    .line 269
    .line 270
    if-eqz v4, :cond_9

    .line 271
    .line 272
    iget-object v7, v4, LR4/i;->z:LR4/Y;

    .line 273
    .line 274
    if-eqz v7, :cond_9

    .line 275
    .line 276
    iget-boolean v7, v7, LR4/Y;->b:Z

    .line 277
    .line 278
    if-nez v7, :cond_9

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_9
    if-eqz v4, :cond_a

    .line 282
    .line 283
    iget-object v7, v4, LR4/i;->z:LR4/Y;

    .line 284
    .line 285
    if-eqz v7, :cond_a

    .line 286
    .line 287
    iget-boolean v3, v7, LR4/Y;->b:Z

    .line 288
    .line 289
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    :cond_a
    if-nez v3, :cond_b

    .line 294
    .line 295
    :goto_5
    int-to-float v3, v6

    .line 296
    :goto_6
    move/from16 v20, v3

    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_b
    int-to-float v3, v9

    .line 300
    goto :goto_6

    .line 301
    :goto_7
    const/16 v21, 0x7

    .line 302
    .line 303
    sget-object v16, Lc0/j;->q:Lc0/j;

    .line 304
    .line 305
    const/16 v17, 0x0

    .line 306
    .line 307
    const/16 v18, 0x0

    .line 308
    .line 309
    const/16 v19, 0x0

    .line 310
    .line 311
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/b;->d(Lc0/m;FFFFI)Lc0/m;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    sget-object v7, Lc0/b;->q:Lc0/e;

    .line 316
    .line 317
    invoke-static {v7, v9}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    iget v11, v5, LP/o;->P:I

    .line 322
    .line 323
    invoke-virtual {v5}, LP/o;->m()LP/i0;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-static {v5, v3}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-virtual {v5}, LP/o;->W()V

    .line 332
    .line 333
    .line 334
    iget-boolean v9, v5, LP/o;->O:Z

    .line 335
    .line 336
    if-eqz v9, :cond_c

    .line 337
    .line 338
    invoke-virtual {v5, v12}, LP/o;->l(LB5/a;)V

    .line 339
    .line 340
    .line 341
    goto :goto_8

    .line 342
    :cond_c
    invoke-virtual {v5}, LP/o;->g0()V

    .line 343
    .line 344
    .line 345
    :goto_8
    invoke-static {v13, v5, v10}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v14, v5, v6}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    iget-boolean v6, v5, LP/o;->O:Z

    .line 352
    .line 353
    if-nez v6, :cond_d

    .line 354
    .line 355
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    invoke-static {v6, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    if-nez v6, :cond_e

    .line 368
    .line 369
    :cond_d
    invoke-static {v11, v5, v11, v15}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 370
    .line 371
    .line 372
    :cond_e
    invoke-static {v8, v5, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    iget-object v1, v1, LR4/F1;->c:Ljava/util/List;

    .line 376
    .line 377
    if-nez v1, :cond_f

    .line 378
    .line 379
    const v1, 0x7b951ee4

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, v1}, LP/o;->S(I)V

    .line 383
    .line 384
    .line 385
    const/4 v3, 0x0

    .line 386
    :goto_9
    invoke-virtual {v5, v3}, LP/o;->p(Z)V

    .line 387
    .line 388
    .line 389
    const/4 v1, 0x1

    .line 390
    goto :goto_a

    .line 391
    :cond_f
    const/4 v3, 0x0

    .line 392
    const v6, 0x7b951ee5

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5, v6}, LP/o;->S(I)V

    .line 396
    .line 397
    .line 398
    iget-object v6, v0, LU4/P;->t:LB5/c;

    .line 399
    .line 400
    invoke-static {v1, v6, v5, v3}, LE3/h;->a(Ljava/util/List;LB5/c;LP/o;I)V

    .line 401
    .line 402
    .line 403
    goto :goto_9

    .line 404
    :goto_a
    invoke-virtual {v5, v1}, LP/o;->p(Z)V

    .line 405
    .line 406
    .line 407
    sget-object v3, LP/k;->a:LP/S;

    .line 408
    .line 409
    if-eqz v4, :cond_16

    .line 410
    .line 411
    iget-object v4, v4, LR4/i;->z:LR4/Y;

    .line 412
    .line 413
    if-eqz v4, :cond_16

    .line 414
    .line 415
    iget-boolean v6, v4, LR4/Y;->b:Z

    .line 416
    .line 417
    if-ne v6, v1, :cond_16

    .line 418
    .line 419
    iget-object v1, v4, LR4/Y;->a:Ljava/lang/Boolean;

    .line 420
    .line 421
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-static {v1, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    if-eqz v1, :cond_16

    .line 428
    .line 429
    const v1, -0xc8b8fbe

    .line 430
    .line 431
    .line 432
    invoke-virtual {v5, v1}, LP/o;->S(I)V

    .line 433
    .line 434
    .line 435
    new-instance v18, LR4/x;

    .line 436
    .line 437
    iget-object v1, v4, LR4/Y;->g:Ljava/lang/String;

    .line 438
    .line 439
    iget-object v6, v4, LR4/Y;->h:Ljava/lang/Integer;

    .line 440
    .line 441
    iget-object v9, v4, LR4/Y;->f:Ljava/lang/String;

    .line 442
    .line 443
    iget-object v10, v4, LR4/Y;->j:Ljava/lang/Integer;

    .line 444
    .line 445
    iget-object v11, v4, LR4/Y;->i:Ljava/lang/String;

    .line 446
    .line 447
    move-object/from16 v19, v1

    .line 448
    .line 449
    iget-object v1, v4, LR4/Y;->k:Ljava/lang/String;

    .line 450
    .line 451
    move-object/from16 v24, v1

    .line 452
    .line 453
    iget-object v1, v4, LR4/Y;->c:Ljava/lang/String;

    .line 454
    .line 455
    move-object/from16 v20, v6

    .line 456
    .line 457
    iget-object v6, v4, LR4/Y;->d:Ljava/lang/String;

    .line 458
    .line 459
    iget-object v4, v4, LR4/Y;->e:Ljava/lang/String;

    .line 460
    .line 461
    move-object/from16 v21, v9

    .line 462
    .line 463
    const-string v9, "&titleBarBgColor="

    .line 464
    .line 465
    move-object/from16 v22, v10

    .line 466
    .line 467
    const-string v10, "&titleBarContentColor="

    .line 468
    .line 469
    move-object/from16 v23, v11

    .line 470
    .line 471
    const-string v11, "w2n://download-screen?title="

    .line 472
    .line 473
    invoke-static {v11, v1, v9, v6, v10}, LC0/S;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v25

    .line 484
    invoke-direct/range {v18 .. v25}, LR4/x;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    move-object/from16 v1, v18

    .line 488
    .line 489
    iget-boolean v4, v0, LU4/P;->s:Z

    .line 490
    .line 491
    if-eqz v4, :cond_10

    .line 492
    .line 493
    const/16 v4, 0x32

    .line 494
    .line 495
    :goto_b
    int-to-float v4, v4

    .line 496
    move/from16 v26, v4

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_10
    const/16 v4, 0x19

    .line 500
    .line 501
    goto :goto_b

    .line 502
    :goto_c
    const/16 v27, 0x7

    .line 503
    .line 504
    const/16 v23, 0x0

    .line 505
    .line 506
    const/16 v24, 0x0

    .line 507
    .line 508
    const/16 v25, 0x0

    .line 509
    .line 510
    move-object/from16 v22, v16

    .line 511
    .line 512
    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/b;->d(Lc0/m;FFFFI)Lc0/m;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    const/4 v6, 0x0

    .line 517
    invoke-static {v7, v6}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    iget v6, v5, LP/o;->P:I

    .line 522
    .line 523
    invoke-virtual {v5}, LP/o;->m()LP/i0;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    invoke-static {v5, v4}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    invoke-virtual {v5}, LP/o;->W()V

    .line 532
    .line 533
    .line 534
    iget-boolean v10, v5, LP/o;->O:Z

    .line 535
    .line 536
    if-eqz v10, :cond_11

    .line 537
    .line 538
    invoke-virtual {v5, v12}, LP/o;->l(LB5/a;)V

    .line 539
    .line 540
    .line 541
    goto :goto_d

    .line 542
    :cond_11
    invoke-virtual {v5}, LP/o;->g0()V

    .line 543
    .line 544
    .line 545
    :goto_d
    invoke-static {v13, v5, v7}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    invoke-static {v14, v5, v9}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    iget-boolean v7, v5, LP/o;->O:Z

    .line 552
    .line 553
    if-nez v7, :cond_12

    .line 554
    .line 555
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 560
    .line 561
    .line 562
    move-result-object v9

    .line 563
    invoke-static {v7, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v7

    .line 567
    if-nez v7, :cond_13

    .line 568
    .line 569
    :cond_12
    invoke-static {v6, v5, v6, v15}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 570
    .line 571
    .line 572
    :cond_13
    invoke-static {v8, v5, v4}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    invoke-virtual {v5, v1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v6

    .line 583
    invoke-virtual {v5, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v7

    .line 587
    or-int/2addr v6, v7

    .line 588
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v7

    .line 592
    if-nez v6, :cond_14

    .line 593
    .line 594
    if-ne v7, v3, :cond_15

    .line 595
    .line 596
    :cond_14
    new-instance v7, LN5/d;

    .line 597
    .line 598
    const/4 v6, 0x7

    .line 599
    invoke-direct {v7, v6, v1, v2}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v5, v7}, LP/o;->d0(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    :cond_15
    check-cast v7, LB5/c;

    .line 606
    .line 607
    const/4 v6, 0x0

    .line 608
    invoke-static {v4, v7, v5, v6}, LE3/h;->a(Ljava/util/List;LB5/c;LP/o;I)V

    .line 609
    .line 610
    .line 611
    const/4 v1, 0x1

    .line 612
    invoke-virtual {v5, v1}, LP/o;->p(Z)V

    .line 613
    .line 614
    .line 615
    :goto_e
    invoke-virtual {v5, v6}, LP/o;->p(Z)V

    .line 616
    .line 617
    .line 618
    const/4 v1, 0x1

    .line 619
    goto :goto_f

    .line 620
    :cond_16
    const/4 v6, 0x0

    .line 621
    const v1, -0xcdd4425

    .line 622
    .line 623
    .line 624
    invoke-virtual {v5, v1}, LP/o;->S(I)V

    .line 625
    .line 626
    .line 627
    goto :goto_e

    .line 628
    :goto_f
    invoke-virtual {v5, v1}, LP/o;->p(Z)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v5, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    invoke-virtual {v5}, LP/o;->H()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    if-nez v1, :cond_17

    .line 640
    .line 641
    if-ne v4, v3, :cond_18

    .line 642
    .line 643
    :cond_17
    new-instance v4, LU4/n;

    .line 644
    .line 645
    const/4 v1, 0x2

    .line 646
    iget-object v3, v0, LU4/P;->u:LP/W;

    .line 647
    .line 648
    invoke-direct {v4, v2, v3, v1}, LU4/n;-><init>(LR4/k1;LP/W;I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v5, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    :cond_18
    check-cast v4, LB5/a;

    .line 655
    .line 656
    const/4 v6, 0x0

    .line 657
    invoke-static {v6, v4, v5, v6}, Ll6/d;->d(ZLB5/a;LP/o;I)V

    .line 658
    .line 659
    .line 660
    goto :goto_10

    .line 661
    :cond_19
    invoke-virtual {v5}, LP/o;->N()V

    .line 662
    .line 663
    .line 664
    :goto_10
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 665
    .line 666
    return-object v1
.end method
