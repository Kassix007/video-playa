.class public final synthetic LM5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    const/16 p1, 0xc

    iput p1, p0, LM5/q;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput p1, p0, LM5/q;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LM5/q;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lq5/h;

    .line 7
    .line 8
    check-cast p2, Lq5/f;

    .line 9
    .line 10
    const-string v0, "acc"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "element"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Lq5/f;->getKey()Lq5/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lq5/h;->minusKey(Lq5/g;)Lq5/h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v0, Lq5/i;->q:Lq5/i;

    .line 29
    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    sget-object v1, Lq5/d;->q:Lq5/d;

    .line 34
    .line 35
    invoke-interface {p1, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lq5/e;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    new-instance v0, Lq5/b;

    .line 44
    .line 45
    invoke-direct {v0, p2, p1}, Lq5/b;-><init>(Lq5/f;Lq5/h;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    move-object p2, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-interface {p1, v1}, Lq5/h;->minusKey(Lq5/g;)Lq5/h;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    new-instance p1, Lq5/b;

    .line 57
    .line 58
    invoke-direct {p1, v2, p2}, Lq5/b;-><init>(Lq5/f;Lq5/h;)V

    .line 59
    .line 60
    .line 61
    move-object p2, p1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v0, Lq5/b;

    .line 64
    .line 65
    new-instance v1, Lq5/b;

    .line 66
    .line 67
    invoke-direct {v1, p2, p1}, Lq5/b;-><init>(Lq5/f;Lq5/h;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v2, v1}, Lq5/b;-><init>(Lq5/f;Lq5/h;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    return-object p2

    .line 75
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    check-cast p2, Lq5/f;

    .line 78
    .line 79
    const-string v0, "acc"

    .line 80
    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v0, "element"

    .line 85
    .line 86
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p1, ", "

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_2
    return-object p1

    .line 121
    :pswitch_1
    check-cast p1, LP/o;

    .line 122
    .line 123
    check-cast p2, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    const/4 p2, 0x1

    .line 129
    invoke-static {p2}, LP/b;->w(I)I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    invoke-static {p2, p1}, LQ2/g;->i(ILP/o;)V

    .line 134
    .line 135
    .line 136
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 137
    .line 138
    return-object p1

    .line 139
    :pswitch_2
    move-object v7, p1

    .line 140
    check-cast v7, LP/o;

    .line 141
    .line 142
    check-cast p2, Ljava/lang/Integer;

    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    and-int/lit8 p2, p1, 0x3

    .line 149
    .line 150
    const/4 v0, 0x2

    .line 151
    const/4 v1, 0x1

    .line 152
    if-eq p2, v0, :cond_4

    .line 153
    .line 154
    move p2, v1

    .line 155
    goto :goto_3

    .line 156
    :cond_4
    const/4 p2, 0x0

    .line 157
    :goto_3
    and-int/2addr p1, v1

    .line 158
    invoke-virtual {v7, p1, p2}, LP/o;->K(IZ)Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    const p1, 0x7f0700a5

    .line 165
    .line 166
    .line 167
    const/4 p2, 0x6

    .line 168
    invoke-static {p1, v7, p2}, Lcom/google/android/gms/internal/measurement/n2;->F(ILP/o;I)Lo0/b;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const/16 p1, 0x3c

    .line 173
    .line 174
    int-to-float p1, p1

    .line 175
    sget-object p2, Lc0/j;->q:Lc0/j;

    .line 176
    .line 177
    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/c;->c(Lc0/m;F)Lc0/m;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const/4 p2, 0x5

    .line 182
    int-to-float p2, p2

    .line 183
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/b;->a(Lc0/m;F)Lc0/m;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/16 v8, 0x61b0

    .line 188
    .line 189
    const/16 v9, 0x68

    .line 190
    .line 191
    const-string v1, "Files Button"

    .line 192
    .line 193
    const/4 v3, 0x0

    .line 194
    sget-object v4, Lz0/i;->d:Lz0/F;

    .line 195
    .line 196
    const/4 v5, 0x0

    .line 197
    const/4 v6, 0x0

    .line 198
    invoke-static/range {v0 .. v9}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_5
    invoke-virtual {v7}, LP/o;->N()V

    .line 203
    .line 204
    .line 205
    :goto_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 206
    .line 207
    return-object p1

    .line 208
    :pswitch_3
    move-object v7, p1

    .line 209
    check-cast v7, LP/o;

    .line 210
    .line 211
    check-cast p2, Ljava/lang/Integer;

    .line 212
    .line 213
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    and-int/lit8 p2, p1, 0x3

    .line 218
    .line 219
    const/4 v0, 0x2

    .line 220
    const/4 v1, 0x1

    .line 221
    if-eq p2, v0, :cond_6

    .line 222
    .line 223
    move p2, v1

    .line 224
    goto :goto_5

    .line 225
    :cond_6
    const/4 p2, 0x0

    .line 226
    :goto_5
    and-int/2addr p1, v1

    .line 227
    invoke-virtual {v7, p1, p2}, LP/o;->K(IZ)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_7

    .line 232
    .line 233
    const p1, 0x7f07007d

    .line 234
    .line 235
    .line 236
    const/4 p2, 0x6

    .line 237
    invoke-static {p1, v7, p2}, Lcom/google/android/gms/internal/measurement/n2;->F(ILP/o;I)Lo0/b;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    sget-object p1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 242
    .line 243
    const/4 p2, 0x5

    .line 244
    int-to-float p2, p2

    .line 245
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/b;->a(Lc0/m;F)Lc0/m;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    const/16 v8, 0x61b0

    .line 250
    .line 251
    const/16 v9, 0x68

    .line 252
    .line 253
    const-string v1, "Video Cam Button"

    .line 254
    .line 255
    const/4 v3, 0x0

    .line 256
    sget-object v4, Lz0/i;->d:Lz0/F;

    .line 257
    .line 258
    const/4 v5, 0x0

    .line 259
    const/4 v6, 0x0

    .line 260
    invoke-static/range {v0 .. v9}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    .line 261
    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_7
    invoke-virtual {v7}, LP/o;->N()V

    .line 265
    .line 266
    .line 267
    :goto_6
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 268
    .line 269
    return-object p1

    .line 270
    :pswitch_4
    move-object v7, p1

    .line 271
    check-cast v7, LP/o;

    .line 272
    .line 273
    check-cast p2, Ljava/lang/Integer;

    .line 274
    .line 275
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    and-int/lit8 p2, p1, 0x3

    .line 280
    .line 281
    const/4 v0, 0x2

    .line 282
    const/4 v1, 0x1

    .line 283
    if-eq p2, v0, :cond_8

    .line 284
    .line 285
    move p2, v1

    .line 286
    goto :goto_7

    .line 287
    :cond_8
    const/4 p2, 0x0

    .line 288
    :goto_7
    and-int/2addr p1, v1

    .line 289
    invoke-virtual {v7, p1, p2}, LP/o;->K(IZ)Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_9

    .line 294
    .line 295
    const p1, 0x7f07007e

    .line 296
    .line 297
    .line 298
    const/4 p2, 0x6

    .line 299
    invoke-static {p1, v7, p2}, Lcom/google/android/gms/internal/measurement/n2;->F(ILP/o;I)Lo0/b;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    sget-object p1, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 304
    .line 305
    const/4 p2, 0x5

    .line 306
    int-to-float p2, p2

    .line 307
    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/b;->a(Lc0/m;F)Lc0/m;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    const/16 v8, 0x61b0

    .line 312
    .line 313
    const/16 v9, 0x68

    .line 314
    .line 315
    const-string v1, "Video Cam Button"

    .line 316
    .line 317
    const/4 v3, 0x0

    .line 318
    sget-object v4, Lz0/i;->d:Lz0/F;

    .line 319
    .line 320
    const/4 v5, 0x0

    .line 321
    const/4 v6, 0x0

    .line 322
    invoke-static/range {v0 .. v9}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    .line 323
    .line 324
    .line 325
    goto :goto_8

    .line 326
    :cond_9
    invoke-virtual {v7}, LP/o;->N()V

    .line 327
    .line 328
    .line 329
    :goto_8
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 330
    .line 331
    return-object p1

    .line 332
    :pswitch_5
    move-object v7, p1

    .line 333
    check-cast v7, LP/o;

    .line 334
    .line 335
    check-cast p2, Ljava/lang/Integer;

    .line 336
    .line 337
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 338
    .line 339
    .line 340
    move-result p1

    .line 341
    and-int/lit8 p2, p1, 0x3

    .line 342
    .line 343
    const/4 v0, 0x2

    .line 344
    const/4 v1, 0x1

    .line 345
    if-eq p2, v0, :cond_a

    .line 346
    .line 347
    move p2, v1

    .line 348
    goto :goto_9

    .line 349
    :cond_a
    const/4 p2, 0x0

    .line 350
    :goto_9
    and-int/2addr p1, v1

    .line 351
    invoke-virtual {v7, p1, p2}, LP/o;->K(IZ)Z

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    if-eqz p1, :cond_b

    .line 356
    .line 357
    const p1, 0x7f070087

    .line 358
    .line 359
    .line 360
    const/4 p2, 0x6

    .line 361
    invoke-static {p1, v7, p2}, Lcom/google/android/gms/internal/measurement/n2;->F(ILP/o;I)Lo0/b;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    sget-object v2, Landroidx/compose/foundation/layout/c;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 366
    .line 367
    const/16 v8, 0x61b0

    .line 368
    .line 369
    const/16 v9, 0x68

    .line 370
    .line 371
    const-string v1, "Camera Button"

    .line 372
    .line 373
    const/4 v3, 0x0

    .line 374
    sget-object v4, Lz0/i;->d:Lz0/F;

    .line 375
    .line 376
    const/4 v5, 0x0

    .line 377
    const/4 v6, 0x0

    .line 378
    invoke-static/range {v0 .. v9}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    .line 379
    .line 380
    .line 381
    goto :goto_a

    .line 382
    :cond_b
    invoke-virtual {v7}, LP/o;->N()V

    .line 383
    .line 384
    .line 385
    :goto_a
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 386
    .line 387
    return-object p1

    .line 388
    :pswitch_6
    check-cast p1, LZ/b;

    .line 389
    .line 390
    check-cast p2, LT1/u;

    .line 391
    .line 392
    invoke-virtual {p2}, LT1/u;->e()Landroid/os/Bundle;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    return-object p1

    .line 397
    :pswitch_7
    check-cast p1, LR5/w;

    .line 398
    .line 399
    check-cast p2, Lq5/f;

    .line 400
    .line 401
    return-object p1

    .line 402
    :pswitch_8
    check-cast p1, LM5/r0;

    .line 403
    .line 404
    check-cast p2, Lq5/f;

    .line 405
    .line 406
    if-eqz p1, :cond_c

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_c
    instance-of p1, p2, LM5/r0;

    .line 410
    .line 411
    if-eqz p1, :cond_d

    .line 412
    .line 413
    move-object p1, p2

    .line 414
    check-cast p1, LM5/r0;

    .line 415
    .line 416
    goto :goto_b

    .line 417
    :cond_d
    const/4 p1, 0x0

    .line 418
    :goto_b
    return-object p1

    .line 419
    :pswitch_9
    check-cast p2, Lq5/f;

    .line 420
    .line 421
    instance-of v0, p2, LM5/r0;

    .line 422
    .line 423
    if-eqz v0, :cond_11

    .line 424
    .line 425
    instance-of v0, p1, Ljava/lang/Integer;

    .line 426
    .line 427
    if-eqz v0, :cond_e

    .line 428
    .line 429
    check-cast p1, Ljava/lang/Integer;

    .line 430
    .line 431
    goto :goto_c

    .line 432
    :cond_e
    const/4 p1, 0x0

    .line 433
    :goto_c
    const/4 v0, 0x1

    .line 434
    if-eqz p1, :cond_f

    .line 435
    .line 436
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 437
    .line 438
    .line 439
    move-result p1

    .line 440
    goto :goto_d

    .line 441
    :cond_f
    move p1, v0

    .line 442
    :goto_d
    if-nez p1, :cond_10

    .line 443
    .line 444
    move-object p1, p2

    .line 445
    goto :goto_e

    .line 446
    :cond_10
    add-int/2addr p1, v0

    .line 447
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    :cond_11
    :goto_e
    return-object p1

    .line 452
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 453
    .line 454
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 455
    .line 456
    .line 457
    move-result p1

    .line 458
    check-cast p2, Lq5/f;

    .line 459
    .line 460
    add-int/lit8 p1, p1, 0x1

    .line 461
    .line 462
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    return-object p1

    .line 467
    :pswitch_b
    check-cast p1, Lq5/h;

    .line 468
    .line 469
    check-cast p2, Lq5/f;

    .line 470
    .line 471
    invoke-interface {p1, p2}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    return-object p1

    .line 476
    :pswitch_c
    check-cast p1, Lq5/h;

    .line 477
    .line 478
    check-cast p2, Lq5/f;

    .line 479
    .line 480
    invoke-interface {p1, p2}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 481
    .line 482
    .line 483
    move-result-object p1

    .line 484
    return-object p1

    .line 485
    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    .line 486
    .line 487
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 488
    .line 489
    .line 490
    check-cast p2, Lq5/f;

    .line 491
    .line 492
    return-object p1

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
