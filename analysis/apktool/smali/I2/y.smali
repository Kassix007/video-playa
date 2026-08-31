.class public final LI2/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public final a:LI2/t;

.field public final b:LB0/o;

.field public final c:LI2/g;

.field public volatile synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, LI2/y;

    .line 2
    .line 3
    const-string v1, "d"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LI2/t;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, LI2/y;->a:LI2/t;

    .line 9
    .line 10
    invoke-static {}, LM5/y;->c()LM5/q0;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v3, LM5/t;->q:LM5/t;

    .line 15
    .line 16
    new-instance v4, LI2/z;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-direct {v4, v3, v5}, LI2/z;-><init>(Lq5/g;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v4}, LE3/h;->L(Lq5/f;Lq5/h;)Lq5/h;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 27
    .line 28
    .line 29
    new-instance v2, LY2/a;

    .line 30
    .line 31
    invoke-direct {v2, v0}, LY2/a;-><init>(LI2/y;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, LB0/o;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, v3, LB0/o;->q:Ljava/lang/Object;

    .line 40
    .line 41
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    const/16 v7, 0x1a

    .line 45
    .line 46
    if-lt v4, v7, :cond_3

    .line 47
    .line 48
    sget-boolean v8, LY2/d;->a:Z

    .line 49
    .line 50
    if-eqz v8, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    if-eq v4, v7, :cond_2

    .line 54
    .line 55
    const/16 v7, 0x1b

    .line 56
    .line 57
    if-ne v4, v7, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance v4, LH2/k;

    .line 61
    .line 62
    invoke-direct {v4, v6, v6}, LH2/k;-><init>(IZ)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    :goto_0
    new-instance v4, LY2/f;

    .line 67
    .line 68
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    sget-boolean v4, LY2/d;->a:Z

    .line 73
    .line 74
    :goto_1
    new-instance v4, LH2/k;

    .line 75
    .line 76
    invoke-direct {v4, v6, v5}, LH2/k;-><init>(IZ)V

    .line 77
    .line 78
    .line 79
    :goto_2
    iput-object v4, v3, LB0/o;->r:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object v3, v0, LI2/y;->b:LB0/o;

    .line 82
    .line 83
    iget-object v4, v1, LI2/t;->e:LI2/g;

    .line 84
    .line 85
    new-instance v7, LI2/f;

    .line 86
    .line 87
    invoke-direct {v7, v4}, LI2/f;-><init>(LI2/g;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, v1, LI2/t;->b:LU2/e;

    .line 91
    .line 92
    iget-object v4, v1, LU2/e;->n:LI2/m;

    .line 93
    .line 94
    sget-object v8, LI2/q;->a:LI2/l;

    .line 95
    .line 96
    iget-object v4, v4, LI2/m;->a:Ljava/util/Map;

    .line 97
    .line 98
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-nez v4, :cond_4

    .line 103
    .line 104
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    :cond_4
    check-cast v4, Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    const/4 v8, 0x2

    .line 113
    iget-object v9, v7, LI2/f;->d:Ljava/util/ArrayList;

    .line 114
    .line 115
    iget-object v10, v7, LI2/f;->e:Ljava/util/ArrayList;

    .line 116
    .line 117
    if-eqz v4, :cond_5

    .line 118
    .line 119
    new-instance v4, LI2/p;

    .line 120
    .line 121
    invoke-direct {v4, v6}, LI2/p;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    new-instance v4, LI2/p;

    .line 128
    .line 129
    invoke-direct {v4, v8}, LI2/p;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_5
    new-instance v4, LO2/a;

    .line 136
    .line 137
    invoke-direct {v4, v5}, LO2/a;-><init>(I)V

    .line 138
    .line 139
    .line 140
    const-class v11, Landroid/net/Uri;

    .line 141
    .line 142
    invoke-static {v11}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    invoke-virtual {v7, v4, v11}, LI2/f;->c(LO2/a;Lkotlin/jvm/internal/f;)V

    .line 147
    .line 148
    .line 149
    new-instance v4, LO2/a;

    .line 150
    .line 151
    const/4 v11, 0x3

    .line 152
    invoke-direct {v4, v11}, LO2/a;-><init>(I)V

    .line 153
    .line 154
    .line 155
    const-class v12, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    invoke-virtual {v7, v4, v12}, LI2/f;->c(LO2/a;Lkotlin/jvm/internal/f;)V

    .line 162
    .line 163
    .line 164
    new-instance v4, LN2/a;

    .line 165
    .line 166
    invoke-direct {v4, v5}, LN2/a;-><init>(I)V

    .line 167
    .line 168
    .line 169
    const-class v12, LI2/B;

    .line 170
    .line 171
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    new-instance v14, Lm5/j;

    .line 176
    .line 177
    invoke-direct {v14, v4, v13}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    iget-object v4, v7, LI2/f;->c:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    new-instance v13, LL2/a;

    .line 186
    .line 187
    invoke-direct {v13, v5}, LL2/a;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    invoke-virtual {v7, v13, v14}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 195
    .line 196
    .line 197
    new-instance v13, LL2/a;

    .line 198
    .line 199
    const/4 v14, 0x4

    .line 200
    invoke-direct {v13, v14}, LL2/a;-><init>(I)V

    .line 201
    .line 202
    .line 203
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 204
    .line 205
    .line 206
    move-result-object v15

    .line 207
    invoke-virtual {v7, v13, v15}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 208
    .line 209
    .line 210
    new-instance v13, LL2/a;

    .line 211
    .line 212
    const/16 v15, 0x9

    .line 213
    .line 214
    invoke-direct {v13, v15}, LL2/a;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 218
    .line 219
    .line 220
    move-result-object v15

    .line 221
    invoke-virtual {v7, v13, v15}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 222
    .line 223
    .line 224
    new-instance v13, LL2/a;

    .line 225
    .line 226
    const/4 v15, 0x6

    .line 227
    invoke-direct {v13, v15}, LL2/a;-><init>(I)V

    .line 228
    .line 229
    .line 230
    const-class v15, Landroid/graphics/drawable/Drawable;

    .line 231
    .line 232
    invoke-static {v15}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 233
    .line 234
    .line 235
    move-result-object v15

    .line 236
    invoke-virtual {v7, v13, v15}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 237
    .line 238
    .line 239
    new-instance v13, LL2/a;

    .line 240
    .line 241
    invoke-direct {v13, v6}, LL2/a;-><init>(I)V

    .line 242
    .line 243
    .line 244
    const-class v15, Landroid/graphics/Bitmap;

    .line 245
    .line 246
    invoke-static {v15}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    invoke-virtual {v7, v13, v15}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 251
    .line 252
    .line 253
    sget-object v13, LI2/r;->a:LI2/l;

    .line 254
    .line 255
    iget-object v13, v1, LU2/e;->n:LI2/m;

    .line 256
    .line 257
    sget-object v15, LI2/r;->a:LI2/l;

    .line 258
    .line 259
    iget-object v13, v13, LI2/m;->a:Ljava/util/Map;

    .line 260
    .line 261
    invoke-interface {v13, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v13

    .line 265
    if-nez v13, :cond_6

    .line 266
    .line 267
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v13

    .line 271
    :cond_6
    check-cast v13, Ljava/lang/Number;

    .line 272
    .line 273
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    sget v15, LU5/j;->a:I

    .line 278
    .line 279
    new-instance v15, LU5/i;

    .line 280
    .line 281
    invoke-direct {v15, v13}, LU5/h;-><init>(I)V

    .line 282
    .line 283
    .line 284
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 285
    .line 286
    const/16 v8, 0x1d

    .line 287
    .line 288
    sget-object v14, LJ2/n;->a:LJ2/n;

    .line 289
    .line 290
    if-lt v13, v8, :cond_9

    .line 291
    .line 292
    iget-object v8, v1, LU2/e;->n:LI2/m;

    .line 293
    .line 294
    sget-object v13, LI2/r;->c:LI2/l;

    .line 295
    .line 296
    iget-object v8, v8, LI2/m;->a:Ljava/util/Map;

    .line 297
    .line 298
    invoke-interface {v8, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    if-nez v8, :cond_7

    .line 303
    .line 304
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 305
    .line 306
    :cond_7
    check-cast v8, Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    .line 310
    .line 311
    move-result v8

    .line 312
    if-eqz v8, :cond_9

    .line 313
    .line 314
    iget-object v8, v1, LU2/e;->n:LI2/m;

    .line 315
    .line 316
    sget-object v13, LI2/r;->b:LI2/l;

    .line 317
    .line 318
    iget-object v8, v8, LI2/m;->a:Ljava/util/Map;

    .line 319
    .line 320
    invoke-interface {v8, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    if-nez v8, :cond_8

    .line 325
    .line 326
    move-object v8, v14

    .line 327
    :cond_8
    check-cast v8, LJ2/n;

    .line 328
    .line 329
    invoke-virtual {v8, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    if-eqz v8, :cond_9

    .line 334
    .line 335
    new-instance v8, LJ2/u;

    .line 336
    .line 337
    invoke-direct {v8, v15}, LJ2/u;-><init>(LU5/i;)V

    .line 338
    .line 339
    .line 340
    new-instance v13, LI2/c;

    .line 341
    .line 342
    invoke-direct {v13, v8, v5}, LI2/c;-><init>(LJ2/j;I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    :cond_9
    new-instance v8, LJ2/c;

    .line 349
    .line 350
    iget-object v1, v1, LU2/e;->n:LI2/m;

    .line 351
    .line 352
    sget-object v13, LI2/r;->b:LI2/l;

    .line 353
    .line 354
    iget-object v1, v1, LI2/m;->a:Ljava/util/Map;

    .line 355
    .line 356
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-nez v1, :cond_a

    .line 361
    .line 362
    goto :goto_3

    .line 363
    :cond_a
    move-object v14, v1

    .line 364
    :goto_3
    check-cast v14, LJ2/n;

    .line 365
    .line 366
    invoke-direct {v8, v15, v14}, LJ2/c;-><init>(LU5/i;LJ2/n;)V

    .line 367
    .line 368
    .line 369
    new-instance v1, LI2/c;

    .line 370
    .line 371
    invoke-direct {v1, v8, v5}, LI2/c;-><init>(LJ2/j;I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    new-instance v1, LO2/a;

    .line 378
    .line 379
    invoke-direct {v1, v6}, LO2/a;-><init>(I)V

    .line 380
    .line 381
    .line 382
    const-class v5, Ljava/io/File;

    .line 383
    .line 384
    invoke-static {v5}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    invoke-virtual {v7, v1, v5}, LI2/f;->c(LO2/a;Lkotlin/jvm/internal/f;)V

    .line 389
    .line 390
    .line 391
    new-instance v1, LL2/a;

    .line 392
    .line 393
    const/16 v5, 0x8

    .line 394
    .line 395
    invoke-direct {v1, v5}, LL2/a;-><init>(I)V

    .line 396
    .line 397
    .line 398
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    invoke-virtual {v7, v1, v5}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 403
    .line 404
    .line 405
    new-instance v1, LL2/a;

    .line 406
    .line 407
    invoke-direct {v1, v11}, LL2/a;-><init>(I)V

    .line 408
    .line 409
    .line 410
    const-class v5, Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    invoke-static {v5}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    invoke-virtual {v7, v1, v5}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 417
    .line 418
    .line 419
    new-instance v1, LO2/a;

    .line 420
    .line 421
    const/4 v5, 0x4

    .line 422
    invoke-direct {v1, v5}, LO2/a;-><init>(I)V

    .line 423
    .line 424
    .line 425
    const-class v5, Ljava/lang/String;

    .line 426
    .line 427
    invoke-static {v5}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    invoke-virtual {v7, v1, v5}, LI2/f;->c(LO2/a;Lkotlin/jvm/internal/f;)V

    .line 432
    .line 433
    .line 434
    new-instance v1, LO2/a;

    .line 435
    .line 436
    const/4 v5, 0x2

    .line 437
    invoke-direct {v1, v5}, LO2/a;-><init>(I)V

    .line 438
    .line 439
    .line 440
    const-class v8, Lq6/x;

    .line 441
    .line 442
    invoke-static {v8}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    invoke-virtual {v7, v1, v8}, LI2/f;->c(LO2/a;Lkotlin/jvm/internal/f;)V

    .line 447
    .line 448
    .line 449
    new-instance v1, LN2/a;

    .line 450
    .line 451
    invoke-direct {v1, v6}, LN2/a;-><init>(I)V

    .line 452
    .line 453
    .line 454
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    new-instance v8, Lm5/j;

    .line 459
    .line 460
    invoke-direct {v8, v1, v6}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    new-instance v1, LN2/a;

    .line 467
    .line 468
    invoke-direct {v1, v5}, LN2/a;-><init>(I)V

    .line 469
    .line 470
    .line 471
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    new-instance v8, Lm5/j;

    .line 476
    .line 477
    invoke-direct {v8, v1, v6}, Lm5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    new-instance v1, LL2/a;

    .line 484
    .line 485
    const/4 v6, 0x7

    .line 486
    invoke-direct {v1, v6}, LL2/a;-><init>(I)V

    .line 487
    .line 488
    .line 489
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 490
    .line 491
    .line 492
    move-result-object v6

    .line 493
    invoke-virtual {v7, v1, v6}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 494
    .line 495
    .line 496
    new-instance v1, LL2/a;

    .line 497
    .line 498
    invoke-direct {v1, v5}, LL2/a;-><init>(I)V

    .line 499
    .line 500
    .line 501
    const-class v5, [B

    .line 502
    .line 503
    invoke-static {v5}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    invoke-virtual {v7, v1, v5}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 508
    .line 509
    .line 510
    new-instance v1, LL2/a;

    .line 511
    .line 512
    const/4 v5, 0x5

    .line 513
    invoke-direct {v1, v5}, LL2/a;-><init>(I)V

    .line 514
    .line 515
    .line 516
    invoke-static {v12}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    invoke-virtual {v7, v1, v5}, LI2/f;->b(LL2/f;Lkotlin/jvm/internal/f;)V

    .line 521
    .line 522
    .line 523
    new-instance v1, LM2/h;

    .line 524
    .line 525
    invoke-direct {v1, v0, v2, v3}, LM2/h;-><init>(LI2/y;LY2/a;LB0/o;)V

    .line 526
    .line 527
    .line 528
    iget-object v2, v7, LI2/f;->a:Ljava/util/ArrayList;

    .line 529
    .line 530
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    new-instance v11, LI2/g;

    .line 534
    .line 535
    invoke-static {v2}, Ln5/A;->E(Ljava/util/List;)Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v12

    .line 539
    iget-object v1, v7, LI2/f;->b:Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-static {v1}, Ln5/A;->E(Ljava/util/List;)Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v13

    .line 545
    invoke-static {v4}, Ln5/A;->E(Ljava/util/List;)Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v14

    .line 549
    invoke-static {v9}, Ln5/A;->E(Ljava/util/List;)Ljava/util/List;

    .line 550
    .line 551
    .line 552
    move-result-object v15

    .line 553
    invoke-static {v10}, Ln5/A;->E(Ljava/util/List;)Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v16

    .line 557
    invoke-direct/range {v11 .. v16}, LI2/g;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 558
    .line 559
    .line 560
    iput-object v11, v0, LI2/y;->c:LI2/g;

    .line 561
    .line 562
    return-void
.end method


# virtual methods
.method public final a(LU2/g;ILs5/c;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    move-object/from16 v1, p3

    .line 3
    .line 4
    instance-of v3, v1, LI2/w;

    .line 5
    .line 6
    if-eqz v3, :cond_0

    .line 7
    .line 8
    move-object v3, v1

    .line 9
    check-cast v3, LI2/w;

    .line 10
    .line 11
    iget v4, v3, LI2/w;->w:I

    .line 12
    .line 13
    const/high16 v5, -0x80000000

    .line 14
    .line 15
    and-int v6, v4, v5

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    sub-int/2addr v4, v5

    .line 20
    iput v4, v3, LI2/w;->w:I

    .line 21
    .line 22
    :goto_0
    move-object v7, v3

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v3, LI2/w;

    .line 25
    .line 26
    invoke-direct {v3, p0, v1}, LI2/w;-><init>(LI2/y;Ls5/c;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    iget-object v1, v7, LI2/w;->u:Ljava/lang/Object;

    .line 31
    .line 32
    iget v3, v7, LI2/w;->w:I

    .line 33
    .line 34
    const/4 v8, 0x3

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v9, 0x0

    .line 38
    sget-object v10, Lr5/a;->q:Lr5/a;

    .line 39
    .line 40
    if-eqz v3, :cond_4

    .line 41
    .line 42
    if-eq v3, v5, :cond_3

    .line 43
    .line 44
    if-eq v3, v4, :cond_2

    .line 45
    .line 46
    if-ne v3, v8, :cond_1

    .line 47
    .line 48
    iget-object v3, v7, LI2/w;->s:LI2/i;

    .line 49
    .line 50
    iget-object v4, v7, LI2/w;->r:LU2/g;

    .line 51
    .line 52
    iget-object v5, v7, LI2/w;->q:LU2/o;

    .line 53
    .line 54
    :try_start_0
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_d

    .line 58
    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto/16 :goto_11

    .line 61
    .line 62
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :cond_2
    iget-object v0, v7, LI2/w;->t:LI2/n;

    .line 71
    .line 72
    iget-object v3, v7, LI2/w;->s:LI2/i;

    .line 73
    .line 74
    iget-object v4, v7, LI2/w;->r:LU2/g;

    .line 75
    .line 76
    iget-object v5, v7, LI2/w;->q:LU2/o;

    .line 77
    .line 78
    :try_start_1
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    .line 81
    move-object v11, v4

    .line 82
    move-object v4, v3

    .line 83
    move-object v3, v11

    .line 84
    move-object v11, v5

    .line 85
    move-object v5, v0

    .line 86
    goto/16 :goto_b

    .line 87
    .line 88
    :cond_3
    iget-object v3, v7, LI2/w;->s:LI2/i;

    .line 89
    .line 90
    iget-object v5, v7, LI2/w;->r:LU2/g;

    .line 91
    .line 92
    iget-object v6, v7, LI2/w;->q:LU2/o;

    .line 93
    .line 94
    :try_start_2
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    .line 96
    .line 97
    goto/16 :goto_9

    .line 98
    .line 99
    :catchall_1
    move-exception v0

    .line 100
    move-object v4, v5

    .line 101
    move-object v5, v6

    .line 102
    goto/16 :goto_11

    .line 103
    .line 104
    :cond_4
    invoke-static {v1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v7}, Lq5/c;->getContext()Lq5/h;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1}, LM5/y;->n(Lq5/h;)LM5/b0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-nez p2, :cond_5

    .line 116
    .line 117
    move v3, v5

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    const/4 v3, 0x0

    .line 120
    :goto_2
    iget-object v6, p0, LI2/y;->b:LB0/o;

    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v11, v0, LU2/g;->a:Landroid/content/Context;

    .line 129
    .line 130
    sget-object v12, LU2/i;->d:LI2/l;

    .line 131
    .line 132
    invoke-static {p1, v12}, LI2/q;->d(LU2/g;LI2/l;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    check-cast v12, Landroidx/lifecycle/q;

    .line 137
    .line 138
    if-nez v12, :cond_9

    .line 139
    .line 140
    if-eqz v3, :cond_8

    .line 141
    .line 142
    move-object v3, v11

    .line 143
    :goto_3
    instance-of v12, v3, Landroidx/lifecycle/x;

    .line 144
    .line 145
    if-eqz v12, :cond_6

    .line 146
    .line 147
    check-cast v3, Landroidx/lifecycle/x;

    .line 148
    .line 149
    invoke-interface {v3}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    move-object v12, v3

    .line 154
    goto :goto_5

    .line 155
    :cond_6
    instance-of v12, v3, Landroid/content/ContextWrapper;

    .line 156
    .line 157
    if-nez v12, :cond_7

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_7
    check-cast v3, Landroid/content/ContextWrapper;

    .line 161
    .line 162
    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    goto :goto_3

    .line 167
    :cond_8
    :goto_4
    move-object v12, v9

    .line 168
    :cond_9
    :goto_5
    if-eqz v12, :cond_a

    .line 169
    .line 170
    new-instance v3, LU2/k;

    .line 171
    .line 172
    invoke-direct {v3, v12, v1}, LU2/k;-><init>(Landroidx/lifecycle/q;LM5/b0;)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_a
    new-instance v3, LU2/a;

    .line 177
    .line 178
    invoke-direct {v3, v1}, LU2/a;-><init>(LM5/b0;)V

    .line 179
    .line 180
    .line 181
    :goto_6
    new-instance v1, LU2/d;

    .line 182
    .line 183
    invoke-direct {v1, p1, v11}, LU2/d;-><init>(LU2/g;Landroid/content/Context;)V

    .line 184
    .line 185
    .line 186
    iget-object v6, v6, LB0/o;->q:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v6, LI2/y;

    .line 189
    .line 190
    iget-object v6, v6, LI2/y;->a:LI2/t;

    .line 191
    .line 192
    iget-object v6, v6, LI2/t;->b:LU2/e;

    .line 193
    .line 194
    iput-object v6, v1, LU2/d;->b:LU2/e;

    .line 195
    .line 196
    iget-object v6, v0, LU2/g;->r:LU2/f;

    .line 197
    .line 198
    iget-object v11, v6, LU2/f;->d:LV2/i;

    .line 199
    .line 200
    if-nez v11, :cond_b

    .line 201
    .line 202
    sget-object v12, LV2/i;->a:LV2/e;

    .line 203
    .line 204
    iput-object v12, v1, LU2/d;->h:LV2/i;

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_b
    move-object v12, v11

    .line 208
    :goto_7
    iget-object v13, v6, LU2/f;->e:LV2/g;

    .line 209
    .line 210
    if-nez v13, :cond_c

    .line 211
    .line 212
    iget-object v0, v0, LU2/g;->o:LV2/g;

    .line 213
    .line 214
    iput-object v0, v1, LU2/d;->i:LV2/g;

    .line 215
    .line 216
    :cond_c
    iget-object v0, v6, LU2/f;->f:LV2/d;

    .line 217
    .line 218
    if-nez v0, :cond_e

    .line 219
    .line 220
    if-nez v11, :cond_d

    .line 221
    .line 222
    sget-object v0, LV2/i;->a:LV2/e;

    .line 223
    .line 224
    invoke-static {v12, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_d

    .line 229
    .line 230
    sget-object v0, LV2/d;->r:LV2/d;

    .line 231
    .line 232
    goto :goto_8

    .line 233
    :cond_d
    sget-object v0, LV2/d;->q:LV2/d;

    .line 234
    .line 235
    :goto_8
    iput-object v0, v1, LU2/d;->j:LV2/d;

    .line 236
    .line 237
    :cond_e
    invoke-virtual {v1}, LU2/d;->a()LU2/g;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    sget-object v6, LI2/i;->a:LI2/i;

    .line 242
    .line 243
    :try_start_3
    iget-object v0, v1, LU2/g;->b:Ljava/lang/Object;

    .line 244
    .line 245
    sget-object v11, LU2/l;->a:LU2/l;

    .line 246
    .line 247
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_15

    .line 252
    .line 253
    invoke-interface {v3}, LU2/o;->start()V

    .line 254
    .line 255
    .line 256
    if-nez p2, :cond_10

    .line 257
    .line 258
    iput-object v3, v7, LI2/w;->q:LU2/o;

    .line 259
    .line 260
    iput-object v1, v7, LI2/w;->r:LU2/g;

    .line 261
    .line 262
    iput-object v6, v7, LI2/w;->s:LI2/i;

    .line 263
    .line 264
    iput v5, v7, LI2/w;->w:I

    .line 265
    .line 266
    invoke-interface {v3, v7}, LU2/o;->d(LI2/w;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 270
    if-ne v0, v10, :cond_f

    .line 271
    .line 272
    goto/16 :goto_c

    .line 273
    .line 274
    :cond_f
    move-object v5, v6

    .line 275
    move-object v6, v3

    .line 276
    move-object v3, v5

    .line 277
    move-object v5, v1

    .line 278
    :goto_9
    move-object v1, v5

    .line 279
    move-object v5, v6

    .line 280
    goto :goto_a

    .line 281
    :catchall_2
    move-exception v0

    .line 282
    move-object v4, v1

    .line 283
    move-object v5, v3

    .line 284
    move-object v3, v6

    .line 285
    goto/16 :goto_11

    .line 286
    .line 287
    :cond_10
    move-object v5, v3

    .line 288
    move-object v3, v6

    .line 289
    :goto_a
    :try_start_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    iget-object v0, v1, LU2/g;->n:LV2/i;

    .line 296
    .line 297
    iput-object v5, v7, LI2/w;->q:LU2/o;

    .line 298
    .line 299
    iput-object v1, v7, LI2/w;->r:LU2/g;

    .line 300
    .line 301
    iput-object v3, v7, LI2/w;->s:LI2/i;

    .line 302
    .line 303
    iput-object v9, v7, LI2/w;->t:LI2/n;

    .line 304
    .line 305
    iput v4, v7, LI2/w;->w:I

    .line 306
    .line 307
    invoke-interface {v0, v7}, LV2/i;->a(LI2/w;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 311
    if-ne v0, v10, :cond_11

    .line 312
    .line 313
    goto :goto_c

    .line 314
    :cond_11
    move-object v4, v3

    .line 315
    move-object v11, v5

    .line 316
    move-object v5, v9

    .line 317
    move-object v3, v1

    .line 318
    move-object v1, v0

    .line 319
    :goto_b
    :try_start_5
    check-cast v1, LV2/h;

    .line 320
    .line 321
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    iget-object v12, v3, LU2/g;->e:Lq5/h;

    .line 325
    .line 326
    new-instance v0, LI2/x;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 327
    .line 328
    const/4 v6, 0x0

    .line 329
    move-object v2, v3

    .line 330
    move-object v3, v1

    .line 331
    move-object v1, v2

    .line 332
    move-object v2, p0

    .line 333
    :try_start_6
    invoke-direct/range {v0 .. v6}, LI2/x;-><init>(LU2/g;LI2/y;LV2/h;LI2/i;LI2/n;Lq5/c;)V

    .line 334
    .line 335
    .line 336
    iput-object v11, v7, LI2/w;->q:LU2/o;

    .line 337
    .line 338
    iput-object v1, v7, LI2/w;->r:LU2/g;

    .line 339
    .line 340
    iput-object v4, v7, LI2/w;->s:LI2/i;

    .line 341
    .line 342
    iput-object v9, v7, LI2/w;->t:LI2/n;

    .line 343
    .line 344
    iput v8, v7, LI2/w;->w:I

    .line 345
    .line 346
    invoke-static {v12, v0, v7}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 350
    if-ne v0, v10, :cond_12

    .line 351
    .line 352
    :goto_c
    return-object v10

    .line 353
    :cond_12
    move-object v3, v4

    .line 354
    move-object v5, v11

    .line 355
    move-object v4, v1

    .line 356
    move-object v1, v0

    .line 357
    :goto_d
    :try_start_7
    check-cast v1, LU2/j;

    .line 358
    .line 359
    instance-of v0, v1, LU2/p;

    .line 360
    .line 361
    if-eqz v0, :cond_13

    .line 362
    .line 363
    move-object v0, v1

    .line 364
    check-cast v0, LU2/p;

    .line 365
    .line 366
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-object v0, v0, LU2/p;->b:LU2/g;

    .line 370
    .line 371
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    goto :goto_e

    .line 378
    :cond_13
    instance-of v0, v1, LU2/c;

    .line 379
    .line 380
    if-eqz v0, :cond_14

    .line 381
    .line 382
    move-object v0, v1

    .line 383
    check-cast v0, LU2/c;

    .line 384
    .line 385
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v0, v0, LU2/c;->b:LU2/g;

    .line 389
    .line 390
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 394
    .line 395
    .line 396
    :goto_e
    invoke-interface {v5}, LU2/o;->a()V

    .line 397
    .line 398
    .line 399
    return-object v1

    .line 400
    :cond_14
    :try_start_8
    new-instance v0, LC2/e;

    .line 401
    .line 402
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 403
    .line 404
    .line 405
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 406
    :catchall_3
    move-exception v0

    .line 407
    :goto_f
    move-object v3, v4

    .line 408
    move-object v5, v11

    .line 409
    :goto_10
    move-object v4, v1

    .line 410
    goto :goto_11

    .line 411
    :catchall_4
    move-exception v0

    .line 412
    move-object v1, v3

    .line 413
    goto :goto_f

    .line 414
    :catchall_5
    move-exception v0

    .line 415
    goto :goto_10

    .line 416
    :cond_15
    :try_start_9
    new-instance v0, LU2/m;

    .line 417
    .line 418
    const-string v2, "The request\'s data is null."

    .line 419
    .line 420
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 424
    :goto_11
    :try_start_a
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 425
    .line 426
    if-nez v1, :cond_16

    .line 427
    .line 428
    invoke-static {v4, v0}, LQ2/g;->b(LU2/g;Ljava/lang/Throwable;)LU2/c;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    iget-object v1, v0, LU2/c;->b:LU2/g;

    .line 433
    .line 434
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 438
    .line 439
    .line 440
    invoke-interface {v5}, LU2/o;->a()V

    .line 441
    .line 442
    .line 443
    return-object v0

    .line 444
    :catchall_6
    move-exception v0

    .line 445
    goto :goto_12

    .line 446
    :cond_16
    :try_start_b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 453
    :goto_12
    invoke-interface {v5}, LU2/o;->a()V

    .line 454
    .line 455
    .line 456
    throw v0
.end method
