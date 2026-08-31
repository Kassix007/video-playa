.class public final synthetic LN5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN5/d;->q:I

    iput-object p2, p0, LN5/d;->r:Ljava/lang/Object;

    iput-object p3, p0, LN5/d;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, LN5/d;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    sget-object v5, Lm5/y;->a:Lm5/y;

    .line 8
    .line 9
    iget-object v6, p0, LN5/d;->s:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v7, p0, LN5/d;->r:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v7, Lcom/web2native/MainActivity;

    .line 17
    .line 18
    check-cast v6, LR4/O1;

    .line 19
    .line 20
    check-cast p1, Landroid/content/res/Configuration;

    .line 21
    .line 22
    iget-object p1, v6, LR4/O1;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v7, p1, p1, v4}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    return-object v5

    .line 31
    :pswitch_0
    check-cast v7, LR4/O1;

    .line 32
    .line 33
    check-cast v6, LR4/k1;

    .line 34
    .line 35
    check-cast p1, Landroid/content/res/Configuration;

    .line 36
    .line 37
    iget-object p1, v7, LR4/O1;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v6, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    invoke-static {p1, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 47
    .line 48
    .line 49
    return-object v5

    .line 50
    :pswitch_1
    check-cast v7, LM5/w;

    .line 51
    .line 52
    check-cast v6, LF/e;

    .line 53
    .line 54
    check-cast p1, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    new-instance v0, Lf5/j;

    .line 61
    .line 62
    invoke-direct {v0, v6, p1, v3}, Lf5/j;-><init>(LF/e;ILq5/c;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x3

    .line 66
    invoke-static {v7, v3, v3, v0, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 67
    .line 68
    .line 69
    return-object v5

    .line 70
    :pswitch_2
    check-cast v7, Lcom/web2native/MainActivity;

    .line 71
    .line 72
    check-cast v6, Ljava/lang/String;

    .line 73
    .line 74
    check-cast p1, Landroid/content/res/Configuration;

    .line 75
    .line 76
    invoke-static {v7, v6, v6, v4}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    return-object v5

    .line 80
    :pswitch_3
    check-cast v7, La5/c;

    .line 81
    .line 82
    check-cast v6, LB5/c;

    .line 83
    .line 84
    check-cast p1, Li0/b;

    .line 85
    .line 86
    iget-object p1, v7, La5/c;->c:Ljava/lang/String;

    .line 87
    .line 88
    if-eqz p1, :cond_0

    .line 89
    .line 90
    invoke-interface {v6, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_0
    return-object v5

    .line 94
    :pswitch_4
    check-cast v7, Landroidx/lifecycle/x;

    .line 95
    .line 96
    check-cast v6, LP/c0;

    .line 97
    .line 98
    check-cast p1, LP/F;

    .line 99
    .line 100
    const-string v0, "$this$DisposableEffect"

    .line 101
    .line 102
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, LW1/f;

    .line 106
    .line 107
    invoke-direct {p1, v4, v6}, LW1/f;-><init>(ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v7}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0, p1}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 115
    .line 116
    .line 117
    new-instance v0, LA/X;

    .line 118
    .line 119
    const/4 v1, 0x7

    .line 120
    invoke-direct {v0, v1, v7, p1}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_5
    check-cast v7, LR4/x;

    .line 125
    .line 126
    check-cast v6, LR4/k1;

    .line 127
    .line 128
    check-cast p1, Ljava/lang/String;

    .line 129
    .line 130
    iget-object p1, v7, LR4/x;->g:Ljava/lang/String;

    .line 131
    .line 132
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz p1, :cond_1

    .line 143
    .line 144
    const-string v0, ""

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-nez v0, :cond_1

    .line 151
    .line 152
    iget-object v0, v6, LR4/k1;->e:LT1/u;

    .line 153
    .line 154
    if-eqz v0, :cond_1

    .line 155
    .line 156
    const-string v1, "downloadScreen/"

    .line 157
    .line 158
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-static {v0, p1}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_1
    return-object v5

    .line 166
    :pswitch_6
    check-cast v7, LR4/k1;

    .line 167
    .line 168
    check-cast v6, LP/S0;

    .line 169
    .line 170
    check-cast p1, Landroid/content/Context;

    .line 171
    .line 172
    const-string v0, "context"

    .line 173
    .line 174
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    iget-object v0, v7, LR4/k1;->v:Landroid/widget/RelativeLayout;

    .line 178
    .line 179
    if-nez v0, :cond_2

    .line 180
    .line 181
    new-instance v0, Landroid/widget/RelativeLayout;

    .line 182
    .line 183
    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 184
    .line 185
    .line 186
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 191
    .line 192
    .line 193
    const/16 v1, 0x11

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 196
    .line 197
    .line 198
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 199
    .line 200
    const/4 v3, -0x2

    .line 201
    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 205
    .line 206
    .line 207
    new-instance v1, LU4/D;

    .line 208
    .line 209
    invoke-direct {v1, p1, v7, v6}, LU4/D;-><init>(Landroid/content/Context;LR4/k1;LP/S0;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 213
    .line 214
    .line 215
    iput-object v0, v7, LR4/k1;->v:Landroid/widget/RelativeLayout;

    .line 216
    .line 217
    :cond_2
    iget-object p1, v7, LR4/k1;->v:Landroid/widget/RelativeLayout;

    .line 218
    .line 219
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    return-object p1

    .line 223
    :pswitch_7
    check-cast v7, LT1/u;

    .line 224
    .line 225
    check-cast v6, Landroidx/lifecycle/x;

    .line 226
    .line 227
    check-cast p1, LP/F;

    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    const-string p1, "owner"

    .line 233
    .line 234
    invoke-static {v6, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-object p1, v7, LT1/u;->b:LW1/j;

    .line 238
    .line 239
    iget-object v0, p1, LW1/j;->r:LW1/f;

    .line 240
    .line 241
    iget-object v1, p1, LW1/j;->n:Landroidx/lifecycle/x;

    .line 242
    .line 243
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_3

    .line 248
    .line 249
    goto :goto_0

    .line 250
    :cond_3
    iget-object v1, p1, LW1/j;->n:Landroidx/lifecycle/x;

    .line 251
    .line 252
    if-eqz v1, :cond_4

    .line 253
    .line 254
    invoke-interface {v1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    if-eqz v1, :cond_4

    .line 259
    .line 260
    invoke-virtual {v1, v0}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 261
    .line 262
    .line 263
    :cond_4
    iput-object v6, p1, LW1/j;->n:Landroidx/lifecycle/x;

    .line 264
    .line 265
    invoke-interface {v6}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-virtual {p1, v0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 270
    .line 271
    .line 272
    :goto_0
    new-instance p1, LU1/D;

    .line 273
    .line 274
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 275
    .line 276
    .line 277
    return-object p1

    .line 278
    :pswitch_8
    check-cast v7, LP/S0;

    .line 279
    .line 280
    check-cast v6, LU1/i;

    .line 281
    .line 282
    check-cast p1, LP/F;

    .line 283
    .line 284
    new-instance p1, LA/X;

    .line 285
    .line 286
    const/4 v0, 0x5

    .line 287
    invoke-direct {p1, v0, v7, v6}, LA/X;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    return-object p1

    .line 291
    :pswitch_9
    check-cast v7, LT1/p;

    .line 292
    .line 293
    check-cast v6, LT1/u;

    .line 294
    .line 295
    iget-object v0, v6, LT1/u;->b:LW1/j;

    .line 296
    .line 297
    check-cast p1, LT1/x;

    .line 298
    .line 299
    const-string v2, "$this$navOptions"

    .line 300
    .line 301
    invoke-static {p1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    iget-object v2, p1, LT1/x;->a:LM/t;

    .line 305
    .line 306
    iput v1, v2, LM/t;->a:I

    .line 307
    .line 308
    iput v1, v2, LM/t;->b:I

    .line 309
    .line 310
    instance-of v1, v7, LT1/r;

    .line 311
    .line 312
    if-eqz v1, :cond_a

    .line 313
    .line 314
    sget v1, LT1/p;->u:I

    .line 315
    .line 316
    invoke-static {v7}, Ln5/A;->u(LT1/p;)LI5/i;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-interface {v1}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-eqz v2, :cond_7

    .line 329
    .line 330
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    check-cast v2, LT1/p;

    .line 335
    .line 336
    invoke-virtual {v0}, LW1/j;->f()LT1/p;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    if-eqz v6, :cond_6

    .line 341
    .line 342
    iget-object v6, v6, LT1/p;->s:LT1/r;

    .line 343
    .line 344
    goto :goto_1

    .line 345
    :cond_6
    move-object v6, v3

    .line 346
    :goto_1
    invoke-static {v2, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    if-eqz v2, :cond_5

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_7
    sget v1, LT1/r;->w:I

    .line 354
    .line 355
    invoke-virtual {v0}, LW1/j;->g()LT1/r;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    new-instance v1, LI5/m;

    .line 360
    .line 361
    const/16 v2, 0xf

    .line 362
    .line 363
    invoke-direct {v1, v2}, LI5/m;-><init>(I)V

    .line 364
    .line 365
    .line 366
    invoke-static {v0, v1}, LI5/k;->R(Ljava/lang/Object;LB5/c;)LI5/i;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-interface {v0}, LI5/i;->iterator()Ljava/util/Iterator;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_9

    .line 379
    .line 380
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-eqz v2, :cond_8

    .line 389
    .line 390
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    goto :goto_2

    .line 395
    :cond_8
    check-cast v1, LT1/p;

    .line 396
    .line 397
    iget-object v0, v1, LT1/p;->r:LW1/l;

    .line 398
    .line 399
    iget v0, v0, LW1/l;->a:I

    .line 400
    .line 401
    iput v0, p1, LT1/x;->c:I

    .line 402
    .line 403
    iput-boolean v4, p1, LT1/x;->d:Z

    .line 404
    .line 405
    goto :goto_3

    .line 406
    :cond_9
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 407
    .line 408
    const-string v0, "Sequence is empty."

    .line 409
    .line 410
    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    throw p1

    .line 414
    :cond_a
    :goto_3
    return-object v5

    .line 415
    :pswitch_a
    check-cast v7, LR4/s0;

    .line 416
    .line 417
    iget-object v0, v7, LR4/s0;->b:LR4/k1;

    .line 418
    .line 419
    check-cast v6, Lw1/o0;

    .line 420
    .line 421
    iget-object v1, v6, Lw1/o0;->a:Lw1/l0;

    .line 422
    .line 423
    check-cast p1, Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eqz v2, :cond_b

    .line 430
    .line 431
    iget-object p1, v0, LR4/k1;->Y:Li1/a;

    .line 432
    .line 433
    if-eqz p1, :cond_e

    .line 434
    .line 435
    invoke-static {}, Lw1/V;->b()I

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    iget-object p1, p1, Li1/a;->r:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast p1, LC3/a;

    .line 442
    .line 443
    invoke-virtual {p1, v0}, LC3/a;->S(I)V

    .line 444
    .line 445
    .line 446
    goto :goto_4

    .line 447
    :cond_b
    invoke-static {}, Lw1/V;->m()I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    invoke-virtual {v1, v2}, Lw1/l0;->q(I)Z

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    if-eq v2, v4, :cond_c

    .line 456
    .line 457
    invoke-static {}, Lw1/V;->b()I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    invoke-virtual {v1, v2}, Lw1/l0;->q(I)Z

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    if-ne v1, v4, :cond_e

    .line 466
    .line 467
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    if-nez p1, :cond_e

    .line 472
    .line 473
    :cond_c
    iget-object p1, v0, LR4/k1;->Y:Li1/a;

    .line 474
    .line 475
    if-eqz p1, :cond_d

    .line 476
    .line 477
    invoke-static {}, Lw1/V;->m()I

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    iget-object p1, p1, Li1/a;->r:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast p1, LC3/a;

    .line 484
    .line 485
    invoke-virtual {p1, v1}, LC3/a;->D(I)V

    .line 486
    .line 487
    .line 488
    :cond_d
    iget-object p1, v0, LR4/k1;->Y:Li1/a;

    .line 489
    .line 490
    if-eqz p1, :cond_e

    .line 491
    .line 492
    invoke-static {}, Lw1/V;->b()I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    iget-object p1, p1, Li1/a;->r:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast p1, LC3/a;

    .line 499
    .line 500
    invoke-virtual {p1, v0}, LC3/a;->D(I)V

    .line 501
    .line 502
    .line 503
    :cond_e
    :goto_4
    return-object v5

    .line 504
    :pswitch_b
    check-cast v7, LR4/k1;

    .line 505
    .line 506
    check-cast v6, LP/c0;

    .line 507
    .line 508
    check-cast p1, Ljava/lang/Integer;

    .line 509
    .line 510
    if-nez p1, :cond_f

    .line 511
    .line 512
    goto/16 :goto_a

    .line 513
    .line 514
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 515
    .line 516
    .line 517
    move-result p1

    .line 518
    const/16 v0, 0x64

    .line 519
    .line 520
    if-ne p1, v0, :cond_17

    .line 521
    .line 522
    iget-object p1, v7, LR4/k1;->k:Landroid/webkit/WebView;

    .line 523
    .line 524
    if-eqz p1, :cond_10

    .line 525
    .line 526
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    goto :goto_5

    .line 531
    :cond_10
    move-object p1, v3

    .line 532
    :goto_5
    iget-object v0, v7, LR4/k1;->d:LR4/i;

    .line 533
    .line 534
    if-eqz v0, :cond_11

    .line 535
    .line 536
    iget-object v0, v0, LR4/i;->i:Ljava/util/List;

    .line 537
    .line 538
    goto :goto_6

    .line 539
    :cond_11
    move-object v0, v3

    .line 540
    :goto_6
    new-instance v4, Ljava/util/ArrayList;

    .line 541
    .line 542
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 543
    .line 544
    .line 545
    if-eqz v0, :cond_12

    .line 546
    .line 547
    check-cast v0, Ljava/lang/Iterable;

    .line 548
    .line 549
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 554
    .line 555
    .line 556
    move-result v7

    .line 557
    if-eqz v7, :cond_12

    .line 558
    .line 559
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v7

    .line 563
    check-cast v7, LR4/A;

    .line 564
    .line 565
    iget-object v7, v7, LR4/A;->f:Ljava/lang/String;

    .line 566
    .line 567
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v7

    .line 571
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    goto :goto_7

    .line 575
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    move v7, v1

    .line 580
    move v8, v7

    .line 581
    :goto_8
    if-ge v8, v0, :cond_16

    .line 582
    .line 583
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v9

    .line 587
    add-int/lit8 v8, v8, 0x1

    .line 588
    .line 589
    add-int/lit8 v10, v7, 0x1

    .line 590
    .line 591
    if-ltz v7, :cond_15

    .line 592
    .line 593
    check-cast v9, Ljava/lang/String;

    .line 594
    .line 595
    const-string v11, "pattern"

    .line 596
    .line 597
    invoke-static {v9, v11}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    const/16 v11, 0x42

    .line 601
    .line 602
    invoke-static {v9, v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 603
    .line 604
    .line 605
    move-result-object v9

    .line 606
    const-string v11, "compile(...)"

    .line 607
    .line 608
    invoke-static {v9, v11}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v11

    .line 615
    invoke-virtual {v9, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 616
    .line 617
    .line 618
    move-result-object v11

    .line 619
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    .line 620
    .line 621
    .line 622
    move-result v11

    .line 623
    if-eqz v11, :cond_13

    .line 624
    .line 625
    goto :goto_9

    .line 626
    :cond_13
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v11

    .line 630
    const-string v12, "get(...)"

    .line 631
    .line 632
    invoke-static {v11, v12}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    check-cast v11, Ljava/lang/String;

    .line 636
    .line 637
    const-string v13, "$))"

    .line 638
    .line 639
    invoke-static {v11, v13, v1}, LJ5/t;->A0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 640
    .line 641
    .line 642
    move-result v11

    .line 643
    if-nez v11, :cond_14

    .line 644
    .line 645
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v11

    .line 649
    invoke-static {v11, v12}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    check-cast v11, Ljava/lang/String;

    .line 653
    .line 654
    const-string v12, "$)"

    .line 655
    .line 656
    invoke-static {v11, v12, v1}, LJ5/t;->A0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 657
    .line 658
    .line 659
    move-result v11

    .line 660
    if-nez v11, :cond_14

    .line 661
    .line 662
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v11

    .line 666
    invoke-virtual {v9, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 667
    .line 668
    .line 669
    move-result-object v9

    .line 670
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    .line 671
    .line 672
    .line 673
    move-result v9

    .line 674
    if-eqz v9, :cond_14

    .line 675
    .line 676
    :goto_9
    move v2, v7

    .line 677
    :cond_14
    move v7, v10

    .line 678
    goto :goto_8

    .line 679
    :cond_15
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n2;->N()V

    .line 680
    .line 681
    .line 682
    throw v3

    .line 683
    :cond_16
    invoke-virtual {v6, v2}, LP/c0;->f(I)V

    .line 684
    .line 685
    .line 686
    :cond_17
    :goto_a
    return-object v5

    .line 687
    :pswitch_c
    check-cast v7, LN5/f;

    .line 688
    .line 689
    check-cast v6, LN5/c;

    .line 690
    .line 691
    check-cast p1, Ljava/lang/Throwable;

    .line 692
    .line 693
    iget-object p1, v7, LN5/f;->q:Landroid/os/Handler;

    .line 694
    .line 695
    invoke-virtual {p1, v6}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 696
    .line 697
    .line 698
    return-object v5

    .line 699
    :pswitch_data_0
    .packed-switch 0x0
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
